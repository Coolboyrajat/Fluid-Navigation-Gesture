package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.j */
public final class C1664j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f4876a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f4877b;

    /* renamed from: com.android.billingclient.api.j$b */
    public static final class C1666b {

        /* renamed from: a */
        private String f4878a;

        /* renamed from: b */
        private String f4879b;

        private C1666b() {
        }

        /* renamed from: a */
        public C1666b mo6285a(String str) {
            this.f4879b = str;
            return this;
        }

        /* renamed from: a */
        public C1664j mo6286a() {
            C1664j jVar = new C1664j();
            String unused = jVar.f4876a = this.f4879b;
            String unused2 = jVar.f4877b = this.f4878a;
            return jVar;
        }
    }

    private C1664j() {
    }

    /* renamed from: c */
    public static C1666b m7131c() {
        return new C1666b();
    }

    /* renamed from: a */
    public String mo6283a() {
        return this.f4877b;
    }

    /* renamed from: b */
    public String mo6284b() {
        return this.f4876a;
    }
}
