package kotlinx.coroutines;

import kotlin.p197u.C3306a;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.d0 */
public final class C3413d0 extends C3306a {

    /* renamed from: g */
    public static final C3414a f8073g = new C3414a((C3366g) null);

    /* renamed from: f */
    private final String f8074f;

    /* renamed from: kotlinx.coroutines.d0$a */
    public static final class C3414a implements C3314f.C3319c<C3413d0> {
        private C3414a() {
        }

        public /* synthetic */ C3414a(C3366g gVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3413d0) && C3370k.m12225a((Object) this.f8074f, (Object) ((C3413d0) obj).f8074f);
        }
        return true;
    }

    /* renamed from: h */
    public final String mo10138h() {
        return this.f8074f;
    }

    public int hashCode() {
        String str = this.f8074f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CoroutineName(" + this.f8074f + ')';
    }
}
