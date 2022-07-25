package p155d.p156a.p163r.p167d;

import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.d.d */
public final class C2861d<T> implements C2793k<T>, C2810b {

    /* renamed from: f */
    final C2793k<? super T> f7432f;

    /* renamed from: g */
    final C2827e<? super C2810b> f7433g;

    /* renamed from: h */
    final C2823a f7434h;

    /* renamed from: i */
    C2810b f7435i;

    public C2861d(C2793k<? super T> kVar, C2827e<? super C2810b> eVar, C2823a aVar) {
        this.f7432f = kVar;
        this.f7433g = eVar;
        this.f7434h = aVar;
    }

    /* renamed from: a */
    public void mo6027a() {
        C2810b bVar = this.f7435i;
        C2832b bVar2 = C2832b.DISPOSED;
        if (bVar != bVar2) {
            this.f7435i = bVar2;
            try {
                this.f7434h.run();
            } catch (Throwable th) {
                C2819b.m11088b(th);
                C2962a.m11431b(th);
            }
            bVar.mo6027a();
        }
    }

    /* renamed from: a */
    public void mo6031a(C2810b bVar) {
        try {
            this.f7433g.accept(bVar);
            if (C2832b.m11098a(this.f7435i, bVar)) {
                this.f7435i = bVar;
                this.f7432f.mo6031a((C2810b) this);
            }
        } catch (Throwable th) {
            C2819b.m11088b(th);
            bVar.mo6027a();
            this.f7435i = C2832b.DISPOSED;
            C2833c.m11110a(th, (C2793k<?>) this.f7432f);
        }
    }

    /* renamed from: a */
    public void mo6032a(T t) {
        this.f7432f.mo6032a(t);
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7435i.mo6028b();
    }

    /* renamed from: c */
    public void mo6033c() {
        C2810b bVar = this.f7435i;
        C2832b bVar2 = C2832b.DISPOSED;
        if (bVar != bVar2) {
            this.f7435i = bVar2;
            this.f7432f.mo6033c();
        }
    }

    public void onError(Throwable th) {
        C2810b bVar = this.f7435i;
        C2832b bVar2 = C2832b.DISPOSED;
        if (bVar != bVar2) {
            this.f7435i = bVar2;
            this.f7432f.onError(th);
            return;
        }
        C2962a.m11431b(th);
    }
}
