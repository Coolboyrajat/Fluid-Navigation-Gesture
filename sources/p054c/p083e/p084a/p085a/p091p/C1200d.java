package p054c.p083e.p084a.p085a.p091p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p054c.p083e.p084a.p085a.p091p.C1198c;
import p054c.p083e.p084a.p085a.p097u.C1213a;

/* renamed from: c.e.a.a.p.d */
public interface C1200d extends C1198c.C1199a {

    /* renamed from: c.e.a.a.p.d$b */
    public static class C1202b implements TypeEvaluator<C1205e> {

        /* renamed from: b */
        public static final TypeEvaluator<C1205e> f3953b = new C1202b();

        /* renamed from: a */
        private final C1205e f3954a = new C1205e();

        /* renamed from: a */
        public C1205e evaluate(float f, C1205e eVar, C1205e eVar2) {
            this.f3954a.mo5434a(C1213a.m5846a(eVar.f3957a, eVar2.f3957a, f), C1213a.m5846a(eVar.f3958b, eVar2.f3958b, f), C1213a.m5846a(eVar.f3959c, eVar2.f3959c, f));
            return this.f3954a;
        }
    }

    /* renamed from: c.e.a.a.p.d$c */
    public static class C1203c extends Property<C1200d, C1205e> {

        /* renamed from: a */
        public static final Property<C1200d, C1205e> f3955a = new C1203c("circularReveal");

        private C1203c(String str) {
            super(C1205e.class, str);
        }

        /* renamed from: a */
        public C1205e get(C1200d dVar) {
            return dVar.getRevealInfo();
        }

        /* renamed from: a */
        public void set(C1200d dVar, C1205e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: c.e.a.a.p.d$d */
    public static class C1204d extends Property<C1200d, Integer> {

        /* renamed from: a */
        public static final Property<C1200d, Integer> f3956a = new C1204d("circularRevealScrimColor");

        private C1204d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(C1200d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(C1200d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: c.e.a.a.p.d$e */
    public static class C1205e {

        /* renamed from: a */
        public float f3957a;

        /* renamed from: b */
        public float f3958b;

        /* renamed from: c */
        public float f3959c;

        private C1205e() {
        }

        public C1205e(float f, float f2, float f3) {
            this.f3957a = f;
            this.f3958b = f2;
            this.f3959c = f3;
        }

        /* renamed from: a */
        public void mo5434a(float f, float f2, float f3) {
            this.f3957a = f;
            this.f3958b = f2;
            this.f3959c = f3;
        }
    }

    /* renamed from: a */
    void mo5404a();

    /* renamed from: b */
    void mo5405b();

    int getCircularRevealScrimColor();

    C1205e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1205e eVar);
}
