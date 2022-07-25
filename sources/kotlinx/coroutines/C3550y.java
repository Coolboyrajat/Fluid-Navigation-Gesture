package kotlinx.coroutines;

import kotlin.p197u.C3310d;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.p212i2.C3442c;

/* renamed from: kotlinx.coroutines.y */
public final class C3550y {

    /* renamed from: a */
    private static final boolean f8263a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals(p190io.objectbox.android.BuildConfig.FLAVOR) != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C3488v.m12584a(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            f8263a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3550y.<clinit>():void");
    }

    /* renamed from: a */
    public static final String m12801a(C3314f fVar) {
        C3408c0 c0Var;
        String str;
        C3370k.m12227b(fVar, "$this$coroutineName");
        if (!C3498j0.m12620c() || (c0Var = (C3408c0) fVar.get(C3408c0.f8071g)) == null) {
            return null;
        }
        C3413d0 d0Var = (C3413d0) fVar.get(C3413d0.f8073g);
        if (d0Var == null || (str = d0Var.mo10138h()) == null) {
            str = "coroutine";
        }
        return str + '#' + c0Var.mo10126h();
    }

    /* renamed from: a */
    public static final C3314f m12802a(C3418e0 e0Var, C3314f fVar) {
        C3370k.m12227b(e0Var, "$this$newCoroutineContext");
        C3370k.m12227b(fVar, "context");
        C3314f plus = e0Var.mo2649f().plus(fVar);
        C3314f plus2 = C3498j0.m12620c() ? plus.plus(new C3408c0(C3498j0.m12619b().incrementAndGet())) : plus;
        return (plus == C3536t0.m12776a() || plus.get(C3310d.f8000b) != null) ? plus2 : plus2.plus(C3536t0.m12776a());
    }

    /* renamed from: a */
    public static final C3556z m12803a() {
        return f8263a ? C3442c.f8126l : C3518p.f8226h;
    }
}
