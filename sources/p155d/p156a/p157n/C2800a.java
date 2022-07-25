package p155d.p156a.p157n;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p155d.p156a.p157n.p159c.C2803a;
import p155d.p156a.p160o.C2810b;

/* renamed from: d.a.n.a */
public abstract class C2800a implements C2810b {

    /* renamed from: f */
    private final AtomicBoolean f7391f = new AtomicBoolean();

    /* renamed from: d.a.n.a$a */
    class C2801a implements Runnable {
        C2801a() {
        }

        public void run() {
            C2800a.this.mo5872c();
        }
    }

    /* renamed from: a */
    public final void mo6027a() {
        if (!this.f7391f.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo5872c();
        } else {
            C2803a.m11054a().mo8932a(new C2801a());
        }
    }

    /* renamed from: b */
    public final boolean mo6028b() {
        return this.f7391f.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo5872c();
}
