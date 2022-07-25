package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p006b.p026g.p035k.C0890v;
import p006b.p039i.p041b.C0923c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0265c<V> {

    /* renamed from: a */
    C0923c f6578a;

    /* renamed from: b */
    C2562b f6579b;

    /* renamed from: c */
    private boolean f6580c;

    /* renamed from: d */
    private float f6581d = 0.0f;

    /* renamed from: e */
    private boolean f6582e;

    /* renamed from: f */
    int f6583f = 2;

    /* renamed from: g */
    float f6584g = 0.5f;

    /* renamed from: h */
    float f6585h = 0.0f;

    /* renamed from: i */
    float f6586i = 0.5f;

    /* renamed from: j */
    private final C0923c.C0926c f6587j = new C2561a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C2561a extends C0923c.C0926c {

        /* renamed from: a */
        private int f6588a;

        /* renamed from: b */
        private int f6589b = -1;

        C2561a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m9893a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = p006b.p026g.p035k.C0890v.m4791o(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f6583f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f6588a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f6584g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C2561a.m9893a(android.view.View, float):boolean");
        }

        /* renamed from: a */
        public int mo4771a(View view) {
            return view.getWidth();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f6588a;
            r3 = r3.getWidth() + r5;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4772a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p006b.p026g.p035k.C0890v.m4791o(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f6583f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f6588a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f6588a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f6588a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f6588a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f6588a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m9883a((int) r5, (int) r4, (int) r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C2561a.mo4772a(android.view.View, int, int):int");
        }

        /* renamed from: a */
        public void mo4774a(View view, float f, float f2) {
            boolean z;
            int i;
            C2562b bVar;
            this.f6589b = -1;
            int width = view.getWidth();
            if (m9893a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f6588a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f6588a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f6578a.mo4767c(i, view.getTop())) {
                C0890v.m4757a(view, (Runnable) new C2563c(view, z));
            } else if (z && (bVar = SwipeDismissBehavior.this.f6579b) != null) {
                bVar.mo7782a(view);
            }
        }

        /* renamed from: a */
        public void mo4775a(View view, int i) {
            this.f6589b = i;
            this.f6588a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: a */
        public void mo4776a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f6588a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6585h);
            float width2 = ((float) this.f6588a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f6586i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m9882a(0.0f, 1.0f - SwipeDismissBehavior.m9885b(width, width2, f), 1.0f));
            }
        }

        /* renamed from: b */
        public int mo4778b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public boolean mo4781b(View view, int i) {
            int i2 = this.f6589b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo7779a(view);
        }

        /* renamed from: c */
        public void mo4782c(int i) {
            C2562b bVar = SwipeDismissBehavior.this.f6579b;
            if (bVar != null) {
                bVar.mo7781a(i);
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C2562b {
        /* renamed from: a */
        void mo7781a(int i);

        /* renamed from: a */
        void mo7782a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    private class C2563c implements Runnable {

        /* renamed from: f */
        private final View f6591f;

        /* renamed from: g */
        private final boolean f6592g;

        C2563c(View view, boolean z) {
            this.f6591f = view;
            this.f6592g = z;
        }

        public void run() {
            C2562b bVar;
            C0923c cVar = SwipeDismissBehavior.this.f6578a;
            if (cVar != null && cVar.mo4760a(true)) {
                C0890v.m4757a(this.f6591f, (Runnable) this);
            } else if (this.f6592g && (bVar = SwipeDismissBehavior.this.f6579b) != null) {
                bVar.mo7782a(this.f6591f);
            }
        }
    }

    /* renamed from: a */
    static float m9882a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m9883a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m9884a(ViewGroup viewGroup) {
        if (this.f6578a == null) {
            this.f6578a = this.f6582e ? C0923c.m4952a(viewGroup, this.f6581d, this.f6587j) : C0923c.m4953a(viewGroup, this.f6587j);
        }
    }

    /* renamed from: b */
    static float m9885b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo7776a(float f) {
        this.f6586i = m9882a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void mo7777a(int i) {
        this.f6583f = i;
    }

    /* renamed from: a */
    public void mo7778a(C2562b bVar) {
        this.f6579b = bVar;
    }

    /* renamed from: a */
    public boolean mo7779a(View view) {
        return true;
    }

    /* renamed from: a */
    public boolean mo1836a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f6580c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6580c = coordinatorLayout.mo1778a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f6580c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6580c = false;
        }
        if (!z) {
            return false;
        }
        m9884a((ViewGroup) coordinatorLayout);
        return this.f6578a.mo4764b(motionEvent);
    }

    /* renamed from: b */
    public void mo7780b(float f) {
        this.f6585h = m9882a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo1841b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0923c cVar = this.f6578a;
        if (cVar == null) {
            return false;
        }
        cVar.mo4756a(motionEvent);
        return true;
    }
}
