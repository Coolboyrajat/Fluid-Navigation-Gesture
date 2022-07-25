package p054c.p083e.p084a.p085a.p090o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0342c;
import com.google.android.material.internal.C2672g;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p054c.p083e.p084a.p085a.p099w.C1218c;

/* renamed from: c.e.a.a.o.a */
public class C1194a extends AppCompatCheckBox {

    /* renamed from: k */
    private static final int f3946k = C1177j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: l */
    private static final int[][] f3947l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f3948i;

    /* renamed from: j */
    private boolean f3949j;

    public C1194a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.checkboxStyle);
    }

    public C1194a(Context context, AttributeSet attributeSet, int i) {
        super(C2672g.m10585b(context, attributeSet, i, f3946k), attributeSet, i);
        Context context2 = getContext();
        TypedArray c = C2672g.m10589c(context2, attributeSet, C1178k.MaterialCheckBox, i, f3946k, new int[0]);
        if (c.hasValue(C1178k.MaterialCheckBox_buttonTint)) {
            C0342c.m1719a((CompoundButton) this, C1218c.m5861a(context2, c, C1178k.MaterialCheckBox_buttonTint));
        }
        this.f3949j = c.getBoolean(C1178k.MaterialCheckBox_useMaterialThemeColors, false);
        c.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3948i == null) {
            int[] iArr = new int[f3947l.length];
            int a = C1207a.m5828a((View) this, C1169b.colorControlActivated);
            int a2 = C1207a.m5828a((View) this, C1169b.colorSurface);
            int a3 = C1207a.m5828a((View) this, C1169b.colorOnSurface);
            iArr[0] = C1207a.m5825a(a2, a, 1.0f);
            iArr[1] = C1207a.m5825a(a2, a3, 0.54f);
            iArr[2] = C1207a.m5825a(a2, a3, 0.38f);
            iArr[3] = C1207a.m5825a(a2, a3, 0.38f);
            this.f3948i = new ColorStateList(f3947l, iArr);
        }
        return this.f3948i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3949j && C0342c.m1721b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3949j = z;
        C0342c.m1719a((CompoundButton) this, z ? getMaterialThemeColorsTintList() : null);
    }
}
