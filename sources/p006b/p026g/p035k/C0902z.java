package p006b.p026g.p035k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: b.g.k.z */
public final class C0902z {

    /* renamed from: a */
    private WeakReference<View> f3337a;

    /* renamed from: b */
    Runnable f3338b = null;

    /* renamed from: c */
    Runnable f3339c = null;

    /* renamed from: d */
    int f3340d = -1;

    /* renamed from: b.g.k.z$a */
    class C0903a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0840a0 f3341a;

        /* renamed from: b */
        final /* synthetic */ View f3342b;

        C0903a(C0902z zVar, C0840a0 a0Var, View view) {
            this.f3341a = a0Var;
            this.f3342b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3341a.mo1191c(this.f3342b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3341a.mo210a(this.f3342b);
        }

        public void onAnimationStart(Animator animator) {
            this.f3341a.mo211b(this.f3342b);
        }
    }

    /* renamed from: b.g.k.z$b */
    class C0904b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C0850c0 f3343a;

        /* renamed from: b */
        final /* synthetic */ View f3344b;

        C0904b(C0902z zVar, C0850c0 c0Var, View view) {
            this.f3343a = c0Var;
            this.f3344b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3343a.mo273a(this.f3344b);
        }
    }

    /* renamed from: b.g.k.z$c */
    static class C0905c implements C0840a0 {

        /* renamed from: a */
        C0902z f3345a;

        /* renamed from: b */
        boolean f3346b;

        C0905c(C0902z zVar) {
            this.f3345a = zVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: b.g.k.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo210a(android.view.View r4) {
            /*
                r3 = this;
                b.g.k.z r0 = r3.f3345a
                int r0 = r0.f3340d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                b.g.k.z r0 = r3.f3345a
                r0.f3340d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f3346b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                b.g.k.z r0 = r3.f3345a
                java.lang.Runnable r1 = r0.f3339c
                if (r1 == 0) goto L_0x0024
                r0.f3339c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p006b.p026g.p035k.C0840a0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                b.g.k.a0 r2 = (p006b.p026g.p035k.C0840a0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo210a(r4)
            L_0x0036:
                r4 = 1
                r3.f3346b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p035k.C0902z.C0905c.mo210a(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b.g.k.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo211b(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f3346b = r0
                b.g.k.z r0 = r3.f3345a
                int r0 = r0.f3340d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                b.g.k.z r0 = r3.f3345a
                java.lang.Runnable r2 = r0.f3338b
                if (r2 == 0) goto L_0x001a
                r0.f3338b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p006b.p026g.p035k.C0840a0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                b.g.k.a0 r1 = (p006b.p026g.p035k.C0840a0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo211b(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p035k.C0902z.C0905c.mo211b(android.view.View):void");
        }

        /* renamed from: c */
        public void mo1191c(View view) {
            Object tag = view.getTag(2113929216);
            C0840a0 a0Var = tag instanceof C0840a0 ? (C0840a0) tag : null;
            if (a0Var != null) {
                a0Var.mo1191c(view);
            }
        }
    }

    C0902z(View view) {
        this.f3337a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m4853a(View view, C0840a0 a0Var) {
        if (a0Var != null) {
            view.animate().setListener(new C0903a(this, a0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C0902z mo4694a(float f) {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0902z mo4695a(long j) {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0902z mo4696a(Interpolator interpolator) {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public C0902z mo4697a(C0840a0 a0Var) {
        View view = (View) this.f3337a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, a0Var);
                a0Var = new C0905c(this);
            }
            m4853a(view, a0Var);
        }
        return this;
    }

    /* renamed from: a */
    public C0902z mo4698a(C0850c0 c0Var) {
        View view = (View) this.f3337a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C0904b bVar = null;
            if (c0Var != null) {
                bVar = new C0904b(this, c0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public void mo4699a() {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long mo4700b() {
        View view = (View) this.f3337a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: b */
    public C0902z mo4701b(float f) {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0902z mo4702b(long j) {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void mo4703c() {
        View view = (View) this.f3337a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
