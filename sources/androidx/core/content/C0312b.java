package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0288d;

/* renamed from: androidx.core.content.b */
public final class C0312b {
    /* renamed from: a */
    public static int m1535a(Context context, String str) {
        return m1536a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m1536a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0288d.m1443a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0288d.m1442a(context, a, str2) != 0 ? -2 : 0;
    }
}
