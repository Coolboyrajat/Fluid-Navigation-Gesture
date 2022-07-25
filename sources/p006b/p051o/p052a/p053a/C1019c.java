package p006b.p051o.p052a.p053a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p002c.C0327g;
import androidx.core.graphics.drawable.C0328a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p006b.p021d.C0723a;

/* renamed from: b.o.a.a.c */
public class C1019c extends C1028h implements C1018b {

    /* renamed from: g */
    private C1021b f3600g;

    /* renamed from: h */
    private Context f3601h;

    /* renamed from: i */
    private ArgbEvaluator f3602i;

    /* renamed from: j */
    final Drawable.Callback f3603j;

    /* renamed from: b.o.a.a.c$a */
    class C1020a implements Drawable.Callback {
        C1020a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1019c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1019c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1019c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: b.o.a.a.c$b */
    private static class C1021b extends Drawable.ConstantState {

        /* renamed from: a */
        int f3605a;

        /* renamed from: b */
        C1029i f3606b;

        /* renamed from: c */
        AnimatorSet f3607c;

        /* renamed from: d */
        ArrayList<Animator> f3608d;

        /* renamed from: e */
        C0723a<Animator, String> f3609e;

        public C1021b(Context context, C1021b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3605a = bVar.f3605a;
                C1029i iVar = bVar.f3606b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f3606b = (C1029i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    C1029i iVar2 = this.f3606b;
                    iVar2.mutate();
                    this.f3606b = iVar2;
                    this.f3606b.setCallback(callback);
                    this.f3606b.setBounds(bVar.f3606b.getBounds());
                    this.f3606b.mo5003a(false);
                }
                ArrayList<Animator> arrayList = bVar.f3608d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3608d = new ArrayList<>(size);
                    this.f3609e = new C0723a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f3608d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f3609e.get(animator);
                        clone.setTarget(this.f3606b.mo5002a(str));
                        this.f3608d.add(clone);
                        this.f3609e.put(clone, str);
                    }
                    mo4974a();
                }
            }
        }

        /* renamed from: a */
        public void mo4974a() {
            if (this.f3607c == null) {
                this.f3607c = new AnimatorSet();
            }
            this.f3607c.playTogether(this.f3608d);
        }

        public int getChangingConfigurations() {
            return this.f3605a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: b.o.a.a.c$c */
    private static class C1022c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3610a;

        public C1022c(Drawable.ConstantState constantState) {
            this.f3610a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3610a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3610a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1019c cVar = new C1019c();
            cVar.f3615f = this.f3610a.newDrawable();
            cVar.f3615f.setCallback(cVar.f3603j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1019c cVar = new C1019c();
            cVar.f3615f = this.f3610a.newDrawable(resources);
            cVar.f3615f.setCallback(cVar.f3603j);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1019c cVar = new C1019c();
            cVar.f3615f = this.f3610a.newDrawable(resources, theme);
            cVar.f3615f.setCallback(cVar.f3603j);
            return cVar;
        }
    }

    C1019c() {
        this((Context) null, (C1021b) null, (Resources) null);
    }

    private C1019c(Context context) {
        this(context, (C1021b) null, (Resources) null);
    }

    private C1019c(Context context, C1021b bVar, Resources resources) {
        this.f3602i = null;
        this.f3603j = new C1020a();
        this.f3601h = context;
        if (bVar != null) {
            this.f3600g = bVar;
        } else {
            this.f3600g = new C1021b(context, bVar, this.f3603j, resources);
        }
    }

    /* renamed from: a */
    public static C1019c m5267a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1019c cVar = new C1019c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m5268a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m5268a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3602i == null) {
                    this.f3602i = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3602i);
            }
        }
    }

    /* renamed from: a */
    private void m5269a(String str, Animator animator) {
        animator.setTarget(this.f3600g.f3606b.mo5002a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m5268a(animator);
        }
        C1021b bVar = this.f3600g;
        if (bVar.f3608d == null) {
            bVar.f3608d = new ArrayList<>();
            this.f3600g.f3609e = new C0723a<>();
        }
        this.f3600g.f3608d.add(animator);
        this.f3600g.f3609e.put(animator, str);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1612a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            return C0328a.m1616a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3600g.f3606b.draw(canvas);
        if (this.f3600g.f3607c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3615f;
        return drawable != null ? C0328a.m1620c(drawable) : this.f3600g.f3606b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3600g.f3605a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3615f;
        return drawable != null ? C0328a.m1621d(drawable) : this.f3600g.f3606b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f3615f;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1022c(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3600g.f3606b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3600g.f3606b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getOpacity() : this.f3600g.f3606b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1613a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0327g.m1594a(resources, theme, attributeSet, C1017a.f3592e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1029i a = C1029i.m5300a(resources, resourceId, theme);
                        a.mo5003a(false);
                        a.setCallback(this.f3603j);
                        C1029i iVar = this.f3600g.f3606b;
                        if (iVar != null) {
                            iVar.setCallback((Drawable.Callback) null);
                        }
                        this.f3600g.f3606b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C1017a.f3593f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3601h;
                        if (context != null) {
                            m5269a(string, C1024e.m5275a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3600g.mo4974a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3615f;
        return drawable != null ? C0328a.m1623f(drawable) : this.f3600g.f3606b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3615f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3600g.f3607c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.isStateful() : this.f3600g.f3606b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3600g.f3606b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.setLevel(i) : this.f3600g.f3606b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.setState(iArr) : this.f3600g.f3606b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3600g.f3606b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1615a(drawable, z);
        } else {
            this.f3600g.f3606b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3600g.f3606b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1619b(drawable, i);
        } else {
            this.f3600g.f3606b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1611a(drawable, colorStateList);
        } else {
            this.f3600g.f3606b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1614a(drawable, mode);
        } else {
            this.f3600g.f3606b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3600g.f3606b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3600g.f3607c.isStarted()) {
            this.f3600g.f3607c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3600g.f3607c.end();
        }
    }
}
