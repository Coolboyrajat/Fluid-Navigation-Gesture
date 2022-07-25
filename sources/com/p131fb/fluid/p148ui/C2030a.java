package com.p131fb.fluid.p148ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.C0375f;
import androidx.fragment.app.C0399c;
import androidx.fragment.app.C0401d;
import androidx.lifecycle.C0490o;
import com.p131fb.fluid.p132j.C1723c;
import com.p131fb.fluid.p135l.p139p.C1764a;
import com.p131fb.fluid.p148ui.ActivitySettings;
import java.util.HashMap;
import kotlin.C3261j;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1039a;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p062r.C1084a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.a */
public final class C2030a extends C0399c implements C2032b {

    /* renamed from: n0 */
    public static final C2031a f5617n0 = new C2031a((C3366g) null);

    /* renamed from: m0 */
    private HashMap f5618m0;

    /* renamed from: com.fb.fluid.ui.a$a */
    public static final class C2031a {
        private C2031a() {
        }

        public /* synthetic */ C2031a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C2030a m8300a(C2031a aVar, C0401d dVar, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                bundle = new Bundle();
            }
            return aVar.mo6881a(dVar, bundle);
        }

        /* renamed from: a */
        public final C2030a mo6881a(C0401d dVar, Bundle bundle) {
            C3370k.m12227b(dVar, "context");
            C3370k.m12227b(bundle, "args");
            C2030a aVar = new C2030a();
            aVar.mo2290m(bundle);
            aVar.mo2353a(dVar.mo2364k(), "SHORTCUT");
            return aVar;
        }
    }

    /* renamed from: D0 */
    public void mo6873D0() {
        HashMap hashMap = this.f5618m0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo2279h0() {
        super.mo2279h0();
        mo6873D0();
    }

    /* renamed from: j */
    public void mo6874j() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        C1764a.m7435a(x0, mo2224a((int) C3148R.string.url_dev_twitter), 0, 2, (Object) null);
    }

    /* renamed from: k */
    public void mo6875k() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        C1764a.m7435a(x0, mo2224a((int) C3148R.string.url_dev_github), 0, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002a, code lost:
        r1 = r1.versionName;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo6876l() {
        /*
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "requireActivity()"
            androidx.fragment.app.d r2 = r4.mo2311x0()     // Catch:{ Exception -> 0x002f }
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x002f }
            android.app.Application r2 = r2.getApplication()     // Catch:{ Exception -> 0x002f }
            java.lang.String r3 = "requireActivity().application"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x002f }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x002f }
            androidx.fragment.app.d r3 = r4.mo2311x0()     // Catch:{ Exception -> 0x002f }
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = r3.getPackageName()     // Catch:{ Exception -> 0x002f }
            r3 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r1.versionName     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x002f
            r0 = r1
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p131fb.fluid.p148ui.C2030a.mo6876l():java.lang.String");
    }

    /* renamed from: m */
    public void mo6877m() {
        ActivitySettings.C1993b bVar = ActivitySettings.f5563E;
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        ActivitySettings.C1993b.m8225a(bVar, x0, 8, 0, new C3261j[0], (C3351c) null, 20, (Object) null);
    }

    /* renamed from: n */
    public Dialog mo2355n(Bundle bundle) {
        C0401d u = mo2304u();
        if (u != null) {
            C3370k.m12223a((Object) u, "activity ?: throw Illega…eException(\"AboutDialog\")");
            C1723c cVar = (C1723c) C0375f.m1846a(LayoutInflater.from(u), (int) C3148R.layout.layout_dialog_about, (ViewGroup) null, false);
            cVar.mo2135a((C0490o) this);
            cVar.mo6460a(this);
            C1041c cVar2 = new C1041c(u, (C1039a) null, 2, (C3366g) null);
            cVar2.mo5118j();
            C3370k.m12223a((Object) cVar, "binding");
            C1084a.m5469a(cVar2, (Integer) null, cVar.mo2140c(), false, true, false, false, 49, (Object) null);
            cVar2.show();
            return cVar2;
        }
        throw new IllegalStateException("AboutDialog");
    }

    /* renamed from: p */
    public void mo6878p() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        C1764a.m7435a(x0, mo2224a((int) C3148R.string.url_dev_privacy), 0, 2, (Object) null);
    }

    /* renamed from: q */
    public void mo6879q() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        C1764a.m7441g(x0);
    }

    /* renamed from: r */
    public void mo6880r() {
        C0401d x0 = mo2311x0();
        C3370k.m12223a((Object) x0, "requireActivity()");
        C1764a.m7435a(x0, mo2224a((int) C3148R.string.url_dev_website), 0, 2, (Object) null);
    }
}
