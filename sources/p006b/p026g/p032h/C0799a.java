package p006b.p026g.p032h;

import android.util.Base64;
import java.util.List;
import p006b.p026g.p034j.C0837h;

/* renamed from: b.g.h.a */
public final class C0799a {

    /* renamed from: a */
    private final String f3156a;

    /* renamed from: b */
    private final String f3157b;

    /* renamed from: c */
    private final String f3158c;

    /* renamed from: d */
    private final List<List<byte[]>> f3159d;

    /* renamed from: e */
    private final int f3160e = 0;

    /* renamed from: f */
    private final String f3161f = (this.f3156a + "-" + this.f3157b + "-" + this.f3158c);

    public C0799a(String str, String str2, String str3, List<List<byte[]>> list) {
        C0837h.m4534a(str);
        this.f3156a = str;
        C0837h.m4534a(str2);
        this.f3157b = str2;
        C0837h.m4534a(str3);
        this.f3158c = str3;
        C0837h.m4534a(list);
        this.f3159d = list;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo4474a() {
        return this.f3159d;
    }

    /* renamed from: b */
    public int mo4475b() {
        return this.f3160e;
    }

    /* renamed from: c */
    public String mo4476c() {
        return this.f3161f;
    }

    /* renamed from: d */
    public String mo4477d() {
        return this.f3156a;
    }

    /* renamed from: e */
    public String mo4478e() {
        return this.f3157b;
    }

    /* renamed from: f */
    public String mo4479f() {
        return this.f3158c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3156a + ", mProviderPackage: " + this.f3157b + ", mQuery: " + this.f3158c + ", mCertificates:");
        for (int i = 0; i < this.f3159d.size(); i++) {
            sb.append(" [");
            List list = this.f3159d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3160e);
        return sb.toString();
    }
}
