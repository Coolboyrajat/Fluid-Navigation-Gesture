package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
public final class C2600a implements Parcelable {
    public static final Parcelable.Creator<C2600a> CREATOR = new C2601a();

    /* renamed from: f */
    private final C2622j f6815f;

    /* renamed from: g */
    private final C2622j f6816g;

    /* renamed from: h */
    private final C2622j f6817h;

    /* renamed from: i */
    private final C2602b f6818i;

    /* renamed from: j */
    private final int f6819j;

    /* renamed from: k */
    private final int f6820k;

    /* renamed from: com.google.android.material.datepicker.a$a */
    static class C2601a implements Parcelable.Creator<C2600a> {
        C2601a() {
        }

        public C2600a createFromParcel(Parcel parcel) {
            return new C2600a((C2622j) parcel.readParcelable(C2622j.class.getClassLoader()), (C2622j) parcel.readParcelable(C2622j.class.getClassLoader()), (C2622j) parcel.readParcelable(C2622j.class.getClassLoader()), (C2602b) parcel.readParcelable(C2602b.class.getClassLoader()), (C2601a) null);
        }

        public C2600a[] newArray(int i) {
            return new C2600a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public interface C2602b extends Parcelable {
        /* renamed from: a */
        boolean mo8235a(long j);
    }

    private C2600a(C2622j jVar, C2622j jVar2, C2622j jVar3, C2602b bVar) {
        this.f6815f = jVar;
        this.f6816g = jVar2;
        this.f6817h = jVar3;
        this.f6818i = bVar;
        if (jVar.compareTo(jVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (jVar3.compareTo(jVar2) <= 0) {
            this.f6820k = jVar.mo8259b(jVar2) + 1;
            this.f6819j = (jVar2.f6874i - jVar.f6874i) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ C2600a(C2622j jVar, C2622j jVar2, C2622j jVar3, C2602b bVar, C2601a aVar) {
        this(jVar, jVar2, jVar3, bVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2600a)) {
            return false;
        }
        C2600a aVar = (C2600a) obj;
        return this.f6815f.equals(aVar.f6815f) && this.f6816g.equals(aVar.f6816g) && this.f6817h.equals(aVar.f6817h) && this.f6818i.equals(aVar.f6818i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6815f, this.f6816g, this.f6817h, this.f6818i});
    }

    /* renamed from: q */
    public C2602b mo8226q() {
        return this.f6818i;
    }

    /* renamed from: r */
    public C2622j mo8227r() {
        return this.f6816g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo8228s() {
        return this.f6820k;
    }

    /* renamed from: t */
    public C2622j mo8229t() {
        return this.f6817h;
    }

    /* renamed from: u */
    public C2622j mo8230u() {
        return this.f6815f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo8231v() {
        return this.f6819j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6815f, 0);
        parcel.writeParcelable(this.f6816g, 0);
        parcel.writeParcelable(this.f6817h, 0);
        parcel.writeParcelable(this.f6818i, 0);
    }
}
