package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.recyclerview.widget.g */
class C0593g extends RecyclerView.C0537n implements RecyclerView.C0546s {

    /* renamed from: D */
    private static final int[] f2409D = {16842919};

    /* renamed from: E */
    private static final int[] f2410E = new int[0];

    /* renamed from: A */
    int f2411A = 0;

    /* renamed from: B */
    private final Runnable f2412B = new C0594a();

    /* renamed from: C */
    private final RecyclerView.C0547t f2413C = new C0595b();

    /* renamed from: a */
    private final int f2414a;

    /* renamed from: b */
    private final int f2415b;

    /* renamed from: c */
    final StateListDrawable f2416c;

    /* renamed from: d */
    final Drawable f2417d;

    /* renamed from: e */
    private final int f2418e;

    /* renamed from: f */
    private final int f2419f;

    /* renamed from: g */
    private final StateListDrawable f2420g;

    /* renamed from: h */
    private final Drawable f2421h;

    /* renamed from: i */
    private final int f2422i;

    /* renamed from: j */
    private final int f2423j;

    /* renamed from: k */
    int f2424k;

    /* renamed from: l */
    int f2425l;

    /* renamed from: m */
    float f2426m;

    /* renamed from: n */
    int f2427n;

    /* renamed from: o */
    int f2428o;

    /* renamed from: p */
    float f2429p;

    /* renamed from: q */
    private int f2430q = 0;

    /* renamed from: r */
    private int f2431r = 0;

    /* renamed from: s */
    private RecyclerView f2432s;

    /* renamed from: t */
    private boolean f2433t = false;

    /* renamed from: u */
    private boolean f2434u = false;

    /* renamed from: v */
    private int f2435v = 0;

    /* renamed from: w */
    private int f2436w = 0;

    /* renamed from: x */
    private final int[] f2437x = new int[2];

    /* renamed from: y */
    private final int[] f2438y = new int[2];

    /* renamed from: z */
    final ValueAnimator f2439z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.g$a */
    class C0594a implements Runnable {
        C0594a() {
        }

        public void run() {
            C0593g.this.mo3525a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    class C0595b extends RecyclerView.C0547t {
        C0595b() {
        }

        /* renamed from: a */
        public void mo3290a(RecyclerView recyclerView, int i, int i2) {
            C0593g.this.mo3526a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    private class C0596c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2442a = false;

        C0596c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f2442a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2442a) {
                this.f2442a = false;
            } else if (((Float) C0593g.this.f2439z.getAnimatedValue()).floatValue() == 0.0f) {
                C0593g gVar = C0593g.this;
                gVar.f2411A = 0;
                gVar.mo3530b(0);
            } else {
                C0593g gVar2 = C0593g.this;
                gVar2.f2411A = 2;
                gVar2.mo3524a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    private class C0597d implements ValueAnimator.AnimatorUpdateListener {
        C0597d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0593g.this.f2416c.setAlpha(floatValue);
            C0593g.this.f2417d.setAlpha(floatValue);
            C0593g.this.mo3524a();
        }
    }

    C0593g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f2416c = stateListDrawable;
        this.f2417d = drawable;
        this.f2420g = stateListDrawable2;
        this.f2421h = drawable2;
        this.f2418e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2419f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2422i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2423j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2414a = i2;
        this.f2415b = i3;
        this.f2416c.setAlpha(255);
        this.f2417d.setAlpha(255);
        this.f2439z.addListener(new C0596c());
        this.f2439z.addUpdateListener(new C0597d());
        mo3527a(recyclerView);
    }

    /* renamed from: a */
    private int m3319a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m3320a(float f) {
        int[] e = m3327e();
        float max = Math.max((float) e[0], Math.min((float) e[1], f));
        if (Math.abs(((float) this.f2428o) - max) >= 2.0f) {
            int a = m3319a(this.f2429p, max, e, this.f2432s.computeHorizontalScrollRange(), this.f2432s.computeHorizontalScrollOffset(), this.f2430q);
            if (a != 0) {
                this.f2432s.scrollBy(a, 0);
            }
            this.f2429p = max;
        }
    }

    /* renamed from: a */
    private void m3321a(Canvas canvas) {
        int i = this.f2431r;
        int i2 = this.f2422i;
        int i3 = i - i2;
        int i4 = this.f2428o;
        int i5 = this.f2427n;
        int i6 = i4 - (i5 / 2);
        this.f2420g.setBounds(0, 0, i5, i2);
        this.f2421h.setBounds(0, 0, this.f2430q, this.f2423j);
        canvas.translate(0.0f, (float) i3);
        this.f2421h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f2420g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m3322b(float f) {
        int[] f2 = m3328f();
        float max = Math.max((float) f2[0], Math.min((float) f2[1], f));
        if (Math.abs(((float) this.f2425l) - max) >= 2.0f) {
            int a = m3319a(this.f2426m, max, f2, this.f2432s.computeVerticalScrollRange(), this.f2432s.computeVerticalScrollOffset(), this.f2431r);
            if (a != 0) {
                this.f2432s.scrollBy(0, a);
            }
            this.f2426m = max;
        }
    }

    /* renamed from: b */
    private void m3323b(Canvas canvas) {
        int i = this.f2430q;
        int i2 = this.f2418e;
        int i3 = i - i2;
        int i4 = this.f2425l;
        int i5 = this.f2424k;
        int i6 = i4 - (i5 / 2);
        this.f2416c.setBounds(0, 0, i2, i5);
        this.f2417d.setBounds(0, 0, this.f2419f, this.f2431r);
        if (m3329g()) {
            this.f2417d.draw(canvas);
            canvas.translate((float) this.f2418e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2416c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f2418e;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f2417d.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f2416c.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: c */
    private void m3324c() {
        this.f2432s.removeCallbacks(this.f2412B);
    }

    /* renamed from: c */
    private void m3325c(int i) {
        m3324c();
        this.f2432s.postDelayed(this.f2412B, (long) i);
    }

    /* renamed from: d */
    private void m3326d() {
        this.f2432s.removeItemDecoration(this);
        this.f2432s.removeOnItemTouchListener(this);
        this.f2432s.removeOnScrollListener(this.f2413C);
        m3324c();
    }

    /* renamed from: e */
    private int[] m3327e() {
        int[] iArr = this.f2438y;
        int i = this.f2415b;
        iArr[0] = i;
        iArr[1] = this.f2430q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m3328f() {
        int[] iArr = this.f2437x;
        int i = this.f2415b;
        iArr[0] = i;
        iArr[1] = this.f2431r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m3329g() {
        return C0890v.m4791o(this.f2432s) == 1;
    }

    /* renamed from: h */
    private void m3330h() {
        this.f2432s.addItemDecoration(this);
        this.f2432s.addOnItemTouchListener(this);
        this.f2432s.addOnScrollListener(this.f2413C);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3524a() {
        this.f2432s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3525a(int i) {
        int i2 = this.f2411A;
        if (i2 == 1) {
            this.f2439z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f2411A = 3;
        ValueAnimator valueAnimator = this.f2439z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f2439z.setDuration((long) i);
        this.f2439z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3526a(int i, int i2) {
        int computeVerticalScrollRange = this.f2432s.computeVerticalScrollRange();
        int i3 = this.f2431r;
        this.f2433t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2414a;
        int computeHorizontalScrollRange = this.f2432s.computeHorizontalScrollRange();
        int i4 = this.f2430q;
        this.f2434u = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2414a;
        if (this.f2433t || this.f2434u) {
            if (this.f2433t) {
                float f = (float) i3;
                this.f2425l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f2424k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f2434u) {
                float f2 = (float) i4;
                this.f2428o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f2427n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f2435v;
            if (i5 == 0 || i5 == 1) {
                mo3530b(1);
            }
        } else if (this.f2435v != 0) {
            mo3530b(0);
        }
    }

    /* renamed from: a */
    public void mo3527a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2432s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3326d();
            }
            this.f2432s = recyclerView;
            if (this.f2432s != null) {
                m3330h();
            }
        }
    }

    /* renamed from: a */
    public void mo3286a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3528a(float f, float f2) {
        if (f2 >= ((float) (this.f2431r - this.f2422i))) {
            int i = this.f2428o;
            int i2 = this.f2427n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: a */
    public boolean mo3287a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2435v;
        if (i != 1) {
            return i == 2;
        }
        boolean b = mo3531b(motionEvent.getX(), motionEvent.getY());
        boolean a = mo3528a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b && !a) {
            return false;
        }
        if (a) {
            this.f2436w = 1;
            this.f2429p = (float) ((int) motionEvent.getX());
        } else if (b) {
            this.f2436w = 2;
            this.f2426m = (float) ((int) motionEvent.getY());
        }
        mo3530b(2);
    }

    /* renamed from: b */
    public void mo3529b() {
        int i = this.f2411A;
        if (i != 0) {
            if (i == 3) {
                this.f2439z.cancel();
            } else {
                return;
            }
        }
        this.f2411A = 1;
        ValueAnimator valueAnimator = this.f2439z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2439z.setDuration(500);
        this.f2439z.setStartDelay(0);
        this.f2439z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3530b(int i) {
        int i2;
        if (i == 2 && this.f2435v != 2) {
            this.f2416c.setState(f2409D);
            m3324c();
        }
        if (i == 0) {
            mo3524a();
        } else {
            mo3529b();
        }
        if (this.f2435v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f2435v = i;
        }
        this.f2416c.setState(f2410E);
        i2 = 1200;
        m3325c(i2);
        this.f2435v = i;
    }

    /* renamed from: b */
    public void mo3174b(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0518a0 a0Var) {
        if (this.f2430q != this.f2432s.getWidth() || this.f2431r != this.f2432s.getHeight()) {
            this.f2430q = this.f2432s.getWidth();
            this.f2431r = this.f2432s.getHeight();
            mo3530b(0);
        } else if (this.f2411A != 0) {
            if (this.f2433t) {
                m3323b(canvas);
            }
            if (this.f2434u) {
                m3321a(canvas);
            }
        }
    }

    /* renamed from: b */
    public void mo3288b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2435v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo3531b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo3528a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f2436w = 1;
                        this.f2429p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f2436w = 2;
                        this.f2426m = (float) ((int) motionEvent.getY());
                    }
                    mo3530b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2435v == 2) {
                this.f2426m = 0.0f;
                this.f2429p = 0.0f;
                mo3530b(1);
                this.f2436w = 0;
            } else if (motionEvent.getAction() == 2 && this.f2435v == 2) {
                mo3529b();
                if (this.f2436w == 1) {
                    m3320a(motionEvent.getX());
                }
                if (this.f2436w == 2) {
                    m3322b(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3531b(float f, float f2) {
        if (!m3329g() ? f >= ((float) (this.f2430q - this.f2418e)) : f <= ((float) (this.f2418e / 2))) {
            int i = this.f2425l;
            int i2 = this.f2424k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }
}
