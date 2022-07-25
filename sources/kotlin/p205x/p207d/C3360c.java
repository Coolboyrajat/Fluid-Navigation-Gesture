package kotlin.p205x.p207d;

import java.io.Serializable;
import kotlin.p192b0.C3201b;
import kotlin.p192b0.C3204e;
import kotlin.p205x.C3348b;

/* renamed from: kotlin.x.d.c */
public abstract class C3360c implements C3201b, Serializable {

    /* renamed from: h */
    public static final Object f8028h = C3361a.f8031f;

    /* renamed from: f */
    private transient C3201b f8029f;

    /* renamed from: g */
    protected final Object f8030g;

    /* renamed from: kotlin.x.d.c$a */
    private static class C3361a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C3361a f8031f = new C3361a();

        private C3361a() {
        }
    }

    public C3360c() {
        this(f8028h);
    }

    protected C3360c(Object obj) {
        this.f8030g = obj;
    }

    /* renamed from: b */
    public String mo6062b() {
        throw new AbstractMethodError();
    }

    /* renamed from: e */
    public C3201b mo10063e() {
        C3201b bVar = this.f8029f;
        if (bVar != null) {
            return bVar;
        }
        C3201b f = mo10064f();
        this.f8029f = f;
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C3201b mo10064f();

    /* renamed from: g */
    public Object mo10065g() {
        return this.f8030g;
    }

    /* renamed from: h */
    public C3204e mo6063h() {
        throw new AbstractMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C3201b mo10066i() {
        C3201b e = mo10063e();
        if (e != this) {
            return e;
        }
        throw new C3348b();
    }

    /* renamed from: j */
    public String mo6064j() {
        throw new AbstractMethodError();
    }
}
