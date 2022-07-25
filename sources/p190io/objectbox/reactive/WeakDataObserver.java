package p190io.objectbox.reactive;

import java.lang.ref.WeakReference;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.reactive.WeakDataObserver */
public class WeakDataObserver<T> implements DataObserver<T>, DelegatingObserver {
    private DataSubscription subscription;
    private final WeakReference<DataObserver<T>> weakDelegate;

    WeakDataObserver(DataObserver<T> dataObserver) {
        this.weakDelegate = new WeakReference<>(dataObserver);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakDataObserver)) {
            return false;
        }
        DataObserver dataObserver = (DataObserver) this.weakDelegate.get();
        if (dataObserver == null || dataObserver != ((WeakDataObserver) obj).weakDelegate.get()) {
            return super.equals(obj);
        }
        return true;
    }

    public DataObserver<T> getObserverDelegate() {
        return (DataObserver) this.weakDelegate.get();
    }

    public int hashCode() {
        DataObserver dataObserver = (DataObserver) this.weakDelegate.get();
        return dataObserver != null ? dataObserver.hashCode() : super.hashCode();
    }

    public void onData(T t) {
        DataObserver dataObserver = (DataObserver) this.weakDelegate.get();
        if (dataObserver != null) {
            dataObserver.onData(t);
        } else {
            this.subscription.cancel();
        }
    }

    public void setSubscription(DataSubscription dataSubscription) {
        this.subscription = dataSubscription;
    }
}
