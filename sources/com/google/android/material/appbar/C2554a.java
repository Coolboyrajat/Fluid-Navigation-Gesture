package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p026g.p035k.C0890v;

/* renamed from: com.google.android.material.appbar.a */
abstract class C2554a<V extends View> extends C2557c<V> {

    /* renamed from: d */
    private Runnable f6548d;

    /* renamed from: e */
    OverScroller f6549e;

    /* renamed from: f */
    private boolean f6550f;

    /* renamed from: g */
    private int f6551g = -1;

    /* renamed from: h */
    private int f6552h;

    /* renamed from: i */
    private int f6553i = -1;

    /* renamed from: j */
    private VelocityTracker f6554j;

    /* renamed from: com.google.android.material.appbar.a$a */
    private class C2555a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f6555f;

        /* renamed from: g */
        private final V f6556g;

        C2555a(CoordinatorLayout coordinatorLayout, V v) {
            this.f6555f = coordinatorLayout;
            this.f6556g = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f6556g != null && (overScroller = C2554a.this.f6549e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C2554a aVar = C2554a.this;
                    aVar.mo7757c(this.f6555f, this.f6556g, aVar.f6549e.getCurrY());
                    C0890v.m4757a((View) this.f6556g, (Runnable) this);
                    return;
                }
                C2554a.this.mo7739e(this.f6555f, this.f6556g);
            }
        }
    }

    public C2554a() {
    }

    public C2554a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m9839d() {
        if (this.f6554j == null) {
            this.f6554j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo7755a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo7733b(coordinatorLayout, v, mo7736c() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo7727a(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo7756a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f6548d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f6548d = null;
        }
        if (this.f6549e == null) {
            this.f6549e = new OverScroller(v.getContext());
        }
        this.f6549e.fling(0, mo7766b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f6549e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f6548d = new C2555a(coordinatorLayout, v);
            C0890v.m4757a((View) v, this.f6548d);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo7739e(coordinatorLayout, v);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1836a(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f6553i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f6553i = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f6550f
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f6551g
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f6552h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f6553i
            if (r6 <= r0) goto L_0x0083
            r4.f6550f = r2
            r4.f6552h = r5
            goto L_0x0083
        L_0x0051:
            r4.f6550f = r3
            r4.f6551g = r5
            android.view.VelocityTracker r5 = r4.f6554j
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f6554j = r5
            goto L_0x0083
        L_0x0060:
            r4.f6550f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo7727a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.mo1778a((android.view.View) r6, (int) r0, (int) r1)
            if (r5 == 0) goto L_0x0083
            r4.f6552h = r1
            int r5 = r7.getPointerId(r3)
            r4.f6551g = r5
            r4.m9839d()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f6554j
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f6550f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C2554a.mo1836a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo7732b(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo7733b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1841b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f6553i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f6553i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f6551g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f6552h
            int r2 = r2 - r0
            boolean r3 = r11.f6550f
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f6553i
            if (r3 <= r4) goto L_0x0049
            r11.f6550f = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f6550f
            if (r2 == 0) goto L_0x00ae
            r11.f6552h = r0
            int r7 = r11.mo7732b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.mo7755a((androidx.coordinatorlayout.widget.CoordinatorLayout) r4, r5, (int) r6, (int) r7, (int) r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f6554j
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f6554j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f6554j
            int r4 = r11.f6551g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo7737c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo7756a((androidx.coordinatorlayout.widget.CoordinatorLayout) r6, r7, (int) r8, (int) r9, (float) r10)
        L_0x007e:
            r11.f6550f = r2
            r11.f6551g = r3
            android.view.VelocityTracker r12 = r11.f6554j
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f6554j = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.mo1778a((android.view.View) r13, (int) r0, (int) r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo7727a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f6552h = r3
            int r12 = r14.getPointerId(r2)
            r11.f6551g = r12
            r11.m9839d()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f6554j
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C2554a.mo1841b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo7736c();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo7737c(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo7757c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo7733b(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo7739e(CoordinatorLayout coordinatorLayout, V v);
}
