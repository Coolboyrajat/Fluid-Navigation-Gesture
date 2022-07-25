package p155d.p156a.p163r.p168e.p170b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p155d.p156a.C2790h;
import p155d.p156a.C2792j;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p161p.C2819b;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p163r.p164a.C2832b;
import p155d.p156a.p163r.p164a.C2833c;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p171f.C2917a;
import p155d.p156a.p163r.p173h.C2949b;

/* renamed from: d.a.r.e.b.b */
public final class C2868b<T, R> extends C2790h<R> {

    /* renamed from: f */
    final C2792j<? extends T>[] f7445f;

    /* renamed from: g */
    final Iterable<? extends C2792j<? extends T>> f7446g;

    /* renamed from: h */
    final C2828f<? super Object[], ? extends R> f7447h;

    /* renamed from: i */
    final int f7448i;

    /* renamed from: j */
    final boolean f7449j;

    /* renamed from: d.a.r.e.b.b$a */
    static final class C2869a<T, R> extends AtomicReference<C2810b> implements C2793k<T> {

        /* renamed from: f */
        final C2870b<T, R> f7450f;

        /* renamed from: g */
        final int f7451g;

        C2869a(C2870b<T, R> bVar, int i) {
            this.f7450f = bVar;
            this.f7451g = i;
        }

        /* renamed from: a */
        public void mo8987a() {
            C2832b.m11099a((AtomicReference<C2810b>) this);
        }

        /* renamed from: a */
        public void mo6031a(C2810b bVar) {
            C2832b.m11103c(this, bVar);
        }

        /* renamed from: a */
        public void mo6032a(T t) {
            this.f7450f.mo8989a(this.f7451g, t);
        }

        /* renamed from: c */
        public void mo6033c() {
            this.f7450f.mo8988a(this.f7451g);
        }

        public void onError(Throwable th) {
            this.f7450f.mo8990a(this.f7451g, th);
        }
    }

    /* renamed from: d.a.r.e.b.b$b */
    static final class C2870b<T, R> extends AtomicInteger implements C2810b {

        /* renamed from: f */
        final C2793k<? super R> f7452f;

        /* renamed from: g */
        final C2828f<? super Object[], ? extends R> f7453g;

        /* renamed from: h */
        final C2869a<T, R>[] f7454h;

        /* renamed from: i */
        Object[] f7455i;

        /* renamed from: j */
        final C2917a<Object[]> f7456j;

        /* renamed from: k */
        final boolean f7457k;

        /* renamed from: l */
        volatile boolean f7458l;

        /* renamed from: m */
        volatile boolean f7459m;

        /* renamed from: n */
        final C2949b f7460n = new C2949b();

        /* renamed from: o */
        int f7461o;

        /* renamed from: p */
        int f7462p;

        C2870b(C2793k<? super R> kVar, C2828f<? super Object[], ? extends R> fVar, int i, int i2, boolean z) {
            this.f7452f = kVar;
            this.f7453g = fVar;
            this.f7457k = z;
            this.f7455i = new Object[i];
            C2869a<T, R>[] aVarArr = new C2869a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C2869a<>(this, i3);
            }
            this.f7454h = aVarArr;
            this.f7456j = new C2917a<>(i2);
        }

        /* renamed from: a */
        public void mo6027a() {
            if (!this.f7458l) {
                this.f7458l = true;
                mo8993c();
                if (getAndIncrement() == 0) {
                    mo8991a((C2917a<?>) this.f7456j);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            mo8993c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            mo8994d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8988a(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f7455i     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.f7462p     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.f7462p = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.f7459m = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.mo8993c()
            L_0x0021:
                r3.mo8994d()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p168e.p170b.C2868b.C2870b.mo8988a(int):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            mo8994d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8989a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f7455i     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f7461o     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f7461o = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                d.a.r.f.a<java.lang.Object[]> r4 = r3.f7456j     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.mo8965b(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.mo8994d()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p168e.p170b.C2868b.C2870b.mo8989a(int, java.lang.Object):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8990a(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                d.a.r.h.b r0 = r2.f7460n
                boolean r0 = r0.mo9055a(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.f7457k
                r0 = 1
                if (r4 == 0) goto L_0x002c
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f7455i     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x0029 }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.f7462p     // Catch:{ all -> 0x0029 }
                int r1 = r1 + r0
                r2.f7462p = r1     // Catch:{ all -> 0x0029 }
                int r4 = r4.length     // Catch:{ all -> 0x0029 }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.f7459m = r0     // Catch:{ all -> 0x0029 }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x002d
            L_0x0029:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r3
            L_0x002c:
                r3 = 1
            L_0x002d:
                if (r3 == 0) goto L_0x0032
                r2.mo8993c()
            L_0x0032:
                r2.mo8994d()
                goto L_0x0039
            L_0x0036:
                p155d.p156a.p176u.C2962a.m11431b((java.lang.Throwable) r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p168e.p170b.C2868b.C2870b.mo8990a(int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8991a(C2917a<?> aVar) {
            synchronized (this) {
                this.f7455i = null;
            }
            aVar.clear();
        }

        /* renamed from: a */
        public void mo8992a(C2792j<? extends T>[] jVarArr) {
            C2869a<T, R>[] aVarArr = this.f7454h;
            int length = aVarArr.length;
            this.f7452f.mo6031a((C2810b) this);
            for (int i = 0; i < length && !this.f7459m && !this.f7458l; i++) {
                jVarArr[i].mo8917a(aVarArr[i]);
            }
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7458l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8993c() {
            for (C2869a<T, R> a : this.f7454h) {
                a.mo8987a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8994d() {
            if (getAndIncrement() == 0) {
                C2917a<Object[]> aVar = this.f7456j;
                C2793k<? super R> kVar = this.f7452f;
                boolean z = this.f7457k;
                int i = 1;
                while (!this.f7458l) {
                    if (z || this.f7460n.get() == null) {
                        boolean z2 = this.f7459m;
                        Object[] d = aVar.mo8967d();
                        boolean z3 = d == null;
                        if (z2 && z3) {
                            mo8991a((C2917a<?>) aVar);
                            Throwable a = this.f7460n.mo9054a();
                            if (a == null) {
                                kVar.mo6033c();
                                return;
                            } else {
                                kVar.onError(a);
                                return;
                            }
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object a2 = this.f7453g.mo6044a(d);
                                C2849b.m11138a(a2, "The combiner returned a null value");
                                kVar.mo6032a(a2);
                            } catch (Throwable th) {
                                C2819b.m11088b(th);
                                this.f7460n.mo9055a(th);
                            }
                        }
                    } else {
                        mo8993c();
                        mo8991a((C2917a<?>) aVar);
                        kVar.onError(this.f7460n.mo9054a());
                        return;
                    }
                }
                mo8991a((C2917a<?>) aVar);
            }
        }
    }

    public C2868b(C2792j<? extends T>[] jVarArr, Iterable<? extends C2792j<? extends T>> iterable, C2828f<? super Object[], ? extends R> fVar, int i, boolean z) {
        this.f7445f = jVarArr;
        this.f7446g = iterable;
        this.f7447h = fVar;
        this.f7448i = i;
        this.f7449j = z;
    }

    /* renamed from: b */
    public void mo5871b(C2793k<? super R> kVar) {
        int i;
        C2792j<? extends T>[] jVarArr = this.f7445f;
        if (jVarArr == null) {
            jVarArr = new C2790h[8];
            i = 0;
            for (C2792j<? extends T> jVar : this.f7446g) {
                if (i == jVarArr.length) {
                    C2792j<? extends T>[] jVarArr2 = new C2792j[((i >> 2) + i)];
                    System.arraycopy(jVarArr, 0, jVarArr2, 0, i);
                    jVarArr = jVarArr2;
                }
                jVarArr[i] = jVar;
                i++;
            }
        } else {
            i = jVarArr.length;
        }
        int i2 = i;
        if (i2 == 0) {
            C2833c.m11108a((C2793k<?>) kVar);
            return;
        }
        new C2870b(kVar, this.f7447h, i2, this.f7448i, this.f7449j).mo8992a(jVarArr);
    }
}
