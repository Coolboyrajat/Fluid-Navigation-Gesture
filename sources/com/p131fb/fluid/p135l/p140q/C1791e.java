package com.p131fb.fluid.p135l.p140q;

import android.content.Context;
import android.provider.Settings;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.q.e */
public final class C1791e {

    /* renamed from: a */
    public static final C1792a f5093a = new C1792a((C3366g) null);

    /* renamed from: com.fb.fluid.l.q.e$a */
    public static final class C1792a {
        private C1792a() {
        }

        public /* synthetic */ C1792a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo6561a(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.Global.getInt(context.getContentResolver(), "navigation_bar_gesture_disabled_by_policy", 0) == 1;
            } catch (Exception e) {
                C1776l.m7478a("s.sgm2: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo6562a(Context context, boolean z) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.Global.putInt(context.getContentResolver(), "navigationbar_hide_bar_enabled", z ? 1 : 0);
            } catch (Exception e) {
                C1776l.m7478a("s.snhm.e: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo6563b(Context context) {
            C3370k.m12227b(context, "context");
            try {
                Settings.Global.putInt(context.getContentResolver(), "navigation_bar_gesture_hint", 0);
                Settings.Global.putInt(context.getContentResolver(), "navigation_bar_gesture_disabled_by_policy", 1);
                return Settings.Global.putInt(context.getContentResolver(), "navigation_bar_gesture_while_hidden", 1);
            } catch (Exception e) {
                C1776l.m7478a("s.sgm: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: c */
        public final boolean mo6564c(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.Global.putInt(context.getContentResolver(), "navigation_bar_gesture_while_hidden", 0);
            } catch (Exception e) {
                C1776l.m7478a("s.sgm2: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: d */
        public final boolean mo6565d(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.Global.putInt(context.getContentResolver(), "navigation_bar_gesture_disabled_by_policy", 0);
            } catch (Exception e) {
                C1776l.m7478a("s.sgm1: " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }
    }
}
