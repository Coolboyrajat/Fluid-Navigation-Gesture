package kotlin.p197u;

import java.io.Serializable;
import kotlin.C3269p;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p190io.objectbox.android.BuildConfig;

/* renamed from: kotlin.u.b */
public final class C3307b implements C3314f, Serializable {

    /* renamed from: f */
    private final C3314f f7997f;

    /* renamed from: g */
    private final C3314f.C3317b f7998g;

    /* renamed from: kotlin.u.b$a */
    static final class C3308a extends C3371l implements C3351c<String, C3314f.C3317b, String> {

        /* renamed from: g */
        public static final C3308a f7999g = new C3308a();

        C3308a() {
            super(2);
        }

        /* renamed from: a */
        public final String mo6125a(String str, C3314f.C3317b bVar) {
            C3370k.m12227b(str, "acc");
            C3370k.m12227b(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C3307b(C3314f fVar, C3314f.C3317b bVar) {
        C3370k.m12227b(fVar, "left");
        C3370k.m12227b(bVar, "element");
        this.f7997f = fVar;
        this.f7998g = bVar;
    }

    /* renamed from: a */
    private final int m12119a() {
        int i = 2;
        C3307b bVar = this;
        while (true) {
            C3314f fVar = bVar.f7997f;
            if (!(fVar instanceof C3307b)) {
                fVar = null;
            }
            bVar = (C3307b) fVar;
            if (bVar == null) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: a */
    private final boolean m12120a(C3307b bVar) {
        while (m12121a(bVar.f7998g)) {
            C3314f fVar = bVar.f7997f;
            if (fVar instanceof C3307b) {
                bVar = (C3307b) fVar;
            } else if (fVar != null) {
                return m12121a((C3314f.C3317b) fVar);
            } else {
                throw new C3269p("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m12121a(C3314f.C3317b bVar) {
        return C3370k.m12225a((Object) get(bVar.getKey()), (Object) bVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3307b) {
                C3307b bVar = (C3307b) obj;
                if (bVar.m12119a() != m12119a() || !bVar.m12120a(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C3351c<? super R, ? super C3314f.C3317b, ? extends R> cVar) {
        C3370k.m12227b(cVar, "operation");
        return cVar.mo6125a(this.f7997f.fold(r, cVar), this.f7998g);
    }

    public <E extends C3314f.C3317b> E get(C3314f.C3319c<E> cVar) {
        C3370k.m12227b(cVar, "key");
        C3307b bVar = this;
        while (true) {
            E e = bVar.f7998g.get(cVar);
            if (e != null) {
                return e;
            }
            C3314f fVar = bVar.f7997f;
            if (!(fVar instanceof C3307b)) {
                return fVar.get(cVar);
            }
            bVar = (C3307b) fVar;
        }
    }

    public int hashCode() {
        return this.f7997f.hashCode() + this.f7998g.hashCode();
    }

    public C3314f minusKey(C3314f.C3319c<?> cVar) {
        C3370k.m12227b(cVar, "key");
        if (this.f7998g.get(cVar) != null) {
            return this.f7997f;
        }
        C3314f minusKey = this.f7997f.minusKey(cVar);
        return minusKey == this.f7997f ? this : minusKey == C3320g.f8003f ? this.f7998g : new C3307b(minusKey, this.f7998g);
    }

    public C3314f plus(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return C3314f.C3315a.m12132a(this, fVar);
    }

    public String toString() {
        return "[" + ((String) fold(BuildConfig.FLAVOR, C3308a.f7999g)) + "]";
    }
}
