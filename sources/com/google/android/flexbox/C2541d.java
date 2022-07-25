package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006b.p026g.p035k.C0875g;

/* renamed from: com.google.android.flexbox.d */
class C2541d {

    /* renamed from: a */
    private final C2538a f6503a;

    /* renamed from: b */
    private boolean[] f6504b;

    /* renamed from: c */
    int[] f6505c;

    /* renamed from: d */
    long[] f6506d;

    /* renamed from: e */
    private long[] f6507e;

    /* renamed from: com.google.android.flexbox.d$b */
    static class C2543b {

        /* renamed from: a */
        List<C2540c> f6508a;

        /* renamed from: b */
        int f6509b;

        C2543b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7676a() {
            this.f6508a = null;
            this.f6509b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.d$c */
    private static class C2544c implements Comparable<C2544c> {

        /* renamed from: f */
        int f6510f;

        /* renamed from: g */
        int f6511g;

        private C2544c() {
        }

        /* renamed from: a */
        public int compareTo(C2544c cVar) {
            int i = this.f6511g;
            int i2 = cVar.f6511g;
            return i != i2 ? i - i2 : this.f6510f - cVar.f6510f;
        }

        public String toString() {
            return "Order{order=" + this.f6511g + ", index=" + this.f6510f + '}';
        }
    }

    C2541d(C2538a aVar) {
        this.f6503a = aVar;
    }

    /* renamed from: a */
    private int m9713a(int i, C2539b bVar, int i2) {
        int b;
        C2538a aVar = this.f6503a;
        int a = aVar.mo7560a(i, aVar.getPaddingTop() + this.f6503a.getPaddingBottom() + bVar.mo7622m() + bVar.mo7613g() + i2, bVar.getHeight());
        int size = View.MeasureSpec.getSize(a);
        if (size > bVar.mo7612f()) {
            b = bVar.mo7612f();
        } else if (size >= bVar.mo7607b()) {
            return a;
        } else {
            b = bVar.mo7607b();
        }
        return View.MeasureSpec.makeMeasureSpec(b, View.MeasureSpec.getMode(a));
    }

    /* renamed from: a */
    private int m9714a(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    /* renamed from: a */
    private int m9715a(C2539b bVar, boolean z) {
        return z ? bVar.mo7613g() : bVar.mo7606a();
    }

    /* renamed from: a */
    private int m9716a(boolean z) {
        return z ? this.f6503a.getPaddingBottom() : this.f6503a.getPaddingEnd();
    }

    /* renamed from: a */
    private List<C2540c> m9717a(List<C2540c> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C2540c cVar = new C2540c();
        cVar.f6493g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m9718a(int i, int i2, int i3, View view) {
        long[] jArr = this.f6506d;
        if (jArr != null) {
            jArr[i] = mo7666b(i2, i3);
        }
        long[] jArr2 = this.f6507e;
        if (jArr2 != null) {
            jArr2[i] = mo7666b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private void m9719a(int i, int i2, C2540c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        double d;
        int i10;
        double d2;
        C2540c cVar2 = cVar;
        int i11 = i3;
        float f = cVar2.f6496j;
        float f2 = 0.0f;
        if (f > 0.0f && i11 >= (i5 = cVar2.f6491e)) {
            float f3 = ((float) (i11 - i5)) / f;
            cVar2.f6491e = i4 + cVar2.f6492f;
            if (!z) {
                cVar2.f6493g = RecyclerView.UNDEFINED_DURATION;
            }
            int i12 = 0;
            boolean z2 = false;
            float f4 = 0.0f;
            int i13 = 0;
            while (i12 < cVar2.f6494h) {
                int i14 = cVar2.f6501o + i12;
                View b = this.f6503a.mo7570b(i14);
                if (b == null || b.getVisibility() == 8) {
                    int i15 = i2;
                    i6 = i5;
                } else {
                    C2539b bVar = (C2539b) b.getLayoutParams();
                    int flexDirection = this.f6503a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i16 = i5;
                        int i17 = i;
                        int measuredWidth = b.getMeasuredWidth();
                        long[] jArr = this.f6507e;
                        if (jArr != null) {
                            measuredWidth = mo7665b(jArr[i14]);
                        }
                        int measuredHeight = b.getMeasuredHeight();
                        long[] jArr2 = this.f6507e;
                        i6 = i16;
                        if (jArr2 != null) {
                            measuredHeight = mo7652a(jArr2[i14]);
                        }
                        if (this.f6504b[i14] || bVar.mo7611e() <= 0.0f) {
                            int i18 = i2;
                            i9 = measuredWidth;
                            i8 = measuredHeight;
                        } else {
                            float e = ((float) measuredWidth) + (bVar.mo7611e() * f3);
                            if (i12 == cVar2.f6494h - 1) {
                                e += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(e);
                            if (round > bVar.mo7621l()) {
                                round = bVar.mo7621l();
                                this.f6504b[i14] = true;
                                cVar2.f6496j -= bVar.mo7611e();
                                z2 = true;
                            } else {
                                f4 += e - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int a = m9713a(i2, bVar, cVar2.f6499m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b.measure(makeMeasureSpec, a);
                            i9 = b.getMeasuredWidth();
                            i8 = b.getMeasuredHeight();
                            m9718a(i14, makeMeasureSpec, a, b);
                            this.f6503a.mo7564a(i14, b);
                        }
                        i7 = Math.max(i13, i8 + bVar.mo7622m() + bVar.mo7613g() + this.f6503a.mo7561a(b));
                        cVar2.f6491e += i9 + bVar.mo7618i() + bVar.mo7606a();
                    } else {
                        int measuredHeight2 = b.getMeasuredHeight();
                        long[] jArr3 = this.f6507e;
                        if (jArr3 != null) {
                            measuredHeight2 = mo7652a(jArr3[i14]);
                        }
                        int measuredWidth2 = b.getMeasuredWidth();
                        long[] jArr4 = this.f6507e;
                        if (jArr4 != null) {
                            measuredWidth2 = mo7665b(jArr4[i14]);
                        }
                        if (this.f6504b[i14] || bVar.mo7611e() <= f2) {
                            i10 = i5;
                            int i19 = i;
                        } else {
                            float e2 = ((float) measuredHeight2) + (bVar.mo7611e() * f3);
                            if (i12 == cVar2.f6494h - 1) {
                                e2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(e2);
                            if (round2 > bVar.mo7612f()) {
                                round2 = bVar.mo7612f();
                                this.f6504b[i14] = true;
                                cVar2.f6496j -= bVar.mo7611e();
                                i10 = i5;
                                z2 = true;
                            } else {
                                f4 += e2 - ((float) round2);
                                i10 = i5;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int b2 = m9726b(i, bVar, cVar2.f6499m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b.measure(b2, makeMeasureSpec2);
                            measuredWidth2 = b.getMeasuredWidth();
                            int measuredHeight3 = b.getMeasuredHeight();
                            m9718a(i14, b2, makeMeasureSpec2, b);
                            this.f6503a.mo7564a(i14, b);
                            measuredHeight2 = measuredHeight3;
                        }
                        i7 = Math.max(i13, measuredWidth2 + bVar.mo7618i() + bVar.mo7606a() + this.f6503a.mo7561a(b));
                        cVar2.f6491e += measuredHeight2 + bVar.mo7622m() + bVar.mo7613g();
                        int i20 = i2;
                        i6 = i10;
                    }
                    cVar2.f6493g = Math.max(cVar2.f6493g, i7);
                    i13 = i7;
                }
                i12++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i21 = i2;
            int i22 = i5;
            if (z2 && i22 != cVar2.f6491e) {
                m9719a(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9720a(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.C2539b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo7608c()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo7608c()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo7621l()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo7621l()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo7607b()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo7607b()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo7612f()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo7612f()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m9718a((int) r8, (int) r1, (int) r0, (android.view.View) r7)
            com.google.android.flexbox.a r0 = r6.f6503a
            r0.mo7564a(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C2541d.m9720a(android.view.View, int):void");
    }

    /* renamed from: a */
    private void m9721a(View view, int i, int i2) {
        C2539b bVar = (C2539b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.mo7618i()) - bVar.mo7606a()) - this.f6503a.mo7561a(view), bVar.mo7608c()), bVar.mo7621l());
        long[] jArr = this.f6507e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? mo7652a(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m9718a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f6503a.mo7564a(i2, view);
    }

    /* renamed from: a */
    private void m9722a(List<C2540c> list, C2540c cVar, int i, int i2) {
        cVar.f6499m = i2;
        this.f6503a.mo7566a(cVar);
        cVar.f6502p = i;
        list.add(cVar);
    }

    /* renamed from: a */
    private boolean m9723a(int i, int i2, C2540c cVar) {
        return i == i2 - 1 && cVar.mo7651c() != 0;
    }

    /* renamed from: a */
    private boolean m9724a(View view, int i, int i2, int i3, int i4, C2539b bVar, int i5, int i6, int i7) {
        if (this.f6503a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.mo7609d()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f6503a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int a = this.f6503a.mo7562a(view, i5, i6);
        if (a > 0) {
            i4 += a;
        }
        return i2 < i3 + i4;
    }

    /* renamed from: a */
    private int[] m9725a(int i, List<C2544c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C2544c next : list) {
            int i3 = next.f6510f;
            iArr[i2] = i3;
            sparseIntArray.append(i3, next.f6511g);
            i2++;
        }
        return iArr;
    }

    /* renamed from: b */
    private int m9726b(int i, C2539b bVar, int i2) {
        int c;
        C2538a aVar = this.f6503a;
        int b = aVar.mo7569b(i, aVar.getPaddingLeft() + this.f6503a.getPaddingRight() + bVar.mo7618i() + bVar.mo7606a() + i2, bVar.getWidth());
        int size = View.MeasureSpec.getSize(b);
        if (size > bVar.mo7621l()) {
            c = bVar.mo7621l();
        } else if (size >= bVar.mo7608c()) {
            return b;
        } else {
            c = bVar.mo7608c();
        }
        return View.MeasureSpec.makeMeasureSpec(c, View.MeasureSpec.getMode(b));
    }

    /* renamed from: b */
    private int m9727b(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    /* renamed from: b */
    private int m9728b(C2539b bVar, boolean z) {
        return z ? bVar.mo7606a() : bVar.mo7613g();
    }

    /* renamed from: b */
    private int m9729b(boolean z) {
        return z ? this.f6503a.getPaddingEnd() : this.f6503a.getPaddingBottom();
    }

    /* renamed from: b */
    private void m9730b(int i, int i2, C2540c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C2540c cVar2 = cVar;
        int i11 = i3;
        int i12 = cVar2.f6491e;
        float f = cVar2.f6497k;
        float f2 = 0.0f;
        if (f > 0.0f && i11 <= i12) {
            float f3 = ((float) (i12 - i11)) / f;
            cVar2.f6491e = i4 + cVar2.f6492f;
            if (!z) {
                cVar2.f6493g = RecyclerView.UNDEFINED_DURATION;
            }
            int i13 = 0;
            boolean z2 = false;
            float f4 = 0.0f;
            int i14 = 0;
            while (i13 < cVar2.f6494h) {
                int i15 = cVar2.f6501o + i13;
                View b = this.f6503a.mo7570b(i15);
                if (b == null || b.getVisibility() == 8) {
                    int i16 = i2;
                    i6 = i12;
                    i5 = i13;
                } else {
                    C2539b bVar = (C2539b) b.getLayoutParams();
                    int flexDirection = this.f6503a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i12;
                        int i17 = i13;
                        int i18 = i;
                        int measuredWidth = b.getMeasuredWidth();
                        long[] jArr = this.f6507e;
                        if (jArr != null) {
                            measuredWidth = mo7665b(jArr[i15]);
                        }
                        int measuredHeight = b.getMeasuredHeight();
                        long[] jArr2 = this.f6507e;
                        int i19 = i17;
                        if (jArr2 != null) {
                            measuredHeight = mo7652a(jArr2[i15]);
                        }
                        if (this.f6504b[i15] || bVar.mo7620k() <= 0.0f) {
                            int i20 = i2;
                            i10 = i19;
                            i9 = measuredWidth;
                            i8 = measuredHeight;
                        } else {
                            float k = ((float) measuredWidth) - (bVar.mo7620k() * f3);
                            i10 = i19;
                            if (i10 == cVar2.f6494h - 1) {
                                k += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(k);
                            if (round < bVar.mo7608c()) {
                                round = bVar.mo7608c();
                                this.f6504b[i15] = true;
                                cVar2.f6497k -= bVar.mo7620k();
                                z2 = true;
                            } else {
                                f4 += k - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int a = m9713a(i2, bVar, cVar2.f6499m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            b.measure(makeMeasureSpec, a);
                            i9 = b.getMeasuredWidth();
                            i8 = b.getMeasuredHeight();
                            m9718a(i15, makeMeasureSpec, a, b);
                            this.f6503a.mo7564a(i15, b);
                        }
                        i7 = Math.max(i14, i8 + bVar.mo7622m() + bVar.mo7613g() + this.f6503a.mo7561a(b));
                        cVar2.f6491e += i9 + bVar.mo7618i() + bVar.mo7606a();
                    } else {
                        int measuredHeight2 = b.getMeasuredHeight();
                        long[] jArr3 = this.f6507e;
                        if (jArr3 != null) {
                            measuredHeight2 = mo7652a(jArr3[i15]);
                        }
                        int measuredWidth2 = b.getMeasuredWidth();
                        long[] jArr4 = this.f6507e;
                        if (jArr4 != null) {
                            measuredWidth2 = mo7665b(jArr4[i15]);
                        }
                        if (this.f6504b[i15] || bVar.mo7620k() <= f2) {
                            i6 = i12;
                            i5 = i13;
                            int i21 = i;
                        } else {
                            float k2 = ((float) measuredHeight2) - (bVar.mo7620k() * f3);
                            if (i13 == cVar2.f6494h - 1) {
                                k2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(k2);
                            if (round2 < bVar.mo7607b()) {
                                round2 = bVar.mo7607b();
                                this.f6504b[i15] = true;
                                cVar2.f6497k -= bVar.mo7620k();
                                i6 = i12;
                                i5 = i13;
                                z2 = true;
                            } else {
                                f4 += k2 - ((float) round2);
                                i6 = i12;
                                i5 = i13;
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int b2 = m9726b(i, bVar, cVar2.f6499m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            b.measure(b2, makeMeasureSpec2);
                            measuredWidth2 = b.getMeasuredWidth();
                            int measuredHeight3 = b.getMeasuredHeight();
                            m9718a(i15, b2, makeMeasureSpec2, b);
                            this.f6503a.mo7564a(i15, b);
                            measuredHeight2 = measuredHeight3;
                        }
                        i7 = Math.max(i14, measuredWidth2 + bVar.mo7618i() + bVar.mo7606a() + this.f6503a.mo7561a(b));
                        cVar2.f6491e += measuredHeight2 + bVar.mo7622m() + bVar.mo7613g();
                        int i22 = i2;
                    }
                    cVar2.f6493g = Math.max(cVar2.f6493g, i7);
                    i14 = i7;
                }
                i13 = i5 + 1;
                i12 = i6;
                f2 = 0.0f;
            }
            int i23 = i2;
            int i24 = i12;
            if (z2 && i24 != cVar2.f6491e) {
                m9730b(i, i2, cVar, i3, i4, true);
            }
        }
    }

    /* renamed from: b */
    private void m9731b(View view, int i, int i2) {
        C2539b bVar = (C2539b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.mo7622m()) - bVar.mo7613g()) - this.f6503a.mo7561a(view), bVar.mo7607b()), bVar.mo7612f());
        long[] jArr = this.f6507e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? mo7665b(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m9718a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f6503a.mo7564a(i2, view);
    }

    /* renamed from: c */
    private int m9732c(C2539b bVar, boolean z) {
        return z ? bVar.mo7622m() : bVar.mo7618i();
    }

    /* renamed from: c */
    private int m9733c(boolean z) {
        return z ? this.f6503a.getPaddingTop() : this.f6503a.getPaddingStart();
    }

    /* renamed from: d */
    private int m9734d(C2539b bVar, boolean z) {
        return z ? bVar.mo7618i() : bVar.mo7622m();
    }

    /* renamed from: d */
    private int m9735d(boolean z) {
        return z ? this.f6503a.getPaddingStart() : this.f6503a.getPaddingTop();
    }

    /* renamed from: e */
    private int m9736e(C2539b bVar, boolean z) {
        return z ? bVar.getHeight() : bVar.getWidth();
    }

    /* renamed from: e */
    private List<C2544c> m9737e(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C2544c cVar = new C2544c();
            cVar.f6511g = ((C2539b) this.f6503a.mo7563a(i2).getLayoutParams()).getOrder();
            cVar.f6510f = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: f */
    private int m9738f(C2539b bVar, boolean z) {
        return z ? bVar.getWidth() : bVar.getHeight();
    }

    /* renamed from: f */
    private void m9739f(int i) {
        boolean[] zArr = this.f6504b;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f6504b = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f6504b = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7652a(long j) {
        return (int) (j >> 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7653a() {
        mo7674d(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7654a(int i) {
        int[] iArr = this.f6505c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f6505c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f6505c = Arrays.copyOf(this.f6505c, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7655a(int i, int i2) {
        mo7668b(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7656a(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f6503a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            i5 = View.MeasureSpec.getMode(i2);
            i4 = View.MeasureSpec.getSize(i2);
        } else if (flexDirection == 2 || flexDirection == 3) {
            int mode = View.MeasureSpec.getMode(i);
            i4 = View.MeasureSpec.getSize(i);
            i5 = mode;
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C2540c> flexLinesInternal = this.f6503a.getFlexLinesInternal();
        if (i5 == 1073741824) {
            int sumOfCrossSize = this.f6503a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f6493g = i4 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f6503a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i4) {
                                    float size = ((float) (i4 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                                    int size2 = flexLinesInternal.size();
                                    float f = 0.0f;
                                    while (i6 < size2) {
                                        C2540c cVar = flexLinesInternal.get(i6);
                                        float f2 = ((float) cVar.f6493g) + size;
                                        if (i6 == flexLinesInternal.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round = Math.round(f2);
                                        f += f2 - ((float) round);
                                        if (f > 1.0f) {
                                            round++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round--;
                                            f += 1.0f;
                                        }
                                        cVar.f6493g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize < i4) {
                                int size3 = (i4 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                C2540c cVar2 = new C2540c();
                                cVar2.f6493g = size3;
                                for (C2540c add : flexLinesInternal) {
                                    arrayList.add(cVar2);
                                    arrayList.add(add);
                                    arrayList.add(cVar2);
                                }
                                this.f6503a.setFlexLines(arrayList);
                                return;
                            }
                        } else if (sumOfCrossSize < i4) {
                            float size4 = ((float) (i4 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                            ArrayList arrayList2 = new ArrayList();
                            int size5 = flexLinesInternal.size();
                            float f3 = 0.0f;
                            while (i6 < size5) {
                                arrayList2.add(flexLinesInternal.get(i6));
                                if (i6 != flexLinesInternal.size() - 1) {
                                    C2540c cVar3 = new C2540c();
                                    if (i6 == flexLinesInternal.size() - 2) {
                                        cVar3.f6493g = Math.round(f3 + size4);
                                        f3 = 0.0f;
                                    } else {
                                        cVar3.f6493g = Math.round(size4);
                                    }
                                    int i7 = cVar3.f6493g;
                                    f3 += size4 - ((float) i7);
                                    if (f3 > 1.0f) {
                                        cVar3.f6493g = i7 + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        cVar3.f6493g = i7 - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList2.add(cVar3);
                                }
                                i6++;
                            }
                            this.f6503a.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f6503a.setFlexLines(m9717a(flexLinesInternal, i4, sumOfCrossSize));
                    return;
                }
                int i8 = i4 - sumOfCrossSize;
                C2540c cVar4 = new C2540c();
                cVar4.f6493g = i8;
                flexLinesInternal.add(0, cVar4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7657a(View view, C2540c cVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int g;
        C2539b bVar = (C2539b) view.getLayoutParams();
        int alignItems = this.f6503a.getAlignItems();
        if (bVar.mo7619j() != -1) {
            alignItems = bVar.mo7619j();
        }
        int i9 = cVar.f6493g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i9 - view.getMeasuredHeight()) + bVar.mo7622m()) - bVar.mo7613g()) / 2;
                    int i10 = this.f6503a.getFlexWrap() != 2 ? i2 + measuredHeight : i2 - measuredHeight;
                    view.layout(i, i10, i3, view.getMeasuredHeight() + i10);
                    return;
                } else if (alignItems == 3) {
                    int flexWrap = this.f6503a.getFlexWrap();
                    int i11 = cVar.f6498l;
                    if (flexWrap != 2) {
                        i8 = Math.max(i11 - view.getBaseline(), bVar.mo7622m());
                        i6 = i2 + i8;
                        i5 = i4 + i8;
                        view.layout(i, i6, i3, i5);
                    }
                    i7 = Math.max((i11 - view.getMeasuredHeight()) + view.getBaseline(), bVar.mo7613g());
                    g = i2 - i7;
                    i5 = i4 - i7;
                    view.layout(i, i6, i3, i5);
                } else if (alignItems != 4) {
                    return;
                }
            } else if (this.f6503a.getFlexWrap() != 2) {
                int i12 = i2 + i9;
                view.layout(i, (i12 - view.getMeasuredHeight()) - bVar.mo7613g(), i3, i12 - bVar.mo7613g());
                return;
            } else {
                i6 = (i2 - i9) + view.getMeasuredHeight() + bVar.mo7622m();
                i4 = (i4 - i9) + view.getMeasuredHeight();
                i8 = bVar.mo7622m();
                i5 = i4 + i8;
                view.layout(i, i6, i3, i5);
            }
        }
        if (this.f6503a.getFlexWrap() != 2) {
            i6 = i2 + bVar.mo7622m();
            i8 = bVar.mo7622m();
            i5 = i4 + i8;
            view.layout(i, i6, i3, i5);
        }
        g = i2 - bVar.mo7613g();
        i7 = bVar.mo7613g();
        i5 = i4 - i7;
        view.layout(i, i6, i3, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7658a(View view, C2540c cVar, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        C2539b bVar = (C2539b) view.getLayoutParams();
        int alignItems = this.f6503a.getAlignItems();
        if (bVar.mo7619j() != -1) {
            alignItems = bVar.mo7619j();
        }
        int i9 = cVar.f6493g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    i7 = (((i9 - view.getMeasuredWidth()) + C0875g.m4689b(marginLayoutParams)) - C0875g.m4688a(marginLayoutParams)) / 2;
                    if (!z) {
                        i6 = i + i7;
                        i5 = i3 + i7;
                        view.layout(i6, i2, i5, i4);
                    }
                    i8 = i - i7;
                    i5 = i3 - i7;
                    view.layout(i6, i2, i5, i4);
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                i8 = ((i + i9) - view.getMeasuredWidth()) - bVar.mo7606a();
                i3 = (i3 + i9) - view.getMeasuredWidth();
                i7 = bVar.mo7606a();
                i5 = i3 - i7;
                view.layout(i6, i2, i5, i4);
            } else {
                i6 = (i - i9) + view.getMeasuredWidth() + bVar.mo7618i();
                i3 = (i3 - i9) + view.getMeasuredWidth();
                i7 = bVar.mo7618i();
                i5 = i3 + i7;
                view.layout(i6, i2, i5, i4);
            }
        }
        if (!z) {
            i6 = i + bVar.mo7618i();
            i7 = bVar.mo7618i();
            i5 = i3 + i7;
            view.layout(i6, i2, i5, i4);
        }
        i8 = i - bVar.mo7606a();
        i7 = bVar.mo7606a();
        i5 = i3 - i7;
        view.layout(i6, i2, i5, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7659a(C2543b bVar, int i, int i2) {
        mo7660a(bVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<C2540c>) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if (m9723a(r6, r1, r3) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        if (m9723a(r6, r1, r3) != false) goto L_0x0068;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7660a(com.google.android.flexbox.C2541d.C2543b r32, int r33, int r34, int r35, int r36, int r37, java.util.List<com.google.android.flexbox.C2540c> r38) {
        /*
            r31 = this;
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r37
            com.google.android.flexbox.a r0 = r10.f6503a
            boolean r15 = r0.mo7567a()
            int r9 = android.view.View.MeasureSpec.getMode(r33)
            int r8 = android.view.View.MeasureSpec.getSize(r33)
            if (r38 != 0) goto L_0x0021
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r0
            goto L_0x0023
        L_0x0021:
            r7 = r38
        L_0x0023:
            r11.f6508a = r7
            r6 = -1
            if (r14 != r6) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            int r1 = r10.m9735d((boolean) r15)
            int r2 = r10.m9729b((boolean) r15)
            int r16 = r10.m9733c((boolean) r15)
            int r17 = r10.m9716a((boolean) r15)
            com.google.android.flexbox.c r3 = new com.google.android.flexbox.c
            r3.<init>()
            r6 = r36
            r3.f6501o = r6
            int r2 = r2 + r1
            r3.f6491e = r2
            com.google.android.flexbox.a r1 = r10.f6503a
            int r1 = r1.getFlexItemCount()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r0
            r0 = 0
            r19 = 0
            r20 = 0
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0058:
            if (r6 >= r1) goto L_0x031a
            com.google.android.flexbox.a r5 = r10.f6503a
            android.view.View r5 = r5.mo7570b(r6)
            if (r5 != 0) goto L_0x006c
            boolean r5 = r10.m9723a((int) r6, (int) r1, (com.google.android.flexbox.C2540c) r3)
            if (r5 == 0) goto L_0x0086
        L_0x0068:
            r10.m9722a((java.util.List<com.google.android.flexbox.C2540c>) r7, (com.google.android.flexbox.C2540c) r3, (int) r6, (int) r0)
            goto L_0x0086
        L_0x006c:
            int r4 = r5.getVisibility()
            r11 = 8
            if (r4 != r11) goto L_0x0097
            int r4 = r3.f6495i
            r5 = 1
            int r4 = r4 + r5
            r3.f6495i = r4
            int r4 = r3.f6494h
            int r4 = r4 + r5
            r3.f6494h = r4
            boolean r4 = r10.m9723a((int) r6, (int) r1, (com.google.android.flexbox.C2540c) r3)
            if (r4 == 0) goto L_0x0086
            goto L_0x0068
        L_0x0086:
            r12 = r35
            r24 = r8
            r26 = r9
            r5 = r13
            r8 = r14
            r9 = -1
            r11 = 1
            r27 = 0
            r14 = r7
            r7 = r2
            r2 = r1
            goto L_0x0309
        L_0x0097:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            r11 = r4
            com.google.android.flexbox.b r11 = (com.google.android.flexbox.C2539b) r11
            int r4 = r11.mo7619j()
            r25 = r1
            r1 = 4
            if (r4 != r1) goto L_0x00b0
            java.util.List<java.lang.Integer> r1 = r3.f6500n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r1.add(r4)
        L_0x00b0:
            int r1 = r10.m9738f(r11, r15)
            float r4 = r11.mo7617h()
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r4 == 0) goto L_0x00cd
            r4 = 1073741824(0x40000000, float:2.0)
            if (r9 != r4) goto L_0x00cd
            float r1 = (float) r8
            float r4 = r11.mo7617h()
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
        L_0x00cd:
            if (r15 == 0) goto L_0x0109
            com.google.android.flexbox.a r4 = r10.f6503a
            r14 = 1
            int r24 = r10.m9734d(r11, r14)
            int r24 = r2 + r24
            int r26 = r10.m9728b((com.google.android.flexbox.C2539b) r11, (boolean) r14)
            int r14 = r24 + r26
            int r1 = r4.mo7569b(r12, r14, r1)
            com.google.android.flexbox.a r4 = r10.f6503a
            int r14 = r16 + r17
            r24 = r8
            r8 = 1
            int r26 = r10.m9732c(r11, r8)
            int r14 = r14 + r26
            int r26 = r10.m9715a((com.google.android.flexbox.C2539b) r11, (boolean) r8)
            int r14 = r14 + r26
            int r14 = r14 + r0
            r26 = r9
            int r9 = r10.m9736e(r11, r8)
            int r4 = r4.mo7560a((int) r13, (int) r14, (int) r9)
            r5.measure(r1, r4)
            r10.m9718a((int) r6, (int) r1, (int) r4, (android.view.View) r5)
            r9 = r1
            r14 = 0
            goto L_0x0140
        L_0x0109:
            r24 = r8
            r26 = r9
            r8 = 1
            com.google.android.flexbox.a r4 = r10.f6503a
            int r9 = r16 + r17
            r14 = 0
            int r23 = r10.m9732c(r11, r14)
            int r9 = r9 + r23
            int r23 = r10.m9715a((com.google.android.flexbox.C2539b) r11, (boolean) r14)
            int r9 = r9 + r23
            int r9 = r9 + r0
            int r8 = r10.m9736e(r11, r14)
            int r4 = r4.mo7569b(r13, r9, r8)
            com.google.android.flexbox.a r8 = r10.f6503a
            int r9 = r10.m9734d(r11, r14)
            int r9 = r9 + r2
            int r23 = r10.m9728b((com.google.android.flexbox.C2539b) r11, (boolean) r14)
            int r9 = r9 + r23
            int r1 = r8.mo7560a((int) r12, (int) r9, (int) r1)
            r5.measure(r4, r1)
            r10.m9718a((int) r6, (int) r4, (int) r1, (android.view.View) r5)
            r9 = r1
        L_0x0140:
            com.google.android.flexbox.a r1 = r10.f6503a
            r1.mo7564a(r6, r5)
            r10.m9720a((android.view.View) r5, (int) r6)
            int r1 = r5.getMeasuredState()
            r4 = r19
            int r19 = android.view.View.combineMeasuredStates(r4, r1)
            int r4 = r3.f6491e
            int r1 = r10.m9727b((android.view.View) r5, (boolean) r15)
            int r8 = r10.m9734d(r11, r15)
            int r1 = r1 + r8
            int r8 = r10.m9728b((com.google.android.flexbox.C2539b) r11, (boolean) r15)
            int r8 = r8 + r1
            int r23 = r7.size()
            r1 = r0
            r0 = r31
            r12 = r1
            r14 = r25
            r1 = r5
            r14 = r2
            r2 = r26
            r28 = r3
            r3 = r24
            r29 = r14
            r14 = 1
            r14 = r5
            r27 = 0
            r5 = r8
            r8 = r6
            r38 = r14
            r14 = -1
            r6 = r11
            r14 = r7
            r7 = r8
            r13 = r8
            r8 = r20
            r30 = r9
            r9 = r23
            boolean r0 = r0.m9724a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0228
            int r0 = r28.mo7651c()
            if (r0 <= 0) goto L_0x01a6
            if (r13 <= 0) goto L_0x019c
            int r5 = r13 + -1
            r3 = r28
            goto L_0x019f
        L_0x019c:
            r3 = r28
            r5 = 0
        L_0x019f:
            r10.m9722a((java.util.List<com.google.android.flexbox.C2540c>) r14, (com.google.android.flexbox.C2540c) r3, (int) r5, (int) r12)
            int r0 = r3.f6493g
            int r0 = r0 + r12
            goto L_0x01a7
        L_0x01a6:
            r0 = r12
        L_0x01a7:
            if (r15 == 0) goto L_0x01e1
            int r1 = r11.getHeight()
            r2 = -1
            if (r1 != r2) goto L_0x01db
            com.google.android.flexbox.a r1 = r10.f6503a
            int r2 = r1.getPaddingTop()
            com.google.android.flexbox.a r3 = r10.f6503a
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r3 = r11.mo7622m()
            int r2 = r2 + r3
            int r3 = r11.mo7613g()
            int r2 = r2 + r3
            int r2 = r2 + r0
            int r3 = r11.getHeight()
            r5 = r34
            r6 = r13
            int r1 = r1.mo7560a((int) r5, (int) r2, (int) r3)
            r2 = r38
            r3 = r30
            r2.measure(r3, r1)
            goto L_0x0212
        L_0x01db:
            r5 = r34
            r2 = r38
            r6 = r13
            goto L_0x0215
        L_0x01e1:
            r5 = r34
            r2 = r38
            r6 = r13
            r3 = r30
            int r1 = r11.getWidth()
            r4 = -1
            if (r1 != r4) goto L_0x0215
            com.google.android.flexbox.a r1 = r10.f6503a
            int r4 = r1.getPaddingLeft()
            com.google.android.flexbox.a r7 = r10.f6503a
            int r7 = r7.getPaddingRight()
            int r4 = r4 + r7
            int r7 = r11.mo7618i()
            int r4 = r4 + r7
            int r7 = r11.mo7606a()
            int r4 = r4 + r7
            int r4 = r4 + r0
            int r7 = r11.getWidth()
            int r1 = r1.mo7569b(r5, r4, r7)
            r2.measure(r1, r3)
        L_0x0212:
            r10.m9720a((android.view.View) r2, (int) r6)
        L_0x0215:
            com.google.android.flexbox.c r3 = new com.google.android.flexbox.c
            r3.<init>()
            r1 = 1
            r3.f6494h = r1
            r7 = r29
            r3.f6491e = r7
            r3.f6501o = r6
            r12 = r0
            r0 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x023b
        L_0x0228:
            r5 = r34
            r2 = r38
            r6 = r13
            r3 = r28
            r7 = r29
            r1 = 1
            int r0 = r3.f6494h
            int r0 = r0 + r1
            r3.f6494h = r0
            int r0 = r20 + 1
            r1 = r21
        L_0x023b:
            int[] r4 = r10.f6505c
            if (r4 == 0) goto L_0x0245
            int r8 = r14.size()
            r4[r6] = r8
        L_0x0245:
            int r4 = r3.f6491e
            int r8 = r10.m9727b((android.view.View) r2, (boolean) r15)
            int r9 = r10.m9734d(r11, r15)
            int r8 = r8 + r9
            int r9 = r10.m9728b((com.google.android.flexbox.C2539b) r11, (boolean) r15)
            int r8 = r8 + r9
            int r4 = r4 + r8
            r3.f6491e = r4
            float r4 = r3.f6496j
            float r8 = r11.mo7611e()
            float r4 = r4 + r8
            r3.f6496j = r4
            float r4 = r3.f6497k
            float r8 = r11.mo7620k()
            float r4 = r4 + r8
            r3.f6497k = r4
            com.google.android.flexbox.a r4 = r10.f6503a
            r4.mo7565a(r2, r6, r0, r3)
            int r4 = r10.m9714a((android.view.View) r2, (boolean) r15)
            int r8 = r10.m9732c(r11, r15)
            int r4 = r4 + r8
            int r8 = r10.m9715a((com.google.android.flexbox.C2539b) r11, (boolean) r15)
            int r4 = r4 + r8
            com.google.android.flexbox.a r8 = r10.f6503a
            int r8 = r8.mo7561a((android.view.View) r2)
            int r4 = r4 + r8
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r3.f6493g
            int r4 = java.lang.Math.max(r4, r1)
            r3.f6493g = r4
            if (r15 == 0) goto L_0x02c1
            com.google.android.flexbox.a r4 = r10.f6503a
            int r4 = r4.getFlexWrap()
            r8 = 2
            if (r4 == r8) goto L_0x02ab
            int r4 = r3.f6498l
            int r2 = r2.getBaseline()
            int r8 = r11.mo7622m()
            int r2 = r2 + r8
            int r2 = java.lang.Math.max(r4, r2)
            goto L_0x02bf
        L_0x02ab:
            int r4 = r3.f6498l
            int r8 = r2.getMeasuredHeight()
            int r2 = r2.getBaseline()
            int r8 = r8 - r2
            int r2 = r11.mo7613g()
            int r8 = r8 + r2
            int r2 = java.lang.Math.max(r4, r8)
        L_0x02bf:
            r3.f6498l = r2
        L_0x02c1:
            r2 = r25
            boolean r4 = r10.m9723a((int) r6, (int) r2, (com.google.android.flexbox.C2540c) r3)
            if (r4 == 0) goto L_0x02cf
            r10.m9722a((java.util.List<com.google.android.flexbox.C2540c>) r14, (com.google.android.flexbox.C2540c) r3, (int) r6, (int) r12)
            int r4 = r3.f6493g
            int r12 = r12 + r4
        L_0x02cf:
            r8 = r37
            r9 = -1
            if (r8 == r9) goto L_0x02f7
            int r4 = r14.size()
            if (r4 <= 0) goto L_0x02f7
            int r4 = r14.size()
            r11 = 1
            int r4 = r4 - r11
            java.lang.Object r4 = r14.get(r4)
            com.google.android.flexbox.c r4 = (com.google.android.flexbox.C2540c) r4
            int r4 = r4.f6502p
            if (r4 < r8) goto L_0x02f8
            if (r6 < r8) goto L_0x02f8
            if (r22 != 0) goto L_0x02f8
            int r4 = r3.mo7648a()
            int r12 = -r4
            r4 = r12
            r22 = 1
            goto L_0x02f9
        L_0x02f7:
            r11 = 1
        L_0x02f8:
            r4 = r12
        L_0x02f9:
            r12 = r35
            if (r4 <= r12) goto L_0x0304
            if (r22 == 0) goto L_0x0304
            r0 = r32
            r4 = r19
            goto L_0x031e
        L_0x0304:
            r20 = r0
            r21 = r1
            r0 = r4
        L_0x0309:
            int r6 = r6 + 1
            r11 = r32
            r12 = r33
            r1 = r2
            r13 = r5
            r2 = r7
            r7 = r14
            r9 = r26
            r14 = r8
            r8 = r24
            goto L_0x0058
        L_0x031a:
            r4 = r19
            r0 = r32
        L_0x031e:
            r0.f6509b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C2541d.mo7660a(com.google.android.flexbox.d$b, int, int, int, int, int, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7661a(C2543b bVar, int i, int i2, int i3, int i4, List<C2540c> list) {
        mo7660a(bVar, i, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7662a(List<C2540c> list, int i) {
        int i2 = this.f6505c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f6505c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f6506d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo7663a(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f6503a.getFlexItemCount();
        return m9725a(flexItemCount, m9737e(flexItemCount), sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo7664a(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f6503a.getFlexItemCount();
        List<C2544c> e = m9737e(flexItemCount);
        C2544c cVar = new C2544c();
        if (view == null || !(layoutParams instanceof C2539b)) {
            cVar.f6511g = 1;
        } else {
            cVar.f6511g = ((C2539b) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.f6503a.getFlexItemCount()) {
            cVar.f6510f = flexItemCount;
        } else {
            cVar.f6510f = i;
            while (i < flexItemCount) {
                e.get(i).f6510f++;
                i++;
            }
        }
        e.add(cVar);
        return m9725a(flexItemCount + 1, e, sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo7665b(long j) {
        return (int) j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo7666b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7667b(int i) {
        long[] jArr = this.f6506d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f6506d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f6506d = Arrays.copyOf(this.f6506d, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7668b(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        m9739f(this.f6503a.getFlexItemCount());
        if (i3 < this.f6503a.getFlexItemCount()) {
            int flexDirection = this.f6503a.getFlexDirection();
            int flexDirection2 = this.f6503a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    size = this.f6503a.getLargestMainSize();
                }
                i6 = this.f6503a.getPaddingLeft();
                i4 = this.f6503a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f6503a.getLargestMainSize();
                }
                i6 = this.f6503a.getPaddingTop();
                i4 = this.f6503a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i7 = i6 + i4;
            int i8 = 0;
            int[] iArr = this.f6505c;
            if (iArr != null) {
                i8 = iArr[i3];
            }
            List<C2540c> flexLinesInternal = this.f6503a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            for (int i9 = i8; i9 < size2; i9++) {
                C2540c cVar = flexLinesInternal.get(i9);
                if (cVar.f6491e < i5) {
                    m9719a(i, i2, cVar, i5, i7, false);
                } else {
                    m9730b(i, i2, cVar, i5, i7, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7669b(C2543b bVar, int i, int i2) {
        mo7660a(bVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<C2540c>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7670b(C2543b bVar, int i, int i2, int i3, int i4, List<C2540c> list) {
        mo7660a(bVar, i, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7671b(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f6503a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View a = this.f6503a.mo7563a(i);
            if (a != null && ((C2539b) a.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7672c(int i) {
        long[] jArr = this.f6507e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f6507e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f6507e = Arrays.copyOf(this.f6507e, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7673c(C2543b bVar, int i, int i2, int i3, int i4, List<C2540c> list) {
        mo7660a(bVar, i2, i, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7674d(int i) {
        View b;
        int i2 = i;
        if (i2 < this.f6503a.getFlexItemCount()) {
            int flexDirection = this.f6503a.getFlexDirection();
            if (this.f6503a.getAlignItems() == 4) {
                int[] iArr = this.f6505c;
                List<C2540c> flexLinesInternal = this.f6503a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                    C2540c cVar = flexLinesInternal.get(i3);
                    int i4 = cVar.f6494h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = cVar.f6501o + i5;
                        if (!(i5 >= this.f6503a.getFlexItemCount() || (b = this.f6503a.mo7570b(i6)) == null || b.getVisibility() == 8)) {
                            C2539b bVar = (C2539b) b.getLayoutParams();
                            if (bVar.mo7619j() == -1 || bVar.mo7619j() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    m9731b(b, cVar.f6493g, i6);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    m9721a(b, cVar.f6493g, i6);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C2540c next : this.f6503a.getFlexLinesInternal()) {
                Iterator<Integer> it = next.f6500n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View b2 = this.f6503a.mo7570b(next2.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            m9731b(b2, next.f6493g, next2.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            m9721a(b2, next.f6493g, next2.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7675d(C2543b bVar, int i, int i2, int i3, int i4, List<C2540c> list) {
        mo7660a(bVar, i2, i, i3, 0, i4, list);
    }
}
