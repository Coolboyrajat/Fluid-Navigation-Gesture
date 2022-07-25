package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.databinding.f */
public class C0375f {

    /* renamed from: a */
    private static C0372c f1700a = new C0373d();

    /* renamed from: b */
    private static C0374e f1701b = null;

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m1846a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return m1847a(layoutInflater, i, viewGroup, z, f1701b);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m1847a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, C0374e eVar) {
        int i2 = 0;
        boolean z2 = viewGroup != null && z;
        if (z2) {
            i2 = viewGroup.getChildCount();
        }
        return z2 ? m1849a(eVar, viewGroup, i2, i) : m1848a(eVar, layoutInflater.inflate(i, viewGroup, z), i);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m1848a(C0374e eVar, View view, int i) {
        return f1700a.mo2180a(eVar, view, i);
    }

    /* renamed from: a */
    private static <T extends ViewDataBinding> T m1849a(C0374e eVar, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return m1848a(eVar, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return m1850a(eVar, viewArr, i2);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m1850a(C0374e eVar, View[] viewArr, int i) {
        return f1700a.mo2181a(eVar, viewArr, i);
    }
}
