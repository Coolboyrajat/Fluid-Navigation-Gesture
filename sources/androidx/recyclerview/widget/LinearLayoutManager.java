package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C0538o implements C0602i, RecyclerView.C0555z.C0557b {

    /* renamed from: A */
    private boolean f2099A;

    /* renamed from: B */
    private boolean f2100B;

    /* renamed from: C */
    boolean f2101C;

    /* renamed from: D */
    private boolean f2102D;

    /* renamed from: E */
    private boolean f2103E;

    /* renamed from: F */
    int f2104F;

    /* renamed from: G */
    int f2105G;

    /* renamed from: H */
    private boolean f2106H;

    /* renamed from: I */
    C0515d f2107I;

    /* renamed from: J */
    final C0512a f2108J;

    /* renamed from: K */
    private final C0513b f2109K;

    /* renamed from: L */
    private int f2110L;

    /* renamed from: M */
    private int[] f2111M;

    /* renamed from: x */
    int f2112x;

    /* renamed from: y */
    private C0514c f2113y;

    /* renamed from: z */
    C0609o f2114z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0512a {

        /* renamed from: a */
        C0609o f2115a;

        /* renamed from: b */
        int f2116b;

        /* renamed from: c */
        int f2117c;

        /* renamed from: d */
        boolean f2118d;

        /* renamed from: e */
        boolean f2119e;

        C0512a() {
            mo2820b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2817a() {
            this.f2117c = this.f2118d ? this.f2115a.mo3569b() : this.f2115a.mo3577f();
        }

        /* renamed from: a */
        public void mo2818a(View view, int i) {
            this.f2117c = this.f2118d ? this.f2115a.mo3567a(view) + this.f2115a.mo3580h() : this.f2115a.mo3574d(view);
            this.f2116b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2819a(View view, RecyclerView.C0518a0 a0Var) {
            RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
            return !pVar.mo3281p() && pVar.mo3279n() >= 0 && pVar.mo3279n() < a0Var.mo3025a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2820b() {
            this.f2116b = -1;
            this.f2117c = RecyclerView.UNDEFINED_DURATION;
            this.f2118d = false;
            this.f2119e = false;
        }

        /* renamed from: b */
        public void mo2821b(View view, int i) {
            int h = this.f2115a.mo3580h();
            if (h >= 0) {
                mo2818a(view, i);
                return;
            }
            this.f2116b = i;
            if (this.f2118d) {
                int b = (this.f2115a.mo3569b() - h) - this.f2115a.mo3567a(view);
                this.f2117c = this.f2115a.mo3569b() - b;
                if (b > 0) {
                    int b2 = this.f2117c - this.f2115a.mo3570b(view);
                    int f = this.f2115a.mo3577f();
                    int min = b2 - (f + Math.min(this.f2115a.mo3574d(view) - f, 0));
                    if (min < 0) {
                        this.f2117c += Math.min(b, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d = this.f2115a.mo3574d(view);
            int f2 = d - this.f2115a.mo3577f();
            this.f2117c = d;
            if (f2 > 0) {
                int b3 = (this.f2115a.mo3569b() - Math.min(0, (this.f2115a.mo3569b() - h) - this.f2115a.mo3567a(view))) - (d + this.f2115a.mo3570b(view));
                if (b3 < 0) {
                    this.f2117c -= Math.min(f2, -b3);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2116b + ", mCoordinate=" + this.f2117c + ", mLayoutFromEnd=" + this.f2118d + ", mValid=" + this.f2119e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0513b {

        /* renamed from: a */
        public int f2120a;

        /* renamed from: b */
        public boolean f2121b;

        /* renamed from: c */
        public boolean f2122c;

        /* renamed from: d */
        public boolean f2123d;

        protected C0513b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2823a() {
            this.f2120a = 0;
            this.f2121b = false;
            this.f2122c = false;
            this.f2123d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0514c {

        /* renamed from: a */
        boolean f2124a = true;

        /* renamed from: b */
        int f2125b;

        /* renamed from: c */
        int f2126c;

        /* renamed from: d */
        int f2127d;

        /* renamed from: e */
        int f2128e;

        /* renamed from: f */
        int f2129f;

        /* renamed from: g */
        int f2130g;

        /* renamed from: h */
        int f2131h = 0;

        /* renamed from: i */
        int f2132i = 0;

        /* renamed from: j */
        boolean f2133j;

        /* renamed from: k */
        int f2134k;

        /* renamed from: l */
        List<RecyclerView.C0524d0> f2135l = null;

        /* renamed from: m */
        boolean f2136m;

        C0514c() {
        }

        /* renamed from: b */
        private View m2649b() {
            int size = this.f2135l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2135l.get(i).f2168f;
                RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
                if (!pVar.mo3281p() && this.f2127d == pVar.mo3279n()) {
                    mo2826a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo2824a(RecyclerView.C0550v vVar) {
            if (this.f2135l != null) {
                return m2649b();
            }
            View d = vVar.mo3326d(this.f2127d);
            this.f2127d += this.f2128e;
            return d;
        }

        /* renamed from: a */
        public void mo2825a() {
            mo2826a((View) null);
        }

        /* renamed from: a */
        public void mo2826a(View view) {
            View b = mo2828b(view);
            this.f2127d = b == null ? -1 : ((RecyclerView.C0543p) b.getLayoutParams()).mo3279n();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2827a(RecyclerView.C0518a0 a0Var) {
            int i = this.f2127d;
            return i >= 0 && i < a0Var.mo3025a();
        }

        /* renamed from: b */
        public View mo2828b(View view) {
            int n;
            int size = this.f2135l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2135l.get(i2).f2168f;
                RecyclerView.C0543p pVar = (RecyclerView.C0543p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo3281p() && (n = (pVar.mo3279n() - this.f2127d) * this.f2128e) >= 0 && n < i) {
                    view2 = view3;
                    if (n == 0) {
                        break;
                    }
                    i = n;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0515d implements Parcelable {
        public static final Parcelable.Creator<C0515d> CREATOR = new C0516a();

        /* renamed from: f */
        int f2137f;

        /* renamed from: g */
        int f2138g;

        /* renamed from: h */
        boolean f2139h;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C0516a implements Parcelable.Creator<C0515d> {
            C0516a() {
            }

            public C0515d createFromParcel(Parcel parcel) {
                return new C0515d(parcel);
            }

            public C0515d[] newArray(int i) {
                return new C0515d[i];
            }
        }

        public C0515d() {
        }

        C0515d(Parcel parcel) {
            this.f2137f = parcel.readInt();
            this.f2138g = parcel.readInt();
            this.f2139h = parcel.readInt() != 1 ? false : true;
        }

        public C0515d(C0515d dVar) {
            this.f2137f = dVar.f2137f;
            this.f2138g = dVar.f2138g;
            this.f2139h = dVar.f2139h;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo2830q() {
            return this.f2137f >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2831r() {
            this.f2137f = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2137f);
            parcel.writeInt(this.f2138g);
            parcel.writeInt(this.f2139h ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2112x = 1;
        this.f2100B = false;
        this.f2101C = false;
        this.f2102D = false;
        this.f2103E = true;
        this.f2104F = -1;
        this.f2105G = RecyclerView.UNDEFINED_DURATION;
        this.f2107I = null;
        this.f2108J = new C0512a();
        this.f2109K = new C0513b();
        this.f2110L = 2;
        this.f2111M = new int[2];
        mo2814m(i);
        mo2803b(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2112x = 1;
        this.f2100B = false;
        this.f2101C = false;
        this.f2102D = false;
        this.f2103E = true;
        this.f2104F = -1;
        this.f2105G = RecyclerView.UNDEFINED_DURATION;
        this.f2107I = null;
        this.f2108J = new C0512a();
        this.f2109K = new C0513b();
        this.f2110L = 2;
        this.f2111M = new int[2];
        RecyclerView.C0538o.C0542d a = RecyclerView.C0538o.m2809a(context, attributeSet, i, i2);
        mo2814m(a.f2219a);
        mo2803b(a.f2221c);
        mo2761c(a.f2222d);
    }

    /* renamed from: N */
    private View mo2740N() {
        return mo2810e(0, mo3231f());
    }

    /* renamed from: O */
    private View m2561O() {
        return mo2810e(mo3231f() - 1, -1);
    }

    /* renamed from: P */
    private View m2562P() {
        return this.f2101C ? mo2740N() : m2561O();
    }

    /* renamed from: Q */
    private View m2563Q() {
        return this.f2101C ? m2561O() : mo2740N();
    }

    /* renamed from: R */
    private View m2564R() {
        return mo3233f(this.f2101C ? 0 : mo3231f() - 1);
    }

    /* renamed from: S */
    private View m2565S() {
        return mo3233f(this.f2101C ? mo3231f() - 1 : 0);
    }

    /* renamed from: T */
    private void m2566T() {
        this.f2101C = (this.f2112x == 1 || !mo2787K()) ? this.f2100B : !this.f2100B;
    }

    /* renamed from: a */
    private int m2567a(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int b;
        int b2 = this.f2114z.mo3569b() - i;
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -mo2805c(-b2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (b = this.f2114z.mo3569b() - i3) <= 0) {
            return i2;
        }
        this.f2114z.mo3568a(b);
        return b + i2;
    }

    /* renamed from: a */
    private void m2568a(int i, int i2, boolean z, RecyclerView.C0518a0 a0Var) {
        int i3;
        this.f2113y.f2136m = mo2789M();
        this.f2113y.f2129f = i;
        int[] iArr = this.f2111M;
        boolean z2 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2798a(a0Var, iArr);
        int max = Math.max(0, this.f2111M[0]);
        int max2 = Math.max(0, this.f2111M[1]);
        if (i == 1) {
            z2 = true;
        }
        this.f2113y.f2131h = z2 ? max2 : max;
        C0514c cVar = this.f2113y;
        if (!z2) {
            max = max2;
        }
        cVar.f2132i = max;
        int i4 = -1;
        if (z2) {
            this.f2113y.f2131h += this.f2114z.mo3571c();
            View R = m2564R();
            C0514c cVar2 = this.f2113y;
            if (!this.f2101C) {
                i4 = 1;
            }
            cVar2.f2128e = i4;
            C0514c cVar3 = this.f2113y;
            int m = mo3258m(R);
            C0514c cVar4 = this.f2113y;
            cVar3.f2127d = m + cVar4.f2128e;
            cVar4.f2125b = this.f2114z.mo3567a(R);
            i3 = this.f2114z.mo3567a(R) - this.f2114z.mo3569b();
        } else {
            View S = m2565S();
            this.f2113y.f2131h += this.f2114z.mo3577f();
            C0514c cVar5 = this.f2113y;
            if (this.f2101C) {
                i4 = 1;
            }
            cVar5.f2128e = i4;
            C0514c cVar6 = this.f2113y;
            int m2 = mo3258m(S);
            C0514c cVar7 = this.f2113y;
            cVar6.f2127d = m2 + cVar7.f2128e;
            cVar7.f2125b = this.f2114z.mo3574d(S);
            i3 = (-this.f2114z.mo3574d(S)) + this.f2114z.mo3577f();
        }
        C0514c cVar8 = this.f2113y;
        cVar8.f2126c = i2;
        if (z) {
            cVar8.f2126c -= i3;
        }
        this.f2113y.f2130g = i3;
    }

    /* renamed from: a */
    private void m2569a(C0512a aVar) {
        mo2766f(aVar.f2116b, aVar.f2117c);
    }

    /* renamed from: a */
    private void m2570a(RecyclerView.C0550v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo3177a(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo3177a(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m2571a(RecyclerView.C0550v vVar, C0514c cVar) {
        if (cVar.f2124a && !cVar.f2136m) {
            int i = cVar.f2130g;
            int i2 = cVar.f2132i;
            if (cVar.f2129f == -1) {
                m2576b(vVar, i, i2);
            } else {
                m2579c(vVar, i, i2);
            }
        }
    }

    /* renamed from: a */
    private boolean m2572a(RecyclerView.C0518a0 a0Var, C0512a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo3030d() && (i = this.f2104F) != -1) {
            if (i < 0 || i >= a0Var.mo3025a()) {
                this.f2104F = -1;
                this.f2105G = RecyclerView.UNDEFINED_DURATION;
            } else {
                aVar.f2116b = this.f2104F;
                C0515d dVar = this.f2107I;
                if (dVar != null && dVar.mo2830q()) {
                    aVar.f2118d = this.f2107I.f2139h;
                    aVar.f2117c = aVar.f2118d ? this.f2114z.mo3569b() - this.f2107I.f2138g : this.f2114z.mo3577f() + this.f2107I.f2138g;
                    return true;
                } else if (this.f2105G == Integer.MIN_VALUE) {
                    View e = mo2809e(this.f2104F);
                    if (e == null) {
                        if (mo3231f() > 0) {
                            if ((this.f2104F < mo3258m(mo3233f(0))) == this.f2101C) {
                                z = true;
                            }
                            aVar.f2118d = z;
                        }
                        aVar.mo2817a();
                    } else if (this.f2114z.mo3570b(e) > this.f2114z.mo3579g()) {
                        aVar.mo2817a();
                        return true;
                    } else if (this.f2114z.mo3574d(e) - this.f2114z.mo3577f() < 0) {
                        aVar.f2117c = this.f2114z.mo3577f();
                        aVar.f2118d = false;
                        return true;
                    } else if (this.f2114z.mo3569b() - this.f2114z.mo3567a(e) < 0) {
                        aVar.f2117c = this.f2114z.mo3569b();
                        aVar.f2118d = true;
                        return true;
                    } else {
                        aVar.f2117c = aVar.f2118d ? this.f2114z.mo3567a(e) + this.f2114z.mo3580h() : this.f2114z.mo3574d(e);
                    }
                    return true;
                } else {
                    boolean z2 = this.f2101C;
                    aVar.f2118d = z2;
                    aVar.f2117c = z2 ? this.f2114z.mo3569b() - this.f2105G : this.f2114z.mo3577f() + this.f2105G;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2573a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, C0512a aVar) {
        boolean z = false;
        if (mo3231f() == 0) {
            return false;
        }
        View h = mo3245h();
        if (h != null && aVar.mo2819a(h, a0Var)) {
            aVar.mo2821b(h, mo3258m(h));
            return true;
        } else if (this.f2099A != this.f2102D) {
            return false;
        } else {
            View h2 = aVar.f2118d ? m2584h(vVar, a0Var) : m2586i(vVar, a0Var);
            if (h2 == null) {
                return false;
            }
            aVar.mo2818a(h2, mo3258m(h2));
            if (!a0Var.mo3030d() && mo2739C()) {
                if (this.f2114z.mo3574d(h2) >= this.f2114z.mo3569b() || this.f2114z.mo3567a(h2) < this.f2114z.mo3577f()) {
                    z = true;
                }
                if (z) {
                    aVar.f2117c = aVar.f2118d ? this.f2114z.mo3569b() : this.f2114z.mo3577f();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private int m2574b(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int f;
        int f2 = i - this.f2114z.mo3577f();
        if (f2 <= 0) {
            return 0;
        }
        int i2 = -mo2805c(f2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (f = i3 - this.f2114z.mo3577f()) <= 0) {
            return i2;
        }
        this.f2114z.mo3568a(-f);
        return i2 - f;
    }

    /* renamed from: b */
    private void m2575b(C0512a aVar) {
        m2583g(aVar.f2116b, aVar.f2117c);
    }

    /* renamed from: b */
    private void m2576b(RecyclerView.C0550v vVar, int i, int i2) {
        int f = mo3231f();
        if (i >= 0) {
            int a = (this.f2114z.mo3566a() - i) + i2;
            if (this.f2101C) {
                for (int i3 = 0; i3 < f; i3++) {
                    View f2 = mo3233f(i3);
                    if (this.f2114z.mo3574d(f2) < a || this.f2114z.mo3578f(f2) < a) {
                        m2570a(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = f - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View f3 = mo3233f(i5);
                if (this.f2114z.mo3574d(f3) < a || this.f2114z.mo3578f(f3) < a) {
                    m2570a(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m2577b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, int i, int i2) {
        RecyclerView.C0550v vVar2 = vVar;
        RecyclerView.C0518a0 a0Var2 = a0Var;
        if (a0Var.mo3031e() && mo3231f() != 0 && !a0Var.mo3030d() && mo2739C()) {
            List<RecyclerView.C0524d0> f = vVar.mo3331f();
            int size = f.size();
            int m = mo3258m(mo3233f(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C0524d0 d0Var = f.get(i5);
                if (!d0Var.mo3072q()) {
                    char c = 1;
                    if ((d0Var.mo3064i() < m) != this.f2101C) {
                        c = 65535;
                    }
                    int b = this.f2114z.mo3570b(d0Var.f2168f);
                    if (c == 65535) {
                        i3 += b;
                    } else {
                        i4 += b;
                    }
                }
            }
            this.f2113y.f2135l = f;
            if (i3 > 0) {
                m2583g(mo3258m(m2565S()), i);
                C0514c cVar = this.f2113y;
                cVar.f2131h = i3;
                cVar.f2126c = 0;
                cVar.mo2825a();
                mo2791a(vVar2, this.f2113y, a0Var2, false);
            }
            if (i4 > 0) {
                mo2766f(mo3258m(m2564R()), i2);
                C0514c cVar2 = this.f2113y;
                cVar2.f2131h = i4;
                cVar2.f2126c = 0;
                cVar2.mo2825a();
                mo2791a(vVar2, this.f2113y, a0Var2, false);
            }
            this.f2113y.f2135l = null;
        }
    }

    /* renamed from: b */
    private void m2578b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, C0512a aVar) {
        if (!m2572a(a0Var, aVar) && !m2573a(vVar, a0Var, aVar)) {
            aVar.mo2817a();
            aVar.f2116b = this.f2102D ? a0Var.mo3025a() - 1 : 0;
        }
    }

    /* renamed from: c */
    private void m2579c(RecyclerView.C0550v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int f = mo3231f();
            if (this.f2101C) {
                int i4 = f - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View f2 = mo3233f(i5);
                    if (this.f2114z.mo3567a(f2) > i3 || this.f2114z.mo3576e(f2) > i3) {
                        m2570a(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < f; i6++) {
                View f3 = mo3233f(i6);
                if (this.f2114z.mo3567a(f3) > i3 || this.f2114z.mo3576e(f3) > i3) {
                    m2570a(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private View m2580f(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return mo2744a(vVar, a0Var, 0, mo3231f(), a0Var.mo3025a());
    }

    /* renamed from: f */
    private void mo2766f(int i, int i2) {
        this.f2113y.f2126c = this.f2114z.mo3569b() - i2;
        this.f2113y.f2128e = this.f2101C ? -1 : 1;
        C0514c cVar = this.f2113y;
        cVar.f2127d = i;
        cVar.f2129f = 1;
        cVar.f2125b = i2;
        cVar.f2130g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: g */
    private View m2582g(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return mo2744a(vVar, a0Var, mo3231f() - 1, -1, a0Var.mo3025a());
    }

    /* renamed from: g */
    private void m2583g(int i, int i2) {
        this.f2113y.f2126c = i2 - this.f2114z.mo3577f();
        C0514c cVar = this.f2113y;
        cVar.f2127d = i;
        cVar.f2128e = this.f2101C ? 1 : -1;
        C0514c cVar2 = this.f2113y;
        cVar2.f2129f = -1;
        cVar2.f2125b = i2;
        cVar2.f2130g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: h */
    private View m2584h(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return this.f2101C ? m2580f(vVar, a0Var) : m2582g(vVar, a0Var);
    }

    /* renamed from: i */
    private int m2585i(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        mo2781E();
        C0609o oVar = this.f2114z;
        View b = mo2801b(!this.f2103E, true);
        return C0614q.m3453a(a0Var, oVar, b, mo2793a(!this.f2103E, true), this, this.f2103E);
    }

    /* renamed from: i */
    private View m2586i(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return this.f2101C ? m2582g(vVar, a0Var) : m2580f(vVar, a0Var);
    }

    /* renamed from: j */
    private int m2587j(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        mo2781E();
        C0609o oVar = this.f2114z;
        View b = mo2801b(!this.f2103E, true);
        return C0614q.m3454a(a0Var, oVar, b, mo2793a(!this.f2103E, true), this, this.f2103E, this.f2101C);
    }

    /* renamed from: k */
    private int m2588k(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        mo2781E();
        C0609o oVar = this.f2114z;
        View b = mo2801b(!this.f2103E, true);
        return C0614q.m3455b(a0Var, oVar, b, mo2793a(!this.f2103E, true), this, this.f2103E);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo2779A() {
        return (mo3250j() == 1073741824 || mo3263p() == 1073741824 || !mo3265q()) ? false : true;
    }

    /* renamed from: C */
    public boolean mo2739C() {
        return this.f2107I == null && this.f2099A == this.f2102D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C0514c mo2780D() {
        return new C0514c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo2781E() {
        if (this.f2113y == null) {
            this.f2113y = mo2780D();
        }
    }

    /* renamed from: F */
    public int mo2782F() {
        View a = mo2792a(0, mo3231f(), true, false);
        if (a == null) {
            return -1;
        }
        return mo3258m(a);
    }

    /* renamed from: G */
    public int mo2783G() {
        View a = mo2792a(0, mo3231f(), false, true);
        if (a == null) {
            return -1;
        }
        return mo3258m(a);
    }

    /* renamed from: H */
    public int mo2784H() {
        View a = mo2792a(mo3231f() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return mo3258m(a);
    }

    /* renamed from: I */
    public int mo2785I() {
        View a = mo2792a(mo3231f() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo3258m(a);
    }

    /* renamed from: J */
    public int mo2786J() {
        return this.f2112x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo2787K() {
        return mo3255l() == 1;
    }

    /* renamed from: L */
    public boolean mo2788L() {
        return this.f2103E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo2789M() {
        return this.f2114z.mo3573d() == 0 && this.f2114z.mo3566a() == 0;
    }

    /* renamed from: a */
    public int mo2741a(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (this.f2112x == 1) {
            return 0;
        }
        return mo2805c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo2790a(RecyclerView.C0518a0 a0Var) {
        return m2585i(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2791a(RecyclerView.C0550v vVar, C0514c cVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int i = cVar.f2126c;
        int i2 = cVar.f2130g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2130g = i2 + i;
            }
            m2571a(vVar, cVar);
        }
        int i3 = cVar.f2126c + cVar.f2131h;
        C0513b bVar = this.f2109K;
        while (true) {
            if ((!cVar.f2136m && i3 <= 0) || !cVar.mo2827a(a0Var)) {
                break;
            }
            bVar.mo2823a();
            mo2751a(vVar, a0Var, cVar, bVar);
            if (!bVar.f2121b) {
                cVar.f2125b += bVar.f2120a * cVar.f2129f;
                if (!bVar.f2122c || cVar.f2135l != null || !a0Var.mo3030d()) {
                    int i4 = cVar.f2126c;
                    int i5 = bVar.f2120a;
                    cVar.f2126c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2130g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f2130g = i6 + bVar.f2120a;
                    int i7 = cVar.f2126c;
                    if (i7 < 0) {
                        cVar.f2130g += i7;
                    }
                    m2571a(vVar, cVar);
                }
                if (z && bVar.f2123d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2126c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo2792a(int i, int i2, boolean z, boolean z2) {
        mo2781E();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f2112x == 0 ? this.f2203j : this.f2204k).mo3605a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo2743a(View view, int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        int l;
        m2566T();
        if (mo3231f() == 0 || (l = mo2813l(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo2781E();
        m2568a(l, (int) (((float) this.f2114z.mo3579g()) * 0.33333334f), false, a0Var);
        C0514c cVar = this.f2113y;
        cVar.f2130g = RecyclerView.UNDEFINED_DURATION;
        cVar.f2124a = false;
        mo2791a(vVar, cVar, a0Var, true);
        View Q = l == -1 ? m2563Q() : m2562P();
        View S = l == -1 ? m2565S() : m2564R();
        if (!S.hasFocusable()) {
            return Q;
        }
        if (Q == null) {
            return null;
        }
        return S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo2744a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, int i, int i2, int i3) {
        mo2781E();
        int f = this.f2114z.mo3577f();
        int b = this.f2114z.mo3569b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View f2 = mo3233f(i);
            int m = mo3258m(f2);
            if (m >= 0 && m < i3) {
                if (((RecyclerView.C0543p) f2.getLayoutParams()).mo3281p()) {
                    if (view2 == null) {
                        view2 = f2;
                    }
                } else if (this.f2114z.mo3574d(f2) < b && this.f2114z.mo3567a(f2) >= f) {
                    return f2;
                } else {
                    if (view == null) {
                        view = f2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo2793a(boolean z, boolean z2) {
        int f;
        int i;
        if (this.f2101C) {
            f = 0;
            i = mo3231f();
        } else {
            f = mo3231f() - 1;
            i = -1;
        }
        return mo2792a(f, i, z, z2);
    }

    /* renamed from: a */
    public void mo2794a(int i, int i2, RecyclerView.C0518a0 a0Var, RecyclerView.C0538o.C0541c cVar) {
        if (this.f2112x != 0) {
            i = i2;
        }
        if (mo3231f() != 0 && i != 0) {
            mo2781E();
            m2568a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo2748a(a0Var, this.f2113y, cVar);
        }
    }

    /* renamed from: a */
    public void mo2795a(int i, RecyclerView.C0538o.C0541c cVar) {
        boolean z;
        int i2;
        C0515d dVar = this.f2107I;
        int i3 = -1;
        if (dVar == null || !dVar.mo2830q()) {
            m2566T();
            z = this.f2101C;
            i2 = this.f2104F;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0515d dVar2 = this.f2107I;
            z = dVar2.f2139h;
            i2 = dVar2.f2137f;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.f2110L && i4 >= 0 && i4 < i; i5++) {
            cVar.mo3278a(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo2796a(Parcelable parcelable) {
        if (parcelable instanceof C0515d) {
            this.f2107I = (C0515d) parcelable;
            mo3271y();
        }
    }

    /* renamed from: a */
    public void mo2797a(AccessibilityEvent accessibilityEvent) {
        super.mo2797a(accessibilityEvent);
        if (mo3231f() > 0) {
            accessibilityEvent.setFromIndex(mo2783G());
            accessibilityEvent.setToIndex(mo2785I());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2748a(RecyclerView.C0518a0 a0Var, C0514c cVar, RecyclerView.C0538o.C0541c cVar2) {
        int i = cVar.f2127d;
        if (i >= 0 && i < a0Var.mo3025a()) {
            cVar2.mo3278a(i, Math.max(0, cVar.f2130g));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2798a(RecyclerView.C0518a0 a0Var, int[] iArr) {
        int i;
        int h = mo2811h(a0Var);
        if (this.f2113y.f2129f == -1) {
            i = 0;
        } else {
            i = h;
            h = 0;
        }
        iArr[0] = h;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2750a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, C0512a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2751a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, C0514c cVar, C0513b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo2824a(vVar);
        if (a == null) {
            bVar.f2121b = true;
            return;
        }
        RecyclerView.C0543p pVar = (RecyclerView.C0543p) a.getLayoutParams();
        if (cVar.f2135l == null) {
            if (this.f2101C == (cVar.f2129f == -1)) {
                mo3218c(a);
            } else {
                mo3209b(a, 0);
            }
        } else {
            if (this.f2101C == (cVar.f2129f == -1)) {
                mo3208b(a);
            } else {
                mo3178a(a, 0);
            }
        }
        mo3210b(a, 0, 0);
        bVar.f2120a = this.f2114z.mo3570b(a);
        if (this.f2112x == 1) {
            if (mo2787K()) {
                i5 = mo3261o() - getPaddingRight();
                i4 = i5 - this.f2114z.mo3572c(a);
            } else {
                i4 = getPaddingLeft();
                i5 = this.f2114z.mo3572c(a) + i4;
            }
            int i6 = cVar.f2129f;
            int i7 = cVar.f2125b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f2120a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f2120a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int c = this.f2114z.mo3572c(a) + paddingTop;
            int i8 = cVar.f2129f;
            int i9 = cVar.f2125b;
            if (i8 == -1) {
                i2 = i9;
                i3 = paddingTop;
                i = c;
                i4 = i9 - bVar.f2120a;
            } else {
                i3 = paddingTop;
                i2 = bVar.f2120a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo3179a(a, i4, i3, i2, i);
        if (pVar.mo3281p() || pVar.mo3280o()) {
            bVar.f2122c = true;
        }
        bVar.f2123d = a.hasFocusable();
    }

    /* renamed from: a */
    public void mo2799a(RecyclerView recyclerView, RecyclerView.C0518a0 a0Var, int i) {
        C0604k kVar = new C0604k(recyclerView.getContext());
        kVar.mo3355c(i);
        mo3213b((RecyclerView.C0555z) kVar);
    }

    /* renamed from: a */
    public void mo2800a(String str) {
        if (this.f2107I == null) {
            super.mo2800a(str);
        }
    }

    /* renamed from: b */
    public int mo2756b(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (this.f2112x == 0) {
            return 0;
        }
        return mo2805c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo2757b(RecyclerView.C0518a0 a0Var) {
        return m2587j(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo2801b(boolean z, boolean z2) {
        int i;
        int f;
        if (this.f2101C) {
            i = mo3231f() - 1;
            f = -1;
        } else {
            i = 0;
            f = mo3231f();
        }
        return mo2792a(i, f, z, z2);
    }

    /* renamed from: b */
    public void mo2802b(RecyclerView recyclerView, RecyclerView.C0550v vVar) {
        super.mo2802b(recyclerView, vVar);
        if (this.f2106H) {
            mo3212b(vVar);
            vVar.mo3306a();
        }
    }

    /* renamed from: b */
    public void mo2803b(boolean z) {
        mo2800a((String) null);
        if (z != this.f2100B) {
            this.f2100B = z;
            mo3271y();
        }
    }

    /* renamed from: b */
    public boolean mo2804b() {
        return this.f2112x == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo2805c(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0 || i == 0) {
            return 0;
        }
        mo2781E();
        this.f2113y.f2124a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m2568a(i2, abs, true, a0Var);
        C0514c cVar = this.f2113y;
        int a = cVar.f2130g + mo2791a(vVar, cVar, a0Var, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2114z.mo3568a(-i);
        this.f2113y.f2134k = i;
        return i;
    }

    /* renamed from: c */
    public int mo2760c(RecyclerView.C0518a0 a0Var) {
        return m2588k(a0Var);
    }

    /* renamed from: c */
    public PointF mo2806c(int i) {
        if (mo3231f() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo3258m(mo3233f(0))) {
            z = true;
        }
        if (z != this.f2101C) {
            i2 = -1;
        }
        return this.f2112x == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: c */
    public void mo2761c(boolean z) {
        mo2800a((String) null);
        if (this.f2102D != z) {
            this.f2102D = z;
            mo3271y();
        }
    }

    /* renamed from: c */
    public boolean mo2807c() {
        return this.f2112x == 1;
    }

    /* renamed from: d */
    public int mo2808d(RecyclerView.C0518a0 a0Var) {
        return m2585i(a0Var);
    }

    /* renamed from: d */
    public RecyclerView.C0543p mo2762d() {
        return new RecyclerView.C0543p(-2, -2);
    }

    /* renamed from: e */
    public int mo2764e(RecyclerView.C0518a0 a0Var) {
        return m2587j(a0Var);
    }

    /* renamed from: e */
    public View mo2809e(int i) {
        int f = mo3231f();
        if (f == 0) {
            return null;
        }
        int m = i - mo3258m(mo3233f(0));
        if (m >= 0 && m < f) {
            View f2 = mo3233f(m);
            if (mo3258m(f2) == i) {
                return f2;
            }
        }
        return super.mo2809e(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo2810e(int i, int i2) {
        int i3;
        int i4;
        mo2781E();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo3233f(i);
        }
        if (this.f2114z.mo3574d(mo3233f(i)) < this.f2114z.mo3577f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f2112x == 0 ? this.f2203j : this.f2204k).mo3605a(i, i2, i4, i3);
    }

    /* renamed from: e */
    public void mo2765e(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View e;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f2107I == null && this.f2104F == -1) && a0Var.mo3025a() == 0) {
            mo3212b(vVar);
            return;
        }
        C0515d dVar = this.f2107I;
        if (dVar != null && dVar.mo2830q()) {
            this.f2104F = this.f2107I.f2137f;
        }
        mo2781E();
        this.f2113y.f2124a = false;
        m2566T();
        View h = mo3245h();
        if (!this.f2108J.f2119e || this.f2104F != -1 || this.f2107I != null) {
            this.f2108J.mo2820b();
            C0512a aVar = this.f2108J;
            aVar.f2118d = this.f2101C ^ this.f2102D;
            m2578b(vVar, a0Var, aVar);
            this.f2108J.f2119e = true;
        } else if (h != null && (this.f2114z.mo3574d(h) >= this.f2114z.mo3569b() || this.f2114z.mo3567a(h) <= this.f2114z.mo3577f())) {
            this.f2108J.mo2821b(h, mo3258m(h));
        }
        C0514c cVar = this.f2113y;
        cVar.f2129f = cVar.f2134k >= 0 ? 1 : -1;
        int[] iArr = this.f2111M;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2798a(a0Var, iArr);
        int max = Math.max(0, this.f2111M[0]) + this.f2114z.mo3577f();
        int max2 = Math.max(0, this.f2111M[1]) + this.f2114z.mo3571c();
        if (!(!a0Var.mo3030d() || (i6 = this.f2104F) == -1 || this.f2105G == Integer.MIN_VALUE || (e = mo2809e(i6)) == null)) {
            if (this.f2101C) {
                i7 = this.f2114z.mo3569b() - this.f2114z.mo3567a(e);
                i8 = this.f2105G;
            } else {
                i8 = this.f2114z.mo3574d(e) - this.f2114z.mo3577f();
                i7 = this.f2105G;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.f2108J.f2118d ? !this.f2101C : this.f2101C) {
            i9 = 1;
        }
        mo2750a(vVar, a0Var, this.f2108J, i9);
        mo3186a(vVar);
        this.f2113y.f2136m = mo2789M();
        this.f2113y.f2133j = a0Var.mo3030d();
        this.f2113y.f2132i = 0;
        C0512a aVar2 = this.f2108J;
        if (aVar2.f2118d) {
            m2575b(aVar2);
            C0514c cVar2 = this.f2113y;
            cVar2.f2131h = max;
            mo2791a(vVar, cVar2, a0Var, false);
            C0514c cVar3 = this.f2113y;
            i2 = cVar3.f2125b;
            int i11 = cVar3.f2127d;
            int i12 = cVar3.f2126c;
            if (i12 > 0) {
                max2 += i12;
            }
            m2569a(this.f2108J);
            C0514c cVar4 = this.f2113y;
            cVar4.f2131h = max2;
            cVar4.f2127d += cVar4.f2128e;
            mo2791a(vVar, cVar4, a0Var, false);
            C0514c cVar5 = this.f2113y;
            i = cVar5.f2125b;
            int i13 = cVar5.f2126c;
            if (i13 > 0) {
                m2583g(i11, i2);
                C0514c cVar6 = this.f2113y;
                cVar6.f2131h = i13;
                mo2791a(vVar, cVar6, a0Var, false);
                i2 = this.f2113y.f2125b;
            }
        } else {
            m2569a(aVar2);
            C0514c cVar7 = this.f2113y;
            cVar7.f2131h = max2;
            mo2791a(vVar, cVar7, a0Var, false);
            C0514c cVar8 = this.f2113y;
            i = cVar8.f2125b;
            int i14 = cVar8.f2127d;
            int i15 = cVar8.f2126c;
            if (i15 > 0) {
                max += i15;
            }
            m2575b(this.f2108J);
            C0514c cVar9 = this.f2113y;
            cVar9.f2131h = max;
            cVar9.f2127d += cVar9.f2128e;
            mo2791a(vVar, cVar9, a0Var, false);
            C0514c cVar10 = this.f2113y;
            i2 = cVar10.f2125b;
            int i16 = cVar10.f2126c;
            if (i16 > 0) {
                mo2766f(i14, i);
                C0514c cVar11 = this.f2113y;
                cVar11.f2131h = i16;
                mo2791a(vVar, cVar11, a0Var, false);
                i = this.f2113y.f2125b;
            }
        }
        if (mo3231f() > 0) {
            if (this.f2101C ^ this.f2102D) {
                int a = m2567a(i, vVar, a0Var, true);
                i4 = i2 + a;
                i3 = i + a;
                i5 = m2574b(i4, vVar, a0Var, false);
            } else {
                int b = m2574b(i2, vVar, a0Var, true);
                i4 = i2 + b;
                i3 = i + b;
                i5 = m2567a(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m2577b(vVar, a0Var, i2, i);
        if (!a0Var.mo3030d()) {
            this.f2114z.mo3581i();
        } else {
            this.f2108J.mo2820b();
        }
        this.f2099A = this.f2102D;
    }

    /* renamed from: f */
    public int mo2767f(RecyclerView.C0518a0 a0Var) {
        return m2588k(a0Var);
    }

    /* renamed from: g */
    public void mo2768g(RecyclerView.C0518a0 a0Var) {
        super.mo2768g(a0Var);
        this.f2107I = null;
        this.f2104F = -1;
        this.f2105G = RecyclerView.UNDEFINED_DURATION;
        this.f2108J.mo2820b();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: h */
    public int mo2811h(RecyclerView.C0518a0 a0Var) {
        if (a0Var.mo3029c()) {
            return this.f2114z.mo3579g();
        }
        return 0;
    }

    /* renamed from: k */
    public void mo2812k(int i) {
        this.f2104F = i;
        this.f2105G = RecyclerView.UNDEFINED_DURATION;
        C0515d dVar = this.f2107I;
        if (dVar != null) {
            dVar.mo2831r();
        }
        mo3271y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2813l(int i) {
        if (i == 1) {
            return (this.f2112x != 1 && mo2787K()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2112x != 1 && mo2787K()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.f2112x == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f2112x == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f2112x == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f2112x == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: m */
    public void mo2814m(int i) {
        if (i == 0 || i == 1) {
            mo2800a((String) null);
            if (i != this.f2112x || this.f2114z == null) {
                this.f2114z = C0609o.m3400a(this, i);
                this.f2108J.f2115a = this.f2114z;
                this.f2112x = i;
                mo3271y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: s */
    public boolean mo2815s() {
        return true;
    }

    /* renamed from: w */
    public Parcelable mo2816w() {
        C0515d dVar = this.f2107I;
        if (dVar != null) {
            return new C0515d(dVar);
        }
        C0515d dVar2 = new C0515d();
        if (mo3231f() > 0) {
            mo2781E();
            boolean z = this.f2099A ^ this.f2101C;
            dVar2.f2139h = z;
            if (z) {
                View R = m2564R();
                dVar2.f2138g = this.f2114z.mo3569b() - this.f2114z.mo3567a(R);
                dVar2.f2137f = mo3258m(R);
            } else {
                View S = m2565S();
                dVar2.f2137f = mo3258m(S);
                dVar2.f2138g = this.f2114z.mo3574d(S) - this.f2114z.mo3577f();
            }
        } else {
            dVar2.mo2831r();
        }
        return dVar2;
    }
}
