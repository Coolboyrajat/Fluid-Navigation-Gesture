package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.g */
class C2608g extends BaseAdapter {

    /* renamed from: i */
    private static final int f6835i = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: f */
    private final Calendar f6836f = Calendar.getInstance();

    /* renamed from: g */
    private final int f6837g;

    /* renamed from: h */
    private final int f6838h;

    public C2608g() {
        this.f6836f.clear();
        this.f6837g = this.f6836f.getMaximum(7);
        this.f6838h = this.f6836f.getFirstDayOfWeek();
    }

    /* renamed from: a */
    private int m10268a(int i) {
        int i2 = i + this.f6838h;
        int i3 = this.f6837g;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public int getCount() {
        return this.f6837g;
    }

    public Integer getItem(int i) {
        if (i >= this.f6837g) {
            return null;
        }
        return Integer.valueOf(m10268a(i));
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p054c.p083e.p084a.p085a.C1175h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f6836f
            int r6 = r5.m10268a(r6)
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.f6836f
            int r7 = f6835i
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p054c.p083e.p084a.p085a.C1176i.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f6836f
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C2608g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
