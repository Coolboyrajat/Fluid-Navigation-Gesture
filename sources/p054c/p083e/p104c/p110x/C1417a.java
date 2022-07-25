package p054c.p083e.p104c.p110x;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p054c.p083e.p104c.p106w.C1302a;
import p054c.p083e.p104c.p106w.C1303b;

/* renamed from: c.e.c.x.a */
public class C1417a<T> {

    /* renamed from: a */
    final Class<? super T> f4351a;

    /* renamed from: b */
    final Type f4352b;

    /* renamed from: c */
    final int f4353c;

    protected C1417a() {
        this.f4352b = m6531b(getClass());
        this.f4351a = C1303b.m6221e(this.f4352b);
        this.f4353c = this.f4352b.hashCode();
    }

    C1417a(Type type) {
        C1302a.m6202a(type);
        this.f4352b = C1303b.m6216b(type);
        this.f4351a = C1303b.m6221e(this.f4352b);
        this.f4353c = this.f4352b.hashCode();
    }

    /* renamed from: a */
    public static <T> C1417a<T> m6529a(Class<T> cls) {
        return new C1417a<>(cls);
    }

    /* renamed from: a */
    public static C1417a<?> m6530a(Type type) {
        return new C1417a<>(type);
    }

    /* renamed from: b */
    static Type m6531b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C1303b.m6216b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> mo5855a() {
        return this.f4351a;
    }

    /* renamed from: b */
    public final Type mo5856b() {
        return this.f4352b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1417a) && C1303b.m6215a(this.f4352b, ((C1417a) obj).f4352b);
    }

    public final int hashCode() {
        return this.f4353c;
    }

    public final String toString() {
        return C1303b.m6224h(this.f4352b);
    }
}
