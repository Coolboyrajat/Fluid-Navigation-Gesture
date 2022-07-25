package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.s */
public class C1677s {

    /* renamed from: a */
    private final String f4890a;

    /* renamed from: b */
    private final JSONObject f4891b = new JSONObject(this.f4890a);

    /* renamed from: com.android.billingclient.api.s$a */
    public static class C1678a {

        /* renamed from: a */
        private List<C1677s> f4892a;

        /* renamed from: b */
        private int f4893b;

        /* renamed from: c */
        private String f4894c;

        public C1678a(int i, String str, List<C1677s> list) {
            this.f4893b = i;
            this.f4894c = str;
            this.f4892a = list;
        }

        /* renamed from: a */
        public String mo6320a() {
            return this.f4894c;
        }

        /* renamed from: b */
        public int mo6321b() {
            return this.f4893b;
        }

        /* renamed from: c */
        public List<C1677s> mo6322c() {
            return this.f4892a;
        }
    }

    public C1677s(String str) {
        this.f4890a = str;
    }

    /* renamed from: a */
    public String mo6311a() {
        return this.f4891b.optString("price");
    }

    /* renamed from: b */
    public String mo6312b() {
        return this.f4891b.optString("productId");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo6313c() {
        return this.f4891b.optString("skuDetailsToken");
    }

    /* renamed from: d */
    public String mo6314d() {
        return this.f4891b.optString("type");
    }

    /* renamed from: e */
    public boolean mo6315e() {
        return this.f4891b.has("rewardToken");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1677s.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f4890a, ((C1677s) obj).f4890a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo6317f() {
        return this.f4891b.optString("rewardToken");
    }

    public int hashCode() {
        return this.f4890a.hashCode();
    }

    public String toString() {
        return "SkuDetails: " + this.f4890a;
    }
}
