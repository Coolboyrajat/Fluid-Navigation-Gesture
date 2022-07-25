package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
final class C0283c {

    /* renamed from: a */
    protected static final Class<?> f1425a = m1433a();

    /* renamed from: b */
    protected static final Field f1426b = m1437b();

    /* renamed from: c */
    protected static final Field f1427c = m1439c();

    /* renamed from: d */
    protected static final Method f1428d = m1438b(f1425a);

    /* renamed from: e */
    protected static final Method f1429e = m1434a(f1425a);

    /* renamed from: f */
    protected static final Method f1430f = m1440c(f1425a);

    /* renamed from: g */
    private static final Handler f1431g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    static class C0284a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0287d f1432f;

        /* renamed from: g */
        final /* synthetic */ Object f1433g;

        C0284a(C0287d dVar, Object obj) {
            this.f1432f = dVar;
            this.f1433g = obj;
        }

        public void run() {
            this.f1432f.f1438a = this.f1433g;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    static class C0285b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f1434f;

        /* renamed from: g */
        final /* synthetic */ C0287d f1435g;

        C0285b(Application application, C0287d dVar) {
            this.f1434f = application;
            this.f1435g = dVar;
        }

        public void run() {
            this.f1434f.unregisterActivityLifecycleCallbacks(this.f1435g);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    static class C0286c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f1436f;

        /* renamed from: g */
        final /* synthetic */ Object f1437g;

        C0286c(Object obj, Object obj2) {
            this.f1436f = obj;
            this.f1437g = obj2;
        }

        public void run() {
            try {
                if (C0283c.f1428d != null) {
                    C0283c.f1428d.invoke(this.f1436f, new Object[]{this.f1437g, false, "AppCompat recreation"});
                    return;
                }
                C0283c.f1429e.invoke(this.f1436f, new Object[]{this.f1437g, false});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    private static final class C0287d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f1438a;

        /* renamed from: b */
        private Activity f1439b;

        /* renamed from: c */
        private boolean f1440c = false;

        /* renamed from: d */
        private boolean f1441d = false;

        /* renamed from: e */
        private boolean f1442e = false;

        C0287d(Activity activity) {
            this.f1439b = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1439b == activity) {
                this.f1439b = null;
                this.f1441d = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1441d && !this.f1442e && !this.f1440c && C0283c.m1436a(this.f1438a, activity)) {
                this.f1442e = true;
                this.f1438a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1439b == activity) {
                this.f1440c = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    private static Class<?> m1433a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m1434a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m1435a(Activity activity) {
        Object obj;
        Application application;
        C0287d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m1441d() && f1430f == null) {
            return false;
        } else {
            if (f1429e == null && f1428d == null) {
                return false;
            }
            try {
                Object obj2 = f1427c.get(activity);
                if (obj2 == null || (obj = f1426b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0287d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f1431g.post(new C0284a(dVar, obj2));
                if (m1441d()) {
                    f1430f.invoke(obj, new Object[]{obj2, null, null, 0, false, null, null, false, false});
                } else {
                    activity.recreate();
                }
                f1431g.post(new C0285b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    protected static boolean m1436a(Object obj, Activity activity) {
        try {
            Object obj2 = f1427c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f1431g.postAtFrontOfQueue(new C0286c(f1426b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: b */
    private static Field m1437b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m1438b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m1439c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1440c(Class<?> cls) {
        if (m1441d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m1441d() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
