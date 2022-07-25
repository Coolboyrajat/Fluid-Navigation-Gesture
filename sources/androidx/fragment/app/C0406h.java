package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p006b.p021d.C0736g;

/* renamed from: androidx.fragment.app.h */
public class C0406h {

    /* renamed from: a */
    private static final C0736g<String, Class<?>> f1821a = new C0736g<>();

    /* renamed from: b */
    static boolean m2094b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2095c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m2095c(ClassLoader classLoader, String str) {
        Class<?> cls = f1821a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f1821a.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2096d(ClassLoader classLoader, String str) {
        try {
            return m2095c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0394e("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0394e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo2430a(ClassLoader classLoader, String str) {
        throw null;
    }
}
