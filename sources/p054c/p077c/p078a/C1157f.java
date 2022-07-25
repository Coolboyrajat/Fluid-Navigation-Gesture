package p054c.p077c.p078a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.c.a.f */
public class C1157f {

    /* renamed from: o */
    private static int f3874o;

    /* renamed from: a */
    private C1160g f3875a;

    /* renamed from: b */
    private boolean f3876b;

    /* renamed from: c */
    private final String f3877c;

    /* renamed from: d */
    private final C1159b f3878d = new C1159b();

    /* renamed from: e */
    private final C1159b f3879e = new C1159b();

    /* renamed from: f */
    private final C1159b f3880f = new C1159b();

    /* renamed from: g */
    private double f3881g;

    /* renamed from: h */
    private double f3882h;

    /* renamed from: i */
    private boolean f3883i = true;

    /* renamed from: j */
    private double f3884j = 0.005d;

    /* renamed from: k */
    private double f3885k = 0.005d;

    /* renamed from: l */
    private CopyOnWriteArraySet<C1161h> f3886l = new CopyOnWriteArraySet<>();

    /* renamed from: m */
    private double f3887m = 0.0d;

    /* renamed from: n */
    private final C1153b f3888n;

    /* renamed from: c.c.a.f$b */
    private static class C1159b {

        /* renamed from: a */
        double f3889a;

        /* renamed from: b */
        double f3890b;

        private C1159b() {
        }
    }

    C1157f(C1153b bVar) {
        if (bVar != null) {
            this.f3888n = bVar;
            StringBuilder sb = new StringBuilder();
            sb.append("spring:");
            int i = f3874o;
            f3874o = i + 1;
            sb.append(i);
            this.f3877c = sb.toString();
            mo5274a(C1160g.f3891c);
            return;
        }
        throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
    }

    /* renamed from: a */
    private double m5704a(C1159b bVar) {
        return Math.abs(this.f3882h - bVar.f3889a);
    }

    /* renamed from: e */
    private void m5705e(double d) {
        C1159b bVar = this.f3878d;
        C1159b bVar2 = this.f3879e;
        double d2 = 1.0d - d;
        bVar.f3889a = (bVar.f3889a * d) + (bVar2.f3889a * d2);
        bVar.f3890b = (bVar.f3890b * d) + (bVar2.f3890b * d2);
    }

    /* renamed from: a */
    public double mo5272a() {
        return this.f3878d.f3889a;
    }

    /* renamed from: a */
    public C1157f mo5273a(double d, boolean z) {
        this.f3881g = d;
        this.f3878d.f3889a = d;
        this.f3888n.mo5263a(mo5278b());
        Iterator<C1161h> it = this.f3886l.iterator();
        while (it.hasNext()) {
            it.next().mo5270c(this);
        }
        if (z) {
            mo5283e();
        }
        return this;
    }

    /* renamed from: a */
    public C1157f mo5274a(C1160g gVar) {
        if (gVar != null) {
            this.f3875a = gVar;
            return this;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    /* renamed from: a */
    public C1157f mo5275a(C1161h hVar) {
        if (hVar != null) {
            this.f3886l.add(hVar);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5276a(double d) {
        double d2;
        boolean z;
        boolean c = mo5280c();
        if (!c || !this.f3883i) {
            double d3 = 0.064d;
            if (d <= 0.064d) {
                d3 = d;
            }
            this.f3887m += d3;
            C1160g gVar = this.f3875a;
            double d4 = gVar.f3893b;
            double d5 = gVar.f3892a;
            C1159b bVar = this.f3878d;
            double d6 = bVar.f3889a;
            double d7 = bVar.f3890b;
            C1159b bVar2 = this.f3880f;
            double d8 = bVar2.f3889a;
            double d9 = bVar2.f3890b;
            boolean z2 = c;
            while (true) {
                d2 = this.f3887m;
                if (d2 < 0.001d) {
                    break;
                }
                this.f3887m = d2 - 0.001d;
                if (this.f3887m < 0.001d) {
                    C1159b bVar3 = this.f3879e;
                    bVar3.f3889a = d6;
                    bVar3.f3890b = d7;
                }
                double d10 = this.f3882h;
                double d11 = ((d10 - d8) * d4) - (d5 * d7);
                double d12 = d7 + (d11 * 0.001d * 0.5d);
                double d13 = ((d10 - (((d7 * 0.001d) * 0.5d) + d6)) * d4) - (d5 * d12);
                double d14 = d7 + (d13 * 0.001d * 0.5d);
                double d15 = ((d10 - (d6 + ((d12 * 0.001d) * 0.5d))) * d4) - (d5 * d14);
                double d16 = d6 + (d14 * 0.001d);
                double d17 = d7 + (d15 * 0.001d);
                d6 += (d7 + ((d12 + d14) * 2.0d) + d17) * 0.16666666666666666d * 0.001d;
                d7 += (d11 + ((d13 + d15) * 2.0d) + (((d10 - d16) * d4) - (d5 * d17))) * 0.16666666666666666d * 0.001d;
                d8 = d16;
                d9 = d17;
            }
            C1159b bVar4 = this.f3880f;
            bVar4.f3889a = d8;
            bVar4.f3890b = d9;
            C1159b bVar5 = this.f3878d;
            bVar5.f3889a = d6;
            bVar5.f3890b = d7;
            if (d2 > 0.0d) {
                m5705e(d2 / 0.001d);
            }
            boolean z3 = true;
            if (mo5280c() || (this.f3876b && mo5282d())) {
                if (d4 > 0.0d) {
                    double d18 = this.f3882h;
                    this.f3881g = d18;
                    this.f3878d.f3889a = d18;
                } else {
                    this.f3882h = this.f3878d.f3889a;
                    this.f3881g = this.f3882h;
                }
                mo5281d(0.0d);
                z2 = true;
            }
            if (this.f3883i) {
                this.f3883i = false;
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                this.f3883i = true;
            } else {
                z3 = false;
            }
            Iterator<C1161h> it = this.f3886l.iterator();
            while (it.hasNext()) {
                C1161h next = it.next();
                if (z) {
                    next.mo5268a(this);
                }
                next.mo5270c(this);
                if (z3) {
                    next.mo5271d(this);
                }
            }
        }
    }

    /* renamed from: b */
    public C1157f mo5277b(double d) {
        mo5273a(d, true);
        return this;
    }

    /* renamed from: b */
    public String mo5278b() {
        return this.f3877c;
    }

    /* renamed from: c */
    public C1157f mo5279c(double d) {
        if (this.f3882h == d && mo5280c()) {
            return this;
        }
        this.f3881g = mo5272a();
        this.f3882h = d;
        this.f3888n.mo5263a(mo5278b());
        Iterator<C1161h> it = this.f3886l.iterator();
        while (it.hasNext()) {
            it.next().mo5269b(this);
        }
        return this;
    }

    /* renamed from: c */
    public boolean mo5280c() {
        return Math.abs(this.f3878d.f3890b) <= this.f3884j && (m5704a(this.f3878d) <= this.f3885k || this.f3875a.f3893b == 0.0d);
    }

    /* renamed from: d */
    public C1157f mo5281d(double d) {
        C1159b bVar = this.f3878d;
        if (d == bVar.f3890b) {
            return this;
        }
        bVar.f3890b = d;
        this.f3888n.mo5263a(mo5278b());
        return this;
    }

    /* renamed from: d */
    public boolean mo5282d() {
        return this.f3875a.f3893b > 0.0d && ((this.f3881g < this.f3882h && mo5272a() > this.f3882h) || (this.f3881g > this.f3882h && mo5272a() < this.f3882h));
    }

    /* renamed from: e */
    public C1157f mo5283e() {
        C1159b bVar = this.f3878d;
        double d = bVar.f3889a;
        this.f3882h = d;
        this.f3880f.f3889a = d;
        bVar.f3890b = 0.0d;
        return this;
    }

    /* renamed from: f */
    public boolean mo5284f() {
        return !mo5280c() || !mo5285g();
    }

    /* renamed from: g */
    public boolean mo5285g() {
        return this.f3883i;
    }
}
