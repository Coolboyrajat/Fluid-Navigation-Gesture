package androidx.lifecycle;

import androidx.lifecycle.C0481i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b */
class C0469b {

    /* renamed from: c */
    static C0469b f2033c = new C0469b();

    /* renamed from: a */
    private final Map<Class<?>, C0470a> f2034a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f2035b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class C0470a {

        /* renamed from: a */
        final Map<C0481i.C0482a, List<C0471b>> f2036a = new HashMap();

        /* renamed from: b */
        final Map<C0471b, C0481i.C0482a> f2037b;

        C0470a(Map<C0471b, C0481i.C0482a> map) {
            this.f2037b = map;
            for (Map.Entry next : map.entrySet()) {
                C0481i.C0482a aVar = (C0481i.C0482a) next.getValue();
                List list = this.f2036a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2036a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: a */
        private static void m2412a(List<C0471b> list, C0490o oVar, C0481i.C0482a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo2680a(oVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2679a(C0490o oVar, C0481i.C0482a aVar, Object obj) {
            m2412a(this.f2036a.get(aVar), oVar, aVar, obj);
            m2412a(this.f2036a.get(C0481i.C0482a.ON_ANY), oVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    static class C0471b {

        /* renamed from: a */
        final int f2038a;

        /* renamed from: b */
        final Method f2039b;

        C0471b(int i, Method method) {
            this.f2038a = i;
            this.f2039b = method;
            this.f2039b.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2680a(C0490o oVar, C0481i.C0482a aVar, Object obj) {
            try {
                int i = this.f2038a;
                if (i == 0) {
                    this.f2039b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2039b.invoke(obj, new Object[]{oVar});
                } else if (i == 2) {
                    this.f2039b.invoke(obj, new Object[]{oVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0471b.class != obj.getClass()) {
                return false;
            }
            C0471b bVar = (C0471b) obj;
            return this.f2038a == bVar.f2038a && this.f2039b.getName().equals(bVar.f2039b.getName());
        }

        public int hashCode() {
            return (this.f2038a * 31) + this.f2039b.getName().hashCode();
        }
    }

    C0469b() {
    }

    /* renamed from: a */
    private C0470a m2407a(Class<?> cls, Method[] methodArr) {
        int i;
        C0470a a;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a = mo2677a(superclass)) == null)) {
            hashMap.putAll(a.f2037b);
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Map.Entry next : mo2677a(a2).f2037b.entrySet()) {
                m2408a(hashMap, (C0471b) next.getKey(), (C0481i.C0482a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2409c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0499v vVar = (C0499v) method.getAnnotation(C0499v.class);
            if (vVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0490o.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0481i.C0482a value = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0481i.C0482a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0481i.C0482a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m2408a(hashMap, new C0471b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0470a aVar = new C0470a(hashMap);
        this.f2034a.put(cls, aVar);
        this.f2035b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m2408a(Map<C0471b, C0481i.C0482a> map, C0471b bVar, C0481i.C0482a aVar, Class<?> cls) {
        C0481i.C0482a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2039b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: c */
    private Method[] m2409c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0470a mo2677a(Class<?> cls) {
        C0470a aVar = this.f2034a.get(cls);
        return aVar != null ? aVar : m2407a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2678b(Class<?> cls) {
        Boolean bool = this.f2035b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m2409c(cls);
        for (Method annotation : c) {
            if (((C0499v) annotation.getAnnotation(C0499v.class)) != null) {
                m2407a(cls, c);
                return true;
            }
        }
        this.f2035b.put(cls, false);
        return false;
    }
}
