package p155d.p156a.p163r.p164a;

import p155d.p156a.C2785c;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p166c.C2853c;

/* renamed from: d.a.r.a.c */
public enum C2833c implements C2853c<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m11107a(C2785c cVar) {
        cVar.mo8900a(INSTANCE);
        cVar.mo6035c();
    }

    /* renamed from: a */
    public static void m11108a(C2793k<?> kVar) {
        kVar.mo6031a((C2810b) INSTANCE);
        kVar.mo6033c();
    }

    /* renamed from: a */
    public static void m11109a(Throwable th, C2785c cVar) {
        cVar.mo8900a(INSTANCE);
        cVar.onError(th);
    }

    /* renamed from: a */
    public static void m11110a(Throwable th, C2793k<?> kVar) {
        kVar.mo6031a((C2810b) INSTANCE);
        kVar.onError(th);
    }

    /* renamed from: a */
    public int mo8964a(int i) {
        return i & 2;
    }

    /* renamed from: a */
    public void mo6027a() {
    }

    /* renamed from: b */
    public boolean mo6028b() {
        return this == INSTANCE;
    }

    /* renamed from: b */
    public boolean mo8965b(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void clear() {
    }

    /* renamed from: d */
    public Object mo8967d() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }
}
