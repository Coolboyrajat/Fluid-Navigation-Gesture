package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0567a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.n */
class C0607n {

    /* renamed from: a */
    final C0608a f2479a;

    /* renamed from: androidx.recyclerview.widget.n$a */
    interface C0608a {
        /* renamed from: a */
        C0567a.C0569b mo3439a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo3441a(C0567a.C0569b bVar);
    }

    C0607n(C0608a aVar) {
        this.f2479a = aVar;
    }

    /* renamed from: a */
    private void m3391a(List<C0567a.C0569b> list, int i, int i2) {
        C0567a.C0569b bVar = list.get(i);
        C0567a.C0569b bVar2 = list.get(i2);
        int i3 = bVar2.f2323a;
        if (i3 == 1) {
            m3393c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo3564a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo3565b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private int m3392b(List<C0567a.C0569b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2323a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m3393c(List<C0567a.C0569b> list, int i, C0567a.C0569b bVar, int i2, C0567a.C0569b bVar2) {
        int i3 = bVar.f2326d < bVar2.f2324b ? -1 : 0;
        if (bVar.f2324b < bVar2.f2324b) {
            i3++;
        }
        int i4 = bVar2.f2324b;
        int i5 = bVar.f2324b;
        if (i4 <= i5) {
            bVar.f2324b = i5 + bVar2.f2326d;
        }
        int i6 = bVar2.f2324b;
        int i7 = bVar.f2326d;
        if (i6 <= i7) {
            bVar.f2326d = i7 + bVar2.f2326d;
        }
        bVar2.f2324b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3563a(List<C0567a.C0569b> list) {
        while (true) {
            int b = m3392b(list);
            if (b != -1) {
                m3391a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r0 > r14.f2324b) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        if (r0 >= r14.f2324b) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3564a(java.util.List<androidx.recyclerview.widget.C0567a.C0569b> r10, int r11, androidx.recyclerview.widget.C0567a.C0569b r12, int r13, androidx.recyclerview.widget.C0567a.C0569b r14) {
        /*
            r9 = this;
            int r0 = r12.f2324b
            int r1 = r12.f2326d
            r2 = 0
            r3 = 1
            int r4 = r14.f2324b
            if (r0 >= r1) goto L_0x0015
            if (r4 != r0) goto L_0x0013
            int r4 = r14.f2326d
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x0013
            r0 = 0
            goto L_0x001f
        L_0x0013:
            r0 = 0
            goto L_0x0022
        L_0x0015:
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0021
            int r4 = r14.f2326d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0021
            r0 = 1
        L_0x001f:
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            int r1 = r12.f2326d
            int r4 = r14.f2324b
            r5 = 2
            if (r1 >= r4) goto L_0x002d
            int r4 = r4 - r3
            r14.f2324b = r4
            goto L_0x0046
        L_0x002d:
            int r6 = r14.f2326d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0046
            int r6 = r6 - r3
            r14.f2326d = r6
            r12.f2323a = r5
            r12.f2326d = r3
            int r11 = r14.f2326d
            if (r11 != 0) goto L_0x0045
            r10.remove(r13)
            androidx.recyclerview.widget.n$a r10 = r9.f2479a
            r10.mo3441a(r14)
        L_0x0045:
            return
        L_0x0046:
            int r1 = r12.f2324b
            int r4 = r14.f2324b
            r6 = 0
            if (r1 > r4) goto L_0x0051
            int r4 = r4 + r3
            r14.f2324b = r4
            goto L_0x0067
        L_0x0051:
            int r7 = r14.f2326d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0067
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.n$a r7 = r9.f2479a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo3439a(r5, r1, r4, r6)
            int r1 = r12.f2324b
            int r3 = r14.f2324b
            int r1 = r1 - r3
            r14.f2326d = r1
        L_0x0067:
            if (r2 == 0) goto L_0x0075
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.n$a r10 = r9.f2479a
            r10.mo3441a(r12)
            return
        L_0x0075:
            if (r0 == 0) goto L_0x00a1
            if (r6 == 0) goto L_0x008f
            int r0 = r12.f2324b
            int r1 = r6.f2324b
            if (r0 <= r1) goto L_0x0084
            int r1 = r6.f2326d
            int r0 = r0 - r1
            r12.f2324b = r0
        L_0x0084:
            int r0 = r12.f2326d
            int r1 = r6.f2324b
            if (r0 <= r1) goto L_0x008f
            int r1 = r6.f2326d
            int r0 = r0 - r1
            r12.f2326d = r0
        L_0x008f:
            int r0 = r12.f2324b
            int r1 = r14.f2324b
            if (r0 <= r1) goto L_0x009a
            int r1 = r14.f2326d
            int r0 = r0 - r1
            r12.f2324b = r0
        L_0x009a:
            int r0 = r12.f2326d
            int r1 = r14.f2324b
            if (r0 <= r1) goto L_0x00cf
            goto L_0x00ca
        L_0x00a1:
            if (r6 == 0) goto L_0x00b9
            int r0 = r12.f2324b
            int r1 = r6.f2324b
            if (r0 < r1) goto L_0x00ae
            int r1 = r6.f2326d
            int r0 = r0 - r1
            r12.f2324b = r0
        L_0x00ae:
            int r0 = r12.f2326d
            int r1 = r6.f2324b
            if (r0 < r1) goto L_0x00b9
            int r1 = r6.f2326d
            int r0 = r0 - r1
            r12.f2326d = r0
        L_0x00b9:
            int r0 = r12.f2324b
            int r1 = r14.f2324b
            if (r0 < r1) goto L_0x00c4
            int r1 = r14.f2326d
            int r0 = r0 - r1
            r12.f2324b = r0
        L_0x00c4:
            int r0 = r12.f2326d
            int r1 = r14.f2324b
            if (r0 < r1) goto L_0x00cf
        L_0x00ca:
            int r1 = r14.f2326d
            int r0 = r0 - r1
            r12.f2326d = r0
        L_0x00cf:
            r10.set(r11, r14)
            int r14 = r12.f2324b
            int r0 = r12.f2326d
            if (r14 == r0) goto L_0x00dc
            r10.set(r13, r12)
            goto L_0x00df
        L_0x00dc:
            r10.remove(r13)
        L_0x00df:
            if (r6 == 0) goto L_0x00e4
            r10.add(r11, r6)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0607n.mo3564a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3565b(java.util.List<androidx.recyclerview.widget.C0567a.C0569b> r9, int r10, androidx.recyclerview.widget.C0567a.C0569b r11, int r12, androidx.recyclerview.widget.C0567a.C0569b r13) {
        /*
            r8 = this;
            int r0 = r11.f2326d
            int r1 = r13.f2324b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f2324b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f2326d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f2326d = r5
            androidx.recyclerview.widget.n$a r0 = r8.f2479a
            int r1 = r11.f2324b
            java.lang.Object r5 = r13.f2325c
            androidx.recyclerview.widget.a$b r0 = r0.mo3439a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f2324b
            int r5 = r13.f2324b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f2324b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f2326d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.n$a r3 = r8.f2479a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f2325c
            androidx.recyclerview.widget.a$b r3 = r3.mo3439a(r2, r1, r5, r4)
            int r1 = r13.f2326d
            int r1 = r1 - r5
            r13.f2326d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f2326d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.n$a r11 = r8.f2479a
            r11.mo3441a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0607n.mo3565b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
