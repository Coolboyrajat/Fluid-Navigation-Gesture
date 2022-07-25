package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.android.c */
public final class C3402c {
    static {
        Object obj;
        try {
            C3262k.C3263a aVar = C3262k.f7982f;
            Looper mainLooper = Looper.getMainLooper();
            C3370k.m12223a((Object) mainLooper, "Looper.getMainLooper()");
            obj = new C3398a(m12303a(mainLooper, true), "Main");
            C3262k.m11974a(obj);
        } catch (Throwable th) {
            C3262k.C3263a aVar2 = C3262k.f7982f;
            obj = C3265l.m11978a(th);
            C3262k.m11974a(obj);
        }
        if (C3262k.m11976c(obj)) {
            obj = null;
        }
        C3401b bVar = (C3401b) obj;
    }

    /* renamed from: a */
    public static final Handler m12303a(Looper looper, boolean z) {
        int i;
        C3370k.m12227b(looper, "$this$asHandler");
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new C3269p("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            Constructor<Handler> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
            C3370k.m12223a((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Handler newInstance = declaredConstructor.newInstance(new Object[]{looper, null, true});
            C3370k.m12223a((Object) newInstance, "constructor.newInstance(this, null, true)");
            return newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
