package com.p131fb.fluid.p135l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.l.l */
public final class C1755l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List<Integer> f5076a = C3284j.m12074d(-1, 14, 15, 1, 2, 3, 27, 28, 4, 7, 5, 6, 21, 11, 26, 29, 9, 12, 16, 23, 8, 25, 19, 20, 24, 13, 18, 17, 22);

    /* renamed from: b */
    public static final C1756a f5077b = new C1756a((C3366g) null);

    /* renamed from: com.fb.fluid.l.l$a */
    public static final class C1756a {
        private C1756a() {
        }

        public /* synthetic */ C1756a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo6523a(Context context) {
            PackageInfo packageInfo;
            C3370k.m12227b(context, "context");
            Integer num = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Exception unused) {
                packageInfo = null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("----");
                sb.append("\nVersion: ");
                sb.append(packageInfo != null ? packageInfo.versionName : null);
                sb.append(" (");
                if (packageInfo != null) {
                    num = Integer.valueOf(packageInfo.versionCode);
                }
                sb.append(num);
                sb.append(')');
                sb.append("\nManufacturer: ");
                sb.append(Build.MANUFACTURER);
                sb.append("\nModel: ");
                sb.append(Build.MODEL);
                sb.append("\nAndroid: ");
                sb.append(Build.VERSION.SDK_INT);
                sb.append("\n----");
                return sb.toString();
            } catch (Exception unused2) {
                return BuildConfig.FLAVOR;
            }
        }

        /* renamed from: a */
        public final List<Integer> mo6524a() {
            return C1755l.f5076a;
        }
    }
}
