package p155d.p156a.p157n.p159c;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p155d.p156a.C2794l;
import p155d.p156a.p157n.p158b.C2802a;

/* renamed from: d.a.n.c.a */
public final class C2803a {

    /* renamed from: a */
    private static final C2794l f7395a = C2802a.m11053b(new C2804a());

    /* renamed from: d.a.n.c.a$a */
    static class C2804a implements Callable<C2794l> {
        C2804a() {
        }

        public C2794l call() {
            return C2805b.f7396a;
        }
    }

    /* renamed from: d.a.n.c.a$b */
    private static final class C2805b {

        /* renamed from: a */
        static final C2794l f7396a = new C2806b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C2794l m11054a() {
        return C2802a.m11049a(f7395a);
    }
}
