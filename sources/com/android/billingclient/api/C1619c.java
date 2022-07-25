package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p054c.p074b.p075a.p076a.C1147a;

/* renamed from: com.android.billingclient.api.c */
class C1619c {

    /* renamed from: a */
    private final Context f4746a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1621b f4747b;

    /* renamed from: com.android.billingclient.api.c$b */
    private class C1621b extends BroadcastReceiver {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1673p f4748a;

        /* renamed from: b */
        private boolean f4749b;

        private C1621b(C1673p pVar) {
            this.f4748a = pVar;
        }

        /* renamed from: a */
        public void mo6216a(Context context) {
            if (this.f4749b) {
                context.unregisterReceiver(C1619c.this.f4747b);
                this.f4749b = false;
                return;
            }
            C1147a.m5664c("BillingBroadcastManager", "Receiver is not registered.");
        }

        /* renamed from: a */
        public void mo6217a(Context context, IntentFilter intentFilter) {
            if (!this.f4749b) {
                context.registerReceiver(C1619c.this.f4747b, intentFilter);
                this.f4749b = true;
            }
        }

        public void onReceive(Context context, Intent intent) {
            this.f4748a.mo6306a(C1147a.m5656a(intent, "BillingBroadcastManager"), C1147a.m5659a(intent.getExtras()));
        }
    }

    C1619c(Context context, C1673p pVar) {
        this.f4746a = context;
        this.f4747b = new C1621b(pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6213a() {
        this.f4747b.mo6216a(this.f4746a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1673p mo6214b() {
        return this.f4747b.f4748a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6215c() {
        this.f4747b.mo6217a(this.f4746a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}
