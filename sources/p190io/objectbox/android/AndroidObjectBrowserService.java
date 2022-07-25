package p190io.objectbox.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

/* renamed from: io.objectbox.android.AndroidObjectBrowserService */
public class AndroidObjectBrowserService extends Service {
    private static final String ACTION_STOP = "objectBox_objectBrowserStop";
    static final String EXTRA_KEY_NOTIFICATION_ID = "notificationId";
    static final String EXTRA_KEY_PORT = "port";
    static final String EXTRA_KEY_URL = "url";
    private static final String TAG = "ObjectBrowserService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (ACTION_STOP.equals(intent.getAction())) {
            Log.d(TAG, "Stopping");
            stopForeground(true);
            stopSelf();
            return 2;
        }
        String stringExtra = intent.getStringExtra(EXTRA_KEY_URL);
        int intExtra = intent.getIntExtra(EXTRA_KEY_PORT, 0);
        int intExtra2 = intent.getIntExtra(EXTRA_KEY_NOTIFICATION_ID, 0);
        if (stringExtra == null || !stringExtra.startsWith("http") || intExtra <= 0 || intExtra2 <= 0) {
            Log.w(TAG, "Ignoring start command due to incomplete data");
            return 2;
        }
        Intent intent2 = new Intent(this, AndroidObjectBrowserService.class);
        intent2.setAction(ACTION_STOP);
        PendingIntent service = PendingIntent.getService(this, 0, intent2, 268435456);
        PendingIntent activity = PendingIntent.getActivity(this, 0, AndroidObjectBrowser.viewIntent(stringExtra), 0);
        Notification.Builder buildBaseNotification = AndroidObjectBrowser.buildBaseNotification(this, intExtra, (NotificationManager) getSystemService("notification"));
        buildBaseNotification.setContentIntent(activity);
        buildBaseNotification.setDeleteIntent(service);
        if (Build.VERSION.SDK_INT >= 20) {
            buildBaseNotification.addAction(new Notification.Action.Builder(C3148R.C3149drawable.objectbox_stop, "Stop", service).build());
        }
        startForeground(intExtra2, buildBaseNotification.getNotification());
        Log.d(TAG, "Started");
        return 3;
    }
}
