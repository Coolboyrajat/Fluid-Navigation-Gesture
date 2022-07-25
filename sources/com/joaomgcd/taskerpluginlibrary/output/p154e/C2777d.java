package com.joaomgcd.taskerpluginlibrary.output.p154e;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.d */
public final class C2777d extends C2776c {

    /* renamed from: a */
    private final boolean f7360a;

    /* renamed from: b */
    private final Object f7361b;

    private C2777d(Object obj) {
        super((C3366g) null);
        this.f7361b = obj;
        Object obj2 = this.f7361b;
        this.f7360a = obj2 == null ? false : obj2.getClass().isArray();
    }

    public C2777d(String str) {
        this((Object) str);
    }

    /* renamed from: a */
    public Object mo8893a(Object obj) {
        return this.f7361b;
    }

    /* renamed from: a */
    public boolean mo8894a() {
        return this.f7360a;
    }
}
