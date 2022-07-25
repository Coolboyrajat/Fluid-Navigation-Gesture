package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0630a();

    /* renamed from: f */
    private final C0633c f2514f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0630a implements Parcelable.Creator<ParcelImpl> {
        C0630a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f2514f = new C0632b(parcel).mo3675j();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0632b(parcel).mo3648a(this.f2514f);
    }
}
