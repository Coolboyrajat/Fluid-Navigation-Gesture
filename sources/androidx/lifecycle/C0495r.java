package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p190io.objectbox.android.BuildConfig;

/* renamed from: androidx.lifecycle.r */
public class C0495r {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f2061a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C0478f>>> f2062b = new HashMap();

    /* renamed from: a */
    private static C0478f m2462a(Constructor<? extends C0478f> constructor, Object obj) {
        try {
            return (C0478f) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    static C0488m m2463a(Object obj) {
        boolean z = obj instanceof C0488m;
        boolean z2 = obj instanceof C0477e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0477e) obj, (C0488m) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0477e) obj, (C0488m) null);
        }
        if (z) {
            return (C0488m) obj;
        }
        Class<?> cls = obj.getClass();
        if (m2466b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f2062b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2462a((Constructor) list.get(0), obj));
        }
        C0478f[] fVarArr = new C0478f[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fVarArr[i] = m2462a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    /* renamed from: a */
    public static String m2464a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: a */
    private static Constructor<? extends C0478f> m2465a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : BuildConfig.FLAVOR;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m2464a(canonicalName);
            if (!name.isEmpty()) {
                a = name + "." + a;
            }
            Constructor<?> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m2466b(Class<?> cls) {
        Integer num = f2061a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int d = m2468d(cls);
        f2061a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m2467c(Class<?> cls) {
        return cls != null && C0489n.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m2468d(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0478f> a = m2465a(cls);
        if (a != null) {
            f2062b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0469b.f2033c.mo2678b(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m2467c(superclass)) {
                if (m2466b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f2062b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m2467c(cls2)) {
                    if (m2466b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f2062b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2062b.put(cls, arrayList);
            return 2;
        }
    }
}
