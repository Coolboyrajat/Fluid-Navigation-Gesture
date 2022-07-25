package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.C1668l;

/* renamed from: com.android.billingclient.api.d */
public abstract class C1622d {

    /* renamed from: com.android.billingclient.api.d$b */
    public static final class C1624b {

        /* renamed from: a */
        private final Context f4751a;

        /* renamed from: b */
        private int f4752b;

        /* renamed from: c */
        private int f4753c;

        /* renamed from: d */
        private boolean f4754d;

        /* renamed from: e */
        private C1673p f4755e;

        private C1624b(Context context) {
            this.f4752b = 0;
            this.f4753c = 0;
            this.f4751a = context;
        }

        /* renamed from: a */
        public C1624b mo6229a(C1673p pVar) {
            this.f4755e = pVar;
            return this;
        }

        /* renamed from: a */
        public C1622d mo6230a() {
            Context context = this.f4751a;
            if (context != null) {
                C1673p pVar = this.f4755e;
                if (pVar != null) {
                    boolean z = this.f4754d;
                    if (z) {
                        return new C1625e(context, this.f4752b, this.f4753c, z, pVar);
                    }
                    throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        /* renamed from: b */
        public C1624b mo6231b() {
            this.f4754d = true;
            return this;
        }
    }

    /* renamed from: a */
    public static C1624b m7043a(Context context) {
        return new C1624b(context);
    }

    /* renamed from: a */
    public abstract C1660h mo6219a(Activity activity, C1657g gVar);

    /* renamed from: a */
    public abstract C1668l.C1669a mo6220a(String str);

    /* renamed from: a */
    public abstract void mo6221a();

    /* renamed from: a */
    public abstract void mo6222a(C1615a aVar, C1618b bVar);

    /* renamed from: a */
    public abstract void mo6223a(C1656f fVar);

    /* renamed from: a */
    public abstract void mo6224a(C1664j jVar, C1667k kVar);

    /* renamed from: a */
    public abstract void mo6225a(C1674q qVar, C1676r rVar);

    /* renamed from: a */
    public abstract void mo6226a(C1679t tVar, C1682u uVar);

    /* renamed from: a */
    public abstract void mo6227a(String str, C1672o oVar);

    /* renamed from: b */
    public abstract boolean mo6228b();
}
