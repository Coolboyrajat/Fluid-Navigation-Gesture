package p155d.p156a.p160o;

import java.util.ArrayList;
import p155d.p156a.p161p.C2814a;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p164a.C2831a;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p173h.C2951d;
import p155d.p156a.p163r.p173h.C2956f;

/* renamed from: d.a.o.a */
public final class C2809a implements C2810b, C2831a {

    /* renamed from: f */
    C2956f<C2810b> f7405f;

    /* renamed from: g */
    volatile boolean f7406g;

    /* renamed from: a */
    public void mo6027a() {
        if (!this.f7406g) {
            synchronized (this) {
                if (!this.f7406g) {
                    this.f7406g = true;
                    C2956f<C2810b> fVar = this.f7405f;
                    this.f7405f = null;
                    mo8945a(fVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8945a(C2956f<C2810b> fVar) {
        if (fVar != null) {
            ArrayList arrayList = null;
            for (Object obj : fVar.mo9064a()) {
                if (obj instanceof C2810b) {
                    try {
                        ((C2810b) obj).mo6027a();
                    } catch (Throwable th) {
                        C2819b.m11088b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C2951d.m11390a((Throwable) arrayList.get(0));
            }
            throw new C2814a((Iterable<? extends Throwable>) arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8946a(p155d.p156a.p160o.C2810b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "disposables is null"
            p155d.p156a.p163r.p165b.C2849b.m11138a(r3, (java.lang.String) r0)
            boolean r0 = r2.f7406g
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f7406g     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            d.a.r.h.f<d.a.o.b> r0 = r2.f7405f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo9066b(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p160o.C2809a.mo8946a(d.a.o.b):boolean");
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7406g;
    }

    /* renamed from: b */
    public boolean mo8947b(C2810b bVar) {
        if (!mo8946a(bVar)) {
            return false;
        }
        bVar.mo6027a();
        return true;
    }

    /* renamed from: c */
    public void mo8948c() {
        if (!this.f7406g) {
            synchronized (this) {
                if (!this.f7406g) {
                    C2956f<C2810b> fVar = this.f7405f;
                    this.f7405f = null;
                    mo8945a(fVar);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo8949c(C2810b bVar) {
        C2849b.m11138a(bVar, "disposable is null");
        if (!this.f7406g) {
            synchronized (this) {
                if (!this.f7406g) {
                    C2956f<C2810b> fVar = this.f7405f;
                    if (fVar == null) {
                        fVar = new C2956f<>();
                        this.f7405f = fVar;
                    }
                    fVar.mo9063a(bVar);
                    return true;
                }
            }
        }
        bVar.mo6027a();
        return false;
    }
}
