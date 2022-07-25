package com.p131fb.fluid.utils.preferences;

import android.content.Context;
import com.p131fb.fluid.p135l.C1734c;
import com.p131fb.fluid.p135l.p140q.C1783a;
import java.util.List;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.utils.preferences.h */
public final class C2527h extends C2518d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final List<String> f6400d = C3284j.m12070b((T[]) new String[]{"show_ui", "day_timestamp", "fluid_version_2", "debug_window", "fluid_error_time"});

    /* renamed from: e */
    public static final C2528a f6401e = new C2528a((C3366g) null);

    /* renamed from: b */
    private final C2519e f6402b = new C2519e(this.f6403c);

    /* renamed from: c */
    private final Context f6403c;

    /* renamed from: com.fb.fluid.utils.preferences.h$a */
    public static final class C2528a {
        private C2528a() {
        }

        public /* synthetic */ C2528a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final List<String> mo7559a() {
            return C2527h.f6400d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2527h(Context context) {
        super(context, (String) null, 2, (C3366g) null);
        C3370k.m12227b(context, "context");
        this.f6403c = context;
    }

    /* renamed from: A */
    public final int mo7488A() {
        return mo7456a("scale_hoz", (int) (this.f6402b.mo7473j() * ((float) 100)));
    }

    /* renamed from: B */
    public final int mo7489B() {
        return mo7456a("scale_vert", (int) (this.f6402b.mo7472i() * ((float) 100)));
    }

    /* renamed from: C */
    public final boolean mo7490C() {
        return mo7460a("show_all_pkgs", false);
    }

    /* renamed from: D */
    public final long mo7491D() {
        return mo7457a("show_ui", 0);
    }

    /* renamed from: E */
    public final boolean mo7492E() {
        return mo7460a("keyboard_softkeys_mode", false);
    }

    /* renamed from: F */
    public final boolean mo7493F() {
        return mo7460a("show_outline", true);
    }

    /* renamed from: G */
    public final int mo7494G() {
        return mo7456a("sound_feedback_level", 4);
    }

    /* renamed from: H */
    public final boolean mo7495H() {
        return mo7460a("system_haptic_feedback", true);
    }

    /* renamed from: I */
    public final int mo7496I() {
        return mo7456a("theme_mode", C1734c.f5038h.mo6477f() ? -1 : 1);
    }

    /* renamed from: J */
    public final long mo7497J() {
        return mo7457a("day_timestamp", 0);
    }

    /* renamed from: K */
    public final boolean mo7498K() {
        return mo7460a("fluid_enabled", false);
    }

    /* renamed from: L */
    public final boolean mo7499L() {
        return mo7460a("theme_mode_dark_black", false);
    }

    /* renamed from: a */
    public final void mo7500a(int i) {
        mo7461b("anim_sides", i);
    }

    /* renamed from: a */
    public final void mo7501a(long j) {
        mo7462b("fluid_version_2", j);
    }

    /* renamed from: a */
    public final void mo7502a(List<String> list) {
        C3370k.m12227b(list, "value");
        mo7463b("pause_selected_apps", C3292r.m12086a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3350b) null, 62, (Object) null));
    }

    /* renamed from: a */
    public final void mo7503a(boolean z) {
        mo7464b("swipe_exit_immersive", z);
    }

    /* renamed from: b */
    public final int mo7504b() {
        return mo7456a("anim_sides", 2);
    }

    /* renamed from: b */
    public final void mo7505b(int i) {
        mo7461b("anim_bottom", i);
    }

    /* renamed from: b */
    public final void mo7506b(long j) {
        mo7462b("debug_window", j);
    }

    /* renamed from: b */
    public final void mo7507b(boolean z) {
        mo7464b("dev_enabled", z);
    }

    /* renamed from: c */
    public final int mo7508c() {
        return mo7456a("anim_bottom", 1);
    }

    /* renamed from: c */
    public final void mo7509c(int i) {
        mo7461b("accent_color", i);
    }

    /* renamed from: c */
    public final void mo7510c(long j) {
        mo7462b("fluid_error_time", j);
    }

    /* renamed from: c */
    public final void mo7511c(boolean z) {
        mo7464b("debug_triggers", z);
    }

    /* renamed from: d */
    public final long mo7512d() {
        return mo7457a("fluid_version_2", -1);
    }

    /* renamed from: d */
    public final void mo7513d(int i) {
        mo7461b("primary_color", i);
    }

    /* renamed from: d */
    public final void mo7514d(long j) {
        mo7462b("show_ui", j);
    }

    /* renamed from: d */
    public final void mo7515d(boolean z) {
        mo7464b("fluid_enabled", z);
    }

    /* renamed from: e */
    public final int mo7516e() {
        return mo7456a("accent_color", -1);
    }

    /* renamed from: e */
    public final void mo7517e(int i) {
        mo7461b("haptic_feedback_level", i);
    }

    /* renamed from: e */
    public final void mo7518e(long j) {
        mo7462b("day_timestamp", j);
    }

    /* renamed from: e */
    public final void mo7519e(boolean z) {
        mo7464b("ignore_policy_control", z);
    }

    /* renamed from: f */
    public final int mo7520f() {
        return mo7456a("primary_color", -16777216);
    }

    /* renamed from: f */
    public final void mo7521f(int i) {
        mo7461b("hide_navbar_mode", i);
    }

    /* renamed from: f */
    public final void mo7522f(boolean z) {
        mo7464b("side_triggers_away_from_keyboard", z);
    }

    /* renamed from: g */
    public final void mo7523g(int i) {
        mo7461b("hide_navbar_mode_restore", i);
    }

    /* renamed from: g */
    public final void mo7524g(boolean z) {
        mo7464b("pause_immersive_landscape", z);
    }

    /* renamed from: g */
    public final boolean mo7525g() {
        return mo7460a("swipe_exit_immersive", false);
    }

    /* renamed from: h */
    public final Context mo7526h() {
        return this.f6403c;
    }

    /* renamed from: h */
    public final void mo7527h(int i) {
        mo7461b("navbar_rotation_mode", i);
    }

    /* renamed from: h */
    public final void mo7528h(boolean z) {
        mo7464b("pause_in_installer", z);
    }

    /* renamed from: i */
    public final void mo7529i(int i) {
        mo7461b("scale_hoz", i);
    }

    /* renamed from: i */
    public final void mo7530i(boolean z) {
        mo7464b("pause_in_permissions", z);
    }

    /* renamed from: i */
    public final boolean mo7531i() {
        return mo7460a("dev_enabled", false);
    }

    /* renamed from: j */
    public final void mo7532j(int i) {
        mo7461b("scale_vert", i);
    }

    /* renamed from: j */
    public final void mo7533j(boolean z) {
        mo7464b("keyguard_softkeys_mode", z);
    }

    /* renamed from: j */
    public final boolean mo7534j() {
        return mo7460a("debug_triggers", false);
    }

    /* renamed from: k */
    public final long mo7535k() {
        return mo7457a("debug_window", -1);
    }

    /* renamed from: k */
    public final void mo7536k(int i) {
        mo7461b("sound_feedback_level", i);
    }

    /* renamed from: k */
    public final void mo7537k(boolean z) {
        mo7464b("rotate_actions", z);
    }

    /* renamed from: l */
    public final long mo7538l() {
        return mo7457a("fluid_error_time", 0);
    }

    /* renamed from: l */
    public final void mo7539l(int i) {
        mo7461b("theme_mode", i);
    }

    /* renamed from: l */
    public final void mo7540l(boolean z) {
        mo7464b("show_all_pkgs", z);
    }

    /* renamed from: m */
    public final int mo7541m() {
        return mo7456a("haptic_feedback_level", 2);
    }

    /* renamed from: m */
    public final void mo7542m(boolean z) {
        mo7464b("keyboard_softkeys_mode", z);
    }

    /* renamed from: n */
    public final int mo7543n() {
        return mo7456a("hide_navbar_mode", this.f6402b.mo7471h() ? (!C1783a.f5089a.mo6545h() || !C1734c.f5038h.mo6477f()) ? 1 : 2 : 0);
    }

    /* renamed from: n */
    public final void mo7544n(boolean z) {
        mo7464b("show_outline", z);
    }

    /* renamed from: o */
    public final int mo7545o() {
        return mo7456a("hide_navbar_mode_restore", -1);
    }

    /* renamed from: o */
    public final void mo7546o(boolean z) {
        mo7464b("system_haptic_feedback", z);
    }

    /* renamed from: p */
    public final void mo7547p(boolean z) {
        mo7464b("theme_mode_dark_black", z);
    }

    /* renamed from: p */
    public final boolean mo7548p() {
        return mo7460a("ignore_policy_control", false);
    }

    /* renamed from: q */
    public final boolean mo7549q() {
        boolean a = mo7460a("intro_seen", false);
        if (!a) {
            mo7464b("intro_seen", true);
        }
        return a;
    }

    /* renamed from: r */
    public final boolean mo7550r() {
        return mo7460a("side_triggers_away_from_keyboard", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = kotlin.p194d0.C3251o.m11947a((java.lang.CharSequence) r2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo7551s() {
        /*
            r8 = this;
            java.lang.String r0 = "navbar_line_apps"
            java.lang.String r1 = ""
            java.lang.String r2 = r8.mo7459a((java.lang.String) r0, (java.lang.String) r1)
            if (r2 == 0) goto L_0x001b
            java.lang.String r0 = ","
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.util.List r0 = kotlin.p194d0.C3251o.m11947a((java.lang.CharSequence) r2, (java.lang.String[]) r3, (boolean) r4, (int) r5, (int) r6, (java.lang.Object) r7)
            if (r0 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            java.util.List r0 = kotlin.p195s.C3284j.m12068a()
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.utils.preferences.C2527h.mo7551s():java.util.List");
    }

    /* renamed from: t */
    public final int mo7552t() {
        int a = mo7456a("navbar_rotation_mode", -1);
        if (a != -1) {
            return a;
        }
        if (this.f6403c.getResources().getBoolean(C3148R.bool.is_tablet)) {
            return 2;
        }
        return C1734c.f5038h.mo6475d() ? 1 : 0;
    }

    /* renamed from: u */
    public final boolean mo7553u() {
        return mo7460a("pause_immersive_landscape", false);
    }

    /* renamed from: v */
    public final boolean mo7554v() {
        return mo7460a("pause_in_installer", true);
    }

    /* renamed from: w */
    public final boolean mo7555w() {
        return mo7460a("pause_in_permissions", true);
    }

    /* renamed from: x */
    public final boolean mo7556x() {
        return mo7460a("keyguard_softkeys_mode", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r0 = kotlin.p194d0.C3251o.m11947a((java.lang.CharSequence) r2, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo7557y() {
        /*
            r12 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            com.fb.fluid.l.r.a$a r1 = com.p131fb.fluid.p135l.p141r.C1793a.f5110q
            java.lang.String r1 = r1.mo6579l()
            r2 = 0
            r0[r2] = r1
            com.fb.fluid.l.r.a$a r1 = com.p131fb.fluid.p135l.p141r.C1793a.f5110q
            java.lang.String r1 = r1.mo6570c()
            r2 = 1
            r0[r2] = r1
            java.util.List r3 = kotlin.p195s.C3284j.m12070b((T[]) r0)
            java.lang.String r4 = ","
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            java.lang.String r0 = kotlin.p195s.C3292r.m12086a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r1 = "pause_selected_apps"
            java.lang.String r2 = r12.mo7459a((java.lang.String) r1, (java.lang.String) r0)
            if (r2 == 0) goto L_0x0040
            java.lang.String r0 = ","
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.util.List r0 = kotlin.p194d0.C3251o.m11947a((java.lang.CharSequence) r2, (java.lang.String[]) r3, (boolean) r4, (int) r5, (int) r6, (java.lang.Object) r7)
            if (r0 == 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            java.util.List r0 = kotlin.p195s.C3284j.m12068a()
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.utils.preferences.C2527h.mo7557y():java.util.List");
    }

    /* renamed from: z */
    public final boolean mo7558z() {
        return mo7460a("rotate_actions", false);
    }
}
