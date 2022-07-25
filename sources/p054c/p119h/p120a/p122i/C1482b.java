package p054c.p119h.p120a.p122i;

import java.util.Arrays;
import kotlin.C3269p;
import kotlin.p194d0.C3240e;
import kotlin.p205x.p207d.C3357a0;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: c.h.a.i.b */
public final class C1482b {
    /* renamed from: a */
    public static final String m6732a(String str) {
        C3370k.m12227b(str, "receiver$0");
        String a = new C3240e("\\[[0-9]+\\]").mo9929a(C3250n.m11928a(C3250n.m11928a(C3250n.m11928a(C3250n.m11928a(C3250n.m11928a(C3250n.m11928a(C3251o.m11963d(str).toString(), " ", BuildConfig.FLAVOR, false, 4, (Object) null), "%", BuildConfig.FLAVOR, false, 4, (Object) null), " ", "_", false, 4, (Object) null), "[]", BuildConfig.FLAVOR, false, 4, (Object) null), "-", BuildConfig.FLAVOR, false, 4, (Object) null), "'", "_", false, 4, (Object) null), BuildConfig.FLAVOR);
        if (a != null) {
            String lowerCase = a.toLowerCase();
            C3370k.m12223a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase.length() < 3 ? m6733a(lowerCase, "a", 3, false) : lowerCase;
        }
        throw new C3269p("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private static final String m6733a(String str, String str2, int i, boolean z) {
        int length = i - str.length();
        C3357a0 a0Var = C3357a0.f8027a;
        Object[] objArr = {0};
        String format = String.format("%0" + length + "d", Arrays.copyOf(objArr, objArr.length));
        C3370k.m12223a((Object) format, "java.lang.String.format(format, *args)");
        String a = C3250n.m11928a(format, "0", str2, false, 4, (Object) null);
        String str3 = z ? BuildConfig.FLAVOR : a;
        if (!z) {
            a = BuildConfig.FLAVOR;
        }
        return str3 + str + a;
    }

    /* renamed from: a */
    public static final void m6734a(StringBuilder sb, String str, Object obj) {
        C3370k.m12227b(sb, "receiver$0");
        if (obj != null && str != null) {
            String obj2 = obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? "true" : null : obj.toString();
            if (!(obj2 == null || obj2.length() == 0)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(str + ": " + obj2);
            }
        }
    }
}
