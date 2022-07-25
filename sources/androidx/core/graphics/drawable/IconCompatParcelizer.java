package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C0631a;

public class IconCompatParcelizer {
    public static IconCompat read(C0631a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1562a = aVar.mo3640a(iconCompat.f1562a, 1);
        iconCompat.f1564c = aVar.mo3657a(iconCompat.f1564c, 2);
        iconCompat.f1565d = aVar.mo3641a(iconCompat.f1565d, 3);
        iconCompat.f1566e = aVar.mo3640a(iconCompat.f1566e, 4);
        iconCompat.f1567f = aVar.mo3640a(iconCompat.f1567f, 5);
        iconCompat.f1568g = (ColorStateList) aVar.mo3641a(iconCompat.f1568g, 6);
        iconCompat.f1570i = aVar.mo3645a(iconCompat.f1570i, 7);
        iconCompat.mo1983c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0631a aVar) {
        aVar.mo3653a(true, true);
        iconCompat.mo1981a(aVar.mo3668c());
        int i = iconCompat.f1562a;
        if (-1 != i) {
            aVar.mo3660b(i, 1);
        }
        byte[] bArr = iconCompat.f1564c;
        if (bArr != null) {
            aVar.mo3666b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1565d;
        if (parcelable != null) {
            aVar.mo3661b(parcelable, 3);
        }
        int i2 = iconCompat.f1566e;
        if (i2 != 0) {
            aVar.mo3660b(i2, 4);
        }
        int i3 = iconCompat.f1567f;
        if (i3 != 0) {
            aVar.mo3660b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1568g;
        if (colorStateList != null) {
            aVar.mo3661b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.f1570i;
        if (str != null) {
            aVar.mo3664b(str, 7);
        }
    }
}
