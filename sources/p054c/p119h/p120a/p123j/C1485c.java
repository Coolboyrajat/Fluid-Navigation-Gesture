package p054c.p119h.p120a.p123j;

import kotlin.p205x.p207d.C3370k;

/* renamed from: c.h.a.j.c */
public class C1485c {

    /* renamed from: a */
    private final String f4509a;

    /* renamed from: b */
    private final String f4510b;

    /* renamed from: c */
    private final boolean f4511c;

    /* renamed from: d */
    private Object f4512d;

    public C1485c(String str, String str2, String str3, boolean z, Object obj, int i) {
        C3370k.m12227b(str, "key");
        this.f4509a = str;
        this.f4510b = str2;
        this.f4511c = z;
        this.f4512d = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1485c(String str, String str2, String str3, boolean z, Object obj, int i, int i2, C3366g gVar) {
        this(str, str2, str3, z, obj, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* renamed from: a */
    public void mo5950a(Object obj) {
        this.f4512d = obj;
    }

    /* renamed from: a */
    public final boolean mo5951a() {
        return this.f4511c;
    }

    /* renamed from: b */
    public final String mo5952b() {
        return this.f4509a;
    }

    /* renamed from: c */
    public final String mo5953c() {
        return this.f4510b;
    }

    /* renamed from: d */
    public Object mo5954d() {
        return this.f4512d;
    }
}
