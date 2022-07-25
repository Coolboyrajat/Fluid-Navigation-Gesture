package p155d.p156a.p163r.p167d;

import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2814a;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p174s.C2959b;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.d.e */
public final class C2862e<T> extends AtomicReference<C2810b> implements C2793k<T>, C2810b, C2959b {

    /* renamed from: f */
    final C2827e<? super T> f7436f;

    /* renamed from: g */
    final C2827e<? super Throwable> f7437g;

    /* renamed from: h */
    final C2823a f7438h;

    /* renamed from: i */
    final C2827e<? super C2810b> f7439i;

    public C2862e(C2827e<? super T> eVar, C2827e<? super Throwable> eVar2, C2823a aVar, C2827e<? super C2810b> eVar3) {
        this.f7436f = eVar;
        this.f7437g = eVar2;
        this.f7438h = aVar;
        this.f7439i = eVar3;
    }

    /* renamed from: a */
    public void mo6027a() {
        C2832b.m11099a((AtomicReference<C2810b>) this);
    }

    /* renamed from: a */
    public void mo6031a(C2810b bVar) {
        if (C2832b.m11103c(this, bVar)) {
            try {
                this.f7439i.accept(this);
            } catch (Throwable th) {
                C2819b.m11088b(th);
                bVar.mo6027a();
                onError(th);
            }
        }
    }

    /* renamed from: a */
    public void mo6032a(T t) {
        if (!mo6028b()) {
            try {
                this.f7436f.accept(t);
            } catch (Throwable th) {
                C2819b.m11088b(th);
                ((C2810b) get()).mo6027a();
                onError(th);
            }
        }
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return get() == C2832b.DISPOSED;
    }

    /* renamed from: c */
    public void mo6033c() {
        if (!mo6028b()) {
            lazySet(C2832b.DISPOSED);
            try {
                this.f7438h.run();
            } catch (Throwable th) {
                C2819b.m11088b(th);
                C2962a.m11431b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!mo6028b()) {
            lazySet(C2832b.DISPOSED);
            try {
                this.f7437g.accept(th);
            } catch (Throwable th2) {
                C2819b.m11088b(th2);
                C2962a.m11431b((Throwable) new C2814a(th, th2));
            }
        } else {
            C2962a.m11431b(th);
        }
    }
}
