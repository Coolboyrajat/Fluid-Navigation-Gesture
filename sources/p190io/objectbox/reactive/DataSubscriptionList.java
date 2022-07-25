package p190io.objectbox.reactive;

import java.util.ArrayList;
import java.util.List;

/* renamed from: io.objectbox.reactive.DataSubscriptionList */
public class DataSubscriptionList implements DataSubscription {
    private boolean canceled;
    private final List<DataSubscription> subscriptions = new ArrayList();

    public synchronized void add(DataSubscription dataSubscription) {
        this.subscriptions.add(dataSubscription);
        this.canceled = false;
    }

    public synchronized void cancel() {
        this.canceled = true;
        for (DataSubscription cancel : this.subscriptions) {
            cancel.cancel();
        }
        this.subscriptions.clear();
    }

    public synchronized int getActiveSubscriptionCount() {
        return this.subscriptions.size();
    }

    public synchronized boolean isCanceled() {
        return this.canceled;
    }
}
