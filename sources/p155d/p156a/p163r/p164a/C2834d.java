package p155d.p156a.p163r.p164a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2814a;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p173h.C2951d;

/* renamed from: d.a.r.a.d */
public final class C2834d implements C2810b, C2831a {

    /* renamed from: f */
    List<C2810b> f7417f;

    /* renamed from: g */
    volatile boolean f7418g;

    /* renamed from: a */
    public void mo6027a() {
        if (!this.f7418g) {
            synchronized (this) {
                if (!this.f7418g) {
                    this.f7418g = true;
                    List<C2810b> list = this.f7417f;
                    this.f7417f = null;
                    mo8969a(list);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8969a(List<C2810b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C2810b a : list) {
                try {
                    a.mo6027a();
                } catch (Throwable th) {
                    C2819b.m11088b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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
            java.lang.String r0 = "Disposable item is null"
            p155d.p156a.p163r.p165b.C2849b.m11138a(r3, (java.lang.String) r0)
            boolean r0 = r2.f7418g
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f7418g     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<d.a.o.b> r0 = r2.f7417f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p164a.C2834d.mo8946a(d.a.o.b):boolean");
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this.f7418g;
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
    public boolean mo8949c(C2810b bVar) {
        C2849b.m11138a(bVar, "d is null");
        if (!this.f7418g) {
            synchronized (this) {
                if (!this.f7418g) {
                    List list = this.f7417f;
                    if (list == null) {
                        list = new LinkedList();
                        this.f7417f = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.mo6027a();
        return false;
    }
}
