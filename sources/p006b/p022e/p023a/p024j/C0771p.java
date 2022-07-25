package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import p006b.p022e.p023a.p024j.C0753e;

/* renamed from: b.e.a.j.p */
public class C0771p {

    /* renamed from: a */
    private int f3122a;

    /* renamed from: b */
    private int f3123b;

    /* renamed from: c */
    private int f3124c;

    /* renamed from: d */
    private int f3125d;

    /* renamed from: e */
    private ArrayList<C0772a> f3126e = new ArrayList<>();

    /* renamed from: b.e.a.j.p$a */
    static class C0772a {

        /* renamed from: a */
        private C0753e f3127a;

        /* renamed from: b */
        private C0753e f3128b;

        /* renamed from: c */
        private int f3129c;

        /* renamed from: d */
        private C0753e.C0756c f3130d;

        /* renamed from: e */
        private int f3131e;

        public C0772a(C0753e eVar) {
            this.f3127a = eVar;
            this.f3128b = eVar.mo4316g();
            this.f3129c = eVar.mo4311b();
            this.f3130d = eVar.mo4315f();
            this.f3131e = eVar.mo4306a();
        }

        /* renamed from: a */
        public void mo4448a(C0758f fVar) {
            fVar.mo4328a(this.f3127a.mo4317h()).mo4310a(this.f3128b, this.f3129c, this.f3130d, this.f3131e);
        }

        /* renamed from: b */
        public void mo4449b(C0758f fVar) {
            int i;
            this.f3127a = fVar.mo4328a(this.f3127a.mo4317h());
            C0753e eVar = this.f3127a;
            if (eVar != null) {
                this.f3128b = eVar.mo4316g();
                this.f3129c = this.f3127a.mo4311b();
                this.f3130d = this.f3127a.mo4315f();
                i = this.f3127a.mo4306a();
            } else {
                this.f3128b = null;
                i = 0;
                this.f3129c = 0;
                this.f3130d = C0753e.C0756c.STRONG;
            }
            this.f3131e = i;
        }
    }

    public C0771p(C0758f fVar) {
        this.f3122a = fVar.mo4395v();
        this.f3123b = fVar.mo4396w();
        this.f3124c = fVar.mo4390s();
        this.f3125d = fVar.mo4370i();
        ArrayList<C0753e> b = fVar.mo4344b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f3126e.add(new C0772a(b.get(i)));
        }
    }

    /* renamed from: a */
    public void mo4446a(C0758f fVar) {
        fVar.mo4389r(this.f3122a);
        fVar.mo4391s(this.f3123b);
        fVar.mo4383o(this.f3124c);
        fVar.mo4367g(this.f3125d);
        int size = this.f3126e.size();
        for (int i = 0; i < size; i++) {
            this.f3126e.get(i).mo4448a(fVar);
        }
    }

    /* renamed from: b */
    public void mo4447b(C0758f fVar) {
        this.f3122a = fVar.mo4395v();
        this.f3123b = fVar.mo4396w();
        this.f3124c = fVar.mo4390s();
        this.f3125d = fVar.mo4370i();
        int size = this.f3126e.size();
        for (int i = 0; i < size; i++) {
            this.f3126e.get(i).mo4449b(fVar);
        }
    }
}
