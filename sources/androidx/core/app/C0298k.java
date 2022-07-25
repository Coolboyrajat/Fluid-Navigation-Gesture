package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p001v4.app.C0001a;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.k */
public final class C0298k {

    /* renamed from: c */
    private static final Object f1505c = new Object();

    /* renamed from: d */
    private static String f1506d;

    /* renamed from: e */
    private static Set<String> f1507e = new HashSet();

    /* renamed from: f */
    private static final Object f1508f = new Object();

    /* renamed from: g */
    private static C0302d f1509g;

    /* renamed from: a */
    private final Context f1510a;

    /* renamed from: b */
    private final NotificationManager f1511b = ((NotificationManager) this.f1510a.getSystemService("notification"));

    /* renamed from: androidx.core.app.k$a */
    private static class C0299a implements C0304e {

        /* renamed from: a */
        final String f1512a;

        /* renamed from: b */
        final int f1513b;

        /* renamed from: c */
        final String f1514c;

        /* renamed from: d */
        final boolean f1515d = false;

        C0299a(String str, int i, String str2) {
            this.f1512a = str;
            this.f1513b = i;
            this.f1514c = str2;
        }

        /* renamed from: a */
        public void mo1931a(C0001a aVar) {
            if (this.f1515d) {
                aVar.mo1a(this.f1512a);
            } else {
                aVar.mo2a(this.f1512a, this.f1513b, this.f1514c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f1512a + ", id:" + this.f1513b + ", tag:" + this.f1514c + ", all:" + this.f1515d + "]";
        }
    }

    /* renamed from: androidx.core.app.k$b */
    private static class C0300b implements C0304e {

        /* renamed from: a */
        final String f1516a;

        /* renamed from: b */
        final int f1517b;

        /* renamed from: c */
        final String f1518c;

        /* renamed from: d */
        final Notification f1519d;

        C0300b(String str, int i, String str2, Notification notification) {
            this.f1516a = str;
            this.f1517b = i;
            this.f1518c = str2;
            this.f1519d = notification;
        }

        /* renamed from: a */
        public void mo1931a(C0001a aVar) {
            aVar.mo3a(this.f1516a, this.f1517b, this.f1518c, this.f1519d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f1516a + ", id:" + this.f1517b + ", tag:" + this.f1518c + "]";
        }
    }

    /* renamed from: androidx.core.app.k$c */
    private static class C0301c {

        /* renamed from: a */
        final ComponentName f1520a;

        /* renamed from: b */
        final IBinder f1521b;

        C0301c(ComponentName componentName, IBinder iBinder) {
            this.f1520a = componentName;
            this.f1521b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.k$d */
    private static class C0302d implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        private final Context f1522a;

        /* renamed from: b */
        private final HandlerThread f1523b;

        /* renamed from: c */
        private final Handler f1524c;

        /* renamed from: d */
        private final Map<ComponentName, C0303a> f1525d = new HashMap();

        /* renamed from: e */
        private Set<String> f1526e = new HashSet();

        /* renamed from: androidx.core.app.k$d$a */
        private static class C0303a {

            /* renamed from: a */
            final ComponentName f1527a;

            /* renamed from: b */
            boolean f1528b = false;

            /* renamed from: c */
            C0001a f1529c;

            /* renamed from: d */
            ArrayDeque<C0304e> f1530d = new ArrayDeque<>();

            /* renamed from: e */
            int f1531e = 0;

            C0303a(ComponentName componentName) {
                this.f1527a = componentName;
            }
        }

        C0302d(Context context) {
            this.f1522a = context;
            this.f1523b = new HandlerThread("NotificationManagerCompat");
            this.f1523b.start();
            this.f1524c = new Handler(this.f1523b.getLooper(), this);
        }

        /* renamed from: a */
        private void m1492a() {
            Set<String> b = C0298k.m1485b(this.f1522a);
            if (!b.equals(this.f1526e)) {
                this.f1526e = b;
                List<ResolveInfo> queryIntentServices = this.f1522a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (b.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1525d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1525d.put(componentName2, new C0303a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0303a>> it = this.f1525d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m1497b((C0303a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private void m1493a(ComponentName componentName) {
            C0303a aVar = this.f1525d.get(componentName);
            if (aVar != null) {
                m1499c(aVar);
            }
        }

        /* renamed from: a */
        private void m1494a(ComponentName componentName, IBinder iBinder) {
            C0303a aVar = this.f1525d.get(componentName);
            if (aVar != null) {
                aVar.f1529c = C0001a.C0002a.m4a(iBinder);
                aVar.f1531e = 0;
                m1499c(aVar);
            }
        }

        /* renamed from: a */
        private boolean m1495a(C0303a aVar) {
            if (aVar.f1528b) {
                return true;
            }
            aVar.f1528b = this.f1522a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1527a), this, 33);
            if (aVar.f1528b) {
                aVar.f1531e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1527a);
                this.f1522a.unbindService(this);
            }
            return aVar.f1528b;
        }

        /* renamed from: b */
        private void m1496b(ComponentName componentName) {
            C0303a aVar = this.f1525d.get(componentName);
            if (aVar != null) {
                m1497b(aVar);
            }
        }

        /* renamed from: b */
        private void m1497b(C0303a aVar) {
            if (aVar.f1528b) {
                this.f1522a.unbindService(this);
                aVar.f1528b = false;
            }
            aVar.f1529c = null;
        }

        /* renamed from: b */
        private void m1498b(C0304e eVar) {
            m1492a();
            for (C0303a next : this.f1525d.values()) {
                next.f1530d.add(eVar);
                m1499c(next);
            }
        }

        /* renamed from: c */
        private void m1499c(C0303a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1527a + ", " + aVar.f1530d.size() + " queued tasks");
            }
            if (!aVar.f1530d.isEmpty()) {
                if (!m1495a(aVar) || aVar.f1529c == null) {
                    m1500d(aVar);
                    return;
                }
                while (true) {
                    C0304e peek = aVar.f1530d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo1931a(aVar.f1529c);
                        aVar.f1530d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f1527a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1527a, e);
                    }
                }
                if (!aVar.f1530d.isEmpty()) {
                    m1500d(aVar);
                }
            }
        }

        /* renamed from: d */
        private void m1500d(C0303a aVar) {
            if (!this.f1524c.hasMessages(3, aVar.f1527a)) {
                aVar.f1531e++;
                int i = aVar.f1531e;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1530d.size() + " tasks to " + aVar.f1527a + " after " + aVar.f1531e + " retries");
                    aVar.f1530d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f1524c.sendMessageDelayed(this.f1524c.obtainMessage(3, aVar.f1527a), (long) i2);
            }
        }

        /* renamed from: a */
        public void mo1934a(C0304e eVar) {
            this.f1524c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m1498b((C0304e) message.obj);
                return true;
            } else if (i == 1) {
                C0301c cVar = (C0301c) message.obj;
                m1494a(cVar.f1520a, cVar.f1521b);
                return true;
            } else if (i == 2) {
                m1496b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m1493a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1524c.obtainMessage(1, new C0301c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1524c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.k$e */
    private interface C0304e {
        /* renamed from: a */
        void mo1931a(C0001a aVar);
    }

    private C0298k(Context context) {
        this.f1510a = context;
    }

    /* renamed from: a */
    public static C0298k m1482a(Context context) {
        return new C0298k(context);
    }

    /* renamed from: a */
    private void m1483a(C0304e eVar) {
        synchronized (f1508f) {
            if (f1509g == null) {
                f1509g = new C0302d(this.f1510a.getApplicationContext());
            }
            f1509g.mo1934a(eVar);
        }
    }

    /* renamed from: a */
    private static boolean m1484a(Notification notification) {
        Bundle a = C0292h.m1451a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: b */
    public static Set<String> m1485b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1505c) {
            if (string != null) {
                if (!string.equals(f1506d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f1507e = hashSet;
                    f1506d = string;
                }
            }
            set = f1507e;
        }
        return set;
    }

    /* renamed from: a */
    public void mo1927a(int i) {
        mo1929a((String) null, i);
    }

    /* renamed from: a */
    public void mo1928a(int i, Notification notification) {
        mo1930a((String) null, i, notification);
    }

    /* renamed from: a */
    public void mo1929a(String str, int i) {
        this.f1511b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m1483a((C0304e) new C0299a(this.f1510a.getPackageName(), i, str));
        }
    }

    /* renamed from: a */
    public void mo1930a(String str, int i, Notification notification) {
        if (m1484a(notification)) {
            m1483a((C0304e) new C0300b(this.f1510a.getPackageName(), i, str, notification));
            this.f1511b.cancel(str, i);
            return;
        }
        this.f1511b.notify(str, i, notification);
    }
}
