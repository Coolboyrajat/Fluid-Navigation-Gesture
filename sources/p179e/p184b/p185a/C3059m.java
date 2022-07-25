package p179e.p184b.p185a;

import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p179e.p184b.p185a.C3117n;
import p179e.p184b.p185a.p187l0.C3029g;
import p179e.p184b.p185a.p187l0.C3044p;
import p179e.p184b.p185a.p188m0.C3096k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: e.b.a.m */
public interface C3059m extends C3117n {

    /* renamed from: e */
    public static final C3065c f7808e = C3065c.f7810b;

    /* renamed from: e.b.a.m$a */
    public interface C3060a<C> {

        /* renamed from: e.b.a.m$a$a */
        public interface C3061a<C> extends C3060a<C> {
        }

        /* renamed from: e.b.a.m$a$b */
        public interface C3062b<C> extends C3060a<C> {
            /* renamed from: b */
            C3044p<C> mo9167b();
        }

        /* renamed from: a */
        C2999g0<C> mo9166a();
    }

    /* renamed from: e.b.a.m$b */
    public interface C3063b extends C3060a.C3061a<Object>, C3060a.C3062b<Object> {

        /* renamed from: e.b.a.m$b$a */
        public interface C3064a<T> {
            /* renamed from: a */
            <C, A> void mo9169a(C3029g<? super C, ? super A, ? extends T> gVar);
        }

        /* renamed from: a */
        <T> C3064a<T> mo9168a(C2999g0<? extends T> g0Var, Object obj, Boolean bool);
    }

    /* renamed from: e.b.a.m$c */
    public static final class C3065c {

        /* renamed from: a */
        private static boolean f7809a;

        /* renamed from: b */
        static final /* synthetic */ C3065c f7810b = new C3065c();

        /* renamed from: e.b.a.m$c$a */
        static final class C3066a extends C3371l implements C3349a<C3096k> {

            /* renamed from: g */
            final /* synthetic */ boolean f7811g;

            /* renamed from: h */
            final /* synthetic */ C3350b f7812h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3066a(boolean z, C3350b bVar) {
                super(0);
                this.f7811g = z;
                this.f7812h = bVar;
            }

            public final C3096k invoke() {
                return new C3096k(this.f7811g, (C3350b<? super C3072g, Unit>) this.f7812h);
            }
        }

        private C3065c() {
        }

        /* renamed from: a */
        public static /* synthetic */ C3138y m11635a(C3065c cVar, boolean z, C3350b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return cVar.mo9170a(z, bVar);
        }

        /* renamed from: a */
        public final C3138y mo9170a(boolean z, C3350b<? super C3072g, Unit> bVar) {
            C3370k.m12227b(bVar, "init");
            return new C3138y(new C3066a(z, bVar));
        }

        /* renamed from: a */
        public final boolean mo9171a() {
            return f7809a;
        }
    }

    /* renamed from: e.b.a.m$d */
    public static final class C3067d {
        /* renamed from: a */
        public static C3059m m11638a(C3059m mVar) {
            return mVar;
        }

        /* renamed from: b */
        public static C3125q<?> m11639b(C3059m mVar) {
            return C3117n.C3118a.m11764a(mVar);
        }

        /* renamed from: c */
        public static C3134v m11640c(C3059m mVar) {
            return C3117n.C3118a.m11765b(mVar);
        }
    }

    /* renamed from: e.b.a.m$e */
    public static final class C3068e extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3068e(String str) {
            super(str);
            C3370k.m12227b(str, "message");
        }
    }

    /* renamed from: e.b.a.m$f */
    public static final class C3069f<C, A, T> {

        /* renamed from: a */
        private int f7813a;

        /* renamed from: b */
        private final C2999g0<? super C> f7814b;

        /* renamed from: c */
        private final C2999g0<? super A> f7815c;

        /* renamed from: d */
        private final C2999g0<? extends T> f7816d;

        /* renamed from: e */
        private final Object f7817e;

        /* renamed from: e.b.a.m$f$a */
        static final /* synthetic */ class C3070a extends C3368i implements C3350b<C2999g0<? extends Object>, String> {

            /* renamed from: j */
            public static final C3070a f7818j = new C3070a();

            C3070a() {
                super(1);
            }

            /* renamed from: a */
            public final String mo5146a(C2999g0<?> g0Var) {
                C3370k.m12227b(g0Var, "p1");
                return g0Var.mo9123d();
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "simpleDispString";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C2999g0.class);
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "simpleDispString()Ljava/lang/String;";
            }
        }

        /* renamed from: e.b.a.m$f$b */
        static final /* synthetic */ class C3071b extends C3368i implements C3350b<C2999g0<? extends Object>, String> {

            /* renamed from: j */
            public static final C3071b f7819j = new C3071b();

            C3071b() {
                super(1);
            }

            /* renamed from: a */
            public final String mo5146a(C2999g0<?> g0Var) {
                C3370k.m12227b(g0Var, "p1");
                return g0Var.mo9122a();
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "fullDispString";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C2999g0.class);
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "fullDispString()Ljava/lang/String;";
            }
        }

        public C3069f(C2999g0<? super C> g0Var, C2999g0<? super A> g0Var2, C2999g0<? extends T> g0Var3, Object obj) {
            C3370k.m12227b(g0Var, "contextType");
            C3370k.m12227b(g0Var2, "argType");
            C3370k.m12227b(g0Var3, "type");
            this.f7814b = g0Var;
            this.f7815c = g0Var2;
            this.f7816d = g0Var3;
            this.f7817e = obj;
        }

        /* renamed from: a */
        public static /* synthetic */ C3069f m11641a(C3069f fVar, C2999g0<? super C> g0Var, C2999g0<? super A> g0Var2, C2999g0<? extends T> g0Var3, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                g0Var = fVar.f7814b;
            }
            if ((i & 2) != 0) {
                g0Var2 = fVar.f7815c;
            }
            if ((i & 4) != 0) {
                g0Var3 = fVar.f7816d;
            }
            if ((i & 8) != 0) {
                obj = fVar.f7817e;
            }
            return fVar.mo9173a(g0Var, g0Var2, g0Var3, obj);
        }

        /* renamed from: a */
        private final void m11642a(StringBuilder sb, C3350b<? super C2999g0<?>, String> bVar) {
            sb.append(" with ");
            if (!C3370k.m12225a((Object) this.f7814b, (Object) C3002h0.m11525a())) {
                sb.append("?<" + bVar.mo5146a(this.f7814b) + ">().");
            }
            sb.append("? { ");
            if (!C3370k.m12225a((Object) this.f7815c, (Object) C3002h0.m11526b())) {
                sb.append(bVar.mo5146a(this.f7815c));
                sb.append(" -> ");
            }
            sb.append("? }");
        }

        /* renamed from: a */
        public final C2999g0<? super A> mo9172a() {
            return this.f7815c;
        }

        /* renamed from: a */
        public final C3069f<C, A, T> mo9173a(C2999g0<? super C> g0Var, C2999g0<? super A> g0Var2, C2999g0<? extends T> g0Var3, Object obj) {
            C3370k.m12227b(g0Var, "contextType");
            C3370k.m12227b(g0Var2, "argType");
            C3370k.m12227b(g0Var3, "type");
            return new C3069f<>(g0Var, g0Var2, g0Var3, obj);
        }

        /* renamed from: b */
        public final String mo9174b() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("bind<");
            sb.append(this.f7816d.mo9123d());
            sb.append(">(");
            if (this.f7817e != null) {
                str = "tag = \"" + this.f7817e + '\"';
            } else {
                str = BuildConfig.FLAVOR;
            }
            sb.append(str);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: c */
        public final String mo9175c() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("bind<");
            sb.append(this.f7816d.mo9122a());
            sb.append(">(");
            if (this.f7817e != null) {
                str = "tag = \"" + this.f7817e + '\"';
            } else {
                str = BuildConfig.FLAVOR;
            }
            sb.append(str);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: d */
        public final C2999g0<? super C> mo9176d() {
            return this.f7814b;
        }

        /* renamed from: e */
        public final String mo9177e() {
            StringBuilder sb = new StringBuilder();
            sb.append(mo9174b());
            m11642a(sb, C3070a.f7818j);
            String sb2 = sb.toString();
            C3370k.m12223a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3069f)) {
                return false;
            }
            C3069f fVar = (C3069f) obj;
            return C3370k.m12225a((Object) this.f7814b, (Object) fVar.f7814b) && C3370k.m12225a((Object) this.f7815c, (Object) fVar.f7815c) && C3370k.m12225a((Object) this.f7816d, (Object) fVar.f7816d) && C3370k.m12225a(this.f7817e, fVar.f7817e);
        }

        /* renamed from: f */
        public final String mo9179f() {
            StringBuilder sb = new StringBuilder();
            sb.append(mo9175c());
            m11642a(sb, C3071b.f7819j);
            String sb2 = sb.toString();
            C3370k.m12223a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        /* renamed from: g */
        public final String mo9180g() {
            return "(context: " + this.f7814b.mo9123d() + ", arg: " + this.f7815c.mo9123d() + ", type: " + this.f7816d.mo9123d() + ", tag: " + this.f7817e + ')';
        }

        /* renamed from: h */
        public final Object mo9181h() {
            return this.f7817e;
        }

        public int hashCode() {
            if (this.f7813a == 0) {
                this.f7813a = this.f7814b.hashCode();
                this.f7813a = (this.f7813a * 31) + this.f7815c.hashCode();
                this.f7813a = this.f7816d.hashCode() * 29;
                int i = this.f7813a * 23;
                Object obj = this.f7817e;
                this.f7813a = i + (obj != null ? obj.hashCode() : 0);
            }
            return this.f7813a;
        }

        /* renamed from: i */
        public final C2999g0<? extends T> mo9183i() {
            return this.f7816d;
        }

        public String toString() {
            return mo9177e();
        }
    }

    /* renamed from: e.b.a.m$g */
    public interface C3072g extends C3063b {
    }

    /* renamed from: e.b.a.m$h */
    public static final class C3073h extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3073h(C3069f<?, ?, ?> fVar, String str) {
            super(str);
            C3370k.m12227b(fVar, "key");
            C3370k.m12227b(str, "message");
        }
    }

    /* renamed from: e.b.a.m$i */
    public static final class C3074i extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3074i(String str) {
            super(str);
            C3370k.m12227b(str, "message");
        }
    }

    /* renamed from: b */
    C3121p mo9165b();
}
