package p179e.p184b.p185a;

import java.util.ArrayList;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.a0 */
public class C2985a0 {

    /* renamed from: a */
    private C2999g0<?> f7745a;

    /* renamed from: b */
    private C2999g0<?> f7746b;

    /* renamed from: c */
    private C2999g0<?> f7747c;

    /* renamed from: d */
    private Object f7748d;

    /* renamed from: e.b.a.a0$a */
    public static final class C2986a {

        /* renamed from: a */
        public static final C2986a f7749a = new C2986a();

        private C2986a() {
        }
    }

    public C2985a0(C2999g0<?> g0Var, C2999g0<?> g0Var2, C2999g0<?> g0Var3, Object obj) {
        this.f7745a = g0Var;
        this.f7746b = g0Var2;
        this.f7747c = g0Var3;
        this.f7748d = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2985a0(C2999g0 g0Var, C2999g0 g0Var2, C2999g0 g0Var3, Object obj, int i, C3366g gVar) {
        this((i & 1) != 0 ? null : g0Var, (i & 2) != 0 ? null : g0Var2, (i & 4) != 0 ? null : g0Var3, (i & 8) != 0 ? C2986a.f7749a : obj);
    }

    /* renamed from: a */
    public final C2999g0<?> mo9104a() {
        return this.f7746b;
    }

    /* renamed from: b */
    public final C2999g0<?> mo9105b() {
        return this.f7745a;
    }

    /* renamed from: c */
    public final Object mo9106c() {
        return this.f7748d;
    }

    /* renamed from: d */
    public final C2999g0<?> mo9107d() {
        return this.f7747c;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = null;
        if (this.f7745a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("contextType=");
            C2999g0<?> g0Var = this.f7745a;
            sb.append(g0Var != null ? g0Var.mo9123d() : null);
            arrayList.add(sb.toString());
        }
        if (this.f7746b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("argType=");
            C2999g0<?> g0Var2 = this.f7746b;
            sb2.append(g0Var2 != null ? g0Var2.mo9123d() : null);
            arrayList.add(sb2.toString());
        }
        if (this.f7747c != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("type=");
            C2999g0<?> g0Var3 = this.f7747c;
            if (g0Var3 != null) {
                str = g0Var3.mo9123d();
            }
            sb3.append(str);
            arrayList.add(sb3.toString());
        }
        if (!C3370k.m12225a(this.f7748d, (Object) C2986a.f7749a)) {
            arrayList.add("tag=" + this.f7748d);
        }
        return '[' + C3292r.m12086a(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C3350b) null, 62, (Object) null) + ']';
    }
}
