package com.p131fb.fluid.utils.preferences;

/* renamed from: com.fb.fluid.utils.preferences.a */
public final class C2515a {

    /* renamed from: b */
    private int f6376b;

    /* renamed from: c */
    private int f6377c;

    /* renamed from: d */
    private boolean f6378d;

    /* renamed from: e */
    private C2517c f6379e;

    /* renamed from: f */
    private C2517c f6380f;

    public C2515a(int i, int i2, boolean z, C2517c cVar, C2517c cVar2) {
        this.f6376b = i;
        this.f6377c = i2;
        this.f6378d = z;
        this.f6379e = cVar;
        this.f6380f = cVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2515a(int i, int i2, boolean z, C2517c cVar, C2517c cVar2, int i3, C3366g gVar) {
        this(i, i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? null : cVar, (i3 & 16) != 0 ? null : cVar2);
    }

    public final int getB() {
        return this.f6376b;
    }

    public final int getC() {
        return this.f6377c;
    }

    public final boolean getD() {
        return this.f6378d;
    }

    public final C2517c getE() {
        return this.f6379e;
    }

    public final C2517c getF() {
        return this.f6380f;
    }

    public final void setB(int i) {
        this.f6376b = i;
    }

    public final void setC(int i) {
        this.f6377c = i;
    }

    public final void setD(boolean z) {
        this.f6378d = z;
    }

    public final void setE(C2517c cVar) {
        this.f6379e = cVar;
    }

    public final void setF(C2517c cVar) {
        this.f6380f = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r9 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p131fb.fluid.data.TriggerButton toActionEvent(int r9) {
        /*
            r8 = this;
            com.fb.fluid.data.TriggerButton r0 = new com.fb.fluid.data.TriggerButton
            r0.<init>()
            r0.mo6411c(r9)
            int r9 = r8.f6376b
            r1 = 21
            r2 = 11
            if (r9 != r2) goto L_0x001a
            com.fb.fluid.l.c$a r3 = com.p131fb.fluid.p135l.C1734c.f5038h
            boolean r3 = r3.mo6474c()
            if (r3 == 0) goto L_0x001a
            r9 = 21
        L_0x001a:
            r0.mo6407b((int) r9)
            int r9 = r0.mo6412d()
            r3 = 0
            r4 = 15
            r5 = 14
            java.lang.String r6 = ""
            if (r9 == r5) goto L_0x0042
            if (r9 == r4) goto L_0x002e
        L_0x002c:
            r9 = r6
            goto L_0x0052
        L_0x002e:
            c.e.c.e r9 = new c.e.c.e
            r9.<init>()
            com.fb.fluid.utils.preferences.c r7 = r8.f6379e
            if (r7 == 0) goto L_0x003c
            com.fb.fluid.data.a r7 = r7.toActionShortcut()
            goto L_0x003d
        L_0x003c:
            r7 = r3
        L_0x003d:
            java.lang.String r9 = r9.mo5637a((java.lang.Object) r7)
            goto L_0x0052
        L_0x0042:
            com.fb.fluid.utils.preferences.c r9 = r8.f6379e
            if (r9 == 0) goto L_0x002c
            com.fb.fluid.data.a r9 = r9.toActionShortcut()
            if (r9 == 0) goto L_0x002c
            java.lang.String r9 = r9.mo6434r()
            if (r9 == 0) goto L_0x002c
        L_0x0052:
            r0.mo6404a((java.lang.String) r9)
            int r9 = r8.f6377c
            if (r9 != r2) goto L_0x0063
            com.fb.fluid.l.c$a r2 = com.p131fb.fluid.p135l.C1734c.f5038h
            boolean r2 = r2.mo6474c()
            if (r2 == 0) goto L_0x0063
            r9 = 21
        L_0x0063:
            r0.mo6402a((int) r9)
            int r9 = r0.mo6410c()
            if (r9 == r5) goto L_0x0081
            if (r9 == r4) goto L_0x006f
            goto L_0x0092
        L_0x006f:
            c.e.c.e r9 = new c.e.c.e
            r9.<init>()
            com.fb.fluid.utils.preferences.c r1 = r8.f6380f
            if (r1 == 0) goto L_0x007c
            com.fb.fluid.data.a r3 = r1.toActionShortcut()
        L_0x007c:
            java.lang.String r6 = r9.mo5637a((java.lang.Object) r3)
            goto L_0x0092
        L_0x0081:
            com.fb.fluid.utils.preferences.c r9 = r8.f6380f
            if (r9 == 0) goto L_0x0092
            com.fb.fluid.data.a r9 = r9.toActionShortcut()
            if (r9 == 0) goto L_0x0092
            java.lang.String r9 = r9.mo6434r()
            if (r9 == 0) goto L_0x0092
            r6 = r9
        L_0x0092:
            r0.mo6408b((java.lang.String) r6)
            r9 = 1
            r0.mo6409b((boolean) r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.utils.preferences.C2515a.toActionEvent(int):com.fb.fluid.data.TriggerButton");
    }
}
