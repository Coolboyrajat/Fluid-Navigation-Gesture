package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.core.app.b */
public class C0281b {

    /* renamed from: androidx.core.app.b$a */
    private static class C0282a extends C0281b {

        /* renamed from: a */
        private final ActivityOptions f1424a;

        C0282a(ActivityOptions activityOptions) {
            this.f1424a = activityOptions;
        }

        /* renamed from: a */
        public Bundle mo1894a() {
            return this.f1424a.toBundle();
        }
    }

    protected C0281b() {
    }

    /* renamed from: a */
    public static C0281b m1429a(Context context, int i, int i2) {
        return Build.VERSION.SDK_INT >= 16 ? new C0282a(ActivityOptions.makeCustomAnimation(context, i, i2)) : new C0281b();
    }

    /* renamed from: a */
    public static C0281b m1430a(View view, int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 23 ? new C0282a(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4)) : new C0281b();
    }

    /* renamed from: a */
    public Bundle mo1894a() {
        return null;
    }
}
