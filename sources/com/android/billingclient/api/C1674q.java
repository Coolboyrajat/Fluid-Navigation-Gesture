package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.q */
public class C1674q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1677s f4888a;

    /* renamed from: com.android.billingclient.api.q$a */
    public static class C1675a {

        /* renamed from: a */
        private C1677s f4889a;

        /* renamed from: a */
        public C1675a mo6308a(C1677s sVar) {
            this.f4889a = sVar;
            return this;
        }

        /* renamed from: a */
        public C1674q mo6309a() {
            C1674q qVar = new C1674q();
            C1677s sVar = this.f4889a;
            if (sVar != null) {
                C1677s unused = qVar.f4888a = sVar;
                return qVar;
            }
            throw new RuntimeException("SkuDetails must be set");
        }
    }

    /* renamed from: a */
    public C1677s mo6307a() {
        return this.f4888a;
    }
}
