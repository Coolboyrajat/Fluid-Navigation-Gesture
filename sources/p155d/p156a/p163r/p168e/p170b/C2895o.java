package p155d.p156a.p163r.p168e.p170b;

import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.C2794l;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p166c.C2853c;
import p155d.p156a.p163r.p166c.C2857g;
import p155d.p156a.p163r.p167d.C2859b;
import p155d.p156a.p163r.p171f.C2917a;
import p155d.p156a.p163r.p172g.C2942o;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.r.e.b.o */
public final class C2895o<T> extends C2867a<T, T> {

    /* renamed from: g */
    final C2794l f7520g;

    /* renamed from: h */
    final boolean f7521h;

    /* renamed from: i */
    final int f7522i;

    /* renamed from: d.a.r.e.b.o$a */
    static final class C2896a<T> extends C2859b<T> implements C2793k<T>, Runnable {

        /* renamed from: f */
        final C2793k<? super T> f7523f;

        /* renamed from: g */
        final C2794l.C2797c f7524g;

        /* renamed from: h */
        final boolean f7525h;

        /* renamed from: i */
        final int f7526i;

        /* renamed from: j */
        C2857g<T> f7527j;

        /* renamed from: k */
        C2810b f7528k;

        /* renamed from: l */
        Throwable f7529l;

        /* renamed from: m */
        volatile boolean f7530m;

        /* renamed from: n */
        volatile boolean f7531n;

        /* renamed from: o */
        int f7532o;

        /* renamed from: p */
        boolean f7533p;

        C2896a(C2793k<? super T> kVar, C2794l.C2797c cVar, boolean z, int i) {
            this.f7523f = kVar;
            this.f7524g = cVar;
            this.f7525h = z;
            this.f7526i = i;
        }

        /* renamed from: a */
        public int mo8964a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f7533p = true;
            return 2;
        }

        /* renamed from: a */
        public void mo6027a() {
            if (!this.f7531n) {
                this.f7531n = true;
                this.f7528k.mo6027a();
                this.f7524g.mo6027a();
                if (getAndIncrement() == 0) {
                    this.f7527j.clear();
                }
            }
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            if (C2832b.m11098a(this.f7528k, bVar)) {
                this.f7528k = bVar;
                if (bVar instanceof C2853c) {
                    C2853c cVar = (C2853c) bVar;
                    int a = cVar.mo8964a(7);
                    if (a == 1) {
                        this.f7532o = a;
                        this.f7527j = cVar;
                        this.f7530m = true;
                        this.f7523f.mo6031a((C2810b) this);
                        mo9006g();
                        return;
                    } else if (a == 2) {
                        this.f7532o = a;
                        this.f7527j = cVar;
                        this.f7523f.mo6031a((C2810b) this);
                        return;
                    }
                }
                this.f7527j = new C2917a(this.f7526i);
                this.f7523f.mo6031a((C2810b) this);
            }
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            if (!this.f7530m) {
                if (this.f7532o != 2) {
                    this.f7527j.mo8965b(t);
                }
                mo9006g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9003a(boolean z, boolean z2, C2793k<? super T> kVar) {
            if (this.f7531n) {
                this.f7527j.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f7529l;
                if (this.f7525h) {
                    if (!z2) {
                        return false;
                    }
                    this.f7531n = true;
                    if (th != null) {
                        kVar.onError(th);
                    } else {
                        kVar.mo6033c();
                    }
                    this.f7524g.mo6027a();
                    return true;
                } else if (th != null) {
                    this.f7531n = true;
                    this.f7527j.clear();
                    kVar.onError(th);
                    this.f7524g.mo6027a();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.f7531n = true;
                    kVar.mo6033c();
                    this.f7524g.mo6027a();
                    return true;
                }
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7531n;
        }

        /* renamed from: c */
        public void mo6033c() {
            if (!this.f7530m) {
                this.f7530m = true;
                mo9006g();
            }
        }

        public void clear() {
            this.f7527j.clear();
        }

        /* renamed from: d */
        public T mo8967d() {
            return this.f7527j.mo8967d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo9004e() {
            int i = 1;
            while (!this.f7531n) {
                boolean z = this.f7530m;
                Throwable th = this.f7529l;
                if (this.f7525h || !z || th == null) {
                    this.f7523f.mo6032a(null);
                    if (z) {
                        this.f7531n = true;
                        Throwable th2 = this.f7529l;
                        if (th2 != null) {
                            this.f7523f.onError(th2);
                        } else {
                            this.f7523f.mo6033c();
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } else {
                    this.f7531n = true;
                    this.f7523f.onError(th);
                }
                this.f7524g.mo6027a();
                return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo9005f() {
            C2857g<T> gVar = this.f7527j;
            C2793k<? super T> kVar = this.f7523f;
            int i = 1;
            while (!mo9003a(this.f7530m, gVar.isEmpty(), kVar)) {
                while (true) {
                    boolean z = this.f7530m;
                    try {
                        T d = gVar.mo8967d();
                        boolean z2 = d == null;
                        if (!mo9003a(z, z2, kVar)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                kVar.mo6032a(d);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C2819b.m11088b(th);
                        this.f7531n = true;
                        this.f7528k.mo6027a();
                        gVar.clear();
                        kVar.onError(th);
                        this.f7524g.mo6027a();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9006g() {
            if (getAndIncrement() == 0) {
                this.f7524g.mo8938a((Runnable) this);
            }
        }

        public boolean isEmpty() {
            return this.f7527j.isEmpty();
        }

        public void onError(Throwable th) {
            if (this.f7530m) {
                C2962a.m11431b(th);
                return;
            }
            this.f7529l = th;
            this.f7530m = true;
            mo9006g();
        }

        public void run() {
            if (this.f7533p) {
                mo9004e();
            } else {
                mo9005f();
            }
        }
    }

    public C2895o(C2792j<T> jVar, C2794l lVar, boolean z, int i) {
        super(jVar);
        this.f7520g = lVar;
        this.f7521h = z;
        this.f7522i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2794l lVar = this.f7520g;
        if (lVar instanceof C2942o) {
            this.f7444f.mo8917a(kVar);
            return;
        }
        this.f7444f.mo8917a(new C2896a(kVar, lVar.mo8931a(), this.f7521h, this.f7522i));
    }
}
