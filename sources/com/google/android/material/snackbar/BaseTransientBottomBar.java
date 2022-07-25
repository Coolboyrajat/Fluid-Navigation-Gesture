package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C2672g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C2705b;
import java.util.List;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0886r;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1175h;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p190io.objectbox.BoxStoreBuilder;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: q */
    static final Handler f7093q = new Handler(Looper.getMainLooper(), new C2687i());
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final boolean f7094r;

    /* renamed from: s */
    private static final int[] f7095s = {C1169b.snackbarStyle};

    /* renamed from: a */
    private final ViewGroup f7096a;

    /* renamed from: b */
    private final Context f7097b;

    /* renamed from: c */
    protected final C2701v f7098c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2704a f7099d;

    /* renamed from: e */
    private int f7100e;

    /* renamed from: f */
    private boolean f7101f;

    /* renamed from: g */
    private View f7102g;

    /* renamed from: h */
    private final Runnable f7103h = new C2688j();

    /* renamed from: i */
    private final int f7104i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f7105j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f7106k;

    /* renamed from: l */
    private int f7107l;

    /* renamed from: m */
    private List<C2697r<B>> f7108m;

    /* renamed from: n */
    private Behavior f7109n;

    /* renamed from: o */
    private final AccessibilityManager f7110o;

    /* renamed from: p */
    C2705b.C2707b f7111p = new C2691m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C2698s f7112k = new C2698s(this);

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m10645a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7112k.mo8599a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo7779a(View view) {
            return this.f7112k.mo8600a(view);
        }

        /* renamed from: a */
        public boolean mo1836a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f7112k.mo8598a(coordinatorLayout, view, motionEvent);
            return super.mo1836a(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C2679a extends AnimatorListenerAdapter {
        C2679a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8573i();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C2680b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7114a;

        C2680b(int i) {
            this.f7114a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8566c(this.f7114a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C2681c implements ValueAnimator.AnimatorUpdateListener {
        C2681c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f7098c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C2682d implements ValueAnimator.AnimatorUpdateListener {
        C2682d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f7098c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f7098c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C2683e extends AnimatorListenerAdapter {
        C2683e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8573i();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f7099d.mo8619b(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C2684f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f7119a = this.f7120b;

        /* renamed from: b */
        final /* synthetic */ int f7120b;

        C2684f(int i) {
            this.f7120b = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7094r) {
                C0890v.m4777e(BaseTransientBottomBar.this.f7098c, intValue - this.f7119a);
            } else {
                BaseTransientBottomBar.this.f7098c.setTranslationY((float) intValue);
            }
            this.f7119a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C2685g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f7122a;

        C2685g(int i) {
            this.f7122a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo8566c(this.f7122a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f7099d.mo8618a(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C2686h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f7124a = 0;

        C2686h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7094r) {
                C0890v.m4777e(BaseTransientBottomBar.this.f7098c, intValue - this.f7124a);
            } else {
                BaseTransientBottomBar.this.f7098c.setTranslationY((float) intValue);
            }
            this.f7124a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C2687i implements Handler.Callback {
        C2687i() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo8576l();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo8564b(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C2688j implements Runnable {
        C2688j() {
        }

        public void run() {
            int a = BaseTransientBottomBar.this.m10619p() - BaseTransientBottomBar.this.m10621r();
            if (a < BaseTransientBottomBar.this.f7106k) {
                ((ViewGroup.MarginLayoutParams) BaseTransientBottomBar.this.f7098c.getLayoutParams()).bottomMargin += BaseTransientBottomBar.this.f7106k - a;
                BaseTransientBottomBar.this.f7098c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C2689k implements C0886r {
        C2689k() {
        }

        /* renamed from: a */
        public C0852d0 mo205a(View view, C0852d0 d0Var) {
            int unused = BaseTransientBottomBar.this.f7105j = d0Var.mo4570a();
            BaseTransientBottomBar.this.m10627x();
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C2690l extends C0838a {
        C2690l() {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4580a((int) BoxStoreBuilder.DEFAULT_MAX_DB_SIZE_KBYTE);
            cVar.mo4611f(true);
        }

        /* renamed from: a */
        public boolean mo2094a(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo2094a(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo8563b();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C2691m implements C2705b.C2707b {
        C2691m() {
        }

        /* renamed from: a */
        public void mo8589a() {
            Handler handler = BaseTransientBottomBar.f7093q;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: a */
        public void mo8590a(int i) {
            Handler handler = BaseTransientBottomBar.f7093q;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C2692n implements C2699t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class C2693a implements Runnable {
            C2693a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo8566c(3);
            }
        }

        C2692n() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f7098c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f7106k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m10627x();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo8572h()) {
                BaseTransientBottomBar.f7093q.post(new C2693a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C2694o implements C2700u {
        C2694o() {
        }

        /* renamed from: a */
        public void mo8594a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f7098c.setOnLayoutChangeListener((C2700u) null);
            BaseTransientBottomBar.this.m10624u();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C2695p implements SwipeDismissBehavior.C2562b {
        C2695p() {
        }

        /* renamed from: a */
        public void mo7781a(int i) {
            if (i == 0) {
                C2705b.m10678a().mo8631e(BaseTransientBottomBar.this.f7111p);
            } else if (i == 1 || i == 2) {
                C2705b.m10678a().mo8630d(BaseTransientBottomBar.this.f7111p);
            }
        }

        /* renamed from: a */
        public void mo7782a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo8562a(0);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C2696q implements Runnable {
        C2696q() {
        }

        public void run() {
            BaseTransientBottomBar.this.f7098c.setVisibility(0);
            if (BaseTransientBottomBar.this.f7098c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m10625v();
            } else {
                BaseTransientBottomBar.this.m10626w();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class C2697r<B> {
        /* renamed from: a */
        public void mo8596a(B b) {
        }

        /* renamed from: a */
        public void mo8597a(B b, int i) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C2698s {

        /* renamed from: a */
        private C2705b.C2707b f7135a;

        public C2698s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo7780b(0.1f);
            swipeDismissBehavior.mo7776a(0.6f);
            swipeDismissBehavior.mo7777a(0);
        }

        /* renamed from: a */
        public void mo8598a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C2705b.m10678a().mo8631e(this.f7135a);
                }
            } else if (coordinatorLayout.mo1778a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C2705b.m10678a().mo8630d(this.f7135a);
            }
        }

        /* renamed from: a */
        public void mo8599a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f7135a = baseTransientBottomBar.f7111p;
        }

        /* renamed from: a */
        public boolean mo8600a(View view) {
            return view instanceof C2701v;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    protected interface C2699t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    protected interface C2700u {
        /* renamed from: a */
        void mo8594a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    protected static class C2701v extends FrameLayout {

        /* renamed from: k */
        private static final View.OnTouchListener f7136k = new C2702a();

        /* renamed from: f */
        private C2700u f7137f;

        /* renamed from: g */
        private C2699t f7138g;

        /* renamed from: h */
        private int f7139h;

        /* renamed from: i */
        private final float f7140i;

        /* renamed from: j */
        private final float f7141j;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class C2702a implements View.OnTouchListener {
            C2702a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C2701v(Context context) {
            this(context, (AttributeSet) null);
        }

        protected C2701v(Context context, AttributeSet attributeSet) {
            super(C2672g.m10585b(context, attributeSet, 0, 0), attributeSet);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1178k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C1178k.SnackbarLayout_elevation)) {
                C0890v.m4744a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C1178k.SnackbarLayout_elevation, 0));
            }
            this.f7139h = obtainStyledAttributes.getInt(C1178k.SnackbarLayout_animationMode, 0);
            this.f7140i = obtainStyledAttributes.getFloat(C1178k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            this.f7141j = obtainStyledAttributes.getFloat(C1178k.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f7136k);
            setFocusable(true);
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f7141j;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f7139h;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f7140i;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C2699t tVar = this.f7138g;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C0890v.m4737H(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C2699t tVar = this.f7138g;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C2700u uVar = this.f7137f;
            if (uVar != null) {
                uVar.mo8594a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f7139h = i;
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C2699t tVar) {
            this.f7138g = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f7136k);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C2700u uVar) {
            this.f7137f = uVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f7094r = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C2704a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f7096a = viewGroup;
            this.f7099d = aVar;
            this.f7097b = viewGroup.getContext();
            C2672g.m10580a(this.f7097b);
            this.f7098c = (C2701v) LayoutInflater.from(this.f7097b).inflate(mo8570f(), this.f7096a, false);
            if (this.f7098c.getBackground() == null) {
                C0890v.m4751a((View) this.f7098c, m10618o());
            }
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo8617a(this.f7098c.getActionTextColorAlpha());
            }
            this.f7098c.addView(view);
            this.f7104i = ((ViewGroup.MarginLayoutParams) this.f7098c.getLayoutParams()).bottomMargin;
            C0890v.m4781g(this.f7098c, 1);
            C0890v.m4783h(this.f7098c, 1);
            C0890v.m4767b((View) this.f7098c, true);
            C0890v.m4756a((View) this.f7098c, (C0886r) new C2689k());
            C0890v.m4752a((View) this.f7098c, (C0838a) new C2690l());
            this.f7110o = (AccessibilityManager) this.f7097b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: a */
    private ValueAnimator m10602a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1179a.f3914a);
        ofFloat.addUpdateListener(new C2681c());
        return ofFloat;
    }

    /* renamed from: a */
    private void m10603a(CoordinatorLayout.C0268f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f7109n;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo8569e();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m10645a((BaseTransientBottomBar<?>) this);
        }
        swipeDismissBehavior.mo7778a((SwipeDismissBehavior.C2562b) new C2695p());
        fVar.mo1855a((CoordinatorLayout.C0265c) swipeDismissBehavior);
        if (this.f7102g == null) {
            fVar.f1395g = 80;
        }
    }

    /* renamed from: b */
    private ValueAnimator m10606b(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1179a.f3917d);
        ofFloat.addUpdateListener(new C2682d());
        return ofFloat;
    }

    /* renamed from: e */
    private void m10609e(int i) {
        if (this.f7098c.getAnimationMode() == 1) {
            m10611f(i);
        } else {
            m10613g(i);
        }
    }

    /* renamed from: f */
    private void m10611f(int i) {
        ValueAnimator a = m10602a(1.0f, 0.0f);
        a.setDuration(75);
        a.addListener(new C2680b(i));
        a.start();
    }

    /* renamed from: g */
    private void m10613g(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m10620q()});
        valueAnimator.setInterpolator(C1179a.f3915b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C2685g(i));
        valueAnimator.addUpdateListener(new C2686h());
        valueAnimator.start();
    }

    /* renamed from: n */
    private int m10617n() {
        View view = this.f7102g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f7096a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f7096a.getHeight()) - i;
    }

    /* renamed from: o */
    private Drawable m10618o() {
        C2701v vVar = this.f7098c;
        int a = C1207a.m5830a(vVar, C1169b.colorSurface, C1169b.colorOnSurface, vVar.getBackgroundOverlayColorAlpha());
        float dimension = this.f7098c.getResources().getDimension(C1171d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a);
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public int m10619p() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f7097b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: q */
    private int m10620q() {
        int height = this.f7098c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f7098c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public int m10621r() {
        int[] iArr = new int[2];
        this.f7098c.getLocationOnScreen(iArr);
        return iArr[1] + this.f7098c.getHeight();
    }

    /* renamed from: s */
    private boolean m10622s() {
        ViewGroup.LayoutParams layoutParams = this.f7098c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0268f) && (((CoordinatorLayout.C0268f) layoutParams).mo1864d() instanceof SwipeDismissBehavior);
    }

    /* renamed from: t */
    private boolean m10623t() {
        return this.f7106k > 0 && !this.f7101f && m10622s();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m10624u() {
        if (mo8574j()) {
            mo8561a();
            return;
        }
        this.f7098c.setVisibility(0);
        mo8573i();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m10625v() {
        ValueAnimator a = m10602a(0.0f, 1.0f);
        ValueAnimator b = m10606b(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, b});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C2679a());
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m10626w() {
        int q = m10620q();
        if (f7094r) {
            C0890v.m4777e(this.f7098c, q);
        } else {
            this.f7098c.setTranslationY((float) q);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{q, 0});
        valueAnimator.setInterpolator(C1179a.f3915b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C2683e());
        valueAnimator.addUpdateListener(new C2684f(q));
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m10627x() {
        ((ViewGroup.MarginLayoutParams) this.f7098c.getLayoutParams()).bottomMargin = this.f7104i + (this.f7102g != null ? this.f7107l : this.f7105j);
        this.f7098c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m10623t()) {
            this.f7098c.removeCallbacks(this.f7103h);
            this.f7098c.post(this.f7103h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8561a() {
        this.f7098c.post(new C2696q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8562a(int i) {
        C2705b.m10678a().mo8625a(this.f7111p, i);
    }

    /* renamed from: b */
    public void mo8563b() {
        mo8562a(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8564b(int i) {
        if (!mo8574j() || this.f7098c.getVisibility() != 0) {
            mo8566c(i);
        } else {
            m10609e(i);
        }
    }

    /* renamed from: c */
    public Context mo8565c() {
        return this.f7097b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8566c(int i) {
        C2705b.m10678a().mo8628b(this.f7111p);
        List<C2697r<B>> list = this.f7108m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f7108m.get(size).mo8597a(this, i);
            }
        }
        ViewParent parent = this.f7098c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f7098c);
        }
    }

    /* renamed from: d */
    public int mo8567d() {
        return this.f7100e;
    }

    /* renamed from: d */
    public B mo8568d(int i) {
        this.f7100e = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public SwipeDismissBehavior<? extends View> mo8569e() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo8570f() {
        return mo8571g() ? C1175h.mtrl_layout_snackbar : C1175h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo8571g() {
        TypedArray obtainStyledAttributes = this.f7097b.obtainStyledAttributes(f7095s);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: h */
    public boolean mo8572h() {
        return C2705b.m10678a().mo8627a(this.f7111p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8573i() {
        C2705b.m10678a().mo8629c(this.f7111p);
        List<C2697r<B>> list = this.f7108m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f7108m.get(size).mo8596a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo8574j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f7110o.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: k */
    public void mo8575k() {
        C2705b.m10678a().mo8624a(mo8567d(), this.f7111p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo8576l() {
        this.f7098c.setOnAttachStateChangeListener(new C2692n());
        if (this.f7098c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f7098c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0268f) {
                m10603a((CoordinatorLayout.C0268f) layoutParams);
            }
            this.f7107l = m10617n();
            m10627x();
            this.f7098c.setVisibility(4);
            this.f7096a.addView(this.f7098c);
        }
        if (C0890v.m4732C(this.f7098c)) {
            m10624u();
        } else {
            this.f7098c.setOnLayoutChangeListener(new C2694o());
        }
    }
}
