package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public C3398a createDispatcher(List<? extends MainDispatcherFactory> list) {
        C3370k.m12227b(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        C3370k.m12223a((Object) mainLooper, "Looper.getMainLooper()");
        return new C3398a(C3402c.m12303a(mainLooper, true), "Main");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
