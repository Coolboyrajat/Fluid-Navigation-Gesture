package p190io.objectbox.reactive;

import java.util.Set;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.reactive.DataPublisherUtils */
public class DataPublisherUtils {
    public static <T> void removeObserverFromCopyOnWriteSet(Set<DataObserver<T>> set, DataObserver<T> dataObserver) {
        if (set != null) {
            for (DataObserver next : set) {
                if (!next.equals(dataObserver)) {
                    if (next instanceof DelegatingObserver) {
                        DataObserver dataObserver2 = next;
                        while (dataObserver2 instanceof DelegatingObserver) {
                            dataObserver2 = ((DelegatingObserver) dataObserver2).getObserverDelegate();
                        }
                        if (dataObserver2 != null && !dataObserver2.equals(dataObserver)) {
                        }
                    }
                }
                set.remove(next);
            }
        }
    }
}
