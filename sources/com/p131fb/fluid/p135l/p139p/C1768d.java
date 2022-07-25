package com.p131fb.fluid.p135l.p139p;

import android.content.ComponentName;
import com.p131fb.fluid.p135l.p141r.C1793a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.d */
public final class C1768d {
    /* renamed from: a */
    public static final boolean m7448a(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isAndroidSettingsAccessibility");
        if (!C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.android.settings")) {
            return false;
        }
        String className = componentName.getClassName();
        C3370k.m12223a((Object) className, "className");
        return C3251o.m11953a((CharSequence) className, (CharSequence) "AccessibilitySettingsActivity", false, 2, (Object) null);
    }

    /* renamed from: b */
    public static final boolean m7449b(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isAndroidSettingsDisplayOverlays");
        return C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.android.settings") && C3370k.m12225a((Object) componentName.getClassName(), (Object) "com.android.settings.Settings$AppDrawOverlaySettingsActivity");
    }

    /* renamed from: c */
    public static final boolean m7450c(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isAppPermissionManager");
        return C3370k.m12225a((Object) componentName.getClassName(), (Object) "com.android.packageinstaller.permission.ui.ManagePermissionsActivity") || C3370k.m12225a((Object) componentName.getClassName(), (Object) "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
    }

    /* renamed from: d */
    public static final boolean m7451d(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isChromeCustomTabs");
        return C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.android.chrome") && C3370k.m12225a((Object) componentName.getClassName(), (Object) "org.chromium.chrome.browser.customtabs.CustomTabActivity");
    }

    /* renamed from: e */
    public static final boolean m7452e(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isHuaweiLockActivity");
        return C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.huawei.systemmanager") && C3370k.m12225a((Object) componentName.getClassName(), (Object) "com.huawei.systemmanager.applock.password.AuthLaunchLockedAppActivity");
    }

    /* renamed from: f */
    public static final boolean m7453f(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isKnownDialUI");
        return C3370k.m12225a((Object) componentName.toString(), (Object) "ComponentInfo{com.google.android.dialer/com.android.incallui.InCallActivity}") || C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.samsung.android.incallui") || C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.android.incallui");
    }

    /* renamed from: g */
    public static final boolean m7454g(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isPackageInstaller");
        return C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6577j()) || C3370k.m12225a((Object) componentName.getPackageName(), (Object) C1793a.f5110q.mo6578k());
    }

    /* renamed from: h */
    public static final boolean m7455h(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isPlayGamesSignIn");
        return (C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.google.android.play.games") && C3370k.m12225a((Object) componentName.getClassName(), (Object) "com.google.android.gms.games.ui.signin.SignInActivity")) || (C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.google.android.play.games") && C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.app.Dialog"));
    }

    /* renamed from: i */
    public static final boolean m7456i(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isSoftInputWindow");
        return C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.inputmethodservice.SoftInputWindow");
    }

    /* renamed from: j */
    public static final boolean m7457j(ComponentName componentName) {
        C3370k.m12227b(componentName, "$this$isVolumeDialog");
        return C3370k.m12225a((Object) componentName.getPackageName(), (Object) "com.android.systemui") && (C3370k.m12225a((Object) componentName.getClassName(), (Object) "com.android.systemui.volume.VolumeDialogImpl$CustomDialog") || C3370k.m12225a((Object) componentName.getClassName(), (Object) "android.app.Dialog"));
    }
}
