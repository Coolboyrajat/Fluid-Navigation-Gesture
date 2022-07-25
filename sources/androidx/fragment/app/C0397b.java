package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0438s;
import androidx.lifecycle.C0481i;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
final class C0397b implements Parcelable {
    public static final Parcelable.Creator<C0397b> CREATOR = new C0398a();

    /* renamed from: f */
    final int[] f1780f;

    /* renamed from: g */
    final ArrayList<String> f1781g;

    /* renamed from: h */
    final int[] f1782h;

    /* renamed from: i */
    final int[] f1783i;

    /* renamed from: j */
    final int f1784j;

    /* renamed from: k */
    final String f1785k;

    /* renamed from: l */
    final int f1786l;

    /* renamed from: m */
    final int f1787m;

    /* renamed from: n */
    final CharSequence f1788n;

    /* renamed from: o */
    final int f1789o;

    /* renamed from: p */
    final CharSequence f1790p;

    /* renamed from: q */
    final ArrayList<String> f1791q;

    /* renamed from: r */
    final ArrayList<String> f1792r;

    /* renamed from: s */
    final boolean f1793s;

    /* renamed from: androidx.fragment.app.b$a */
    static class C0398a implements Parcelable.Creator<C0397b> {
        C0398a() {
        }

        public C0397b createFromParcel(Parcel parcel) {
            return new C0397b(parcel);
        }

        public C0397b[] newArray(int i) {
            return new C0397b[i];
        }
    }

    public C0397b(Parcel parcel) {
        this.f1780f = parcel.createIntArray();
        this.f1781g = parcel.createStringArrayList();
        this.f1782h = parcel.createIntArray();
        this.f1783i = parcel.createIntArray();
        this.f1784j = parcel.readInt();
        this.f1785k = parcel.readString();
        this.f1786l = parcel.readInt();
        this.f1787m = parcel.readInt();
        this.f1788n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1789o = parcel.readInt();
        this.f1790p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1791q = parcel.createStringArrayList();
        this.f1792r = parcel.createStringArrayList();
        this.f1793s = parcel.readInt() != 0;
    }

    public C0397b(C0396a aVar) {
        int size = aVar.f1925a.size();
        this.f1780f = new int[(size * 5)];
        if (aVar.f1931g) {
            this.f1781g = new ArrayList<>(size);
            this.f1782h = new int[size];
            this.f1783i = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0438s.C0439a aVar2 = aVar.f1925a.get(i);
                int i3 = i2 + 1;
                this.f1780f[i2] = aVar2.f1941a;
                ArrayList<String> arrayList = this.f1781g;
                Fragment fragment = aVar2.f1942b;
                arrayList.add(fragment != null ? fragment.f1738j : null);
                int[] iArr = this.f1780f;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f1943c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1944d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1945e;
                iArr[i6] = aVar2.f1946f;
                this.f1782h[i] = aVar2.f1947g.ordinal();
                this.f1783i[i] = aVar2.f1948h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f1784j = aVar.f1930f;
            this.f1785k = aVar.f1932h;
            this.f1786l = aVar.f1779s;
            this.f1787m = aVar.f1933i;
            this.f1788n = aVar.f1934j;
            this.f1789o = aVar.f1935k;
            this.f1790p = aVar.f1936l;
            this.f1791q = aVar.f1937m;
            this.f1792r = aVar.f1938n;
            this.f1793s = aVar.f1939o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0396a mo2346a(C0411l lVar) {
        C0396a aVar = new C0396a(lVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f1780f.length) {
            C0438s.C0439a aVar2 = new C0438s.C0439a();
            int i3 = i + 1;
            aVar2.f1941a = this.f1780f[i];
            if (C0411l.f1831F) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f1780f[i3]);
            }
            String str = this.f1781g.get(i2);
            aVar2.f1942b = str != null ? lVar.mo2454a(str) : null;
            aVar2.f1947g = C0481i.C0483b.values()[this.f1782h[i2]];
            aVar2.f1948h = C0481i.C0483b.values()[this.f1783i[i2]];
            int[] iArr = this.f1780f;
            int i4 = i3 + 1;
            aVar2.f1943c = iArr[i3];
            int i5 = i4 + 1;
            aVar2.f1944d = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f1945e = iArr[i5];
            aVar2.f1946f = iArr[i6];
            aVar.f1926b = aVar2.f1943c;
            aVar.f1927c = aVar2.f1944d;
            aVar.f1928d = aVar2.f1945e;
            aVar.f1929e = aVar2.f1946f;
            aVar.mo2595a(aVar2);
            i2++;
            i = i6 + 1;
        }
        aVar.f1930f = this.f1784j;
        aVar.f1932h = this.f1785k;
        aVar.f1779s = this.f1786l;
        aVar.f1931g = true;
        aVar.f1933i = this.f1787m;
        aVar.f1934j = this.f1788n;
        aVar.f1935k = this.f1789o;
        aVar.f1936l = this.f1790p;
        aVar.f1937m = this.f1791q;
        aVar.f1938n = this.f1792r;
        aVar.f1939o = this.f1793s;
        aVar.mo2335b(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1780f);
        parcel.writeStringList(this.f1781g);
        parcel.writeIntArray(this.f1782h);
        parcel.writeIntArray(this.f1783i);
        parcel.writeInt(this.f1784j);
        parcel.writeString(this.f1785k);
        parcel.writeInt(this.f1786l);
        parcel.writeInt(this.f1787m);
        TextUtils.writeToParcel(this.f1788n, parcel, 0);
        parcel.writeInt(this.f1789o);
        TextUtils.writeToParcel(this.f1790p, parcel, 0);
        parcel.writeStringList(this.f1791q);
        parcel.writeStringList(this.f1792r);
        parcel.writeInt(this.f1793s ? 1 : 0);
    }
}
