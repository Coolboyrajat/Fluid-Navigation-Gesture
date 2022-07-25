package p155d.p156a.p163r.p167d;

import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p166c.C2853c;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.d.a */
public abstract class C2858a<T, R> implements C2793k<T>, C2853c<R> {

    /* renamed from: f */
    protected final C2793k<? super R> f7425f;

    /* renamed from: g */
    protected C2810b f7426g;

    /* renamed from: h */
    protected C2853c<T> f7427h;

    /* renamed from: i */
    protected boolean f7428i;

    /* renamed from: j */
    protected int f7429j;

    public C2858a(C2793k<? super R> kVar) {
        this.f7425f = kVar;
    }

    /* renamed from: a */
    public void mo6027a() {
        this.f7426g.mo6027a();
    }

    /* renamed from: a */
    public final void mo6031a(C2810b bVar) {
        if (C2832b.m11098a(this.f7426g, bVar)) {
            this.f7426g = bVar;
            if (bVar instanceof C2853c) {
                this.f7427h = (C2853c) bVar;
            }
            if (mo8985f()) {
                this.f7425f.mo6031a((C2810b) this);
                mo8984e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8982a(Throwable th) {
        C2819b.m11088b(th);
        this.f7426g.mo6027a();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo8983b(int i) {
        C2853c<T> cVar = this.f7427h;
        if (cVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = cVar.mo8964a(i);
        if (a != 0) {
            this.f7429j = a;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7426g.mo6028b();
    }

    /* renamed from: b */
    public final boolean mo8965b(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: c */
    public void mo6033c() {
        if (!this.f7428i) {
            this.f7428i = true;
            this.f7425f.mo6033c();
        }
    }

    public void clear() {
        this.f7427h.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo8984e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8985f() {
        return true;
    }

    public boolean isEmpty() {
        return this.f7427h.isEmpty();
    }

    public void onError(Throwable th) {
        if (this.f7428i) {
            C2962a.m11431b(th);
            return;
        }
        this.f7428i = true;
        this.f7425f.onError(th);
    }
}
