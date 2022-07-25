package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0328a;
import com.google.android.material.internal.C2666e;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p026g.p034j.C0837h;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1166a;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p087l.C1180b;
import p054c.p083e.p084a.p085a.p087l.C1184f;
import p054c.p083e.p084a.p085a.p087l.C1185g;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p100x.C1227b;
import p054c.p083e.p084a.p085a.p101y.C1229b;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1236e;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p054c.p083e.p084a.p085a.p102z.C1252j;

/* renamed from: com.google.android.material.floatingactionbutton.b */
class C2643b {

    /* renamed from: G */
    static final TimeInterpolator f6934G = C1179a.f3916c;

    /* renamed from: H */
    static final int[] f6935H = {16842919, 16842910};

    /* renamed from: I */
    static final int[] f6936I = {16843623, 16842908, 16842910};

    /* renamed from: J */
    static final int[] f6937J = {16842908, 16842910};

    /* renamed from: K */
    static final int[] f6938K = {16843623, 16842910};

    /* renamed from: L */
    static final int[] f6939L = {16842910};

    /* renamed from: M */
    static final int[] f6940M = new int[0];

    /* renamed from: A */
    final C1229b f6941A;

    /* renamed from: B */
    private final Rect f6942B = new Rect();

    /* renamed from: C */
    private final RectF f6943C = new RectF();

    /* renamed from: D */
    private final RectF f6944D = new RectF();

    /* renamed from: E */
    private final Matrix f6945E = new Matrix();

    /* renamed from: F */
    private ViewTreeObserver.OnPreDrawListener f6946F;

    /* renamed from: a */
    C1238g f6947a;

    /* renamed from: b */
    C1233d f6948b;

    /* renamed from: c */
    Drawable f6949c;

    /* renamed from: d */
    C2642a f6950d;

    /* renamed from: e */
    Drawable f6951e;

    /* renamed from: f */
    boolean f6952f;

    /* renamed from: g */
    boolean f6953g;

    /* renamed from: h */
    boolean f6954h = true;

    /* renamed from: i */
    float f6955i;

    /* renamed from: j */
    float f6956j;

    /* renamed from: k */
    float f6957k;

    /* renamed from: l */
    int f6958l;

    /* renamed from: m */
    private final C2666e f6959m;

    /* renamed from: n */
    private C1186h f6960n;

    /* renamed from: o */
    private C1186h f6961o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Animator f6962p;

    /* renamed from: q */
    private C1186h f6963q;

    /* renamed from: r */
    private C1186h f6964r;

    /* renamed from: s */
    private float f6965s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f6966t = 1.0f;

    /* renamed from: u */
    private int f6967u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f6968v = 0;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f6969w;

    /* renamed from: x */
    private ArrayList<Animator.AnimatorListener> f6970x;

    /* renamed from: y */
    private ArrayList<C2651h> f6971y;

    /* renamed from: z */
    final FloatingActionButton f6972z;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    class C2644a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6973a;

        /* renamed from: b */
        final /* synthetic */ boolean f6974b;

        /* renamed from: c */
        final /* synthetic */ C2652i f6975c;

        C2644a(boolean z, C2652i iVar) {
            this.f6974b = z;
            this.f6975c = iVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6973a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C2643b.this.f6968v = 0;
            Animator unused2 = C2643b.this.f6962p = null;
            if (!this.f6973a) {
                C2643b.this.f6972z.mo8559a(this.f6974b ? 8 : 4, this.f6974b);
                C2652i iVar = this.f6975c;
                if (iVar != null) {
                    iVar.mo8399b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C2643b.this.f6972z.mo8559a(0, this.f6974b);
            int unused = C2643b.this.f6968v = 1;
            Animator unused2 = C2643b.this.f6962p = animator;
            this.f6973a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    class C2645b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f6977a;

        /* renamed from: b */
        final /* synthetic */ C2652i f6978b;

        C2645b(boolean z, C2652i iVar) {
            this.f6977a = z;
            this.f6978b = iVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C2643b.this.f6968v = 0;
            Animator unused2 = C2643b.this.f6962p = null;
            C2652i iVar = this.f6978b;
            if (iVar != null) {
                iVar.mo8398a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C2643b.this.f6972z.mo8559a(0, this.f6977a);
            int unused = C2643b.this.f6968v = 2;
            Animator unused2 = C2643b.this.f6962p = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    class C2646c extends C1185g {
        C2646c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C2643b.this.f6966t = f;
            return super.mo5307a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    class C2647d implements ViewTreeObserver.OnPreDrawListener {
        C2647d() {
        }

        public boolean onPreDraw() {
            C2643b.this.mo8442o();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    private class C2648e extends C2654k {
        C2648e(C2643b bVar) {
            super(bVar, (C2644a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8459a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    private class C2649f extends C2654k {
        C2649f() {
            super(C2643b.this, (C2644a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8459a() {
            C2643b bVar = C2643b.this;
            return bVar.f6955i + bVar.f6956j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    private class C2650g extends C2654k {
        C2650g() {
            super(C2643b.this, (C2644a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8459a() {
            C2643b bVar = C2643b.this;
            return bVar.f6955i + bVar.f6957k;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    interface C2651h {
        /* renamed from: a */
        void mo8400a();

        /* renamed from: b */
        void mo8401b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    interface C2652i {
        /* renamed from: a */
        void mo8398a();

        /* renamed from: b */
        void mo8399b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    private class C2653j extends C2654k {
        C2653j() {
            super(C2643b.this, (C2644a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8459a() {
            return C2643b.this.f6955i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    private abstract class C2654k extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f6985a;

        /* renamed from: b */
        private float f6986b;

        /* renamed from: c */
        private float f6987c;

        private C2654k() {
        }

        /* synthetic */ C2654k(C2643b bVar, C2644a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo8459a();

        public void onAnimationEnd(Animator animator) {
            C2643b.this.mo8432e((float) ((int) this.f6987c));
            this.f6985a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f6985a) {
                C1233d dVar = C2643b.this.f6948b;
                this.f6986b = dVar == null ? 0.0f : dVar.mo5500c();
                this.f6987c = mo8459a();
                this.f6985a = true;
            }
            C2643b bVar = C2643b.this;
            float f = this.f6986b;
            bVar.mo8432e((float) ((int) (f + ((this.f6987c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    C2643b(FloatingActionButton floatingActionButton, C1229b bVar) {
        this.f6972z = floatingActionButton;
        this.f6941A = bVar;
        this.f6959m = new C2666e();
        this.f6959m.mo8546a(f6935H, m10416a((C2654k) new C2650g()));
        this.f6959m.mo8546a(f6936I, m10416a((C2654k) new C2649f()));
        this.f6959m.mo8546a(f6937J, m10416a((C2654k) new C2649f()));
        this.f6959m.mo8546a(f6938K, m10416a((C2654k) new C2649f()));
        this.f6959m.mo8546a(f6939L, m10416a((C2654k) new C2653j()));
        this.f6959m.mo8546a(f6940M, m10416a((C2654k) new C2648e(this)));
        this.f6965s = this.f6972z.getRotation();
    }

    /* renamed from: A */
    private ViewTreeObserver.OnPreDrawListener m10410A() {
        if (this.f6946F == null) {
            this.f6946F = new C2647d();
        }
        return this.f6946F;
    }

    /* renamed from: B */
    private boolean m10411B() {
        return C0890v.m4732C(this.f6972z) && !this.f6972z.isInEditMode();
    }

    /* renamed from: a */
    private AnimatorSet m10415a(C1186h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6972z, View.ALPHA, new float[]{f});
        hVar.mo5309a("opacity").mo5317a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6972z, View.SCALE_X, new float[]{f2});
        hVar.mo5309a("scale").mo5317a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f6972z, View.SCALE_Y, new float[]{f2});
        hVar.mo5309a("scale").mo5317a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m10417a(f3, this.f6945E);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f6972z, new C1184f(), new C2646c(), new Matrix[]{new Matrix(this.f6945E)});
        hVar.mo5309a("iconScale").mo5317a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1180b.m5736a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private ValueAnimator m10416a(C2654k kVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f6934G);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(kVar);
        valueAnimator.addUpdateListener(kVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    private void m10417a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f6972z.getDrawable();
        if (drawable != null && this.f6967u != 0) {
            RectF rectF = this.f6943C;
            RectF rectF2 = this.f6944D;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f6967u;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f6967u;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: y */
    private C1186h m10418y() {
        if (this.f6961o == null) {
            this.f6961o = C1186h.m5746a(this.f6972z.getContext(), C1166a.design_fab_hide_motion_spec);
        }
        C1186h hVar = this.f6961o;
        C0837h.m4534a(hVar);
        return hVar;
    }

    /* renamed from: z */
    private C1186h m10419z() {
        if (this.f6960n == null) {
            this.f6960n = C1186h.m5746a(this.f6972z.getContext(), C1166a.design_fab_show_motion_spec);
        }
        C1186h hVar = this.f6960n;
        C0837h.m4534a(hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo8406a() {
        return this.f6951e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8407a(float f) {
        if (this.f6955i != f) {
            this.f6955i = f;
            mo8408a(this.f6955i, this.f6956j, this.f6957k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8408a(float f, float f2, float f3) {
        mo8450w();
        mo8432e(f);
    }

    /* renamed from: a */
    public void mo8409a(Animator.AnimatorListener animatorListener) {
        if (this.f6970x == null) {
            this.f6970x = new ArrayList<>();
        }
        this.f6970x.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8410a(ColorStateList colorStateList) {
        C1233d dVar = this.f6948b;
        if (dVar != null) {
            dVar.setTintList(colorStateList);
        }
        C2642a aVar = this.f6950d;
        if (aVar != null) {
            aVar.mo8404a(colorStateList);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8411a(PorterDuff.Mode mode) {
        C1233d dVar = this.f6948b;
        if (dVar != null) {
            dVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8412a(Rect rect) {
        int sizeDimension = this.f6953g ? (this.f6958l - this.f6972z.getSizeDimension()) / 2 : 0;
        float b = this.f6954h ? mo8419b() + this.f6957k : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) b));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (b * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8413a(C1186h hVar) {
        this.f6964r = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8414a(C1238g gVar, boolean z) {
        if (z) {
            gVar = gVar.mo5533b((float) (this.f6972z.getSizeDimension() / 2));
        }
        this.f6947a = gVar;
        this.f6952f = z;
        C1233d dVar = this.f6948b;
        if (dVar != null) {
            dVar.setShapeAppearanceModel(gVar);
        }
        Drawable drawable = this.f6949c;
        if (drawable instanceof C1252j) {
            ((C1252j) drawable).setShapeAppearanceModel(gVar);
        }
        C2642a aVar = this.f6950d;
        if (aVar != null) {
            aVar.mo8405a(gVar);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8415a(C2651h hVar) {
        if (this.f6971y == null) {
            this.f6971y = new ArrayList<>();
        }
        this.f6971y.add(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8416a(C2652i iVar, boolean z) {
        if (!mo8436i()) {
            Animator animator = this.f6962p;
            if (animator != null) {
                animator.cancel();
            }
            if (m10411B()) {
                C1186h hVar = this.f6964r;
                if (hVar == null) {
                    hVar = m10418y();
                }
                AnimatorSet a = m10415a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C2644a(z, iVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f6970x;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f6972z.mo8559a(z ? 8 : 4, z);
            if (iVar != null) {
                iVar.mo8399b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8417a(boolean z) {
        this.f6953g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8418a(int[] iArr) {
        this.f6959m.mo8545a(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo8419b() {
        return this.f6955i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8420b(float f) {
        if (this.f6956j != f) {
            this.f6956j = f;
            mo8408a(this.f6955i, this.f6956j, this.f6957k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8421b(Animator.AnimatorListener animatorListener) {
        if (this.f6969w == null) {
            this.f6969w = new ArrayList<>();
        }
        this.f6969w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8422b(ColorStateList colorStateList) {
        Drawable drawable = this.f6949c;
        if (drawable != null) {
            C0328a.m1611a(drawable, C1227b.m5883a(colorStateList));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8423b(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f6951e
            java.lang.String r1 = "Didn't initialize content background"
            p006b.p026g.p034j.C0837h.m4535a(r0, (java.lang.Object) r1)
            boolean r0 = r7.mo8446s()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f6951e
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            c.e.a.a.y.b r8 = r7.f6941A
            goto L_0x0024
        L_0x0020:
            c.e.a.a.y.b r8 = r7.f6941A
            android.graphics.drawable.Drawable r0 = r7.f6951e
        L_0x0024:
            r8.mo5480a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.C2643b.mo8423b(android.graphics.Rect):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8424b(C1186h hVar) {
        this.f6963q = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8425b(C2652i iVar, boolean z) {
        if (!mo8437j()) {
            Animator animator = this.f6962p;
            if (animator != null) {
                animator.cancel();
            }
            if (m10411B()) {
                if (this.f6972z.getVisibility() != 0) {
                    this.f6972z.setAlpha(0.0f);
                    this.f6972z.setScaleY(0.0f);
                    this.f6972z.setScaleX(0.0f);
                    mo8427c(0.0f);
                }
                C1186h hVar = this.f6963q;
                if (hVar == null) {
                    hVar = m10419z();
                }
                AnimatorSet a = m10415a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C2645b(z, iVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f6969w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f6972z.mo8559a(0, z);
            this.f6972z.setAlpha(1.0f);
            this.f6972z.setScaleY(1.0f);
            this.f6972z.setScaleX(1.0f);
            mo8427c(1.0f);
            if (iVar != null) {
                iVar.mo8398a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8426b(boolean z) {
        this.f6954h = z;
        mo8450w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8427c(float f) {
        this.f6966t = f;
        Matrix matrix = this.f6945E;
        m10417a(f, matrix);
        this.f6972z.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8428c() {
        return this.f6953g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C1186h mo8429d() {
        return this.f6964r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8430d(float f) {
        if (this.f6957k != f) {
            this.f6957k = f;
            mo8408a(this.f6955i, this.f6956j, this.f6957k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo8431e() {
        return this.f6956j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8432e(float f) {
        C1233d dVar = this.f6948b;
        if (dVar != null) {
            dVar.mo5486a(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo8433f() {
        return this.f6957k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C1238g mo8434g() {
        return this.f6947a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C1186h mo8435h() {
        return this.f6963q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo8436i() {
        return this.f6972z.getVisibility() == 0 ? this.f6968v == 1 : this.f6968v != 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo8437j() {
        return this.f6972z.getVisibility() != 0 ? this.f6968v == 2 : this.f6968v != 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8438k() {
        this.f6959m.mo8544a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8439l() {
        C1233d dVar = this.f6948b;
        if (dVar != null) {
            C1236e.m5960a((View) this.f6972z, dVar);
        }
        if (mo8445r()) {
            this.f6972z.getViewTreeObserver().addOnPreDrawListener(m10410A());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8440m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo8441n() {
        ViewTreeObserver viewTreeObserver = this.f6972z.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f6946F;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f6946F = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8442o() {
        float rotation = this.f6972z.getRotation();
        if (this.f6965s != rotation) {
            this.f6965s = rotation;
            mo8448u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8443p() {
        ArrayList<C2651h> arrayList = this.f6971y;
        if (arrayList != null) {
            Iterator<C2651h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8400a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8444q() {
        ArrayList<C2651h> arrayList = this.f6971y;
        if (arrayList != null) {
            Iterator<C2651h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8401b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo8445r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo8446s() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo8447t() {
        return !this.f6953g || this.f6972z.getSizeDimension() >= this.f6958l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo8448u() {
        int i;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f6965s % 90.0f != 0.0f) {
                i = 1;
                if (this.f6972z.getLayerType() != 1) {
                    floatingActionButton = this.f6972z;
                }
            } else if (this.f6972z.getLayerType() != 0) {
                floatingActionButton = this.f6972z;
                i = 0;
            }
            floatingActionButton.setLayerType(i, (Paint) null);
        }
        C1233d dVar = this.f6948b;
        if (dVar != null) {
            dVar.mo5489a((int) this.f6965s);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo8449v() {
        mo8427c(this.f6966t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo8450w() {
        Rect rect = this.f6942B;
        mo8412a(rect);
        mo8423b(rect);
        this.f6941A.mo5479a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo8451x() {
        C1238g gVar;
        if (this.f6952f && this.f6948b != null && (gVar = this.f6947a) != null) {
            mo8414a(gVar.mo5533b(((float) this.f6972z.getSizeDimension()) / 2.0f), this.f6952f);
        }
    }
}
