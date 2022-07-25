package p006b.p026g.p034j;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b.g.j.c */
public class C0832c {
    /* renamed from: a */
    public static int m4524a(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.hash(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m4525a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
