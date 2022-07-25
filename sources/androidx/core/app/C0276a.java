package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.C0311a;

/* renamed from: androidx.core.app.a */
public class C0276a extends C0311a {

    /* renamed from: c */
    private static C0279c f1420c;

    /* renamed from: androidx.core.app.a$a */
    static class C0277a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String[] f1421f;

        /* renamed from: g */
        final /* synthetic */ Activity f1422g;

        /* renamed from: h */
        final /* synthetic */ int f1423h;

        C0277a(String[] strArr, Activity activity, int i) {
            this.f1421f = strArr;
            this.f1422g = activity;
            this.f1423h = i;
        }

        public void run() {
            int[] iArr = new int[this.f1421f.length];
            PackageManager packageManager = this.f1422g.getPackageManager();
            String packageName = this.f1422g.getPackageName();
            int length = this.f1421f.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f1421f[i], packageName);
            }
            ((C0278b) this.f1422g).onRequestPermissionsResult(this.f1423h, this.f1421f, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    public interface C0278b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    public interface C0279c {
        /* renamed from: a */
        boolean mo1891a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo1892a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$d */
    public interface C0280d {
        /* renamed from: a */
        void mo1893a(int i);
    }

    /* renamed from: a */
    public static C0279c m1421a() {
        return f1420c;
    }

    /* renamed from: a */
    public static void m1422a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m1423a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m1424a(Activity activity, String[] strArr, int i) {
        C0279c cVar = f1420c;
        if (cVar != null && cVar.mo1892a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0280d) {
                ((C0280d) activity).mo1893a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0278b) {
            new Handler(Looper.getMainLooper()).post(new C0277a(strArr, activity, i));
        }
    }

    /* renamed from: b */
    public static void m1425b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !C0283c.m1435a(activity)) {
            activity.recreate();
        }
    }
}
