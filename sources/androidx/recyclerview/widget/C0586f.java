package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
public class C0586f {

    /* renamed from: a */
    private static final Comparator<C0592f> f2389a = new C0587a();

    /* renamed from: androidx.recyclerview.widget.f$a */
    static class C0587a implements Comparator<C0592f> {
        C0587a() {
        }

        /* renamed from: a */
        public int compare(C0592f fVar, C0592f fVar2) {
            int i = fVar.f2404a - fVar2.f2404a;
            return i == 0 ? fVar.f2405b - fVar2.f2405b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    public static abstract class C0588b {
        /* renamed from: a */
        public abstract int mo3517a();

        /* renamed from: a */
        public abstract boolean mo3518a(int i, int i2);

        /* renamed from: b */
        public abstract int mo3519b();

        /* renamed from: b */
        public abstract boolean mo3520b(int i, int i2);

        /* renamed from: c */
        public Object mo3521c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    public static class C0589c {

        /* renamed from: a */
        private final List<C0592f> f2390a;

        /* renamed from: b */
        private final int[] f2391b;

        /* renamed from: c */
        private final int[] f2392c;

        /* renamed from: d */
        private final C0588b f2393d;

        /* renamed from: e */
        private final int f2394e;

        /* renamed from: f */
        private final int f2395f;

        /* renamed from: g */
        private final boolean f2396g;

        C0589c(C0588b bVar, List<C0592f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f2390a = list;
            this.f2391b = iArr;
            this.f2392c = iArr2;
            Arrays.fill(this.f2391b, 0);
            Arrays.fill(this.f2392c, 0);
            this.f2393d = bVar;
            this.f2394e = bVar.mo3519b();
            this.f2395f = bVar.mo3517a();
            this.f2396g = z;
            m3310a();
            m3314b();
        }

        /* renamed from: a */
        private static C0590d m3309a(List<C0590d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0590d dVar = list.get(size);
                if (dVar.f2397a == i && dVar.f2399c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f2398b += z ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m3310a() {
            C0592f fVar = this.f2390a.isEmpty() ? null : this.f2390a.get(0);
            if (fVar == null || fVar.f2404a != 0 || fVar.f2405b != 0) {
                C0592f fVar2 = new C0592f();
                fVar2.f2404a = 0;
                fVar2.f2405b = 0;
                fVar2.f2407d = false;
                fVar2.f2406c = 0;
                fVar2.f2408e = false;
                this.f2390a.add(0, fVar2);
            }
        }

        /* renamed from: a */
        private void m3311a(int i, int i2, int i3) {
            if (this.f2391b[i - 1] == 0) {
                m3313a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        private void m3312a(List<C0590d> list, C0606m mVar, int i, int i2, int i3) {
            if (!this.f2396g) {
                mVar.mo3461b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f2392c[i5] & 31;
                if (i6 == 0) {
                    mVar.mo3461b(i, 1);
                    for (C0590d dVar : list) {
                        dVar.f2398b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f2392c[i5] >> 5;
                    mVar.mo3462c(m3309a(list, i7, true).f2398b, i);
                    if (i6 == 4) {
                        mVar.mo3460a(i, 1, this.f2393d.mo3521c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C0590d(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: a */
        private boolean m3313a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0592f fVar = this.f2390a.get(i3);
                int i6 = fVar.f2404a;
                int i7 = fVar.f2406c;
                int i8 = i6 + i7;
                int i9 = fVar.f2405b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i8; i11--) {
                        if (this.f2393d.mo3520b(i11, i4)) {
                            if (!this.f2393d.mo3518a(i11, i4)) {
                                i10 = 4;
                            }
                            this.f2392c[i4] = (i11 << 5) | 16;
                            this.f2391b[i11] = (i4 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f2393d.mo3520b(i4, i12)) {
                            if (!this.f2393d.mo3518a(i4, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f2391b[i13] = (i12 << 5) | 16;
                            this.f2392c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = fVar.f2404a;
                i2 = fVar.f2405b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m3314b() {
            int i = this.f2394e;
            int i2 = this.f2395f;
            for (int size = this.f2390a.size() - 1; size >= 0; size--) {
                C0592f fVar = this.f2390a.get(size);
                int i3 = fVar.f2404a;
                int i4 = fVar.f2406c;
                int i5 = i3 + i4;
                int i6 = fVar.f2405b + i4;
                if (this.f2396g) {
                    while (i > i5) {
                        m3311a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m3315b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < fVar.f2406c; i7++) {
                    int i8 = fVar.f2404a + i7;
                    int i9 = fVar.f2405b + i7;
                    int i10 = this.f2393d.mo3518a(i8, i9) ? 1 : 2;
                    this.f2391b[i8] = (i9 << 5) | i10;
                    this.f2392c[i9] = (i8 << 5) | i10;
                }
                i = fVar.f2404a;
                i2 = fVar.f2405b;
            }
        }

        /* renamed from: b */
        private void m3315b(int i, int i2, int i3) {
            if (this.f2392c[i2 - 1] == 0) {
                m3313a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m3316b(List<C0590d> list, C0606m mVar, int i, int i2, int i3) {
            if (!this.f2396g) {
                mVar.mo3459a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f2391b[i5] & 31;
                if (i6 == 0) {
                    mVar.mo3459a(i + i4, 1);
                    for (C0590d dVar : list) {
                        dVar.f2398b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f2391b[i5] >> 5;
                    C0590d a = m3309a(list, i7, false);
                    mVar.mo3462c(i + i4, a.f2398b - 1);
                    if (i6 == 4) {
                        mVar.mo3460a(a.f2398b - 1, 1, this.f2393d.mo3521c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C0590d(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: a */
        public void mo3522a(RecyclerView.C0527g gVar) {
            mo3523a((C0606m) new C0570b(gVar));
        }

        /* renamed from: a */
        public void mo3523a(C0606m mVar) {
            C0571c cVar = mVar instanceof C0571c ? (C0571c) mVar : new C0571c(mVar);
            ArrayList arrayList = new ArrayList();
            int i = this.f2394e;
            int i2 = this.f2395f;
            for (int size = this.f2390a.size() - 1; size >= 0; size--) {
                C0592f fVar = this.f2390a.get(size);
                int i3 = fVar.f2406c;
                int i4 = fVar.f2404a + i3;
                int i5 = fVar.f2405b + i3;
                if (i4 < i) {
                    m3316b(arrayList, cVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m3312a(arrayList, cVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f2391b;
                    int i7 = fVar.f2404a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        cVar.mo3460a(i7 + i6, 1, this.f2393d.mo3521c(i7 + i6, fVar.f2405b + i6));
                    }
                }
                i = fVar.f2404a;
                i2 = fVar.f2405b;
            }
            cVar.mo3463a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    private static class C0590d {

        /* renamed from: a */
        int f2397a;

        /* renamed from: b */
        int f2398b;

        /* renamed from: c */
        boolean f2399c;

        public C0590d(int i, int i2, boolean z) {
            this.f2397a = i;
            this.f2398b = i2;
            this.f2399c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    static class C0591e {

        /* renamed from: a */
        int f2400a;

        /* renamed from: b */
        int f2401b;

        /* renamed from: c */
        int f2402c;

        /* renamed from: d */
        int f2403d;

        public C0591e() {
        }

        public C0591e(int i, int i2, int i3, int i4) {
            this.f2400a = i;
            this.f2401b = i2;
            this.f2402c = i3;
            this.f2403d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    static class C0592f {

        /* renamed from: a */
        int f2404a;

        /* renamed from: b */
        int f2405b;

        /* renamed from: c */
        int f2406c;

        /* renamed from: d */
        boolean f2407d;

        /* renamed from: e */
        boolean f2408e;

        C0592f() {
        }
    }

    /* renamed from: a */
    public static C0589c m3300a(C0588b bVar) {
        return m3301a(bVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.C0586f.C0589c m3301a(androidx.recyclerview.widget.C0586f.C0588b r15, boolean r16) {
        /*
            int r0 = r15.mo3519b()
            int r1 = r15.mo3517a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.f$e r3 = new androidx.recyclerview.widget.f$e
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + r3
            int r1 = r0 * 2
            int[] r13 = new int[r1]
            int[] r1 = new int[r1]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.f$e r14 = (androidx.recyclerview.widget.C0586f.C0591e) r14
            int r6 = r14.f2400a
            int r7 = r14.f2401b
            int r8 = r14.f2402c
            int r9 = r14.f2403d
            r5 = r15
            r10 = r13
            r11 = r1
            r12 = r0
            androidx.recyclerview.widget.f$f r5 = m3302a(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.f2406c
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.f2404a
            int r7 = r14.f2400a
            int r6 = r6 + r7
            r5.f2404a = r6
            int r6 = r5.f2405b
            int r7 = r14.f2402c
            int r6 = r6 + r7
            r5.f2405b = r6
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x0074
            androidx.recyclerview.widget.f$e r6 = new androidx.recyclerview.widget.f$e
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r3.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r3.remove(r6)
            androidx.recyclerview.widget.f$e r6 = (androidx.recyclerview.widget.C0586f.C0591e) r6
        L_0x0080:
            int r7 = r14.f2400a
            r6.f2400a = r7
            int r7 = r14.f2402c
            r6.f2402c = r7
            boolean r7 = r5.f2408e
            if (r7 == 0) goto L_0x0095
            int r7 = r5.f2404a
        L_0x008e:
            r6.f2401b = r7
            int r7 = r5.f2405b
        L_0x0092:
            r6.f2403d = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.f2407d
            if (r7 == 0) goto L_0x009e
            int r7 = r5.f2404a
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.f2404a
            r6.f2401b = r7
            int r7 = r5.f2405b
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.f2408e
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.f2407d
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.f2404a
            int r7 = r5.f2406c
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.f2404a
            int r7 = r5.f2406c
            int r6 = r6 + r7
            r14.f2400a = r6
            int r5 = r5.f2405b
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.f2404a
            int r7 = r5.f2406c
            int r6 = r6 + r7
        L_0x00cc:
            r14.f2400a = r6
            int r5 = r5.f2405b
            int r5 = r5 + r7
        L_0x00d1:
            r14.f2402c = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r3.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<androidx.recyclerview.widget.f$f> r0 = f2389a
            java.util.Collections.sort(r4, r0)
            androidx.recyclerview.widget.f$c r0 = new androidx.recyclerview.widget.f$c
            r2 = r0
            r3 = r15
            r5 = r13
            r6 = r1
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0586f.m3301a(androidx.recyclerview.widget.f$b, boolean):androidx.recyclerview.widget.f$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c A[LOOP:1: B:10:0x0033->B:33:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C0586f.C0592f m3302a(androidx.recyclerview.widget.C0586f.C0588b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x0133
            if (r4 >= r5) goto L_0x0011
            goto L_0x0133
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo3520b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009c
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r3 = r2[r5]
            r0.f2404a = r3
            int r3 = r0.f2404a
            int r3 = r3 - r12
            r0.f2405b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f2406c = r1
            r0.f2407d = r14
            r5 = 0
            r0.f2408e = r5
            return r0
        L_0x009c:
            r5 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a2:
            r5 = 0
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r6
            int r13 = r9 + r6
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r6
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = 1
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = 0
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r5 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.mo3520b(r5, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r5 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r5 = r1[r3]
            r13 = r2[r3]
            if (r5 < r13) goto L_0x0119
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r4 = r2[r3]
            r0.f2404a = r4
            int r4 = r0.f2404a
            int r4 = r4 - r12
            r0.f2405b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f2406c = r1
            r0.f2407d = r14
            r3 = 1
            r0.f2408e = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r5 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0586f.m3302a(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$f");
    }
}
