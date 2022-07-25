package com.google.android.material.datepicker;

import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.d */
class C2605d {
    /* renamed from: a */
    static long m10261a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.clear();
        instance2.set(instance.get(1), instance.get(2), instance.get(5));
        return instance2.getTimeInMillis();
    }
}
