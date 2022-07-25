package p054c.p055a.p067b.p070h;

import android.view.View;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.b.h.a */
public final class C1128a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile boolean f3824a = true;

    /* renamed from: b */
    private static final Runnable f3825b = C1129a.f3827f;

    /* renamed from: c */
    public static final C1128a f3826c = new C1128a();

    /* renamed from: c.a.b.h.a$a */
    static final class C1129a implements Runnable {

        /* renamed from: f */
        public static final C1129a f3827f = new C1129a();

        C1129a() {
        }

        public final void run() {
            C1128a.f3824a = true;
        }
    }

    private C1128a() {
    }

    /* renamed from: a */
    public final boolean mo5223a(View view) {
        C3370k.m12227b(view, "view");
        if (!f3824a) {
            return false;
        }
        f3824a = false;
        view.post(f3825b);
        return true;
    }
}
