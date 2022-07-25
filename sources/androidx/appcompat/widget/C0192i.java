package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0185h0;
import p006b.p007a.C0654a;
import p006b.p007a.C0656c;
import p006b.p007a.C0658e;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p027d.C0780a;

/* renamed from: androidx.appcompat.widget.i */
public final class C0192i {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f968b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0192i f969c;

    /* renamed from: a */
    private C0185h0 f970a;

    /* renamed from: androidx.appcompat.widget.i$a */
    static class C0193a implements C0185h0.C0190e {

        /* renamed from: a */
        private final int[] f971a = {C0658e.abc_textfield_search_default_mtrl_alpha, C0658e.abc_textfield_default_mtrl_alpha, C0658e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f972b = {C0658e.abc_ic_commit_search_api_mtrl_alpha, C0658e.abc_seekbar_tick_mark_material, C0658e.abc_ic_menu_share_mtrl_alpha, C0658e.abc_ic_menu_copy_mtrl_am_alpha, C0658e.abc_ic_menu_cut_mtrl_alpha, C0658e.abc_ic_menu_selectall_mtrl_alpha, C0658e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f973c = {C0658e.abc_textfield_activated_mtrl_alpha, C0658e.abc_textfield_search_activated_mtrl_alpha, C0658e.abc_cab_background_top_mtrl_alpha, C0658e.abc_text_cursor_material, C0658e.abc_text_select_handle_left_mtrl_dark, C0658e.abc_text_select_handle_middle_mtrl_dark, C0658e.abc_text_select_handle_right_mtrl_dark, C0658e.abc_text_select_handle_left_mtrl_light, C0658e.abc_text_select_handle_middle_mtrl_light, C0658e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f974d = {C0658e.abc_popup_background_mtrl_mult, C0658e.abc_cab_background_internal_bg, C0658e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f975e = {C0658e.abc_tab_indicator_material, C0658e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f976f = {C0658e.abc_btn_check_material, C0658e.abc_btn_radio_material, C0658e.abc_btn_check_material_anim, C0658e.abc_btn_radio_material_anim};

        C0193a() {
        }

        /* renamed from: a */
        private ColorStateList m969a(Context context) {
            return m973b(context, 0);
        }

        /* renamed from: a */
        private void m970a(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0249z.m1266a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0192i.f968b;
            }
            drawable.setColorFilter(C0192i.m961a(i, mode));
        }

        /* renamed from: a */
        private boolean m971a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private ColorStateList m972b(Context context) {
            return m973b(context, C0207m0.m1034b(context, C0654a.colorAccent));
        }

        /* renamed from: b */
        private ColorStateList m973b(Context context, int i) {
            int b = C0207m0.m1034b(context, C0654a.colorControlHighlight);
            int a = C0207m0.m1031a(context, C0654a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0207m0.f1034b, C0207m0.f1036d, C0207m0.f1035c, C0207m0.f1038f}, new int[]{a, C0780a.m4353b(b, i), C0780a.m4353b(b, i), i});
        }

        /* renamed from: c */
        private ColorStateList m974c(Context context) {
            return m973b(context, C0207m0.m1034b(context, C0654a.colorButtonNormal));
        }

        /* renamed from: d */
        private ColorStateList m975d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c = C0207m0.m1035c(context, C0654a.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = C0207m0.f1034b;
                iArr2[0] = C0207m0.m1031a(context, C0654a.colorSwitchThumbNormal);
                iArr[1] = C0207m0.f1037e;
                iArr2[1] = C0207m0.m1034b(context, C0654a.colorControlActivated);
                iArr[2] = C0207m0.f1038f;
                iArr2[2] = C0207m0.m1034b(context, C0654a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0207m0.f1034b;
                iArr2[0] = c.getColorForState(iArr[0], 0);
                iArr[1] = C0207m0.f1037e;
                iArr2[1] = C0207m0.m1034b(context, C0654a.colorControlActivated);
                iArr[2] = C0207m0.f1038f;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: a */
        public ColorStateList mo1381a(Context context, int i) {
            if (i == C0658e.abc_edit_text_material) {
                return C0664a.m3681b(context, C0656c.abc_tint_edittext);
            }
            if (i == C0658e.abc_switch_track_mtrl_alpha) {
                return C0664a.m3681b(context, C0656c.abc_tint_switch_track);
            }
            if (i == C0658e.abc_switch_thumb_material) {
                return m975d(context);
            }
            if (i == C0658e.abc_btn_default_mtrl_shape) {
                return m974c(context);
            }
            if (i == C0658e.abc_btn_borderless_material) {
                return m969a(context);
            }
            if (i == C0658e.abc_btn_colored_material) {
                return m972b(context);
            }
            if (i == C0658e.abc_spinner_mtrl_am_alpha || i == C0658e.abc_spinner_textfield_background_material) {
                return C0664a.m3681b(context, C0656c.abc_tint_spinner);
            }
            if (m971a(this.f972b, i)) {
                return C0207m0.m1035c(context, C0654a.colorControlNormal);
            }
            if (m971a(this.f975e, i)) {
                return C0664a.m3681b(context, C0656c.abc_tint_default);
            }
            if (m971a(this.f976f, i)) {
                return C0664a.m3681b(context, C0656c.abc_tint_btn_checkable);
            }
            if (i == C0658e.abc_seekbar_thumb_material) {
                return C0664a.m3681b(context, C0656c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: a */
        public PorterDuff.Mode mo1382a(int i) {
            if (i == C0658e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: a */
        public Drawable mo1383a(C0185h0 h0Var, Context context, int i) {
            if (i != C0658e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{h0Var.mo1371a(context, C0658e.abc_cab_background_internal_bg), h0Var.mo1371a(context, C0658e.abc_cab_background_top_mtrl_alpha)});
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1384a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0192i.f968b
                int[] r1 = r6.f971a
                boolean r1 = r6.m971a((int[]) r1, (int) r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0018
                int r2 = p006b.p007a.C0654a.colorControlNormal
            L_0x0014:
                r1 = r0
                r8 = 1
                r0 = -1
                goto L_0x0049
            L_0x0018:
                int[] r1 = r6.f973c
                boolean r1 = r6.m971a((int[]) r1, (int) r8)
                if (r1 == 0) goto L_0x0023
                int r2 = p006b.p007a.C0654a.colorControlActivated
                goto L_0x0014
            L_0x0023:
                int[] r1 = r6.f974d
                boolean r1 = r6.m971a((int[]) r1, (int) r8)
                if (r1 == 0) goto L_0x002e
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002e:
                int r1 = p006b.p007a.C0658e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x0040
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = r0
                r0 = r8
                r8 = 1
                goto L_0x0049
            L_0x0040:
                int r1 = p006b.p007a.C0658e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0045
                goto L_0x0014
            L_0x0045:
                r1 = r0
                r8 = 0
                r0 = -1
                r2 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x0066
                boolean r8 = androidx.appcompat.widget.C0249z.m1266a(r9)
                if (r8 == 0) goto L_0x0055
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0055:
                int r7 = androidx.appcompat.widget.C0207m0.m1034b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0192i.m961a((int) r7, (android.graphics.PorterDuff.Mode) r1)
                r9.setColorFilter(r7)
                if (r0 == r3) goto L_0x0065
                r9.setAlpha(r0)
            L_0x0065:
                return r5
            L_0x0066:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0192i.C0193a.mo1384a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public boolean mo1385b(Context context, int i, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i2;
            if (i == C0658e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                m970a(layerDrawable.findDrawableByLayerId(16908288), C0207m0.m1034b(context, C0654a.colorControlNormal), C0192i.f968b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C0654a.colorControlNormal;
            } else if (i != C0658e.abc_ratingbar_material && i != C0658e.abc_ratingbar_indicator_material && i != C0658e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                m970a(layerDrawable.findDrawableByLayerId(16908288), C0207m0.m1031a(context, C0654a.colorControlNormal), C0192i.f968b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i2 = C0654a.colorControlActivated;
            }
            m970a(findDrawableByLayerId, C0207m0.m1034b(context, i2), C0192i.f968b);
            m970a(layerDrawable.findDrawableByLayerId(16908301), C0207m0.m1034b(context, C0654a.colorControlActivated), C0192i.f968b);
            return true;
        }
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m961a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0192i.class) {
            a = C0185h0.m925a(i, mode);
        }
        return a;
    }

    /* renamed from: a */
    static void m962a(Drawable drawable, C0213p0 p0Var, int[] iArr) {
        C0185h0.m931a(drawable, p0Var, iArr);
    }

    /* renamed from: b */
    public static synchronized C0192i m963b() {
        C0192i iVar;
        synchronized (C0192i.class) {
            if (f969c == null) {
                m964c();
            }
            iVar = f969c;
        }
        return iVar;
    }

    /* renamed from: c */
    public static synchronized void m964c() {
        synchronized (C0192i.class) {
            if (f969c == null) {
                f969c = new C0192i();
                f969c.f970a = C0185h0.m929a();
                f969c.f970a.mo1375a((C0185h0.C0190e) new C0193a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo1386a(Context context, int i) {
        return this.f970a.mo1371a(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo1387a(Context context, int i, boolean z) {
        return this.f970a.mo1372a(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo1388a(Context context) {
        this.f970a.mo1374a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo1389b(Context context, int i) {
        return this.f970a.mo1377b(context, i);
    }
}
