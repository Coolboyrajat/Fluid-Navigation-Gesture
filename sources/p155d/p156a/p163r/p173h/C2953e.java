package p155d.p156a.p163r.p173h;

import java.io.Serializable;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p163r.p165b.C2849b;

/* renamed from: d.a.r.h.e */
public enum C2953e {
    COMPLETE;

    /* renamed from: d.a.r.h.e$a */
    static final class C2954a implements Serializable {

        /* renamed from: f */
        final C2810b f7682f;

        public String toString() {
            return "NotificationLite.Disposable[" + this.f7682f + "]";
        }
    }

    /* renamed from: d.a.r.h.e$b */
    static final class C2955b implements Serializable {

        /* renamed from: f */
        final Throwable f7683f;

        C2955b(Throwable th) {
            this.f7683f = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2955b) {
                return C2849b.m11139a((Object) this.f7683f, (Object) ((C2955b) obj).f7683f);
            }
            return false;
        }

        public int hashCode() {
            return this.f7683f.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f7683f + "]";
        }
    }

    /* renamed from: a */
    public static Object m11393a() {
        return COMPLETE;
    }

    /* renamed from: a */
    public static <T> T m11394a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public static Object m11395a(Throwable th) {
        return new C2955b(th);
    }

    /* renamed from: a */
    public static <T> boolean m11396a(Object obj, C2793k<? super T> kVar) {
        if (obj == COMPLETE) {
            kVar.mo6033c();
            return true;
        } else if (obj instanceof C2955b) {
            kVar.onError(((C2955b) obj).f7683f);
            return true;
        } else {
            kVar.mo6032a(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m11397b(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: b */
    public static <T> boolean m11398b(Object obj, C2793k<? super T> kVar) {
        if (obj == COMPLETE) {
            kVar.mo6033c();
            return true;
        } else if (obj instanceof C2955b) {
            kVar.onError(((C2955b) obj).f7683f);
            return true;
        } else if (obj instanceof C2954a) {
            kVar.mo6031a(((C2954a) obj).f7682f);
            return false;
        } else {
            kVar.mo6032a(obj);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m11399c(Object obj) {
        return obj instanceof C2955b;
    }

    /* renamed from: d */
    public static <T> Object m11400d(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }
}
