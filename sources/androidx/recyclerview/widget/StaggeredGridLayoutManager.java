package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p006b.p026g.p035k.p036e0.C0857c;

public class StaggeredGridLayoutManager extends RecyclerView.C0538o implements RecyclerView.C0555z.C0557b {

    /* renamed from: A */
    C0609o f2259A;

    /* renamed from: B */
    private int f2260B;

    /* renamed from: C */
    private int f2261C;

    /* renamed from: D */
    private final C0603j f2262D;

    /* renamed from: E */
    boolean f2263E = false;

    /* renamed from: F */
    boolean f2264F = false;

    /* renamed from: G */
    private BitSet f2265G;

    /* renamed from: H */
    int f2266H = -1;

    /* renamed from: I */
    int f2267I = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: J */
    C0561d f2268J = new C0561d();

    /* renamed from: K */
    private int f2269K = 2;

    /* renamed from: L */
    private boolean f2270L;

    /* renamed from: M */
    private boolean f2271M;

    /* renamed from: N */
    private C0564e f2272N;

    /* renamed from: O */
    private int f2273O;

    /* renamed from: P */
    private final Rect f2274P = new Rect();

    /* renamed from: Q */
    private final C0559b f2275Q = new C0559b();

    /* renamed from: R */
    private boolean f2276R = false;

    /* renamed from: S */
    private boolean f2277S = true;

    /* renamed from: T */
    private int[] f2278T;

    /* renamed from: U */
    private final Runnable f2279U = new C0558a();

    /* renamed from: x */
    private int f2280x = -1;

    /* renamed from: y */
    C0566f[] f2281y;

    /* renamed from: z */
    C0609o f2282z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0558a implements Runnable {
        C0558a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo3367F();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0559b {

        /* renamed from: a */
        int f2284a;

        /* renamed from: b */
        int f2285b;

        /* renamed from: c */
        boolean f2286c;

        /* renamed from: d */
        boolean f2287d;

        /* renamed from: e */
        boolean f2288e;

        /* renamed from: f */
        int[] f2289f;

        C0559b() {
            mo3388b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3385a() {
            this.f2285b = this.f2286c ? StaggeredGridLayoutManager.this.f2282z.mo3569b() : StaggeredGridLayoutManager.this.f2282z.mo3577f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3386a(int i) {
            this.f2285b = this.f2286c ? StaggeredGridLayoutManager.this.f2282z.mo3569b() - i : StaggeredGridLayoutManager.this.f2282z.mo3577f() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3387a(C0566f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2289f;
            if (iArr == null || iArr.length < length) {
                this.f2289f = new int[StaggeredGridLayoutManager.this.f2281y.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2289f[i] = fVarArr[i].mo3422b((int) RecyclerView.UNDEFINED_DURATION);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3388b() {
            this.f2284a = -1;
            this.f2285b = RecyclerView.UNDEFINED_DURATION;
            this.f2286c = false;
            this.f2287d = false;
            this.f2288e = false;
            int[] iArr = this.f2289f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0560c extends RecyclerView.C0543p {

        /* renamed from: j */
        C0566f f2291j;

        /* renamed from: k */
        boolean f2292k;

        public C0560c(int i, int i2) {
            super(i, i2);
        }

        public C0560c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0560c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0560c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: r */
        public final int mo3389r() {
            C0566f fVar = this.f2291j;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2313e;
        }

        /* renamed from: s */
        public boolean mo3390s() {
            return this.f2292k;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C0561d {

        /* renamed from: a */
        int[] f2293a;

        /* renamed from: b */
        List<C0562a> f2294b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C0562a implements Parcelable {
            public static final Parcelable.Creator<C0562a> CREATOR = new C0563a();

            /* renamed from: f */
            int f2295f;

            /* renamed from: g */
            int f2296g;

            /* renamed from: h */
            int[] f2297h;

            /* renamed from: i */
            boolean f2298i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C0563a implements Parcelable.Creator<C0562a> {
                C0563a() {
                }

                public C0562a createFromParcel(Parcel parcel) {
                    return new C0562a(parcel);
                }

                public C0562a[] newArray(int i) {
                    return new C0562a[i];
                }
            }

            C0562a() {
            }

            C0562a(Parcel parcel) {
                this.f2295f = parcel.readInt();
                this.f2296g = parcel.readInt();
                this.f2298i = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f2297h = new int[readInt];
                    parcel.readIntArray(this.f2297h);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo3403a(int i) {
                int[] iArr = this.f2297h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2295f + ", mGapDir=" + this.f2296g + ", mHasUnwantedGapAfter=" + this.f2298i + ", mGapPerSpan=" + Arrays.toString(this.f2297h) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2295f);
                parcel.writeInt(this.f2296g);
                parcel.writeInt(this.f2298i ? 1 : 0);
                int[] iArr = this.f2297h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2297h);
            }
        }

        C0561d() {
        }

        /* renamed from: c */
        private void m3158c(int i, int i2) {
            List<C0562a> list = this.f2294b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0562a aVar = this.f2294b.get(size);
                    int i3 = aVar.f2295f;
                    if (i3 >= i) {
                        aVar.f2295f = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: d */
        private void m3159d(int i, int i2) {
            List<C0562a> list = this.f2294b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0562a aVar = this.f2294b.get(size);
                    int i4 = aVar.f2295f;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f2294b.remove(size);
                        } else {
                            aVar.f2295f = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        private int m3160g(int i) {
            if (this.f2294b == null) {
                return -1;
            }
            C0562a c = mo3399c(i);
            if (c != null) {
                this.f2294b.remove(c);
            }
            int size = this.f2294b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f2294b.get(i2).f2295f >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f2294b.remove(i2);
            return this.f2294b.get(i2).f2295f;
        }

        /* renamed from: a */
        public C0562a mo3391a(int i, int i2, int i3, boolean z) {
            List<C0562a> list = this.f2294b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0562a aVar = this.f2294b.get(i4);
                int i5 = aVar.f2295f;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f2296g == i3 || (z && aVar.f2298i))) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3392a() {
            int[] iArr = this.f2293a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2294b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3393a(int i) {
            int[] iArr = this.f2293a;
            if (iArr == null) {
                this.f2293a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f2293a, -1);
            } else if (i >= iArr.length) {
                this.f2293a = new int[mo3402f(i)];
                System.arraycopy(iArr, 0, this.f2293a, 0, iArr.length);
                int[] iArr2 = this.f2293a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3394a(int i, int i2) {
            int[] iArr = this.f2293a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3393a(i3);
                int[] iArr2 = this.f2293a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2293a, i, i3, -1);
                m3158c(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3395a(int i, C0566f fVar) {
            mo3393a(i);
            this.f2293a[i] = fVar.f2313e;
        }

        /* renamed from: a */
        public void mo3396a(C0562a aVar) {
            if (this.f2294b == null) {
                this.f2294b = new ArrayList();
            }
            int size = this.f2294b.size();
            for (int i = 0; i < size; i++) {
                C0562a aVar2 = this.f2294b.get(i);
                if (aVar2.f2295f == aVar.f2295f) {
                    this.f2294b.remove(i);
                }
                if (aVar2.f2295f >= aVar.f2295f) {
                    this.f2294b.add(i, aVar);
                    return;
                }
            }
            this.f2294b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3397b(int i) {
            List<C0562a> list = this.f2294b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2294b.get(size).f2295f >= i) {
                        this.f2294b.remove(size);
                    }
                }
            }
            return mo3401e(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3398b(int i, int i2) {
            int[] iArr = this.f2293a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3393a(i3);
                int[] iArr2 = this.f2293a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2293a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m3159d(i, i2);
            }
        }

        /* renamed from: c */
        public C0562a mo3399c(int i) {
            List<C0562a> list = this.f2294b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0562a aVar = this.f2294b.get(size);
                if (aVar.f2295f == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo3400d(int i) {
            int[] iArr = this.f2293a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3401e(int i) {
            int[] iArr = this.f2293a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m3160g(i);
            if (g == -1) {
                int[] iArr2 = this.f2293a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2293a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2293a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo3402f(int i) {
            int length = this.f2293a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0564e implements Parcelable {
        public static final Parcelable.Creator<C0564e> CREATOR = new C0565a();

        /* renamed from: f */
        int f2299f;

        /* renamed from: g */
        int f2300g;

        /* renamed from: h */
        int f2301h;

        /* renamed from: i */
        int[] f2302i;

        /* renamed from: j */
        int f2303j;

        /* renamed from: k */
        int[] f2304k;

        /* renamed from: l */
        List<C0561d.C0562a> f2305l;

        /* renamed from: m */
        boolean f2306m;

        /* renamed from: n */
        boolean f2307n;

        /* renamed from: o */
        boolean f2308o;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C0565a implements Parcelable.Creator<C0564e> {
            C0565a() {
            }

            public C0564e createFromParcel(Parcel parcel) {
                return new C0564e(parcel);
            }

            public C0564e[] newArray(int i) {
                return new C0564e[i];
            }
        }

        public C0564e() {
        }

        C0564e(Parcel parcel) {
            this.f2299f = parcel.readInt();
            this.f2300g = parcel.readInt();
            this.f2301h = parcel.readInt();
            int i = this.f2301h;
            if (i > 0) {
                this.f2302i = new int[i];
                parcel.readIntArray(this.f2302i);
            }
            this.f2303j = parcel.readInt();
            int i2 = this.f2303j;
            if (i2 > 0) {
                this.f2304k = new int[i2];
                parcel.readIntArray(this.f2304k);
            }
            boolean z = false;
            this.f2306m = parcel.readInt() == 1;
            this.f2307n = parcel.readInt() == 1;
            this.f2308o = parcel.readInt() == 1 ? true : z;
            this.f2305l = parcel.readArrayList(C0561d.C0562a.class.getClassLoader());
        }

        public C0564e(C0564e eVar) {
            this.f2301h = eVar.f2301h;
            this.f2299f = eVar.f2299f;
            this.f2300g = eVar.f2300g;
            this.f2302i = eVar.f2302i;
            this.f2303j = eVar.f2303j;
            this.f2304k = eVar.f2304k;
            this.f2306m = eVar.f2306m;
            this.f2307n = eVar.f2307n;
            this.f2308o = eVar.f2308o;
            this.f2305l = eVar.f2305l;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3410q() {
            this.f2302i = null;
            this.f2301h = 0;
            this.f2299f = -1;
            this.f2300g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3411r() {
            this.f2302i = null;
            this.f2301h = 0;
            this.f2303j = 0;
            this.f2304k = null;
            this.f2305l = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2299f);
            parcel.writeInt(this.f2300g);
            parcel.writeInt(this.f2301h);
            if (this.f2301h > 0) {
                parcel.writeIntArray(this.f2302i);
            }
            parcel.writeInt(this.f2303j);
            if (this.f2303j > 0) {
                parcel.writeIntArray(this.f2304k);
            }
            parcel.writeInt(this.f2306m ? 1 : 0);
            parcel.writeInt(this.f2307n ? 1 : 0);
            parcel.writeInt(this.f2308o ? 1 : 0);
            parcel.writeList(this.f2305l);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C0566f {

        /* renamed from: a */
        ArrayList<View> f2309a = new ArrayList<>();

        /* renamed from: b */
        int f2310b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        int f2311c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        int f2312d = 0;

        /* renamed from: e */
        final int f2313e;

        C0566f(int i) {
            this.f2313e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3415a(int i) {
            int i2 = this.f2311c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2309a.size() == 0) {
                return i;
            }
            mo3419a();
            return this.f2311c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3416a(int i, int i2, boolean z) {
            return mo3417a(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo3417a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f2282z.mo3577f();
            int b = StaggeredGridLayoutManager.this.f2282z.mo3569b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2309a.get(i);
                int d = StaggeredGridLayoutManager.this.f2282z.mo3574d(view);
                int a = StaggeredGridLayoutManager.this.f2282z.mo3567a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d >= f && a <= b) {
                        }
                    } else if (d >= f && a <= b) {
                    }
                    return StaggeredGridLayoutManager.this.mo3258m(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View mo3418a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2309a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2309a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2263E && staggeredGridLayoutManager.mo3258m(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2263E && staggeredGridLayoutManager2.mo3258m(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2309a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2309a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2263E && staggeredGridLayoutManager3.mo3258m(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2263E && staggeredGridLayoutManager4.mo3258m(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3419a() {
            C0561d.C0562a c;
            ArrayList<View> arrayList = this.f2309a;
            View view = arrayList.get(arrayList.size() - 1);
            C0560c b = mo3423b(view);
            this.f2311c = StaggeredGridLayoutManager.this.f2282z.mo3567a(view);
            if (b.f2292k && (c = StaggeredGridLayoutManager.this.f2268J.mo3399c(b.mo3279n())) != null && c.f2296g == 1) {
                this.f2311c += c.mo3403a(this.f2313e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3420a(View view) {
            C0560c b = mo3423b(view);
            b.f2291j = this;
            this.f2309a.add(view);
            this.f2311c = RecyclerView.UNDEFINED_DURATION;
            if (this.f2309a.size() == 1) {
                this.f2310b = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo3281p() || b.mo3280o()) {
                this.f2312d += StaggeredGridLayoutManager.this.f2282z.mo3570b(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3421a(boolean z, int i) {
            int a = z ? mo3415a((int) RecyclerView.UNDEFINED_DURATION) : mo3422b((int) RecyclerView.UNDEFINED_DURATION);
            mo3425c();
            if (a != Integer.MIN_VALUE) {
                if (z && a < StaggeredGridLayoutManager.this.f2282z.mo3569b()) {
                    return;
                }
                if (z || a <= StaggeredGridLayoutManager.this.f2282z.mo3577f()) {
                    if (i != Integer.MIN_VALUE) {
                        a += i;
                    }
                    this.f2311c = a;
                    this.f2310b = a;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3422b(int i) {
            int i2 = this.f2310b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2309a.size() == 0) {
                return i;
            }
            mo3424b();
            return this.f2310b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0560c mo3423b(View view) {
            return (C0560c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3424b() {
            C0561d.C0562a c;
            View view = this.f2309a.get(0);
            C0560c b = mo3423b(view);
            this.f2310b = StaggeredGridLayoutManager.this.f2282z.mo3574d(view);
            if (b.f2292k && (c = StaggeredGridLayoutManager.this.f2268J.mo3399c(b.mo3279n())) != null && c.f2296g == -1) {
                this.f2310b -= c.mo3403a(this.f2313e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3425c() {
            this.f2309a.clear();
            mo3434i();
            this.f2312d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3426c(int i) {
            int i2 = this.f2310b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2310b = i2 + i;
            }
            int i3 = this.f2311c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2311c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3427c(View view) {
            C0560c b = mo3423b(view);
            b.f2291j = this;
            this.f2309a.add(0, view);
            this.f2310b = RecyclerView.UNDEFINED_DURATION;
            if (this.f2309a.size() == 1) {
                this.f2311c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo3281p() || b.mo3280o()) {
                this.f2312d += StaggeredGridLayoutManager.this.f2282z.mo3570b(view);
            }
        }

        /* renamed from: d */
        public int mo3428d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2263E) {
                i2 = this.f2309a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f2309a.size();
            }
            return mo3416a(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3429d(int i) {
            this.f2310b = i;
            this.f2311c = i;
        }

        /* renamed from: e */
        public int mo3430e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2263E) {
                i2 = 0;
                i = this.f2309a.size();
            } else {
                i2 = this.f2309a.size() - 1;
                i = -1;
            }
            return mo3416a(i2, i, true);
        }

        /* renamed from: f */
        public int mo3431f() {
            return this.f2312d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo3432g() {
            int i = this.f2311c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3419a();
            return this.f2311c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo3433h() {
            int i = this.f2310b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3424b();
            return this.f2310b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo3434i() {
            this.f2310b = RecyclerView.UNDEFINED_DURATION;
            this.f2311c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo3435j() {
            int size = this.f2309a.size();
            View remove = this.f2309a.remove(size - 1);
            C0560c b = mo3423b(remove);
            b.f2291j = null;
            if (b.mo3281p() || b.mo3280o()) {
                this.f2312d -= StaggeredGridLayoutManager.this.f2282z.mo3570b(remove);
            }
            if (size == 1) {
                this.f2310b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f2311c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo3436k() {
            View remove = this.f2309a.remove(0);
            C0560c b = mo3423b(remove);
            b.f2291j = null;
            if (this.f2309a.size() == 0) {
                this.f2311c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo3281p() || b.mo3280o()) {
                this.f2312d -= StaggeredGridLayoutManager.this.f2282z.mo3570b(remove);
            }
            this.f2310b = RecyclerView.UNDEFINED_DURATION;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0538o.C0542d a = RecyclerView.C0538o.m2809a(context, attributeSet, i, i2);
        mo3381l(a.f2219a);
        mo3382m(a.f2220b);
        mo3380d(a.f2221c);
        this.f2262D = new C0603j();
        m3054M();
    }

    /* renamed from: M */
    private void m3054M() {
        this.f2282z = C0609o.m3400a(this, this.f2260B);
        this.f2259A = C0609o.m3400a(this, 1 - this.f2260B);
    }

    /* renamed from: N */
    private void m3055N() {
        if (this.f2259A.mo3573d() != 1073741824) {
            int f = mo3231f();
            float f2 = 0.0f;
            for (int i = 0; i < f; i++) {
                View f3 = mo3233f(i);
                float b = (float) this.f2259A.mo3570b(f3);
                if (b >= f2) {
                    if (((C0560c) f3.getLayoutParams()).mo3390s()) {
                        b = (b * 1.0f) / ((float) this.f2280x);
                    }
                    f2 = Math.max(f2, b);
                }
            }
            int i2 = this.f2261C;
            int round = Math.round(f2 * ((float) this.f2280x));
            if (this.f2259A.mo3573d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2259A.mo3579g());
            }
            mo3383n(round);
            if (this.f2261C != i2) {
                for (int i3 = 0; i3 < f; i3++) {
                    View f4 = mo3233f(i3);
                    C0560c cVar = (C0560c) f4.getLayoutParams();
                    if (!cVar.f2292k) {
                        if (!mo3373L() || this.f2260B != 1) {
                            int i4 = cVar.f2291j.f2313e;
                            int i5 = this.f2260B;
                            int i6 = (this.f2261C * i4) - (i4 * i2);
                            if (i5 == 1) {
                                f4.offsetLeftAndRight(i6);
                            } else {
                                f4.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f2280x;
                            int i8 = cVar.f2291j.f2313e;
                            f4.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f2261C) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: O */
    private void m3056O() {
        this.f2264F = (this.f2260B == 1 || !mo3373L()) ? this.f2263E : !this.f2263E;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* renamed from: a */
    private int m3057a(RecyclerView.C0550v vVar, C0603j jVar, RecyclerView.C0518a0 a0Var) {
        int i;
        C0566f fVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.C0550v vVar2 = vVar;
        C0603j jVar2 = jVar;
        ? r9 = 0;
        this.f2265G.set(0, this.f2280x, true);
        if (this.f2262D.f2468i) {
            i = jVar2.f2464e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = jVar2.f2464e == 1 ? jVar2.f2466g + jVar2.f2461b : jVar2.f2465f - jVar2.f2461b;
        }
        m3075e(jVar2.f2464e, i);
        int b = this.f2264F ? this.f2282z.mo3569b() : this.f2282z.mo3577f();
        boolean z = false;
        while (jVar.mo3549a(a0Var) && (this.f2262D.f2468i || !this.f2265G.isEmpty())) {
            View a = jVar2.mo3548a(vVar2);
            C0560c cVar = (C0560c) a.getLayoutParams();
            int n = cVar.mo3279n();
            int d = this.f2268J.mo3400d(n);
            boolean z2 = d == -1;
            if (z2) {
                fVar = cVar.f2292k ? this.f2281y[r9] : m3058a(jVar2);
                this.f2268J.mo3395a(n, fVar);
            } else {
                fVar = this.f2281y[d];
            }
            C0566f fVar2 = fVar;
            cVar.f2291j = fVar2;
            if (jVar2.f2464e == 1) {
                mo3218c(a);
            } else {
                mo3209b(a, (int) r9);
            }
            m3061a(a, cVar, (boolean) r9);
            if (jVar2.f2464e == 1) {
                int u = cVar.f2292k ? m3087u(b) : fVar2.mo3415a(b);
                int b2 = this.f2282z.mo3570b(a) + u;
                if (z2 && cVar.f2292k) {
                    C0561d.C0562a q = m3081q(u);
                    q.f2296g = -1;
                    q.f2295f = n;
                    this.f2268J.mo3396a(q);
                }
                i2 = b2;
                i3 = u;
            } else {
                int x = cVar.f2292k ? m3090x(b) : fVar2.mo3422b(b);
                i3 = x - this.f2282z.mo3570b(a);
                if (z2 && cVar.f2292k) {
                    C0561d.C0562a r = m3083r(x);
                    r.f2296g = 1;
                    r.f2295f = n;
                    this.f2268J.mo3396a(r);
                }
                i2 = x;
            }
            if (cVar.f2292k && jVar2.f2463d == -1) {
                if (!z2) {
                    if (!(jVar2.f2464e == 1 ? mo3365D() : mo3366E())) {
                        C0561d.C0562a c = this.f2268J.mo3399c(n);
                        if (c != null) {
                            c.f2298i = true;
                        }
                    }
                }
                this.f2276R = true;
            }
            m3060a(a, cVar, jVar2);
            if (!mo3373L() || this.f2260B != 1) {
                int f = cVar.f2292k ? this.f2259A.mo3577f() : (fVar2.f2313e * this.f2261C) + this.f2259A.mo3577f();
                i5 = f;
                i4 = this.f2259A.mo3570b(a) + f;
            } else {
                int b3 = cVar.f2292k ? this.f2259A.mo3569b() : this.f2259A.mo3569b() - (((this.f2280x - 1) - fVar2.f2313e) * this.f2261C);
                i4 = b3;
                i5 = b3 - this.f2259A.mo3570b(a);
            }
            if (this.f2260B == 1) {
                staggeredGridLayoutManager = this;
                view = a;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = a;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo3179a(view, i7, i5, i6, i2);
            if (cVar.f2292k) {
                m3075e(this.f2262D.f2464e, i);
            } else {
                m3066a(fVar2, this.f2262D.f2464e, i);
            }
            m3064a(vVar2, this.f2262D);
            if (this.f2262D.f2467h && a.hasFocusable()) {
                if (cVar.f2292k) {
                    this.f2265G.clear();
                } else {
                    this.f2265G.set(fVar2.f2313e, false);
                    z = true;
                    r9 = 0;
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            m3064a(vVar2, this.f2262D);
        }
        int f2 = this.f2262D.f2464e == -1 ? this.f2282z.mo3577f() - m3090x(this.f2282z.mo3577f()) : m3087u(this.f2282z.mo3569b()) - this.f2282z.mo3569b();
        if (f2 > 0) {
            return Math.min(jVar2.f2461b, f2);
        }
        return 0;
    }

    /* renamed from: a */
    private C0566f m3058a(C0603j jVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3091y(jVar.f2464e)) {
            i2 = this.f2280x - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2280x;
            i = 1;
        }
        C0566f fVar = null;
        if (jVar.f2464e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f2282z.mo3577f();
            while (i2 != i3) {
                C0566f fVar2 = this.f2281y[i2];
                int a = fVar2.mo3415a(f);
                if (a < i4) {
                    fVar = fVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int b = this.f2282z.mo3569b();
        while (i2 != i3) {
            C0566f fVar3 = this.f2281y[i2];
            int b2 = fVar3.mo3422b(b);
            if (b2 > i5) {
                fVar = fVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return fVar;
    }

    /* renamed from: a */
    private void m3059a(View view, int i, int i2, boolean z) {
        mo3181a(view, this.f2274P);
        C0560c cVar = (C0560c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f2274P;
        int e = m3074e(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f2274P;
        int e2 = m3074e(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z ? mo3215b(view, e, e2, cVar) : mo3196a(view, e, e2, (RecyclerView.C0543p) cVar)) {
            view.measure(e, e2);
        }
    }

    /* renamed from: a */
    private void m3060a(View view, C0560c cVar, C0603j jVar) {
        if (jVar.f2464e == 1) {
            if (cVar.f2292k) {
                m3082q(view);
            } else {
                cVar.f2291j.mo3420a(view);
            }
        } else if (cVar.f2292k) {
            m3084r(view);
        } else {
            cVar.f2291j.mo3427c(view);
        }
    }

    /* renamed from: a */
    private void m3061a(View view, C0560c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f2292k) {
            if (this.f2260B == 1) {
                i2 = this.f2273O;
            } else {
                m3059a(view, RecyclerView.C0538o.m2808a(mo3261o(), mo3263p(), getPaddingLeft() + getPaddingRight(), cVar.width, true), this.f2273O, z);
                return;
            }
        } else if (this.f2260B == 1) {
            i2 = RecyclerView.C0538o.m2808a(this.f2261C, mo3263p(), 0, cVar.width, false);
        } else {
            i2 = RecyclerView.C0538o.m2808a(mo3261o(), mo3263p(), getPaddingLeft() + getPaddingRight(), cVar.width, true);
            i = RecyclerView.C0538o.m2808a(this.f2261C, mo3250j(), 0, cVar.height, false);
            m3059a(view, i2, i, z);
        }
        i = RecyclerView.C0538o.m2808a(mo3247i(), mo3250j(), getPaddingTop() + getPaddingBottom(), cVar.height, true);
        m3059a(view, i2, i, z);
    }

    /* renamed from: a */
    private void m3062a(RecyclerView.C0550v vVar, int i) {
        int f = mo3231f() - 1;
        while (f >= 0) {
            View f2 = mo3233f(f);
            if (this.f2282z.mo3574d(f2) >= i && this.f2282z.mo3578f(f2) >= i) {
                C0560c cVar = (C0560c) f2.getLayoutParams();
                if (cVar.f2292k) {
                    int i2 = 0;
                    while (i2 < this.f2280x) {
                        if (this.f2281y[i2].f2309a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2280x; i3++) {
                        this.f2281y[i3].mo3435j();
                    }
                } else if (cVar.f2291j.f2309a.size() != 1) {
                    cVar.f2291j.mo3435j();
                } else {
                    return;
                }
                mo3182a(f2, vVar);
                f--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m3063a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int b;
        int u = m3087u(RecyclerView.UNDEFINED_DURATION);
        if (u != Integer.MIN_VALUE && (b = this.f2282z.mo3569b() - u) > 0) {
            int i = b - (-mo3378c(-b, vVar, a0Var));
            if (z && i > 0) {
                this.f2282z.mo3568a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f2464e == -1) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3064a(androidx.recyclerview.widget.RecyclerView.C0550v r3, androidx.recyclerview.widget.C0603j r4) {
        /*
            r2 = this;
            boolean r0 = r4.f2460a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f2468i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f2461b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f2464e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f2466g
        L_0x0014:
            r2.m3062a((androidx.recyclerview.widget.RecyclerView.C0550v) r3, (int) r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f2465f
        L_0x001a:
            r2.m3069b((androidx.recyclerview.widget.RecyclerView.C0550v) r3, (int) r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f2464e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f2465f
            int r1 = r2.m3088v(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f2466g
            int r4 = r4.f2461b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f2466g
            int r0 = r2.m3089w(r0)
            int r1 = r4.f2466g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f2465f
            int r4 = r4.f2461b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3064a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.j):void");
    }

    /* renamed from: a */
    private void m3065a(C0559b bVar) {
        boolean z;
        C0564e eVar = this.f2272N;
        int i = eVar.f2301h;
        if (i > 0) {
            if (i == this.f2280x) {
                for (int i2 = 0; i2 < this.f2280x; i2++) {
                    this.f2281y[i2].mo3425c();
                    C0564e eVar2 = this.f2272N;
                    int i3 = eVar2.f2302i[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f2307n ? this.f2282z.mo3569b() : this.f2282z.mo3577f();
                    }
                    this.f2281y[i2].mo3429d(i3);
                }
            } else {
                eVar.mo3411r();
                C0564e eVar3 = this.f2272N;
                eVar3.f2299f = eVar3.f2300g;
            }
        }
        C0564e eVar4 = this.f2272N;
        this.f2271M = eVar4.f2308o;
        mo3380d(eVar4.f2306m);
        m3056O();
        C0564e eVar5 = this.f2272N;
        int i4 = eVar5.f2299f;
        if (i4 != -1) {
            this.f2266H = i4;
            z = eVar5.f2307n;
        } else {
            z = this.f2264F;
        }
        bVar.f2286c = z;
        C0564e eVar6 = this.f2272N;
        if (eVar6.f2303j > 1) {
            C0561d dVar = this.f2268J;
            dVar.f2293a = eVar6.f2304k;
            dVar.f2294b = eVar6.f2305l;
        }
    }

    /* renamed from: a */
    private void m3066a(C0566f fVar, int i, int i2) {
        int f = fVar.mo3431f();
        if (i == -1) {
            if (fVar.mo3433h() + f > i2) {
                return;
            }
        } else if (fVar.mo3432g() - f < i2) {
            return;
        }
        this.f2265G.set(fVar.f2313e, false);
    }

    /* renamed from: a */
    private boolean m3067a(C0566f fVar) {
        if (this.f2264F) {
            if (fVar.mo3432g() < this.f2282z.mo3569b()) {
                ArrayList<View> arrayList = fVar.f2309a;
                return !fVar.mo3423b(arrayList.get(arrayList.size() - 1)).f2292k;
            }
        } else if (fVar.mo3433h() > this.f2282z.mo3577f()) {
            return !fVar.mo3423b(fVar.f2309a.get(0)).f2292k;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3068b(int r5, androidx.recyclerview.widget.RecyclerView.C0518a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.j r0 = r4.f2262D
            r1 = 0
            r0.f2461b = r1
            r0.f2462c = r5
            boolean r0 = r4.mo3269v()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo3028b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2264F
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.o r5 = r4.f2282z
            int r5 = r5.mo3579g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.o r5 = r4.f2282z
            int r5 = r5.mo3579g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo3237g()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.j r0 = r4.f2262D
            androidx.recyclerview.widget.o r3 = r4.f2282z
            int r3 = r3.mo3577f()
            int r3 = r3 - r6
            r0.f2465f = r3
            androidx.recyclerview.widget.j r6 = r4.f2262D
            androidx.recyclerview.widget.o r0 = r4.f2282z
            int r0 = r0.mo3569b()
            int r0 = r0 + r5
            r6.f2466g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.j r0 = r4.f2262D
            androidx.recyclerview.widget.o r3 = r4.f2282z
            int r3 = r3.mo3566a()
            int r3 = r3 + r5
            r0.f2466g = r3
            androidx.recyclerview.widget.j r5 = r4.f2262D
            int r6 = -r6
            r5.f2465f = r6
        L_0x005d:
            androidx.recyclerview.widget.j r5 = r4.f2262D
            r5.f2467h = r1
            r5.f2460a = r2
            androidx.recyclerview.widget.o r6 = r4.f2282z
            int r6 = r6.mo3573d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.o r6 = r4.f2282z
            int r6 = r6.mo3566a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f2468i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3068b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: b */
    private void m3069b(RecyclerView.C0550v vVar, int i) {
        while (mo3231f() > 0) {
            View f = mo3233f(0);
            if (this.f2282z.mo3567a(f) <= i && this.f2282z.mo3576e(f) <= i) {
                C0560c cVar = (C0560c) f.getLayoutParams();
                if (cVar.f2292k) {
                    int i2 = 0;
                    while (i2 < this.f2280x) {
                        if (this.f2281y[i2].f2309a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f2280x; i3++) {
                        this.f2281y[i3].mo3436k();
                    }
                } else if (cVar.f2291j.f2309a.size() != 1) {
                    cVar.f2291j.mo3436k();
                } else {
                    return;
                }
                mo3182a(f, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m3070b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, boolean z) {
        int f;
        int x = m3090x(Integer.MAX_VALUE);
        if (x != Integer.MAX_VALUE && (f = x - this.f2282z.mo3577f()) > 0) {
            int c = f - mo3378c(f, vVar, a0Var);
            if (z && c > 0) {
                this.f2282z.mo3568a(-c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo3367F() != false) goto L_0x014f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3071c(androidx.recyclerview.widget.RecyclerView.C0550v r9, androidx.recyclerview.widget.RecyclerView.C0518a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f2275Q
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2272N
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2266H
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo3025a()
            if (r1 != 0) goto L_0x0018
            r8.mo3212b((androidx.recyclerview.widget.RecyclerView.C0550v) r9)
            r0.mo3388b()
            return
        L_0x0018:
            boolean r1 = r0.f2288e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2266H
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2272N
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo3388b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2272N
            if (r5 == 0) goto L_0x0037
            r8.m3065a((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0559b) r0)
            goto L_0x003e
        L_0x0037:
            r8.m3056O()
            boolean r5 = r8.f2264F
            r0.f2286c = r5
        L_0x003e:
            r8.mo3377b((androidx.recyclerview.widget.RecyclerView.C0518a0) r10, (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0559b) r0)
            r0.f2288e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2272N
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2266H
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2286c
            boolean r6 = r8.f2270L
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo3373L()
            boolean r6 = r8.f2271M
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f2268J
            r5.mo3392a()
            r0.f2287d = r4
        L_0x0060:
            int r5 = r8.mo3231f()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2272N
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2301h
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f2287d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f2280x
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2281y
            r5 = r5[r1]
            r5.mo3425c()
            int r5 = r0.f2285b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f2281y
            r6 = r6[r1]
            r6.mo3429d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2275Q
            int[] r1 = r1.f2289f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f2280x
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2281y
            r5 = r5[r1]
            r5.mo3425c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f2275Q
            int[] r6 = r6.f2289f
            r6 = r6[r1]
            r5.mo3429d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f2280x
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2281y
            r5 = r5[r1]
            boolean r6 = r8.f2264F
            int r7 = r0.f2285b
            r5.mo3421a((boolean) r6, (int) r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2275Q
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2281y
            r1.mo3387a((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0566f[]) r5)
        L_0x00c9:
            r8.mo3186a((androidx.recyclerview.widget.RecyclerView.C0550v) r9)
            androidx.recyclerview.widget.j r1 = r8.f2262D
            r1.f2460a = r3
            r8.f2276R = r3
            androidx.recyclerview.widget.o r1 = r8.f2259A
            int r1 = r1.mo3579g()
            r8.mo3383n(r1)
            int r1 = r0.f2284a
            r8.m3068b((int) r1, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10)
            boolean r1 = r0.f2286c
            if (r1 == 0) goto L_0x00f0
            r8.m3092z(r2)
            androidx.recyclerview.widget.j r1 = r8.f2262D
            r8.m3057a((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.C0603j) r1, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10)
            r8.m3092z(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m3092z(r4)
            androidx.recyclerview.widget.j r1 = r8.f2262D
            r8.m3057a((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.C0603j) r1, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10)
            r8.m3092z(r2)
        L_0x00fb:
            androidx.recyclerview.widget.j r1 = r8.f2262D
            int r2 = r0.f2284a
            int r5 = r1.f2463d
            int r2 = r2 + r5
            r1.f2462c = r2
            r8.m3057a((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.C0603j) r1, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10)
            r8.m3055N()
            int r1 = r8.mo3231f()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f2264F
            if (r1 == 0) goto L_0x011b
            r8.m3063a((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10, (boolean) r4)
            r8.m3070b((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10, (boolean) r3)
            goto L_0x0121
        L_0x011b:
            r8.m3070b((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10, (boolean) r4)
            r8.m3063a((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10, (boolean) r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo3030d()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f2269K
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo3231f()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f2276R
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo3371J()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f2279U
            r8.mo3206a((java.lang.Runnable) r11)
            boolean r11 = r8.mo3367F()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.mo3030d()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2275Q
            r11.mo3388b()
        L_0x015a:
            boolean r11 = r0.f2286c
            r8.f2270L = r11
            boolean r11 = r8.mo3373L()
            r8.f2271M = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2275Q
            r11.mo3388b()
            r8.m3071c((androidx.recyclerview.widget.RecyclerView.C0550v) r9, (androidx.recyclerview.widget.RecyclerView.C0518a0) r10, (boolean) r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3071c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: c */
    private boolean m3072c(RecyclerView.C0518a0 a0Var, C0559b bVar) {
        boolean z = this.f2270L;
        int a = a0Var.mo3025a();
        bVar.f2284a = z ? m3086t(a) : m3085s(a);
        bVar.f2285b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3073d(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2264F
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo3370I()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo3369H()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2268J
            r4.mo3401e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2268J
            r9.mo3398b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f2268J
            r7.mo3394a((int) r8, (int) r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2268J
            r9.mo3398b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2268J
            r9.mo3394a((int) r7, (int) r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f2264F
            if (r7 == 0) goto L_0x004f
            int r7 = r6.mo3369H()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.mo3370I()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.mo3271y()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3073d(int, int, int):void");
    }

    /* renamed from: e */
    private int m3074e(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: e */
    private void m3075e(int i, int i2) {
        for (int i3 = 0; i3 < this.f2280x; i3++) {
            if (!this.f2281y[i3].f2309a.isEmpty()) {
                m3066a(this.f2281y[i3], i, i2);
            }
        }
    }

    /* renamed from: h */
    private int m3076h(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        return C0614q.m3453a(a0Var, this.f2282z, mo3379c(!this.f2277S), mo3376b(!this.f2277S), this, this.f2277S);
    }

    /* renamed from: i */
    private int m3077i(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        return C0614q.m3454a(a0Var, this.f2282z, mo3379c(!this.f2277S), mo3376b(!this.f2277S), this, this.f2277S, this.f2264F);
    }

    /* renamed from: j */
    private int m3078j(RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0) {
            return 0;
        }
        return C0614q.m3455b(a0Var, this.f2282z, mo3379c(!this.f2277S), mo3376b(!this.f2277S), this, this.f2277S);
    }

    /* renamed from: o */
    private int m3079o(int i) {
        if (mo3231f() == 0) {
            return this.f2264F ? 1 : -1;
        }
        return (i < mo3369H()) != this.f2264F ? -1 : 1;
    }

    /* renamed from: p */
    private int m3080p(int i) {
        if (i == 1) {
            return (this.f2260B != 1 && mo3373L()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2260B != 1 && mo3373L()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.f2260B == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.f2260B == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f2260B == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.f2260B == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: q */
    private C0561d.C0562a m3081q(int i) {
        C0561d.C0562a aVar = new C0561d.C0562a();
        aVar.f2297h = new int[this.f2280x];
        for (int i2 = 0; i2 < this.f2280x; i2++) {
            aVar.f2297h[i2] = i - this.f2281y[i2].mo3415a(i);
        }
        return aVar;
    }

    /* renamed from: q */
    private void m3082q(View view) {
        for (int i = this.f2280x - 1; i >= 0; i--) {
            this.f2281y[i].mo3420a(view);
        }
    }

    /* renamed from: r */
    private C0561d.C0562a m3083r(int i) {
        C0561d.C0562a aVar = new C0561d.C0562a();
        aVar.f2297h = new int[this.f2280x];
        for (int i2 = 0; i2 < this.f2280x; i2++) {
            aVar.f2297h[i2] = this.f2281y[i2].mo3422b(i) - i;
        }
        return aVar;
    }

    /* renamed from: r */
    private void m3084r(View view) {
        for (int i = this.f2280x - 1; i >= 0; i--) {
            this.f2281y[i].mo3427c(view);
        }
    }

    /* renamed from: s */
    private int m3085s(int i) {
        int f = mo3231f();
        for (int i2 = 0; i2 < f; i2++) {
            int m = mo3258m(mo3233f(i2));
            if (m >= 0 && m < i) {
                return m;
            }
        }
        return 0;
    }

    /* renamed from: t */
    private int m3086t(int i) {
        for (int f = mo3231f() - 1; f >= 0; f--) {
            int m = mo3258m(mo3233f(f));
            if (m >= 0 && m < i) {
                return m;
            }
        }
        return 0;
    }

    /* renamed from: u */
    private int m3087u(int i) {
        int a = this.f2281y[0].mo3415a(i);
        for (int i2 = 1; i2 < this.f2280x; i2++) {
            int a2 = this.f2281y[i2].mo3415a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: v */
    private int m3088v(int i) {
        int b = this.f2281y[0].mo3422b(i);
        for (int i2 = 1; i2 < this.f2280x; i2++) {
            int b2 = this.f2281y[i2].mo3422b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: w */
    private int m3089w(int i) {
        int a = this.f2281y[0].mo3415a(i);
        for (int i2 = 1; i2 < this.f2280x; i2++) {
            int a2 = this.f2281y[i2].mo3415a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: x */
    private int m3090x(int i) {
        int b = this.f2281y[0].mo3422b(i);
        for (int i2 = 1; i2 < this.f2280x; i2++) {
            int b2 = this.f2281y[i2].mo3422b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: y */
    private boolean m3091y(int i) {
        if (this.f2260B == 0) {
            return (i == -1) != this.f2264F;
        }
        return ((i == -1) == this.f2264F) == mo3373L();
    }

    /* renamed from: z */
    private void m3092z(int i) {
        C0603j jVar = this.f2262D;
        jVar.f2464e = i;
        int i2 = 1;
        if (this.f2264F != (i == -1)) {
            i2 = -1;
        }
        jVar.f2463d = i2;
    }

    /* renamed from: C */
    public boolean mo2739C() {
        return this.f2272N == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3365D() {
        int a = this.f2281y[0].mo3415a((int) RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f2280x; i++) {
            if (this.f2281y[i].mo3415a((int) RecyclerView.UNDEFINED_DURATION) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3366E() {
        int b = this.f2281y[0].mo3422b((int) RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f2280x; i++) {
            if (this.f2281y[i].mo3422b((int) RecyclerView.UNDEFINED_DURATION) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo3367F() {
        int i;
        int i2;
        if (mo3231f() == 0 || this.f2269K == 0 || !mo3266r()) {
            return false;
        }
        if (this.f2264F) {
            i2 = mo3370I();
            i = mo3369H();
        } else {
            i2 = mo3369H();
            i = mo3370I();
        }
        if (i2 == 0 && mo3371J() != null) {
            this.f2268J.mo3392a();
        } else if (!this.f2276R) {
            return false;
        } else {
            int i3 = this.f2264F ? -1 : 1;
            int i4 = i + 1;
            C0561d.C0562a a = this.f2268J.mo3391a(i2, i4, i3, true);
            if (a == null) {
                this.f2276R = false;
                this.f2268J.mo3397b(i4);
                return false;
            }
            C0561d.C0562a a2 = this.f2268J.mo3391a(i2, a.f2295f, i3 * -1, true);
            if (a2 == null) {
                this.f2268J.mo3397b(a.f2295f);
            } else {
                this.f2268J.mo3397b(a2.f2295f + 1);
            }
        }
        mo3272z();
        mo3271y();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo3368G() {
        View b = this.f2264F ? mo3376b(true) : mo3379c(true);
        if (b == null) {
            return -1;
        }
        return mo3258m(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public int mo3369H() {
        if (mo3231f() == 0) {
            return 0;
        }
        return mo3258m(mo3233f(0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo3370I() {
        int f = mo3231f();
        if (f == 0) {
            return 0;
        }
        return mo3258m(mo3233f(f - 1));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3371J() {
        /*
            r12 = this;
            int r0 = r12.mo3231f()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2280x
            r2.<init>(r3)
            int r3 = r12.f2280x
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2260B
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo3373L()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2264F
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo3233f((int) r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0560c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2291j
            int r9 = r9.f2313e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2291j
            boolean r9 = r12.m3067a((androidx.recyclerview.widget.StaggeredGridLayoutManager.C0566f) r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2291j
            int r9 = r9.f2313e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2292k
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo3233f((int) r9)
            boolean r10 = r12.f2264F
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.o r10 = r12.f2282z
            int r10 = r10.mo3567a((android.view.View) r7)
            androidx.recyclerview.widget.o r11 = r12.f2282z
            int r11 = r11.mo3567a((android.view.View) r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.o r10 = r12.f2282z
            int r10 = r10.mo3574d(r7)
            androidx.recyclerview.widget.o r11 = r12.f2282z
            int r11 = r11.mo3574d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0560c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2291j
            int r8 = r8.f2313e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2291j
            int r9 = r9.f2313e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3371J():android.view.View");
    }

    /* renamed from: K */
    public void mo3372K() {
        this.f2268J.mo3392a();
        mo3271y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public boolean mo3373L() {
        return mo3255l() == 1;
    }

    /* renamed from: a */
    public int mo2741a(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return mo3378c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo2790a(RecyclerView.C0518a0 a0Var) {
        return m3076h(a0Var);
    }

    /* renamed from: a */
    public int mo2742a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return this.f2260B == 1 ? this.f2280x : super.mo2742a(vVar, a0Var);
    }

    /* renamed from: a */
    public View mo2743a(View view, int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        View d;
        View a;
        if (mo3231f() == 0 || (d = mo3223d(view)) == null) {
            return null;
        }
        m3056O();
        int p = m3080p(i);
        if (p == Integer.MIN_VALUE) {
            return null;
        }
        C0560c cVar = (C0560c) d.getLayoutParams();
        boolean z = cVar.f2292k;
        C0566f fVar = cVar.f2291j;
        int I = p == 1 ? mo3370I() : mo3369H();
        m3068b(I, a0Var);
        m3092z(p);
        C0603j jVar = this.f2262D;
        jVar.f2462c = jVar.f2463d + I;
        jVar.f2461b = (int) (((float) this.f2282z.mo3579g()) * 0.33333334f);
        C0603j jVar2 = this.f2262D;
        jVar2.f2467h = true;
        jVar2.f2460a = false;
        m3057a(vVar, jVar2, a0Var);
        this.f2270L = this.f2264F;
        if (!z && (a = fVar.mo3418a(I, p)) != null && a != d) {
            return a;
        }
        if (m3091y(p)) {
            for (int i2 = this.f2280x - 1; i2 >= 0; i2--) {
                View a2 = this.f2281y[i2].mo3418a(I, p);
                if (a2 != null && a2 != d) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2280x; i3++) {
                View a3 = this.f2281y[i3].mo3418a(I, p);
                if (a3 != null && a3 != d) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2263E ^ true) == (p == -1);
        if (!z) {
            View e = mo2809e(z2 ? fVar.mo3428d() : fVar.mo3430e());
            if (!(e == null || e == d)) {
                return e;
            }
        }
        if (m3091y(p)) {
            for (int i4 = this.f2280x - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f2313e) {
                    C0566f[] fVarArr = this.f2281y;
                    View e2 = mo2809e(z2 ? fVarArr[i4].mo3428d() : fVarArr[i4].mo3430e());
                    if (!(e2 == null || e2 == d)) {
                        return e2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2280x; i5++) {
                C0566f[] fVarArr2 = this.f2281y;
                View e3 = mo2809e(z2 ? fVarArr2[i5].mo3428d() : fVarArr2[i5].mo3430e());
                if (e3 != null && e3 != d) {
                    return e3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public RecyclerView.C0543p mo2745a(Context context, AttributeSet attributeSet) {
        return new C0560c(context, attributeSet);
    }

    /* renamed from: a */
    public RecyclerView.C0543p mo2746a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0560c((ViewGroup.MarginLayoutParams) layoutParams) : new C0560c(layoutParams);
    }

    /* renamed from: a */
    public void mo2794a(int i, int i2, RecyclerView.C0518a0 a0Var, RecyclerView.C0538o.C0541c cVar) {
        int i3;
        int i4;
        if (this.f2260B != 0) {
            i = i2;
        }
        if (mo3231f() != 0 && i != 0) {
            mo3374a(i, a0Var);
            int[] iArr = this.f2278T;
            if (iArr == null || iArr.length < this.f2280x) {
                this.f2278T = new int[this.f2280x];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2280x; i6++) {
                C0603j jVar = this.f2262D;
                if (jVar.f2463d == -1) {
                    i4 = jVar.f2465f;
                    i3 = this.f2281y[i6].mo3422b(i4);
                } else {
                    i4 = this.f2281y[i6].mo3415a(jVar.f2466g);
                    i3 = this.f2262D.f2466g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2278T[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2278T, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f2262D.mo3549a(a0Var); i8++) {
                cVar.mo3278a(this.f2262D.f2462c, this.f2278T[i8]);
                C0603j jVar2 = this.f2262D;
                jVar2.f2462c += jVar2.f2463d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3374a(int i, RecyclerView.C0518a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo3370I();
            i2 = 1;
        } else {
            i3 = mo3369H();
            i2 = -1;
        }
        this.f2262D.f2460a = true;
        m3068b(i3, a0Var);
        m3092z(i2);
        C0603j jVar = this.f2262D;
        jVar.f2462c = i3 + jVar.f2463d;
        jVar.f2461b = Math.abs(i);
    }

    /* renamed from: a */
    public void mo2747a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f2260B == 1) {
            i4 = RecyclerView.C0538o.m2813c(i2, rect.height() + paddingTop, mo3257m());
            i3 = RecyclerView.C0538o.m2813c(i, (this.f2261C * this.f2280x) + paddingLeft, mo3259n());
        } else {
            i3 = RecyclerView.C0538o.m2813c(i, rect.width() + paddingLeft, mo3259n());
            i4 = RecyclerView.C0538o.m2813c(i2, (this.f2261C * this.f2280x) + paddingTop, mo3257m());
        }
        mo3217c(i3, i4);
    }

    /* renamed from: a */
    public void mo2796a(Parcelable parcelable) {
        if (parcelable instanceof C0564e) {
            this.f2272N = (C0564e) parcelable;
            mo3271y();
        }
    }

    /* renamed from: a */
    public void mo2797a(AccessibilityEvent accessibilityEvent) {
        super.mo2797a(accessibilityEvent);
        if (mo3231f() > 0) {
            View c = mo3379c(false);
            View b = mo3376b(false);
            if (c != null && b != null) {
                int m = mo3258m(c);
                int m2 = mo3258m(b);
                if (m < m2) {
                    accessibilityEvent.setFromIndex(m);
                    accessibilityEvent.setToIndex(m2);
                    return;
                }
                accessibilityEvent.setFromIndex(m2);
                accessibilityEvent.setToIndex(m);
            }
        }
    }

    /* renamed from: a */
    public void mo2749a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, View view, C0857c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0560c)) {
            super.mo3183a(view, cVar);
            return;
        }
        C0560c cVar2 = (C0560c) layoutParams;
        if (this.f2260B == 0) {
            i4 = cVar2.mo3389r();
            i3 = cVar2.f2292k ? this.f2280x : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.mo3389r();
            i = cVar2.f2292k ? this.f2280x : 1;
        }
        cVar.mo4594b((Object) C0857c.C0860c.m4675a(i4, i3, i2, i, false, false));
    }

    /* renamed from: a */
    public void mo2752a(RecyclerView recyclerView, int i, int i2) {
        m3073d(i, i2, 1);
    }

    /* renamed from: a */
    public void mo2753a(RecyclerView recyclerView, int i, int i2, int i3) {
        m3073d(i, i2, 8);
    }

    /* renamed from: a */
    public void mo2754a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3073d(i, i2, 4);
    }

    /* renamed from: a */
    public void mo2799a(RecyclerView recyclerView, RecyclerView.C0518a0 a0Var, int i) {
        C0604k kVar = new C0604k(recyclerView.getContext());
        kVar.mo3355c(i);
        mo3213b((RecyclerView.C0555z) kVar);
    }

    /* renamed from: a */
    public void mo2800a(String str) {
        if (this.f2272N == null) {
            super.mo2800a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3375a(RecyclerView.C0518a0 a0Var, C0559b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.mo3030d() && (i = this.f2266H) != -1) {
            if (i < 0 || i >= a0Var.mo3025a()) {
                this.f2266H = -1;
                this.f2267I = RecyclerView.UNDEFINED_DURATION;
            } else {
                C0564e eVar = this.f2272N;
                if (eVar == null || eVar.f2299f == -1 || eVar.f2301h < 1) {
                    View e = mo2809e(this.f2266H);
                    if (e != null) {
                        bVar.f2284a = this.f2264F ? mo3370I() : mo3369H();
                        if (this.f2267I != Integer.MIN_VALUE) {
                            if (bVar.f2286c) {
                                i3 = this.f2282z.mo3569b() - this.f2267I;
                                i2 = this.f2282z.mo3567a(e);
                            } else {
                                i3 = this.f2282z.mo3577f() + this.f2267I;
                                i2 = this.f2282z.mo3574d(e);
                            }
                            bVar.f2285b = i3 - i2;
                            return true;
                        } else if (this.f2282z.mo3570b(e) > this.f2282z.mo3579g()) {
                            bVar.f2285b = bVar.f2286c ? this.f2282z.mo3569b() : this.f2282z.mo3577f();
                            return true;
                        } else {
                            int d = this.f2282z.mo3574d(e) - this.f2282z.mo3577f();
                            if (d < 0) {
                                bVar.f2285b = -d;
                                return true;
                            }
                            int b = this.f2282z.mo3569b() - this.f2282z.mo3567a(e);
                            if (b < 0) {
                                bVar.f2285b = b;
                                return true;
                            }
                            bVar.f2285b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        bVar.f2284a = this.f2266H;
                        int i4 = this.f2267I;
                        if (i4 == Integer.MIN_VALUE) {
                            if (m3079o(bVar.f2284a) == 1) {
                                z = true;
                            }
                            bVar.f2286c = z;
                            bVar.mo3385a();
                        } else {
                            bVar.mo3386a(i4);
                        }
                        bVar.f2287d = true;
                    }
                } else {
                    bVar.f2285b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f2284a = this.f2266H;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2755a(RecyclerView.C0543p pVar) {
        return pVar instanceof C0560c;
    }

    /* renamed from: b */
    public int mo2756b(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return mo3378c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo2757b(RecyclerView.C0518a0 a0Var) {
        return m3077i(a0Var);
    }

    /* renamed from: b */
    public int mo2758b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        return this.f2260B == 0 ? this.f2280x : super.mo2758b(vVar, a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3376b(boolean z) {
        int f = this.f2282z.mo3577f();
        int b = this.f2282z.mo3569b();
        View view = null;
        for (int f2 = mo3231f() - 1; f2 >= 0; f2--) {
            View f3 = mo3233f(f2);
            int d = this.f2282z.mo3574d(f3);
            int a = this.f2282z.mo3567a(f3);
            if (a > f && d < b) {
                if (a <= b || !z) {
                    return f3;
                }
                if (view == null) {
                    view = f3;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3377b(RecyclerView.C0518a0 a0Var, C0559b bVar) {
        if (!mo3375a(a0Var, bVar) && !m3072c(a0Var, bVar)) {
            bVar.mo3385a();
            bVar.f2284a = 0;
        }
    }

    /* renamed from: b */
    public void mo2759b(RecyclerView recyclerView, int i, int i2) {
        m3073d(i, i2, 2);
    }

    /* renamed from: b */
    public void mo2802b(RecyclerView recyclerView, RecyclerView.C0550v vVar) {
        super.mo2802b(recyclerView, vVar);
        mo3206a(this.f2279U);
        for (int i = 0; i < this.f2280x; i++) {
            this.f2281y[i].mo3425c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: b */
    public boolean mo2804b() {
        return this.f2260B == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo3378c(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (mo3231f() == 0 || i == 0) {
            return 0;
        }
        mo3374a(i, a0Var);
        int a = m3057a(vVar, this.f2262D, a0Var);
        if (this.f2262D.f2461b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2282z.mo3568a(-i);
        this.f2270L = this.f2264F;
        C0603j jVar = this.f2262D;
        jVar.f2461b = 0;
        m3064a(vVar, jVar);
        return i;
    }

    /* renamed from: c */
    public int mo2760c(RecyclerView.C0518a0 a0Var) {
        return m3078j(a0Var);
    }

    /* renamed from: c */
    public PointF mo2806c(int i) {
        int o = m3079o(i);
        PointF pointF = new PointF();
        if (o == 0) {
            return null;
        }
        if (this.f2260B == 0) {
            pointF.x = (float) o;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) o;
        }
        return pointF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo3379c(boolean z) {
        int f = this.f2282z.mo3577f();
        int b = this.f2282z.mo3569b();
        int f2 = mo3231f();
        View view = null;
        for (int i = 0; i < f2; i++) {
            View f3 = mo3233f(i);
            int d = this.f2282z.mo3574d(f3);
            if (this.f2282z.mo3567a(f3) > f && d < b) {
                if (d >= f || !z) {
                    return f3;
                }
                if (view == null) {
                    view = f3;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public boolean mo2807c() {
        return this.f2260B == 1;
    }

    /* renamed from: d */
    public int mo2808d(RecyclerView.C0518a0 a0Var) {
        return m3076h(a0Var);
    }

    /* renamed from: d */
    public RecyclerView.C0543p mo2762d() {
        return this.f2260B == 0 ? new C0560c(-2, -1) : new C0560c(-1, -2);
    }

    /* renamed from: d */
    public void mo2763d(RecyclerView recyclerView) {
        this.f2268J.mo3392a();
        mo3271y();
    }

    /* renamed from: d */
    public void mo3380d(boolean z) {
        mo2800a((String) null);
        C0564e eVar = this.f2272N;
        if (!(eVar == null || eVar.f2306m == z)) {
            eVar.f2306m = z;
        }
        this.f2263E = z;
        mo3271y();
    }

    /* renamed from: e */
    public int mo2764e(RecyclerView.C0518a0 a0Var) {
        return m3077i(a0Var);
    }

    /* renamed from: e */
    public void mo2765e(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        m3071c(vVar, a0Var, true);
    }

    /* renamed from: f */
    public int mo2767f(RecyclerView.C0518a0 a0Var) {
        return m3078j(a0Var);
    }

    /* renamed from: g */
    public void mo3236g(int i) {
        super.mo3236g(i);
        for (int i2 = 0; i2 < this.f2280x; i2++) {
            this.f2281y[i2].mo3426c(i);
        }
    }

    /* renamed from: g */
    public void mo2768g(RecyclerView.C0518a0 a0Var) {
        super.mo2768g(a0Var);
        this.f2266H = -1;
        this.f2267I = RecyclerView.UNDEFINED_DURATION;
        this.f2272N = null;
        this.f2275Q.mo3388b();
    }

    /* renamed from: h */
    public void mo3246h(int i) {
        super.mo3246h(i);
        for (int i2 = 0; i2 < this.f2280x; i2++) {
            this.f2281y[i2].mo3426c(i);
        }
    }

    /* renamed from: i */
    public void mo3249i(int i) {
        if (i == 0) {
            mo3367F();
        }
    }

    /* renamed from: k */
    public void mo2812k(int i) {
        C0564e eVar = this.f2272N;
        if (!(eVar == null || eVar.f2299f == i)) {
            eVar.mo3410q();
        }
        this.f2266H = i;
        this.f2267I = RecyclerView.UNDEFINED_DURATION;
        mo3271y();
    }

    /* renamed from: l */
    public void mo3381l(int i) {
        if (i == 0 || i == 1) {
            mo2800a((String) null);
            if (i != this.f2260B) {
                this.f2260B = i;
                C0609o oVar = this.f2282z;
                this.f2282z = this.f2259A;
                this.f2259A = oVar;
                mo3271y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: m */
    public void mo3382m(int i) {
        mo2800a((String) null);
        if (i != this.f2280x) {
            mo3372K();
            this.f2280x = i;
            this.f2265G = new BitSet(this.f2280x);
            this.f2281y = new C0566f[this.f2280x];
            for (int i2 = 0; i2 < this.f2280x; i2++) {
                this.f2281y[i2] = new C0566f(i2);
            }
            mo3271y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3383n(int i) {
        this.f2261C = i / this.f2280x;
        this.f2273O = View.MeasureSpec.makeMeasureSpec(i, this.f2259A.mo3573d());
    }

    /* renamed from: s */
    public boolean mo2815s() {
        return this.f2269K != 0;
    }

    /* renamed from: w */
    public Parcelable mo2816w() {
        int i;
        int i2;
        int[] iArr;
        C0564e eVar = this.f2272N;
        if (eVar != null) {
            return new C0564e(eVar);
        }
        C0564e eVar2 = new C0564e();
        eVar2.f2306m = this.f2263E;
        eVar2.f2307n = this.f2270L;
        eVar2.f2308o = this.f2271M;
        C0561d dVar = this.f2268J;
        if (dVar == null || (iArr = dVar.f2293a) == null) {
            eVar2.f2303j = 0;
        } else {
            eVar2.f2304k = iArr;
            eVar2.f2303j = eVar2.f2304k.length;
            eVar2.f2305l = dVar.f2294b;
        }
        if (mo3231f() > 0) {
            eVar2.f2299f = this.f2270L ? mo3370I() : mo3369H();
            eVar2.f2300g = mo3368G();
            int i3 = this.f2280x;
            eVar2.f2301h = i3;
            eVar2.f2302i = new int[i3];
            for (int i4 = 0; i4 < this.f2280x; i4++) {
                if (this.f2270L) {
                    i = this.f2281y[i4].mo3415a((int) RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2282z.mo3569b();
                    } else {
                        eVar2.f2302i[i4] = i;
                    }
                } else {
                    i = this.f2281y[i4].mo3422b((int) RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f2282z.mo3577f();
                    } else {
                        eVar2.f2302i[i4] = i;
                    }
                }
                i -= i2;
                eVar2.f2302i[i4] = i;
            }
        } else {
            eVar2.f2299f = -1;
            eVar2.f2300g = -1;
            eVar2.f2301h = 0;
        }
        return eVar2;
    }
}
