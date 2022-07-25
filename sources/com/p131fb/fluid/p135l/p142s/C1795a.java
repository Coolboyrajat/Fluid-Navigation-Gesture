package com.p131fb.fluid.p135l.p142s;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.C0311a;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.s.a */
public final class C1795a {

    /* renamed from: a */
    public static final C1796a f5111a = new C1796a((C3366g) null);

    /* renamed from: com.fb.fluid.l.s.a$a */
    public static final class C1796a {
        private C1796a() {
        }

        public /* synthetic */ C1796a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo6584a(Context context) {
            C3370k.m12227b(context, "context");
            return Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
        }

        /* renamed from: b */
        public final boolean mo6585b(Context context) {
            C3370k.m12227b(context, "context");
            return C0311a.m1529a(context, "android.permission.CALL_PHONE") == 0;
        }

        /* renamed from: c */
        public final boolean mo6586c(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return context.checkCallingOrSelfPermission("android.permission.WRITE_SECURE_SETTINGS") == 0;
            } catch (Exception e) {
                C1776l.m7478a("isWriteSecureSettingsGranted.e: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }
    }
}
