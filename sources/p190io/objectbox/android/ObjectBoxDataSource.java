package p190io.objectbox.android;

import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import java.util.Collections;
import java.util.List;
import p190io.objectbox.query.Query;
import p190io.objectbox.reactive.DataObserver;

/* renamed from: io.objectbox.android.ObjectBoxDataSource */
public class ObjectBoxDataSource<T> extends PositionalDataSource<T> {
    private final DataObserver<List<T>> observer = new DataObserver<List<T>>() {
        public void onData(List<T> list) {
            ObjectBoxDataSource.this.invalidate();
        }
    };
    private final Query<T> query;

    /* renamed from: io.objectbox.android.ObjectBoxDataSource$Factory */
    public static class Factory<Item> extends DataSource.Factory<Integer, Item> {
        private final Query<Item> query;

        public Factory(Query<Item> query2) {
            this.query = query2;
        }

        public DataSource<Integer, Item> create() {
            return new ObjectBoxDataSource(this.query);
        }
    }

    public ObjectBoxDataSource(Query<T> query2) {
        this.query = query2;
        query2.subscribe().onlyChanges().weak().observer(this.observer);
    }

    private List<T> loadRange(int i, int i2) {
        return this.query.find((long) i, (long) i2);
    }

    public void loadInitial(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        int count = (int) this.query.count();
        if (count == 0) {
            loadInitialCallback.onResult(Collections.emptyList(), 0, 0);
            return;
        }
        int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, count);
        int computeInitialLoadSize = computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, count);
        List loadRange = loadRange(computeInitialLoadPosition, computeInitialLoadSize);
        if (loadRange.size() == computeInitialLoadSize) {
            loadInitialCallback.onResult(loadRange, computeInitialLoadPosition, count);
        } else {
            invalidate();
        }
    }

    public void loadRange(PositionalDataSource.LoadRangeParams loadRangeParams, PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }
}
