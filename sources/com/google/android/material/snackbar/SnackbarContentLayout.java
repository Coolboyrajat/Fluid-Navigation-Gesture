package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p093q.C1207a;

public class SnackbarContentLayout extends LinearLayout implements C2704a {

    /* renamed from: f */
    private TextView f7147f;

    /* renamed from: g */
    private Button f7148g;

    /* renamed from: h */
    private int f7149h;

    /* renamed from: i */
    private int f7150i;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.SnackbarLayout);
        this.f7149h = obtainStyledAttributes.getDimensionPixelSize(C1178k.SnackbarLayout_android_maxWidth, -1);
        this.f7150i = obtainStyledAttributes.getDimensionPixelSize(C1178k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static void m10671a(View view, int i, int i2) {
        if (C0890v.m4734E(view)) {
            C0890v.m4747a(view, C0890v.m4796t(view), i, C0890v.m4795s(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    private boolean m10672a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f7147f.getPaddingTop() == i2 && this.f7147f.getPaddingBottom() == i3) {
            return z;
        }
        m10671a((View) this.f7147f, i2, i3);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8617a(float f) {
        if (f != 1.0f) {
            this.f7148g.setTextColor(C1207a.m5825a(C1207a.m5828a((View) this, C1169b.colorSurface), this.f7148g.getCurrentTextColor(), f));
        }
    }

    /* renamed from: a */
    public void mo8618a(int i, int i2) {
        this.f7147f.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f7147f.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f7148g.getVisibility() == 0) {
            this.f7148g.setAlpha(1.0f);
            this.f7148g.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo8619b(int i, int i2) {
        this.f7147f.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f7147f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f7148g.getVisibility() == 0) {
            this.f7148g.setAlpha(0.0f);
            this.f7148g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f7148g;
    }

    public TextView getMessageView() {
        return this.f7147f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7147f = (TextView) findViewById(C1173f.snackbar_text);
        this.f7148g = (Button) findViewById(C1173f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m10672a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m10672a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f7149h
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f7149h
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p054c.p083e.p084a.p085a.C1171d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p054c.p083e.p084a.p085a.C1171d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f7147f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f7150i
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f7148g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f7150i
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m10672a((int) r4, (int) r0, (int) r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m10672a((int) r3, (int) r0, (int) r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
