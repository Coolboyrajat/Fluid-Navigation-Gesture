package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.l */
class C0486l {

    /* renamed from: a */
    private static AtomicBoolean f2049a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.l$a */
    static class C0487a extends C0475d {
        C0487a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0504x.m2485b(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m2439a(Context context) {
        if (!f2049a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0487a());
        }
    }
}
