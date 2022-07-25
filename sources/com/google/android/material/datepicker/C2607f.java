package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.f */
class C2607f {
    /* renamed from: a */
    static String m10266a(long j) {
        return Build.VERSION.SDK_INT >= 24 ? DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault()).format(new Date(j)) : java.text.DateFormat.getDateInstance(0, Locale.getDefault()).format(new Date(j));
    }

    /* renamed from: b */
    static String m10267b(long j) {
        return Build.VERSION.SDK_INT >= 24 ? DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault()).format(new Date(j)) : java.text.DateFormat.getDateInstance(0, Locale.getDefault()).format(new Date(j));
    }
}
