package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3537t1;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C3480n {
    /* renamed from: a */
    public static final C3537t1 m12554a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        C3370k.m12227b(mainDispatcherFactory, "$this$tryCreateDispatcher");
        C3370k.m12227b(list, "factories");
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new C3481o(th, mainDispatcherFactory.hintOnError());
        }
    }
}
