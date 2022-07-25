package p006b.p026g.p035k;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p026g.C0778b;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p026g.p035k.p036e0.C0865f;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.g.k.v */
public class C0890v {

    /* renamed from: a */
    private static Field f3318a;

    /* renamed from: b */
    private static boolean f3319b;

    /* renamed from: c */
    private static Field f3320c;

    /* renamed from: d */
    private static boolean f3321d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f3322e;

    /* renamed from: f */
    private static WeakHashMap<View, C0902z> f3323f = null;

    /* renamed from: g */
    private static Field f3324g;

    /* renamed from: h */
    private static boolean f3325h = false;

    /* renamed from: i */
    private static ThreadLocal<Rect> f3326i;

    /* renamed from: b.g.k.v$a */
    static class C0891a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C0886r f3327a;

        C0891a(C0886r rVar) {
            this.f3327a = rVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C0852d0.m4583a(this.f3327a.mo205a(view, C0852d0.m4582a((Object) windowInsets)));
        }
    }

    /* renamed from: b.g.k.v$b */
    static class C0892b extends C0896f<Boolean> {
        C0892b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Boolean m4804a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4678a(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4679a(Boolean bool, Boolean bool2) {
            return !mo4688a(bool, bool2);
        }
    }

    /* renamed from: b.g.k.v$c */
    static class C0893c extends C0896f<CharSequence> {
        C0893c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public CharSequence m4810a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4678a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4679a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: b.g.k.v$d */
    static class C0894d extends C0896f<Boolean> {
        C0894d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Boolean m4816a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4678a(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4679a(Boolean bool, Boolean bool2) {
            return !mo4688a(bool, bool2);
        }
    }

    /* renamed from: b.g.k.v$e */
    static class C0895e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f3328f = new WeakHashMap<>();

        C0895e() {
        }

        /* renamed from: a */
        private void m4821a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: a */
        private void m4822a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C0890v.m4771c(view, 16);
                }
                this.f3328f.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Map.Entry next : this.f3328f.entrySet()) {
                m4822a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m4821a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: b.g.k.v$f */
    static abstract class C0896f<T> {

        /* renamed from: a */
        private final int f3329a;

        /* renamed from: b */
        private final Class<T> f3330b;

        /* renamed from: c */
        private final int f3331c;

        C0896f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        C0896f(int i, Class<T> cls, int i2, int i3) {
            this.f3329a = i;
            this.f3330b = cls;
            this.f3331c = i3;
        }

        /* renamed from: a */
        private boolean m4823a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: b */
        private boolean m4824b() {
            return Build.VERSION.SDK_INT >= this.f3331c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo4676a(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4678a(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4688a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo4679a(T t, T t2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public T mo4689b(View view) {
            if (m4824b()) {
                return mo4676a(view);
            }
            if (!m4823a()) {
                return null;
            }
            T tag = view.getTag(this.f3329a);
            if (this.f3330b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4690b(View view, T t) {
            if (m4824b()) {
                mo4678a(view, t);
            } else if (m4823a() && mo4679a(mo4689b(view), (Object) t)) {
                C0890v.m4794r(view);
                view.setTag(this.f3329a, t);
                C0890v.m4771c(view, 0);
            }
        }
    }

    /* renamed from: b.g.k.v$g */
    public interface C0897g {
        /* renamed from: a */
        boolean mo4691a(View view, KeyEvent keyEvent);
    }

    /* renamed from: b.g.k.v$h */
    static class C0898h {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f3332d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f3333a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f3334b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f3335c = null;

        C0898h() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m4832a() {
            if (this.f3334b == null) {
                this.f3334b = new SparseArray<>();
            }
            return this.f3334b;
        }

        /* renamed from: a */
        static C0898h m4833a(View view) {
            C0898h hVar = (C0898h) view.getTag(C0778b.tag_unhandled_key_event_manager);
            if (hVar != null) {
                return hVar;
            }
            C0898h hVar2 = new C0898h();
            view.setTag(C0778b.tag_unhandled_key_event_manager, hVar2);
            return hVar2;
        }

        /* renamed from: b */
        private View m4834b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3333a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m4834b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m4836c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: b */
        private void m4835b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3333a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f3332d.isEmpty()) {
                synchronized (f3332d) {
                    if (this.f3333a == null) {
                        this.f3333a = new WeakHashMap<>();
                    }
                    for (int size = f3332d.size() - 1; size >= 0; size--) {
                        View view = (View) f3332d.get(size).get();
                        if (view == null) {
                            f3332d.remove(size);
                        } else {
                            this.f3333a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3333a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m4836c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0778b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C0897g) arrayList.get(size)).mo4691a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4692a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3335c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3335c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> a = m4832a();
            if (keyEvent.getAction() == 1 && (indexOfKey = a.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = a.valueAt(indexOfKey);
                a.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0890v.m4731B(view)) {
                m4836c(view, keyEvent);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4693a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4835b();
            }
            View b = m4834b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4832a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }
    }

    static {
        new AtomicInteger(1);
        int[] iArr = {C0778b.accessibility_custom_action_0, C0778b.accessibility_custom_action_1, C0778b.accessibility_custom_action_2, C0778b.accessibility_custom_action_3, C0778b.accessibility_custom_action_4, C0778b.accessibility_custom_action_5, C0778b.accessibility_custom_action_6, C0778b.accessibility_custom_action_7, C0778b.accessibility_custom_action_8, C0778b.accessibility_custom_action_9, C0778b.accessibility_custom_action_10, C0778b.accessibility_custom_action_11, C0778b.accessibility_custom_action_12, C0778b.accessibility_custom_action_13, C0778b.accessibility_custom_action_14, C0778b.accessibility_custom_action_15, C0778b.accessibility_custom_action_16, C0778b.accessibility_custom_action_17, C0778b.accessibility_custom_action_18, C0778b.accessibility_custom_action_19, C0778b.accessibility_custom_action_20, C0778b.accessibility_custom_action_21, C0778b.accessibility_custom_action_22, C0778b.accessibility_custom_action_23, C0778b.accessibility_custom_action_24, C0778b.accessibility_custom_action_25, C0778b.accessibility_custom_action_26, C0778b.accessibility_custom_action_27, C0778b.accessibility_custom_action_28, C0778b.accessibility_custom_action_29, C0778b.accessibility_custom_action_30, C0778b.accessibility_custom_action_31};
        new C0895e();
    }

    /* renamed from: A */
    public static boolean m4730A(View view) {
        Boolean b = m4741a().mo4689b(view);
        if (b == null) {
            return false;
        }
        return b.booleanValue();
    }

    /* renamed from: B */
    public static boolean m4731B(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: C */
    public static boolean m4732C(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: D */
    public static boolean m4733D(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C0880l) {
            return ((C0880l) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m4734E(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m4735F(View view) {
        Boolean b = m4774d().mo4689b(view);
        if (b == null) {
            return false;
        }
        return b.booleanValue();
    }

    /* renamed from: G */
    public static void m4736G(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: H */
    public static void m4737H(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: I */
    public static void m4738I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C0880l) {
            ((C0880l) view).stopNestedScroll();
        }
    }

    /* renamed from: J */
    private static void m4739J(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static C0852d0 m4740a(View view, C0852d0 d0Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return d0Var;
        }
        WindowInsets windowInsets = (WindowInsets) C0852d0.m4583a(d0Var);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0852d0.m4582a((Object) windowInsets);
    }

    /* renamed from: a */
    private static C0896f<Boolean> m4741a() {
        return new C0894d(C0778b.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a */
    public static C0902z m4742a(View view) {
        if (f3323f == null) {
            f3323f = new WeakHashMap<>();
        }
        C0902z zVar = f3323f.get(view);
        if (zVar != null) {
            return zVar;
        }
        C0902z zVar2 = new C0902z(view);
        f3323f.put(view, zVar2);
        return zVar2;
    }

    /* renamed from: a */
    private static void m4743a(int i, View view) {
        List<C0857c.C0858a> f = m4778f(view);
        for (int i2 = 0; i2 < f.size(); i2++) {
            if (f.get(i2).mo4638a() == i) {
                f.remove(i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m4744a(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: a */
    private static void m4745a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m4739J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4739J((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m4746a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m4747a(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m4748a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0889u) {
            ((C0889u) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4749a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0889u) {
            ((C0889u) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m4750a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m4751a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m4752a(View view, C0838a aVar) {
        if (aVar == null && (m4769c(view) instanceof C0838a.C0839a)) {
            aVar = new C0838a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo4545a());
    }

    /* renamed from: a */
    private static void m4753a(View view, C0857c.C0858a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4794r(view);
            m4743a(aVar.mo4638a(), view);
            m4778f(view).add(aVar);
            m4771c(view, 0);
        }
    }

    /* renamed from: a */
    public static void m4754a(View view, C0857c.C0858a aVar, CharSequence charSequence, C0865f fVar) {
        m4753a(view, aVar.mo4639a(charSequence, fVar));
    }

    /* renamed from: a */
    public static void m4755a(View view, C0857c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo4637u());
    }

    /* renamed from: a */
    public static void m4756a(View view, C0886r rVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new C0891a(rVar));
        }
    }

    /* renamed from: a */
    public static void m4757a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m4758a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static void m4759a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3322e == null) {
            f3322e = new WeakHashMap<>();
        }
        f3322e.put(view, str);
    }

    /* renamed from: a */
    public static void m4760a(View view, boolean z) {
        m4741a().mo4690b(view, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static boolean m4761a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    static boolean m4762a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0898h.m4833a(view).mo4693a(view, keyEvent);
    }

    /* renamed from: b */
    private static Rect m4763b() {
        if (f3326i == null) {
            f3326i = new ThreadLocal<>();
        }
        Rect rect = f3326i.get();
        if (rect == null) {
            rect = new Rect();
            f3326i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: b */
    public static C0838a m4764b(View view) {
        View.AccessibilityDelegate c = m4769c(view);
        if (c == null) {
            return null;
        }
        return c instanceof C0838a.C0839a ? ((C0838a.C0839a) c).f3253a : new C0838a(c);
    }

    /* renamed from: b */
    public static C0852d0 m4765b(View view, C0852d0 d0Var) {
        if (Build.VERSION.SDK_INT < 21) {
            return d0Var;
        }
        WindowInsets windowInsets = (WindowInsets) C0852d0.m4583a(d0Var);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0852d0.m4582a((Object) windowInsets);
    }

    /* renamed from: b */
    private static void m4766b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m4739J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4739J((View) parent);
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m4767b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: b */
    static boolean m4768b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0898h.m4833a(view).mo4692a(keyEvent);
    }

    /* renamed from: c */
    private static View.AccessibilityDelegate m4769c(View view) {
        if (f3325h) {
            return null;
        }
        if (f3324g == null) {
            try {
                f3324g = View.class.getDeclaredField("mAccessibilityDelegate");
                f3324g.setAccessible(true);
            } catch (Throwable unused) {
                f3325h = true;
                return null;
            }
        }
        try {
            Object obj = f3324g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3325h = true;
            return null;
        }
    }

    /* renamed from: c */
    private static C0896f<CharSequence> m4770c() {
        return new C0893c(C0778b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: c */
    static void m4771c(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m4776e(view) != null;
            if (m4773d(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : PropertyFlags.INDEX_HASH);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m4772c(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: d */
    public static int m4773d(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: d */
    private static C0896f<Boolean> m4774d() {
        return new C0892b(C0778b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: d */
    public static void m4775d(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect b = m4763b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4745a(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m4745a(view, i);
        }
    }

    /* renamed from: e */
    public static CharSequence m4776e(View view) {
        return m4770c().mo4689b(view);
    }

    /* renamed from: e */
    public static void m4777e(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect b = m4763b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4766b(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m4766b(view, i);
        }
    }

    /* renamed from: f */
    private static List<C0857c.C0858a> m4778f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0778b.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C0778b.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: f */
    public static void m4779f(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4743a(i, view);
            m4771c(view, 0);
        }
    }

    /* renamed from: g */
    public static ColorStateList m4780g(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0889u) {
            return ((C0889u) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: g */
    public static void m4781g(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: h */
    public static PorterDuff.Mode m4782h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C0889u) {
            return ((C0889u) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: h */
    public static void m4783h(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: i */
    public static Rect m4784i(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: i */
    public static void m4785i(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: j */
    public static Display m4786j(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m4731B(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: k */
    public static float m4787k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: l */
    public static boolean m4788l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: m */
    public static int m4789m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: n */
    public static int m4790n(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: o */
    public static int m4791o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: p */
    public static int m4792p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3321d) {
            try {
                f3320c = View.class.getDeclaredField("mMinHeight");
                f3320c.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3321d = true;
        }
        Field field = f3320c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: q */
    public static int m4793q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3319b) {
            try {
                f3318a = View.class.getDeclaredField("mMinWidth");
                f3318a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3319b = true;
        }
        Field field = f3318a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: r */
    static C0838a m4794r(View view) {
        C0838a b = m4764b(view);
        if (b == null) {
            b = new C0838a();
        }
        m4752a(view, b);
        return b;
    }

    /* renamed from: s */
    public static int m4795s(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: t */
    public static int m4796t(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: u */
    public static String m4797u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f3322e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: v */
    public static int m4798v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: w */
    public static float m4799w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: x */
    public static boolean m4800x(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m4801y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m4802z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }
}
