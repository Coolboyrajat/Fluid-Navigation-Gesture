package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.a0 */
public class C0464a0 {

    /* renamed from: a */
    private final C0466b f2029a;

    /* renamed from: b */
    private final C0474c0 f2030b;

    /* renamed from: androidx.lifecycle.a0$a */
    public static class C0465a extends C0468d {

        /* renamed from: b */
        private static C0465a f2031b;

        /* renamed from: a */
        private Application f2032a;

        public C0465a(Application application) {
            this.f2032a = application;
        }

        /* renamed from: a */
        public static C0465a m2401a(Application application) {
            if (f2031b == null) {
                f2031b = new C0465a(application);
            }
            return f2031b;
        }

        /* renamed from: a */
        public <T extends C0508z> T mo2570a(Class<T> cls) {
            if (!C0463a.class.isAssignableFrom(cls)) {
                return super.mo2570a(cls);
            }
            try {
                return (C0508z) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f2032a});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.a0$b */
    public interface C0466b {
        /* renamed from: a */
        <T extends C0508z> T mo2570a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.a0$c */
    static abstract class C0467c implements C0466b {
        C0467c() {
        }

        /* renamed from: a */
        public <T extends C0508z> T mo2570a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: a */
        public abstract <T extends C0508z> T mo2676a(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.a0$d */
    public static class C0468d implements C0466b {
        /* renamed from: a */
        public <T extends C0508z> T mo2570a(Class<T> cls) {
            try {
                return (C0508z) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    public C0464a0(C0474c0 c0Var, C0466b bVar) {
        this.f2029a = bVar;
        this.f2030b = c0Var;
    }

    /* renamed from: a */
    public <T extends C0508z> T mo2674a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo2675a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0508z> T mo2675a(String str, Class<T> cls) {
        T a = this.f2030b.mo2685a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        C0466b bVar = this.f2029a;
        T a2 = bVar instanceof C0467c ? ((C0467c) bVar).mo2676a(str, cls) : bVar.mo2570a(cls);
        this.f2030b.mo2687a(str, a2);
        return a2;
    }
}
