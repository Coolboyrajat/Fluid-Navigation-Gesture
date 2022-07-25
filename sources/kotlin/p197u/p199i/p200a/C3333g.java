package kotlin.p197u.p199i.p200a;

import java.lang.reflect.Field;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.i.a.g */
public final class C3333g {
    /* renamed from: a */
    private static final C3332f m12168a(C3327a aVar) {
        return (C3332f) aVar.getClass().getAnnotation(C3332f.class);
    }

    /* renamed from: a */
    private static final void m12169a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final int m12170b(C3327a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C3370k.m12223a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static final StackTraceElement m12171c(C3327a aVar) {
        String str;
        C3370k.m12227b(aVar, "$this$getStackTraceElementImpl");
        C3332f a = m12168a(aVar);
        if (a == null) {
            return null;
        }
        m12169a(1, a.mo10056v());
        int b = m12170b(aVar);
        int i = b < 0 ? -1 : a.mo10054l()[b];
        String a2 = C3335i.f8018c.mo10057a(aVar);
        if (a2 == null) {
            str = a.mo10052c();
        } else {
            str = a2 + '/' + a.mo10052c();
        }
        return new StackTraceElement(str, a.mo10055m(), a.mo10053f(), i);
    }
}
