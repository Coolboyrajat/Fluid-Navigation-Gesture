package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0311a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0886r;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p039i.p040a.C0912a;
import p190io.objectbox.model.PropertyFlags;

public class ViewPager extends ViewGroup {

    /* renamed from: k0 */
    static final int[] f2526k0 = {16842931};

    /* renamed from: l0 */
    private static final Comparator<C0639f> f2527l0 = new C0634a();

    /* renamed from: m0 */
    private static final Interpolator f2528m0 = new C0635b();

    /* renamed from: n0 */
    private static final C0648n f2529n0 = new C0648n();

    /* renamed from: A */
    private boolean f2530A;

    /* renamed from: B */
    private int f2531B = 1;

    /* renamed from: C */
    private boolean f2532C;

    /* renamed from: D */
    private boolean f2533D;

    /* renamed from: E */
    private int f2534E;

    /* renamed from: F */
    private int f2535F;

    /* renamed from: G */
    private int f2536G;

    /* renamed from: H */
    private float f2537H;

    /* renamed from: I */
    private float f2538I;

    /* renamed from: J */
    private float f2539J;

    /* renamed from: K */
    private float f2540K;

    /* renamed from: L */
    private int f2541L = -1;

    /* renamed from: M */
    private VelocityTracker f2542M;

    /* renamed from: N */
    private int f2543N;

    /* renamed from: O */
    private int f2544O;

    /* renamed from: P */
    private int f2545P;

    /* renamed from: Q */
    private int f2546Q;

    /* renamed from: R */
    private boolean f2547R;

    /* renamed from: S */
    private EdgeEffect f2548S;

    /* renamed from: T */
    private EdgeEffect f2549T;

    /* renamed from: U */
    private boolean f2550U = true;

    /* renamed from: V */
    private boolean f2551V;

    /* renamed from: W */
    private int f2552W;

    /* renamed from: a0 */
    private List<C0643j> f2553a0;

    /* renamed from: b0 */
    private C0643j f2554b0;

    /* renamed from: c0 */
    private C0643j f2555c0;

    /* renamed from: d0 */
    private List<C0642i> f2556d0;

    /* renamed from: e0 */
    private C0644k f2557e0;

    /* renamed from: f */
    private int f2558f;

    /* renamed from: f0 */
    private int f2559f0;

    /* renamed from: g */
    private final ArrayList<C0639f> f2560g = new ArrayList<>();

    /* renamed from: g0 */
    private int f2561g0;

    /* renamed from: h */
    private final C0639f f2562h = new C0639f();

    /* renamed from: h0 */
    private ArrayList<View> f2563h0;

    /* renamed from: i */
    private final Rect f2564i = new Rect();

    /* renamed from: i0 */
    private final Runnable f2565i0 = new C0636c();

    /* renamed from: j */
    C0649a f2566j;

    /* renamed from: j0 */
    private int f2567j0 = 0;

    /* renamed from: k */
    int f2568k;

    /* renamed from: l */
    private int f2569l = -1;

    /* renamed from: m */
    private Parcelable f2570m = null;

    /* renamed from: n */
    private ClassLoader f2571n = null;

    /* renamed from: o */
    private Scroller f2572o;

    /* renamed from: p */
    private boolean f2573p;

    /* renamed from: q */
    private C0645l f2574q;

    /* renamed from: r */
    private int f2575r;

    /* renamed from: s */
    private Drawable f2576s;

    /* renamed from: t */
    private int f2577t;

    /* renamed from: u */
    private int f2578u;

    /* renamed from: v */
    private float f2579v = -3.4028235E38f;

    /* renamed from: w */
    private float f2580w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f2581x;

    /* renamed from: y */
    private boolean f2582y;

    /* renamed from: z */
    private boolean f2583z;

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C0634a implements Comparator<C0639f> {
        C0634a() {
        }

        /* renamed from: a */
        public int compare(C0639f fVar, C0639f fVar2) {
            return fVar.f2588b - fVar2.f2588b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C0635b implements Interpolator {
        C0635b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C0636c implements Runnable {
        C0636c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo3706e();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C0637d implements C0886r {

        /* renamed from: a */
        private final Rect f2585a = new Rect();

        C0637d() {
        }

        /* renamed from: a */
        public C0852d0 mo205a(View view, C0852d0 d0Var) {
            C0852d0 b = C0890v.m4765b(view, d0Var);
            if (b.mo4575e()) {
                return b;
            }
            Rect rect = this.f2585a;
            rect.left = b.mo4572b();
            rect.top = b.mo4574d();
            rect.right = b.mo4573c();
            rect.bottom = b.mo4570a();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0852d0 a = C0890v.m4740a(ViewPager.this.getChildAt(i), b);
                rect.left = Math.min(a.mo4572b(), rect.left);
                rect.top = Math.min(a.mo4574d(), rect.top);
                rect.right = Math.min(a.mo4573c(), rect.right);
                rect.bottom = Math.min(a.mo4570a(), rect.bottom);
            }
            return b.mo4571a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C0638e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C0639f {

        /* renamed from: a */
        Object f2587a;

        /* renamed from: b */
        int f2588b;

        /* renamed from: c */
        boolean f2589c;

        /* renamed from: d */
        float f2590d;

        /* renamed from: e */
        float f2591e;

        C0639f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0640g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f2592a;

        /* renamed from: b */
        public int f2593b;

        /* renamed from: c */
        float f2594c = 0.0f;

        /* renamed from: d */
        boolean f2595d;

        /* renamed from: e */
        int f2596e;

        /* renamed from: f */
        int f2597f;

        public C0640g() {
            super(-1, -1);
        }

        public C0640g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2526k0);
            this.f2593b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    class C0641h extends C0838a {
        C0641h() {
        }

        /* renamed from: b */
        private boolean m3646b() {
            C0649a aVar = ViewPager.this.f2566j;
            return aVar != null && aVar.mo3754a() > 1;
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4585a((CharSequence) ViewPager.class.getName());
            cVar.mo4624l(m3646b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo4580a((int) PropertyFlags.INDEX_HASH64);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo4580a(8192);
            }
        }

        /* renamed from: a */
        public boolean mo2094a(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo2094a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f2568k - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f2568k + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        /* renamed from: b */
        public void mo2095b(View view, AccessibilityEvent accessibilityEvent) {
            C0649a aVar;
            super.mo2095b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m3646b());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f2566j) != null) {
                accessibilityEvent.setItemCount(aVar.mo3754a());
                accessibilityEvent.setFromIndex(ViewPager.this.f2568k);
                accessibilityEvent.setToIndex(ViewPager.this.f2568k);
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C0642i {
        /* renamed from: a */
        void mo3740a(ViewPager viewPager, C0649a aVar, C0649a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C0643j {
        /* renamed from: a */
        void mo3741a(int i);

        /* renamed from: a */
        void mo3742a(int i, float f, int i2);

        /* renamed from: b */
        void mo3743b(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface C0644k {
        /* renamed from: a */
        void mo3744a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    private class C0645l extends DataSetObserver {
        C0645l() {
        }

        public void onChanged() {
            ViewPager.this.mo3679a();
        }

        public void onInvalidated() {
            ViewPager.this.mo3679a();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C0646m extends C0912a {
        public static final Parcelable.Creator<C0646m> CREATOR = new C0647a();

        /* renamed from: h */
        int f2600h;

        /* renamed from: i */
        Parcelable f2601i;

        /* renamed from: j */
        ClassLoader f2602j;

        /* renamed from: androidx.viewpager.widget.ViewPager$m$a */
        static class C0647a implements Parcelable.ClassLoaderCreator<C0646m> {
            C0647a() {
            }

            public C0646m createFromParcel(Parcel parcel) {
                return new C0646m(parcel, (ClassLoader) null);
            }

            public C0646m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0646m(parcel, classLoader);
            }

            public C0646m[] newArray(int i) {
                return new C0646m[i];
            }
        }

        C0646m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? C0646m.class.getClassLoader() : classLoader;
            this.f2600h = parcel.readInt();
            this.f2601i = parcel.readParcelable(classLoader);
            this.f2602j = classLoader;
        }

        public C0646m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2600h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2600h);
            parcel.writeParcelable(this.f2601i, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    static class C0648n implements Comparator<View> {
        C0648n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0640g gVar = (C0640g) view.getLayoutParams();
            C0640g gVar2 = (C0640g) view2.getLayoutParams();
            boolean z = gVar.f2592a;
            return z != gVar2.f2592a ? z ? 1 : -1 : gVar.f2596e - gVar2.f2596e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo3694b();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3694b();
    }

    /* renamed from: a */
    private int m3602a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f2545P || Math.abs(i2) <= this.f2543N) {
            i += (int) (f + (i >= this.f2568k ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f2560g.size() <= 0) {
            return i;
        }
        ArrayList<C0639f> arrayList = this.f2560g;
        return Math.max(this.f2560g.get(0).f2588b, Math.min(i, arrayList.get(arrayList.size() - 1).f2588b));
    }

    /* renamed from: a */
    private Rect m3603a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m3604a(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f2560g.isEmpty()) {
            C0639f b = mo3692b(this.f2568k);
            min = (int) ((b != null ? Math.min(b.f2591e, this.f2580w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m3608a(false);
            } else {
                return;
            }
        } else if (!this.f2572o.isFinished()) {
            this.f2572o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m3605a(int i, boolean z, int i2, boolean z2) {
        C0639f b = mo3692b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f2579v, Math.min(b.f2591e, this.f2580w))) : 0;
        if (z) {
            mo3681a(clientWidth, 0, i2);
            if (z2) {
                m3615d(i);
                return;
            }
            return;
        }
        if (z2) {
            m3615d(i);
        }
        m3608a(false);
        scrollTo(clientWidth, 0);
        m3618f(clientWidth);
    }

    /* renamed from: a */
    private void m3606a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2541L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2537H = motionEvent.getX(i);
            this.f2541L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2542M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m3607a(C0639f fVar, int i, C0639f fVar2) {
        int i2;
        int i3;
        C0639f fVar3;
        C0639f fVar4;
        int a = this.f2566j.mo3754a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f2575r) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f2588b;
            int i5 = fVar.f2588b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = fVar2.f2591e + fVar2.f2590d + f;
                while (true) {
                    i4++;
                    if (i4 > fVar.f2588b || i6 >= this.f2560g.size()) {
                        break;
                    }
                    while (true) {
                        fVar4 = this.f2560g.get(i6);
                        if (i4 > fVar4.f2588b && i6 < this.f2560g.size() - 1) {
                            i6++;
                        }
                    }
                    while (i4 < fVar4.f2588b) {
                        f2 += this.f2566j.mo3753a(i4) + f;
                        i4++;
                    }
                    fVar4.f2591e = f2;
                    f2 += fVar4.f2590d + f;
                }
            } else if (i4 > i5) {
                int size = this.f2560g.size() - 1;
                float f3 = fVar2.f2591e;
                while (true) {
                    int i7 = i4 - 1;
                    if (i7 < fVar.f2588b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f2560g.get(size);
                        if (i7 < fVar3.f2588b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > fVar3.f2588b) {
                        f3 -= this.f2566j.mo3753a(i4) + f;
                        i7 = i4 - 1;
                    }
                    f3 -= fVar3.f2590d + f;
                    fVar3.f2591e = f3;
                }
            }
        }
        int size2 = this.f2560g.size();
        float f4 = fVar.f2591e;
        int i8 = fVar.f2588b;
        int i9 = i8 - 1;
        this.f2579v = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = a - 1;
        this.f2580w = fVar.f2588b == i10 ? (fVar.f2591e + fVar.f2590d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C0639f fVar5 = this.f2560g.get(i11);
            while (true) {
                i3 = fVar5.f2588b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f2566j.mo3753a(i9) + f;
                i9--;
            }
            f4 -= fVar5.f2590d + f;
            fVar5.f2591e = f4;
            if (i3 == 0) {
                this.f2579v = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f2591e + fVar.f2590d + f;
        int i12 = fVar.f2588b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C0639f fVar6 = this.f2560g.get(i13);
            while (true) {
                i2 = fVar6.f2588b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f2566j.mo3753a(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f2580w = (fVar6.f2590d + f5) - 1.0f;
            }
            fVar6.f2591e = f5;
            f5 += fVar6.f2590d + f;
            i13++;
            i12++;
        }
    }

    /* renamed from: a */
    private void m3608a(boolean z) {
        boolean z2 = this.f2567j0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f2572o.isFinished()) {
                this.f2572o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2572o.getCurrX();
                int currY = this.f2572o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m3618f(currX);
                    }
                }
            }
        }
        this.f2530A = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f2560g.size(); i++) {
            C0639f fVar = this.f2560g.get(i);
            if (fVar.f2589c) {
                fVar.f2589c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0890v.m4757a((View) this, this.f2565i0);
        } else {
            this.f2565i0.run();
        }
    }

    /* renamed from: a */
    private boolean m3609a(float f, float f2) {
        return (f < ((float) this.f2535F) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f2535F)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m3610b(int i, float f, int i2) {
        C0643j jVar = this.f2554b0;
        if (jVar != null) {
            jVar.mo3742a(i, f, i2);
        }
        List<C0643j> list = this.f2553a0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0643j jVar2 = this.f2553a0.get(i3);
                if (jVar2 != null) {
                    jVar2.mo3742a(i, f, i2);
                }
            }
        }
        C0643j jVar3 = this.f2555c0;
        if (jVar3 != null) {
            jVar3.mo3742a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m3611b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f2559f0 : 0, (Paint) null);
        }
    }

    /* renamed from: b */
    private boolean m3612b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f2537H - f;
        this.f2537H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f2579v * clientWidth;
        float f4 = this.f2580w * clientWidth;
        boolean z3 = false;
        C0639f fVar = this.f2560g.get(0);
        ArrayList<C0639f> arrayList = this.f2560g;
        C0639f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2588b != 0) {
            f3 = fVar.f2591e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f2588b != this.f2566j.mo3754a() - 1) {
            f4 = fVar2.f2591e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f2548S.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f2549T.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f2537H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m3618f(i);
        return z3;
    }

    /* renamed from: c */
    private void m3613c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private static boolean m3614c(View view) {
        return view.getClass().getAnnotation(C0638e.class) != null;
    }

    /* renamed from: d */
    private void m3615d(int i) {
        C0643j jVar = this.f2554b0;
        if (jVar != null) {
            jVar.mo3743b(i);
        }
        List<C0643j> list = this.f2553a0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0643j jVar2 = this.f2553a0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo3743b(i);
                }
            }
        }
        C0643j jVar3 = this.f2555c0;
        if (jVar3 != null) {
            jVar3.mo3743b(i);
        }
    }

    /* renamed from: e */
    private void m3616e(int i) {
        C0643j jVar = this.f2554b0;
        if (jVar != null) {
            jVar.mo3741a(i);
        }
        List<C0643j> list = this.f2553a0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0643j jVar2 = this.f2553a0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo3741a(i);
                }
            }
        }
        C0643j jVar3 = this.f2555c0;
        if (jVar3 != null) {
            jVar3.mo3741a(i);
        }
    }

    /* renamed from: f */
    private void m3617f() {
        this.f2532C = false;
        this.f2533D = false;
        VelocityTracker velocityTracker = this.f2542M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2542M = null;
        }
    }

    /* renamed from: f */
    private boolean m3618f(int i) {
        if (this.f2560g.size() != 0) {
            C0639f g = m3619g();
            int clientWidth = getClientWidth();
            int i2 = this.f2575r;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = g.f2588b;
            float f2 = ((((float) i) / f) - g.f2591e) / (g.f2590d + (((float) i2) / f));
            this.f2551V = false;
            mo3680a(i4, f2, (int) (((float) i3) * f2));
            if (this.f2551V) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f2550U) {
            return false;
        } else {
            this.f2551V = false;
            mo3680a(0, 0.0f, 0);
            if (this.f2551V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: g */
    private C0639f m3619g() {
        int i;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f2575r) / ((float) clientWidth) : 0.0f;
        C0639f fVar = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < this.f2560g.size()) {
            C0639f fVar2 = this.f2560g.get(i2);
            if (!z && fVar2.f2588b != (i = i3 + 1)) {
                fVar2 = this.f2562h;
                fVar2.f2591e = f2 + f3 + f;
                fVar2.f2588b = i;
                fVar2.f2590d = this.f2566j.mo3753a(fVar2.f2588b);
                i2--;
            }
            f2 = fVar2.f2591e;
            float f4 = fVar2.f2590d + f2 + f;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f4 || i2 == this.f2560g.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f2588b;
            f3 = fVar2.f2590d;
            i2++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m3620h() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0640g) getChildAt(i).getLayoutParams()).f2592a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: i */
    private boolean m3621i() {
        this.f2541L = -1;
        m3617f();
        this.f2548S.onRelease();
        this.f2549T.onRelease();
        return this.f2548S.isFinished() || this.f2549T.isFinished();
    }

    /* renamed from: j */
    private void m3622j() {
        if (this.f2561g0 != 0) {
            ArrayList<View> arrayList = this.f2563h0;
            if (arrayList == null) {
                this.f2563h0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f2563h0.add(getChildAt(i));
            }
            Collections.sort(this.f2563h0, f2529n0);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f2583z != z) {
            this.f2583z = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo3676a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0639f mo3677a(int i, int i2) {
        C0639f fVar = new C0639f();
        fVar.f2588b = i;
        fVar.f2587a = this.f2566j.mo2571a((ViewGroup) this, i);
        fVar.f2590d = this.f2566j.mo3753a(i);
        if (i2 < 0 || i2 >= this.f2560g.size()) {
            this.f2560g.add(fVar);
        } else {
            this.f2560g.add(i2, fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0639f mo3678a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo3693b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3679a() {
        int a = this.f2566j.mo3754a();
        this.f2558f = a;
        boolean z = this.f2560g.size() < (this.f2531B * 2) + 1 && this.f2560g.size() < a;
        int i = this.f2568k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f2560g.size()) {
            C0639f fVar = this.f2560g.get(i2);
            int a2 = this.f2566j.mo3755a(fVar.f2587a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f2560g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f2566j.mo2578b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f2566j.mo2574a((ViewGroup) this, fVar.f2588b, fVar.f2587a);
                    int i3 = this.f2568k;
                    if (i3 == fVar.f2588b) {
                        i = Math.max(0, Math.min(i3, a - 1));
                    }
                } else {
                    int i4 = fVar.f2588b;
                    if (i4 != a2) {
                        if (i4 == this.f2568k) {
                            i = a2;
                        }
                        fVar.f2588b = a2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f2566j.mo2573a((ViewGroup) this);
        }
        Collections.sort(this.f2560g, f2527l0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0640g gVar = (C0640g) getChildAt(i5).getLayoutParams();
                if (!gVar.f2592a) {
                    gVar.f2594c = 0.0f;
                }
            }
            mo3683a(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3680a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f2552W
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0640g) r9
            boolean r10 = r9.f2592a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f2593b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m3610b(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f2557e0
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0640g) r0
            boolean r0 = r0.f2592a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f2557e0
            r3.mo3744a(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f2551V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo3680a(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3681a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f2572o;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f2573p ? this.f2572o.getCurrX() : this.f2572o.getStartX();
            this.f2572o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m3608a(false);
            mo3706e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float a = f2 + (mo3676a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f2566j.mo3753a(this.f2568k)) + ((float) this.f2575r))) + 1.0f) * 100.0f), 600);
        this.f2573p = false;
        this.f2572o.startScroll(i5, scrollY, i6, i7, min);
        C0890v.m4736G(this);
    }

    /* renamed from: a */
    public void mo3682a(int i, boolean z) {
        this.f2530A = false;
        mo3683a(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3683a(int i, boolean z, boolean z2) {
        mo3684a(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3684a(int i, boolean z, boolean z2, int i2) {
        C0649a aVar = this.f2566j;
        if (aVar == null || aVar.mo3754a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f2568k != i || this.f2560g.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f2566j.mo3754a()) {
                i = this.f2566j.mo3754a() - 1;
            }
            int i3 = this.f2531B;
            int i4 = this.f2568k;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f2560g.size(); i5++) {
                    this.f2560g.get(i5).f2589c = true;
                }
            }
            if (this.f2568k == i) {
                z3 = false;
            }
            if (this.f2550U) {
                this.f2568k = i;
                if (z3) {
                    m3615d(i);
                }
                requestLayout();
                return;
            }
            mo3696c(i);
            m3605a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo3685a(C0643j jVar) {
        if (this.f2553a0 == null) {
            this.f2553a0 = new ArrayList();
        }
        this.f2553a0.add(jVar);
    }

    /* renamed from: a */
    public boolean mo3686a(int i) {
        boolean d;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m3603a(this.f2564i, findNextFocus).left;
                int i3 = m3603a(this.f2564i, view).left;
                if (view != null && i2 >= i3) {
                    d = mo3697c();
                    z2 = d;
                }
            } else if (i == 66) {
                int i4 = m3603a(this.f2564i, findNextFocus).left;
                int i5 = m3603a(this.f2564i, view).left;
                if (view != null && i4 <= i5) {
                    d = mo3701d();
                    z2 = d;
                }
            }
            d = findNextFocus.requestFocus();
            z2 = d;
        } else if (i == 17 || i == 1) {
            z2 = mo3697c();
        } else if (i == 66 || i == 2) {
            z2 = mo3701d();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo3687a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo3686a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo3686a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo3701d();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo3697c();
            } else {
                i = 17;
            }
            return mo3686a(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3688a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo3688a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0639f b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b = mo3693b(childAt)) != null && b.f2588b == this.f2568k) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C0639f b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = mo3693b(childAt)) != null && b.f2588b == this.f2568k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0640g gVar = (C0640g) layoutParams;
        gVar.f2592a |= m3614c(view);
        if (!this.f2582y) {
            super.addView(view, i, layoutParams);
        } else if (gVar == null || !gVar.f2592a) {
            gVar.f2595d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0639f mo3692b(int i) {
        for (int i2 = 0; i2 < this.f2560g.size(); i2++) {
            C0639f fVar = this.f2560g.get(i2);
            if (fVar.f2588b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0639f mo3693b(View view) {
        for (int i = 0; i < this.f2560g.size(); i++) {
            C0639f fVar = this.f2560g.get(i);
            if (this.f2566j.mo2575a(view, fVar.f2587a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3694b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2572o = new Scroller(context, f2528m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2536G = viewConfiguration.getScaledPagingTouchSlop();
        this.f2543N = (int) (400.0f * f);
        this.f2544O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2548S = new EdgeEffect(context);
        this.f2549T = new EdgeEffect(context);
        this.f2545P = (int) (25.0f * f);
        this.f2546Q = (int) (2.0f * f);
        this.f2534E = (int) (f * 16.0f);
        C0890v.m4752a((View) this, (C0838a) new C0641h());
        if (C0890v.m4789m(this) == 0) {
            C0890v.m4783h(this, 1);
        }
        C0890v.m4756a((View) this, (C0886r) new C0637d());
    }

    /* renamed from: b */
    public void mo3695b(C0643j jVar) {
        List<C0643j> list = this.f2553a0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d1, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00df, code lost:
        if (r15 >= 0) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013f, code lost:
        if (r4 < r0.f2560g.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015d, code lost:
        if (r4 < r0.f2560g.size()) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r4 < r0.f2560g.size()) goto L_0x0141;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3696c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f2568k
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo3692b((int) r2)
            r0.f2568k = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f2566j
            if (r1 != 0) goto L_0x0018
            r17.m3622j()
            return
        L_0x0018:
            boolean r1 = r0.f2530A
            if (r1 == 0) goto L_0x0020
            r17.m3622j()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f2566j
            r1.mo2578b((android.view.ViewGroup) r0)
            int r1 = r0.f2531B
            int r4 = r0.f2568k
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f2566j
            int r6 = r6.mo3754a()
            int r7 = r6 + -1
            int r8 = r0.f2568k
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f2558f
            if (r6 != r7) goto L_0x01f2
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f2560g
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f2560g
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C0639f) r8
            int r9 = r8.f2588b
            int r10 = r0.f2568k
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f2568k
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo3677a((int) r8, (int) r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017f
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f2560g
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C0639f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r3 = 0
            goto L_0x0099
        L_0x008c:
            float r14 = r8.f2590d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x0099:
            int r14 = r0.f2568k
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a0:
            if (r14 < 0) goto L_0x00f0
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00c6
            if (r14 >= r4) goto L_0x00c6
            if (r11 != 0) goto L_0x00ab
            goto L_0x00f0
        L_0x00ab:
            int r5 = r11.f2588b
            if (r14 != r5) goto L_0x00ec
            boolean r5 = r11.f2589c
            if (r5 != 0) goto L_0x00ec
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            r5.remove(r15)
            androidx.viewpager.widget.a r5 = r0.f2566j
            java.lang.Object r11 = r11.f2587a
            r5.mo2574a((android.view.ViewGroup) r0, (int) r14, (java.lang.Object) r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00ea
            goto L_0x00e1
        L_0x00c6:
            if (r11 == 0) goto L_0x00d4
            int r5 = r11.f2588b
            if (r14 != r5) goto L_0x00d4
            float r5 = r11.f2590d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00ea
            goto L_0x00e1
        L_0x00d4:
            int r5 = r15 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo3677a((int) r14, (int) r5)
            float r5 = r5.f2590d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00ea
        L_0x00e1:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0639f) r5
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            r11 = r5
        L_0x00ec:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a0
        L_0x00f0:
            float r3 = r8.f2590d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0173
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0109
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0639f) r5
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r12 > 0) goto L_0x010e
            r7 = 0
            goto L_0x0116
        L_0x010e:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x0116:
            int r11 = r0.f2568k
        L_0x0118:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0173
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x014c
            if (r11 <= r1) goto L_0x014c
            if (r5 != 0) goto L_0x0125
            goto L_0x0173
        L_0x0125:
            int r12 = r5.f2588b
            if (r11 != r12) goto L_0x0172
            boolean r12 = r5.f2589c
            if (r12 != 0) goto L_0x0172
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f2560g
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f2566j
            java.lang.Object r5 = r5.f2587a
            r12.mo2574a((android.view.ViewGroup) r0, (int) r11, (java.lang.Object) r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
        L_0x0141:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C0639f) r5
            goto L_0x0172
        L_0x014a:
            r5 = 0
            goto L_0x0172
        L_0x014c:
            if (r5 == 0) goto L_0x0160
            int r12 = r5.f2588b
            if (r11 != r12) goto L_0x0160
            float r5 = r5.f2590d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
            goto L_0x0141
        L_0x0160:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo3677a((int) r11, (int) r4)
            int r4 = r4 + 1
            float r5 = r5.f2590d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f2560g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x014a
            goto L_0x0141
        L_0x0172:
            goto L_0x0118
        L_0x0173:
            r0.m3607a((androidx.viewpager.widget.ViewPager.C0639f) r8, (int) r10, (androidx.viewpager.widget.ViewPager.C0639f) r2)
            androidx.viewpager.widget.a r1 = r0.f2566j
            int r2 = r0.f2568k
            java.lang.Object r3 = r8.f2587a
            r1.mo2579b(r0, r2, r3)
        L_0x017f:
            androidx.viewpager.widget.a r1 = r0.f2566j
            r1.mo2573a((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0189:
            if (r2 >= r1) goto L_0x01b2
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.C0640g) r4
            r4.f2597f = r2
            boolean r5 = r4.f2592a
            if (r5 != 0) goto L_0x01af
            float r5 = r4.f2594c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01af
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo3693b((android.view.View) r3)
            if (r3 == 0) goto L_0x01af
            float r5 = r3.f2590d
            r4.f2594c = r5
            int r3 = r3.f2588b
            r4.f2596e = r3
        L_0x01af:
            int r2 = r2 + 1
            goto L_0x0189
        L_0x01b2:
            r17.m3622j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01f1
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c6
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo3678a((android.view.View) r1)
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            if (r3 == 0) goto L_0x01cf
            int r1 = r3.f2588b
            int r2 = r0.f2568k
            if (r1 == r2) goto L_0x01f1
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x01f1
            android.view.View r2 = r0.getChildAt(r1)
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo3693b((android.view.View) r2)
            if (r3 == 0) goto L_0x01ee
            int r3 = r3.f2588b
            int r4 = r0.f2568k
            if (r3 != r4) goto L_0x01ee
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x01ee
            goto L_0x01f1
        L_0x01ee:
            int r1 = r1 + 1
            goto L_0x01d0
        L_0x01f1:
            return
        L_0x01f2:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01ff }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01ff }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01ff }
            goto L_0x0207
        L_0x01ff:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0207:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f2558f
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f2566j
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo3696c(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3697c() {
        int i = this.f2568k;
        if (i <= 0) {
            return false;
        }
        mo3682a(i - 1, true);
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f2566j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f2579v)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f2580w));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0640g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f2573p = true;
        if (this.f2572o.isFinished() || !this.f2572o.computeScrollOffset()) {
            m3608a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2572o.getCurrX();
        int currY = this.f2572o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m3618f(currX)) {
                this.f2572o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0890v.m4736G(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3701d() {
        C0649a aVar = this.f2566j;
        if (aVar == null || this.f2568k >= aVar.mo3754a() - 1) {
            return false;
        }
        mo3682a(this.f2568k + 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3687a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0639f b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = mo3693b(childAt)) != null && b.f2588b == this.f2568k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        C0649a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2566j) != null && aVar.mo3754a() > 1)) {
            if (!this.f2548S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f2579v * ((float) width));
                this.f2548S.setSize(height, width);
                z = false | this.f2548S.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f2549T.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f2580w + 1.0f)) * ((float) width2));
                this.f2549T.setSize(height2, width2);
                z |= this.f2549T.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f2548S.finish();
            this.f2549T.finish();
        }
        if (z) {
            C0890v.m4736G(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2576s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3706e() {
        mo3696c(this.f2568k);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0640g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0640g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0649a getAdapter() {
        return this.f2566j;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f2561g0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0640g) this.f2563h0.get(i2).getLayoutParams()).f2597f;
    }

    public int getCurrentItem() {
        return this.f2568k;
    }

    public int getOffscreenPageLimit() {
        return this.f2531B;
    }

    public int getPageMargin() {
        return this.f2575r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2550U = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2565i0);
        Scroller scroller = this.f2572o;
        if (scroller != null && !scroller.isFinished()) {
            this.f2572o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f2575r > 0 && this.f2576s != null && this.f2560g.size() > 0 && this.f2566j != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f2575r) / f3;
            int i = 0;
            C0639f fVar = this.f2560g.get(0);
            float f5 = fVar.f2591e;
            int size = this.f2560g.size();
            int i2 = fVar.f2588b;
            int i3 = this.f2560g.get(size - 1).f2588b;
            while (i2 < i3) {
                while (i2 > fVar.f2588b && i < size) {
                    i++;
                    fVar = this.f2560g.get(i);
                }
                if (i2 == fVar.f2588b) {
                    float f6 = fVar.f2591e;
                    float f7 = fVar.f2590d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float a = this.f2566j.mo3753a(i2);
                    f = (f5 + a) * f3;
                    f5 += a + f4;
                }
                if (((float) this.f2575r) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f2576s.setBounds(Math.round(f), this.f2577t, Math.round(((float) this.f2575r) + f), this.f2578u);
                    this.f2576s.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m3621i();
            return false;
        }
        if (action != 0) {
            if (this.f2532C) {
                return true;
            }
            if (this.f2533D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f2539J = x;
            this.f2537H = x;
            float y = motionEvent.getY();
            this.f2540K = y;
            this.f2538I = y;
            this.f2541L = motionEvent2.getPointerId(0);
            this.f2533D = false;
            this.f2573p = true;
            this.f2572o.computeScrollOffset();
            if (this.f2567j0 != 2 || Math.abs(this.f2572o.getFinalX() - this.f2572o.getCurrX()) <= this.f2546Q) {
                m3608a(false);
                this.f2532C = false;
            } else {
                this.f2572o.abortAnimation();
                this.f2530A = false;
                mo3706e();
                this.f2532C = true;
                m3613c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f2541L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f2537H;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f2540K);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m3609a(this.f2537H, f)) {
                    if (mo3688a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f2537H = x2;
                        this.f2538I = y2;
                        this.f2533D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f2536G) && abs * 0.5f > abs2) {
                    this.f2532C = true;
                    m3613c(true);
                    setScrollState(1);
                    float f2 = this.f2539J;
                    float f3 = (float) this.f2536G;
                    this.f2537H = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f2538I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f2536G)) {
                    this.f2533D = true;
                }
                if (this.f2532C && m3612b(x2)) {
                    C0890v.m4736G(this);
                }
            }
        } else if (action == 6) {
            m3606a(motionEvent);
        }
        if (this.f2542M == null) {
            this.f2542M = VelocityTracker.obtain();
        }
        this.f2542M.addMovement(motionEvent2);
        return this.f2532C;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C0639f b;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0640g gVar = (C0640g) childAt.getLayoutParams();
                if (gVar.f2592a) {
                    int i14 = gVar.f2593b;
                    int i15 = i14 & 7;
                    int i16 = i14 & 112;
                    if (i15 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i15 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i15 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i16 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i16 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i16 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i17 = i5 + scrollX;
                    childAt.layout(i17, i6, childAt.getMeasuredWidth() + i17, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i18 = (i7 - i12) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                C0640g gVar2 = (C0640g) childAt2.getLayoutParams();
                if (!gVar2.f2592a && (b = mo3693b(childAt2)) != null) {
                    float f = (float) i18;
                    int i20 = ((int) (b.f2591e * f)) + i12;
                    if (gVar2.f2595d) {
                        gVar2.f2595d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * gVar2.f2594c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                    }
                    childAt2.layout(i20, i11, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + i11);
                }
            }
        }
        this.f2577t = i11;
        this.f2578u = i8 - i9;
        this.f2552W = i10;
        if (this.f2550U) {
            z2 = false;
            m3605a(this.f2568k, false, 0, false);
        } else {
            z2 = false;
        }
        this.f2550U = z2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f2534E
            int r15 = java.lang.Math.min(r15, r1)
            r13.f2535F = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = r15
            r15 = r14
            r14 = 0
        L_0x0039:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r14 >= r1) goto L_0x00b4
            android.view.View r6 = r13.getChildAt(r14)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.C0640g) r3
            if (r3 == 0) goto L_0x00b1
            boolean r7 = r3.f2592a
            if (r7 == 0) goto L_0x00b1
            int r7 = r3.f2593b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0067
            r9 = 80
            if (r7 != r9) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r7 = 0
            goto L_0x0068
        L_0x0067:
            r7 = 1
        L_0x0068:
            r9 = 3
            if (r8 == r9) goto L_0x0070
            r9 = 5
            if (r8 != r9) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0077
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x0077:
            if (r4 == 0) goto L_0x007c
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007e
        L_0x007c:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007e:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x008b
            if (r10 == r11) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r10 = r15
        L_0x0088:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008c
        L_0x008b:
            r10 = r15
        L_0x008c:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0095
            if (r3 == r11) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            r3 = r2
            goto L_0x0097
        L_0x0095:
            r3 = r2
            r5 = r9
        L_0x0097:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00aa
            int r3 = r6.getMeasuredHeight()
            int r2 = r2 - r3
            goto L_0x00b1
        L_0x00aa:
            if (r4 == 0) goto L_0x00b1
            int r3 = r6.getMeasuredWidth()
            int r15 = r15 - r3
        L_0x00b1:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00b4:
            android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r13.f2581x = r14
            r13.f2582y = r4
            r13.mo3706e()
            r13.f2582y = r0
            int r14 = r13.getChildCount()
        L_0x00c8:
            if (r0 >= r14) goto L_0x00f2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.C0640g) r2
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r2.f2592a
            if (r4 != 0) goto L_0x00ef
        L_0x00e0:
            float r4 = (float) r15
            float r2 = r2.f2594c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f2581x
            r1.measure(r2, r4)
        L_0x00ef:
            int r0 = r0 + 1
            goto L_0x00c8
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0639f b;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (b = mo3693b(childAt)) != null && b.f2588b == this.f2568k && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0646m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0646m mVar = (C0646m) parcelable;
        super.onRestoreInstanceState(mVar.mo4725q());
        C0649a aVar = this.f2566j;
        if (aVar != null) {
            aVar.mo2572a(mVar.f2601i, mVar.f2602j);
            mo3683a(mVar.f2600h, false, true);
            return;
        }
        this.f2569l = mVar.f2600h;
        this.f2570m = mVar.f2601i;
        this.f2571n = mVar.f2602j;
    }

    public Parcelable onSaveInstanceState() {
        C0646m mVar = new C0646m(super.onSaveInstanceState());
        mVar.f2600h = this.f2568k;
        C0649a aVar = this.f2566j;
        if (aVar != null) {
            mVar.f2601i = aVar.mo2576b();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f2575r;
            m3604a(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f2547R
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            androidx.viewpager.widget.a r0 = r7.f2566j
            if (r0 == 0) goto L_0x0155
            int r0 = r0.mo3754a()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f2542M
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f2542M = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f2542M
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.m3606a((android.view.MotionEvent) r8)
            int r0 = r7.f2541L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f2537H = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f2537H = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f2532C
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f2568k
            r7.m3605a((int) r8, (boolean) r1, (int) r2, (boolean) r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f2532C
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f2541L
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f2537H
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f2538I
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f2536G
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f2532C = r1
            r7.m3613c((boolean) r1)
            float r4 = r7.f2539J
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f2536G
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f2536G
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f2537H = r4
            r7.f2538I = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f2532C
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f2541L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.m3612b((float) r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f2532C
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f2542M
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f2544O
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f2541L
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f2530A = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            androidx.viewpager.widget.ViewPager$f r4 = r7.m3619g()
            int r5 = r7.f2575r
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f2588b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f2591e
            float r3 = r3 - r2
            float r2 = r4.f2590d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f2541L
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f2539J
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.m3602a((int) r6, (float) r3, (int) r0, (int) r8)
            r7.mo3684a((int) r8, (boolean) r1, (boolean) r1, (int) r0)
        L_0x012a:
            boolean r2 = r7.m3621i()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f2572o
            r0.abortAnimation()
            r7.f2530A = r2
            r7.mo3706e()
            float r0 = r8.getX()
            r7.f2539J = r0
            r7.f2537H = r0
            float r0 = r8.getY()
            r7.f2540K = r0
            r7.f2538I = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f2541L = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            p006b.p026g.p035k.C0890v.m4736G(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f2582y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0649a aVar) {
        C0649a aVar2 = this.f2566j;
        if (aVar2 != null) {
            aVar2.mo3759b((DataSetObserver) null);
            this.f2566j.mo2578b((ViewGroup) this);
            for (int i = 0; i < this.f2560g.size(); i++) {
                C0639f fVar = this.f2560g.get(i);
                this.f2566j.mo2574a((ViewGroup) this, fVar.f2588b, fVar.f2587a);
            }
            this.f2566j.mo2573a((ViewGroup) this);
            this.f2560g.clear();
            m3620h();
            this.f2568k = 0;
            scrollTo(0, 0);
        }
        C0649a aVar3 = this.f2566j;
        this.f2566j = aVar;
        this.f2558f = 0;
        if (this.f2566j != null) {
            if (this.f2574q == null) {
                this.f2574q = new C0645l();
            }
            this.f2566j.mo3759b((DataSetObserver) this.f2574q);
            this.f2530A = false;
            boolean z = this.f2550U;
            this.f2550U = true;
            this.f2558f = this.f2566j.mo3754a();
            if (this.f2569l >= 0) {
                this.f2566j.mo2572a(this.f2570m, this.f2571n);
                mo3683a(this.f2569l, false, true);
                this.f2569l = -1;
                this.f2570m = null;
                this.f2571n = null;
            } else if (!z) {
                mo3706e();
            } else {
                requestLayout();
            }
        }
        List<C0642i> list = this.f2556d0;
        if (list != null && !list.isEmpty()) {
            int size = this.f2556d0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2556d0.get(i2).mo3740a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f2530A = false;
        mo3683a(i, !this.f2550U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f2531B) {
            this.f2531B = i;
            mo3706e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0643j jVar) {
        this.f2554b0 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f2575r;
        this.f2575r = i;
        int width = getWidth();
        m3604a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0311a.m1534c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f2576s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f2567j0 != i) {
            this.f2567j0 = i;
            if (this.f2557e0 != null) {
                m3611b(i != 0);
            }
            m3616e(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2576s;
    }
}
