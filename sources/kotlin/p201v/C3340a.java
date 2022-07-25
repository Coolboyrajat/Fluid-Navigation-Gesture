package kotlin.p201v;

import java.lang.reflect.Method;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.v.a */
public class C3340a {

    /* renamed from: kotlin.v.a$a */
    private static final class C3341a {

        /* renamed from: a */
        public static final Method f8023a;

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[EDGE_INSN: B:13:0x0047->B:11:0x0047 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0043 A[LOOP:0: B:1:0x0013->B:9:0x0043, LOOP_END] */
        static {
            /*
                kotlin.v.a$a r0 = new kotlin.v.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r1, (java.lang.String) r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0013:
                if (r4 >= r2) goto L_0x0046
                r5 = r1[r4]
                java.lang.String r6 = "it"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r5, (java.lang.String) r6)
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = kotlin.p205x.p207d.C3370k.m12225a((java.lang.Object) r6, (java.lang.Object) r7)
                if (r6 == 0) goto L_0x003f
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r6, (java.lang.String) r7)
                java.lang.Object r6 = kotlin.p195s.C3280f.m12031g(r6)
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r6 = kotlin.p205x.p207d.C3370k.m12225a((java.lang.Object) r6, (java.lang.Object) r0)
                if (r6 == 0) goto L_0x003f
                r6 = 1
                goto L_0x0040
            L_0x003f:
                r6 = 0
            L_0x0040:
                if (r6 == 0) goto L_0x0043
                goto L_0x0047
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0013
            L_0x0046:
                r5 = 0
            L_0x0047:
                f8023a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p201v.C3340a.C3341a.<clinit>():void");
        }

        private C3341a() {
        }
    }

    /* renamed from: a */
    public void mo10059a(Throwable th, Throwable th2) {
        C3370k.m12227b(th, "cause");
        C3370k.m12227b(th2, "exception");
        Method method = C3341a.f8023a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }
}
