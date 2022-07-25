package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.h */
public final class C1660h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f4854a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f4855b;

    /* renamed from: com.android.billingclient.api.h$b */
    public static class C1662b {

        /* renamed from: a */
        private int f4856a;

        /* renamed from: b */
        private String f4857b;

        private C1662b() {
        }

        /* renamed from: a */
        public C1662b mo6280a(int i) {
            this.f4856a = i;
            return this;
        }

        /* renamed from: a */
        public C1662b mo6281a(String str) {
            this.f4857b = str;
            return this;
        }

        /* renamed from: a */
        public C1660h mo6282a() {
            C1660h hVar = new C1660h();
            int unused = hVar.f4854a = this.f4856a;
            String unused2 = hVar.f4855b = this.f4857b;
            return hVar;
        }
    }

    /* renamed from: b */
    public static C1662b m7124b() {
        return new C1662b();
    }

    /* renamed from: a */
    public int mo6279a() {
        return this.f4854a;
    }
}
