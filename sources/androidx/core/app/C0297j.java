package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0292h;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.core.app.j */
class C0297j {

    /* renamed from: a */
    private static final Object f1502a = new Object();

    /* renamed from: b */
    private static Field f1503b;

    /* renamed from: c */
    private static boolean f1504c;

    /* renamed from: a */
    public static Bundle m1476a(Notification.Builder builder, C0292h.C0293a aVar) {
        builder.addAction(aVar.mo1910e(), aVar.mo1914i(), aVar.mo1906a());
        Bundle bundle = new Bundle(aVar.mo1909d());
        if (aVar.mo1911f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1481a(aVar.mo1911f()));
        }
        if (aVar.mo1908c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1481a(aVar.mo1908c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1907b());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m1477a(Notification notification) {
        String str;
        String str2;
        synchronized (f1502a) {
            if (f1504c) {
                return null;
            }
            try {
                if (f1503b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1504c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1503b = declaredField;
                }
                Bundle bundle = (Bundle) f1503b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1503b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1504c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1504c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    static Bundle m1478a(C0292h.C0293a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("icon", aVar.mo1910e());
        bundle.putCharSequence("title", aVar.mo1914i());
        bundle.putParcelable("actionIntent", aVar.mo1906a());
        Bundle bundle2 = aVar.mo1909d() != null ? new Bundle(aVar.mo1909d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.mo1907b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m1481a(aVar.mo1911f()));
        bundle.putBoolean("showsUserInterface", aVar.mo1913h());
        bundle.putInt("semanticAction", aVar.mo1912g());
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m1479a(C0305l lVar) {
        new Bundle();
        lVar.mo1938a();
        throw null;
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m1480a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static Bundle[] m1481a(C0305l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lVarArr.length];
        if (lVarArr.length <= 0) {
            return bundleArr;
        }
        m1479a(lVarArr[0]);
        throw null;
    }
}
