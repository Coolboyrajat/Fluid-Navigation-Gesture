package kotlinx.coroutines;

import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.a */
public abstract class C3393a<T> extends C3525q1 implements C3499j1, C3309c<T>, C3418e0 {

    /* renamed from: g */
    private final C3314f f8055g = this.f8056h.plus(this);

    /* renamed from: h */
    protected final C3314f f8056h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3393a(C3314f fVar, boolean z) {
        super(z);
        C3370k.m12227b(fVar, "parentContext");
        this.f8056h = fVar;
    }

    /* renamed from: a */
    public final C3314f mo10038a() {
        return this.f8055g;
    }

    /* renamed from: a */
    public final void mo10039a(Object obj) {
        mo10297b(C3532s.m12768a(obj), mo10103p());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10095a(Throwable th, boolean z) {
        C3370k.m12227b(th, "cause");
    }

    /* renamed from: a */
    public final <R> void mo10096a(C3430h0 h0Var, R r, C3351c<? super R, ? super C3309c<? super T>, ? extends Object> cVar) {
        C3370k.m12227b(h0Var, "start");
        C3370k.m12227b(cVar, "block");
        mo10104q();
        h0Var.mo10148a(cVar, r, this);
    }

    /* renamed from: b */
    public boolean mo10097b() {
        return super.mo10097b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10098c(Object obj) {
        if (obj instanceof C3529r) {
            C3529r rVar = (C3529r) obj;
            mo10095a(rVar.f8245a, rVar.mo10312a());
            return;
        }
        mo10099d(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10099d(T t) {
    }

    /* renamed from: d */
    public final void mo10100d(Throwable th) {
        C3370k.m12227b(th, "exception");
        C3404b0.m12305a(this.f8055g, th);
    }

    /* renamed from: f */
    public C3314f mo2649f() {
        return this.f8055g;
    }

    /* renamed from: m */
    public String mo10101m() {
        String a = C3550y.m12801a(this.f8055g);
        if (a == null) {
            return super.mo10101m();
        }
        return '\"' + a + "\":" + super.mo10101m();
    }

    /* renamed from: n */
    public final void mo10102n() {
        mo10105r();
    }

    /* renamed from: p */
    public int mo10103p() {
        return 0;
    }

    /* renamed from: q */
    public final void mo10104q() {
        mo10293a((C3499j1) this.f8056h.get(C3499j1.f8214d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo10105r() {
    }
}
