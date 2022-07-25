package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0328a;
import com.google.android.material.internal.C2672g;
import java.lang.ref.WeakReference;
import java.util.List;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p030f.C0797a;
import p006b.p026g.p034j.C0832c;
import p006b.p026g.p035k.C0852d0;
import p006b.p026g.p035k.C0880l;
import p006b.p026g.p035k.C0886r;
import p006b.p026g.p035k.C0890v;
import p006b.p039i.p040a.C0912a;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1174g;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p087l.C1179a;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1236e;

@CoordinatorLayout.C0266d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: f */
    private int f6512f;

    /* renamed from: g */
    private int f6513g;

    /* renamed from: h */
    private int f6514h;

    /* renamed from: i */
    private int f6515i;

    /* renamed from: j */
    private boolean f6516j;

    /* renamed from: k */
    private int f6517k;

    /* renamed from: l */
    private C0852d0 f6518l;

    /* renamed from: m */
    private List<C2552c> f6519m;

    /* renamed from: n */
    private boolean f6520n;

    /* renamed from: o */
    private boolean f6521o;

    /* renamed from: p */
    private boolean f6522p;

    /* renamed from: q */
    private boolean f6523q;

    /* renamed from: r */
    private int f6524r;

    /* renamed from: s */
    private WeakReference<View> f6525s;

    /* renamed from: t */
    private ValueAnimator f6526t;

    /* renamed from: u */
    private int[] f6527u;

    /* renamed from: v */
    private Drawable f6528v;

    protected static class BaseBehavior<T extends AppBarLayout> extends C2554a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f6529k;

        /* renamed from: l */
        private int f6530l;

        /* renamed from: m */
        private ValueAnimator f6531m;

        /* renamed from: n */
        private int f6532n = -1;

        /* renamed from: o */
        private boolean f6533o;

        /* renamed from: p */
        private float f6534p;

        /* renamed from: q */
        private WeakReference<View> f6535q;

        /* renamed from: r */
        private C2547b f6536r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C2546a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f6537a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f6538b;

            C2546a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f6537a = coordinatorLayout;
                this.f6538b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo7757c(this.f6537a, this.f6538b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C2547b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo7741a(T t);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        protected static class C2548c extends C0912a {
            public static final Parcelable.Creator<C2548c> CREATOR = new C2549a();

            /* renamed from: h */
            int f6540h;

            /* renamed from: i */
            float f6541i;

            /* renamed from: j */
            boolean f6542j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            static class C2549a implements Parcelable.ClassLoaderCreator<C2548c> {
                C2549a() {
                }

                public C2548c createFromParcel(Parcel parcel) {
                    return new C2548c(parcel, (ClassLoader) null);
                }

                public C2548c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C2548c(parcel, classLoader);
                }

                public C2548c[] newArray(int i) {
                    return new C2548c[i];
                }
            }

            public C2548c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f6540h = parcel.readInt();
                this.f6541i = parcel.readFloat();
                this.f6542j = parcel.readByte() != 0;
            }

            public C2548c(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f6540h);
                parcel.writeFloat(this.f6541i);
                parcel.writeByte(this.f6542j ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private View m9784a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C0880l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static View m9785a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m9786a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo7736c() - i);
            float abs2 = Math.abs(f);
            m9787a(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m9787a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = mo7736c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f6531m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6531m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f6531m;
            if (valueAnimator2 == null) {
                this.f6531m = new ValueAnimator();
                this.f6531m.setInterpolator(C1179a.f3918e);
                this.f6531m.addUpdateListener(new C2546a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f6531m.setDuration((long) Math.min(i2, 600));
            this.f6531m.setIntValues(new int[]{c, i});
            this.f6531m.start();
        }

        /* renamed from: a */
        private void m9788a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a = m9785a((AppBarLayout) t, i);
            if (a != null) {
                int a2 = ((C2553d) a.getLayoutParams()).mo7750a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int p = C0890v.m4792p(a);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a.getBottom() - p) - t.getTopInset()) : (-i) >= (a.getBottom() - p) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo7687c()) {
                    z2 = t.mo7684a(m9784a(coordinatorLayout));
                }
                boolean a3 = t.mo7685a(z2);
                if (z || (a3 && m9793c(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private static boolean m9789a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        private boolean m9790a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo7686b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: b */
        private int m9791b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2553d dVar = (C2553d) childAt.getLayoutParams();
                if (m9789a(dVar.mo7750a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private int m9792c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C2553d dVar = (C2553d) childAt.getLayoutParams();
                Interpolator b = dVar.mo7751b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = dVar.mo7750a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0890v.m4792p(childAt);
                        }
                    }
                    if (C0890v.m4788l(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private boolean m9793c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c = coordinatorLayout.mo1783c((View) t);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.C0265c d = ((CoordinatorLayout.C0268f) c.get(i).getLayoutParams()).mo1864d();
                if (d instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d).mo7762c() != 0;
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m9794d(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo7736c();
            int b = m9791b(t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C2553d dVar = (C2553d) childAt.getLayoutParams();
                int a = dVar.mo7750a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m9789a(a, 2)) {
                        i2 += C0890v.m4792p(childAt);
                    } else if (m9789a(a, 5)) {
                        int p = C0890v.m4792p(childAt) + i2;
                        if (c < p) {
                            i = p;
                        } else {
                            i2 = p;
                        }
                    }
                    if (m9789a(a, 32)) {
                        i += dVar.topMargin;
                        i2 -= dVar.bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m9786a(coordinatorLayout, t, C0797a.m4439a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo7733b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = mo7736c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f6529k = 0;
            } else {
                int a = C0797a.m4439a(i, i2, i3);
                if (c != a) {
                    int c2 = t.mo7683a() ? m9792c(t, a) : a;
                    boolean a2 = mo7765a(c2);
                    i4 = c - a;
                    this.f6529k = a - c2;
                    if (!a2 && t.mo7683a()) {
                        coordinatorLayout.mo1773a((View) t);
                    }
                    t.mo7681a(mo7766b());
                    m9788a(coordinatorLayout, t, a, a < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7739e(CoordinatorLayout coordinatorLayout, T t) {
            m9794d(coordinatorLayout, t);
            if (t.mo7687c()) {
                t.mo7685a(t.mo7684a(m9784a(coordinatorLayout)));
            }
        }

        /* renamed from: a */
        public void mo1822a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C2548c) {
                C2548c cVar = (C2548c) parcelable;
                super.mo1822a(coordinatorLayout, t, cVar.mo4725q());
                this.f6532n = cVar.f6540h;
                this.f6534p = cVar.f6541i;
                this.f6533o = cVar.f6542j;
                return;
            }
            super.mo1822a(coordinatorLayout, t, parcelable);
            this.f6532n = -1;
        }

        /* renamed from: a */
        public void mo1823a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f6530l == 0 || i == 1) {
                m9794d(coordinatorLayout, t);
                if (t.mo7687c()) {
                    t.mo7685a(t.mo7684a(view));
                }
            }
            this.f6535q = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo1826a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo7755a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo1828a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo7755a(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo7687c()) {
                t.mo7685a(t.mo7684a(view));
            }
        }

        /* renamed from: a */
        public boolean mo1832a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean a = super.mo1832a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f6532n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                mo7757c(coordinatorLayout, t, (-childAt.getBottom()) + (this.f6533o ? C0890v.m4792p(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f6534p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m9786a(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        mo7757c(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m9786a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo7757c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo7689d();
            this.f6532n = -1;
            mo7765a(C0797a.m4439a(mo7766b(), -t.getTotalScrollRange(), 0));
            m9788a(coordinatorLayout, t, mo7766b(), 0, true);
            t.mo7681a(mo7766b());
            return a;
        }

        /* renamed from: a */
        public boolean mo1833a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0268f) t.getLayoutParams()).height != -2) {
                return super.mo1833a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo1774a((View) t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo1844b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo7687c() || m9790a(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f6531m) != null) {
                valueAnimator.cancel();
            }
            this.f6535q = null;
            this.f6530l = i2;
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7727a(T t) {
            C2547b bVar = this.f6536r;
            if (bVar != null) {
                return bVar.mo7741a(t);
            }
            WeakReference<View> weakReference = this.f6535q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo7732b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo1847d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.mo1847d(coordinatorLayout, t);
            int b = mo7766b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    C2548c cVar = new C2548c(d);
                    cVar.f6540h = i;
                    if (bottom == C0890v.m4792p(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f6542j = z;
                    cVar.f6541i = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo7736c() {
            return mo7766b() + this.f6529k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo7737c(T t) {
            return t.getTotalScrollRange();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C2556b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.ScrollingViewBehavior_Layout);
            mo7760b(obtainStyledAttributes.getDimensionPixelSize(C1178k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m9823a(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0265c d = ((CoordinatorLayout.C0268f) appBarLayout.getLayoutParams()).mo1864d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo7736c();
            }
            return 0;
        }

        /* renamed from: a */
        private void m9824a(View view, View view2) {
            CoordinatorLayout.C0265c d = ((CoordinatorLayout.C0268f) view2.getLayoutParams()).mo1864d();
            if (d instanceof BaseBehavior) {
                C0890v.m4777e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f6529k) + mo7763d()) - mo7759a(view2));
            }
        }

        /* renamed from: b */
        private void m9825b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo7687c()) {
                    appBarLayout.mo7685a(appBarLayout.mo7684a(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AppBarLayout m9827a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo1835a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo7745a((List) coordinatorLayout.mo1779b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f6558d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo7682a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo1837a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo7746b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m9823a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: b */
        public boolean mo1842b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m9824a(view, view2);
            m9825b(view, view2);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo7747c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo7747c(view);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C2550a implements C0886r {
        C2550a() {
        }

        /* renamed from: a */
        public C0852d0 mo205a(View view, C0852d0 d0Var) {
            return AppBarLayout.this.mo7680a(d0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C2551b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1233d f6544a;

        C2551b(AppBarLayout appBarLayout, C1233d dVar) {
            this.f6544a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6544a.mo5486a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C2552c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo7749a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C2553d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f6545a = 1;

        /* renamed from: b */
        Interpolator f6546b;

        public C2553d(int i, int i2) {
            super(i, i2);
        }

        public C2553d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.AppBarLayout_Layout);
            this.f6545a = obtainStyledAttributes.getInt(C1178k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C1178k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f6546b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C1178k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C2553d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2553d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2553d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo7750a() {
            return this.f6545a;
        }

        /* renamed from: b */
        public Interpolator mo7751b() {
            return this.f6546b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo7752c() {
            int i = this.f6545a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6513g = -1;
        this.f6514h = -1;
        this.f6515i = -1;
        this.f6517k = 0;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C2559e.m9871a(this);
            C2559e.m9873a(this, attributeSet, i, C1177j.Widget_Design_AppBarLayout);
        }
        TypedArray c = C2672g.m10589c(context, attributeSet, C1178k.AppBarLayout, i, C1177j.Widget_Design_AppBarLayout, new int[0]);
        C0890v.m4751a((View) this, c.getDrawable(C1178k.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            C1233d dVar = new C1233d();
            dVar.mo5492a(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            dVar.mo5491a(context);
            C0890v.m4751a((View) this, (Drawable) dVar);
        }
        if (c.hasValue(C1178k.AppBarLayout_expanded)) {
            m9767a(c.getBoolean(C1178k.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && c.hasValue(C1178k.AppBarLayout_elevation)) {
            C2559e.m9872a(this, (float) c.getDimensionPixelSize(C1178k.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (c.hasValue(C1178k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c.getBoolean(C1178k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c.hasValue(C1178k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c.getBoolean(C1178k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f6523q = c.getBoolean(C1178k.AppBarLayout_liftOnScroll, false);
        this.f6524r = c.getResourceId(C1178k.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(c.getDrawable(C1178k.AppBarLayout_statusBarForeground));
        c.recycle();
        C0890v.m4756a((View) this, (C0886r) new C2550a());
    }

    /* renamed from: a */
    private void m9766a(C1233d dVar, boolean z) {
        float dimension = getResources().getDimension(C1171d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f6526t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f6526t = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f6526t.setDuration((long) getResources().getInteger(C1174g.app_bar_elevation_anim_duration));
        this.f6526t.setInterpolator(C1179a.f3914a);
        this.f6526t.addUpdateListener(new C2551b(this, dVar));
        this.f6526t.start();
    }

    /* renamed from: a */
    private void m9767a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f6517k = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private View m9768b(View view) {
        int i;
        if (this.f6525s == null && (i = this.f6524r) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f6524r);
            }
            if (findViewById != null) {
                this.f6525s = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f6525s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    private boolean m9769b(boolean z) {
        if (this.f6521o == z) {
            return false;
        }
        this.f6521o = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private void m9770e() {
        WeakReference<View> weakReference = this.f6525s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f6525s = null;
    }

    /* renamed from: f */
    private boolean m9771f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C2553d) getChildAt(i).getLayoutParams()).mo7752c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m9772g() {
        this.f6513g = -1;
        this.f6514h = -1;
        this.f6515i = -1;
    }

    /* renamed from: h */
    private boolean m9773h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C0890v.m4788l(childAt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0852d0 mo7680a(C0852d0 d0Var) {
        C0852d0 d0Var2 = C0890v.m4788l(this) ? d0Var : null;
        if (!C0832c.m4525a(this.f6518l, d0Var2)) {
            this.f6518l = d0Var2;
            requestLayout();
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7681a(int i) {
        this.f6512f = i;
        if (!willNotDraw()) {
            C0890v.m4736G(this);
        }
        List<C2552c> list = this.f6519m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2552c cVar = this.f6519m.get(i2);
                if (cVar != null) {
                    cVar.mo7749a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7682a(boolean z, boolean z2) {
        m9767a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7683a() {
        return this.f6516j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7684a(View view) {
        View b = m9768b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7685a(boolean z) {
        if (this.f6522p == z) {
            return false;
        }
        this.f6522p = z;
        refreshDrawableState();
        if (!this.f6523q || !(getBackground() instanceof C1233d)) {
            return true;
        }
        m9766a((C1233d) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7686b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean mo7687c() {
        return this.f6523q;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2553d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7689d() {
        this.f6517k = 0;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6528v != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f6512f));
            this.f6528v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6528v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public C2553d generateDefaultLayoutParams() {
        return new C2553d(-1, -2);
    }

    public C2553d generateLayoutParams(AttributeSet attributeSet) {
        return new C2553d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C2553d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2553d((ViewGroup.MarginLayoutParams) layoutParams) : new C2553d(layoutParams) : new C2553d((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int p;
        int i2 = this.f6514h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C2553d dVar = (C2553d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f6545a;
            if ((i4 & 5) == 5) {
                int i5 = dVar.topMargin + dVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    p = C0890v.m4792p(childAt);
                } else if ((i4 & 2) != 0) {
                    p = measuredHeight - C0890v.m4792p(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C0890v.m4788l(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + p;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f6514h = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f6515i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C2553d dVar = (C2553d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f6545a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0890v.m4792p(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f6515i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f6524r;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int p = C0890v.m4792p(this);
        if (p == 0) {
            int childCount = getChildCount();
            p = childCount >= 1 ? C0890v.m4792p(getChildAt(childCount - 1)) : 0;
            if (p == 0) {
                return getHeight() / 3;
            }
        }
        return (p * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f6517k;
    }

    public Drawable getStatusBarForeground() {
        return this.f6528v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0852d0 d0Var = this.f6518l;
        if (d0Var != null) {
            return d0Var.mo4574d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f6513g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C2553d dVar = (C2553d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f6545a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i2 == 0 && C0890v.m4788l(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C0890v.m4792p(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f6513g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1236e.m5958a(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f6527u == null) {
            this.f6527u = new int[4];
        }
        int[] iArr = this.f6527u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f6521o ? C1169b.state_liftable : -C1169b.state_liftable;
        iArr[1] = (!this.f6521o || !this.f6522p) ? -C1169b.state_lifted : C1169b.state_lifted;
        iArr[2] = this.f6521o ? C1169b.state_collapsible : -C1169b.state_collapsible;
        iArr[3] = (!this.f6521o || !this.f6522p) ? -C1169b.state_collapsed : C1169b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9770e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (C0890v.m4788l(this) && m9773h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0890v.m4777e(getChildAt(childCount), topInset);
            }
        }
        m9772g();
        boolean z2 = false;
        this.f6516j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C2553d) getChildAt(i5).getLayoutParams()).mo7751b() != null) {
                this.f6516j = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f6528v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f6520n) {
            if (this.f6523q || m9771f()) {
                z2 = true;
            }
            m9769b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0890v.m4788l(this) && m9773h()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0797a.m4439a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m9772g();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C1236e.m5959a((View) this, f);
    }

    public void setExpanded(boolean z) {
        mo7682a(z, C0890v.m4732C(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f6523q = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f6524r = i;
        m9770e();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f6528v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6528v = drawable3;
            Drawable drawable4 = this.f6528v;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f6528v.setState(getDrawableState());
                }
                C0328a.m1617a(this.f6528v, C0890v.m4791o(this));
                this.f6528v.setVisible(getVisibility() == 0, false);
                this.f6528v.setCallback(this);
            }
            C0890v.m4736G(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0664a.m3682c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C2559e.m9872a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f6528v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6528v;
    }
}
