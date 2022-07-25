package p190io.objectbox.reactive;

/* renamed from: io.objectbox.reactive.DataSubscriptionImpl */
class DataSubscriptionImpl<T> implements DataSubscription {
    private volatile boolean canceled;
    private DataObserver<T> observer;
    private DataPublisher<T> publisher;
    private Object publisherParam;

    DataSubscriptionImpl(DataPublisher<T> dataPublisher, Object obj, DataObserver<T> dataObserver) {
        this.publisher = dataPublisher;
        this.publisherParam = obj;
        this.observer = dataObserver;
    }

    public synchronized void cancel() {
        this.canceled = true;
        if (this.publisher != null) {
            this.publisher.unsubscribe(this.observer, this.publisherParam);
            this.publisher = null;
            this.observer = null;
            this.publisherParam = null;
        }
    }

    public boolean isCanceled() {
        return this.canceled;
    }
}
