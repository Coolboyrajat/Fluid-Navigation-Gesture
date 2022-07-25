package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.n */
public class C1671n {

    /* renamed from: a */
    private final String f4885a;

    /* renamed from: b */
    private final String f4886b;

    /* renamed from: c */
    private final JSONObject f4887c = new JSONObject(this.f4885a);

    public C1671n(String str, String str2) {
        this.f4885a = str;
        this.f4886b = str2;
    }

    /* renamed from: a */
    public String mo6299a() {
        return this.f4885a;
    }

    /* renamed from: b */
    public String mo6300b() {
        JSONObject jSONObject = this.f4887c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: c */
    public String mo6301c() {
        return this.f4886b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1671n)) {
            return false;
        }
        C1671n nVar = (C1671n) obj;
        return TextUtils.equals(this.f4885a, nVar.mo6299a()) && TextUtils.equals(this.f4886b, nVar.mo6301c());
    }

    public int hashCode() {
        return this.f4885a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: " + this.f4885a;
    }
}
