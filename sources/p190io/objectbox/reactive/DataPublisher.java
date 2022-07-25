package p190io.objectbox.reactive;

import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.reactive.DataPublisher */
public interface DataPublisher<T> {
    void publishSingle(DataObserver<T> dataObserver, Object obj);

    void subscribe(DataObserver<T> dataObserver, Object obj);

    void unsubscribe(DataObserver<T> dataObserver, Object obj);
}
