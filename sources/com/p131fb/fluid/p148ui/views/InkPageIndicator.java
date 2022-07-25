package com.p131fb.fluid.p148ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.p131fb.fluid.C1719h;
import java.util.Arrays;
import p006b.p043k.p044a.p045a.C0931b;

/* renamed from: com.fb.fluid.ui.views.InkPageIndicator */
public class InkPageIndicator extends View implements ViewPager.C0643j, View.OnAttachStateChangeListener {

    /* renamed from: A */
    private float[] f6294A;

    /* renamed from: B */
    private boolean f6295B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f6296C;

    /* renamed from: D */
    private final Paint f6297D;

    /* renamed from: E */
    private final Paint f6298E;

    /* renamed from: F */
    private final Path f6299F;

    /* renamed from: G */
    private final Path f6300G;

    /* renamed from: H */
    private final Path f6301H;

    /* renamed from: I */
    private final Path f6302I;

    /* renamed from: J */
    private final RectF f6303J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C2501f f6304K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C2505g[] f6305L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final Interpolator f6306M;

    /* renamed from: N */
    float f6307N;

    /* renamed from: O */
    float f6308O;

    /* renamed from: P */
    float f6309P;

    /* renamed from: Q */
    float f6310Q;

    /* renamed from: R */
    float f6311R;

    /* renamed from: S */
    float f6312S;

    /* renamed from: T */
    float f6313T;

    /* renamed from: U */
    float f6314U;

    /* renamed from: f */
    private int f6315f;

    /* renamed from: g */
    private int f6316g;

    /* renamed from: h */
    private long f6317h;

    /* renamed from: i */
    private int f6318i;

    /* renamed from: j */
    private int f6319j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f6320k;

    /* renamed from: l */
    private float f6321l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f6322m;

    /* renamed from: n */
    private float f6323n;

    /* renamed from: o */
    private float f6324o;

    /* renamed from: p */
    private float f6325p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ViewPager f6326q;

    /* renamed from: r */
    private int f6327r;

    /* renamed from: s */
    private int f6328s;

    /* renamed from: t */
    private int f6329t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f6330u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f6331v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float[] f6332w;

    /* renamed from: x */
    private float[] f6333x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f6334y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f6335z;

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$a */
    class C2496a extends DataSetObserver {
        C2496a() {
        }

        public void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.f6326q.getAdapter().mo3754a());
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$b */
    class C2497b extends AnimatorListenerAdapter {
        C2497b() {
        }

        public void onAnimationEnd(Animator animator) {
            InkPageIndicator.this.m9340b();
            boolean unused = InkPageIndicator.this.f6296C = false;
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$c */
    class C2498c implements ValueAnimator.AnimatorUpdateListener {
        C2498c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = InkPageIndicator.this.f6330u = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InkPageIndicator.this.f6304K.mo7399a(InkPageIndicator.this.f6330u);
            InkPageIndicator.this.postInvalidateOnAnimation();
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$d */
    class C2499d extends AnimatorListenerAdapter {
        C2499d() {
        }

        public void onAnimationEnd(Animator animator) {
            boolean unused = InkPageIndicator.this.f6331v = true;
        }

        public void onAnimationStart(Animator animator) {
            boolean unused = InkPageIndicator.this.f6331v = false;
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$e */
    public class C2500e extends C2510j {
        public C2500e(InkPageIndicator inkPageIndicator, float f) {
            super(inkPageIndicator, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7392a(float f) {
            return f < this.f6353a;
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$f */
    public class C2501f extends C2508h {

        /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$f$a */
        class C2502a implements ValueAnimator.AnimatorUpdateListener {
            C2502a(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = InkPageIndicator.this.f6334y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                InkPageIndicator.this.postInvalidateOnAnimation();
                for (C2505g a : InkPageIndicator.this.f6305L) {
                    a.mo7399a(InkPageIndicator.this.f6334y);
                }
            }
        }

        /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$f$b */
        class C2503b implements ValueAnimator.AnimatorUpdateListener {
            C2503b(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = InkPageIndicator.this.f6335z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                InkPageIndicator.this.postInvalidateOnAnimation();
                for (C2505g a : InkPageIndicator.this.f6305L) {
                    a.mo7399a(InkPageIndicator.this.f6335z);
                }
            }
        }

        /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$f$c */
        class C2504c extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int[] f6343a;

            /* renamed from: b */
            final /* synthetic */ float f6344b;

            /* renamed from: c */
            final /* synthetic */ float f6345c;

            C2504c(InkPageIndicator inkPageIndicator, int[] iArr, float f, float f2) {
                this.f6343a = iArr;
                this.f6344b = f;
                this.f6345c = f2;
            }

            public void onAnimationEnd(Animator animator) {
                float unused = InkPageIndicator.this.f6334y = -1.0f;
                float unused2 = InkPageIndicator.this.f6335z = -1.0f;
                InkPageIndicator.this.postInvalidateOnAnimation();
            }

            public void onAnimationStart(Animator animator) {
                InkPageIndicator.this.m9330a();
                for (int a : this.f6343a) {
                    InkPageIndicator.this.m9331a(a, 1.0E-5f);
                }
                float unused = InkPageIndicator.this.f6334y = this.f6344b;
                float unused2 = InkPageIndicator.this.f6335z = this.f6345c;
                InkPageIndicator.this.postInvalidateOnAnimation();
            }
        }

        public C2501f(int i, int i2, int i3, C2510j jVar) {
            super(InkPageIndicator.this, jVar);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
            setDuration(InkPageIndicator.this.f6322m);
            setInterpolator(InkPageIndicator.this.f6306M);
            float[] l = InkPageIndicator.this.f6332w;
            float min = (i2 > i ? Math.min(l[i], InkPageIndicator.this.f6330u) : l[i2]) - InkPageIndicator.this.f6320k;
            float[] l2 = InkPageIndicator.this.f6332w;
            float b = (i2 > i ? l2[i2] : l2[i2]) - InkPageIndicator.this.f6320k;
            float[] l3 = InkPageIndicator.this.f6332w;
            float max = (i2 > i ? l3[i2] : Math.max(l3[i], InkPageIndicator.this.f6330u)) + InkPageIndicator.this.f6320k;
            float[] l4 = InkPageIndicator.this.f6332w;
            float b2 = (i2 > i ? l4[i2] : l4[i2]) + InkPageIndicator.this.f6320k;
            C2505g[] unused = InkPageIndicator.this.f6305L = new C2505g[i3];
            int[] iArr = new int[i3];
            int i4 = 0;
            if (min != b) {
                setFloatValues(new float[]{min, b});
                while (i4 < i3) {
                    int i5 = i + i4;
                    InkPageIndicator.this.f6305L[i4] = new C2505g(i5, new C2509i(InkPageIndicator.this, InkPageIndicator.this.f6332w[i5]));
                    iArr[i4] = i5;
                    i4++;
                }
                animatorUpdateListener = new C2502a(InkPageIndicator.this);
            } else {
                setFloatValues(new float[]{max, b2});
                while (i4 < i3) {
                    int i6 = i - i4;
                    InkPageIndicator.this.f6305L[i4] = new C2505g(i6, new C2500e(InkPageIndicator.this, InkPageIndicator.this.f6332w[i6]));
                    iArr[i4] = i6;
                    i4++;
                }
                animatorUpdateListener = new C2503b(InkPageIndicator.this);
            }
            addUpdateListener(animatorUpdateListener);
            addListener(new C2504c(InkPageIndicator.this, iArr, min, max));
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$g */
    public class C2505g extends C2508h {
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6347h;

        /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$g$a */
        class C2506a implements ValueAnimator.AnimatorUpdateListener {
            C2506a(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C2505g gVar = C2505g.this;
                InkPageIndicator.this.m9331a(gVar.f6347h, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$g$b */
        class C2507b extends AnimatorListenerAdapter {
            C2507b(InkPageIndicator inkPageIndicator) {
            }

            public void onAnimationEnd(Animator animator) {
                C2505g gVar = C2505g.this;
                InkPageIndicator.this.m9331a(gVar.f6347h, 0.0f);
                InkPageIndicator.this.postInvalidateOnAnimation();
            }
        }

        public C2505g(int i, C2510j jVar) {
            super(InkPageIndicator.this, jVar);
            setFloatValues(new float[]{1.0E-5f, 1.0f});
            this.f6347h = i;
            setDuration(InkPageIndicator.this.f6322m);
            setInterpolator(InkPageIndicator.this.f6306M);
            addUpdateListener(new C2506a(InkPageIndicator.this));
            addListener(new C2507b(InkPageIndicator.this));
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$h */
    public abstract class C2508h extends ValueAnimator {

        /* renamed from: f */
        protected boolean f6351f = false;

        /* renamed from: g */
        protected C2510j f6352g;

        public C2508h(InkPageIndicator inkPageIndicator, C2510j jVar) {
            this.f6352g = jVar;
        }

        /* renamed from: a */
        public void mo7399a(float f) {
            if (!this.f6351f && this.f6352g.mo7392a(f)) {
                start();
                this.f6351f = true;
            }
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$i */
    public class C2509i extends C2510j {
        public C2509i(InkPageIndicator inkPageIndicator, float f) {
            super(inkPageIndicator, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7392a(float f) {
            return f > this.f6353a;
        }
    }

    /* renamed from: com.fb.fluid.ui.views.InkPageIndicator$j */
    public abstract class C2510j {

        /* renamed from: a */
        protected float f6353a;

        public C2510j(InkPageIndicator inkPageIndicator, float f) {
            this.f6353a = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo7392a(float f);
    }

    public InkPageIndicator(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = (int) context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1719h.InkPageIndicator, i, 0);
        this.f6315f = obtainStyledAttributes.getDimensionPixelSize(2, i2 * 8);
        this.f6320k = (float) (this.f6315f / 2);
        this.f6321l = this.f6320k / 2.0f;
        this.f6316g = obtainStyledAttributes.getDimensionPixelSize(3, i2 * 12);
        this.f6317h = (long) obtainStyledAttributes.getInteger(0, 400);
        this.f6322m = this.f6317h / 2;
        this.f6318i = obtainStyledAttributes.getColor(4, -2130706433);
        this.f6319j = obtainStyledAttributes.getColor(1, -1);
        obtainStyledAttributes.recycle();
        this.f6297D = new Paint(1);
        this.f6297D.setColor(this.f6318i);
        this.f6298E = new Paint(1);
        this.f6298E.setColor(this.f6319j);
        this.f6306M = new C0931b();
        this.f6299F = new Path();
        this.f6300G = new Path();
        this.f6301H = new Path();
        this.f6302I = new Path();
        this.f6303J = new RectF();
        addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    private ValueAnimator m9327a(float f, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f6330u, f});
        this.f6304K = new C2501f(i, i2, i3, i2 > i ? new C2509i(this, f - ((f - this.f6330u) * 0.25f)) : new C2500e(this, f + ((this.f6330u - f) * 0.25f)));
        this.f6304K.addListener(new C2497b());
        ofFloat.addUpdateListener(new C2498c());
        ofFloat.addListener(new C2499d());
        ofFloat.setStartDelay(this.f6331v ? this.f6317h / 4 : 0);
        ofFloat.setDuration((this.f6317h * 3) / 4);
        ofFloat.setInterpolator(this.f6306M);
        return ofFloat;
    }

    /* renamed from: a */
    private Path m9328a(int i, float f, float f2, float f3, float f4) {
        int i2 = i;
        float f5 = f;
        float f6 = f2;
        this.f6300G.rewind();
        int i3 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if ((i3 == 0 || f3 == -1.0f) && f4 == 0.0f && !(i2 == this.f6328s && this.f6331v)) {
            this.f6300G.addCircle(this.f6332w[i2], this.f6324o, this.f6320k, Path.Direction.CW);
        }
        if (i3 > 0 && f3 <= 0.5f && this.f6334y == -1.0f) {
            this.f6301H.rewind();
            this.f6301H.moveTo(f5, this.f6325p);
            RectF rectF = this.f6303J;
            float f7 = this.f6320k;
            rectF.set(f5 - f7, this.f6323n, f7 + f5, this.f6325p);
            this.f6301H.arcTo(this.f6303J, 90.0f, 180.0f, true);
            this.f6307N = this.f6320k + f5 + (((float) this.f6316g) * f3);
            this.f6308O = this.f6324o;
            float f8 = this.f6321l;
            this.f6311R = f5 + f8;
            this.f6312S = this.f6323n;
            float f9 = this.f6307N;
            this.f6313T = f9;
            float f10 = this.f6308O;
            this.f6314U = f10 - f8;
            this.f6301H.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, f9, f10);
            this.f6309P = f5;
            float f11 = this.f6325p;
            this.f6310Q = f11;
            this.f6311R = this.f6307N;
            float f12 = this.f6308O;
            float f13 = this.f6321l;
            this.f6312S = f12 + f13;
            this.f6313T = f5 + f13;
            this.f6314U = f11;
            this.f6301H.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, this.f6309P, this.f6310Q);
            this.f6300G.op(this.f6301H, Path.Op.UNION);
            this.f6302I.rewind();
            this.f6302I.moveTo(f6, this.f6325p);
            RectF rectF2 = this.f6303J;
            float f14 = this.f6320k;
            rectF2.set(f6 - f14, this.f6323n, f14 + f6, this.f6325p);
            this.f6302I.arcTo(this.f6303J, 90.0f, -180.0f, true);
            this.f6307N = (f6 - this.f6320k) - (((float) this.f6316g) * f3);
            this.f6308O = this.f6324o;
            float f15 = this.f6321l;
            this.f6311R = f6 - f15;
            this.f6312S = this.f6323n;
            float f16 = this.f6307N;
            this.f6313T = f16;
            float f17 = this.f6308O;
            this.f6314U = f17 - f15;
            this.f6302I.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, f16, f17);
            this.f6309P = f6;
            float f18 = this.f6325p;
            this.f6310Q = f18;
            this.f6311R = this.f6307N;
            float f19 = this.f6308O;
            float f20 = this.f6321l;
            this.f6312S = f19 + f20;
            float f21 = this.f6309P;
            this.f6313T = f21 - f20;
            this.f6314U = f18;
            this.f6302I.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, f21, this.f6310Q);
            this.f6300G.op(this.f6302I, Path.Op.UNION);
        }
        if (f3 > 0.5f && f3 < 1.0f && this.f6334y == -1.0f) {
            float f22 = (f3 - 0.2f) * 1.25f;
            this.f6300G.moveTo(f5, this.f6325p);
            RectF rectF3 = this.f6303J;
            float f23 = this.f6320k;
            rectF3.set(f5 - f23, this.f6323n, f23 + f5, this.f6325p);
            this.f6300G.arcTo(this.f6303J, 90.0f, 180.0f, true);
            float f24 = this.f6320k;
            this.f6307N = f5 + f24 + ((float) (this.f6316g / 2));
            this.f6308O = this.f6324o - (f22 * f24);
            float f25 = this.f6307N;
            this.f6311R = f25 - (f22 * f24);
            this.f6312S = this.f6323n;
            float f26 = 1.0f - f22;
            this.f6313T = f25 - (f24 * f26);
            float f27 = this.f6308O;
            this.f6314U = f27;
            this.f6300G.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, f25, f27);
            this.f6309P = f6;
            float f28 = this.f6323n;
            this.f6310Q = f28;
            float f29 = this.f6307N;
            float f30 = this.f6320k;
            this.f6311R = (f26 * f30) + f29;
            this.f6312S = this.f6308O;
            this.f6313T = f29 + (f30 * f22);
            this.f6314U = f28;
            this.f6300G.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, this.f6309P, this.f6310Q);
            RectF rectF4 = this.f6303J;
            float f31 = this.f6320k;
            rectF4.set(f6 - f31, this.f6323n, f31 + f6, this.f6325p);
            this.f6300G.arcTo(this.f6303J, 270.0f, 180.0f, true);
            float f32 = this.f6324o;
            float f33 = this.f6320k;
            this.f6308O = f32 + (f22 * f33);
            float f34 = this.f6307N;
            this.f6311R = (f22 * f33) + f34;
            this.f6312S = this.f6325p;
            this.f6313T = (f33 * f26) + f34;
            float f35 = this.f6308O;
            this.f6314U = f35;
            this.f6300G.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, f34, f35);
            this.f6309P = f5;
            this.f6310Q = this.f6325p;
            float f36 = this.f6307N;
            float f37 = this.f6320k;
            this.f6311R = f36 - (f26 * f37);
            this.f6312S = this.f6308O;
            this.f6313T = f36 - (f22 * f37);
            float f38 = this.f6310Q;
            this.f6314U = f38;
            this.f6300G.cubicTo(this.f6311R, this.f6312S, this.f6313T, this.f6314U, this.f6309P, f38);
        }
        if (f3 == 1.0f && this.f6334y == -1.0f) {
            RectF rectF5 = this.f6303J;
            float f39 = this.f6320k;
            rectF5.set(f5 - f39, this.f6323n, f6 + f39, this.f6325p);
            Path path = this.f6300G;
            RectF rectF6 = this.f6303J;
            float f40 = this.f6320k;
            path.addRoundRect(rectF6, f40, f40, Path.Direction.CW);
        }
        if (f4 > 1.0E-5f) {
            this.f6300G.addCircle(f5, this.f6324o, this.f6320k * f4, Path.Direction.CW);
        }
        return this.f6300G;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9330a() {
        Arrays.fill(this.f6333x, 0.0f);
        postInvalidateOnAnimation();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9331a(int i, float f) {
        this.f6294A[i] = f;
        postInvalidateOnAnimation();
    }

    /* renamed from: a */
    private void m9332a(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        getPaddingBottom();
        float requiredWidth = ((float) (paddingLeft + (((paddingRight - paddingLeft) - getRequiredWidth()) / 2))) + this.f6320k;
        this.f6332w = new float[this.f6327r];
        for (int i3 = 0; i3 < this.f6327r; i3++) {
            this.f6332w[i3] = ((float) ((this.f6315f + this.f6316g) * i3)) + requiredWidth;
        }
        float f = (float) paddingTop;
        this.f6323n = f;
        this.f6324o = f + this.f6320k;
        this.f6325p = (float) (paddingTop + this.f6315f);
        m9345c();
    }

    /* renamed from: a */
    private void m9333a(Canvas canvas) {
        canvas.drawCircle(this.f6330u, this.f6324o, this.f6320k, this.f6298E);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m9340b() {
        this.f6333x = new float[(this.f6327r - 1)];
        Arrays.fill(this.f6333x, 0.0f);
        this.f6294A = new float[this.f6327r];
        Arrays.fill(this.f6294A, 0.0f);
        this.f6334y = -1.0f;
        this.f6335z = -1.0f;
        this.f6331v = true;
    }

    /* renamed from: b */
    private void m9341b(int i, float f) {
        if (i < this.f6333x.length) {
            if (i == 1) {
                Log.d("PageIndicator", "dot 1 fraction:\t" + f);
            }
            this.f6333x[i] = f;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: b */
    private void m9342b(Canvas canvas) {
        this.f6299F.rewind();
        int i = 0;
        while (true) {
            int i2 = this.f6327r;
            if (i >= i2) {
                break;
            }
            int i3 = i == i2 + -1 ? i : i + 1;
            Path path = this.f6299F;
            float[] fArr = this.f6332w;
            path.op(m9328a(i, fArr[i], fArr[i3], i == this.f6327r + -1 ? -1.0f : this.f6333x[i], this.f6294A[i]), Path.Op.UNION);
            i++;
        }
        if (this.f6334y != -1.0f) {
            this.f6299F.op(getRetreatingJoinPath(), Path.Op.UNION);
        }
        canvas.drawPath(this.f6299F, this.f6297D);
    }

    /* renamed from: c */
    private void m9345c() {
        ViewPager viewPager = this.f6326q;
        this.f6328s = viewPager != null ? viewPager.getCurrentItem() : 0;
        float[] fArr = this.f6332w;
        if (fArr != null) {
            this.f6330u = fArr[this.f6328s];
        }
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f6315f + getPaddingBottom();
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        int i = this.f6327r;
        return (this.f6315f * i) + ((i - 1) * this.f6316g);
    }

    private Path getRetreatingJoinPath() {
        this.f6300G.rewind();
        this.f6303J.set(this.f6334y, this.f6323n, this.f6335z, this.f6325p);
        Path path = this.f6300G;
        RectF rectF = this.f6303J;
        float f = this.f6320k;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return this.f6300G;
    }

    /* access modifiers changed from: private */
    public void setPageCount(int i) {
        this.f6327r = i;
        m9340b();
        requestLayout();
    }

    private void setSelectedPage(int i) {
        int i2 = this.f6328s;
        if (i != i2 && this.f6332w != null) {
            this.f6296C = true;
            this.f6329t = i2;
            this.f6328s = i;
            int abs = Math.abs(i - this.f6329t);
            if (abs > 1) {
                if (i > this.f6329t) {
                    for (int i3 = 0; i3 < abs; i3++) {
                        m9341b(this.f6329t + i3, 1.0f);
                    }
                } else {
                    for (int i4 = -1; i4 > (-abs); i4--) {
                        m9341b(this.f6329t + i4, 1.0f);
                    }
                }
            }
            m9327a(this.f6332w[i], this.f6329t, i, abs).start();
        }
    }

    /* renamed from: a */
    public void mo3741a(int i) {
    }

    /* renamed from: a */
    public void mo3742a(int i, float f, int i2) {
        if (this.f6295B) {
            int i3 = this.f6296C ? this.f6329t : this.f6328s;
            if (i3 != i) {
                f = 1.0f - f;
                if (f == 1.0f) {
                    i = Math.min(i3, i);
                }
            }
            m9341b(i, f);
        }
    }

    /* renamed from: b */
    public void mo3743b(int i) {
        if (this.f6295B) {
            setSelectedPage(i);
        } else {
            m9345c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6326q != null && this.f6327r != 0) {
            m9342b(canvas);
            m9333a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
        m9332a(desiredWidth, desiredHeight);
    }

    public void onViewAttachedToWindow(View view) {
        this.f6295B = true;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f6295B = false;
    }

    public void setSelectedColour(int i) {
        this.f6319j = i;
        this.f6298E.setColor(i);
        invalidate();
    }

    public void setUnselectedColour(int i) {
        this.f6318i = i;
        this.f6297D.setColor(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f6326q = viewPager;
        viewPager.mo3685a((ViewPager.C0643j) this);
        setPageCount(viewPager.getAdapter().mo3754a());
        viewPager.getAdapter().mo3756a((DataSetObserver) new C2496a());
        m9345c();
    }
}
