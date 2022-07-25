package kotlin;

import java.io.Serializable;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlin.k */
public final class C3262k<T> implements Serializable {

    /* renamed from: f */
    public static final C3263a f7982f = new C3263a((C3366g) null);

    /* renamed from: kotlin.k$a */
    public static final class C3263a {
        private C3263a() {
        }

        public /* synthetic */ C3263a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: kotlin.k$b */
    public static final class C3264b implements Serializable {

        /* renamed from: f */
        public final Throwable f7983f;

        public C3264b(Throwable th) {
            C3370k.m12227b(th, "exception");
            this.f7983f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3264b) && C3370k.m12225a((Object) this.f7983f, (Object) ((C3264b) obj).f7983f);
        }

        public int hashCode() {
            return this.f7983f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f7983f + ')';
        }
    }

    /* renamed from: a */
    public static Object m11974a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m11975b(Object obj) {
        if (obj instanceof C3264b) {
            return ((C3264b) obj).f7983f;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m11976c(Object obj) {
        return obj instanceof C3264b;
    }

    /* renamed from: d */
    public static final boolean m11977d(Object obj) {
        return !(obj instanceof C3264b);
    }
}
