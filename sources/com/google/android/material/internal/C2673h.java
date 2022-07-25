package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0886r;
import p006b.p026g.p035k.C0890v;

/* renamed from: com.google.android.material.internal.h */
public class C2673h {

    /* renamed from: com.google.android.material.internal.h$a */
    static class C2674a implements C0886r {

        /* renamed from: a */
        final /* synthetic */ C2676c f7086a;

        /* renamed from: b */
        final /* synthetic */ C2677d f7087b;

        C2674a(C2676c cVar, C2677d dVar) {
            this.f7086a = cVar;
            this.f7087b = dVar;
        }

        /* renamed from: a */
        public C0852d0 mo205a(View view, C0852d0 d0Var) {
            this.f7086a.mo7810a(view, d0Var, new C2677d(this.f7087b));
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    static class C2675b implements View.OnAttachStateChangeListener {
        C2675b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C0890v.m4737H(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.h$c */
    public interface C2676c {
        /* renamed from: a */
        C0852d0 mo7810a(View view, C0852d0 d0Var, C2677d dVar);
    }

    /* renamed from: com.google.android.material.internal.h$d */
    public static class C2677d {

        /* renamed from: a */
        public int f7088a;

        /* renamed from: b */
        public int f7089b;

        /* renamed from: c */
        public int f7090c;

        /* renamed from: d */
        public int f7091d;

        public C2677d(int i, int i2, int i3, int i4) {
            this.f7088a = i;
            this.f7089b = i2;
            this.f7090c = i3;
            this.f7091d = i4;
        }

        public C2677d(C2677d dVar) {
            this.f7088a = dVar.f7088a;
            this.f7089b = dVar.f7089b;
            this.f7090c = dVar.f7090c;
            this.f7091d = dVar.f7091d;
        }

        /* renamed from: a */
        public void mo8558a(View view) {
            C0890v.m4747a(view, this.f7088a, this.f7089b, this.f7090c, this.f7091d);
        }
    }

    /* renamed from: a */
    public static float m10591a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static float m10592a(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C0890v.m4787k((View) parent);
        }
        return f;
    }

    /* renamed from: a */
    public static PorterDuff.Mode m10593a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static void m10594a(View view, C2676c cVar) {
        C0890v.m4756a(view, (C0886r) new C2674a(cVar, new C2677d(C0890v.m4796t(view), view.getPaddingTop(), C0890v.m4795s(view), view.getPaddingBottom())));
        m10595b(view);
    }

    /* renamed from: b */
    public static void m10595b(View view) {
        if (C0890v.m4731B(view)) {
            C0890v.m4737H(view);
        } else {
            view.addOnAttachStateChangeListener(new C2675b());
        }
    }
}
