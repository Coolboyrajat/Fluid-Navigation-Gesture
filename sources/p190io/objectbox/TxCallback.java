package p190io.objectbox;

/* renamed from: io.objectbox.TxCallback */
public interface TxCallback<T> {
    void txFinished(T t, Throwable th);
}
