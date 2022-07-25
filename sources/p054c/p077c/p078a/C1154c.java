package p054c.p077c.p078a;

/* renamed from: c.c.a.c */
public class C1154c {

    /* renamed from: a */
    private final double f3872a;

    /* renamed from: b */
    private final double f3873b;

    public C1154c(double d, double d2) {
        double c = m5693c(m5691b(d2 / 1.7d, 0.0d, 20.0d), 0.0d, 0.8d);
        this.f3872a = m5693c(m5691b(d / 1.7d, 0.0d, 20.0d), 0.5d, 200.0d);
        this.f3873b = m5695d(c, m5694d(this.f3872a), 0.01d);
    }

    /* renamed from: a */
    private double m5688a(double d) {
        return ((Math.pow(d, 3.0d) * 7.0E-4d) - (Math.pow(d, 2.0d) * 0.031d)) + (d * 0.64d) + 1.28d;
    }

    /* renamed from: a */
    private double m5689a(double d, double d2, double d3) {
        return (d3 * d) + ((1.0d - d) * d2);
    }

    /* renamed from: b */
    private double m5690b(double d) {
        return ((Math.pow(d, 3.0d) * 4.4E-5d) - (Math.pow(d, 2.0d) * 0.006d)) + (d * 0.36d) + 2.0d;
    }

    /* renamed from: b */
    private double m5691b(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    /* renamed from: c */
    private double m5692c(double d) {
        return ((Math.pow(d, 3.0d) * 4.5E-7d) - (Math.pow(d, 2.0d) * 3.32E-4d)) + (d * 0.1078d) + 5.84d;
    }

    /* renamed from: c */
    private double m5693c(double d, double d2, double d3) {
        return d2 + (d * (d3 - d2));
    }

    /* renamed from: d */
    private double m5694d(double d) {
        if (d <= 18.0d) {
            return m5688a(d);
        }
        if (d > 18.0d && d <= 44.0d) {
            return m5690b(d);
        }
        if (d > 44.0d) {
            return m5692c(d);
        }
        return 0.0d;
    }

    /* renamed from: d */
    private double m5695d(double d, double d2, double d3) {
        return m5689a((2.0d * d) - (d * d), d2, d3);
    }

    /* renamed from: a */
    public double mo5266a() {
        return this.f3873b;
    }

    /* renamed from: b */
    public double mo5267b() {
        return this.f3872a;
    }
}
