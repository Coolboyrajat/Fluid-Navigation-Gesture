package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import p054c.p074b.p075a.p076a.C1147a;

public class ProxyBillingActivity extends Activity {

    /* renamed from: f */
    private ResultReceiver f4741f;

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            int b = C1147a.m5660b(intent, "ProxyBillingActivity");
            if (!(i2 == -1 && b == 0)) {
                C1147a.m5664c("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + b);
            }
            this.f4741f.send(b, intent == null ? null : intent.getExtras());
        } else {
            C1147a.m5664c("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            C1147a.m5663b("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f4741f = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            String str = "BUY_INTENT";
            if (!getIntent().hasExtra(str)) {
                str = "SUBS_MANAGEMENT_INTENT";
                if (!getIntent().hasExtra(str)) {
                    pendingIntent = null;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
                }
            }
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra(str);
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                C1147a.m5664c("ProxyBillingActivity", "Got exception while trying to start a purchase flow: " + e);
                this.f4741f.send(6, (Bundle) null);
                finish();
            }
        } else {
            C1147a.m5663b("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f4741f = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f4741f);
    }
}
