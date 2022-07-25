package com.p131fb.fluid.p148ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.C1719h;
import java.util.HashMap;
import kotlin.p205x.p207d.C3370k;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.views.PreferenceView */
public final class PreferenceView extends ConstraintLayout {

    /* renamed from: A */
    private HashMap f6354A;

    /* renamed from: v */
    private int f6355v;

    /* renamed from: w */
    private int f6356w;

    /* renamed from: x */
    private int f6357x;

    /* renamed from: y */
    private boolean f6358y;

    /* renamed from: z */
    private int f6359z;

    /* renamed from: com.fb.fluid.ui.views.PreferenceView$a */
    public static final class C2511a {
        private C2511a() {
        }

        public /* synthetic */ C2511a(C3366g gVar) {
            this();
        }
    }

    static {
        new C2511a((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f6355v = -1;
        this.f6356w = -1;
        this.f6357x = -1;
        this.f6359z = 1;
        m9365a(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C3370k.m12227b(context, "context");
        this.f6355v = -1;
        this.f6356w = -1;
        this.f6357x = -1;
        this.f6359z = 1;
        m9365a(attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferenceView(Context context, AttributeSet attributeSet, int i, int i2, C3366g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9364a() {
        /*
            r9 = this;
            int r0 = com.p131fb.fluid.C1718g.layout_widget_start
            android.view.View r0 = r9.mo7402b(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            boolean r1 = r9.f6358y
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L_0x0026
            int r1 = com.p131fb.fluid.C1718g.img_icon_start
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            java.lang.String r4 = "img_icon_start"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r1, (java.lang.String) r4)
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r1 = 8
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0.setVisibility(r1)
            r1 = 4
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            int r4 = com.p131fb.fluid.C1718g.txt_sum
            android.view.View r4 = r9.mo7402b(r4)
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r5 = 0
            if (r4 == 0) goto L_0x0041
            int r4 = r4.getVisibility()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0042
        L_0x0041:
            r4 = r5
        L_0x0042:
            r1[r3] = r4
            int r4 = com.p131fb.fluid.C1718g.txt_extra_sum
            android.view.View r4 = r9.mo7402b(r4)
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            java.lang.String r6 = "this@PreferenceView.txt_extra_sum"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r6)
            int r4 = r4.getVisibility()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r1[r6] = r4
            r4 = 2
            int r7 = com.p131fb.fluid.C1718g.txt_title
            android.view.View r7 = r9.mo7402b(r7)
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            java.lang.String r8 = "this@PreferenceView.txt_title"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r7, (java.lang.String) r8)
            int r7 = r7.getVisibility()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r4] = r7
            r4 = 3
            int r7 = com.p131fb.fluid.C1718g.layout_widget_bottom
            android.view.View r7 = r9.mo7402b(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            java.lang.String r8 = "this@PreferenceView.layout_widget_bottom"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r7, (java.lang.String) r8)
            int r7 = r7.getVisibility()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1[r4] = r7
            java.util.List r1 = kotlin.p195s.C3284j.m12070b((T[]) r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0099:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00b8
            java.lang.Object r7 = r1.next()
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            int r8 = r8.intValue()
            if (r8 == r2) goto L_0x00b1
        L_0x00af:
            r8 = 1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r8 == 0) goto L_0x0099
            r4.add(r7)
            goto L_0x0099
        L_0x00b8:
            int r1 = r4.size()
            if (r1 > r6) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 != 0) goto L_0x00c7
            r1 = r5
        L_0x00c7:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x00cd
            r1.topMargin = r3
        L_0x00cd:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0250a
            if (r1 != 0) goto L_0x00d6
            r0 = r5
        L_0x00d6:
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r0
            if (r0 == 0) goto L_0x0100
            r0.f1240k = r3
            goto L_0x0100
        L_0x00dd:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r3 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 != 0) goto L_0x00e6
            r1 = r5
        L_0x00e6:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x00f0
            int r2 = p054c.p079d.p080a.p081a.p082a.C1165a.m5734a((int) r2)
            r1.topMargin = r2
        L_0x00f0:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0250a
            if (r1 != 0) goto L_0x00f9
            r0 = r5
        L_0x00f9:
            androidx.constraintlayout.widget.ConstraintLayout$a r0 = (androidx.constraintlayout.widget.ConstraintLayout.C0250a) r0
            if (r0 == 0) goto L_0x0100
            r1 = -1
            r0.f1240k = r1
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.views.PreferenceView.m9364a():void");
    }

    /* renamed from: a */
    private final void m9365a(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(C3148R.layout.view_preference, this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1719h.PreferenceView, 0, 0);
            this.f6355v = obtainStyledAttributes.getResourceId(4, -1);
            if (this.f6355v != -1) {
                LayoutInflater.from(getContext()).inflate(this.f6355v, (FrameLayout) mo7402b(C1718g.layout_widget_bottom), true);
            }
            FrameLayout frameLayout = (FrameLayout) mo7402b(C1718g.layout_widget_bottom);
            C3370k.m12223a((Object) frameLayout, "layout_widget_bottom");
            frameLayout.setVisibility(this.f6355v != -1 ? 0 : 8);
            this.f6356w = obtainStyledAttributes.getResourceId(5, -1);
            if (this.f6356w != -1) {
                ((FrameLayout) mo7402b(C1718g.layout_widget_end)).addView(LayoutInflater.from(getContext()).inflate(this.f6356w, (FrameLayout) mo7402b(C1718g.layout_widget_end), false));
            }
            this.f6357x = obtainStyledAttributes.getResourceId(6, -1);
            if (this.f6357x != -1) {
                ((FrameLayout) mo7402b(C1718g.layout_widget_end_out)).addView(LayoutInflater.from(getContext()).inflate(this.f6357x, (FrameLayout) mo7402b(C1718g.layout_widget_end_out), false));
            }
            FrameLayout frameLayout2 = (FrameLayout) mo7402b(C1718g.layout_widget_end_out);
            C3370k.m12223a((Object) frameLayout2, "layout_widget_end_out");
            frameLayout2.setVisibility(this.f6357x != -1 ? 0 : 8);
            m9366a(this, obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getColor(2, -1), (Drawable) null, (Integer) null, false, 28, (Object) null);
            setForceStartSpacing(obtainStyledAttributes.getBoolean(1, false));
            m9370c(this, obtainStyledAttributes.getString(9), obtainStyledAttributes.getResourceId(9, -1), false, 4, (Object) null);
            m9369b(this, obtainStyledAttributes.getString(8), obtainStyledAttributes.getResourceId(8, -1), false, 4, (Object) null);
            m9367a(this, obtainStyledAttributes.getString(0), obtainStyledAttributes.getResourceId(0, -1), false, 4, (Object) null);
            m9368b(this, obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getColor(3, -1), (Drawable) null, (Integer) null, false, 28, (Object) null);
            setMinHeightMode(obtainStyledAttributes.getInt(7, 1));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m9366a(PreferenceView preferenceView, int i, int i2, Drawable drawable, Integer num, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            drawable = null;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        if ((i3 & 16) != 0) {
            z = true;
        }
        preferenceView.mo7400a(i, i2, drawable, num, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m9367a(PreferenceView preferenceView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        preferenceView.mo7401a(str, i, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m9368b(PreferenceView preferenceView, int i, int i2, Drawable drawable, Integer num, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            drawable = null;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        if ((i3 & 16) != 0) {
            z = true;
        }
        preferenceView.mo7403b(i, i2, drawable, num, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m9369b(PreferenceView preferenceView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        preferenceView.mo7404b(str, i, z);
    }

    /* renamed from: c */
    public static /* synthetic */ void m9370c(PreferenceView preferenceView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        preferenceView.mo7405c(str, i, z);
    }

    /* renamed from: a */
    public final void mo7400a(int i, int i2, Drawable drawable, Integer num, boolean z) {
        int i3;
        ColorDrawable colorDrawable;
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo7402b(C1718g.img_icon_end);
        if (i != -1) {
            appCompatImageView.setImageResource(i);
        } else {
            if (i2 != -1) {
                colorDrawable = new ColorDrawable(i2);
            } else if (drawable != null) {
                appCompatImageView.setImageDrawable(drawable);
            } else {
                colorDrawable = null;
            }
            appCompatImageView.setImageDrawable(colorDrawable);
        }
        if (num == null) {
            appCompatImageView.clearColorFilter();
        } else {
            appCompatImageView.setColorFilter(num.intValue());
        }
        appCompatImageView.setEnabled(true);
        appCompatImageView.setAlpha(1 != 0 ? 1.0f : 0.5f);
        FrameLayout frameLayout = (FrameLayout) mo7402b(C1718g.layout_widget_end);
        if (this.f6356w == -1) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) frameLayout.findViewById(C1718g.img_icon_end);
            C3370k.m12223a((Object) appCompatImageView2, "img_icon_end");
            if (appCompatImageView2.getDrawable() == null) {
                i3 = 8;
                frameLayout.setVisibility(i3);
            }
        }
        i3 = 0;
        frameLayout.setVisibility(i3);
    }

    /* renamed from: a */
    public final void mo7401a(String str, int i, boolean z) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo7402b(C1718g.txt_extra_sum);
        if (appCompatTextView.getText() == null) {
            str = i != -1 ? appCompatTextView.getResources().getString(i) : BuildConfig.FLAVOR;
        }
        appCompatTextView.setText(str);
        CharSequence text = appCompatTextView.getText();
        int i2 = 0;
        if (text == null || text.length() == 0) {
            i2 = 8;
        }
        appCompatTextView.setVisibility(i2);
        appCompatTextView.setEnabled(true);
        appCompatTextView.setAlpha(1 != 0 ? 1.0f : 0.5f);
        m9364a();
    }

    /* renamed from: b */
    public View mo7402b(int i) {
        if (this.f6354A == null) {
            this.f6354A = new HashMap();
        }
        View view = (View) this.f6354A.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f6354A.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo7403b(int i, int i2, Drawable drawable, Integer num, boolean z) {
        ColorDrawable colorDrawable;
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo7402b(C1718g.img_icon_start);
        if (i != -1) {
            appCompatImageView.setImageResource(i);
        } else {
            if (i2 != -1) {
                colorDrawable = new ColorDrawable(i2);
            } else if (drawable != null) {
                appCompatImageView.setImageDrawable(drawable);
            } else {
                colorDrawable = null;
            }
            appCompatImageView.setImageDrawable(colorDrawable);
        }
        if (num == null) {
            appCompatImageView.clearColorFilter();
        } else {
            appCompatImageView.setColorFilter(num.intValue());
        }
        appCompatImageView.setEnabled(true);
        appCompatImageView.setAlpha(1 != 0 ? 1.0f : 0.5f);
        m9364a();
    }

    /* renamed from: b */
    public final void mo7404b(String str, int i, boolean z) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo7402b(C1718g.txt_sum);
        if (appCompatTextView.getText() == null) {
            str = i != -1 ? appCompatTextView.getResources().getString(i) : BuildConfig.FLAVOR;
        }
        appCompatTextView.setText(str);
        CharSequence text = appCompatTextView.getText();
        int i2 = 0;
        if (text == null || text.length() == 0) {
            i2 = 8;
        }
        appCompatTextView.setVisibility(i2);
        appCompatTextView.setEnabled(true);
        appCompatTextView.setAlpha(1 != 0 ? 1.0f : 0.5f);
        m9364a();
    }

    /* renamed from: c */
    public final void mo7405c(String str, int i, boolean z) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo7402b(C1718g.txt_title);
        if (appCompatTextView.getText() == null) {
            str = i != -1 ? appCompatTextView.getResources().getString(i) : BuildConfig.FLAVOR;
        }
        appCompatTextView.setText(str);
        CharSequence text = appCompatTextView.getText();
        int i2 = 0;
        if (text == null || text.length() == 0) {
            i2 = 8;
        }
        appCompatTextView.setVisibility(i2);
        appCompatTextView.setEnabled(true);
        appCompatTextView.setAlpha(1 != 0 ? 1.0f : 0.5f);
        m9364a();
    }

    public final boolean getForceStartSpacing() {
        return this.f6358y;
    }

    public final int getMinHeightMode() {
        return this.f6359z;
    }

    public final void setForceStartSpacing(boolean z) {
        int i;
        this.f6358y = z;
        FrameLayout frameLayout = (FrameLayout) mo7402b(C1718g.layout_widget_start);
        if (!this.f6358y) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) frameLayout.findViewById(C1718g.img_icon_start);
            C3370k.m12223a((Object) appCompatImageView, "img_icon_start");
            if (appCompatImageView.getDrawable() == null) {
                i = 8;
                frameLayout.setVisibility(i);
            }
        }
        i = 0;
        frameLayout.setVisibility(i);
    }

    public final void setMinHeightMode(int i) {
        this.f6359z = i;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo7402b(C1718g.layout_preference_view_root);
        C3370k.m12223a((Object) constraintLayout, "layout_preference_view_root");
        int i2 = this.f6359z;
        constraintLayout.setMinHeight(C1165a.m5734a(i2 != 0 ? i2 != 1 ? 48 : 72 : 64));
    }
}
