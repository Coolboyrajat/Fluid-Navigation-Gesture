package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0102q;

/* renamed from: androidx.appcompat.widget.c0 */
public abstract class C0164c0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f864f;

    /* renamed from: g */
    private final int f865g;

    /* renamed from: h */
    private final int f866h;

    /* renamed from: i */
    final View f867i;

    /* renamed from: j */
    private Runnable f868j;

    /* renamed from: k */
    private Runnable f869k;

    /* renamed from: l */
    private boolean f870l;

    /* renamed from: m */
    private int f871m;

    /* renamed from: n */
    private final int[] f872n = new int[2];

    /* renamed from: androidx.appcompat.widget.c0$a */
    private class C0165a implements Runnable {
        C0165a() {
        }

        public void run() {
            ViewParent parent = C0164c0.this.f867i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$b */
    private class C0166b implements Runnable {
        C0166b() {
        }

        public void run() {
            C0164c0.this.mo1235d();
        }
    }

    public C0164c0(View view) {
        this.f867i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f864f = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f865g = ViewConfiguration.getTapTimeout();
        this.f866h = (this.f865g + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m835a(MotionEvent motionEvent) {
        C0150a0 a0Var;
        View view = this.f867i;
        C0102q a = mo308a();
        if (a == null || !a.mo413c() || (a0Var = (C0150a0) a.mo416g()) == null || !a0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m837a(view, obtainNoHistory);
        m839b(a0Var, obtainNoHistory);
        boolean a2 = a0Var.mo1193a(obtainNoHistory, this.f871m);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m836a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m837a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f872n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m838b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f867i
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f871m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f864f
            boolean r6 = m836a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m840e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m840e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f871m = r6
            java.lang.Runnable r6 = r5.f868j
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.c0$a r6 = new androidx.appcompat.widget.c0$a
            r6.<init>()
            r5.f868j = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f868j
            int r1 = r5.f865g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f869k
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.c0$b r6 = new androidx.appcompat.widget.c0$b
            r6.<init>()
            r5.f869k = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f869k
            int r1 = r5.f866h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0164c0.m838b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m839b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f872n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: e */
    private void m840e() {
        Runnable runnable = this.f869k;
        if (runnable != null) {
            this.f867i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f868j;
        if (runnable2 != null) {
            this.f867i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0102q mo308a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo309b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1234c() {
        C0102q a = mo308a();
        if (a == null || !a.mo413c()) {
            return true;
        }
        a.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1235d() {
        m840e();
        View view = this.f867i;
        if (view.isEnabled() && !view.isLongClickable() && mo309b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f870l = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f870l;
        if (z2) {
            z = m835a(motionEvent) || !mo1234c();
        } else {
            z = m838b(motionEvent) && mo309b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f867i.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f870l = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f870l = false;
        this.f871m = -1;
        Runnable runnable = this.f868j;
        if (runnable != null) {
            this.f867i.removeCallbacks(runnable);
        }
    }
}
