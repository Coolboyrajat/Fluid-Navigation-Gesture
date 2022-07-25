package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3331e;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3491y;

/* renamed from: kotlinx.coroutines.p0 */
public final class C3521p0<T> extends C3533s0<T> implements C3331e, C3309c<T> {

    /* renamed from: i */
    public Object f8229i = C3530r0.f8246a;

    /* renamed from: j */
    private final C3331e f8230j;

    /* renamed from: k */
    public final Object f8231k;

    /* renamed from: l */
    public final C3556z f8232l;

    /* renamed from: m */
    public final C3309c<T> f8233m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3521p0(C3556z zVar, C3309c<? super T> cVar) {
        super(0);
        C3370k.m12227b(zVar, "dispatcher");
        C3370k.m12227b(cVar, "continuation");
        this.f8232l = zVar;
        this.f8233m = cVar;
        C3309c<T> cVar2 = this.f8233m;
        this.f8230j = (C3331e) (!(cVar2 instanceof C3331e) ? null : cVar2);
        this.f8231k = C3491y.m12593a(mo10038a());
    }

    /* renamed from: a */
    public C3314f mo10038a() {
        return this.f8233m.mo10038a();
    }

    /* renamed from: a */
    public void mo10039a(Object obj) {
        C3314f a;
        Object b;
        C3314f a2 = this.f8233m.mo10038a();
        Object a3 = C3532s.m12768a(obj);
        if (this.f8232l.mo10113b(a2)) {
            this.f8229i = a3;
            this.f8250h = 0;
            this.f8232l.mo10112a(a2, this);
            return;
        }
        C3548x0 a4 = C3406b2.f8069b.mo10120a();
        if (a4.mo10328i()) {
            this.f8229i = a3;
            this.f8250h = 0;
            a4.mo10324a((C3533s0<?>) this);
            return;
        }
        a4.mo10326b(true);
        try {
            a = mo10038a();
            b = C3491y.m12595b(a, this.f8231k);
            this.f8233m.mo10039a(obj);
            Unit unit = Unit.INSTANCE;
            C3491y.m12594a(a, b);
            do {
            } while (a4.mo10330k());
        } catch (Throwable th) {
            try {
                mo10315a(th, (Throwable) null);
            } catch (Throwable th2) {
                a4.mo10325a(true);
                throw th2;
            }
        }
        a4.mo10325a(true);
    }

    /* renamed from: c */
    public C3331e mo10046c() {
        return this.f8230j;
    }

    /* renamed from: d */
    public C3309c<T> mo10156d() {
        return this;
    }

    /* renamed from: e */
    public Object mo10157e() {
        Object obj = this.f8229i;
        if (C3498j0.m12618a()) {
            if (!(obj != C3530r0.f8246a)) {
                throw new AssertionError();
            }
        }
        this.f8229i = C3530r0.f8246a;
        return obj;
    }

    /* renamed from: g */
    public StackTraceElement mo10048g() {
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f8232l + ", " + C3504k0.m12635a((C3309c<?>) this.f8233m) + ']';
    }
}
