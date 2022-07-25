package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.graphics.drawable.C0328a;
import com.google.android.material.internal.C2673h;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p054c.p083e.p084a.p085a.p099w.C1218c;
import p054c.p083e.p084a.p085a.p100x.C1224a;
import p054c.p083e.p084a.p085a.p100x.C1227b;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p054c.p083e.p084a.p085a.p102z.C1238g;
import p054c.p083e.p084a.p085a.p102z.C1252j;

/* renamed from: com.google.android.material.button.a */
class C2588a {

    /* renamed from: s */
    private static final boolean f6700s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f6701a;

    /* renamed from: b */
    private C1238g f6702b;

    /* renamed from: c */
    private int f6703c;

    /* renamed from: d */
    private int f6704d;

    /* renamed from: e */
    private int f6705e;

    /* renamed from: f */
    private int f6706f;

    /* renamed from: g */
    private int f6707g;

    /* renamed from: h */
    private int f6708h;

    /* renamed from: i */
    private PorterDuff.Mode f6709i;

    /* renamed from: j */
    private ColorStateList f6710j;

    /* renamed from: k */
    private ColorStateList f6711k;

    /* renamed from: l */
    private ColorStateList f6712l;

    /* renamed from: m */
    private Drawable f6713m;

    /* renamed from: n */
    private boolean f6714n = false;

    /* renamed from: o */
    private boolean f6715o = false;

    /* renamed from: p */
    private boolean f6716p = false;

    /* renamed from: q */
    private boolean f6717q;

    /* renamed from: r */
    private LayerDrawable f6718r;

    C2588a(MaterialButton materialButton, C1238g gVar) {
        this.f6701a = materialButton;
        this.f6702b = gVar;
    }

    /* renamed from: a */
    private InsetDrawable m10033a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6703c, this.f6705e, this.f6704d, this.f6706f);
    }

    /* renamed from: a */
    private C1238g m10034a(C1238g gVar, float f) {
        return gVar.mo5531a(f);
    }

    /* renamed from: b */
    private void m10035b(C1238g gVar) {
        if (mo7920c() != null) {
            mo7920c().setShapeAppearanceModel(gVar);
        }
        if (m10038n() != null) {
            m10038n().setShapeAppearanceModel(gVar);
        }
        if (mo7916b() != null) {
            mo7916b().setShapeAppearanceModel(gVar);
        }
    }

    /* renamed from: c */
    private C1233d m10036c(boolean z) {
        LayerDrawable layerDrawable = this.f6718r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1233d) (f6700s ? (LayerDrawable) ((InsetDrawable) this.f6718r.getDrawable(0)).getDrawable() : this.f6718r).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: m */
    private Drawable m10037m() {
        C1233d dVar = new C1233d(this.f6702b);
        dVar.mo5491a(this.f6701a.getContext());
        C0328a.m1611a((Drawable) dVar, this.f6710j);
        PorterDuff.Mode mode = this.f6709i;
        if (mode != null) {
            C0328a.m1614a((Drawable) dVar, mode);
        }
        dVar.mo5488a((float) this.f6708h, this.f6711k);
        C1233d dVar2 = new C1233d(this.f6702b);
        dVar2.setTint(0);
        dVar2.mo5487a((float) this.f6708h, this.f6714n ? C1207a.m5828a((View) this.f6701a, C1169b.colorSurface) : 0);
        if (f6700s) {
            this.f6713m = new C1233d(this.f6702b);
            int i = this.f6708h;
            if (i > 0) {
                C1238g a = m10034a(this.f6702b, ((float) i) / 2.0f);
                dVar.setShapeAppearanceModel(a);
                dVar2.setShapeAppearanceModel(a);
                ((C1233d) this.f6713m).setShapeAppearanceModel(a);
            }
            C0328a.m1619b(this.f6713m, -1);
            this.f6718r = new RippleDrawable(C1227b.m5883a(this.f6712l), m10033a((Drawable) new LayerDrawable(new Drawable[]{dVar2, dVar})), this.f6713m);
            return this.f6718r;
        }
        this.f6713m = new C1224a(this.f6702b);
        C0328a.m1611a(this.f6713m, C1227b.m5883a(this.f6712l));
        this.f6718r = new LayerDrawable(new Drawable[]{dVar2, dVar, this.f6713m});
        return m10033a((Drawable) this.f6718r);
    }

    /* renamed from: n */
    private C1233d m10038n() {
        return m10036c(true);
    }

    /* renamed from: o */
    private void m10039o() {
        C1233d c = mo7920c();
        C1233d n = m10038n();
        if (c != null) {
            c.mo5488a((float) this.f6708h, this.f6711k);
            if (n != null) {
                n.mo5487a((float) this.f6708h, this.f6714n ? C1207a.m5828a((View) this.f6701a, C1169b.colorSurface) : 0);
            }
            if (f6700s) {
                C1238g a = m10034a(this.f6702b, ((float) this.f6708h) / 2.0f);
                m10035b(a);
                Drawable drawable = this.f6713m;
                if (drawable != null) {
                    ((C1233d) drawable).setShapeAppearanceModel(a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7908a() {
        return this.f6707g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7909a(int i) {
        if (mo7920c() != null) {
            mo7920c().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7910a(int i, int i2) {
        Drawable drawable = this.f6713m;
        if (drawable != null) {
            drawable.setBounds(this.f6703c, this.f6705e, i2 - this.f6704d, i - this.f6706f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7911a(ColorStateList colorStateList) {
        if (this.f6712l != colorStateList) {
            this.f6712l = colorStateList;
            if (f6700s && (this.f6701a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f6701a.getBackground()).setColor(C1227b.m5883a(colorStateList));
            } else if (!f6700s && (this.f6701a.getBackground() instanceof C1224a)) {
                ((C1224a) this.f6701a.getBackground()).setTintList(C1227b.m5883a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7912a(TypedArray typedArray) {
        this.f6703c = typedArray.getDimensionPixelOffset(C1178k.MaterialButton_android_insetLeft, 0);
        this.f6704d = typedArray.getDimensionPixelOffset(C1178k.MaterialButton_android_insetRight, 0);
        this.f6705e = typedArray.getDimensionPixelOffset(C1178k.MaterialButton_android_insetTop, 0);
        this.f6706f = typedArray.getDimensionPixelOffset(C1178k.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C1178k.MaterialButton_cornerRadius)) {
            this.f6707g = typedArray.getDimensionPixelSize(C1178k.MaterialButton_cornerRadius, -1);
            mo7914a(this.f6702b.mo5533b((float) this.f6707g));
            this.f6716p = true;
        }
        this.f6708h = typedArray.getDimensionPixelSize(C1178k.MaterialButton_strokeWidth, 0);
        this.f6709i = C2673h.m10593a(typedArray.getInt(C1178k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f6710j = C1218c.m5861a(this.f6701a.getContext(), typedArray, C1178k.MaterialButton_backgroundTint);
        this.f6711k = C1218c.m5861a(this.f6701a.getContext(), typedArray, C1178k.MaterialButton_strokeColor);
        this.f6712l = C1218c.m5861a(this.f6701a.getContext(), typedArray, C1178k.MaterialButton_rippleColor);
        this.f6717q = typedArray.getBoolean(C1178k.MaterialButton_android_checkable, false);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C1178k.MaterialButton_elevation, 0);
        int t = C0890v.m4796t(this.f6701a);
        int paddingTop = this.f6701a.getPaddingTop();
        int s = C0890v.m4795s(this.f6701a);
        int paddingBottom = this.f6701a.getPaddingBottom();
        this.f6701a.setInternalBackground(m10037m());
        C1233d c = mo7920c();
        if (c != null) {
            c.mo5486a((float) dimensionPixelSize);
        }
        C0890v.m4747a(this.f6701a, t + this.f6703c, paddingTop + this.f6705e, s + this.f6704d, paddingBottom + this.f6706f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7913a(PorterDuff.Mode mode) {
        if (this.f6709i != mode) {
            this.f6709i = mode;
            if (mo7920c() != null && this.f6709i != null) {
                C0328a.m1614a((Drawable) mo7920c(), this.f6709i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7914a(C1238g gVar) {
        this.f6702b = gVar;
        m10035b(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7915a(boolean z) {
        this.f6717q = z;
    }

    /* renamed from: b */
    public C1252j mo7916b() {
        LayerDrawable layerDrawable = this.f6718r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (C1252j) (this.f6718r.getNumberOfLayers() > 2 ? this.f6718r.getDrawable(2) : this.f6718r.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7917b(int i) {
        if (!this.f6716p || this.f6707g != i) {
            this.f6707g = i;
            this.f6716p = true;
            mo7914a(this.f6702b.mo5533b(((float) i) + (((float) this.f6708h) / 2.0f)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7918b(ColorStateList colorStateList) {
        if (this.f6711k != colorStateList) {
            this.f6711k = colorStateList;
            m10039o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7919b(boolean z) {
        this.f6714n = z;
        m10039o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1233d mo7920c() {
        return m10036c(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7921c(int i) {
        if (this.f6708h != i) {
            this.f6708h = i;
            m10039o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7922c(ColorStateList colorStateList) {
        if (this.f6710j != colorStateList) {
            this.f6710j = colorStateList;
            if (mo7920c() != null) {
                C0328a.m1611a((Drawable) mo7920c(), this.f6710j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo7923d() {
        return this.f6712l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1238g mo7924e() {
        return this.f6702b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo7925f() {
        return this.f6711k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo7926g() {
        return this.f6708h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo7927h() {
        return this.f6710j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public PorterDuff.Mode mo7928i() {
        return this.f6709i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo7929j() {
        return this.f6715o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo7930k() {
        return this.f6717q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo7931l() {
        this.f6715o = true;
        this.f6701a.setSupportBackgroundTintList(this.f6710j);
        this.f6701a.setSupportBackgroundTintMode(this.f6709i);
    }
}
