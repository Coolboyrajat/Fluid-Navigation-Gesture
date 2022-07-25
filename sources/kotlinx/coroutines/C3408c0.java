package kotlinx.coroutines;

import kotlin.p197u.C3306a;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3396a2;

/* renamed from: kotlinx.coroutines.c0 */
public final class C3408c0 extends C3306a implements C3396a2<String> {

    /* renamed from: g */
    public static final C3409a f8071g = new C3409a((C3366g) null);

    /* renamed from: f */
    private final long f8072f;

    /* renamed from: kotlinx.coroutines.c0$a */
    public static final class C3409a implements C3314f.C3319c<C3408c0> {
        private C3409a() {
        }

        public /* synthetic */ C3409a(C3366g gVar) {
            this();
        }
    }

    public C3408c0(long j) {
        super(f8071g);
        this.f8072f = j;
    }

    /* renamed from: a */
    public String m12314a(C3314f fVar) {
        String str;
        C3370k.m12227b(fVar, "context");
        C3413d0 d0Var = (C3413d0) fVar.get(C3413d0.f8073g);
        if (d0Var == null || (str = d0Var.mo10138h()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        C3370k.m12223a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        C3370k.m12223a((Object) name, "oldName");
        int b = C3251o.m11955b((CharSequence) name, " @", 0, false, 6, (Object) null);
        if (b < 0) {
            b = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + b + 10);
        String substring = name.substring(0, b);
        C3370k.m12223a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f8072f);
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    /* renamed from: a */
    public void mo10107a(C3314f fVar, String str) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(str, "oldState");
        Thread currentThread = Thread.currentThread();
        C3370k.m12223a((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3408c0) {
                if (this.f8072f == ((C3408c0) obj).f8072f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
        C3370k.m12227b(cVar, "operation");
        return C3396a2.C3397a.m12293a(this, r, cVar);
    }

    public <E extends C3314f.C3317b> E get(C3314f.C3319c<E> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3396a2.C3397a.m12294a(this, cVar);
    }

    /* renamed from: h */
    public final long mo10126h() {
        return this.f8072f;
    }

    public int hashCode() {
        long j = this.f8072f;
        return (int) (j ^ (j >>> 32));
    }

    public C3314f minusKey(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        return C3396a2.C3397a.m12296b(this, cVar);
    }

    public C3314f plus(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return C3396a2.C3397a.m12295a(this, fVar);
    }

    public String toString() {
        return "CoroutineId(" + this.f8072f + ')';
    }
}
