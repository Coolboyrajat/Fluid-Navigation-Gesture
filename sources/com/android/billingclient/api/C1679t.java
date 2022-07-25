package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.t */
public class C1679t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f4895a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<String> f4896b;

    /* renamed from: com.android.billingclient.api.t$b */
    public static class C1681b {

        /* renamed from: a */
        private String f4897a;

        /* renamed from: b */
        private List<String> f4898b;

        private C1681b() {
        }

        /* renamed from: a */
        public C1681b mo6325a(String str) {
            this.f4897a = str;
            return this;
        }

        /* renamed from: a */
        public C1681b mo6326a(List<String> list) {
            this.f4898b = new ArrayList(list);
            return this;
        }

        /* renamed from: a */
        public C1679t mo6327a() {
            C1679t tVar = new C1679t();
            String unused = tVar.f4895a = this.f4897a;
            List unused2 = tVar.f4896b = this.f4898b;
            return tVar;
        }
    }

    /* renamed from: c */
    public static C1681b m7167c() {
        return new C1681b();
    }

    /* renamed from: a */
    public String mo6323a() {
        return this.f4895a;
    }

    /* renamed from: b */
    public List<String> mo6324b() {
        return this.f4896b;
    }
}
