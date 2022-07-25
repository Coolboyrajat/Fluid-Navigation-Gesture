package p054c.p083e.p104c.p106w;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.e.c.w.k */
public final class C1337k {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f4211a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m6283a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m6283a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m6283a(hashMap, hashMap2, Character.TYPE, Character.class);
        m6283a(hashMap, hashMap2, Double.TYPE, Double.class);
        m6283a(hashMap, hashMap2, Float.TYPE, Float.class);
        m6283a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m6283a(hashMap, hashMap2, Long.TYPE, Long.class);
        m6283a(hashMap, hashMap2, Short.TYPE, Short.class);
        m6283a(hashMap, hashMap2, Void.TYPE, Void.class);
        f4211a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m6282a(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f4211a;
        C1302a.m6202a(cls);
        Class<T> cls2 = map.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: a */
    private static void m6283a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m6284a(Type type) {
        return f4211a.containsKey(type);
    }
}
