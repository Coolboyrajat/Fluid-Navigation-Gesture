package p190io.objectbox.query;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p190io.objectbox.Box;
import p190io.objectbox.BoxStore;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.reactive.DataObserver;
import p190io.objectbox.reactive.DataPublisher;
import p190io.objectbox.reactive.DataPublisherUtils;
import p190io.objectbox.reactive.DataSubscription;

@Internal
/* renamed from: io.objectbox.query.QueryPublisher */
class QueryPublisher<T> implements DataPublisher<List<T>> {
    private final Box<T> box;
    private DataObserver<Class<T>> objectClassObserver;
    private DataSubscription objectClassSubscription;
    /* access modifiers changed from: private */
    public final Set<DataObserver<List<T>>> observers = new CopyOnWriteArraySet();
    /* access modifiers changed from: private */
    public final Query<T> query;

    QueryPublisher(Query<T> query2, Box<T> box2) {
        this.query = query2;
        this.box = box2;
    }

    /* access modifiers changed from: package-private */
    public void publish() {
        this.box.getStore().internalScheduleThread(new Runnable() {
            public void run() {
                List find = QueryPublisher.this.query.find();
                for (DataObserver onData : QueryPublisher.this.observers) {
                    onData.onData(find);
                }
            }
        });
    }

    public void publishSingle(final DataObserver<List<T>> dataObserver, Object obj) {
        this.box.getStore().internalScheduleThread(new Runnable() {
            public void run() {
                dataObserver.onData(QueryPublisher.this.query.find());
            }
        });
    }

    public synchronized void subscribe(DataObserver<List<T>> dataObserver, Object obj) {
        BoxStore store = this.box.getStore();
        if (this.objectClassObserver == null) {
            this.objectClassObserver = new DataObserver<Class<T>>() {
                public void onData(Class<T> cls) {
                    QueryPublisher.this.publish();
                }
            };
        }
        if (this.observers.isEmpty()) {
            if (this.objectClassSubscription == null) {
                this.objectClassSubscription = store.subscribe(this.box.getEntityClass()).weak().onlyChanges().observer(this.objectClassObserver);
            } else {
                throw new IllegalStateException("Existing subscription found");
            }
        }
        this.observers.add(dataObserver);
    }

    public synchronized void unsubscribe(DataObserver<List<T>> dataObserver, Object obj) {
        DataPublisherUtils.removeObserverFromCopyOnWriteSet(this.observers, dataObserver);
        if (this.observers.isEmpty()) {
            this.objectClassSubscription.cancel();
            this.objectClassSubscription = null;
        }
    }
}
