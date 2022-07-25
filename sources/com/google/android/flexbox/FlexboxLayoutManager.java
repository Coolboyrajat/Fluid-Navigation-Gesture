package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.C0604k;
import androidx.recyclerview.widget.C0609o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C2541d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.C0538o implements C2538a, RecyclerView.C0555z.C0557b {

    /* renamed from: X */
    private static final Rect f6431X = new Rect();

    /* renamed from: A */
    private int f6432A;

    /* renamed from: B */
    private int f6433B = -1;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f6434C;

    /* renamed from: D */
    private boolean f6435D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List<C2540c> f6436E = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C2541d f6437F = new C2541d(this);

    /* renamed from: G */
    private RecyclerView.C0550v f6438G;

    /* renamed from: H */
    private RecyclerView.C0518a0 f6439H;

    /* renamed from: I */
    private C2535d f6440I;

    /* renamed from: J */
    private C2532b f6441J = new C2532b();
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C0609o f6442K;

    /* renamed from: L */
    private C0609o f6443L;

    /* renamed from: M */
    private C2536e f6444M;

    /* renamed from: N */
    private int f6445N = -1;

    /* renamed from: O */
    private int f6446O = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: P */
    private int f6447P = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: Q */
    private int f6448Q = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: R */
    private boolean f6449R;

    /* renamed from: S */
    private SparseArray<View> f6450S = new SparseArray<>();

    /* renamed from: T */
    private final Context f6451T;

    /* renamed from: U */
    private View f6452U;

    /* renamed from: V */
    private int f6453V = -1;

    /* renamed from: W */
    private C2541d.C2543b f6454W = new C2541d.C2543b();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f6455x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f6456y;

    /* renamed from: z */
    private int f6457z;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    private class C2532b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f6458a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f6459b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f6460c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f6461d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f6462e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f6463f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f6464g;

        private C2532b() {
            this.f6461d = 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m9625a() {
            int i;
            if (FlexboxLayoutManager.this.mo7567a() || !FlexboxLayoutManager.this.f6434C) {
                if (!this.f6462e) {
                    i = FlexboxLayoutManager.this.f6442K.mo3577f();
                    this.f6460c = i;
                }
            } else if (!this.f6462e) {
                i = FlexboxLayoutManager.this.mo3261o() - FlexboxLayoutManager.this.f6442K.mo3577f();
                this.f6460c = i;
            }
            i = FlexboxLayoutManager.this.f6442K.mo3569b();
            this.f6460c = i;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m9626a(android.view.View r4) {
            /*
                r3 = this;
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                boolean r0 = r0.mo7567a()
                if (r0 != 0) goto L_0x002a
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                boolean r0 = r0.f6434C
                if (r0 == 0) goto L_0x002a
                boolean r0 = r3.f6462e
                if (r0 == 0) goto L_0x001f
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.o r0 = r0.f6442K
                int r0 = r0.mo3574d(r4)
                goto L_0x0038
            L_0x001f:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.o r0 = r0.f6442K
                int r0 = r0.mo3567a((android.view.View) r4)
                goto L_0x004e
            L_0x002a:
                boolean r0 = r3.f6462e
                if (r0 == 0) goto L_0x0044
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.o r0 = r0.f6442K
                int r0 = r0.mo3567a((android.view.View) r4)
            L_0x0038:
                com.google.android.flexbox.FlexboxLayoutManager r1 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.o r1 = r1.f6442K
                int r1 = r1.mo3580h()
                int r0 = r0 + r1
                goto L_0x004e
            L_0x0044:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.o r0 = r0.f6442K
                int r0 = r0.mo3574d(r4)
            L_0x004e:
                r3.f6460c = r0
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                int r4 = r0.mo3258m(r4)
                r3.f6458a = r4
                r4 = 0
                r3.f6464g = r4
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                com.google.android.flexbox.d r0 = r0.f6437F
                int[] r0 = r0.f6505c
                int r1 = r3.f6458a
                r2 = -1
                if (r1 == r2) goto L_0x0069
                goto L_0x006a
            L_0x0069:
                r1 = 0
            L_0x006a:
                r0 = r0[r1]
                if (r0 == r2) goto L_0x006f
                r4 = r0
            L_0x006f:
                r3.f6459b = r4
                com.google.android.flexbox.FlexboxLayoutManager r4 = com.google.android.flexbox.FlexboxLayoutManager.this
                java.util.List r4 = r4.f6436E
                int r4 = r4.size()
                int r0 = r3.f6459b
                if (r4 <= r0) goto L_0x0091
                com.google.android.flexbox.FlexboxLayoutManager r4 = com.google.android.flexbox.FlexboxLayoutManager.this
                java.util.List r4 = r4.f6436E
                int r0 = r3.f6459b
                java.lang.Object r4 = r4.get(r0)
                com.google.android.flexbox.c r4 = (com.google.android.flexbox.C2540c) r4
                int r4 = r4.f6501o
                r3.f6458a = r4
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.C2532b.m9626a(android.view.View):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m9631b() {
            this.f6458a = -1;
            this.f6459b = -1;
            this.f6460c = RecyclerView.UNDEFINED_DURATION;
            boolean z = false;
            this.f6463f = false;
            this.f6464g = false;
            if (!FlexboxLayoutManager.this.mo7567a() ? !(FlexboxLayoutManager.this.f6456y != 0 ? FlexboxLayoutManager.this.f6456y != 2 : FlexboxLayoutManager.this.f6455x != 3) : !(FlexboxLayoutManager.this.f6456y != 0 ? FlexboxLayoutManager.this.f6456y != 2 : FlexboxLayoutManager.this.f6455x != 1)) {
                z = true;
            }
            this.f6462e = z;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f6458a + ", mFlexLinePosition=" + this.f6459b + ", mCoordinate=" + this.f6460c + ", mPerpendicularCoordinate=" + this.f6461d + ", mLayoutFromEnd=" + this.f6462e + ", mValid=" + this.f6463f + ", mAssignedFromSavedState=" + this.f6464g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    public static class C2533c extends RecyclerView.C0543p implements C2539b {
        public static final Parcelable.Creator<C2533c> CREATOR = new C2534a();

        /* renamed from: j */
        private float f6466j = 0.0f;

        /* renamed from: k */
        private float f6467k = 1.0f;

        /* renamed from: l */
        private int f6468l = -1;

        /* renamed from: m */
        private float f6469m = -1.0f;

        /* renamed from: n */
        private int f6470n;

        /* renamed from: o */
        private int f6471o;

        /* renamed from: p */
        private int f6472p = 16777215;

        /* renamed from: q */
        private int f6473q = 16777215;

        /* renamed from: r */
        private boolean f6474r;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c$a */
        static class C2534a implements Parcelable.Creator<C2533c> {
            C2534a() {
            }

            public C2533c createFromParcel(Parcel parcel) {
                return new C2533c(parcel);
            }

            public C2533c[] newArray(int i) {
                return new C2533c[i];
            }
        }

        public C2533c(int i, int i2) {
            super(i, i2);
        }

        public C2533c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected C2533c(Parcel parcel) {
            super(-2, -2);
            this.f6466j = parcel.readFloat();
            this.f6467k = parcel.readFloat();
            this.f6468l = parcel.readInt();
            this.f6469m = parcel.readFloat();
            this.f6470n = parcel.readInt();
            this.f6471o = parcel.readInt();
            this.f6472p = parcel.readInt();
            this.f6473q = parcel.readInt();
            this.f6474r = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        /* renamed from: a */
        public int mo7606a() {
            return this.rightMargin;
        }

        /* renamed from: b */
        public int mo7607b() {
            return this.f6471o;
        }

        /* renamed from: c */
        public int mo7608c() {
            return this.f6470n;
        }

        /* renamed from: d */
        public boolean mo7609d() {
            return this.f6474r;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public float mo7611e() {
            return this.f6466j;
        }

        /* renamed from: f */
        public int mo7612f() {
            return this.f6473q;
        }

        /* renamed from: g */
        public int mo7613g() {
            return this.bottomMargin;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: h */
        public float mo7617h() {
            return this.f6469m;
        }

        /* renamed from: i */
        public int mo7618i() {
            return this.leftMargin;
        }

        /* renamed from: j */
        public int mo7619j() {
            return this.f6468l;
        }

        /* renamed from: k */
        public float mo7620k() {
            return this.f6467k;
        }

        /* renamed from: l */
        public int mo7621l() {
            return this.f6472p;
        }

        /* renamed from: m */
        public int mo7622m() {
            return this.topMargin;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f6466j);
            parcel.writeFloat(this.f6467k);
            parcel.writeInt(this.f6468l);
            parcel.writeFloat(this.f6469m);
            parcel.writeInt(this.f6470n);
            parcel.writeInt(this.f6471o);
            parcel.writeInt(this.f6472p);
            parcel.writeInt(this.f6473q);
            parcel.writeByte(this.f6474r ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d */
    private static class C2535d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f6475a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f6476b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f6477c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f6478d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6479e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6480f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6481g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6482h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f6483i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f6484j;

        private C2535d() {
            this.f6482h = 1;
            this.f6483i = 1;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r2 = r1.f6477c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m9657a(androidx.recyclerview.widget.RecyclerView.C0518a0 r2, java.util.List<com.google.android.flexbox.C2540c> r3) {
            /*
                r1 = this;
                int r0 = r1.f6478d
                if (r0 < 0) goto L_0x0016
                int r2 = r2.mo3025a()
                if (r0 >= r2) goto L_0x0016
                int r2 = r1.f6477c
                if (r2 < 0) goto L_0x0016
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.C2535d.m9657a(androidx.recyclerview.widget.RecyclerView$a0, java.util.List):boolean");
        }

        /* renamed from: e */
        static /* synthetic */ int m9667e(C2535d dVar) {
            int i = dVar.f6477c;
            dVar.f6477c = i + 1;
            return i;
        }

        /* renamed from: f */
        static /* synthetic */ int m9669f(C2535d dVar) {
            int i = dVar.f6477c;
            dVar.f6477c = i - 1;
            return i;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f6475a + ", mFlexLinePosition=" + this.f6477c + ", mPosition=" + this.f6478d + ", mOffset=" + this.f6479e + ", mScrollingOffset=" + this.f6480f + ", mLastScrollDelta=" + this.f6481g + ", mItemDirection=" + this.f6482h + ", mLayoutDirection=" + this.f6483i + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e */
    private static class C2536e implements Parcelable {
        public static final Parcelable.Creator<C2536e> CREATOR = new C2537a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6485f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6486g;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e$a */
        static class C2537a implements Parcelable.Creator<C2536e> {
            C2537a() {
            }

            public C2536e createFromParcel(Parcel parcel) {
                return new C2536e(parcel);
            }

            public C2536e[] newArray(int i) {
                return new C2536e[i];
            }
        }

        C2536e() {
        }

        private C2536e(Parcel parcel) {
            this.f6485f = parcel.readInt();
            this.f6486g = parcel.readInt();
        }

        private C2536e(C2536e eVar) {
            this.f6485f = eVar.f6485f;
            this.f6486g = eVar.f6486g;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m9680a(int i) {
            int i2 = this.f6485f;
            return i2 >= 0 && i2 < i;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public void m9685q() {
            this.f6485f = -1;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f6485f + ", mAnchorOffset=" + this.f6486g + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6485f);
            parcel.writeInt(this.f6486g);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        RecyclerView.C0538o.C0542d a = RecyclerView.C0538o.m2809a(context, attributeSet, i, i2);
        int i4 = a.f2219a;
        if (i4 != 0) {
            i3 = i4 == 1 ? a.f2221c ? 3 : 2 : i3;
            mo7630n(1);
            mo7628l(4);
            mo3194a(true);
            this.f6451T = context;
        } else if (a.f2221c) {
            mo7629m(1);
            mo7630n(1);
            mo7628l(4);
            mo3194a(true);
            this.f6451T = context;
        } else {
            i3 = 0;
        }
        mo7629m(i3);
        mo7630n(1);
        mo7628l(4);
        mo3194a(true);
        this.f6451T = context;
    }

    /* renamed from: F */
    private void m9530F() {
        this.f6436E.clear();
        this.f6441J.m9631b();
        int unused = this.f6441J.f6461d = 0;
    }

    /* renamed from: G */
    private void m9531G() {
        if (this.f6440I == null) {
            this.f6440I = new C2535d();
        }
    }

    /* renamed from: H */
    private void m9532H() {
        C0609o oVar;
        if (this.f6442K == null) {
            if (!mo7567a() ? this.f6456y != 0 : this.f6456y == 0) {
                this.f6442K = C0609o.m3399a((RecyclerView.C0538o) this);
                oVar = C0609o.m3401b((RecyclerView.C0538o) this);
            } else {
                this.f6442K = C0609o.m3401b((RecyclerView.C0538o) this);
                oVar = C0609o.m3399a((RecyclerView.C0538o) this);
            }
            this.f6443L = oVar;
        }
    }

    /* renamed from: I */
    private View m9533I() {
        return mo3233f(0);
    }

    /* renamed from: J */
    private void m9534J() {
        int j = mo7567a() ? mo3250j() : mo3263p();
        boolean unused = this.f6440I.f6476b = j == 0 || j == Integer.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r6.f6456y == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        if (r6.f6456y == 2) goto L_0x0044;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9535K() {
        /*
            r6 = this;
            int r0 = r6.mo3255l()
            int r1 = r6.f6455x
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r4) goto L_0x0039
            if (r1 == r2) goto L_0x0028
            r5 = 3
            if (r1 == r5) goto L_0x0017
            r6.f6434C = r3
        L_0x0014:
            r6.f6435D = r3
            goto L_0x0052
        L_0x0017:
            if (r0 != r4) goto L_0x001a
            r3 = 1
        L_0x001a:
            r6.f6434C = r3
            int r0 = r6.f6456y
            if (r0 != r2) goto L_0x0025
            boolean r0 = r6.f6434C
            r0 = r0 ^ r4
            r6.f6434C = r0
        L_0x0025:
            r6.f6435D = r4
            goto L_0x0052
        L_0x0028:
            if (r0 != r4) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r6.f6434C = r0
            int r0 = r6.f6456y
            if (r0 != r2) goto L_0x0014
            boolean r0 = r6.f6434C
            r0 = r0 ^ r4
            r6.f6434C = r0
            goto L_0x0014
        L_0x0039:
            if (r0 == r4) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r6.f6434C = r0
            int r0 = r6.f6456y
            if (r0 != r2) goto L_0x0014
        L_0x0044:
            r3 = 1
            goto L_0x0014
        L_0x0046:
            if (r0 != r4) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r6.f6434C = r0
            int r0 = r6.f6456y
            if (r0 != r2) goto L_0x0014
            goto L_0x0044
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m9535K():void");
    }

    /* renamed from: a */
    private int m9536a(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int i2;
        int b;
        if (!mo7567a() && this.f6434C) {
            int f = i - this.f6442K.mo3577f();
            if (f <= 0) {
                return 0;
            }
            i2 = m9556c(f, vVar, a0Var);
        } else {
            int b2 = this.f6442K.mo3569b() - i;
            if (b2 <= 0) {
                return 0;
            }
            i2 = -m9556c(-b2, vVar, a0Var);
        }
        int i3 = i + i2;
        if (!z || (b = this.f6442K.mo3569b() - i3) <= 0) {
            return i2;
        }
        this.f6442K.mo3568a(b);
        return b + i2;
    }

    /* renamed from: a */
    private int m9537a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, C2535d dVar) {
        if (dVar.f6480f != Integer.MIN_VALUE) {
            if (dVar.f6475a < 0) {
                int unused = dVar.f6480f = dVar.f6480f + dVar.f6475a;
            }
            m9543a(vVar, dVar);
        }
        int c = dVar.f6475a;
        int c2 = dVar.f6475a;
        int i = 0;
        boolean a = mo7567a();
        while (true) {
            if ((c2 > 0 || this.f6440I.f6476b) && dVar.m9657a(a0Var, this.f6436E)) {
                C2540c cVar = this.f6436E.get(dVar.f6477c);
                int unused2 = dVar.f6478d = cVar.f6501o;
                i += m9539a(cVar, dVar);
                int unused3 = dVar.f6479e = (a || !this.f6434C) ? dVar.f6479e + (cVar.mo7648a() * dVar.f6483i) : dVar.f6479e - (cVar.mo7648a() * dVar.f6483i);
                c2 -= cVar.mo7648a();
            }
        }
        int unused4 = dVar.f6475a = dVar.f6475a - i;
        if (dVar.f6480f != Integer.MIN_VALUE) {
            int unused5 = dVar.f6480f = dVar.f6480f + i;
            if (dVar.f6475a < 0) {
                int unused6 = dVar.f6480f = dVar.f6480f + dVar.f6475a;
            }
            m9543a(vVar, dVar);
        }
        return c - dVar.f6475a;
    }

    /* renamed from: a */
    private int m9539a(C2540c cVar, C2535d dVar) {
        return mo7567a() ? m9551b(cVar, dVar) : m9557c(cVar, dVar);
    }

    /* renamed from: a */
    private View m9540a(int i, int i2, boolean z) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View f = mo3233f(i);
            if (m9546a(f, z)) {
                return f;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: a */
    private View m9541a(View view, C2540c cVar) {
        boolean a = mo7567a();
        int i = cVar.f6494h;
        for (int i2 = 1; i2 < i; i2++) {
            View f = mo3233f(i2);
            if (!(f == null || f.getVisibility() == 8)) {
                if (!this.f6434C || a) {
                    if (this.f6442K.mo3574d(view) <= this.f6442K.mo3574d(f)) {
                    }
                } else if (this.f6442K.mo3567a(view) >= this.f6442K.mo3567a(f)) {
                }
                view = f;
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m9542a(RecyclerView.C0550v vVar, int i, int i2) {
        while (i2 >= i) {
            mo3177a(i2, vVar);
            i2--;
        }
    }

    /* renamed from: a */
    private void m9543a(RecyclerView.C0550v vVar, C2535d dVar) {
        if (dVar.f6484j) {
            if (dVar.f6483i == -1) {
                m9554b(vVar, dVar);
            } else {
                m9558c(vVar, dVar);
            }
        }
    }

    /* renamed from: a */
    private void m9544a(C2532b bVar, boolean z, boolean z2) {
        C2535d dVar;
        int i;
        int i2;
        if (z2) {
            m9534J();
        } else {
            boolean unused = this.f6440I.f6476b = false;
        }
        if (mo7567a() || !this.f6434C) {
            dVar = this.f6440I;
            i2 = this.f6442K.mo3569b();
            i = bVar.f6460c;
        } else {
            dVar = this.f6440I;
            i2 = bVar.f6460c;
            i = getPaddingRight();
        }
        int unused2 = dVar.f6475a = i2 - i;
        int unused3 = this.f6440I.f6478d = bVar.f6458a;
        int unused4 = this.f6440I.f6482h = 1;
        int unused5 = this.f6440I.f6483i = 1;
        int unused6 = this.f6440I.f6479e = bVar.f6460c;
        int unused7 = this.f6440I.f6480f = RecyclerView.UNDEFINED_DURATION;
        int unused8 = this.f6440I.f6477c = bVar.f6459b;
        if (z && this.f6436E.size() > 1 && bVar.f6459b >= 0 && bVar.f6459b < this.f6436E.size() - 1) {
            C2535d.m9667e(this.f6440I);
            C2535d dVar2 = this.f6440I;
            int unused9 = dVar2.f6478d = dVar2.f6478d + this.f6436E.get(bVar.f6459b).mo7650b();
        }
    }

    /* renamed from: a */
    private boolean m9545a(View view, int i, int i2, RecyclerView.C0543p pVar) {
        return view.isLayoutRequested() || !mo3268u() || !m9564e(view.getWidth(), i, pVar.width) || !m9564e(view.getHeight(), i2, pVar.height);
    }

    /* renamed from: a */
    private boolean m9546a(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int o = mo3261o() - getPaddingRight();
        int i = mo3247i() - getPaddingBottom();
        int r = m9575r(view);
        int t = m9579t(view);
        int s = m9577s(view);
        int q = m9574q(view);
        return z ? (paddingLeft <= r && o >= s) && (paddingTop <= t && i >= q) : (r >= o || s >= paddingLeft) && (t >= i || q >= paddingTop);
    }

    /* renamed from: a */
    private boolean m9547a(RecyclerView.C0518a0 a0Var, C2532b bVar) {
        boolean z = false;
        if (mo3231f() == 0) {
            return false;
        }
        View p = bVar.f6462e ? m9572p(a0Var.mo3025a()) : m9571o(a0Var.mo3025a());
        if (p == null) {
            return false;
        }
        bVar.m9626a(p);
        if (!a0Var.mo3030d() && mo2739C()) {
            if (this.f6442K.mo3574d(p) >= this.f6442K.mo3569b() || this.f6442K.mo3567a(p) < this.f6442K.mo3577f()) {
                z = true;
            }
            if (z) {
                int unused = bVar.f6460c = bVar.f6462e ? this.f6442K.mo3569b() : this.f6442K.mo3577f();
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m9548a(RecyclerView.C0518a0 a0Var, C2532b bVar, C2536e eVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo3030d() && (i = this.f6445N) != -1) {
            if (i < 0 || i >= a0Var.mo3025a()) {
                this.f6445N = -1;
                this.f6446O = RecyclerView.UNDEFINED_DURATION;
            } else {
                int unused = bVar.f6458a = this.f6445N;
                int unused2 = bVar.f6459b = this.f6437F.f6505c[bVar.f6458a];
                C2536e eVar2 = this.f6444M;
                if (eVar2 != null && eVar2.m9680a(a0Var.mo3025a())) {
                    int unused3 = bVar.f6460c = this.f6442K.mo3577f() + eVar.f6486g;
                    boolean unused4 = bVar.f6464g = true;
                    int unused5 = bVar.f6459b = -1;
                    return true;
                } else if (this.f6446O == Integer.MIN_VALUE) {
                    View e = mo2809e(this.f6445N);
                    if (e == null) {
                        if (mo3231f() > 0) {
                            if (this.f6445N < mo3258m(mo3233f(0))) {
                                z = true;
                            }
                            boolean unused6 = bVar.f6462e = z;
                        }
                        bVar.m9625a();
                    } else if (this.f6442K.mo3570b(e) > this.f6442K.mo3579g()) {
                        bVar.m9625a();
                        return true;
                    } else if (this.f6442K.mo3574d(e) - this.f6442K.mo3577f() < 0) {
                        int unused7 = bVar.f6460c = this.f6442K.mo3577f();
                        boolean unused8 = bVar.f6462e = false;
                        return true;
                    } else if (this.f6442K.mo3569b() - this.f6442K.mo3567a(e) < 0) {
                        int unused9 = bVar.f6460c = this.f6442K.mo3569b();
                        boolean unused10 = bVar.f6462e = true;
                        return true;
                    } else {
                        int unused11 = bVar.f6460c = bVar.f6462e ? this.f6442K.mo3567a(e) + this.f6442K.mo3580h() : this.f6442K.mo3574d(e);
                    }
                    return true;
                } else {
                    int unused12 = bVar.f6460c = (mo7567a() || !this.f6434C) ? this.f6442K.mo3577f() + this.f6446O : this.f6446O - this.f6442K.mo3571c();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m9549b(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int i2;
        int f;
        if (mo7567a() || !this.f6434C) {
            int f2 = i - this.f6442K.mo3577f();
            if (f2 <= 0) {
                return 0;
            }
            i2 = -m9556c(f2, vVar, a0Var);
        } else {
            int b = this.f6442K.mo3569b() - i;
            if (b <= 0) {
                return 0;
            }
            i2 = m9556c(-b, vVar, a0Var);
        }
        int i3 = i + i2;
        if (!z || (f = i3 - this.f6442K.mo3577f()) <= 0) {
            return i2;
        }
        this.f6442K.mo3568a(-f);
        return i2 - f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m9551b(com.google.android.flexbox.C2540c r22, com.google.android.flexbox.FlexboxLayoutManager.C2535d r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.mo3261o()
            int r4 = r23.f6479e
            int r5 = r23.f6483i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.f6493g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.f6478d
            int r4 = r0.f6457z
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00af
            if (r4 == r11) goto L_0x00a1
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0091
            r6 = 3
            if (r4 == r6) goto L_0x007d
            r6 = 4
            if (r4 == r6) goto L_0x0067
            r6 = 5
            if (r4 != r6) goto L_0x004e
            int r4 = r8.f6494h
            if (r4 == 0) goto L_0x0047
            int r6 = r8.f6491e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r4 = r6 / r4
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            float r1 = (float) r1
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b3
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f6457z
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0067:
            int r4 = r8.f6494h
            if (r4 == 0) goto L_0x0074
            int r6 = r8.f6491e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r4 = r6 / r4
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            float r1 = (float) r1
            float r6 = r4 / r7
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b3
        L_0x007d:
            float r1 = (float) r1
            int r4 = r8.f6494h
            if (r4 == r11) goto L_0x0085
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0087
        L_0x0085:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0087:
            int r6 = r8.f6491e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b3
        L_0x0091:
            float r1 = (float) r1
            int r4 = r8.f6491e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00b2
        L_0x00a1:
            int r4 = r8.f6491e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r4 = 0
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b3
        L_0x00af:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f6441J
            int r3 = r3.f6461d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f6441J
            int r3 = r3.f6461d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r4, r5)
            r3 = 0
            int r13 = r22.mo7650b()
            r14 = r10
        L_0x00cd:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x0197
            android.view.View r15 = r0.mo7563a((int) r14)
            if (r15 != 0) goto L_0x00d9
            goto L_0x0192
        L_0x00d9:
            int r4 = r23.f6483i
            if (r4 != r11) goto L_0x00e8
            android.graphics.Rect r4 = f6431X
            r0.mo3181a((android.view.View) r15, (android.graphics.Rect) r4)
            r0.mo3218c((android.view.View) r15)
            goto L_0x00f2
        L_0x00e8:
            android.graphics.Rect r4 = f6431X
            r0.mo3181a((android.view.View) r15, (android.graphics.Rect) r4)
            r0.mo3209b((android.view.View) r15, (int) r3)
            int r3 = r3 + 1
        L_0x00f2:
            r16 = r3
            com.google.android.flexbox.d r3 = r0.f6437F
            long[] r4 = r3.f6506d
            r5 = r4[r14]
            int r3 = r3.mo7665b((long) r5)
            com.google.android.flexbox.d r4 = r0.f6437F
            int r4 = r4.mo7652a((long) r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$c r7 = (com.google.android.flexbox.FlexboxLayoutManager.C2533c) r7
            boolean r5 = r0.m9545a((android.view.View) r15, (int) r3, (int) r4, (androidx.recyclerview.widget.RecyclerView.C0543p) r7)
            if (r5 == 0) goto L_0x0114
            r15.measure(r3, r4)
        L_0x0114:
            int r3 = r7.leftMargin
            int r4 = r0.mo3256l(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.mo3260n(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.mo3262o(r15)
            int r5 = r9 + r1
            boolean r1 = r0.f6434C
            if (r1 == 0) goto L_0x014f
            com.google.android.flexbox.d r1 = r0.f6437F
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            goto L_0x0169
        L_0x014f:
            r11 = r7
            com.google.android.flexbox.d r1 = r0.f6437F
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
        L_0x0169:
            r1.mo7657a((android.view.View) r2, (com.google.android.flexbox.C2540c) r3, (int) r4, (int) r5, (int) r6, (int) r7)
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.mo3260n(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.mo3256l(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x0192:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00cd
        L_0x0197:
            int r1 = r23.f6477c
            com.google.android.flexbox.FlexboxLayoutManager$d r2 = r0.f6440I
            int r2 = r2.f6483i
            int r1 = r1 + r2
            r2 = r23
            int unused = r2.f6477c = r1
            int r1 = r22.mo7648a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m9551b(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* renamed from: b */
    private View m9552b(View view, C2540c cVar) {
        boolean a = mo7567a();
        int f = (mo3231f() - cVar.f6494h) - 1;
        for (int f2 = mo3231f() - 2; f2 > f; f2--) {
            View f3 = mo3233f(f2);
            if (!(f3 == null || f3.getVisibility() == 8)) {
                if (!this.f6434C || a) {
                    if (this.f6442K.mo3567a(view) >= this.f6442K.mo3567a(f3)) {
                    }
                } else if (this.f6442K.mo3574d(view) <= this.f6442K.mo3574d(f3)) {
                }
                view = f3;
            }
        }
        return view;
    }

    /* renamed from: b */
    private void m9553b(RecyclerView.C0518a0 a0Var, C2532b bVar) {
        if (!m9548a(a0Var, bVar, this.f6444M) && !m9547a(a0Var, bVar)) {
            bVar.m9625a();
            int unused = bVar.f6458a = 0;
            int unused2 = bVar.f6459b = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r0 = r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9554b(androidx.recyclerview.widget.RecyclerView.C0550v r8, com.google.android.flexbox.FlexboxLayoutManager.C2535d r9) {
        /*
            r7 = this;
            int r0 = r9.f6480f
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            androidx.recyclerview.widget.o r0 = r7.f6442K
            r0.mo3566a()
            int unused = r9.f6480f
            int r0 = r7.mo3231f()
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            int r1 = r0 + -1
            android.view.View r2 = r7.mo3233f((int) r1)
            com.google.android.flexbox.d r3 = r7.f6437F
            int[] r3 = r3.f6505c
            int r2 = r7.mo3258m(r2)
            r2 = r3[r2]
            r3 = -1
            if (r2 != r3) goto L_0x002a
            return
        L_0x002a:
            java.util.List<com.google.android.flexbox.c> r3 = r7.f6436E
            java.lang.Object r3 = r3.get(r2)
            com.google.android.flexbox.c r3 = (com.google.android.flexbox.C2540c) r3
            r4 = r0
            r0 = r1
        L_0x0034:
            if (r0 < 0) goto L_0x0060
            android.view.View r5 = r7.mo3233f((int) r0)
            int r6 = r9.f6480f
            boolean r6 = r7.m9565e((android.view.View) r5, (int) r6)
            if (r6 == 0) goto L_0x0060
            int r6 = r3.f6501o
            int r5 = r7.mo3258m(r5)
            if (r6 != r5) goto L_0x005d
            if (r2 > 0) goto L_0x004f
            goto L_0x0061
        L_0x004f:
            int r3 = r9.f6483i
            int r2 = r2 + r3
            java.util.List<com.google.android.flexbox.c> r3 = r7.f6436E
            java.lang.Object r3 = r3.get(r2)
            com.google.android.flexbox.c r3 = (com.google.android.flexbox.C2540c) r3
            r4 = r0
        L_0x005d:
            int r0 = r0 + -1
            goto L_0x0034
        L_0x0060:
            r0 = r4
        L_0x0061:
            r7.m9542a((androidx.recyclerview.widget.RecyclerView.C0550v) r8, (int) r0, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m9554b(androidx.recyclerview.widget.RecyclerView$v, com.google.android.flexbox.FlexboxLayoutManager$d):void");
    }

    /* renamed from: b */
    private void m9555b(C2532b bVar, boolean z, boolean z2) {
        C2535d dVar;
        int i;
        if (z2) {
            m9534J();
        } else {
            boolean unused = this.f6440I.f6476b = false;
        }
        if (mo7567a() || !this.f6434C) {
            dVar = this.f6440I;
            i = bVar.f6460c;
        } else {
            dVar = this.f6440I;
            i = this.f6452U.getWidth() - bVar.f6460c;
        }
        int unused2 = dVar.f6475a = i - this.f6442K.mo3577f();
        int unused3 = this.f6440I.f6478d = bVar.f6458a;
        int unused4 = this.f6440I.f6482h = 1;
        int unused5 = this.f6440I.f6483i = -1;
        int unused6 = this.f6440I.f6479e = bVar.f6460c;
        int unused7 = this.f6440I.f6480f = RecyclerView.UNDEFINED_DURATION;
        int unused8 = this.f6440I.f6477c = bVar.f6459b;
        if (z && bVar.f6459b > 0 && this.f6436E.size() > bVar.f6459b) {
            C2535d.m9669f(this.f6440I);
            C2535d dVar2 = this.f6440I;
            int unused9 = dVar2.f6478d = dVar2.f6478d - this.f6436E.get(bVar.f6459b).mo7650b();
        }
    }

    /* renamed from: c */
    private int m9556c(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0 || i == 0) {
            return 0;
        }
        m9532H();
        int i2 = 1;
        boolean unused = this.f6440I.f6484j = true;
        boolean z = !mo7567a() && this.f6434C;
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m9563e(i2, abs);
        int g = this.f6440I.f6480f + m9537a(vVar, a0Var, this.f6440I);
        if (g < 0) {
            return 0;
        }
        if (z) {
            if (abs > g) {
                i = (-i2) * g;
            }
        } else if (abs > g) {
            i = i2 * g;
        }
        this.f6442K.mo3568a(-i);
        int unused2 = this.f6440I.f6481g = i;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m9557c(com.google.android.flexbox.C2540c r26, com.google.android.flexbox.FlexboxLayoutManager.C2535d r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.mo3247i()
            int r4 = r27.f6479e
            int r5 = r27.f6479e
            int r6 = r27.f6483i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.f6493g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.f6478d
            int r4 = r0.f6457z
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b5
            if (r4 == r13) goto L_0x00a7
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0097
            r6 = 3
            if (r4 == r6) goto L_0x0083
            r6 = 4
            if (r4 == r6) goto L_0x006d
            r6 = 5
            if (r4 != r6) goto L_0x0054
            int r4 = r9.f6494h
            if (r4 == 0) goto L_0x004d
            int r6 = r9.f6491e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r4 = r6 / r4
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            float r1 = (float) r1
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b9
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f6457z
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            int r4 = r9.f6494h
            if (r4 == 0) goto L_0x007a
            int r6 = r9.f6491e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r4 = r6 / r4
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            float r1 = (float) r1
            float r6 = r4 / r7
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b9
        L_0x0083:
            float r1 = (float) r1
            int r4 = r9.f6494h
            if (r4 == r13) goto L_0x008b
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008d
        L_0x008b:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008d:
            int r6 = r9.f6491e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b9
        L_0x0097:
            float r1 = (float) r1
            int r4 = r9.f6491e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00b8
        L_0x00a7:
            int r4 = r9.f6491e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r4 = 0
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b9
        L_0x00b5:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00b8:
            r4 = 0
        L_0x00b9:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f6441J
            int r3 = r3.f6461d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f6441J
            int r3 = r3.f6461d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r4, r5)
            r3 = 0
            int r15 = r26.mo7650b()
            r8 = r12
        L_0x00d3:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x0201
            android.view.View r7 = r0.mo7563a((int) r8)
            if (r7 != 0) goto L_0x00e5
            r23 = r8
            r17 = r14
            r22 = 1
            goto L_0x01fa
        L_0x00e5:
            com.google.android.flexbox.d r4 = r0.f6437F
            long[] r5 = r4.f6506d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.mo7665b((long) r13)
            com.google.android.flexbox.d r5 = r0.f6437F
            int r5 = r5.mo7652a((long) r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$c r13 = (com.google.android.flexbox.FlexboxLayoutManager.C2533c) r13
            boolean r6 = r0.m9545a((android.view.View) r7, (int) r4, (int) r5, (androidx.recyclerview.widget.RecyclerView.C0543p) r13)
            if (r6 == 0) goto L_0x0107
            r7.measure(r4, r5)
        L_0x0107:
            int r4 = r13.topMargin
            int r5 = r0.mo3262o(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.mo3229e((android.view.View) r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.f6483i
            r6 = 1
            if (r1 != r6) goto L_0x012b
            android.graphics.Rect r1 = f6431X
            r0.mo3181a((android.view.View) r7, (android.graphics.Rect) r1)
            r0.mo3218c((android.view.View) r7)
            goto L_0x0135
        L_0x012b:
            android.graphics.Rect r1 = f6431X
            r0.mo3181a((android.view.View) r7, (android.graphics.Rect) r1)
            r0.mo3209b((android.view.View) r7, (int) r3)
            int r3 = r3 + 1
        L_0x0135:
            r16 = r3
            int r1 = r0.mo3256l(r7)
            int r5 = r10 + r1
            int r1 = r0.mo3260n(r7)
            int r19 = r11 - r1
            boolean r4 = r0.f6434C
            if (r4 == 0) goto L_0x0194
            boolean r1 = r0.f6435D
            if (r1 == 0) goto L_0x0171
            com.google.android.flexbox.d r1 = r0.f6437F
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = 1
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            goto L_0x01cf
        L_0x0171:
            r20 = r7
            r23 = r8
            r22 = 1
            com.google.android.flexbox.d r1 = r0.f6437F
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            goto L_0x01cf
        L_0x0194:
            r20 = r7
            r23 = r8
            r22 = 1
            boolean r1 = r0.f6435D
            if (r1 == 0) goto L_0x01b5
            com.google.android.flexbox.d r1 = r0.f6437F
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            goto L_0x01cb
        L_0x01b5:
            com.google.android.flexbox.d r1 = r0.f6437F
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
        L_0x01cb:
            r2 = r20
            r3 = r26
        L_0x01cf:
            r1.mo7658a((android.view.View) r2, (com.google.android.flexbox.C2540c) r3, (boolean) r4, (int) r5, (int) r6, (int) r7, (int) r8)
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.mo3229e((android.view.View) r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.mo3262o(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x01fa:
            int r8 = r23 + 1
            r14 = r17
            r13 = 1
            goto L_0x00d3
        L_0x0201:
            int r1 = r27.f6477c
            com.google.android.flexbox.FlexboxLayoutManager$d r2 = r0.f6440I
            int r2 = r2.f6483i
            int r1 = r1 + r2
            r2 = r27
            int unused = r2.f6477c = r1
            int r1 = r26.mo7648a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m9557c(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = r5;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9558c(androidx.recyclerview.widget.RecyclerView.C0550v r9, com.google.android.flexbox.FlexboxLayoutManager.C2535d r10) {
        /*
            r8 = this;
            int r0 = r10.f6480f
            if (r0 >= 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r8.mo3231f()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            r1 = 0
            android.view.View r2 = r8.mo3233f((int) r1)
            com.google.android.flexbox.d r3 = r8.f6437F
            int[] r3 = r3.f6505c
            int r2 = r8.mo3258m(r2)
            r2 = r3[r2]
            r3 = -1
            if (r2 != r3) goto L_0x0021
            return
        L_0x0021:
            java.util.List<com.google.android.flexbox.c> r4 = r8.f6436E
            java.lang.Object r4 = r4.get(r2)
            com.google.android.flexbox.c r4 = (com.google.android.flexbox.C2540c) r4
            r3 = r2
            r2 = 0
            r5 = -1
        L_0x002c:
            if (r2 >= r0) goto L_0x0060
            android.view.View r6 = r8.mo3233f((int) r2)
            int r7 = r10.f6480f
            boolean r7 = r8.m9567f(r6, r7)
            if (r7 == 0) goto L_0x0060
            int r7 = r4.f6502p
            int r6 = r8.mo3258m(r6)
            if (r7 != r6) goto L_0x005d
            java.util.List<com.google.android.flexbox.c> r4 = r8.f6436E
            int r4 = r4.size()
            int r4 = r4 + -1
            if (r3 < r4) goto L_0x004f
            goto L_0x0061
        L_0x004f:
            int r4 = r10.f6483i
            int r3 = r3 + r4
            java.util.List<com.google.android.flexbox.c> r4 = r8.f6436E
            java.lang.Object r4 = r4.get(r3)
            com.google.android.flexbox.c r4 = (com.google.android.flexbox.C2540c) r4
            r5 = r2
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002c
        L_0x0060:
            r2 = r5
        L_0x0061:
            r8.m9542a((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (int) r1, (int) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m9558c(androidx.recyclerview.widget.RecyclerView$v, com.google.android.flexbox.FlexboxLayoutManager$d):void");
    }

    /* renamed from: d */
    private View m9560d(int i, int i2, int i3) {
        m9532H();
        m9531G();
        int f = this.f6442K.mo3577f();
        int b = this.f6442K.mo3569b();
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
                } else if (this.f6442K.mo3574d(f2) >= f && this.f6442K.mo3567a(f2) <= b) {
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

    /* renamed from: e */
    private void m9563e(int i, int i2) {
        int unused = this.f6440I.f6483i = i;
        boolean a = mo7567a();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo3261o(), mo3263p());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo3247i(), mo3250j());
        int i3 = 0;
        boolean z = !a && this.f6434C;
        if (i == 1) {
            View f = mo3233f(mo3231f() - 1);
            int unused2 = this.f6440I.f6479e = this.f6442K.mo3567a(f);
            int m = mo3258m(f);
            View b = m9552b(f, this.f6436E.get(this.f6437F.f6505c[m]));
            int unused3 = this.f6440I.f6482h = 1;
            C2535d dVar = this.f6440I;
            int unused4 = dVar.f6478d = m + dVar.f6482h;
            if (this.f6437F.f6505c.length <= this.f6440I.f6478d) {
                int unused5 = this.f6440I.f6477c = -1;
            } else {
                C2535d dVar2 = this.f6440I;
                int unused6 = dVar2.f6477c = this.f6437F.f6505c[dVar2.f6478d];
            }
            if (z) {
                int unused7 = this.f6440I.f6479e = this.f6442K.mo3574d(b);
                int unused8 = this.f6440I.f6480f = (-this.f6442K.mo3574d(b)) + this.f6442K.mo3577f();
                C2535d dVar3 = this.f6440I;
                if (dVar3.f6480f >= 0) {
                    i3 = this.f6440I.f6480f;
                }
                int unused9 = dVar3.f6480f = i3;
            } else {
                int unused10 = this.f6440I.f6479e = this.f6442K.mo3567a(b);
                int unused11 = this.f6440I.f6480f = this.f6442K.mo3567a(b) - this.f6442K.mo3569b();
            }
            if ((this.f6440I.f6477c == -1 || this.f6440I.f6477c > this.f6436E.size() - 1) && this.f6440I.f6478d <= getFlexItemCount()) {
                int g = i2 - this.f6440I.f6480f;
                this.f6454W.mo7676a();
                if (g > 0) {
                    C2541d dVar4 = this.f6437F;
                    C2541d.C2543b bVar = this.f6454W;
                    int h = this.f6440I.f6478d;
                    List<C2540c> list = this.f6436E;
                    int i4 = makeMeasureSpec;
                    int i5 = makeMeasureSpec2;
                    if (a) {
                        dVar4.mo7661a(bVar, i4, i5, g, h, list);
                    } else {
                        dVar4.mo7673c(bVar, i4, i5, g, h, list);
                    }
                    this.f6437F.mo7668b(makeMeasureSpec, makeMeasureSpec2, this.f6440I.f6478d);
                    this.f6437F.mo7674d(this.f6440I.f6478d);
                }
            }
        } else {
            View f2 = mo3233f(0);
            int unused12 = this.f6440I.f6479e = this.f6442K.mo3574d(f2);
            int m2 = mo3258m(f2);
            View a2 = m9541a(f2, this.f6436E.get(this.f6437F.f6505c[m2]));
            int unused13 = this.f6440I.f6482h = 1;
            int i6 = this.f6437F.f6505c[m2];
            if (i6 == -1) {
                i6 = 0;
            }
            if (i6 > 0) {
                int unused14 = this.f6440I.f6478d = m2 - this.f6436E.get(i6 - 1).mo7650b();
            } else {
                int unused15 = this.f6440I.f6478d = -1;
            }
            int unused16 = this.f6440I.f6477c = i6 > 0 ? i6 - 1 : 0;
            C2535d dVar5 = this.f6440I;
            C0609o oVar = this.f6442K;
            if (z) {
                int unused17 = dVar5.f6479e = oVar.mo3567a(a2);
                int unused18 = this.f6440I.f6480f = this.f6442K.mo3567a(a2) - this.f6442K.mo3569b();
                C2535d dVar6 = this.f6440I;
                if (dVar6.f6480f >= 0) {
                    i3 = this.f6440I.f6480f;
                }
                int unused19 = dVar6.f6480f = i3;
            } else {
                int unused20 = dVar5.f6479e = oVar.mo3574d(a2);
                int unused21 = this.f6440I.f6480f = (-this.f6442K.mo3574d(a2)) + this.f6442K.mo3577f();
            }
        }
        C2535d dVar7 = this.f6440I;
        int unused22 = dVar7.f6475a = i2 - dVar7.f6480f;
    }

    /* renamed from: e */
    private static boolean m9564e(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m9565e(View view, int i) {
        return (mo7567a() || !this.f6434C) ? this.f6442K.mo3574d(view) >= this.f6442K.mo3566a() - i : this.f6442K.mo3567a(view) <= i;
    }

    /* renamed from: f */
    private boolean m9567f(View view, int i) {
        return (mo7567a() || !this.f6434C) ? this.f6442K.mo3567a(view) <= i : this.f6442K.mo3566a() - this.f6442K.mo3574d(view) <= i;
    }

    /* renamed from: h */
    private int m9568h(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        int a = a0Var.mo3025a();
        m9532H();
        View o = m9571o(a);
        View p = m9572p(a);
        if (a0Var.mo3025a() == 0 || o == null || p == null) {
            return 0;
        }
        return Math.min(this.f6442K.mo3579g(), this.f6442K.mo3567a(p) - this.f6442K.mo3574d(o));
    }

    /* renamed from: i */
    private int m9569i(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        int a = a0Var.mo3025a();
        View o = m9571o(a);
        View p = m9572p(a);
        if (!(a0Var.mo3025a() == 0 || o == null || p == null)) {
            int m = mo3258m(o);
            int m2 = mo3258m(p);
            int abs = Math.abs(this.f6442K.mo3567a(p) - this.f6442K.mo3574d(o));
            int[] iArr = this.f6437F.f6505c;
            int i = iArr[m];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[m2] - i) + 1)))) + ((float) (this.f6442K.mo3577f() - this.f6442K.mo3574d(o))));
            }
        }
        return 0;
    }

    /* renamed from: j */
    private int m9570j(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        int a = a0Var.mo3025a();
        View o = m9571o(a);
        View p = m9572p(a);
        if (a0Var.mo3025a() == 0 || o == null || p == null) {
            return 0;
        }
        int D = mo7626D();
        return (int) ((((float) Math.abs(this.f6442K.mo3567a(p) - this.f6442K.mo3574d(o))) / ((float) ((mo7627E() - D) + 1))) * ((float) a0Var.mo3025a()));
    }

    /* renamed from: o */
    private View m9571o(int i) {
        int i2;
        View d = m9560d(0, mo3231f(), i);
        if (d == null || (i2 = this.f6437F.f6505c[mo3258m(d)]) == -1) {
            return null;
        }
        return m9541a(d, this.f6436E.get(i2));
    }

    /* renamed from: p */
    private View m9572p(int i) {
        View d = m9560d(mo3231f() - 1, -1, i);
        if (d == null) {
            return null;
        }
        return m9552b(d, this.f6436E.get(this.f6437F.f6505c[mo3258m(d)]));
    }

    /* renamed from: q */
    private int m9573q(int i) {
        int i2;
        boolean z = false;
        if (mo3231f() == 0 || i == 0) {
            return 0;
        }
        m9532H();
        boolean a = mo7567a();
        View view = this.f6452U;
        int width = a ? view.getWidth() : view.getHeight();
        int o = a ? mo3261o() : mo3247i();
        if (mo3255l() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((o + this.f6441J.f6461d) - width, abs);
                return -i2;
            } else if (this.f6441J.f6461d + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((o - this.f6441J.f6461d) - width, i);
        } else {
            if (this.f6441J.f6461d + i >= 0) {
                return i;
            }
        }
        i2 = this.f6441J.f6461d;
        return -i2;
    }

    /* renamed from: q */
    private int m9574q(View view) {
        return mo3232f(view) + ((RecyclerView.C0543p) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: r */
    private int m9575r(View view) {
        return mo3235g(view) - ((RecyclerView.C0543p) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: r */
    private void m9576r(int i) {
        if (i < mo7627E()) {
            int f = mo3231f();
            this.f6437F.mo7667b(f);
            this.f6437F.mo7672c(f);
            this.f6437F.mo7654a(f);
            if (i < this.f6437F.f6505c.length) {
                this.f6453V = i;
                View I = m9533I();
                if (I != null) {
                    this.f6445N = mo3258m(I);
                    this.f6446O = (mo7567a() || !this.f6434C) ? this.f6442K.mo3574d(I) - this.f6442K.mo3577f() : this.f6442K.mo3567a(I) + this.f6442K.mo3571c();
                }
            }
        }
    }

    /* renamed from: s */
    private int m9577s(View view) {
        return mo3251j(view) + ((RecyclerView.C0543p) view.getLayoutParams()).rightMargin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9578s(int r12) {
        /*
            r11 = this;
            int r0 = r11.mo3261o()
            int r1 = r11.mo3263p()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r1 = r11.mo3247i()
            int r2 = r11.mo3250j()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r2 = r11.mo3261o()
            int r3 = r11.mo3247i()
            boolean r4 = r11.mo7567a()
            r5 = 1
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L_0x0047
            int r4 = r11.f6447P
            if (r4 == r7) goto L_0x0031
            if (r4 == r2) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r11.f6440I
            boolean r4 = r4.f6476b
            if (r4 == 0) goto L_0x0064
            android.content.Context r4 = r11.f6451T
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            goto L_0x006a
        L_0x0047:
            int r4 = r11.f6448Q
            if (r4 == r7) goto L_0x004e
            if (r4 == r3) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r11.f6440I
            boolean r4 = r4.f6476b
            if (r4 == 0) goto L_0x0064
            android.content.Context r4 = r11.f6451T
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            goto L_0x006a
        L_0x0064:
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r11.f6440I
            int r4 = r4.f6475a
        L_0x006a:
            r6 = r4
            r11.f6447P = r2
            r11.f6448Q = r3
            int r2 = r11.f6453V
            r3 = -1
            if (r2 != r3) goto L_0x00de
            int r2 = r11.f6445N
            if (r2 != r3) goto L_0x007a
            if (r5 == 0) goto L_0x00de
        L_0x007a:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.f6441J
            boolean r12 = r12.f6462e
            if (r12 == 0) goto L_0x0083
            return
        L_0x0083:
            java.util.List<com.google.android.flexbox.c> r12 = r11.f6436E
            r12.clear()
            com.google.android.flexbox.d$b r12 = r11.f6454W
            r12.mo7676a()
            boolean r12 = r11.mo7567a()
            com.google.android.flexbox.d r2 = r11.f6437F
            com.google.android.flexbox.d$b r3 = r11.f6454W
            if (r12 == 0) goto L_0x00a5
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.f6441J
            int r7 = r12.f6458a
            java.util.List<com.google.android.flexbox.c> r8 = r11.f6436E
            r4 = r0
            r5 = r1
            r2.mo7670b((com.google.android.flexbox.C2541d.C2543b) r3, (int) r4, (int) r5, (int) r6, (int) r7, (java.util.List<com.google.android.flexbox.C2540c>) r8)
            goto L_0x00b2
        L_0x00a5:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.f6441J
            int r7 = r12.f6458a
            java.util.List<com.google.android.flexbox.c> r8 = r11.f6436E
            r4 = r0
            r5 = r1
            r2.mo7675d(r3, r4, r5, r6, r7, r8)
        L_0x00b2:
            com.google.android.flexbox.d$b r12 = r11.f6454W
            java.util.List<com.google.android.flexbox.c> r12 = r12.f6508a
            r11.f6436E = r12
            com.google.android.flexbox.d r12 = r11.f6437F
            r12.mo7655a((int) r0, (int) r1)
            com.google.android.flexbox.d r12 = r11.f6437F
            r12.mo7653a()
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.f6441J
            com.google.android.flexbox.d r0 = r11.f6437F
            int[] r0 = r0.f6505c
            int r1 = r12.f6458a
            r0 = r0[r1]
            int unused = r12.f6459b = r0
            com.google.android.flexbox.FlexboxLayoutManager$d r12 = r11.f6440I
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r11.f6441J
            int r0 = r0.f6459b
            int unused = r12.f6477c = r0
            goto L_0x0172
        L_0x00de:
            int r2 = r11.f6453V
            if (r2 == r3) goto L_0x00ed
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r11.f6441J
            int r3 = r3.f6458a
            int r2 = java.lang.Math.min(r2, r3)
            goto L_0x00f3
        L_0x00ed:
            com.google.android.flexbox.FlexboxLayoutManager$b r2 = r11.f6441J
            int r2 = r2.f6458a
        L_0x00f3:
            r10 = r2
            com.google.android.flexbox.d$b r2 = r11.f6454W
            r2.mo7676a()
            boolean r2 = r11.mo7567a()
            if (r2 == 0) goto L_0x012f
            java.util.List<com.google.android.flexbox.c> r2 = r11.f6436E
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x011d
            com.google.android.flexbox.d r12 = r11.f6437F
            java.util.List<com.google.android.flexbox.c> r2 = r11.f6436E
            r12.mo7662a((java.util.List<com.google.android.flexbox.C2540c>) r2, (int) r10)
            com.google.android.flexbox.d r2 = r11.f6437F
            com.google.android.flexbox.d$b r3 = r11.f6454W
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.f6441J
            int r8 = r12.f6458a
            java.util.List<com.google.android.flexbox.c> r9 = r11.f6436E
            r4 = r0
            r5 = r1
            goto L_0x014c
        L_0x011d:
            com.google.android.flexbox.d r2 = r11.f6437F
            r2.mo7654a((int) r12)
            com.google.android.flexbox.d r2 = r11.f6437F
            com.google.android.flexbox.d$b r3 = r11.f6454W
            r7 = 0
            java.util.List<com.google.android.flexbox.c> r8 = r11.f6436E
            r4 = r0
            r5 = r1
            r2.mo7661a((com.google.android.flexbox.C2541d.C2543b) r3, (int) r4, (int) r5, (int) r6, (int) r7, (java.util.List<com.google.android.flexbox.C2540c>) r8)
            goto L_0x0162
        L_0x012f:
            java.util.List<com.google.android.flexbox.c> r2 = r11.f6436E
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0151
            com.google.android.flexbox.d r12 = r11.f6437F
            java.util.List<com.google.android.flexbox.c> r2 = r11.f6436E
            r12.mo7662a((java.util.List<com.google.android.flexbox.C2540c>) r2, (int) r10)
            com.google.android.flexbox.d r2 = r11.f6437F
            com.google.android.flexbox.d$b r3 = r11.f6454W
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.f6441J
            int r8 = r12.f6458a
            java.util.List<com.google.android.flexbox.c> r9 = r11.f6436E
            r4 = r1
            r5 = r0
        L_0x014c:
            r7 = r10
            r2.mo7660a((com.google.android.flexbox.C2541d.C2543b) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (java.util.List<com.google.android.flexbox.C2540c>) r9)
            goto L_0x0162
        L_0x0151:
            com.google.android.flexbox.d r2 = r11.f6437F
            r2.mo7654a((int) r12)
            com.google.android.flexbox.d r2 = r11.f6437F
            com.google.android.flexbox.d$b r3 = r11.f6454W
            r7 = 0
            java.util.List<com.google.android.flexbox.c> r8 = r11.f6436E
            r4 = r0
            r5 = r1
            r2.mo7673c(r3, r4, r5, r6, r7, r8)
        L_0x0162:
            com.google.android.flexbox.d$b r12 = r11.f6454W
            java.util.List<com.google.android.flexbox.c> r12 = r12.f6508a
            r11.f6436E = r12
            com.google.android.flexbox.d r12 = r11.f6437F
            r12.mo7668b((int) r0, (int) r1, (int) r10)
            com.google.android.flexbox.d r12 = r11.f6437F
            r12.mo7674d((int) r10)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m9578s(int):void");
    }

    /* renamed from: t */
    private int m9579t(View view) {
        return mo3254k(view) - ((RecyclerView.C0543p) view.getLayoutParams()).topMargin;
    }

    /* renamed from: D */
    public int mo7626D() {
        View a = m9540a(0, mo3231f(), false);
        if (a == null) {
            return -1;
        }
        return mo3258m(a);
    }

    /* renamed from: E */
    public int mo7627E() {
        View a = m9540a(mo3231f() - 1, -1, false);
        if (a == null) {
            return -1;
        }
        return mo3258m(a);
    }

    /* renamed from: a */
    public int mo7560a(int i, int i2, int i3) {
        return RecyclerView.C0538o.m2808a(mo3247i(), mo3250j(), i2, i3, mo2807c());
    }

    /* renamed from: a */
    public int mo2741a(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (!mo7567a()) {
            int c = m9556c(i, vVar, a0Var);
            this.f6450S.clear();
            return c;
        }
        int q = m9573q(i);
        C2532b bVar = this.f6441J;
        int unused = bVar.f6461d = bVar.f6461d + q;
        this.f6443L.mo3568a(-q);
        return q;
    }

    /* renamed from: a */
    public int mo7561a(View view) {
        int l;
        int n;
        if (mo7567a()) {
            l = mo3262o(view);
            n = mo3229e(view);
        } else {
            l = mo3256l(view);
            n = mo3260n(view);
        }
        return l + n;
    }

    /* renamed from: a */
    public int mo7562a(View view, int i, int i2) {
        int o;
        int e;
        if (mo7567a()) {
            o = mo3256l(view);
            e = mo3260n(view);
        } else {
            o = mo3262o(view);
            e = mo3229e(view);
        }
        return o + e;
    }

    /* renamed from: a */
    public int mo2790a(RecyclerView.C0518a0 a0Var) {
        return m9568h(a0Var);
    }

    /* renamed from: a */
    public View mo7563a(int i) {
        View view = this.f6450S.get(i);
        return view != null ? view : this.f6438G.mo3326d(i);
    }

    /* renamed from: a */
    public RecyclerView.C0543p mo2745a(Context context, AttributeSet attributeSet) {
        return new C2533c(context, attributeSet);
    }

    /* renamed from: a */
    public void mo7564a(int i, View view) {
        this.f6450S.put(i, view);
    }

    /* renamed from: a */
    public void mo2796a(Parcelable parcelable) {
        if (parcelable instanceof C2536e) {
            this.f6444M = (C2536e) parcelable;
            mo3271y();
        }
    }

    /* renamed from: a */
    public void mo7565a(View view, int i, int i2, C2540c cVar) {
        int i3;
        int i4;
        mo3181a(view, f6431X);
        if (mo7567a()) {
            i3 = mo3256l(view);
            i4 = mo3260n(view);
        } else {
            i3 = mo3262o(view);
            i4 = mo3229e(view);
        }
        int i5 = i3 + i4;
        cVar.f6491e += i5;
        cVar.f6492f += i5;
    }

    /* renamed from: a */
    public void mo3185a(RecyclerView.C0527g gVar, RecyclerView.C0527g gVar2) {
        mo3270x();
    }

    /* renamed from: a */
    public void mo2752a(RecyclerView recyclerView, int i, int i2) {
        super.mo2752a(recyclerView, i, i2);
        m9576r(i);
    }

    /* renamed from: a */
    public void mo2753a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo2753a(recyclerView, i, i2, i3);
        m9576r(Math.min(i, i2));
    }

    /* renamed from: a */
    public void mo2754a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo2754a(recyclerView, i, i2, obj);
        m9576r(i);
    }

    /* renamed from: a */
    public void mo2799a(RecyclerView recyclerView, RecyclerView.C0518a0 a0Var, int i) {
        C0604k kVar = new C0604k(recyclerView.getContext());
        kVar.mo3355c(i);
        mo3213b((RecyclerView.C0555z) kVar);
    }

    /* renamed from: a */
    public void mo7566a(C2540c cVar) {
    }

    /* renamed from: a */
    public boolean mo7567a() {
        int i = this.f6455x;
        return i == 0 || i == 1;
    }

    /* renamed from: a */
    public boolean mo2755a(RecyclerView.C0543p pVar) {
        return pVar instanceof C2533c;
    }

    /* renamed from: b */
    public int mo7569b(int i, int i2, int i3) {
        return RecyclerView.C0538o.m2808a(mo3261o(), mo3263p(), i2, i3, mo2804b());
    }

    /* renamed from: b */
    public int mo2756b(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (mo7567a()) {
            int c = m9556c(i, vVar, a0Var);
            this.f6450S.clear();
            return c;
        }
        int q = m9573q(i);
        C2532b bVar = this.f6441J;
        int unused = bVar.f6461d = bVar.f6461d + q;
        this.f6443L.mo3568a(-q);
        return q;
    }

    /* renamed from: b */
    public int mo2757b(RecyclerView.C0518a0 a0Var) {
        return m9569i(a0Var);
    }

    /* renamed from: b */
    public View mo7570b(int i) {
        return mo7563a(i);
    }

    /* renamed from: b */
    public void mo3214b(RecyclerView recyclerView) {
        super.mo3214b(recyclerView);
        this.f6452U = (View) recyclerView.getParent();
    }

    /* renamed from: b */
    public void mo2759b(RecyclerView recyclerView, int i, int i2) {
        super.mo2759b(recyclerView, i, i2);
        m9576r(i);
    }

    /* renamed from: b */
    public void mo2802b(RecyclerView recyclerView, RecyclerView.C0550v vVar) {
        super.mo2802b(recyclerView, vVar);
        if (this.f6449R) {
            mo3212b(vVar);
            vVar.mo3306a();
        }
    }

    /* renamed from: b */
    public boolean mo2804b() {
        return !mo7567a() || mo3261o() > this.f6452U.getWidth();
    }

    /* renamed from: c */
    public int mo2760c(RecyclerView.C0518a0 a0Var) {
        return m9570j(a0Var);
    }

    /* renamed from: c */
    public PointF mo2806c(int i) {
        if (mo3231f() == 0) {
            return null;
        }
        int i2 = i < mo3258m(mo3233f(0)) ? -1 : 1;
        return mo7567a() ? new PointF(0.0f, (float) i2) : new PointF((float) i2, 0.0f);
    }

    /* renamed from: c */
    public void mo3222c(RecyclerView recyclerView, int i, int i2) {
        super.mo3222c(recyclerView, i, i2);
        m9576r(i);
    }

    /* renamed from: c */
    public boolean mo2807c() {
        return mo7567a() || mo3247i() > this.f6452U.getHeight();
    }

    /* renamed from: d */
    public int mo2808d(RecyclerView.C0518a0 a0Var) {
        return m9568h(a0Var);
    }

    /* renamed from: d */
    public RecyclerView.C0543p mo2762d() {
        return new C2533c(-2, -2);
    }

    /* renamed from: e */
    public int mo2764e(RecyclerView.C0518a0 a0Var) {
        return m9569i(a0Var);
    }

    /* renamed from: e */
    public void mo2765e(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        int i;
        int i2;
        this.f6438G = vVar;
        this.f6439H = a0Var;
        int a = a0Var.mo3025a();
        if (a != 0 || !a0Var.mo3030d()) {
            m9535K();
            m9532H();
            m9531G();
            this.f6437F.mo7667b(a);
            this.f6437F.mo7672c(a);
            this.f6437F.mo7654a(a);
            boolean unused = this.f6440I.f6484j = false;
            C2536e eVar = this.f6444M;
            if (eVar != null && eVar.m9680a(a)) {
                this.f6445N = this.f6444M.f6485f;
            }
            if (!(this.f6441J.f6463f && this.f6445N == -1 && this.f6444M == null)) {
                this.f6441J.m9631b();
                m9553b(a0Var, this.f6441J);
                boolean unused2 = this.f6441J.f6463f = true;
            }
            mo3186a(vVar);
            if (this.f6441J.f6462e) {
                m9555b(this.f6441J, false, true);
            } else {
                m9544a(this.f6441J, false, true);
            }
            m9578s(a);
            if (this.f6441J.f6462e) {
                m9537a(vVar, a0Var, this.f6440I);
                i2 = this.f6440I.f6479e;
                m9544a(this.f6441J, true, false);
                m9537a(vVar, a0Var, this.f6440I);
                i = this.f6440I.f6479e;
            } else {
                m9537a(vVar, a0Var, this.f6440I);
                i = this.f6440I.f6479e;
                m9555b(this.f6441J, true, false);
                m9537a(vVar, a0Var, this.f6440I);
                i2 = this.f6440I.f6479e;
            }
            if (mo3231f() <= 0) {
                return;
            }
            if (this.f6441J.f6462e) {
                m9549b(i2 + m9536a(i, vVar, a0Var, true), vVar, a0Var, false);
            } else {
                m9536a(i + m9549b(i2, vVar, a0Var, true), vVar, a0Var, false);
            }
        }
    }

    /* renamed from: f */
    public int mo2767f(RecyclerView.C0518a0 a0Var) {
        return m9570j(a0Var);
    }

    /* renamed from: g */
    public void mo2768g(RecyclerView.C0518a0 a0Var) {
        super.mo2768g(a0Var);
        this.f6444M = null;
        this.f6445N = -1;
        this.f6446O = RecyclerView.UNDEFINED_DURATION;
        this.f6453V = -1;
        this.f6441J.m9631b();
        this.f6450S.clear();
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.f6432A;
    }

    public int getFlexDirection() {
        return this.f6455x;
    }

    public int getFlexItemCount() {
        return this.f6439H.mo3025a();
    }

    public List<C2540c> getFlexLinesInternal() {
        return this.f6436E;
    }

    public int getFlexWrap() {
        return this.f6456y;
    }

    public int getLargestMainSize() {
        if (this.f6436E.size() == 0) {
            return 0;
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        int size = this.f6436E.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f6436E.get(i2).f6491e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f6433B;
    }

    public int getSumOfCrossSize() {
        int size = this.f6436E.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f6436E.get(i2).f6493g;
        }
        return i;
    }

    /* renamed from: k */
    public void mo2812k(int i) {
        this.f6445N = i;
        this.f6446O = RecyclerView.UNDEFINED_DURATION;
        C2536e eVar = this.f6444M;
        if (eVar != null) {
            eVar.m9685q();
        }
        mo3271y();
    }

    /* renamed from: l */
    public void mo7628l(int i) {
        int i2 = this.f6432A;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                mo3270x();
                m9530F();
            }
            this.f6432A = i;
            mo3271y();
        }
    }

    /* renamed from: m */
    public void mo7629m(int i) {
        if (this.f6455x != i) {
            mo3270x();
            this.f6455x = i;
            this.f6442K = null;
            this.f6443L = null;
            m9530F();
            mo3271y();
        }
    }

    /* renamed from: n */
    public void mo7630n(int i) {
        if (i != 2) {
            int i2 = this.f6456y;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    mo3270x();
                    m9530F();
                }
                this.f6456y = i;
                this.f6442K = null;
                this.f6443L = null;
                mo3271y();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public void setFlexLines(List<C2540c> list) {
        this.f6436E = list;
    }

    /* renamed from: w */
    public Parcelable mo2816w() {
        C2536e eVar = this.f6444M;
        if (eVar != null) {
            return new C2536e(eVar);
        }
        C2536e eVar2 = new C2536e();
        if (mo3231f() > 0) {
            View I = m9533I();
            int unused = eVar2.f6485f = mo3258m(I);
            int unused2 = eVar2.f6486g = this.f6442K.mo3574d(I) - this.f6442K.mo3577f();
        } else {
            eVar2.m9685q();
        }
        return eVar2;
    }
}
