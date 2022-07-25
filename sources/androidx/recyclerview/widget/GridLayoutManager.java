package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p006b.p026g.p035k.p036e0.C0857c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: N */
    boolean f2084N = false;

    /* renamed from: O */
    int f2085O = -1;

    /* renamed from: P */
    int[] f2086P;

    /* renamed from: Q */
    View[] f2087Q;

    /* renamed from: R */
    final SparseIntArray f2088R = new SparseIntArray();

    /* renamed from: S */
    final SparseIntArray f2089S = new SparseIntArray();

    /* renamed from: T */
    C0511c f2090T = new C0509a();

    /* renamed from: U */
    final Rect f2091U = new Rect();

    /* renamed from: V */
    private boolean f2092V;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0509a extends C0511c {
        /* renamed from: a */
        public int mo2770a(int i) {
            return 1;
        }

        /* renamed from: d */
        public int mo2771d(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0510b extends RecyclerView.C0543p {

        /* renamed from: j */
        int f2093j = -1;

        /* renamed from: k */
        int f2094k = 0;

        public C0510b(int i, int i2) {
            super(i, i2);
        }

        public C0510b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0510b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0510b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: r */
        public int mo2772r() {
            return this.f2093j;
        }

        /* renamed from: s */
        public int mo2773s() {
            return this.f2094k;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0511c {

        /* renamed from: a */
        final SparseIntArray f2095a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f2096b = new SparseIntArray();

        /* renamed from: c */
        private boolean f2097c = false;

        /* renamed from: d */
        private boolean f2098d = false;

        /* renamed from: a */
        static int m2552a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: a */
        public abstract int mo2770a(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2774a(int i, int i2) {
            if (!this.f2098d) {
                return mo2778c(i, i2);
            }
            int i3 = this.f2096b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo2778c(i, i2);
            this.f2096b.put(i, c);
            return c;
        }

        /* renamed from: a */
        public void mo2775a() {
            this.f2096b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo2776b(int i, int i2) {
            if (!this.f2097c) {
                return mo2771d(i, i2);
            }
            int i3 = this.f2095a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo2771d(i, i2);
            this.f2095a.put(i, d);
            return d;
        }

        /* renamed from: b */
        public void mo2777b() {
            this.f2095a.clear();
        }

        /* renamed from: c */
        public int mo2778c(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.f2098d || (a = m2552a(this.f2096b, i)) == -1) {
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                i4 = this.f2096b.get(a);
                i3 = a + 1;
                i5 = mo2770a(a) + mo2776b(a, i2);
                if (i5 == i2) {
                    i4++;
                    i5 = 0;
                }
            }
            int a2 = mo2770a(i);
            while (i3 < i) {
                int a3 = mo2770a(i3);
                int i6 = i5 + a3;
                if (i6 == i2) {
                    i4++;
                    i6 = 0;
                } else if (i6 > i2) {
                    i4++;
                    i6 = a3;
                }
                i3++;
            }
            return i5 + a2 > i2 ? i4 + 1 : i4;
        }

        /* renamed from: d */
        public abstract int mo2771d(int i, int i2);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo2769n(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo2769n(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo2769n(RecyclerView.C0538o.m2809a(context, attributeSet, i, i2).f2220b);
    }

    /* renamed from: O */
    private void m2501O() {
        int f = mo3231f();
        for (int i = 0; i < f; i++) {
            C0510b bVar = (C0510b) mo3233f(i).getLayoutParams();
            int n = bVar.mo3279n();
            this.f2088R.put(n, bVar.mo2773s());
            this.f2089S.put(n, bVar.mo2772r());
        }
    }

    /* renamed from: P */
    private void m2502P() {
        this.f2088R.clear();
        this.f2089S.clear();
    }

    /* renamed from: Q */
    private void m2503Q() {
        View[] viewArr = this.f2087Q;
        if (viewArr == null || viewArr.length != this.f2085O) {
            this.f2087Q = new View[this.f2085O];
        }
    }

    /* renamed from: R */
    private void m2504R() {
        int i;
        int i2;
        if (mo2786J() == 1) {
            i2 = mo3261o() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = mo3247i() - getPaddingBottom();
            i = getPaddingTop();
        }
        m2516o(i2 - i);
    }

    /* renamed from: a */
    private int m2505a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, int i) {
        if (!a0Var.mo3030d()) {
            return this.f2090T.mo2774a(i, this.f2085O);
        }
        int a = vVar.mo3302a(i);
        if (a != -1) {
            return this.f2090T.mo2774a(a, this.f2085O);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: a */
    private void m2506a(float f, int i) {
        m2516o(Math.max(Math.round(f * ((float) this.f2085O)), i));
    }

    /* renamed from: a */
    private void m2507a(View view, int i, int i2, boolean z) {
        RecyclerView.C0543p pVar = (RecyclerView.C0543p) view.getLayoutParams();
        if (z ? mo3215b(view, i, i2, pVar) : mo3196a(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m2508a(View view, int i, boolean z) {
        int i2;
        int i3;
        C0510b bVar = (C0510b) view.getLayoutParams();
        Rect rect = bVar.f2224g;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int f = mo2766f(bVar.f2093j, bVar.f2094k);
        if (this.f2112x == 1) {
            i2 = RecyclerView.C0538o.m2808a(f, i, i5, bVar.width, false);
            i3 = RecyclerView.C0538o.m2808a(this.f2114z.mo3579g(), mo3250j(), i4, bVar.height, true);
        } else {
            int a = RecyclerView.C0538o.m2808a(f, i, i4, bVar.height, false);
            int a2 = RecyclerView.C0538o.m2808a(this.f2114z.mo3579g(), mo3263p(), i5, bVar.width, true);
            i3 = a;
            i2 = a2;
        }
        m2507a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m2509a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f2087Q[i3];
            C0510b bVar = (C0510b) view.getLayoutParams();
            bVar.f2094k = m2513c(vVar, a0Var, mo3258m(view));
            bVar.f2093j = i4;
            i4 += bVar.f2094k;
            i3 += i2;
        }
    }

    /* renamed from: a */
    static int[] m2510a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m2511b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, int i) {
        if (!a0Var.mo3030d()) {
            return this.f2090T.mo2776b(i, this.f2085O);
        }
        int i2 = this.f2089S.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo3302a(i);
        if (a != -1) {
            return this.f2090T.mo2776b(a, this.f2085O);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: b */
    private void m2512b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, LinearLayoutManager.C0512a aVar, int i) {
        boolean z = i == 1;
        int b = m2511b(vVar, a0Var, aVar.f2116b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f2116b;
                if (i2 > 0) {
                    aVar.f2116b = i2 - 1;
                    b = m2511b(vVar, a0Var, aVar.f2116b);
                } else {
                    return;
                }
            }
            return;
        }
        int a = a0Var.mo3025a() - 1;
        int i3 = aVar.f2116b;
        while (i3 < a) {
            int i4 = i3 + 1;
            int b2 = m2511b(vVar, a0Var, i4);
            if (b2 <= b) {
                break;
            }
            i3 = i4;
            b = b2;
        }
        aVar.f2116b = i3;
    }

    /* renamed from: c */
    private int m2513c(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, int i) {
        if (!a0Var.mo3030d()) {
            return this.f2090T.mo2770a(i);
        }
        int i2 = this.f2088R.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = vVar.mo3302a(i);
        if (a != -1) {
            return this.f2090T.mo2770a(a);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: i */
    private int m2514i(RecyclerView.C0518a0 a0Var) {
        if (!(mo3231f() == 0 || a0Var.mo3025a() == 0)) {
            mo2781E();
            boolean L = mo2788L();
            View b = mo2801b(!L, true);
            View a = mo2793a(!L, true);
            if (!(b == null || a == null)) {
                int a2 = this.f2090T.mo2774a(mo3258m(b), this.f2085O);
                int a3 = this.f2090T.mo2774a(mo3258m(a), this.f2085O);
                int min = Math.min(a2, a3);
                int max = this.f2101C ? Math.max(0, ((this.f2090T.mo2774a(a0Var.mo3025a() - 1, this.f2085O) + 1) - Math.max(a2, a3)) - 1) : Math.max(0, min);
                if (!L) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f2114z.mo3567a(a) - this.f2114z.mo3574d(b))) / ((float) ((this.f2090T.mo2774a(mo3258m(a), this.f2085O) - this.f2090T.mo2774a(mo3258m(b), this.f2085O)) + 1)))) + ((float) (this.f2114z.mo3577f() - this.f2114z.mo3574d(b))));
            }
        }
        return 0;
    }

    /* renamed from: j */
    private int m2515j(RecyclerView.C0518a0 a0Var) {
        if (!(mo3231f() == 0 || a0Var.mo3025a() == 0)) {
            mo2781E();
            View b = mo2801b(!mo2788L(), true);
            View a = mo2793a(!mo2788L(), true);
            if (!(b == null || a == null)) {
                if (!mo2788L()) {
                    return this.f2090T.mo2774a(a0Var.mo3025a() - 1, this.f2085O) + 1;
                }
                int a2 = this.f2114z.mo3567a(a) - this.f2114z.mo3574d(b);
                int a3 = this.f2090T.mo2774a(mo3258m(b), this.f2085O);
                return (int) ((((float) a2) / ((float) ((this.f2090T.mo2774a(mo3258m(a), this.f2085O) - a3) + 1))) * ((float) (this.f2090T.mo2774a(a0Var.mo3025a() - 1, this.f2085O) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: o */
    private void m2516o(int i) {
        this.f2086P = m2510a(this.f2086P, this.f2085O, i);
    }

    /* renamed from: C */
    public boolean mo2739C() {
        return this.f2107I == null && !this.f2084N;
    }

    /* renamed from: N */
    public int mo2740N() {
        return this.f2085O;
    }

    /* renamed from: a */
    public int mo2741a(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        m2504R();
        m2503Q();
        return super.mo2741a(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo2742a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (this.f2112x == 1) {
            return this.f2085O;
        }
        if (a0Var.mo3025a() < 1) {
            return 0;
        }
        return m2505a(vVar, a0Var, a0Var.mo3025a() - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo2743a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0550v r26, androidx.recyclerview.widget.RecyclerView.C0518a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo3223d((android.view.View) r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0510b) r5
            int r6 = r5.f2093j
            int r5 = r5.f2094k
            int r5 = r5 + r6
            android.view.View r7 = super.mo2743a((android.view.View) r24, (int) r25, (androidx.recyclerview.widget.RecyclerView.C0550v) r26, (androidx.recyclerview.widget.RecyclerView.C0518a0) r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo2813l(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2101C
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo3231f()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo3231f()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f2112x
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo2787K()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m2505a((androidx.recyclerview.widget.RecyclerView.C0550v) r1, (androidx.recyclerview.widget.RecyclerView.C0518a0) r2, (int) r7)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005d:
            if (r7 == r11) goto L_0x0147
            int r9 = r0.m2505a((androidx.recyclerview.widget.RecyclerView.C0550v) r1, (androidx.recyclerview.widget.RecyclerView.C0518a0) r2, (int) r7)
            android.view.View r1 = r0.mo3233f((int) r7)
            if (r1 != r3) goto L_0x006b
            goto L_0x0147
        L_0x006b:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0147
        L_0x0077:
            r18 = r3
            r19 = r8
            r21 = r10
            r20 = r11
            r8 = r16
            r10 = r17
            goto L_0x0133
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C0510b) r9
            int r2 = r9.f2093j
            r18 = r3
            int r3 = r9.f2094k
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
        L_0x00ad:
            r19 = r8
            r21 = r10
        L_0x00b1:
            r20 = r11
            r8 = r16
            r10 = r17
        L_0x00b7:
            r11 = 1
            goto L_0x0103
        L_0x00b9:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00da
            if (r10 <= r15) goto L_0x00d0
        L_0x00cd:
            r19 = r8
            goto L_0x00b1
        L_0x00d0:
            if (r10 != r15) goto L_0x00fa
            if (r2 <= r8) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r13 != r10) goto L_0x00fa
            goto L_0x00cd
        L_0x00da:
            if (r4 != 0) goto L_0x00fa
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo3198a((android.view.View) r1, (boolean) r8, (boolean) r11)
            r8 = r16
            if (r22 == 0) goto L_0x0100
            if (r10 <= r8) goto L_0x00ef
            r10 = r17
            goto L_0x0103
        L_0x00ef:
            if (r10 != r8) goto L_0x0100
            r10 = r17
            if (r2 <= r10) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r13 != r11) goto L_0x0102
            goto L_0x00b7
        L_0x00fa:
            r19 = r8
            r20 = r11
            r8 = r16
        L_0x0100:
            r10 = r17
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0133
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0120
            int r4 = r9.f2093j
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r10
            r10 = r21
            r8 = r4
            r4 = r1
            goto L_0x013b
        L_0x0120:
            int r8 = r9.f2093j
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            r8 = r19
            goto L_0x013b
        L_0x0133:
            r16 = r8
            r17 = r10
            r8 = r19
            r10 = r21
        L_0x013b:
            int r7 = r7 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005d
        L_0x0147:
            r21 = r10
            if (r4 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r4 = r21
        L_0x014e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo2743a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
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
            if (m >= 0 && m < i3 && m2511b(vVar, a0Var, m) == 0) {
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

    /* renamed from: a */
    public RecyclerView.C0543p mo2745a(Context context, AttributeSet attributeSet) {
        return new C0510b(context, attributeSet);
    }

    /* renamed from: a */
    public RecyclerView.C0543p mo2746a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0510b((ViewGroup.MarginLayoutParams) layoutParams) : new C0510b(layoutParams);
    }

    /* renamed from: a */
    public void mo2747a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f2086P == null) {
            super.mo2747a(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f2112x == 1) {
            i4 = RecyclerView.C0538o.m2813c(i2, rect.height() + paddingTop, mo3257m());
            int[] iArr = this.f2086P;
            i3 = RecyclerView.C0538o.m2813c(i, iArr[iArr.length - 1] + paddingLeft, mo3259n());
        } else {
            i3 = RecyclerView.C0538o.m2813c(i, rect.width() + paddingLeft, mo3259n());
            int[] iArr2 = this.f2086P;
            i4 = RecyclerView.C0538o.m2813c(i2, iArr2[iArr2.length - 1] + paddingTop, mo3257m());
        }
        mo3217c(i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2748a(RecyclerView.C0518a0 a0Var, LinearLayoutManager.C0514c cVar, RecyclerView.C0538o.C0541c cVar2) {
        int i = this.f2085O;
        for (int i2 = 0; i2 < this.f2085O && cVar.mo2827a(a0Var) && i > 0; i2++) {
            int i3 = cVar.f2127d;
            cVar2.mo3278a(i3, Math.max(0, cVar.f2130g));
            i -= this.f2090T.mo2770a(i3);
            cVar.f2127d += cVar.f2128e;
        }
    }

    /* renamed from: a */
    public void mo2749a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, View view, C0857c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0510b)) {
            super.mo3183a(view, cVar);
            return;
        }
        C0510b bVar = (C0510b) layoutParams;
        int a = m2505a(vVar, a0Var, bVar.mo3279n());
        if (this.f2112x == 0) {
            i4 = bVar.mo2772r();
            i3 = bVar.mo2773s();
            i = 1;
            z2 = false;
            z = false;
            i2 = a;
        } else {
            i3 = 1;
            i2 = bVar.mo2772r();
            i = bVar.mo2773s();
            z2 = false;
            z = false;
            i4 = a;
        }
        cVar.mo4594b((Object) C0857c.C0860c.m4675a(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2750a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, LinearLayoutManager.C0512a aVar, int i) {
        super.mo2750a(vVar, a0Var, aVar, i);
        m2504R();
        if (a0Var.mo3025a() > 0 && !a0Var.mo3030d()) {
            m2512b(vVar, a0Var, aVar, i);
        }
        m2503Q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2751a(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var, LinearLayoutManager.C0514c cVar, LinearLayoutManager.C0513b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View a;
        RecyclerView.C0550v vVar2 = vVar;
        RecyclerView.C0518a0 a0Var2 = a0Var;
        LinearLayoutManager.C0514c cVar2 = cVar;
        LinearLayoutManager.C0513b bVar2 = bVar;
        int e = this.f2114z.mo3575e();
        boolean z = false;
        boolean z2 = e != 1073741824;
        int i11 = mo3231f() > 0 ? this.f2086P[this.f2085O] : 0;
        if (z2) {
            m2504R();
        }
        boolean z3 = cVar2.f2128e == 1;
        int i12 = this.f2085O;
        if (!z3) {
            i12 = m2511b(vVar2, a0Var2, cVar2.f2127d) + m2513c(vVar2, a0Var2, cVar2.f2127d);
        }
        int i13 = i12;
        int i14 = 0;
        while (i14 < this.f2085O && cVar2.mo2827a(a0Var2) && i13 > 0) {
            int i15 = cVar2.f2127d;
            int c = m2513c(vVar2, a0Var2, i15);
            if (c <= this.f2085O) {
                i13 -= c;
                if (i13 < 0 || (a = cVar2.mo2824a(vVar2)) == null) {
                    break;
                }
                this.f2087Q[i14] = a;
                i14++;
            } else {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + c + " spans but GridLayoutManager has only " + this.f2085O + " spans.");
            }
        }
        if (i14 == 0) {
            bVar2.f2121b = true;
            return;
        }
        float f = 0.0f;
        m2509a(vVar2, a0Var2, i14, z3);
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            View view = this.f2087Q[i16];
            if (cVar2.f2135l == null) {
                if (z3) {
                    mo3218c(view);
                } else {
                    mo3209b(view, (int) z);
                }
            } else if (z3) {
                mo3208b(view);
            } else {
                mo3178a(view, z ? 1 : 0);
            }
            mo3181a(view, this.f2091U);
            m2508a(view, e, z);
            int b = this.f2114z.mo3570b(view);
            if (b > i17) {
                i17 = b;
            }
            float c2 = (((float) this.f2114z.mo3572c(view)) * 1.0f) / ((float) ((C0510b) view.getLayoutParams()).f2094k);
            if (c2 > f) {
                f = c2;
            }
            i16++;
            z = false;
        }
        if (z2) {
            m2506a(f, i11);
            i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f2087Q[i18];
                m2508a(view2, 1073741824, true);
                int b2 = this.f2114z.mo3570b(view2);
                if (b2 > i17) {
                    i17 = b2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f2087Q[i19];
            if (this.f2114z.mo3570b(view3) != i17) {
                C0510b bVar3 = (C0510b) view3.getLayoutParams();
                Rect rect = bVar3.f2224g;
                int i20 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i21 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int f2 = mo2766f(bVar3.f2093j, bVar3.f2094k);
                if (this.f2112x == 1) {
                    i10 = RecyclerView.C0538o.m2808a(f2, 1073741824, i21, bVar3.width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i17 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                    i9 = RecyclerView.C0538o.m2808a(f2, 1073741824, i20, bVar3.height, false);
                    i10 = makeMeasureSpec;
                }
                m2507a(view3, i10, i9, true);
            }
        }
        int i22 = 0;
        bVar2.f2120a = i17;
        if (this.f2112x == 1) {
            int i23 = cVar2.f2129f;
            int i24 = cVar2.f2125b;
            if (i23 == -1) {
                i3 = i24 - i17;
                i2 = i24;
            } else {
                i2 = i24 + i17;
                i3 = i24;
            }
            i4 = 0;
            i = 0;
        } else {
            int i25 = cVar2.f2129f;
            i = cVar2.f2125b;
            if (i25 == -1) {
                i4 = i - i17;
                i3 = 0;
                i2 = 0;
            } else {
                int i26 = i + i17;
                i3 = 0;
                i2 = 0;
                int i27 = i;
                i = i26;
                i4 = i27;
            }
        }
        while (i22 < i14) {
            View view4 = this.f2087Q[i22];
            C0510b bVar4 = (C0510b) view4.getLayoutParams();
            if (this.f2112x != 1) {
                int paddingTop = getPaddingTop() + this.f2086P[bVar4.f2093j];
                i8 = i4;
                i7 = paddingTop;
                i5 = this.f2114z.mo3572c(view4) + paddingTop;
                i6 = i;
            } else if (mo2787K()) {
                int paddingLeft = getPaddingLeft() + this.f2086P[this.f2085O - bVar4.f2093j];
                i6 = paddingLeft;
                i7 = i3;
                i5 = i2;
                i8 = paddingLeft - this.f2114z.mo3572c(view4);
            } else {
                int paddingLeft2 = getPaddingLeft() + this.f2086P[bVar4.f2093j];
                i8 = paddingLeft2;
                i7 = i3;
                i5 = i2;
                i6 = this.f2114z.mo3572c(view4) + paddingLeft2;
            }
            mo3179a(view4, i8, i7, i6, i5);
            if (bVar4.mo3281p() || bVar4.mo3280o()) {
                bVar2.f2122c = true;
            }
            bVar2.f2123d |= view4.hasFocusable();
            i22++;
            i4 = i8;
            i3 = i7;
            i = i6;
            i2 = i5;
        }
        Arrays.fill(this.f2087Q, (Object) null);
    }

    /* renamed from: a */
    public void mo2752a(RecyclerView recyclerView, int i, int i2) {
        this.f2090T.mo2777b();
        this.f2090T.mo2775a();
    }

    /* renamed from: a */
    public void mo2753a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2090T.mo2777b();
        this.f2090T.mo2775a();
    }

    /* renamed from: a */
    public void mo2754a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2090T.mo2777b();
        this.f2090T.mo2775a();
    }

    /* renamed from: a */
    public boolean mo2755a(RecyclerView.C0543p pVar) {
        return pVar instanceof C0510b;
    }

    /* renamed from: b */
    public int mo2756b(int i, RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        m2504R();
        m2503Q();
        return super.mo2756b(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo2757b(RecyclerView.C0518a0 a0Var) {
        return this.f2092V ? m2514i(a0Var) : super.mo2757b(a0Var);
    }

    /* renamed from: b */
    public int mo2758b(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (this.f2112x == 0) {
            return this.f2085O;
        }
        if (a0Var.mo3025a() < 1) {
            return 0;
        }
        return m2505a(vVar, a0Var, a0Var.mo3025a() - 1) + 1;
    }

    /* renamed from: b */
    public void mo2759b(RecyclerView recyclerView, int i, int i2) {
        this.f2090T.mo2777b();
        this.f2090T.mo2775a();
    }

    /* renamed from: c */
    public int mo2760c(RecyclerView.C0518a0 a0Var) {
        return this.f2092V ? m2515j(a0Var) : super.mo2760c(a0Var);
    }

    /* renamed from: c */
    public void mo2761c(boolean z) {
        if (!z) {
            super.mo2761c(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: d */
    public RecyclerView.C0543p mo2762d() {
        return this.f2112x == 0 ? new C0510b(-2, -1) : new C0510b(-1, -2);
    }

    /* renamed from: d */
    public void mo2763d(RecyclerView recyclerView) {
        this.f2090T.mo2777b();
        this.f2090T.mo2775a();
    }

    /* renamed from: e */
    public int mo2764e(RecyclerView.C0518a0 a0Var) {
        return this.f2092V ? m2514i(a0Var) : super.mo2764e(a0Var);
    }

    /* renamed from: e */
    public void mo2765e(RecyclerView.C0550v vVar, RecyclerView.C0518a0 a0Var) {
        if (a0Var.mo3030d()) {
            m2501O();
        }
        super.mo2765e(vVar, a0Var);
        m2502P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2766f(int i, int i2) {
        if (this.f2112x != 1 || !mo2787K()) {
            int[] iArr = this.f2086P;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2086P;
        int i3 = this.f2085O;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: f */
    public int mo2767f(RecyclerView.C0518a0 a0Var) {
        return this.f2092V ? m2515j(a0Var) : super.mo2767f(a0Var);
    }

    /* renamed from: g */
    public void mo2768g(RecyclerView.C0518a0 a0Var) {
        super.mo2768g(a0Var);
        this.f2084N = false;
    }

    /* renamed from: n */
    public void mo2769n(int i) {
        if (i != this.f2085O) {
            this.f2084N = true;
            if (i >= 1) {
                this.f2085O = i;
                this.f2090T.mo2777b();
                mo3271y();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }
}
