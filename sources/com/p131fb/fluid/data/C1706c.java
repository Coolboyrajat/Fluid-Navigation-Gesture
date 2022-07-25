package com.p131fb.fluid.data;

import android.content.pm.PackageItemInfo;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.data.c */
public final class C1706c extends PackageItemInfo implements Parcelable {
    public static final Parcelable.Creator<C1706c> CREATOR = new C1707a();

    /* renamed from: com.fb.fluid.data.c$a */
    public static final class C1707a implements Parcelable.Creator<C1706c> {
        C1707a() {
        }

        public C1706c createFromParcel(Parcel parcel) {
            C3370k.m12227b(parcel, "source");
            return new C1706c(parcel);
        }

        public C1706c[] newArray(int i) {
            return new C1706c[i];
        }
    }

    /* renamed from: com.fb.fluid.data.c$b */
    public static final class C1708b {
        private C1708b() {
        }

        public /* synthetic */ C1708b(C3366g gVar) {
            this();
        }
    }

    static {
        new C1708b((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1706c(PackageItemInfo packageItemInfo) {
        super(packageItemInfo);
        C3370k.m12227b(packageItemInfo, "info");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1706c(Parcel parcel) {
        super(parcel);
        C3370k.m12227b(parcel, "source");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3370k.m12227b(parcel, "dest");
        super.writeToParcel(parcel, i);
    }
}
