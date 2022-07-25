package p179e.p184b.p185a.p187l0;

import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3002h0;
import p179e.p184b.p185a.C3004i0;
import p179e.p184b.p185a.C3121p;
import p190io.objectbox.android.BuildConfig;

/* renamed from: e.b.a.l0.g */
public interface C3029g<C, A, T> extends C3022a<C, A, T> {

    /* renamed from: e.b.a.l0.g$a */
    public interface C3030a<C, A, T> {

        /* renamed from: a */
        public static final C3031a f7779a = C3031a.f7780a;

        /* renamed from: e.b.a.l0.g$a$a */
        public static final class C3031a {

            /* renamed from: a */
            static final /* synthetic */ C3031a f7780a = new C3031a();

            /* renamed from: e.b.a.l0.g$a$a$a */
            public static final class C3032a implements C3030a<C, A, T> {
                C3032a(C3350b bVar) {
                }
            }

            private C3031a() {
            }

            /* renamed from: a */
            public final <C, A, T> C3030a<C, A, T> mo9145a(C3350b<? super C3121p.C3122a, ? extends C3029g<C, A, T>> bVar) {
                C3370k.m12227b(bVar, "f");
                return new C3032a(bVar);
            }
        }
    }

    /* renamed from: e.b.a.l0.g$b */
    public static final class C3033b {
        /* renamed from: a */
        public static <C, A, T> String m11574a(C3029g<C, A, T> gVar) {
            return gVar.mo9144i();
        }

        /* renamed from: b */
        public static <C, A, T> String m11575b(C3029g<C, A, T> gVar) {
            String str;
            boolean z = !C3370k.m12225a((Object) gVar.mo9140e(), (Object) C3002h0.m11526b());
            String str2 = BuildConfig.FLAVOR;
            if (z) {
                str = gVar.mo9140e().mo9123d() + " -> ";
            } else {
                str = str2;
            }
            C3044p<C> b = gVar.mo9137b() instanceof C3039l ? null : gVar.mo9137b();
            if (b != null) {
                String str3 = "scoped(" + C3004i0.m11529a(b).mo9123d() + ").";
                if (str3 != null) {
                    str2 = str3;
                    return str2 + gVar.mo9144i() + " { " + str + gVar.mo9141f().mo9123d() + " }";
                }
            }
            if (!C3370k.m12225a((Object) gVar.mo9136a(), (Object) C3002h0.m11525a())) {
                str2 = "contexted<" + gVar.mo9136a().mo9123d() + ">().";
            }
            return str2 + gVar.mo9144i() + " { " + str + gVar.mo9141f().mo9123d() + " }";
        }

        /* renamed from: c */
        public static <C, A, T> String m11576c(C3029g<C, A, T> gVar) {
            String str;
            boolean z = !C3370k.m12225a((Object) gVar.mo9140e(), (Object) C3002h0.m11526b());
            String str2 = BuildConfig.FLAVOR;
            if (z) {
                str = gVar.mo9140e().mo9122a() + " -> ";
            } else {
                str = str2;
            }
            C3044p<C> b = gVar.mo9137b() instanceof C3039l ? null : gVar.mo9137b();
            if (b != null) {
                String str3 = "scoped(" + C3004i0.m11529a(b).mo9122a() + ").";
                if (str3 != null) {
                    str2 = str3;
                    return str2 + gVar.mo9143h() + " { " + str + gVar.mo9141f().mo9122a() + " }";
                }
            }
            if (!C3370k.m12225a((Object) gVar.mo9136a(), (Object) C3002h0.m11525a())) {
                str2 = "contexted<" + gVar.mo9136a().mo9122a() + ">().";
            }
            return str2 + gVar.mo9143h() + " { " + str + gVar.mo9141f().mo9122a() + " }";
        }

        /* renamed from: d */
        public static <C, A, T> C3044p<C> m11577d(C3029g<C, A, T> gVar) {
            return null;
        }

        /* renamed from: e */
        public static <C, A, T> boolean m11578e(C3029g<C, A, T> gVar) {
            return false;
        }
    }

    /* renamed from: a */
    C2999g0<? super C> mo9136a();

    /* renamed from: b */
    C3044p<C> mo9137b();

    /* renamed from: c */
    String mo9138c();

    /* renamed from: d */
    boolean mo9139d();

    /* renamed from: e */
    C2999g0<? super A> mo9140e();

    /* renamed from: f */
    C2999g0<? extends T> mo9141f();

    /* renamed from: g */
    String mo9142g();

    /* renamed from: h */
    String mo9143h();

    /* renamed from: i */
    String mo9144i();
}
