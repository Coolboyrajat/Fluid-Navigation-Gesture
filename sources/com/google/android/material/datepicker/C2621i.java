package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.C0399c;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.p099w.C1217b;

/* renamed from: com.google.android.material.datepicker.i */
public final class C2621i<S> extends C0399c {
    /* renamed from: b */
    static boolean m10298b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1217b.m5855a(context, C1169b.materialCalendarStyle, C2609h.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
