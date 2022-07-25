package p006b.p007a.p010l.p011a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p006b.p007a.p010l.p011a.C0674b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.l.a.d */
class C0679d extends C0674b {

    /* renamed from: r */
    private C0680a f2680r;

    /* renamed from: s */
    private boolean f2681s;

    /* renamed from: b.a.l.a.d$a */
    static class C0680a extends C0674b.C0677c {

        /* renamed from: J */
        int[][] f2682J;

        C0680a(C0680a aVar, C0679d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f2682J = aVar.f2682J;
            } else {
                this.f2682J = new int[mo3840c()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3883a(int[] iArr) {
            int[][] iArr2 = this.f2682J;
            int d = mo3843d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3884a(int[] iArr, Drawable drawable) {
            int a = mo3829a(drawable);
            this.f2682J[a] = iArr;
            return a;
        }

        /* renamed from: a */
        public void mo3831a(int i, int i2) {
            super.mo3831a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f2682J, 0, iArr, 0, i);
            this.f2682J = iArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3781m() {
            int[][] iArr = this.f2682J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f2682J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f2682J = iArr2;
        }

        public Drawable newDrawable() {
            return new C0679d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0679d(this, resources);
        }
    }

    C0679d(C0680a aVar) {
        if (aVar != null) {
            mo3766a((C0674b.C0677c) aVar);
        }
    }

    C0679d(C0680a aVar, Resources resources) {
        mo3766a((C0674b.C0677c) new C0680a(aVar, this, resources));
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0680a m3759a() {
        return new C0680a(this.f2680r, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3766a(C0674b.C0677c cVar) {
        super.mo3766a(cVar);
        if (cVar instanceof C0680a) {
            this.f2680r = (C0680a) cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo3882a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f2681s) {
            super.mutate();
            if (this == this) {
                this.f2680r.mo3781m();
                this.f2681s = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f2680r.mo3883a(iArr);
        if (a < 0) {
            a = this.f2680r.mo3883a(StateSet.WILD_CARD);
        }
        return mo3791a(a) || onStateChange;
    }
}
