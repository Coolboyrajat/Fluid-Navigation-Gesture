package com.p131fb.fluid.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.data.a */
public final class C1702a implements Parcelable {
    public static final Parcelable.Creator<C1702a> CREATOR = new C1703a();

    /* renamed from: f */
    private final String f4946f;

    /* renamed from: g */
    private final String f4947g;

    /* renamed from: h */
    private final String f4948h;

    /* renamed from: com.fb.fluid.data.a$a */
    public static final class C1703a implements Parcelable.Creator<C1702a> {
        C1703a() {
        }

        public C1702a createFromParcel(Parcel parcel) {
            C3370k.m12227b(parcel, "source");
            return new C1702a(parcel);
        }

        public C1702a[] newArray(int i) {
            return new C1702a[i];
        }
    }

    /* renamed from: com.fb.fluid.data.a$b */
    public static final class C1704b {
        private C1704b() {
        }

        public /* synthetic */ C1704b(C3366g gVar) {
            this();
        }
    }

    static {
        new C1704b((C3366g) null);
    }

    public C1702a() {
        this((String) null, (String) null, (String) null, 7, (C3366g) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1702a(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            java.lang.String r2 = r4.readString()
            if (r2 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            java.lang.String r4 = r4.readString()
            if (r4 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r4 = r1
        L_0x001f:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.data.C1702a.<init>(android.os.Parcel):void");
    }

    public C1702a(String str, String str2, String str3) {
        C3370k.m12227b(str, "intentUri");
        C3370k.m12227b(str2, "iconResName");
        C3370k.m12227b(str3, "label");
        this.f4946f = str;
        this.f4947g = str2;
        this.f4948h = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1702a(String str, String str2, String str3, int i, C3366g gVar) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: q */
    public final String mo6433q() {
        return this.f4947g;
    }

    /* renamed from: r */
    public final String mo6434r() {
        return this.f4946f;
    }

    /* renamed from: s */
    public final String mo6435s() {
        return this.f4948h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3370k.m12227b(parcel, "dest");
        parcel.writeString(this.f4946f);
        parcel.writeString(this.f4947g);
        parcel.writeString(this.f4948h);
    }
}
