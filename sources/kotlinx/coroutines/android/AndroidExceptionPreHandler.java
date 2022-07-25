package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p197u.C3306a;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Keep
public final class AndroidExceptionPreHandler extends C3306a implements CoroutineExceptionHandler, C3349a<Method> {
    static final /* synthetic */ C3208i[] $$delegatedProperties;
    private final C3256e preHandler$delegate = C3258g.m11969a(this);

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        C3384y.m12259a((C3379t) uVar);
        $$delegatedProperties = new C3208i[]{uVar};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f8053c);
    }

    private final Method getPreHandler() {
        C3256e eVar = this.preHandler$delegate;
        C3208i iVar = $$delegatedProperties[0];
        return (Method) eVar.getValue();
    }

    public void handleException(C3314f fVar, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            C3370k.m12223a((Object) currentThread, "thread");
            uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        } else {
            Method preHandler = getPreHandler();
            Object invoke = preHandler != null ? preHandler.invoke((Object) null, new Object[0]) : null;
            if (!(invoke instanceof Thread.UncaughtExceptionHandler)) {
                invoke = null;
            }
            uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) invoke;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(currentThread, th);
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C3370k.m12223a((Object) declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
