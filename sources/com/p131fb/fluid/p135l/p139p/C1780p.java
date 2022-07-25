package com.p131fb.fluid.p135l.p139p;

import android.graphics.Rect;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.p */
public final class C1780p {
    /* renamed from: a */
    public static final void m7485a(Rect rect) {
        C3370k.m12227b(rect, "$this$rotate");
        rect.set(rect.top, rect.left, rect.bottom, rect.right);
    }

    /* renamed from: a */
    public static final void m7486a(Rect rect, int i, int i2, int i3, int i4) {
        C3370k.m12227b(rect, "$this$update");
        rect.set(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m7487a(Rect rect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = rect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = rect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = rect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = rect.bottom;
        }
        m7486a(rect, i, i2, i3, i4);
    }
}
