package p006b.p007a.p010l.p011a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0185h0;
import androidx.core.content.p002c.C0327g;
import androidx.core.graphics.drawable.C0329b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p007a.p010l.p011a.C0674b;
import p006b.p007a.p010l.p011a.C0679d;
import p006b.p007a.p012m.C0682b;
import p006b.p021d.C0728d;
import p006b.p021d.C0737h;
import p006b.p051o.p052a.p053a.C1019c;
import p006b.p051o.p052a.p053a.C1029i;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.l.a.a */
public class C0666a extends C0679d implements C0329b {

    /* renamed from: t */
    private C0669c f2616t;

    /* renamed from: u */
    private C0673g f2617u;

    /* renamed from: v */
    private int f2618v;

    /* renamed from: w */
    private int f2619w;

    /* renamed from: x */
    private boolean f2620x;

    /* renamed from: b.a.l.a.a$b */
    private static class C0668b extends C0673g {

        /* renamed from: a */
        private final Animatable f2621a;

        C0668b(Animatable animatable) {
            super();
            this.f2621a = animatable;
        }

        /* renamed from: c */
        public void mo3772c() {
            this.f2621a.start();
        }

        /* renamed from: d */
        public void mo3773d() {
            this.f2621a.stop();
        }
    }

    /* renamed from: b.a.l.a.a$c */
    static class C0669c extends C0679d.C0680a {

        /* renamed from: K */
        C0728d<Long> f2622K;

        /* renamed from: L */
        C0737h<Integer> f2623L;

        C0669c(C0669c cVar, C0666a aVar, Resources resources) {
            super(cVar, aVar, resources);
            C0737h<Integer> hVar;
            if (cVar != null) {
                this.f2622K = cVar.f2622K;
                hVar = cVar.f2623L;
            } else {
                this.f2622K = new C0728d<>();
                hVar = new C0737h<>();
            }
            this.f2623L = hVar;
        }

        /* renamed from: f */
        private static long m3699f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3774a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo3829a(drawable);
            long f = m3699f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f2622K.mo4108a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f2622K.mo4108a(m3699f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3775a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo3884a(iArr, drawable);
            this.f2623L.mo4221c(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3776b(int[] iArr) {
            int a = super.mo3883a(iArr);
            return a >= 0 ? a : super.mo3883a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo3777c(int i, int i2) {
            return (int) this.f2622K.mo4111b(m3699f(i, i2), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3778d(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f2623L.mo4219b(i, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3779d(int i, int i2) {
            return (this.f2622K.mo4111b(m3699f(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo3780e(int i, int i2) {
            return (this.f2622K.mo4111b(m3699f(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3781m() {
            this.f2622K = this.f2622K.clone();
            this.f2623L = this.f2623L.clone();
        }

        public Drawable newDrawable() {
            return new C0666a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0666a(this, resources);
        }
    }

    /* renamed from: b.a.l.a.a$d */
    private static class C0670d extends C0673g {

        /* renamed from: a */
        private final C1019c f2624a;

        C0670d(C1019c cVar) {
            super();
            this.f2624a = cVar;
        }

        /* renamed from: c */
        public void mo3772c() {
            this.f2624a.start();
        }

        /* renamed from: d */
        public void mo3773d() {
            this.f2624a.stop();
        }
    }

    /* renamed from: b.a.l.a.a$e */
    private static class C0671e extends C0673g {

        /* renamed from: a */
        private final ObjectAnimator f2625a;

        /* renamed from: b */
        private final boolean f2626b;

        C0671e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C0672f fVar = new C0672f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo3786a());
            ofInt.setInterpolator(fVar);
            this.f2626b = z2;
            this.f2625a = ofInt;
        }

        /* renamed from: a */
        public boolean mo3784a() {
            return this.f2626b;
        }

        /* renamed from: b */
        public void mo3785b() {
            this.f2625a.reverse();
        }

        /* renamed from: c */
        public void mo3772c() {
            this.f2625a.start();
        }

        /* renamed from: d */
        public void mo3773d() {
            this.f2625a.cancel();
        }
    }

    /* renamed from: b.a.l.a.a$f */
    private static class C0672f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f2627a;

        /* renamed from: b */
        private int f2628b;

        /* renamed from: c */
        private int f2629c;

        C0672f(AnimationDrawable animationDrawable, boolean z) {
            mo3787a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3786a() {
            return this.f2629c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3787a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2628b = numberOfFrames;
            int[] iArr = this.f2627a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2627a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2627a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f2629c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f2629c)) + 0.5f);
            int i2 = this.f2628b;
            int[] iArr = this.f2627a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f2629c) : 0.0f);
        }
    }

    /* renamed from: b.a.l.a.a$g */
    private static abstract class C0673g {
        private C0673g() {
        }

        /* renamed from: a */
        public boolean mo3784a() {
            return false;
        }

        /* renamed from: b */
        public void mo3785b() {
        }

        /* renamed from: c */
        public abstract void mo3772c();

        /* renamed from: d */
        public abstract void mo3773d();
    }

    static {
        Class<C0666a> cls = C0666a.class;
    }

    public C0666a() {
        this((C0669c) null, (Resources) null);
    }

    C0666a(C0669c cVar, Resources resources) {
        super((C0679d.C0680a) null);
        this.f2618v = -1;
        this.f2619w = -1;
        mo3766a((C0674b.C0677c) new C0669c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    private void m3685a(TypedArray typedArray) {
        C0669c cVar = this.f2616t;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f2656d |= typedArray.getChangingConfigurations();
        }
        cVar.mo3838b(typedArray.getBoolean(C0682b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f2661i));
        cVar.mo3834a(typedArray.getBoolean(C0682b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f2664l));
        cVar.mo3837b(typedArray.getInt(C0682b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f2644A));
        cVar.mo3841c(typedArray.getInt(C0682b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f2645B));
        setDither(typedArray.getBoolean(C0682b.AnimatedStateListDrawableCompat_android_dither, cVar.f2676x));
    }

    /* renamed from: b */
    public static C0666a m3686b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0666a aVar = new C0666a();
            aVar.mo3765a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: b */
    private boolean m3687b(int i) {
        int i2;
        int c;
        C0673g gVar;
        C0673g gVar2 = this.f2617u;
        if (gVar2 == null) {
            i2 = mo3793b();
        } else if (i == this.f2618v) {
            return true;
        } else {
            if (i != this.f2619w || !gVar2.mo3784a()) {
                i2 = this.f2618v;
                gVar2.mo3773d();
            } else {
                gVar2.mo3785b();
                this.f2618v = this.f2619w;
                this.f2619w = i;
                return true;
            }
        }
        this.f2617u = null;
        this.f2619w = -1;
        this.f2618v = -1;
        C0669c cVar = this.f2616t;
        int d = cVar.mo3778d(i2);
        int d2 = cVar.mo3778d(i);
        if (d2 == 0 || d == 0 || (c = cVar.mo3777c(d, d2)) < 0) {
            return false;
        }
        boolean e = cVar.mo3780e(d, d2);
        mo3791a(c);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new C0671e((AnimationDrawable) current, cVar.mo3779d(d, d2), e);
        } else if (current instanceof C1019c) {
            gVar = new C0670d((C1019c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new C0668b((Animatable) current);
            }
            return false;
        }
        gVar.mo3772c();
        this.f2617u = gVar;
        this.f2619w = i2;
        this.f2618v = i;
        return true;
    }

    /* renamed from: c */
    private void m3688c() {
        onStateChange(getState());
    }

    /* renamed from: c */
    private void m3689c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m3690d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m3691e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private int m3690d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C0682b.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C0682b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C0682b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a2 = resourceId2 > 0 ? C0185h0.m929a().mo1371a(context, resourceId2) : null;
        a.recycle();
        int[] a3 = mo3882a(attributeSet);
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a2 = xmlPullParser.getName().equals("vector") ? C1029i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (a2 != null) {
            return this.f2616t.mo3775a(a3, a2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: e */
    private int m3691e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C0682b.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C0682b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C0682b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C0682b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a2 = resourceId3 > 0 ? C0185h0.m929a().mo1371a(context, resourceId3) : null;
        boolean z = a.getBoolean(C0682b.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a2 = xmlPullParser.getName().equals("animated-vector") ? C1019c.m5267a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (a2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f2616t.mo3774a(resourceId, resourceId2, a2, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0669c m3694a() {
        return new C0669c(this.f2616t, this, (Resources) null);
    }

    /* renamed from: a */
    public void mo3765a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C0682b.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0682b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m3685a(a);
        mo3789a(resources);
        a.recycle();
        m3689c(context, resources, xmlPullParser, attributeSet, theme);
        m3688c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3766a(C0674b.C0677c cVar) {
        super.mo3766a(cVar);
        if (cVar instanceof C0669c) {
            this.f2616t = (C0669c) cVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C0673g gVar = this.f2617u;
        if (gVar != null) {
            gVar.mo3773d();
            this.f2617u = null;
            mo3791a(this.f2618v);
            this.f2618v = -1;
            this.f2619w = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f2620x) {
            super.mutate();
            if (this == this) {
                this.f2616t.mo3781m();
                this.f2620x = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f2616t.mo3776b(iArr);
        boolean z = b != mo3793b() && (m3687b(b) || mo3791a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f2617u != null && (visible || z2)) {
            if (z) {
                this.f2617u.mo3772c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
