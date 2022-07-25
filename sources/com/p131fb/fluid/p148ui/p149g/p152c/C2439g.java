package com.p131fb.fluid.p148ui.p149g.p152c;

import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.p060q.C1065d;

/* renamed from: com.fb.fluid.ui.g.c.g */
public final class C2439g extends C2472t<Integer> {

    /* renamed from: p */
    private final int[] f6184p;

    /* renamed from: q */
    private final int[][] f6185q;

    public C2439g(int[] iArr, int[][] iArr2, C3350b<? super C2439g, Unit> bVar) {
        C3370k.m12227b(iArr, "colors");
        C3370k.m12227b(iArr2, "subColors");
        C3370k.m12227b(bVar, "func");
        this.f6184p = iArr;
        this.f6185q = iArr2;
        bVar.mo5146a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2439g(int[] iArr, int[][] iArr2, C3350b bVar, int i, C3366g gVar) {
        this((i & 1) != 0 ? C3279e.m12011a(C1065d.f3736c.mo5133a(), -16777216) : iArr, (i & 2) != 0 ? (int[][]) C3279e.m12012a((T[]) C1065d.f3736c.mo5134b(), new int[]{-1, -3355444, -7829368, -12303292, -16777216}) : iArr2, bVar);
    }

    /* renamed from: m */
    public final int[] mo7282m() {
        return this.f6184p;
    }

    /* renamed from: n */
    public final int mo7283n() {
        Integer num = (Integer) mo7333c();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: o */
    public final int[][] mo7284o() {
        return this.f6185q;
    }
}
