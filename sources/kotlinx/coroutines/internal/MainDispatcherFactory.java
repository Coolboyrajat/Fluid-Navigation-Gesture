package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C3537t1;

public interface MainDispatcherFactory {
    C3537t1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
