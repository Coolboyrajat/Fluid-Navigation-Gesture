package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C1660h;
import java.util.ArrayList;
import p054c.p074b.p075a.p076a.C1147a;

/* renamed from: com.android.billingclient.api.m */
final class C1670m {
    /* renamed from: a */
    static C1660h m7145a(Bundle bundle, String str, String str2) {
        String format;
        C1660h hVar = C1663i.f4867j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", new Object[]{str2});
        } else {
            int b = C1147a.m5661b(bundle, str);
            String a = C1147a.m5658a(bundle, str);
            C1660h.C1662b b2 = C1660h.m7124b();
            b2.mo6280a(b);
            b2.mo6281a(a);
            C1660h a2 = b2.mo6282a();
            if (b != 0) {
                C1147a.m5664c(str, String.format("%s failed. Response code: %s", new Object[]{str2, Integer.valueOf(b)}));
                return a2;
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                format = String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str2});
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str2});
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", new Object[]{str2});
                } else if (stringArrayList3 != null) {
                    return C1663i.f4871n;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", new Object[]{str2});
                }
            }
        }
        C1147a.m5664c(str, format);
        return hVar;
    }
}
