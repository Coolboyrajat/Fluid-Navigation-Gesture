package p006b.p007a.p014o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p026g.p035k.C0840a0;
import p006b.p026g.p035k.C0844b0;
import p006b.p026g.p035k.C0902z;

/* renamed from: b.a.o.h */
public class C0695h {

    /* renamed from: a */
    final ArrayList<C0902z> f2745a = new ArrayList<>();

    /* renamed from: b */
    private long f2746b = -1;

    /* renamed from: c */
    private Interpolator f2747c;

    /* renamed from: d */
    C0840a0 f2748d;

    /* renamed from: e */
    private boolean f2749e;

    /* renamed from: f */
    private final C0844b0 f2750f = new C0696a();

    /* renamed from: b.a.o.h$a */
    class C0696a extends C0844b0 {

        /* renamed from: a */
        private boolean f2751a = false;

        /* renamed from: b */
        private int f2752b = 0;

        C0696a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3940a() {
            this.f2752b = 0;
            this.f2751a = false;
            C0695h.this.mo3938b();
        }

        /* renamed from: a */
        public void mo210a(View view) {
            int i = this.f2752b + 1;
            this.f2752b = i;
            if (i == C0695h.this.f2745a.size()) {
                C0840a0 a0Var = C0695h.this.f2748d;
                if (a0Var != null) {
                    a0Var.mo210a((View) null);
                }
                mo3940a();
            }
        }

        /* renamed from: b */
        public void mo211b(View view) {
            if (!this.f2751a) {
                this.f2751a = true;
                C0840a0 a0Var = C0695h.this.f2748d;
                if (a0Var != null) {
                    a0Var.mo211b((View) null);
                }
            }
        }
    }

    /* renamed from: a */
    public C0695h mo3932a(long j) {
        if (!this.f2749e) {
            this.f2746b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0695h mo3933a(Interpolator interpolator) {
        if (!this.f2749e) {
            this.f2747c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0695h mo3934a(C0840a0 a0Var) {
        if (!this.f2749e) {
            this.f2748d = a0Var;
        }
        return this;
    }

    /* renamed from: a */
    public C0695h mo3935a(C0902z zVar) {
        if (!this.f2749e) {
            this.f2745a.add(zVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0695h mo3936a(C0902z zVar, C0902z zVar2) {
        this.f2745a.add(zVar);
        zVar2.mo4702b(zVar.mo4700b());
        this.f2745a.add(zVar2);
        return this;
    }

    /* renamed from: a */
    public void mo3937a() {
        if (this.f2749e) {
            Iterator<C0902z> it = this.f2745a.iterator();
            while (it.hasNext()) {
                it.next().mo4699a();
            }
            this.f2749e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3938b() {
        this.f2749e = false;
    }

    /* renamed from: c */
    public void mo3939c() {
        if (!this.f2749e) {
            Iterator<C0902z> it = this.f2745a.iterator();
            while (it.hasNext()) {
                C0902z next = it.next();
                long j = this.f2746b;
                if (j >= 0) {
                    next.mo4695a(j);
                }
                Interpolator interpolator = this.f2747c;
                if (interpolator != null) {
                    next.mo4696a(interpolator);
                }
                if (this.f2748d != null) {
                    next.mo4697a((C0840a0) this.f2750f);
                }
                next.mo4703c();
            }
            this.f2749e = true;
        }
    }
}
