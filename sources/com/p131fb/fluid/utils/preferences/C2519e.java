package com.p131fb.fluid.utils.preferences;

import android.content.Context;
import kotlin.p205x.p207d.C3370k;
import p054c.p083e.p104c.C1271e;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.utils.preferences.e */
public final class C2519e extends C2518d {

    /* renamed from: com.fb.fluid.utils.preferences.e$a */
    public static final class C2520a {
        private C2520a() {
        }

        public /* synthetic */ C2520a(C3366g gVar) {
            this();
        }
    }

    static {
        new C2520a((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2519e(Context context) {
        super(context, (String) null, 2, (C3366g) null);
        C3370k.m12227b(context, "context");
    }

    /* renamed from: b */
    public final C2515a mo7465b() {
        String a = mo7459a("actions_bottom_1", BuildConfig.FLAVOR);
        if (a != null) {
            if (a.length() == 0) {
                return new C2515a(2, -1, false, (C2517c) null, (C2517c) null, 28, (C3366g) null);
            }
        }
        Object a2 = new C1271e().mo5634a(a, C2515a.class);
        C3370k.m12223a(a2, "Gson().fromJson(it, a::class.java)");
        return (C2515a) a2;
    }

    /* renamed from: c */
    public final C2515a mo7466c() {
        String a = mo7459a("actions_bottom_2", BuildConfig.FLAVOR);
        if (a != null) {
            if (a.length() == 0) {
                return new C2515a(1, 3, false, (C2517c) null, (C2517c) null, 28, (C3366g) null);
            }
        }
        Object a2 = new C1271e().mo5634a(a, C2515a.class);
        C3370k.m12223a(a2, "Gson().fromJson(it, a::class.java)");
        return (C2515a) a2;
    }

    /* renamed from: d */
    public final C2515a mo7467d() {
        String a = mo7459a("actions_bottom_3", BuildConfig.FLAVOR);
        if (a != null) {
            if (a.length() == 0) {
                return new C2515a(5, -1, false, (C2517c) null, (C2517c) null, 28, (C3366g) null);
            }
        }
        Object a2 = new C1271e().mo5634a(a, C2515a.class);
        C3370k.m12223a(a2, "Gson().fromJson(it, a::class.java)");
        return (C2515a) a2;
    }

    /* renamed from: e */
    public final C2515a mo7468e() {
        String a = mo7459a("actions_bottom_4", BuildConfig.FLAVOR);
        if (a != null) {
            if (a.length() == 0) {
                return new C2515a(-1, -1, false, (C2517c) null, (C2517c) null, 28, (C3366g) null);
            }
        }
        Object a2 = new C1271e().mo5634a(a, C2515a.class);
        C3370k.m12223a(a2, "Gson().fromJson(it, a::class.java)");
        return (C2515a) a2;
    }

    /* renamed from: f */
    public final C2515a mo7469f() {
        String a = mo7459a("actions_left", BuildConfig.FLAVOR);
        if (a != null) {
            if (a.length() == 0) {
                return new C2515a(2, 11, false, (C2517c) null, (C2517c) null, 28, (C3366g) null);
            }
        }
        Object a2 = new C1271e().mo5634a(a, C2515a.class);
        C3370k.m12223a(a2, "Gson().fromJson(it, a::class.java)");
        return (C2515a) a2;
    }

    /* renamed from: g */
    public final C2515a mo7470g() {
        String a = mo7459a("actions_right", BuildConfig.FLAVOR);
        if (a != null) {
            if (a.length() == 0) {
                return new C2515a(2, 11, false, (C2517c) null, (C2517c) null, 28, (C3366g) null);
            }
        }
        Object a2 = new C1271e().mo5634a(a, C2515a.class);
        C3370k.m12223a(a2, "Gson().fromJson(it, a::class.java)");
        return (C2515a) a2;
    }

    /* renamed from: h */
    public final boolean mo7471h() {
        return mo7460a("hide_soft_keys", false);
    }

    /* renamed from: i */
    public final float mo7472i() {
        int a = mo7456a("scale_bottom", 1);
        if (a == 0) {
            return 0.7f;
        }
        if (a == 1) {
            return 0.85f;
        }
        if (a != 3) {
            return a != 4 ? 1.0f : 0.55f;
        }
        return 0.0f;
    }

    /* renamed from: j */
    public final float mo7473j() {
        int a = mo7456a("scale_sides", 0);
        if (a == 0) {
            return 0.7f;
        }
        if (a == 1) {
            return 0.85f;
        }
        if (a != 3) {
            return a != 4 ? 1.0f : 0.55f;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final int mo7474k() {
        return mo7456a("tiggers_location_left", 0);
    }

    /* renamed from: l */
    public final int mo7475l() {
        return mo7456a("tiggers_location_right", 0);
    }

    /* renamed from: m */
    public final int mo7476m() {
        return mo7456a("tiggers_sensitivity_bottom", mo7456a("tiggers_sensitivity", 2));
    }

    /* renamed from: n */
    public final int mo7477n() {
        return mo7456a("tiggers_sensitivity_left", mo7456a("tiggers_sensitivity_side", 2));
    }

    /* renamed from: o */
    public final int mo7478o() {
        return mo7456a("tiggers_sensitivity_right", mo7456a("tiggers_sensitivity_side", 2));
    }

    /* renamed from: p */
    public final int mo7479p() {
        return mo7456a("tiggers_size_left", mo7456a("tiggers_size_side", 2));
    }

    /* renamed from: q */
    public final int mo7480q() {
        return mo7456a("tiggers_size_right", mo7456a("tiggers_size_side", 2));
    }
}
