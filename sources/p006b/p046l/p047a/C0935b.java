package p006b.p046l.p047a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0474c0;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0497t;
import androidx.lifecycle.C0498u;
import androidx.lifecycle.C0508z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p021d.C0737h;
import p006b.p026g.p034j.C0830a;
import p006b.p046l.p048b.C0940a;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.l.a.b */
class C0935b extends C0934a {

    /* renamed from: c */
    static boolean f3410c;

    /* renamed from: a */
    private final C0490o f3411a;

    /* renamed from: b */
    private final C0938c f3412b;

    /* renamed from: b.l.a.b$a */
    public static class C0936a<D> extends C0497t<D> implements C0940a.C0941a<D> {

        /* renamed from: a */
        private final int f3413a;

        /* renamed from: b */
        private final Bundle f3414b;

        /* renamed from: c */
        private final C0940a<D> f3415c;

        /* renamed from: d */
        private C0490o f3416d;

        /* renamed from: e */
        private C0937b<D> f3417e;

        /* renamed from: f */
        private C0940a<D> f3418f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0940a<D> mo4787a(boolean z) {
            if (C0935b.f3410c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f3415c.mo4794a();
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4788a() {
            C0490o oVar = this.f3416d;
            C0937b<D> bVar = this.f3417e;
            if (oVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(oVar, bVar);
            }
        }

        /* renamed from: a */
        public void mo4789a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3413a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3414b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3415c);
            C0940a<D> aVar = this.f3415c;
            aVar.mo4793a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: protected */
        public void onActive() {
            if (C0935b.f3410c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f3415c.mo4796c();
            throw null;
        }

        /* access modifiers changed from: protected */
        public void onInactive() {
            if (C0935b.f3410c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f3415c.mo4797d();
            throw null;
        }

        public void removeObserver(C0498u<? super D> uVar) {
            super.removeObserver(uVar);
            this.f3416d = null;
            this.f3417e = null;
        }

        public void setValue(D d) {
            super.setValue(d);
            C0940a<D> aVar = this.f3418f;
            if (aVar != null) {
                aVar.mo4795b();
                throw null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3413a);
            sb.append(" : ");
            C0830a.m4522a(this.f3415c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: b.l.a.b$b */
    static class C0937b<D> implements C0498u<D> {
    }

    /* renamed from: b.l.a.b$c */
    static class C0938c extends C0508z {

        /* renamed from: h */
        private static final C0464a0.C0466b f3419h = new C0939a();

        /* renamed from: g */
        private C0737h<C0936a> f3420g = new C0737h<>();

        /* renamed from: b.l.a.b$c$a */
        static class C0939a implements C0464a0.C0466b {
            C0939a() {
            }

            /* renamed from: a */
            public <T extends C0508z> T mo2570a(Class<T> cls) {
                return new C0938c();
            }
        }

        C0938c() {
        }

        /* renamed from: a */
        static C0938c m5004a(C0474c0 c0Var) {
            return (C0938c) new C0464a0(c0Var, f3419h).mo2674a(C0938c.class);
        }

        /* renamed from: a */
        public void mo4791a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3420g.mo4217b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f3420g.mo4217b() > 0) {
                    C0936a e = this.f3420g.mo4224e(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3420g.mo4220c(0));
                    printWriter.print(": ");
                    printWriter.println(e.toString());
                    e.mo4789a(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo2564f() {
            super.mo2564f();
            if (this.f3420g.mo4217b() <= 0) {
                this.f3420g.mo4215a();
            } else {
                this.f3420g.mo4224e(0).mo4787a(true);
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4792g() {
            int b = this.f3420g.mo4217b();
            for (int i = 0; i < b; i++) {
                this.f3420g.mo4224e(i).mo4788a();
            }
        }
    }

    C0935b(C0490o oVar, C0474c0 c0Var) {
        this.f3411a = oVar;
        this.f3412b = C0938c.m5004a(c0Var);
    }

    /* renamed from: a */
    public void mo4784a() {
        this.f3412b.mo4792g();
    }

    @Deprecated
    /* renamed from: a */
    public void mo4785a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3412b.mo4791a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0830a.m4522a(this.f3411a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
