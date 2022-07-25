package p006b.p039i.p040a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.i.a.a */
public abstract class C0912a implements Parcelable {
    public static final Parcelable.Creator<C0912a> CREATOR = new C0914b();

    /* renamed from: g */
    public static final C0912a f3361g = new C0913a();

    /* renamed from: f */
    private final Parcelable f3362f;

    /* renamed from: b.i.a.a$a */
    static class C0913a extends C0912a {
        C0913a() {
            super((C0913a) null);
        }
    }

    /* renamed from: b.i.a.a$b */
    static class C0914b implements Parcelable.ClassLoaderCreator<C0912a> {
        C0914b() {
        }

        public C0912a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        public C0912a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C0912a.f3361g;
            }
            throw new IllegalStateException("superState must be null");
        }

        public C0912a[] newArray(int i) {
            return new C0912a[i];
        }
    }

    private C0912a() {
        this.f3362f = null;
    }

    protected C0912a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3362f = readParcelable == null ? f3361g : readParcelable;
    }

    protected C0912a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3362f = parcelable == f3361g ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ C0912a(C0913a aVar) {
        this();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: q */
    public final Parcelable mo4725q() {
        return this.f3362f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3362f, i);
    }
}
