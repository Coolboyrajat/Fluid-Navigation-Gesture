package p054c.p083e.p104c.p106w;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: c.e.c.w.m */
public abstract class C1341m {

    /* renamed from: c.e.c.w.m$a */
    static class C1342a extends C1341m {

        /* renamed from: a */
        final /* synthetic */ Method f4215a;

        /* renamed from: b */
        final /* synthetic */ Object f4216b;

        C1342a(Method method, Object obj) {
            this.f4215a = method;
            this.f4216b = obj;
        }

        /* renamed from: a */
        public <T> T mo5771a(Class<T> cls) {
            C1341m.m6289b(cls);
            return this.f4215a.invoke(this.f4216b, new Object[]{cls});
        }
    }

    /* renamed from: c.e.c.w.m$b */
    static class C1343b extends C1341m {

        /* renamed from: a */
        final /* synthetic */ Method f4217a;

        /* renamed from: b */
        final /* synthetic */ int f4218b;

        C1343b(Method method, int i) {
            this.f4217a = method;
            this.f4218b = i;
        }

        /* renamed from: a */
        public <T> T mo5771a(Class<T> cls) {
            C1341m.m6289b(cls);
            return this.f4217a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f4218b)});
        }
    }

    /* renamed from: c.e.c.w.m$c */
    static class C1344c extends C1341m {

        /* renamed from: a */
        final /* synthetic */ Method f4219a;

        C1344c(Method method) {
            this.f4219a = method;
        }

        /* renamed from: a */
        public <T> T mo5771a(Class<T> cls) {
            C1341m.m6289b(cls);
            return this.f4219a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: c.e.c.w.m$d */
    static class C1345d extends C1341m {
        C1345d() {
        }

        /* renamed from: a */
        public <T> T mo5771a(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    public static C1341m m6288a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C1342a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C1343b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C1344c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C1345d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m6289b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo5771a(Class<T> cls);
}
