package p190io.objectbox.android;

import androidx.lifecycle.LiveData;
import java.util.List;
import p190io.objectbox.query.Query;
import p190io.objectbox.reactive.DataObserver;
import p190io.objectbox.reactive.DataSubscription;

/* renamed from: io.objectbox.android.ObjectBoxLiveData */
public class ObjectBoxLiveData<T> extends LiveData<List<T>> {
    private final DataObserver<List<T>> listener = new DataObserver<List<T>>() {
        public void onData(List<T> list) {
            ObjectBoxLiveData.this.postValue(list);
        }
    };
    private final Query<T> query;
    private DataSubscription subscription;

    public ObjectBoxLiveData(Query<T> query2) {
        this.query = query2;
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        if (this.subscription == null) {
            this.subscription = this.query.subscribe().observer(this.listener);
        }
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        if (!hasObservers()) {
            this.subscription.cancel();
            this.subscription = null;
        }
    }
}
