package com.p131fb.fluid.services;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import com.p131fb.fluid.utils.preferences.C2527h;
import kotlin.C3256e;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;

/* renamed from: com.fb.fluid.services.a */
public abstract class C1800a extends AccessibilityService {

    /* renamed from: g */
    static final /* synthetic */ C3208i[] f5117g;

    /* renamed from: f */
    private final C3256e f5118f = C3258g.m11969a(new C1801a(this));

    /* renamed from: com.fb.fluid.services.a$a */
    static final class C1801a extends C3371l implements C3349a<C2527h> {

        /* renamed from: g */
        final /* synthetic */ C1800a f5119g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1801a(C1800a aVar) {
            super(0);
            this.f5119g = aVar;
        }

        public final C2527h invoke() {
            return new C2527h(this.f5119g);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(C1800a.class), "prefs", "getPrefs()Lcom/fb/fluid/utils/preferences/SharedPrefHelper;");
        C3384y.m12259a((C3379t) uVar);
        f5117g = new C3208i[]{uVar};
    }

    /* renamed from: a */
    private final C2527h m7564a() {
        C3256e eVar = this.f5118f;
        C3208i iVar = f5117g[0];
        return (C2527h) eVar.getValue();
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    public void onInterrupt() {
    }

    /* access modifiers changed from: protected */
    public boolean onKeyEvent(KeyEvent keyEvent) {
        Integer valueOf = keyEvent != null ? Integer.valueOf(keyEvent.getKeyCode()) : null;
        if (((valueOf != null && valueOf.intValue() == 4) || ((valueOf != null && valueOf.intValue() == 3) || ((valueOf != null && valueOf.intValue() == 187) || (valueOf != null && valueOf.intValue() == 82)))) && m7564a().mo7498K() && C1802b.f5122d0.mo6604a()) {
            return true;
        }
        return super.onKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        super.onServiceConnected();
        AccessibilityServiceInfo serviceInfo = getServiceInfo();
        if (serviceInfo != null) {
            serviceInfo.eventTypes = 0;
            serviceInfo.feedbackType = 16;
            serviceInfo.flags = 32;
            serviceInfo.notificationTimeout = 100;
        } else {
            serviceInfo = null;
        }
        setServiceInfo(serviceInfo);
    }
}
