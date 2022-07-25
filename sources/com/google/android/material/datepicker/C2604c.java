package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p099w.C1217b;
import p054c.p083e.p084a.p085a.p099w.C1218c;

/* renamed from: com.google.android.material.datepicker.c */
final class C2604c {

    /* renamed from: a */
    final C2603b f6827a;

    /* renamed from: b */
    final C2603b f6828b;

    /* renamed from: c */
    final C2603b f6829c;

    /* renamed from: d */
    final C2603b f6830d;

    /* renamed from: e */
    final C2603b f6831e;

    /* renamed from: f */
    final C2603b f6832f;

    /* renamed from: g */
    final C2603b f6833g;

    /* renamed from: h */
    final Paint f6834h = new Paint();

    C2604c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1217b.m5855a(context, C1169b.materialCalendarStyle, C2609h.class.getCanonicalName()), C1178k.MaterialCalendar);
        this.f6827a = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_dayStyle, 0));
        this.f6833g = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_dayInvalidStyle, 0));
        this.f6828b = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_daySelectedStyle, 0));
        this.f6829c = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C1218c.m5861a(context, obtainStyledAttributes, C1178k.MaterialCalendar_rangeFillColor);
        this.f6830d = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_yearStyle, 0));
        this.f6831e = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_yearSelectedStyle, 0));
        this.f6832f = C2603b.m10257a(context, obtainStyledAttributes.getResourceId(C1178k.MaterialCalendar_yearTodayStyle, 0));
        this.f6834h.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
