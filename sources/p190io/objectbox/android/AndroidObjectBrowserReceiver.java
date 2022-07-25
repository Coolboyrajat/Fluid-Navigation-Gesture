package p190io.objectbox.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: io.objectbox.android.AndroidObjectBrowserReceiver */
public class AndroidObjectBrowserReceiver extends BroadcastReceiver {
    static final String ACTION_KEEP_ALIVE = "io.objectbox.action.KEEP_ALIVE";
    private static final String TAG = "ObjectBrowserReceiver";

    public void onReceive(Context context, Intent intent) {
        if (ACTION_KEEP_ALIVE.equals(intent.getAction())) {
            if (!intent.hasExtra("url")) {
                Log.w(TAG, "Ignoring keep alive intent due to incomplete data");
                return;
            }
            Intent intent2 = new Intent(context, AndroidObjectBrowserService.class);
            intent2.putExtras(intent);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent2);
            } else {
                context.startService(intent2);
            }
            context.startActivity(AndroidObjectBrowser.viewIntent(intent.getStringExtra("url")));
        }
    }
}
