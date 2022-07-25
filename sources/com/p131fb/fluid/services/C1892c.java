package com.p131fb.fluid.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C0292h;
import androidx.core.app.C0298k;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.services.c */
public abstract class C1892c extends NotificationListenerService {

    /* renamed from: com.fb.fluid.services.c$a */
    public static final class C1893a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0298k f5289f;

        public C1893a(C0298k kVar) {
            this.f5289f = kVar;
        }

        public final void run() {
            this.f5289f.mo1927a(124);
        }
    }

    /* renamed from: com.fb.fluid.services.c$b */
    public static final class C1894b {
        private C1894b() {
        }

        public /* synthetic */ C1894b(C3366g gVar) {
            this();
        }
    }

    static {
        new C1894b((C3366g) null);
    }

    /* renamed from: a */
    private final void m7760a() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(C3148R.string.pref_notification_fix_pie);
            C3370k.m12223a((Object) string, "getString(R.string.pref_notification_fix_pie)");
            String string2 = getString(C3148R.string.pref_notification_fix_pie_sum);
            C3370k.m12223a((Object) string2, "getString(R.string.pref_notification_fix_pie_sum)");
            NotificationChannel notificationChannel = new NotificationChannel("notification_fix_pie", string, 2);
            notificationChannel.setDescription(string2);
            Object systemService = getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    public void onCreate() {
        super.onCreate();
        m7760a();
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        super.onNotificationRemoved(statusBarNotification);
        if (!C3370k.m12225a((Object) statusBarNotification != null ? statusBarNotification.getPackageName() : null, (Object) getPackageName())) {
            C0292h.C0294b bVar = new C0292h.C0294b(this, "notification_fix_pie");
            bVar.mo1919b((int) C3148R.C3149drawable.empty);
            bVar.mo1917a((CharSequence) BuildConfig.FLAVOR);
            bVar.mo1916a(-1);
            C0298k a = C0298k.m1482a((Context) this);
            a.mo1928a(124, bVar.mo1915a());
            new Handler().postDelayed(new C1893a(a), 800);
        }
    }
}
