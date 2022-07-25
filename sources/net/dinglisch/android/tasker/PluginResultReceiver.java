package net.dinglisch.android.tasker;

import android.os.Handler;
import android.os.ResultReceiver;

public final class PluginResultReceiver extends ResultReceiver {
    public PluginResultReceiver(Handler handler) {
        super(handler);
    }
}
