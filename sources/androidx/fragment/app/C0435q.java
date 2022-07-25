package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p190io.objectbox.model.PropertyFlags;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.q */
final class C0435q implements Parcelable {
    public static final Parcelable.Creator<C0435q> CREATOR = new C0436a();

    /* renamed from: f */
    final String f1910f;

    /* renamed from: g */
    final String f1911g;

    /* renamed from: h */
    final boolean f1912h;

    /* renamed from: i */
    final int f1913i;

    /* renamed from: j */
    final int f1914j;

    /* renamed from: k */
    final String f1915k;

    /* renamed from: l */
    final boolean f1916l;

    /* renamed from: m */
    final boolean f1917m;

    /* renamed from: n */
    final boolean f1918n;

    /* renamed from: o */
    final Bundle f1919o;

    /* renamed from: p */
    final boolean f1920p;

    /* renamed from: q */
    final int f1921q;

    /* renamed from: r */
    Bundle f1922r;

    /* renamed from: androidx.fragment.app.q$a */
    static class C0436a implements Parcelable.Creator<C0435q> {
        C0436a() {
        }

        public C0435q createFromParcel(Parcel parcel) {
            return new C0435q(parcel);
        }

        public C0435q[] newArray(int i) {
            return new C0435q[i];
        }
    }

    C0435q(Parcel parcel) {
        this.f1910f = parcel.readString();
        this.f1911g = parcel.readString();
        boolean z = true;
        this.f1912h = parcel.readInt() != 0;
        this.f1913i = parcel.readInt();
        this.f1914j = parcel.readInt();
        this.f1915k = parcel.readString();
        this.f1916l = parcel.readInt() != 0;
        this.f1917m = parcel.readInt() != 0;
        this.f1918n = parcel.readInt() != 0;
        this.f1919o = parcel.readBundle();
        this.f1920p = parcel.readInt() == 0 ? false : z;
        this.f1922r = parcel.readBundle();
        this.f1921q = parcel.readInt();
    }

    C0435q(Fragment fragment) {
        this.f1910f = fragment.getClass().getName();
        this.f1911g = fragment.f1738j;
        this.f1912h = fragment.f1746r;
        this.f1913i = fragment.f1708A;
        this.f1914j = fragment.f1709B;
        this.f1915k = fragment.f1710C;
        this.f1916l = fragment.f1713F;
        this.f1917m = fragment.f1745q;
        this.f1918n = fragment.f1712E;
        this.f1919o = fragment.f1739k;
        this.f1920p = fragment.f1711D;
        this.f1921q = fragment.f1728U.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);
        sb.append("FragmentState{");
        sb.append(this.f1910f);
        sb.append(" (");
        sb.append(this.f1911g);
        sb.append(")}:");
        if (this.f1912h) {
            sb.append(" fromLayout");
        }
        if (this.f1914j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1914j));
        }
        String str = this.f1915k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1915k);
        }
        if (this.f1916l) {
            sb.append(" retainInstance");
        }
        if (this.f1917m) {
            sb.append(" removing");
        }
        if (this.f1918n) {
            sb.append(" detached");
        }
        if (this.f1920p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1910f);
        parcel.writeString(this.f1911g);
        parcel.writeInt(this.f1912h ? 1 : 0);
        parcel.writeInt(this.f1913i);
        parcel.writeInt(this.f1914j);
        parcel.writeString(this.f1915k);
        parcel.writeInt(this.f1916l ? 1 : 0);
        parcel.writeInt(this.f1917m ? 1 : 0);
        parcel.writeInt(this.f1918n ? 1 : 0);
        parcel.writeBundle(this.f1919o);
        parcel.writeInt(this.f1920p ? 1 : 0);
        parcel.writeBundle(this.f1922r);
        parcel.writeInt(this.f1921q);
    }
}
