package p054c.p055a.p056a.p060q.p061m;

import android.graphics.Color;
import java.util.Arrays;
import kotlin.p205x.p207d.C3357a0;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.a.q.m.a */
public final class C1081a {
    /* renamed from: a */
    public static final Integer m5457a(String str) {
        C3370k.m12227b(str, "$this$toColor");
        try {
            return Integer.valueOf(Color.parseColor('#' + str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m5458a(int i, boolean z) {
        if (i == 0) {
            return z ? "00000000" : "000000";
        }
        if (z) {
            String hexString = Integer.toHexString(i);
            C3370k.m12223a((Object) hexString, "Integer.toHexString(this)");
            if (hexString.length() != 6) {
                return hexString;
            }
            return "00" + hexString;
        }
        C3357a0 a0Var = C3357a0.f8027a;
        Object[] objArr = {Integer.valueOf(i & 16777215)};
        String format = String.format("%06X", Arrays.copyOf(objArr, objArr.length));
        C3370k.m12223a((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }
}
