package p155d.p156a.p174s;

import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p173h.C2947a;
import p155d.p156a.p163r.p173h.C2953e;

/* renamed from: d.a.s.c */
public final class C2960c<T> implements C2793k<T>, C2810b {

    /* renamed from: f */
    final C2793k<? super T> f7690f;

    /* renamed from: g */
    final boolean f7691g;

    /* renamed from: h */
    C2810b f7692h;

    /* renamed from: i */
    boolean f7693i;

    /* renamed from: j */
    C2947a<Object> f7694j;

    /* renamed from: k */
    volatile boolean f7695k;

    public C2960c(C2793k<? super T> kVar) {
        this(kVar, false);
    }

    public C2960c(C2793k<? super T> kVar, boolean z) {
        this.f7690f = kVar;
        this.f7691g = z;
    }

    /* renamed from: a */
    public void mo6027a() {
        this.f7692h.mo6027a();
    }

    /* renamed from: a */
    public void mo6031a(C2810b bVar) {
        if (C2832b.m11098a(this.f7692h, bVar)) {
            this.f7692h = bVar;
            this.f7690f.mo6031a((C2810b) this);
        }
    }

    /* renamed from: a */
    public void mo6032a(T t) {
        if (!this.f7695k) {
            if (t == null) {
                this.f7692h.mo6027a();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f7695k) {
                    if (this.f7693i) {
                        C2947a<Object> aVar = this.f7694j;
                        if (aVar == null) {
                            aVar = new C2947a<>(4);
                            this.f7694j = aVar;
                        }
                        C2953e.m11400d(t);
                        aVar.mo9051a(t);
                        return;
                    }
                    this.f7693i = true;
                    this.f7690f.mo6032a(t);
                    mo9068d();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7692h.mo6028b();
    }

    /* renamed from: c */
    public void mo6033c() {
        if (!this.f7695k) {
            synchronized (this) {
                if (!this.f7695k) {
                    if (this.f7693i) {
                        C2947a<Object> aVar = this.f7694j;
                        if (aVar == null) {
                            aVar = new C2947a<>(4);
                            this.f7694j = aVar;
                        }
                        aVar.mo9051a(C2953e.m11393a());
                        return;
                    }
                    this.f7695k = true;
                    this.f7693i = true;
                    this.f7690f.mo6033c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9068d() {
        C2947a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f7694j;
                if (aVar == null) {
                    this.f7693i = false;
                    return;
                }
                this.f7694j = null;
            }
        } while (!aVar.mo9052a((C2793k<? super U>) this.f7690f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p155d.p156a.p176u.C2962a.m11431b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f7690f.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f7695k
            if (r0 == 0) goto L_0x0008
            p155d.p156a.p176u.C2962a.m11431b((java.lang.Throwable) r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f7695k     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f7693i     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f7695k = r1     // Catch:{ all -> 0x0044 }
            d.a.r.h.a<java.lang.Object> r0 = r2.f7694j     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            d.a.r.h.a r0 = new d.a.r.h.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f7694j = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p155d.p156a.p163r.p173h.C2953e.m11395a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f7691g     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo9051a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo9053b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f7695k = r1     // Catch:{ all -> 0x0044 }
            r2.f7693i = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p155d.p156a.p176u.C2962a.m11431b((java.lang.Throwable) r3)
            return
        L_0x003e:
            d.a.k<? super T> r0 = r2.f7690f
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p174s.C2960c.onError(java.lang.Throwable):void");
    }
}
