package p155d.p156a.p163r.p165b;

import java.util.Comparator;
import java.util.concurrent.Callable;
import p155d.p156a.p161p.C2820c;
import p155d.p156a.p162q.C2823a;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p162q.C2828f;
import p155d.p156a.p162q.C2829g;
import p155d.p156a.p162q.C2830h;
import p155d.p156a.p176u.C2962a;
import p179e.p189c.C3141b;

/* renamed from: d.a.r.b.a */
public final class C2836a {

    /* renamed from: a */
    static final C2828f<Object, Object> f7419a = new C2843g();

    /* renamed from: b */
    public static final Runnable f7420b = new C2840d();

    /* renamed from: c */
    public static final C2823a f7421c = new C2837a();

    /* renamed from: d */
    static final C2827e<Object> f7422d = new C2838b();

    /* renamed from: e */
    public static final C2827e<Throwable> f7423e = new C2847k();

    /* renamed from: d.a.r.b.a$a */
    static final class C2837a implements C2823a {
        C2837a() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: d.a.r.b.a$b */
    static final class C2838b implements C2827e<Object> {
        C2838b() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: d.a.r.b.a$c */
    static final class C2839c implements C2829g {
        C2839c() {
        }
    }

    /* renamed from: d.a.r.b.a$d */
    static final class C2840d implements Runnable {
        C2840d() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: d.a.r.b.a$e */
    static final class C2841e implements C2827e<Throwable> {
        C2841e() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C2962a.m11431b(th);
        }
    }

    /* renamed from: d.a.r.b.a$f */
    static final class C2842f implements C2830h<Object> {
        C2842f() {
        }

        /* renamed from: a */
        public boolean mo6042a(Object obj) {
            return false;
        }
    }

    /* renamed from: d.a.r.b.a$g */
    static final class C2843g implements C2828f<Object, Object> {
        C2843g() {
        }

        /* renamed from: a */
        public Object mo6044a(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: d.a.r.b.a$h */
    static final class C2844h implements C2827e<C3141b> {
        C2844h() {
        }

        /* renamed from: a */
        public void accept(C3141b bVar) {
            bVar.mo9253a(Long.MAX_VALUE);
        }
    }

    /* renamed from: d.a.r.b.a$i */
    static final class C2845i implements Comparator<Object> {
        C2845i() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: d.a.r.b.a$j */
    static final class C2846j implements Callable<Object> {
        C2846j() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: d.a.r.b.a$k */
    static final class C2847k implements C2827e<Throwable> {
        C2847k() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C2962a.m11431b((Throwable) new C2820c(th));
        }
    }

    /* renamed from: d.a.r.b.a$l */
    static final class C2848l implements C2830h<Object> {
        C2848l() {
        }

        /* renamed from: a */
        public boolean mo6042a(Object obj) {
            return true;
        }
    }

    static {
        new C2841e();
        new C2839c();
        new C2848l();
        new C2842f();
        new C2846j();
        new C2845i();
        new C2844h();
    }

    /* renamed from: a */
    public static <T> C2827e<T> m11126a() {
        return f7422d;
    }

    /* renamed from: b */
    public static <T> C2828f<T, T> m11127b() {
        return f7419a;
    }
}
