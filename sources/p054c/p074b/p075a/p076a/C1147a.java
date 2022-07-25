package p054c.p074b.p075a.p076a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.C1615a;
import com.android.billingclient.api.C1657g;
import com.android.billingclient.api.C1660h;
import com.android.billingclient.api.C1664j;
import com.android.billingclient.api.C1668l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import p190io.objectbox.android.BuildConfig;

/* renamed from: c.b.a.a.a */
public final class C1147a {

    /* renamed from: a */
    public static int f3856a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static Bundle m5651a(C1615a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        String a = aVar.mo6208a();
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("developerPayload", a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m5652a(C1657g gVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (gVar.mo6271d() != 0) {
            bundle.putInt("prorationMode", gVar.mo6271d());
        }
        if (!TextUtils.isEmpty(gVar.mo6268a())) {
            bundle.putString("accountId", gVar.mo6268a());
        }
        if (gVar.mo6275h()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(gVar.mo6270c())) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{gVar.mo6270c()})));
        }
        if (!TextUtils.isEmpty(gVar.mo6269b())) {
            bundle.putString("developerId", gVar.mo6269b());
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m5653a(C1664j jVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        String a = jVar.mo6283a();
        if (z && !TextUtils.isEmpty(a)) {
            bundle.putString("developerPayload", a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m5654a(String str, int i, int i2, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("rewardToken", str);
        bundle.putString("playBillingLibraryVersion", str2);
        if (i != 0) {
            bundle.putInt("childDirected", i);
        }
        if (i2 != 0) {
            bundle.putInt("underAgeOfConsent", i);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m5655a(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: a */
    public static C1660h m5656a(Intent intent, String str) {
        if (intent == null) {
            m5664c("BillingHelper", "Got null intent!");
            C1660h.C1662b b = C1660h.m7124b();
            b.mo6280a(6);
            b.mo6281a("An internal error occurred.");
            return b.mo6282a();
        }
        C1660h.C1662b b2 = C1660h.m7124b();
        b2.mo6280a(m5661b(intent.getExtras(), str));
        b2.mo6281a(m5658a(intent.getExtras(), str));
        return b2.mo6282a();
    }

    /* renamed from: a */
    private static C1668l m5657a(String str, String str2) {
        if (str == null || str2 == null) {
            m5664c("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new C1668l(str, str2);
        } catch (JSONException e) {
            m5664c("BillingHelper", "Got JSONException while parsing purchase data: " + e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m5658a(Bundle bundle, String str) {
        if (bundle == null) {
            m5664c(str, "Unexpected null bundle received!");
            return BuildConfig.FLAVOR;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m5663b(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return BuildConfig.FLAVOR;
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            m5664c(str, "Unexpected type for debug message: " + obj.getClass().getName());
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    public static List<C1668l> m5659a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            m5664c("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            C1668l a = m5657a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (a == null) {
                m5664c("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(a);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                C1668l a2 = m5657a(stringArrayList.get(i), stringArrayList2.get(i));
                if (a2 != null) {
                    arrayList.add(a2);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static int m5660b(Intent intent, String str) {
        return m5656a(intent, str).mo6279a();
    }

    /* renamed from: b */
    public static int m5661b(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            str2 = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                m5663b(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                str2 = "Unexpected type for bundle response code: " + obj.getClass().getName();
            }
        }
        m5664c(str, str2);
        return 6;
    }

    /* renamed from: b */
    public static Bundle m5662b(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: b */
    public static void m5663b(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: c */
    public static void m5664c(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }
}
