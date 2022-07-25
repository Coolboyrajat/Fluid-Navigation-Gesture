package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1166a;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p087l.C1188j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f7332i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m10897a(View view, boolean z) {
        int i;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f7332i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0268f) && (((CoordinatorLayout.C0268f) childAt.getLayoutParams()).mo1864d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f7332i;
                        if (map != null && map.containsKey(childAt)) {
                            i = this.f7332i.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f7332i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i = 4;
                    }
                    C0890v.m4783h(childAt, i);
                }
            }
            if (!z) {
                this.f7332i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public FabTransformationBehavior.C2753e mo8821a(Context context, boolean z) {
        int i = z ? C1166a.mtrl_fab_transformation_sheet_expand_spec : C1166a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C2753e eVar = new FabTransformationBehavior.C2753e();
        eVar.f7326a = C1186h.m5746a(context, i);
        eVar.f7327b = new C1188j(17, 0.0f, 0.0f);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8816a(View view, View view2, boolean z, boolean z2) {
        m10897a(view2, z);
        return super.mo8816a(view, view2, z, z2);
    }
}
