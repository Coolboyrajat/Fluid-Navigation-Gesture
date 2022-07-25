package p190io.objectbox.reactive;

import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.reactive.DelegatingObserver */
public interface DelegatingObserver<T> {
    DataObserver<T> getObserverDelegate();
}
