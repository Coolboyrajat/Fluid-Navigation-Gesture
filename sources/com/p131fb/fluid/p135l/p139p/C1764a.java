package com.p131fb.fluid.p135l.p139p;

import android.app.Activity;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.C0401d;
import com.p131fb.fluid.p135l.p140q.C1783a;
import java.lang.reflect.Method;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.fb.fluid.l.p.a */
public final class C1764a {
    /* renamed from: a */
    public static final void m7432a(Activity activity) {
        C3370k.m12227b(activity, "$this$launchAccessibilitySettings");
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        if (C1775k.m7476a(intent, activity)) {
            activity.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: a */
    public static final void m7433a(Context context) {
        C3370k.m12227b(context, "$this$launchAssistant");
        try {
            Object systemService = context.getSystemService("search");
            if (systemService != null) {
                Method method = SearchManager.class.getMethod("launchAssist", new Class[]{Bundle.class});
                C3370k.m12223a((Object) method, "SearchManager::class.jav…ist\", Bundle::class.java)");
                method.invoke((SearchManager) systemService, new Object[]{new Bundle()});
                return;
            }
            throw new C3269p("null cannot be cast to non-null type android.app.SearchManager");
        } catch (Exception e) {
            C1776l.m7478a("uts.assist.e: " + e.getMessage(), (String) null, 1, (Object) null);
            Intent intent = new Intent("android.intent.action.ASSIST");
            intent.setFlags(270532608);
            if (C1775k.m7476a(intent, context)) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: a */
    public static final void m7434a(C0401d dVar, String str, int i) {
        C3370k.m12227b(dVar, "$this$openUrl");
        if (str == null) {
            str = dVar.getString(i);
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context baseContext = dVar.getBaseContext();
        C3370k.m12223a((Object) baseContext, "baseContext");
        if (C1775k.m7476a(intent, baseContext)) {
            dVar.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m7435a(C0401d dVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        m7434a(dVar, str, i);
    }

    /* renamed from: b */
    public static final void m7436b(Activity activity) {
        ComponentName componentName;
        C3370k.m12227b(activity, "$this$launchAddAutoStartupSettings");
        try {
            Intent intent = new Intent();
            if (C1783a.f5089a.mo6540c()) {
                componentName = new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity");
            } else if (C1783a.f5089a.mo6546i()) {
                componentName = new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity");
            } else if (C1783a.f5089a.mo6544g()) {
                componentName = new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity");
                Intent intent2 = new Intent();
                intent2.setComponent(componentName);
                Context baseContext = activity.getBaseContext();
                C3370k.m12223a((Object) baseContext, "baseContext");
                if (!C1775k.m7476a(intent2, baseContext)) {
                    componentName = new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.startup.StartupAppListActivity");
                }
            } else if (C1783a.f5089a.mo6539b()) {
                componentName = new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity");
            } else if (C1783a.f5089a.mo6542e()) {
                componentName = new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity");
            } else if (C1783a.f5089a.mo6537a()) {
                componentName = new ComponentName("com.asus.mobilemanager", "com.asus.mobilemanager.entry.FunctionActivity");
            } else {
                C1783a.C1784a aVar = C1783a.f5089a;
                Context baseContext2 = activity.getBaseContext();
                C3370k.m12223a((Object) baseContext2, "baseContext");
                componentName = aVar.mo6538a(baseContext2) ? new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity") : new ComponentName(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
            }
            intent.setComponent(componentName);
            if (C1775k.m7476a(intent, activity)) {
                activity.startActivity(intent);
            }
        } catch (Exception e) {
            C1776l.m7478a(String.valueOf(e), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: c */
    public static final void m7437c(Activity activity) {
        C3370k.m12227b(activity, "$this$launchAndroidSettings");
        Intent intent = new Intent("android.settings.SETTINGS");
        if (C1775k.m7476a(intent, activity)) {
            activity.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: d */
    public static final void m7438d(Activity activity) {
        C3370k.m12227b(activity, "$this$launchAppInfo");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + activity.getPackageName()));
            if (C1775k.m7476a(intent, activity)) {
                activity.startActivity(intent);
            }
        } catch (Exception e) {
            C1776l.m7478a("uts.app.i.e: " + e.getMessage(), (String) null, 1, (Object) null);
        }
    }

    /* renamed from: e */
    public static final void m7439e(Activity activity) {
        C3370k.m12227b(activity, "$this$launchBatteryOptimizationSettings");
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        if (C1775k.m7476a(intent, activity)) {
            activity.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: f */
    public static final void m7440f(Activity activity) {
        C3370k.m12227b(activity, "$this$launchDisplayOverlaysPage");
        if (Build.VERSION.SDK_INT >= 23) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName()));
            if (C1775k.m7476a(intent, activity)) {
                activity.startActivityForResult(intent, 200);
            }
        }
    }

    /* renamed from: g */
    public static final void m7441g(Activity activity) {
        C3370k.m12227b(activity, "$this$launchMarketPage");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + activity.getPackageName()));
        if (C1775k.m7476a(intent, activity)) {
            activity.startActivity(intent);
        }
    }
}
