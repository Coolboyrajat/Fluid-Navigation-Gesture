package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.j */
public final class C2622j implements Comparable<C2622j>, Parcelable {
    public static final Parcelable.Creator<C2622j> CREATOR = new C2623a();

    /* renamed from: f */
    private final Calendar f6871f = Calendar.getInstance();

    /* renamed from: g */
    private final String f6872g;

    /* renamed from: h */
    final int f6873h;

    /* renamed from: i */
    final int f6874i;

    /* renamed from: j */
    final int f6875j;

    /* renamed from: k */
    final int f6876k;

    /* renamed from: com.google.android.material.datepicker.j$a */
    static class C2623a implements Parcelable.Creator<C2622j> {
        C2623a() {
        }

        public C2622j createFromParcel(Parcel parcel) {
            return C2622j.m10299a(parcel.readInt(), parcel.readInt());
        }

        public C2622j[] newArray(int i) {
            return new C2622j[i];
        }
    }

    private C2622j(Calendar calendar) {
        this.f6871f.setTimeInMillis(C2605d.m10261a(calendar.getTimeInMillis()));
        this.f6873h = this.f6871f.get(2);
        this.f6874i = this.f6871f.get(1);
        this.f6875j = this.f6871f.getMaximum(7);
        this.f6876k = this.f6871f.getActualMaximum(5);
        this.f6872g = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault()).format(this.f6871f.getTime());
    }

    /* renamed from: a */
    static C2622j m10299a(int i, int i2) {
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2);
        return new C2622j(instance);
    }

    /* renamed from: t */
    public static C2622j m10300t() {
        Calendar instance = Calendar.getInstance();
        return m10299a(instance.get(1), instance.get(2));
    }

    /* renamed from: a */
    public int compareTo(C2622j jVar) {
        return this.f6871f.compareTo(jVar.f6871f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo8258a(int i) {
        Calendar calendar = (Calendar) this.f6871f.clone();
        calendar.set(5, i);
        return calendar.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8259b(C2622j jVar) {
        if (this.f6871f instanceof GregorianCalendar) {
            return ((jVar.f6874i - this.f6874i) * 12) + (jVar.f6873h - this.f6873h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2622j mo8260b(int i) {
        Calendar calendar = (Calendar) this.f6871f.clone();
        calendar.add(2, i);
        return new C2622j(calendar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2622j)) {
            return false;
        }
        C2622j jVar = (C2622j) obj;
        return this.f6873h == jVar.f6873h && this.f6874i == jVar.f6874i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6873h), Integer.valueOf(this.f6874i)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8265q() {
        int firstDayOfWeek = this.f6871f.get(7) - this.f6871f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f6875j : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public String mo8266r() {
        return this.f6872g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public long mo8267s() {
        return this.f6871f.getTimeInMillis();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6874i);
        parcel.writeInt(this.f6873h);
    }
}
