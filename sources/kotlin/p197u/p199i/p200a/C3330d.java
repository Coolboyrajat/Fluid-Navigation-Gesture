package kotlin.p197u.p199i.p200a;

import kotlin.p197u.C3309c;
import kotlin.p197u.C3310d;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.u.i.a.d */
public abstract class C3330d extends C3327a {

    /* renamed from: g */
    private transient C3309c<Object> f8014g;

    /* renamed from: h */
    private final C3314f f8015h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3330d(C3309c<Object> cVar) {
        this(cVar, cVar != null ? cVar.mo10038a() : null);
    }

    public C3330d(C3309c<Object> cVar, C3314f fVar) {
        super(cVar);
        this.f8015h = fVar;
    }

    /* renamed from: a */
    public C3314f mo10038a() {
        C3314f fVar = this.f8015h;
        if (fVar != null) {
            return fVar;
        }
        C3370k.m12221a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo10047e() {
        C3309c<Object> cVar = this.f8014g;
        if (!(cVar == null || cVar == this)) {
            C3314f.C3317b bVar = mo10038a().get(C3310d.f8000b);
            if (bVar != null) {
                ((C3310d) bVar).mo10040a(cVar);
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
        this.f8014g = C3329c.f8013f;
    }

    /* renamed from: f */
    public final C3309c<Object> mo10051f() {
        C3309c<Object> cVar = this.f8014g;
        if (cVar == null) {
            C3310d dVar = (C3310d) mo10038a().get(C3310d.f8000b);
            if (dVar == null || (cVar = dVar.mo10041b(this)) == null) {
                cVar = this;
            }
            this.f8014g = cVar;
        }
        return cVar;
    }
}
