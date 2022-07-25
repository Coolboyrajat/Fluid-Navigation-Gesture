package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.MenuItem;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.ui.g.c.c0 */
public final class C2428c0 {

    /* renamed from: a */
    private String f6155a;

    /* renamed from: b */
    private Integer f6156b;

    /* renamed from: c */
    private final boolean f6157c;

    /* renamed from: d */
    private final boolean f6158d;

    /* renamed from: e */
    private final boolean f6159e;

    /* renamed from: f */
    private final boolean f6160f;

    /* renamed from: g */
    private final int f6161g;

    /* renamed from: h */
    private final C3350b<MenuItem, Boolean> f6162h;

    public C2428c0() {
        this((String) null, (Integer) null, false, false, false, false, 0, (C3350b) null, 255, (C3366g) null);
    }

    public C2428c0(String str, Integer num, boolean z, boolean z2, boolean z3, boolean z4, int i, C3350b<? super MenuItem, Boolean> bVar) {
        this.f6155a = str;
        this.f6156b = num;
        this.f6157c = z;
        this.f6158d = z2;
        this.f6159e = z3;
        this.f6160f = z4;
        this.f6161g = i;
        this.f6162h = bVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2428c0(java.lang.String r10, java.lang.Integer r11, boolean r12, boolean r13, boolean r14, boolean r15, int r16, kotlin.p205x.p206c.C3350b r17, int r18, kotlin.p205x.p207d.C3366g r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            r5 = 1
            if (r4 == 0) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = r12
        L_0x0019:
            r6 = r0 & 8
            r7 = 0
            if (r6 == 0) goto L_0x0020
            r6 = 0
            goto L_0x0021
        L_0x0020:
            r6 = r13
        L_0x0021:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r5 = r14
        L_0x0027:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = -1
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r6
            r15 = r5
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.p149g.p152c.C2428c0.<init>(java.lang.String, java.lang.Integer, boolean, boolean, boolean, boolean, int, kotlin.x.c.b, int, kotlin.x.d.g):void");
    }

    /* renamed from: a */
    public final int mo7256a() {
        return this.f6161g;
    }

    /* renamed from: b */
    public final C3350b<MenuItem, Boolean> mo7257b() {
        return this.f6162h;
    }

    /* renamed from: c */
    public final boolean mo7258c() {
        return this.f6160f;
    }

    /* renamed from: d */
    public final String mo7259d() {
        return this.f6155a;
    }

    /* renamed from: e */
    public final boolean mo7260e() {
        return this.f6157c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2428c0) {
                C2428c0 c0Var = (C2428c0) obj;
                if (C3370k.m12225a((Object) this.f6155a, (Object) c0Var.f6155a) && C3370k.m12225a((Object) this.f6156b, (Object) c0Var.f6156b)) {
                    if (this.f6157c == c0Var.f6157c) {
                        if (this.f6158d == c0Var.f6158d) {
                            if (this.f6159e == c0Var.f6159e) {
                                if (this.f6160f == c0Var.f6160f) {
                                    if (!(this.f6161g == c0Var.f6161g) || !C3370k.m12225a((Object) this.f6162h, (Object) c0Var.f6162h)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo7262f() {
        return this.f6158d;
    }

    /* renamed from: g */
    public final Integer mo7263g() {
        return this.f6156b;
    }

    /* renamed from: h */
    public final boolean mo7264h() {
        return this.f6159e;
    }

    public int hashCode() {
        String str = this.f6155a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f6156b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.f6157c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f6158d;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f6159e;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f6160f;
        if (z4) {
            z4 = true;
        }
        int a = (((i4 + (z4 ? 1 : 0)) * 31) + Integer.valueOf(this.f6161g).hashCode()) * 31;
        C3350b<MenuItem, Boolean> bVar = this.f6162h;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return a + i;
    }

    public String toString() {
        return "ToolbarItem(title=" + this.f6155a + ", titleRes=" + this.f6156b + ", titleCentered=" + this.f6157c + ", titleIsLarge=" + this.f6158d + ", titleUnderToolbar=" + this.f6159e + ", showHomeUp=" + this.f6160f + ", menu=" + this.f6161g + ", onMenuItemClick=" + this.f6162h + ")";
    }
}
