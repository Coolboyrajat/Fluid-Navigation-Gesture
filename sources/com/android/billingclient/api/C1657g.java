package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.g */
public class C1657g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1677s f4842a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f4843b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f4844c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f4845d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f4846e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f4847f;

    /* renamed from: com.android.billingclient.api.g$b */
    public static class C1659b {

        /* renamed from: a */
        private C1677s f4848a;

        /* renamed from: b */
        private String f4849b;

        /* renamed from: c */
        private String f4850c;

        /* renamed from: d */
        private boolean f4851d;

        /* renamed from: e */
        private int f4852e;

        /* renamed from: f */
        private String f4853f;

        private C1659b() {
            this.f4852e = 0;
        }

        /* renamed from: a */
        public C1659b mo6277a(C1677s sVar) {
            this.f4848a = sVar;
            return this;
        }

        /* renamed from: a */
        public C1657g mo6278a() {
            C1657g gVar = new C1657g();
            C1677s unused = gVar.f4842a = this.f4848a;
            String unused2 = gVar.f4843b = this.f4849b;
            String unused3 = gVar.f4844c = this.f4850c;
            boolean unused4 = gVar.f4845d = this.f4851d;
            int unused5 = gVar.f4846e = this.f4852e;
            String unused6 = gVar.f4847f = this.f4853f;
            return gVar;
        }
    }

    /* renamed from: j */
    public static C1659b m7110j() {
        return new C1659b();
    }

    /* renamed from: a */
    public String mo6268a() {
        return this.f4844c;
    }

    /* renamed from: b */
    public String mo6269b() {
        return this.f4847f;
    }

    /* renamed from: c */
    public String mo6270c() {
        return this.f4843b;
    }

    /* renamed from: d */
    public int mo6271d() {
        return this.f4846e;
    }

    /* renamed from: e */
    public String mo6272e() {
        C1677s sVar = this.f4842a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo6312b();
    }

    /* renamed from: f */
    public C1677s mo6273f() {
        return this.f4842a;
    }

    /* renamed from: g */
    public String mo6274g() {
        C1677s sVar = this.f4842a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo6314d();
    }

    /* renamed from: h */
    public boolean mo6275h() {
        return this.f4845d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6276i() {
        return (!this.f4845d && this.f4844c == null && this.f4847f == null && this.f4846e == 0) ? false : true;
    }
}
