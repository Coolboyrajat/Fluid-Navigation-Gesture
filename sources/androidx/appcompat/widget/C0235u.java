package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.p002c.C0323f;
import androidx.core.widget.C0341b;
import java.lang.ref.WeakReference;
import p006b.p007a.C0663j;

/* renamed from: androidx.appcompat.widget.u */
class C0235u {

    /* renamed from: a */
    private final TextView f1119a;

    /* renamed from: b */
    private C0213p0 f1120b;

    /* renamed from: c */
    private C0213p0 f1121c;

    /* renamed from: d */
    private C0213p0 f1122d;

    /* renamed from: e */
    private C0213p0 f1123e;

    /* renamed from: f */
    private C0213p0 f1124f;

    /* renamed from: g */
    private C0213p0 f1125g;

    /* renamed from: h */
    private C0213p0 f1126h;

    /* renamed from: i */
    private final C0241v f1127i;

    /* renamed from: j */
    private int f1128j = 0;

    /* renamed from: k */
    private int f1129k = -1;

    /* renamed from: l */
    private Typeface f1130l;

    /* renamed from: m */
    private boolean f1131m;

    /* renamed from: androidx.appcompat.widget.u$a */
    private static class C0236a extends C0323f.C0324a {

        /* renamed from: a */
        private final WeakReference<C0235u> f1132a;

        /* renamed from: b */
        private final int f1133b;

        /* renamed from: c */
        private final int f1134c;

        /* renamed from: androidx.appcompat.widget.u$a$a */
        private class C0237a implements Runnable {

            /* renamed from: f */
            private final WeakReference<C0235u> f1135f;

            /* renamed from: g */
            private final Typeface f1136g;

            C0237a(C0236a aVar, WeakReference<C0235u> weakReference, Typeface typeface) {
                this.f1135f = weakReference;
                this.f1136g = typeface;
            }

            public void run() {
                C0235u uVar = (C0235u) this.f1135f.get();
                if (uVar != null) {
                    uVar.mo1655a(this.f1136g);
                }
            }
        }

        C0236a(C0235u uVar, int i, int i2) {
            this.f1132a = new WeakReference<>(uVar);
            this.f1133b = i;
            this.f1134c = i2;
        }

        /* renamed from: a */
        public void mo1671a(int i) {
        }

        /* renamed from: a */
        public void mo1672a(Typeface typeface) {
            int i;
            C0235u uVar = (C0235u) this.f1132a.get();
            if (uVar != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.f1133b) != -1) {
                    typeface = Typeface.create(typeface, i, (this.f1134c & 2) != 0);
                }
                uVar.mo1657a((Runnable) new C0237a(this, this.f1132a, typeface));
            }
        }
    }

    C0235u(TextView textView) {
        this.f1119a = textView;
        this.f1127i = new C0241v(this.f1119a);
    }

    /* renamed from: a */
    private static C0213p0 m1152a(Context context, C0192i iVar, int i) {
        ColorStateList b = iVar.mo1389b(context, i);
        if (b == null) {
            return null;
        }
        C0213p0 p0Var = new C0213p0();
        p0Var.f1055d = true;
        p0Var.f1052a = b;
        return p0Var;
    }

    /* renamed from: a */
    private void m1153a(Context context, C0217r0 r0Var) {
        String d;
        Typeface typeface;
        Typeface typeface2;
        this.f1128j = r0Var.mo1538d(C0663j.TextAppearance_android_textStyle, this.f1128j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1129k = r0Var.mo1538d(C0663j.TextAppearance_android_textFontWeight, -1);
            if (this.f1129k != -1) {
                this.f1128j = (this.f1128j & 2) | 0;
            }
        }
        if (r0Var.mo1545g(C0663j.TextAppearance_android_fontFamily) || r0Var.mo1545g(C0663j.TextAppearance_fontFamily)) {
            this.f1130l = null;
            int i = r0Var.mo1545g(C0663j.TextAppearance_fontFamily) ? C0663j.TextAppearance_fontFamily : C0663j.TextAppearance_android_fontFamily;
            int i2 = this.f1129k;
            int i3 = this.f1128j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = r0Var.mo1530a(i, this.f1128j, (C0323f.C0324a) new C0236a(this, i2, i3));
                    if (a != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.f1129k != -1) {
                            a = Typeface.create(Typeface.create(a, 0), this.f1129k, (this.f1128j & 2) != 0);
                        }
                        this.f1130l = a;
                    }
                    this.f1131m = this.f1130l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1130l == null && (d = r0Var.mo1539d(i)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1129k == -1) {
                    typeface = Typeface.create(d, this.f1128j);
                } else {
                    Typeface create = Typeface.create(d, 0);
                    int i4 = this.f1129k;
                    if ((this.f1128j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i4, z);
                }
                this.f1130l = typeface;
            }
        } else if (r0Var.mo1545g(C0663j.TextAppearance_android_typeface)) {
            this.f1131m = false;
            int d2 = r0Var.mo1538d(C0663j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (d2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1130l = typeface2;
        }
    }

    /* renamed from: a */
    private void m1154a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1119a.getCompoundDrawablesRelative();
            TextView textView = this.f1119a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1119a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1119a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1119a.getCompoundDrawables();
            TextView textView3 = this.f1119a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: a */
    private void m1155a(Drawable drawable, C0213p0 p0Var) {
        if (drawable != null && p0Var != null) {
            C0192i.m962a(drawable, p0Var, this.f1119a.getDrawableState());
        }
    }

    /* renamed from: b */
    private void m1156b(int i, float f) {
        this.f1127i.mo1685a(i, f);
    }

    /* renamed from: l */
    private void m1157l() {
        C0213p0 p0Var = this.f1126h;
        this.f1120b = p0Var;
        this.f1121c = p0Var;
        this.f1122d = p0Var;
        this.f1123e = p0Var;
        this.f1124f = p0Var;
        this.f1125g = p0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1648a() {
        if (!(this.f1120b == null && this.f1121c == null && this.f1122d == null && this.f1123e == null)) {
            Drawable[] compoundDrawables = this.f1119a.getCompoundDrawables();
            m1155a(compoundDrawables[0], this.f1120b);
            m1155a(compoundDrawables[1], this.f1121c);
            m1155a(compoundDrawables[2], this.f1122d);
            m1155a(compoundDrawables[3], this.f1123e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1124f != null || this.f1125g != null) {
            Drawable[] compoundDrawablesRelative = this.f1119a.getCompoundDrawablesRelative();
            m1155a(compoundDrawablesRelative[0], this.f1124f);
            m1155a(compoundDrawablesRelative[2], this.f1125g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1649a(int i) {
        this.f1127i.mo1690b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1650a(int i, float f) {
        if (!C0341b.f1646a && !mo1669j()) {
            m1156b(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1651a(int i, int i2, int i3, int i4) {
        this.f1127i.mo1686a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1652a(Context context, int i) {
        String d;
        ColorStateList a;
        C0217r0 a2 = C0217r0.m1052a(context, i, C0663j.TextAppearance);
        if (a2.mo1545g(C0663j.TextAppearance_textAllCaps)) {
            mo1658a(a2.mo1532a(C0663j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a2.mo1545g(C0663j.TextAppearance_android_textColor) && (a = a2.mo1529a(C0663j.TextAppearance_android_textColor)) != null) {
            this.f1119a.setTextColor(a);
        }
        if (a2.mo1545g(C0663j.TextAppearance_android_textSize) && a2.mo1536c(C0663j.TextAppearance_android_textSize, -1) == 0) {
            this.f1119a.setTextSize(0, 0.0f);
        }
        m1153a(context, a2);
        if (Build.VERSION.SDK_INT >= 26 && a2.mo1545g(C0663j.TextAppearance_fontVariationSettings) && (d = a2.mo1539d(C0663j.TextAppearance_fontVariationSettings)) != null) {
            this.f1119a.setFontVariationSettings(d);
        }
        a2.mo1531a();
        Typeface typeface = this.f1130l;
        if (typeface != null) {
            this.f1119a.setTypeface(typeface, this.f1128j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1653a(ColorStateList colorStateList) {
        if (this.f1126h == null) {
            this.f1126h = new C0213p0();
        }
        C0213p0 p0Var = this.f1126h;
        p0Var.f1052a = colorStateList;
        p0Var.f1055d = colorStateList != null;
        m1157l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1654a(PorterDuff.Mode mode) {
        if (this.f1126h == null) {
            this.f1126h = new C0213p0();
        }
        C0213p0 p0Var = this.f1126h;
        p0Var.f1053b = mode;
        p0Var.f1054c = mode != null;
        m1157l();
    }

    /* renamed from: a */
    public void mo1655a(Typeface typeface) {
        if (this.f1131m) {
            this.f1119a.setTypeface(typeface);
            this.f1130l = typeface;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012b  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1656a(android.util.AttributeSet r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            android.widget.TextView r2 = r7.f1119a
            android.content.Context r2 = r2.getContext()
            androidx.appcompat.widget.i r3 = androidx.appcompat.widget.C0192i.m963b()
            int[] r4 = p006b.p007a.C0663j.AppCompatTextHelper
            r5 = 0
            androidx.appcompat.widget.r0 r4 = androidx.appcompat.widget.C0217r0.m1054a(r2, r0, r4, r1, r5)
            int r6 = p006b.p007a.C0663j.AppCompatTextHelper_android_textAppearance
            r8 = -1
            int r6 = r4.mo1544g(r6, r8)
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableLeft
            boolean r9 = r4.mo1545g(r9)
            if (r9 == 0) goto L_0x0032
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableLeft
            int r9 = r4.mo1544g(r9, r5)
            androidx.appcompat.widget.p0 r9 = m1152a(r2, r3, r9)
            r7.f1120b = r9
        L_0x0032:
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableTop
            boolean r9 = r4.mo1545g(r9)
            if (r9 == 0) goto L_0x0046
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableTop
            int r9 = r4.mo1544g(r9, r5)
            androidx.appcompat.widget.p0 r9 = m1152a(r2, r3, r9)
            r7.f1121c = r9
        L_0x0046:
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableRight
            boolean r9 = r4.mo1545g(r9)
            if (r9 == 0) goto L_0x005a
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableRight
            int r9 = r4.mo1544g(r9, r5)
            androidx.appcompat.widget.p0 r9 = m1152a(r2, r3, r9)
            r7.f1122d = r9
        L_0x005a:
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableBottom
            boolean r9 = r4.mo1545g(r9)
            if (r9 == 0) goto L_0x006e
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableBottom
            int r9 = r4.mo1544g(r9, r5)
            androidx.appcompat.widget.p0 r9 = m1152a(r2, r3, r9)
            r7.f1123e = r9
        L_0x006e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x009c
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableStart
            boolean r9 = r4.mo1545g(r9)
            if (r9 == 0) goto L_0x0088
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableStart
            int r9 = r4.mo1544g(r9, r5)
            androidx.appcompat.widget.p0 r9 = m1152a(r2, r3, r9)
            r7.f1124f = r9
        L_0x0088:
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableEnd
            boolean r9 = r4.mo1545g(r9)
            if (r9 == 0) goto L_0x009c
            int r9 = p006b.p007a.C0663j.AppCompatTextHelper_android_drawableEnd
            int r9 = r4.mo1544g(r9, r5)
            androidx.appcompat.widget.p0 r9 = m1152a(r2, r3, r9)
            r7.f1125g = r9
        L_0x009c:
            r4.mo1531a()
            android.widget.TextView r4 = r7.f1119a
            android.text.method.TransformationMethod r4 = r4.getTransformationMethod()
            boolean r4 = r4 instanceof android.text.method.PasswordTransformationMethod
            r9 = 26
            r11 = 23
            if (r6 == r8) goto L_0x0130
            int[] r13 = p006b.p007a.C0663j.TextAppearance
            androidx.appcompat.widget.r0 r6 = androidx.appcompat.widget.C0217r0.m1052a((android.content.Context) r2, (int) r6, (int[]) r13)
            if (r4 != 0) goto L_0x00c6
            int r13 = p006b.p007a.C0663j.TextAppearance_textAllCaps
            boolean r13 = r6.mo1545g(r13)
            if (r13 == 0) goto L_0x00c6
            int r13 = p006b.p007a.C0663j.TextAppearance_textAllCaps
            boolean r13 = r6.mo1532a((int) r13, (boolean) r5)
            r14 = r13
            r13 = 1
            goto L_0x00c8
        L_0x00c6:
            r13 = 0
            r14 = 0
        L_0x00c8:
            r7.m1153a((android.content.Context) r2, (androidx.appcompat.widget.C0217r0) r6)
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r11) goto L_0x0105
            int r15 = p006b.p007a.C0663j.TextAppearance_android_textColor
            boolean r15 = r6.mo1545g(r15)
            if (r15 == 0) goto L_0x00de
            int r15 = p006b.p007a.C0663j.TextAppearance_android_textColor
            android.content.res.ColorStateList r15 = r6.mo1529a(r15)
            goto L_0x00df
        L_0x00de:
            r15 = 0
        L_0x00df:
            int r10 = p006b.p007a.C0663j.TextAppearance_android_textColorHint
            boolean r10 = r6.mo1545g(r10)
            if (r10 == 0) goto L_0x00ee
            int r10 = p006b.p007a.C0663j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo1529a(r10)
            goto L_0x00ef
        L_0x00ee:
            r10 = 0
        L_0x00ef:
            int r12 = p006b.p007a.C0663j.TextAppearance_android_textColorLink
            boolean r12 = r6.mo1545g(r12)
            if (r12 == 0) goto L_0x0103
            int r12 = p006b.p007a.C0663j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r12 = r6.mo1529a(r12)
            r17 = r15
            r15 = r12
            r12 = r17
            goto L_0x0108
        L_0x0103:
            r12 = r15
            goto L_0x0107
        L_0x0105:
            r10 = 0
            r12 = 0
        L_0x0107:
            r15 = 0
        L_0x0108:
            int r8 = p006b.p007a.C0663j.TextAppearance_textLocale
            boolean r8 = r6.mo1545g(r8)
            if (r8 == 0) goto L_0x0117
            int r8 = p006b.p007a.C0663j.TextAppearance_textLocale
            java.lang.String r8 = r6.mo1539d(r8)
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L_0x012b
            int r11 = p006b.p007a.C0663j.TextAppearance_fontVariationSettings
            boolean r11 = r6.mo1545g(r11)
            if (r11 == 0) goto L_0x012b
            int r11 = p006b.p007a.C0663j.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo1539d(r11)
            goto L_0x012c
        L_0x012b:
            r11 = 0
        L_0x012c:
            r6.mo1531a()
            goto L_0x0137
        L_0x0130:
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0137:
            int[] r6 = p006b.p007a.C0663j.TextAppearance
            androidx.appcompat.widget.r0 r6 = androidx.appcompat.widget.C0217r0.m1054a(r2, r0, r6, r1, r5)
            if (r4 != 0) goto L_0x014e
            int r9 = p006b.p007a.C0663j.TextAppearance_textAllCaps
            boolean r9 = r6.mo1545g(r9)
            if (r9 == 0) goto L_0x014e
            int r9 = p006b.p007a.C0663j.TextAppearance_textAllCaps
            boolean r14 = r6.mo1532a((int) r9, (boolean) r5)
            r13 = 1
        L_0x014e:
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r9 >= r5) goto L_0x017e
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textColor
            boolean r5 = r6.mo1545g(r5)
            if (r5 == 0) goto L_0x0162
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textColor
            android.content.res.ColorStateList r12 = r6.mo1529a(r5)
        L_0x0162:
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textColorHint
            boolean r5 = r6.mo1545g(r5)
            if (r5 == 0) goto L_0x0170
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r10 = r6.mo1529a(r5)
        L_0x0170:
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textColorLink
            boolean r5 = r6.mo1545g(r5)
            if (r5 == 0) goto L_0x017e
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r15 = r6.mo1529a(r5)
        L_0x017e:
            int r5 = p006b.p007a.C0663j.TextAppearance_textLocale
            boolean r5 = r6.mo1545g(r5)
            if (r5 == 0) goto L_0x018c
            int r5 = p006b.p007a.C0663j.TextAppearance_textLocale
            java.lang.String r8 = r6.mo1539d(r5)
        L_0x018c:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r5 < r9) goto L_0x01a0
            int r5 = p006b.p007a.C0663j.TextAppearance_fontVariationSettings
            boolean r5 = r6.mo1545g(r5)
            if (r5 == 0) goto L_0x01a0
            int r5 = p006b.p007a.C0663j.TextAppearance_fontVariationSettings
            java.lang.String r11 = r6.mo1539d(r5)
        L_0x01a0:
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r5 < r9) goto L_0x01c1
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textSize
            boolean r5 = r6.mo1545g(r5)
            if (r5 == 0) goto L_0x01c1
            int r5 = p006b.p007a.C0663j.TextAppearance_android_textSize
            r9 = -1
            int r5 = r6.mo1536c(r5, r9)
            if (r5 != 0) goto L_0x01c1
            android.widget.TextView r5 = r7.f1119a
            r9 = 0
            r16 = r3
            r3 = 0
            r5.setTextSize(r3, r9)
            goto L_0x01c3
        L_0x01c1:
            r16 = r3
        L_0x01c3:
            r7.m1153a((android.content.Context) r2, (androidx.appcompat.widget.C0217r0) r6)
            r6.mo1531a()
            if (r12 == 0) goto L_0x01d0
            android.widget.TextView r3 = r7.f1119a
            r3.setTextColor(r12)
        L_0x01d0:
            if (r10 == 0) goto L_0x01d7
            android.widget.TextView r3 = r7.f1119a
            r3.setHintTextColor(r10)
        L_0x01d7:
            if (r15 == 0) goto L_0x01de
            android.widget.TextView r3 = r7.f1119a
            r3.setLinkTextColor(r15)
        L_0x01de:
            if (r4 != 0) goto L_0x01e5
            if (r13 == 0) goto L_0x01e5
            r7.mo1658a((boolean) r14)
        L_0x01e5:
            android.graphics.Typeface r3 = r7.f1130l
            if (r3 == 0) goto L_0x01fb
            int r4 = r7.f1129k
            r5 = -1
            if (r4 != r5) goto L_0x01f6
            android.widget.TextView r4 = r7.f1119a
            int r5 = r7.f1128j
            r4.setTypeface(r3, r5)
            goto L_0x01fb
        L_0x01f6:
            android.widget.TextView r4 = r7.f1119a
            r4.setTypeface(r3)
        L_0x01fb:
            if (r11 == 0) goto L_0x0202
            android.widget.TextView r3 = r7.f1119a
            r3.setFontVariationSettings(r11)
        L_0x0202:
            if (r8 == 0) goto L_0x022c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0214
            android.widget.TextView r3 = r7.f1119a
            android.os.LocaleList r4 = android.os.LocaleList.forLanguageTags(r8)
            r3.setTextLocales(r4)
            goto L_0x022c
        L_0x0214:
            r4 = 21
            if (r3 < r4) goto L_0x022c
            r3 = 44
            int r3 = r8.indexOf(r3)
            r4 = 0
            java.lang.String r3 = r8.substring(r4, r3)
            android.widget.TextView r4 = r7.f1119a
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r4.setTextLocale(r3)
        L_0x022c:
            androidx.appcompat.widget.v r3 = r7.f1127i
            r3.mo1687a((android.util.AttributeSet) r0, (int) r1)
            boolean r1 = androidx.core.widget.C0341b.f1646a
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.v r1 = r7.f1127i
            int r1 = r1.mo1694f()
            if (r1 == 0) goto L_0x0272
            androidx.appcompat.widget.v r1 = r7.f1127i
            int[] r1 = r1.mo1693e()
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0272
            android.widget.TextView r3 = r7.f1119a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x026c
            android.widget.TextView r1 = r7.f1119a
            androidx.appcompat.widget.v r3 = r7.f1127i
            int r3 = r3.mo1691c()
            androidx.appcompat.widget.v r4 = r7.f1127i
            int r4 = r4.mo1689b()
            androidx.appcompat.widget.v r5 = r7.f1127i
            int r5 = r5.mo1692d()
            r6 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6)
            goto L_0x0272
        L_0x026c:
            r6 = 0
            android.widget.TextView r3 = r7.f1119a
            r3.setAutoSizeTextTypeUniformWithPresetSizes(r1, r6)
        L_0x0272:
            int[] r1 = p006b.p007a.C0663j.AppCompatTextView
            androidx.appcompat.widget.r0 r8 = androidx.appcompat.widget.C0217r0.m1053a((android.content.Context) r2, (android.util.AttributeSet) r0, (int[]) r1)
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.mo1544g(r0, r1)
            r3 = r16
            if (r0 == r1) goto L_0x0289
            android.graphics.drawable.Drawable r0 = r3.mo1386a((android.content.Context) r2, (int) r0)
            r4 = r0
            goto L_0x028a
        L_0x0289:
            r4 = 0
        L_0x028a:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableTopCompat
            int r0 = r8.mo1544g(r0, r1)
            if (r0 == r1) goto L_0x0298
            android.graphics.drawable.Drawable r0 = r3.mo1386a((android.content.Context) r2, (int) r0)
            r5 = r0
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableRightCompat
            int r0 = r8.mo1544g(r0, r1)
            if (r0 == r1) goto L_0x02a7
            android.graphics.drawable.Drawable r0 = r3.mo1386a((android.content.Context) r2, (int) r0)
            r6 = r0
            goto L_0x02a8
        L_0x02a7:
            r6 = 0
        L_0x02a8:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableBottomCompat
            int r0 = r8.mo1544g(r0, r1)
            if (r0 == r1) goto L_0x02b6
            android.graphics.drawable.Drawable r0 = r3.mo1386a((android.content.Context) r2, (int) r0)
            r9 = r0
            goto L_0x02b7
        L_0x02b6:
            r9 = 0
        L_0x02b7:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableStartCompat
            int r0 = r8.mo1544g(r0, r1)
            if (r0 == r1) goto L_0x02c5
            android.graphics.drawable.Drawable r0 = r3.mo1386a((android.content.Context) r2, (int) r0)
            r10 = r0
            goto L_0x02c6
        L_0x02c5:
            r10 = 0
        L_0x02c6:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableEndCompat
            int r0 = r8.mo1544g(r0, r1)
            if (r0 == r1) goto L_0x02d4
            android.graphics.drawable.Drawable r0 = r3.mo1386a((android.content.Context) r2, (int) r0)
            r11 = r0
            goto L_0x02d5
        L_0x02d4:
            r11 = 0
        L_0x02d5:
            r0 = r18
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r10
            r6 = r11
            r0.m1154a(r1, r2, r3, r4, r5, r6)
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableTint
            boolean r0 = r8.mo1545g(r0)
            if (r0 == 0) goto L_0x02f3
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r0 = r8.mo1529a(r0)
            android.widget.TextView r1 = r7.f1119a
            androidx.core.widget.C0348i.m1737a((android.widget.TextView) r1, (android.content.res.ColorStateList) r0)
        L_0x02f3:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableTintMode
            boolean r0 = r8.mo1545g(r0)
            if (r0 == 0) goto L_0x030d
            int r0 = p006b.p007a.C0663j.AppCompatTextView_drawableTintMode
            r1 = -1
            int r0 = r8.mo1538d(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0249z.m1265a(r0, r2)
            android.widget.TextView r2 = r7.f1119a
            androidx.core.widget.C0348i.m1738a((android.widget.TextView) r2, (android.graphics.PorterDuff.Mode) r0)
            goto L_0x030e
        L_0x030d:
            r1 = -1
        L_0x030e:
            int r0 = p006b.p007a.C0663j.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.mo1536c(r0, r1)
            int r2 = p006b.p007a.C0663j.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.mo1536c(r2, r1)
            int r3 = p006b.p007a.C0663j.AppCompatTextView_lineHeight
            int r3 = r8.mo1536c(r3, r1)
            r8.mo1531a()
            if (r0 == r1) goto L_0x032a
            android.widget.TextView r4 = r7.f1119a
            androidx.core.widget.C0348i.m1736a((android.widget.TextView) r4, (int) r0)
        L_0x032a:
            if (r2 == r1) goto L_0x0331
            android.widget.TextView r0 = r7.f1119a
            androidx.core.widget.C0348i.m1744b(r0, r2)
        L_0x0331:
            if (r3 == r1) goto L_0x0338
            android.widget.TextView r0 = r7.f1119a
            androidx.core.widget.C0348i.m1746c(r0, r3)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0235u.mo1656a(android.util.AttributeSet, int):void");
    }

    /* renamed from: a */
    public void mo1657a(Runnable runnable) {
        this.f1119a.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1658a(boolean z) {
        this.f1119a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1659a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0341b.f1646a) {
            mo1661b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1660a(int[] iArr, int i) {
        this.f1127i.mo1688a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1661b() {
        this.f1127i.mo1683a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo1662c() {
        return this.f1127i.mo1689b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1663d() {
        return this.f1127i.mo1691c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1664e() {
        return this.f1127i.mo1692d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int[] mo1665f() {
        return this.f1127i.mo1693e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1666g() {
        return this.f1127i.mo1694f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo1667h() {
        C0213p0 p0Var = this.f1126h;
        if (p0Var != null) {
            return p0Var.f1052a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public PorterDuff.Mode mo1668i() {
        C0213p0 p0Var = this.f1126h;
        if (p0Var != null) {
            return p0Var.f1053b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo1669j() {
        return this.f1127i.mo1695g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1670k() {
        mo1648a();
    }
}
