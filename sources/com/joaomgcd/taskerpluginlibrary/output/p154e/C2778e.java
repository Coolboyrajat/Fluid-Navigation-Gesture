package com.joaomgcd.taskerpluginlibrary.output.p154e;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3369j;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3372m;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.e */
public final class C2778e extends C2776c {

    /* renamed from: a */
    private final boolean f7362a;

    /* renamed from: b */
    private final Method f7363b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2778e(Method method) {
        super((C3366g) null);
        C3370k.m12227b(method, "method");
        this.f7363b = method;
        Class<?> returnType = this.f7363b.getReturnType();
        C3370k.m12223a((Object) returnType, "method.returnType");
        this.f7362a = returnType.isArray();
    }

    /* renamed from: a */
    public Object mo8893a(Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        try {
            Object invoke = this.f7363b.invoke(obj, new Object[0]);
            if (invoke == null) {
                return null;
            }
            if (!(invoke instanceof String)) {
                if (!(invoke instanceof Object[])) {
                    if (!(invoke instanceof Boolean)) {
                        if (!C3370k.m12225a(invoke, (Object) C3369j.f8035a)) {
                            if (!C3370k.m12225a(invoke, (Object) C3372m.f8037a)) {
                                if (!(invoke instanceof Float)) {
                                    if (!(invoke instanceof Double)) {
                                        if (invoke instanceof Collection) {
                                            Collection collection = (Collection) invoke;
                                            if (collection != null) {
                                                invoke = collection.toArray(new Object[0]);
                                                if (invoke == null) {
                                                    throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
                                                }
                                            } else {
                                                throw new C3269p("null cannot be cast to non-null type java.util.Collection<T>");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj2 = invoke.toString();
                    return obj2;
                }
            }
            obj2 = (Serializable) invoke;
            return obj2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo8894a() {
        return this.f7362a;
    }
}
