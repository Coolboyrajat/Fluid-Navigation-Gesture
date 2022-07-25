package p155d.p156a.p178w;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p165b.C2849b;
import p155d.p156a.p163r.p173h.C2947a;
import p155d.p156a.p163r.p173h.C2951d;
import p155d.p156a.p163r.p173h.C2953e;
import p155d.p156a.p176u.C2962a;

/* renamed from: d.a.w.a */
public final class C2973a<T> extends C2975b<T> {

    /* renamed from: m */
    static final C2974a[] f7714m = new C2974a[0];

    /* renamed from: n */
    static final C2974a[] f7715n = new C2974a[0];

    /* renamed from: f */
    final AtomicReference<Object> f7716f;

    /* renamed from: g */
    final AtomicReference<C2974a<T>[]> f7717g;

    /* renamed from: h */
    final ReadWriteLock f7718h;

    /* renamed from: i */
    final Lock f7719i;

    /* renamed from: j */
    final Lock f7720j;

    /* renamed from: k */
    final AtomicReference<Throwable> f7721k;

    /* renamed from: l */
    long f7722l;

    /* renamed from: d.a.w.a$a */
    static final class C2974a<T> implements C2810b, C2947a.C2948a<Object> {

        /* renamed from: f */
        final C2793k<? super T> f7723f;

        /* renamed from: g */
        final C2973a<T> f7724g;

        /* renamed from: h */
        boolean f7725h;

        /* renamed from: i */
        boolean f7726i;

        /* renamed from: j */
        C2947a<Object> f7727j;

        /* renamed from: k */
        boolean f7728k;

        /* renamed from: l */
        volatile boolean f7729l;

        /* renamed from: m */
        long f7730m;

        C2974a(C2793k<? super T> kVar, C2973a<T> aVar) {
            this.f7723f = kVar;
            this.f7724g = aVar;
        }

        /* renamed from: a */
        public void mo6027a() {
            if (!this.f7729l) {
                this.f7729l = true;
                this.f7724g.mo9074b(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f7728k = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9078a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f7729l
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f7728k
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f7729l     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f7730m     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f7726i     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                d.a.r.h.a<java.lang.Object> r5 = r3.f7727j     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                d.a.r.h.a r5 = new d.a.r.h.a     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f7727j = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo9051a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f7725h = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f7728k = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.mo6042a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p178w.C2973a.C2974a.mo9078a(java.lang.Object, long):void");
        }

        /* renamed from: a */
        public boolean mo6042a(Object obj) {
            return this.f7729l || C2953e.m11396a(obj, this.f7723f);
        }

        /* renamed from: b */
        public boolean mo6028b() {
            return this.f7729l;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (mo6042a(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo9080d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9079c() {
            /*
                r4 = this;
                boolean r0 = r4.f7729l
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f7729l     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f7725h     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                d.a.w.a<T> r0 = r4.f7724g     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f7719i     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f7722l     // Catch:{ all -> 0x003e }
                r4.f7730m = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f7716f     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f7726i = r2     // Catch:{ all -> 0x003e }
                r4.f7725h = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.mo6042a(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo9080d()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p178w.C2973a.C2974a.mo9079c():void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo9050a((p155d.p156a.p163r.p173h.C2947a.C2948a<? super java.lang.Object>) r2);
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9080d() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f7729l
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                d.a.r.h.a<java.lang.Object> r0 = r2.f7727j     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f7726i = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f7727j = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo9050a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p178w.C2973a.C2974a.mo9080d():void");
        }
    }

    C2973a() {
        this.f7718h = new ReentrantReadWriteLock();
        this.f7719i = this.f7718h.readLock();
        this.f7720j = this.f7718h.writeLock();
        this.f7717g = new AtomicReference<>(f7714m);
        this.f7716f = new AtomicReference<>();
        this.f7721k = new AtomicReference<>();
    }

    C2973a(T t) {
        this();
        AtomicReference<Object> atomicReference = this.f7716f;
        C2849b.m11138a(t, "defaultValue is null");
        atomicReference.lazySet(t);
    }

    /* renamed from: f */
    public static <T> C2973a<T> m11438f(T t) {
        return new C2973a<>(t);
    }

    /* renamed from: h */
    public static <T> C2973a<T> m11439h() {
        return new C2973a<>();
    }

    /* renamed from: a */
    public void mo6031a(C2810b bVar) {
        if (this.f7721k.get() != null) {
            bVar.mo6027a();
        }
    }

    /* renamed from: a */
    public void mo6032a(T t) {
        C2849b.m11138a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f7721k.get() == null) {
            C2953e.m11400d(t);
            mo9075d(t);
            for (C2974a a : (C2974a[]) this.f7717g.get()) {
                a.mo9078a(t, this.f7722l);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9073a(C2974a<T> aVar) {
        C2974a[] aVarArr;
        C2974a[] aVarArr2;
        do {
            aVarArr = (C2974a[]) this.f7717g.get();
            if (aVarArr == f7715n) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C2974a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f7717g.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5871b(C2793k<? super T> kVar) {
        C2974a aVar = new C2974a(kVar, this);
        kVar.mo6031a((C2810b) aVar);
        if (!mo9073a(aVar)) {
            Throwable th = this.f7721k.get();
            if (th == C2951d.f7679a) {
                kVar.mo6033c();
            } else {
                kVar.onError(th);
            }
        } else if (aVar.f7729l) {
            mo9074b(aVar);
        } else {
            aVar.mo9079c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9074b(C2974a<T> aVar) {
        C2974a<T>[] aVarArr;
        C2974a[] aVarArr2;
        do {
            aVarArr = (C2974a[]) this.f7717g.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f7714m;
                    } else {
                        C2974a[] aVarArr3 = new C2974a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f7717g.compareAndSet(aVarArr, aVarArr2));
    }

    /* renamed from: c */
    public void mo6033c() {
        if (this.f7721k.compareAndSet((Object) null, C2951d.f7679a)) {
            Object a = C2953e.m11393a();
            for (C2974a a2 : mo9076e(a)) {
                a2.mo9078a(a, this.f7722l);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9075d(Object obj) {
        this.f7720j.lock();
        this.f7722l++;
        this.f7716f.lazySet(obj);
        this.f7720j.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C2974a<T>[] mo9076e(Object obj) {
        C2974a<T>[] aVarArr = (C2974a[]) this.f7717g.getAndSet(f7715n);
        if (aVarArr != f7715n) {
            mo9075d(obj);
        }
        return aVarArr;
    }

    /* renamed from: g */
    public T mo9077g() {
        T t = this.f7716f.get();
        if (C2953e.m11397b(t) || C2953e.m11399c(t)) {
            return null;
        }
        C2953e.m11394a((Object) t);
        return t;
    }

    public void onError(Throwable th) {
        C2849b.m11138a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f7721k.compareAndSet((Object) null, th)) {
            C2962a.m11431b(th);
            return;
        }
        Object a = C2953e.m11395a(th);
        for (C2974a a2 : mo9076e(a)) {
            a2.mo9078a(a, this.f7722l);
        }
    }
}
