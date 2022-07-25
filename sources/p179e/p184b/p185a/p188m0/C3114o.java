package p179e.p184b.p185a.p188m0;

import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3002h0;

/* renamed from: e.b.a.m0.o */
abstract class C3114o {

    /* renamed from: e.b.a.m0.o$a */
    public static final class C3115a extends C3114o {

        /* renamed from: a */
        private final boolean f7878a = C3370k.m12225a((Object) mo9224a(), (Object) C3002h0.m11525a());

        /* renamed from: b */
        private final C2999g0<?> f7879b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3115a(C2999g0<?> g0Var) {
            super((C3366g) null);
            C3370k.m12227b(g0Var, "type");
            this.f7879b = g0Var;
        }

        /* renamed from: a */
        public C2999g0<?> mo9224a() {
            return this.f7879b;
        }

        /* renamed from: a */
        public boolean mo9223a(C2999g0<?> g0Var) {
            C3370k.m12227b(g0Var, "other");
            return this.f7878a || mo9224a().mo9115a(g0Var);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C3115a) && C3370k.m12225a((Object) mo9224a(), (Object) ((C3115a) obj).mo9224a());
            }
            return true;
        }

        public int hashCode() {
            C2999g0<?> a = mo9224a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Down(type=" + mo9224a() + ")";
        }
    }

    /* renamed from: e.b.a.m0.o$b */
    public static final class C3116b extends C3114o {

        /* renamed from: a */
        private final C2999g0<?> f7880a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3116b(C2999g0<?> g0Var) {
            super((C3366g) null);
            C3370k.m12227b(g0Var, "type");
            this.f7880a = g0Var;
        }

        /* renamed from: a */
        public C2999g0<?> mo9228a() {
            return this.f7880a;
        }

        /* renamed from: a */
        public boolean mo9223a(C2999g0<?> g0Var) {
            C3370k.m12227b(g0Var, "other");
            return C3370k.m12225a((Object) g0Var, (Object) C3002h0.m11525a()) || g0Var.mo9115a(mo9228a());
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C3116b) && C3370k.m12225a((Object) mo9228a(), (Object) ((C3116b) obj).mo9228a());
            }
            return true;
        }

        public int hashCode() {
            C2999g0<?> a = mo9228a();
            if (a != null) {
                return a.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Up(type=" + mo9228a() + ")";
        }
    }

    private C3114o() {
    }

    public /* synthetic */ C3114o(C3366g gVar) {
        this();
    }

    /* renamed from: a */
    public abstract boolean mo9223a(C2999g0<?> g0Var);
}
