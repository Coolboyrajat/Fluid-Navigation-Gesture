package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.n */
final class C0430n implements Parcelable {
    public static final Parcelable.Creator<C0430n> CREATOR = new C0431a();

    /* renamed from: f */
    ArrayList<C0435q> f1894f;

    /* renamed from: g */
    ArrayList<String> f1895g;

    /* renamed from: h */
    C0397b[] f1896h;

    /* renamed from: i */
    int f1897i;

    /* renamed from: j */
    String f1898j = null;

    /* renamed from: androidx.fragment.app.n$a */
    static class C0431a implements Parcelable.Creator<C0430n> {
        C0431a() {
        }

        public C0430n createFromParcel(Parcel parcel) {
            return new C0430n(parcel);
        }

        public C0430n[] newArray(int i) {
            return new C0430n[i];
        }
    }

    public C0430n() {
    }

    public C0430n(Parcel parcel) {
        this.f1894f = parcel.createTypedArrayList(C0435q.CREATOR);
        this.f1895g = parcel.createStringArrayList();
        this.f1896h = (C0397b[]) parcel.createTypedArray(C0397b.CREATOR);
        this.f1897i = parcel.readInt();
        this.f1898j = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1894f);
        parcel.writeStringList(this.f1895g);
        parcel.writeTypedArray(this.f1896h, i);
        parcel.writeInt(this.f1897i);
        parcel.writeString(this.f1898j);
    }
}
