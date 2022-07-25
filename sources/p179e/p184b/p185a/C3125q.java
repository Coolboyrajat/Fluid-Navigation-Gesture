package p179e.p184b.p185a;

import kotlin.p205x.p207d.C3370k;

/* renamed from: e.b.a.q */
public interface C3125q<C> {

    /* renamed from: a */
    public static final C3126a f7885a = C3126a.f7886a;

    /* renamed from: e.b.a.q$a */
    public static final class C3126a {

        /* renamed from: a */
        static final /* synthetic */ C3126a f7886a = new C3126a();

        private C3126a() {
        }

        /* renamed from: a */
        public final <C> C3125q<C> mo9235a(C2999g0<? super C> g0Var, C c) {
            C3370k.m12227b(g0Var, "type");
            return new C3127b(g0Var, c);
        }
    }

    /* renamed from: e.b.a.q$b */
    public static final class C3127b<C> implements C3125q<C> {

        /* renamed from: b */
        private final C2999g0<? super C> f7887b;

        /* renamed from: c */
        private final C f7888c;

        public C3127b(C2999g0<? super C> g0Var, C c) {
            C3370k.m12227b(g0Var, "type");
            this.f7887b = g0Var;
            this.f7888c = c;
        }

        /* renamed from: a */
        public C2999g0<? super C> mo9233a() {
            return this.f7887b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3127b)) {
                return false;
            }
            C3127b bVar = (C3127b) obj;
            return C3370k.m12225a((Object) mo9233a(), (Object) bVar.mo9233a()) && C3370k.m12225a(getValue(), bVar.getValue());
        }

        public C getValue() {
            return this.f7888c;
        }

        public int hashCode() {
            C2999g0 a = mo9233a();
            int i = 0;
            int hashCode = (a != null ? a.hashCode() : 0) * 31;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Value(type=" + mo9233a() + ", value=" + getValue() + ")";
        }
    }

    /* renamed from: a */
    C2999g0<? super C> mo9233a();

    C getValue();
}
