package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.internal.C3486t;
import kotlinx.coroutines.internal.C3491y;
import kotlinx.coroutines.p212i2.C3448i;
import kotlinx.coroutines.p212i2.C3449j;

/* renamed from: kotlinx.coroutines.s0 */
public abstract class C3533s0<T> extends C3448i {

    /* renamed from: h */
    public int f8250h;

    public C3533s0(int i) {
        this.f8250h = i;
    }

    /* renamed from: a */
    public void mo10153a(Object obj, Throwable th) {
        C3370k.m12227b(th, "cause");
    }

    /* renamed from: a */
    public final void mo10315a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C3199b.m11853a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th != null) {
                C3404b0.m12305a(mo10156d().mo10038a(), (Throwable) new C3435i0(str, th));
                return;
            }
            C3370k.m12221a();
            throw null;
        }
    }

    /* renamed from: b */
    public final Throwable mo10316b(Object obj) {
        if (!(obj instanceof C3529r)) {
            obj = null;
        }
        C3529r rVar = (C3529r) obj;
        if (rVar != null) {
            return rVar.f8245a;
        }
        return null;
    }

    /* renamed from: c */
    public <T> T mo10155c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public abstract C3309c<T> mo10156d();

    /* renamed from: e */
    public abstract Object mo10157e();

    public final void run() {
        Object obj;
        C3314f a;
        Object b;
        Object c;
        Object obj2;
        C3449j jVar = this.f8141g;
        try {
            C3309c d = mo10156d();
            if (d != null) {
                C3521p0 p0Var = (C3521p0) d;
                C3309c<T> cVar = p0Var.f8233m;
                a = cVar.mo10038a();
                Object e = mo10157e();
                b = C3491y.m12595b(a, p0Var.f8231k);
                Throwable b2 = mo10316b(e);
                C3499j1 j1Var = C3555y1.m12829a(this.f8250h) ? (C3499j1) a.get(C3499j1.f8214d) : null;
                if (b2 == null && j1Var != null && !j1Var.mo10097b()) {
                    CancellationException d2 = j1Var.mo10272d();
                    mo10153a(e, (Throwable) d2);
                    C3262k.C3263a aVar = C3262k.f7982f;
                    c = C3265l.m11978a(C3486t.m12571a(d2, (C3309c<?>) cVar));
                    C3262k.m11974a(c);
                } else if (b2 != null) {
                    C3262k.C3263a aVar2 = C3262k.f7982f;
                    c = C3265l.m11978a(C3486t.m12571a(b2, (C3309c<?>) cVar));
                    C3262k.m11974a(c);
                } else {
                    c = mo10155c(e);
                    C3262k.C3263a aVar3 = C3262k.f7982f;
                    C3262k.m11974a(c);
                }
                cVar.mo10039a(c);
                Unit unit = Unit.INSTANCE;
                C3491y.m12594a(a, b);
                try {
                    C3262k.C3263a aVar4 = C3262k.f7982f;
                    jVar.mo10193g();
                    obj2 = Unit.INSTANCE;
                    C3262k.m11974a(obj2);
                } catch (Throwable th) {
                    C3262k.C3263a aVar5 = C3262k.f7982f;
                    obj2 = C3265l.m11978a(th);
                    C3262k.m11974a(obj2);
                }
                mo10315a((Throwable) null, C3262k.m11975b(obj2));
                return;
            }
            throw new C3269p("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                C3262k.C3263a aVar6 = C3262k.f7982f;
                jVar.mo10193g();
                obj = Unit.INSTANCE;
                C3262k.m11974a(obj);
            } catch (Throwable th3) {
                C3262k.C3263a aVar7 = C3262k.f7982f;
                obj = C3265l.m11978a(th3);
                C3262k.m11974a(obj);
            }
            mo10315a(th2, C3262k.m11975b(obj));
        }
    }
}
