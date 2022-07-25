package p054c.p083e.p084a.p085a.p098v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0342c;
import com.google.android.material.internal.C2672g;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p093q.C1207a;

/* renamed from: c.e.a.a.v.a */
public class C1214a extends AppCompatRadioButton {

    /* renamed from: k */
    private static final int f3965k = C1177j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: l */
    private static final int[][] f3966l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f3967i;

    /* renamed from: j */
    private boolean f3968j;

    public C1214a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.radioButtonStyle);
    }

    public C1214a(Context context, AttributeSet attributeSet, int i) {
        super(C2672g.m10585b(context, attributeSet, i, f3965k), attributeSet, i);
        TypedArray c = C2672g.m10589c(getContext(), attributeSet, C1178k.MaterialRadioButton, i, f3965k, new int[0]);
        this.f3968j = c.getBoolean(C1178k.MaterialRadioButton_useMaterialThemeColors, false);
        c.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3967i == null) {
            int a = C1207a.m5828a((View) this, C1169b.colorControlActivated);
            int a2 = C1207a.m5828a((View) this, C1169b.colorOnSurface);
            int a3 = C1207a.m5828a((View) this, C1169b.colorSurface);
            int[] iArr = new int[f3966l.length];
            iArr[0] = C1207a.m5825a(a3, a, 1.0f);
            iArr[1] = C1207a.m5825a(a3, a2, 0.54f);
            iArr[2] = C1207a.m5825a(a3, a2, 0.38f);
            iArr[3] = C1207a.m5825a(a3, a2, 0.38f);
            this.f3967i = new ColorStateList(f3966l, iArr);
        }
        return this.f3967i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3968j && C0342c.m1721b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3968j = z;
        C0342c.m1719a((CompoundButton) this, z ? getMaterialThemeColorsTintList() : null);
    }
}
