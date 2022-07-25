package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p006b.p021d.C0723a;
import p190io.objectbox.android.BuildConfig;

/* renamed from: androidx.versionedparcelable.b */
class C0632b extends C0631a {

    /* renamed from: d */
    private final SparseIntArray f2518d;

    /* renamed from: e */
    private final Parcel f2519e;

    /* renamed from: f */
    private final int f2520f;

    /* renamed from: g */
    private final int f2521g;

    /* renamed from: h */
    private final String f2522h;

    /* renamed from: i */
    private int f2523i;

    /* renamed from: j */
    private int f2524j;

    /* renamed from: k */
    private int f2525k;

    C0632b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C0723a(), new C0723a(), new C0723a());
    }

    private C0632b(Parcel parcel, int i, int i2, String str, C0723a<String, Method> aVar, C0723a<String, Method> aVar2, C0723a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2518d = new SparseIntArray();
        this.f2523i = -1;
        this.f2524j = 0;
        this.f2525k = -1;
        this.f2519e = parcel;
        this.f2520f = i;
        this.f2521g = i2;
        this.f2524j = this.f2520f;
        this.f2522h = str;
    }

    /* renamed from: a */
    public void mo3646a() {
        int i = this.f2523i;
        if (i >= 0) {
            int i2 = this.f2518d.get(i);
            int dataPosition = this.f2519e.dataPosition();
            this.f2519e.setDataPosition(i2);
            this.f2519e.writeInt(dataPosition - i2);
            this.f2519e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo3647a(Parcelable parcelable) {
        this.f2519e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3650a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2519e, 0);
    }

    /* renamed from: a */
    public void mo3651a(String str) {
        this.f2519e.writeString(str);
    }

    /* renamed from: a */
    public void mo3652a(boolean z) {
        this.f2519e.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo3654a(byte[] bArr) {
        if (bArr != null) {
            this.f2519e.writeInt(bArr.length);
            this.f2519e.writeByteArray(bArr);
            return;
        }
        this.f2519e.writeInt(-1);
    }

    /* renamed from: a */
    public boolean mo3655a(int i) {
        while (this.f2524j < this.f2521g) {
            int i2 = this.f2525k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2519e.setDataPosition(this.f2524j);
            int readInt = this.f2519e.readInt();
            this.f2525k = this.f2519e.readInt();
            this.f2524j += readInt;
        }
        return this.f2525k == i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0631a mo3658b() {
        Parcel parcel = this.f2519e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2524j;
        if (i == this.f2520f) {
            i = this.f2521g;
        }
        int i2 = i;
        return new C0632b(parcel, dataPosition, i2, this.f2522h + "  ", this.f2515a, this.f2516b, this.f2517c);
    }

    /* renamed from: b */
    public void mo3659b(int i) {
        mo3646a();
        this.f2523i = i;
        this.f2518d.put(i, this.f2519e.dataPosition());
        mo3667c(0);
        mo3667c(i);
    }

    /* renamed from: c */
    public void mo3667c(int i) {
        this.f2519e.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo3669d() {
        return this.f2519e.readInt() != 0;
    }

    /* renamed from: e */
    public byte[] mo3670e() {
        int readInt = this.f2519e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2519e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CharSequence mo3671f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2519e);
    }

    /* renamed from: g */
    public int mo3672g() {
        return this.f2519e.readInt();
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo3673h() {
        return this.f2519e.readParcelable(C0632b.class.getClassLoader());
    }

    /* renamed from: i */
    public String mo3674i() {
        return this.f2519e.readString();
    }
}
