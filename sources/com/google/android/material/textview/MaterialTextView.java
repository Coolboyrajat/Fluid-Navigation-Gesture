package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p099w.C1217b;
import p054c.p083e.p084a.p085a.p099w.C1218c;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int a;
        if (m10857a(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m10858a(context, theme, attributeSet, i, i2) && (a = m10855a(theme, attributeSet, i, i2)) != -1) {
                m10856a(theme, a);
            }
        }
    }

    /* renamed from: a */
    private static int m10854a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C1218c.m5859a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: a */
    private static int m10855a(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1178k.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1178k.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: a */
    private void m10856a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C1178k.MaterialTextAppearance);
        int a = m10854a(getContext(), obtainStyledAttributes, C1178k.MaterialTextAppearance_android_lineHeight, C1178k.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    /* renamed from: a */
    private static boolean m10857a(Context context) {
        return C1217b.m5858a(context, C1169b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: a */
    private static boolean m10858a(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1178k.MaterialTextView, i, i2);
        int a = m10854a(context, obtainStyledAttributes, C1178k.MaterialTextView_android_lineHeight, C1178k.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return a != -1;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m10857a(context)) {
            m10856a(context.getTheme(), i);
        }
    }
}
