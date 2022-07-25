package kotlin.p197u.p199i.p200a;

import kotlin.p197u.C3309c;
import kotlin.p205x.p207d.C3367h;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3384y;

/* renamed from: kotlin.u.i.a.l */
public abstract class C3339l extends C3330d implements C3367h<Object>, C3338k {

    /* renamed from: i */
    private final int f8022i;

    public C3339l(int i, C3309c<Object> cVar) {
        super(cVar);
        this.f8022i = i;
    }

    /* renamed from: d */
    public int mo10058d() {
        return this.f8022i;
    }

    public String toString() {
        if (mo10045b() != null) {
            return super.toString();
        }
        String a = C3384y.m12252a((C3367h) this);
        C3370k.m12223a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
