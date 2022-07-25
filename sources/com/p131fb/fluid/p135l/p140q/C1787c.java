package com.p131fb.fluid.p135l.p140q;

import android.content.Context;
import android.provider.Settings;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.q.c */
public final class C1787c {

    /* renamed from: a */
    public static final C1788a f5091a = new C1788a((C3366g) null);

    /* renamed from: com.fb.fluid.l.q.c$a */
    public static final class C1788a {
        private C1788a() {
        }

        public /* synthetic */ C1788a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo6556a(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return C3370k.m12225a((Object) Settings.Secure.getString(context.getContentResolver(), "secure_gesture_navigation"), (Object) "1");
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo6557a(Context context, String str) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "mode");
            try {
                return Settings.Secure.putString(context.getContentResolver(), "secure_gesture_navigation", str);
            } catch (Exception e) {
                C1776l.m7478a("3 " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }

        /* renamed from: b */
        public final boolean mo6558b(Context context, String str) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "mode");
            try {
                return Settings.Global.putString(context.getContentResolver(), "navigationbar_is_min", str);
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: c */
        public final boolean mo6559c(Context context, String str) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(str, "mode");
            try {
                return Settings.Global.putString(context.getContentResolver(), "single_hand_mode", str);
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
