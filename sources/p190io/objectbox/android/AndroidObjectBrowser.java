package p190io.objectbox.android;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import p190io.objectbox.BoxStore;

/* renamed from: io.objectbox.android.AndroidObjectBrowser */
public class AndroidObjectBrowser {
    private static final String NOTIFICATION_CHANNEL_ID = "objectbox-browser";
    private static final String TAG = "ObjectBrowser";
    private final BoxStore boxStore;
    private int notificationId;

    public AndroidObjectBrowser(BoxStore boxStore2) {
        this.boxStore = boxStore2;
    }

    static Notification.Builder buildBaseNotification(Context context, int i, NotificationManager notificationManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_CHANNEL_ID, "ObjectBox Browser", 3));
        }
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(context, NOTIFICATION_CHANNEL_ID) : new Notification.Builder(context);
        builder.setContentTitle(context.getString(C3148R.string.objectbox_objectBrowserNotificationTitle)).setContentText(context.getString(C3148R.string.objectbox_objectBrowserNotificationText, new Object[]{Integer.valueOf(i)})).setSmallIcon(C3148R.C3149drawable.objectbox_notification);
        return builder;
    }

    static Intent viewIntent(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        return intent;
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(int i) {
        this.notificationId = i;
    }

    public boolean start(Context context) {
        if (!BoxStore.isObjectBrowserAvailable()) {
            return false;
        }
        context.enforcePermission("android.permission.INTERNET", Process.myPid(), Process.myUid(), (String) null);
        if (Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28) {
            context.enforcePermission("android.permission.FOREGROUND_SERVICE", Process.myPid(), Process.myUid(), (String) null);
        }
        int objectBrowserPort = this.boxStore.getObjectBrowserPort();
        if (objectBrowserPort != 0) {
            Log.w(TAG, "ObjectBrowser is already running at port " + objectBrowserPort);
            return false;
        }
        String startObjectBrowser = this.boxStore.startObjectBrowser();
        if (startObjectBrowser == null) {
            return false;
        }
        Log.i(TAG, "ObjectBrowser started: " + startObjectBrowser);
        int objectBrowserPort2 = this.boxStore.getObjectBrowserPort();
        Log.i(TAG, "Command to forward ObjectBrowser to connected host: adb forward tcp:" + objectBrowserPort2 + " tcp:" + objectBrowserPort2);
        if (this.notificationId == 0) {
            this.notificationId = 19770000 + objectBrowserPort2;
        }
        Intent intent = new Intent(context, AndroidObjectBrowserReceiver.class);
        intent.setAction("io.objectbox.action.KEEP_ALIVE");
        intent.putExtra("url", startObjectBrowser);
        intent.putExtra("port", objectBrowserPort2);
        intent.putExtra("notificationId", this.notificationId);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 268435456);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Notification.Builder buildBaseNotification = buildBaseNotification(context, objectBrowserPort2, notificationManager);
        buildBaseNotification.setContentIntent(broadcast);
        if (notificationManager == null) {
            return true;
        }
        notificationManager.notify(this.notificationId, buildBaseNotification.getNotification());
        return true;
    }
}
