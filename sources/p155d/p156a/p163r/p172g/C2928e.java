package p155d.p156a.p163r.p172g;

import java.util.concurrent.ThreadFactory;
import p155d.p156a.C2794l;

/* renamed from: d.a.r.g.e */
public final class C2928e extends C2794l {

    /* renamed from: c */
    private static final C2931h f7637c = new C2931h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f7638b;

    public C2928e() {
        this(f7637c);
    }

    public C2928e(ThreadFactory threadFactory) {
        this.f7638b = threadFactory;
    }

    /* renamed from: a */
    public C2794l.C2797c mo8931a() {
        return new C2929f(this.f7638b);
    }
}
