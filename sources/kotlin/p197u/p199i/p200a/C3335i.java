package kotlin.p197u.p199i.p200a;

import java.lang.reflect.Method;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.i.a.i */
final class C3335i {

    /* renamed from: a */
    private static final C3336a f8016a = new C3336a((Method) null, (Method) null, (Method) null);

    /* renamed from: b */
    public static C3336a f8017b;

    /* renamed from: c */
    public static final C3335i f8018c = new C3335i();

    /* renamed from: kotlin.u.i.a.i$a */
    private static final class C3336a {

        /* renamed from: a */
        public final Method f8019a;

        /* renamed from: b */
        public final Method f8020b;

        /* renamed from: c */
        public final Method f8021c;

        public C3336a(Method method, Method method2, Method method3) {
            this.f8019a = method;
            this.f8020b = method2;
            this.f8021c = method3;
        }
    }

    private C3335i() {
    }

    /* renamed from: b */
    private final C3336a m12175b(C3327a aVar) {
        try {
            C3336a aVar2 = new C3336a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f8017b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C3336a aVar3 = f8016a;
            f8017b = aVar3;
            return aVar3;
        }
    }

    /* renamed from: a */
    public final String mo10057a(C3327a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C3370k.m12227b(aVar, "continuation");
        C3336a aVar2 = f8017b;
        if (aVar2 == null) {
            aVar2 = m12175b(aVar);
        }
        if (aVar2 == f8016a || (method = aVar2.f8019a) == null || (invoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVar2.f8020b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar2.f8021c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (!(invoke3 instanceof String)) {
            invoke3 = null;
        }
        return (String) invoke3;
    }
}
