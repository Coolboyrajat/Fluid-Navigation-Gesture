package p054c.p083e.p084a.p085a.p086a0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p006b.p021d.C0736g;
import p006b.p039i.p040a.C0912a;

/* renamed from: c.e.a.a.a0.a */
public class C1167a extends C0912a {
    public static final Parcelable.Creator<C1167a> CREATOR = new C1168a();

    /* renamed from: h */
    public final C0736g<String, Bundle> f3895h;

    /* renamed from: c.e.a.a.a0.a$a */
    static class C1168a implements Parcelable.ClassLoaderCreator<C1167a> {
        C1168a() {
        }

        public C1167a createFromParcel(Parcel parcel) {
            return new C1167a(parcel, (ClassLoader) null, (C1168a) null);
        }

        public C1167a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1167a(parcel, classLoader, (C1168a) null);
        }

        public C1167a[] newArray(int i) {
            return new C1167a[i];
        }
    }

    private C1167a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f3895h = new C0736g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f3895h.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C1167a(Parcel parcel, ClassLoader classLoader, C1168a aVar) {
        this(parcel, classLoader);
    }

    public C1167a(Parcelable parcelable) {
        super(parcelable);
        this.f3895h = new C0736g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f3895h + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f3895h.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f3895h.mo4194b(i2);
            bundleArr[i2] = this.f3895h.mo4199d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
