package com.p131fb.fluid.p135l.p140q;

import android.content.Context;
import android.provider.Settings;
import com.p131fb.fluid.MainAccessibilityService;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.q.b */
public final class C1785b {

    /* renamed from: a */
    public static final C1786a f5090a = new C1786a((C3366g) null);

    /* renamed from: com.fb.fluid.l.q.b$a */
    public static final class C1786a {
        private C1786a() {
        }

        public /* synthetic */ C1786a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ void m7501a(C1786a aVar, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "immersive.navigation=*";
            }
            aVar.mo6549a(context, str);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m7502a(C1786a aVar, Context context, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = MainAccessibilityService.class.getName();
                C3370k.m12223a((Object) str, "MainAccessibilityService::class.java.name");
            }
            if ((i & 4) != 0) {
                str2 = MainAccessibilityService.class.getSimpleName();
                C3370k.m12223a((Object) str2, "MainAccessibilityService::class.java.simpleName");
            }
            return aVar.mo6552a(context, str, str2);
        }

        /* renamed from: a */
        public final void mo6549a(Context context, String str) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "policyValue");
            try {
                Settings.Global.putString(context.getContentResolver(), "policy_control", str);
            } catch (Exception e) {
                C1776l.m7478a("as.1 " + e.getMessage(), (String) null, 1, (Object) null);
            }
        }

        /* renamed from: a */
        public final boolean mo6550a(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation") == 1;
            } catch (Exception e) {
                C1776l.m7478a("sa.ar.e.2: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo6551a(Context context, int i) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.System.putInt(context.getContentResolver(), "user_rotation", i);
            } catch (Exception e) {
                C1776l.m7478a("sa.ur.e: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo6552a(Context context, String str, String str2) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "serviceName");
            C3370k.m12227b(str2, "serviceNameSimple");
            try {
                String str3 = context.getPackageName() + '/' + str;
                String str4 = context.getPackageName() + "/." + str2;
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
                C3370k.m12223a((Object) string, "it");
                return C3251o.m11953a((CharSequence) string, (CharSequence) str3, false, 2, (Object) null) || C3251o.m11953a((CharSequence) string, (CharSequence) str4, false, 2, (Object) null);
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo6553a(Context context, boolean z) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.System.putInt(context.getContentResolver(), "accelerometer_rotation", z ? 1 : 0);
            } catch (Exception e) {
                C1776l.m7478a("sa.ar.e: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo6554b(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.Secure.getInt(context.getContentResolver(), "navigation_mode") == 0;
            } catch (Exception e) {
                C1776l.m7478a("sa.navm.e: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: c */
        public final void mo6555c(Context context) {
            C3370k.m12227b(context, "context");
            mo6549a(context, "immersive.none=*");
        }
    }
}
