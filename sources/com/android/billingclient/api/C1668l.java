package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.l */
public class C1668l {

    /* renamed from: a */
    private final String f4880a;

    /* renamed from: b */
    private final String f4881b;

    /* renamed from: c */
    private final JSONObject f4882c = new JSONObject(this.f4880a);

    /* renamed from: com.android.billingclient.api.l$a */
    public static class C1669a {

        /* renamed from: a */
        private List<C1668l> f4883a;

        /* renamed from: b */
        private C1660h f4884b;

        public C1669a(C1660h hVar, List<C1668l> list) {
            this.f4883a = list;
            this.f4884b = hVar;
        }

        /* renamed from: a */
        public C1660h mo6297a() {
            return this.f4884b;
        }

        /* renamed from: b */
        public List<C1668l> mo6298b() {
            return this.f4883a;
        }
    }

    public C1668l(String str, String str2) {
        this.f4880a = str;
        this.f4881b = str2;
    }

    /* renamed from: a */
    public String mo6288a() {
        return this.f4880a;
    }

    /* renamed from: b */
    public int mo6289b() {
        return this.f4882c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: c */
    public String mo6290c() {
        JSONObject jSONObject = this.f4882c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: d */
    public String mo6291d() {
        return this.f4881b;
    }

    /* renamed from: e */
    public String mo6292e() {
        return this.f4882c.optString("productId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1668l)) {
            return false;
        }
        C1668l lVar = (C1668l) obj;
        return TextUtils.equals(this.f4880a, lVar.mo6288a()) && TextUtils.equals(this.f4881b, lVar.mo6291d());
    }

    /* renamed from: f */
    public boolean mo6294f() {
        return this.f4882c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f4880a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: " + this.f4880a;
    }
}
