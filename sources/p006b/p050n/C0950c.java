package p006b.p050n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p006b.p026g.p035k.C0890v;
import p006b.p050n.C0992m;

/* renamed from: b.n.c */
public class C0950c extends C0992m {

    /* renamed from: R */
    private static final String[] f3427R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: S */
    private static final Property<Drawable, PointF> f3428S = new C0952b(PointF.class, "boundsOrigin");

    /* renamed from: T */
    private static final Property<C0961k, PointF> f3429T = new C0953c(PointF.class, "topLeft");

    /* renamed from: U */
    private static final Property<C0961k, PointF> f3430U = new C0954d(PointF.class, "bottomRight");

    /* renamed from: V */
    private static final Property<View, PointF> f3431V = new C0955e(PointF.class, "bottomRight");

    /* renamed from: W */
    private static final Property<View, PointF> f3432W = new C0956f(PointF.class, "topLeft");

    /* renamed from: X */
    private static final Property<View, PointF> f3433X = new C0957g(PointF.class, "position");

    /* renamed from: Y */
    private static C0988k f3434Y = new C0988k();

    /* renamed from: O */
    private int[] f3435O = new int[2];

    /* renamed from: P */
    private boolean f3436P = false;

    /* renamed from: Q */
    private boolean f3437Q = false;

    /* renamed from: b.n.c$a */
    class C0951a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3438a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f3439b;

        /* renamed from: c */
        final /* synthetic */ View f3440c;

        /* renamed from: d */
        final /* synthetic */ float f3441d;

        C0951a(C0950c cVar, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f3438a = viewGroup;
            this.f3439b = bitmapDrawable;
            this.f3440c = view;
            this.f3441d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C0966d0.m5068b(this.f3438a).mo4801b(this.f3439b);
            C0966d0.m5064a(this.f3440c, this.f3441d);
        }
    }

    /* renamed from: b.n.c$b */
    static class C0952b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f3442a = new Rect();

        C0952b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3442a);
            Rect rect = this.f3442a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f3442a);
            this.f3442a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f3442a);
        }
    }

    /* renamed from: b.n.c$c */
    static class C0953c extends Property<C0961k, PointF> {
        C0953c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0961k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0961k kVar, PointF pointF) {
            kVar.mo4848b(pointF);
        }
    }

    /* renamed from: b.n.c$d */
    static class C0954d extends Property<C0961k, PointF> {
        C0954d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C0961k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0961k kVar, PointF pointF) {
            kVar.mo4847a(pointF);
        }
    }

    /* renamed from: b.n.c$e */
    static class C0955e extends Property<View, PointF> {
        C0955e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0966d0.m5066a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: b.n.c$f */
    static class C0956f extends Property<View, PointF> {
        C0956f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0966d0.m5066a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: b.n.c$g */
    static class C0957g extends Property<View, PointF> {
        C0957g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0966d0.m5066a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: b.n.c$h */
    class C0958h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0961k f3443a;
        private C0961k mViewBounds = this.f3443a;

        C0958h(C0950c cVar, C0961k kVar) {
            this.f3443a = kVar;
        }
    }

    /* renamed from: b.n.c$i */
    class C0959i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3444a;

        /* renamed from: b */
        final /* synthetic */ View f3445b;

        /* renamed from: c */
        final /* synthetic */ Rect f3446c;

        /* renamed from: d */
        final /* synthetic */ int f3447d;

        /* renamed from: e */
        final /* synthetic */ int f3448e;

        /* renamed from: f */
        final /* synthetic */ int f3449f;

        /* renamed from: g */
        final /* synthetic */ int f3450g;

        C0959i(C0950c cVar, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f3445b = view;
            this.f3446c = rect;
            this.f3447d = i;
            this.f3448e = i2;
            this.f3449f = i3;
            this.f3450g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3444a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f3444a) {
                C0890v.m4750a(this.f3445b, this.f3446c);
                C0966d0.m5066a(this.f3445b, this.f3447d, this.f3448e, this.f3449f, this.f3450g);
            }
        }
    }

    /* renamed from: b.n.c$j */
    class C0960j extends C0999n {

        /* renamed from: a */
        boolean f3451a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3452b;

        C0960j(C0950c cVar, ViewGroup viewGroup) {
            this.f3452b = viewGroup;
        }

        /* renamed from: a */
        public void mo4844a(C0992m mVar) {
            C1013x.m5262a(this.f3452b, false);
        }

        /* renamed from: b */
        public void mo4845b(C0992m mVar) {
            C1013x.m5262a(this.f3452b, true);
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
            if (!this.f3451a) {
                C1013x.m5262a(this.f3452b, false);
            }
            mVar.mo4906b((C0992m.C0998f) this);
        }
    }

    /* renamed from: b.n.c$k */
    private static class C0961k {

        /* renamed from: a */
        private int f3453a;

        /* renamed from: b */
        private int f3454b;

        /* renamed from: c */
        private int f3455c;

        /* renamed from: d */
        private int f3456d;

        /* renamed from: e */
        private View f3457e;

        /* renamed from: f */
        private int f3458f;

        /* renamed from: g */
        private int f3459g;

        C0961k(View view) {
            this.f3457e = view;
        }

        /* renamed from: a */
        private void m5051a() {
            C0966d0.m5066a(this.f3457e, this.f3453a, this.f3454b, this.f3455c, this.f3456d);
            this.f3458f = 0;
            this.f3459g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4847a(PointF pointF) {
            this.f3455c = Math.round(pointF.x);
            this.f3456d = Math.round(pointF.y);
            this.f3459g++;
            if (this.f3458f == this.f3459g) {
                m5051a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4848b(PointF pointF) {
            this.f3453a = Math.round(pointF.x);
            this.f3454b = Math.round(pointF.y);
            this.f3458f++;
            if (this.f3458f == this.f3459g) {
                m5051a();
            }
        }
    }

    /* renamed from: a */
    private boolean m5030a(View view, View view2) {
        if (!this.f3437Q) {
            return true;
        }
        C1008s a = mo4893a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f3574b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m5031d(C1008s sVar) {
        View view = sVar.f3574b;
        if (C0890v.m4732C(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f3573a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f3573a.put("android:changeBounds:parent", sVar.f3574b.getParent());
            if (this.f3437Q) {
                sVar.f3574b.getLocationInWindow(this.f3435O);
                sVar.f3573a.put("android:changeBounds:windowX", Integer.valueOf(this.f3435O[0]));
                sVar.f3573a.put("android:changeBounds:windowY", Integer.valueOf(this.f3435O[1]));
            }
            if (this.f3436P) {
                sVar.f3573a.put("android:changeBounds:clip", C0890v.m4784i(view));
            }
        }
    }

    /* renamed from: a */
    public Animator mo4813a(ViewGroup viewGroup, C1008s sVar, C1008s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C1008s sVar3 = sVar;
        C1008s sVar4 = sVar2;
        if (sVar3 == null || sVar4 == null) {
            return null;
        }
        Map<String, Object> map = sVar3.f3573a;
        Map<String, Object> map2 = sVar4.f3573a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar4.f3574b;
        if (m5030a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar3.f3573a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar4.f3573a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) sVar3.f3573a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar4.f3573a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f3436P) {
                view = view3;
                C0966d0.m5066a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo4917f().mo4868a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f3433X;
                    } else {
                        C0961k kVar = new C0961k(view);
                        ObjectAnimator a = C0975f.m5108a(kVar, f3429T, mo4917f().mo4868a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C0975f.m5108a(kVar, f3430U, mo4917f().mo4868a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C0958h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo4917f().mo4868a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f3431V;
                } else {
                    path = mo4917f().mo4868a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f3432W;
                }
                animator = C0975f.m5108a(view, property, path);
            } else {
                view = view3;
                C0966d0.m5066a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C0975f.m5108a(view, f3433X, mo4917f().mo4868a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C0890v.m4750a(view, rect);
                    C0988k kVar2 = f3434Y;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    objectAnimator.addListener(new C0959i(this, view, rect6, i4, i6, i8, i10));
                } else {
                    objectAnimator = null;
                }
                animator = C1007r.m5249a(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1013x.m5262a(viewGroup4, true);
                mo4892a((C0992m.C0998f) new C0960j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar3.f3573a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar3.f3573a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar4.f3573a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar4.f3573a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f3435O);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C0966d0.m5070c(view2);
        C0966d0.m5064a(view2, 0.0f);
        C0966d0.m5068b(viewGroup).mo4800a(bitmapDrawable);
        C0977g f = mo4917f();
        int[] iArr = this.f3435O;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0981i.m5124a(f3428S, f.mo4868a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C0951a(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public void mo4814a(C1008s sVar) {
        m5031d(sVar);
    }

    /* renamed from: c */
    public void mo4815c(C1008s sVar) {
        m5031d(sVar);
    }

    /* renamed from: m */
    public String[] mo4816m() {
        return f3427R;
    }
}
