package p006b.p039i.p041b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p006b.p026g.p035k.C0890v;

/* renamed from: b.i.b.c */
public class C0923c {

    /* renamed from: w */
    private static final Interpolator f3381w = new C0924a();

    /* renamed from: a */
    private int f3382a;

    /* renamed from: b */
    private int f3383b;

    /* renamed from: c */
    private int f3384c = -1;

    /* renamed from: d */
    private float[] f3385d;

    /* renamed from: e */
    private float[] f3386e;

    /* renamed from: f */
    private float[] f3387f;

    /* renamed from: g */
    private float[] f3388g;

    /* renamed from: h */
    private int[] f3389h;

    /* renamed from: i */
    private int[] f3390i;

    /* renamed from: j */
    private int[] f3391j;

    /* renamed from: k */
    private int f3392k;

    /* renamed from: l */
    private VelocityTracker f3393l;

    /* renamed from: m */
    private float f3394m;

    /* renamed from: n */
    private float f3395n;

    /* renamed from: o */
    private int f3396o;

    /* renamed from: p */
    private int f3397p;

    /* renamed from: q */
    private OverScroller f3398q;

    /* renamed from: r */
    private final C0926c f3399r;

    /* renamed from: s */
    private View f3400s;

    /* renamed from: t */
    private boolean f3401t;

    /* renamed from: u */
    private final ViewGroup f3402u;

    /* renamed from: v */
    private final Runnable f3403v = new C0925b();

    /* renamed from: b.i.b.c$a */
    static class C0924a implements Interpolator {
        C0924a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: b.i.b.c$b */
    class C0925b implements Runnable {
        C0925b() {
        }

        public void run() {
            C0923c.this.mo4762b(0);
        }
    }

    /* renamed from: b.i.b.c$c */
    public static abstract class C0926c {
        /* renamed from: a */
        public int mo4770a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo4771a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo4772a(View view, int i, int i2);

        /* renamed from: a */
        public void mo4773a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo4774a(View view, float f, float f2);

        /* renamed from: a */
        public void mo4775a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo4776a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo4777b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo4778b(View view, int i, int i2);

        /* renamed from: b */
        public void mo4779b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo4780b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo4781b(View view, int i);

        /* renamed from: c */
        public abstract void mo4782c(int i);
    }

    private C0923c(Context context, ViewGroup viewGroup, C0926c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f3402u = viewGroup;
            this.f3399r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3396o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3383b = viewConfiguration.getScaledTouchSlop();
            this.f3394m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3395n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3398q = new OverScroller(context, f3381w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m4948a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    private float m4949a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: a */
    private int m4950a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: a */
    private int m4951a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m4950a(i3, (int) this.f3395n, (int) this.f3394m);
        int a2 = m4950a(i4, (int) this.f3395n, (int) this.f3394m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m4959b(i, a, this.f3399r.mo4771a(view))) * f5) + (((float) m4959b(i2, a2, this.f3399r.mo4777b(view))) * f6));
    }

    /* renamed from: a */
    public static C0923c m4952a(ViewGroup viewGroup, float f, C0926c cVar) {
        C0923c a = m4953a(viewGroup, cVar);
        a.f3383b = (int) (((float) a.f3383b) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C0923c m4953a(ViewGroup viewGroup, C0926c cVar) {
        return new C0923c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: a */
    private void m4954a(float f, float f2) {
        this.f3401t = true;
        this.f3399r.mo4774a(this.f3400s, f, f2);
        this.f3401t = false;
        if (this.f3382a == 1) {
            mo4762b(0);
        }
    }

    /* renamed from: a */
    private void m4955a(float f, float f2, int i) {
        int i2 = 1;
        if (!m4957a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m4957a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m4957a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m4957a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f3390i;
            iArr[i] = iArr[i] | i2;
            this.f3399r.mo4773a(i2, i);
        }
    }

    /* renamed from: a */
    private void m4956a(int i, int i2, int i3, int i4) {
        int left = this.f3400s.getLeft();
        int top = this.f3400s.getTop();
        if (i3 != 0) {
            i = this.f3399r.mo4772a(this.f3400s, i, i3);
            C0890v.m4775d(this.f3400s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f3399r.mo4778b(this.f3400s, i2, i4);
            C0890v.m4777e(this.f3400s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f3399r.mo4776a(this.f3400s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private boolean m4957a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3389h[i] & i2) != i2 || (this.f3397p & i2) == 0 || (this.f3391j[i] & i2) == i2 || (this.f3390i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3383b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f3399r.mo4780b(i2)) {
            return (this.f3390i[i] & i2) == 0 && abs > ((float) this.f3383b);
        }
        int[] iArr = this.f3391j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m4958a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3399r.mo4771a(view) > 0;
        boolean z2 = this.f3399r.mo4777b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f3383b) : z2 && Math.abs(f2) > ((float) this.f3383b);
        }
        int i = this.f3383b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: b */
    private int m4959b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f3402u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m4948a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m4960b(float f, float f2, int i) {
        m4967d(i);
        float[] fArr = this.f3385d;
        this.f3387f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3386e;
        this.f3388g[i] = f2;
        fArr2[i] = f2;
        this.f3389h[i] = m4965d((int) f, (int) f2);
        this.f3392k |= 1 << i;
    }

    /* renamed from: b */
    private boolean m4961b(int i, int i2, int i3, int i4) {
        int left = this.f3400s.getLeft();
        int top = this.f3400s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3398q.abortAnimation();
            mo4762b(0);
            return false;
        }
        this.f3398q.startScroll(left, top, i5, i6, m4951a(this.f3400s, i5, i6, i3, i4));
        mo4762b(2);
        return true;
    }

    /* renamed from: c */
    private void m4962c() {
        float[] fArr = this.f3385d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3386e, 0.0f);
            Arrays.fill(this.f3387f, 0.0f);
            Arrays.fill(this.f3388g, 0.0f);
            Arrays.fill(this.f3389h, 0);
            Arrays.fill(this.f3390i, 0);
            Arrays.fill(this.f3391j, 0);
            this.f3392k = 0;
        }
    }

    /* renamed from: c */
    private void m4963c(int i) {
        if (this.f3385d != null && mo4758a(i)) {
            this.f3385d[i] = 0.0f;
            this.f3386e[i] = 0.0f;
            this.f3387f[i] = 0.0f;
            this.f3388g[i] = 0.0f;
            this.f3389h[i] = 0;
            this.f3390i[i] = 0;
            this.f3391j[i] = 0;
            this.f3392k = (~(1 << i)) & this.f3392k;
        }
    }

    /* renamed from: c */
    private void m4964c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m4968e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3387f[pointerId] = x;
                this.f3388g[pointerId] = y;
            }
        }
    }

    /* renamed from: d */
    private int m4965d(int i, int i2) {
        int i3 = i < this.f3402u.getLeft() + this.f3396o ? 1 : 0;
        if (i2 < this.f3402u.getTop() + this.f3396o) {
            i3 |= 4;
        }
        if (i > this.f3402u.getRight() - this.f3396o) {
            i3 |= 2;
        }
        return i2 > this.f3402u.getBottom() - this.f3396o ? i3 | 8 : i3;
    }

    /* renamed from: d */
    private void m4966d() {
        this.f3393l.computeCurrentVelocity(1000, this.f3394m);
        m4954a(m4949a(this.f3393l.getXVelocity(this.f3384c), this.f3395n, this.f3394m), m4949a(this.f3393l.getYVelocity(this.f3384c), this.f3395n, this.f3394m));
    }

    /* renamed from: d */
    private void m4967d(int i) {
        float[] fArr = this.f3385d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f3385d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f3386e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f3387f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f3388g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f3389h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3390i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3391j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3385d = fArr2;
            this.f3386e = fArr3;
            this.f3387f = fArr4;
            this.f3388g = fArr5;
            this.f3389h = iArr;
            this.f3390i = iArr2;
            this.f3391j = iArr3;
        }
    }

    /* renamed from: e */
    private boolean m4968e(int i) {
        if (mo4758a(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    public View mo4754a(int i, int i2) {
        for (int childCount = this.f3402u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f3402u;
            this.f3399r.mo4770a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4755a() {
        this.f3384c = -1;
        m4962c();
        VelocityTracker velocityTracker = this.f3393l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3393l = null;
        }
    }

    /* renamed from: a */
    public void mo4756a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo4755a();
        }
        if (this.f3393l == null) {
            this.f3393l = VelocityTracker.obtain();
        }
        this.f3393l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3382a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m4968e(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f3385d[pointerId];
                                float f2 = y - this.f3386e[pointerId];
                                m4955a(f, f2, pointerId);
                                if (this.f3382a != 1) {
                                    View a = mo4754a((int) x, (int) y);
                                    if (m4958a(a, f, f2) && mo4765b(a, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m4968e(this.f3384c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3384c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f3387f;
                        int i3 = this.f3384c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f3388g[i3]);
                        m4956a(this.f3400s.getLeft() + i4, this.f3400s.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m4964c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m4960b(x3, y3, pointerId2);
                        if (this.f3382a == 0) {
                            mo4765b(mo4754a((int) x3, (int) y3), pointerId2);
                            int i6 = this.f3389h[pointerId2];
                            int i7 = this.f3397p;
                            if ((i6 & i7) != 0) {
                                this.f3399r.mo4779b(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo4763b((int) x3, (int) y3)) {
                            mo4765b(this.f3400s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f3382a == 1 && pointerId3 == this.f3384c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f3384c) {
                                    View a2 = mo4754a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f3400s;
                                    if (a2 == view && mo4765b(view, pointerId4)) {
                                        i = this.f3384c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m4966d();
                            }
                        }
                        m4963c(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f3382a == 1) {
                    m4954a(0.0f, 0.0f);
                }
            } else if (this.f3382a == 1) {
                m4966d();
            }
            mo4755a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View a3 = mo4754a((int) x4, (int) y4);
        m4960b(x4, y4, pointerId5);
        mo4765b(a3, pointerId5);
        int i8 = this.f3389h[pointerId5];
        int i9 = this.f3397p;
        if ((i8 & i9) != 0) {
            this.f3399r.mo4779b(i8 & i9, pointerId5);
        }
    }

    /* renamed from: a */
    public void mo4757a(View view, int i) {
        if (view.getParent() == this.f3402u) {
            this.f3400s = view;
            this.f3384c = i;
            this.f3399r.mo4775a(view, i);
            mo4762b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3402u + ")");
    }

    /* renamed from: a */
    public boolean mo4758a(int i) {
        return ((1 << i) & this.f3392k) != 0;
    }

    /* renamed from: a */
    public boolean mo4759a(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: a */
    public boolean mo4760a(boolean z) {
        if (this.f3382a == 2) {
            boolean computeScrollOffset = this.f3398q.computeScrollOffset();
            int currX = this.f3398q.getCurrX();
            int currY = this.f3398q.getCurrY();
            int left = currX - this.f3400s.getLeft();
            int top = currY - this.f3400s.getTop();
            if (left != 0) {
                C0890v.m4775d(this.f3400s, left);
            }
            if (top != 0) {
                C0890v.m4777e(this.f3400s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3399r.mo4776a(this.f3400s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3398q.getFinalX() && currY == this.f3398q.getFinalY()) {
                this.f3398q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3402u.post(this.f3403v);
                } else {
                    mo4762b(0);
                }
            }
        }
        return this.f3382a == 2;
    }

    /* renamed from: b */
    public int mo4761b() {
        return this.f3383b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4762b(int i) {
        this.f3402u.removeCallbacks(this.f3403v);
        if (this.f3382a != i) {
            this.f3382a = i;
            this.f3399r.mo4782c(i);
            if (this.f3382a == 0) {
                this.f3400s = null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo4763b(int i, int i2) {
        return mo4759a(this.f3400s, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4764b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo4755a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3393l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3393l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3393l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m4963c((int) r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m4960b((float) r7, (float) r1, (int) r2)
            int r3 = r0.f3382a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f3389h
            r1 = r1[r2]
            int r3 = r0.f3397p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            b.i.b.c$c r4 = r0.f3399r
            r1 = r1 & r3
            r4.mo4779b((int) r1, (int) r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo4754a((int) r3, (int) r1)
            android.view.View r3 = r0.f3400s
            if (r1 != r3) goto L_0x0031
            r0.mo4765b((android.view.View) r1, (int) r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f3385d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f3386e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m4968e(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f3385d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f3386e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo4754a((int) r7, (int) r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m4958a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            b.i.b.c$c r14 = r0.f3399r
            int r12 = r14.mo4772a((android.view.View) r7, (int) r13, (int) r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            b.i.b.c$c r5 = r0.f3399r
            int r5 = r5.mo4778b(r7, r15, r14)
            b.i.b.c$c r14 = r0.f3399r
            int r14 = r14.mo4771a((android.view.View) r7)
            b.i.b.c$c r15 = r0.f3399r
            int r15 = r15.mo4777b((android.view.View) r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m4955a((float) r9, (float) r10, (int) r4)
            int r5 = r0.f3382a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo4765b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m4964c((android.view.MotionEvent) r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo4755a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m4960b((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo4754a((int) r2, (int) r3)
            android.view.View r3 = r0.f3400s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f3382a
            if (r3 != r4) goto L_0x0125
            r0.mo4765b((android.view.View) r2, (int) r1)
        L_0x0125:
            int[] r2 = r0.f3389h
            r2 = r2[r1]
            int r3 = r0.f3397p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            b.i.b.c$c r4 = r0.f3399r
            r2 = r2 & r3
            r4.mo4779b((int) r2, (int) r1)
        L_0x0135:
            int r1 = r0.f3382a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p039i.p041b.C0923c.mo4764b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4765b(View view, int i) {
        if (view == this.f3400s && this.f3384c == i) {
            return true;
        }
        if (view == null || !this.f3399r.mo4781b(view, i)) {
            return false;
        }
        this.f3384c = i;
        mo4757a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo4766b(View view, int i, int i2) {
        this.f3400s = view;
        this.f3384c = -1;
        boolean b = m4961b(i, i2, 0, 0);
        if (!b && this.f3382a == 0 && this.f3400s != null) {
            this.f3400s = null;
        }
        return b;
    }

    /* renamed from: c */
    public boolean mo4767c(int i, int i2) {
        if (this.f3401t) {
            return m4961b(i, i2, (int) this.f3393l.getXVelocity(this.f3384c), (int) this.f3393l.getYVelocity(this.f3384c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
}
