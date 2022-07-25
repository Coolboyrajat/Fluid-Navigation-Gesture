package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0312b;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.k */
class C0060k {

    /* renamed from: d */
    private static C0060k f260d;

    /* renamed from: a */
    private final Context f261a;

    /* renamed from: b */
    private final LocationManager f262b;

    /* renamed from: c */
    private final C0061a f263c = new C0061a();

    /* renamed from: androidx.appcompat.app.k$a */
    private static class C0061a {

        /* renamed from: a */
        boolean f264a;

        /* renamed from: b */
        long f265b;

        /* renamed from: c */
        long f266c;

        /* renamed from: d */
        long f267d;

        /* renamed from: e */
        long f268e;

        /* renamed from: f */
        long f269f;

        C0061a() {
        }
    }

    C0060k(Context context, LocationManager locationManager) {
        this.f261a = context;
        this.f262b = locationManager;
    }

    /* renamed from: a */
    private Location m271a(String str) {
        try {
            if (this.f262b.isProviderEnabled(str)) {
                return this.f262b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0060k m272a(Context context) {
        if (f260d == null) {
            Context applicationContext = context.getApplicationContext();
            f260d = new C0060k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f260d;
    }

    /* renamed from: a */
    private void m273a(Location location) {
        long j;
        C0061a aVar = this.f263c;
        long currentTimeMillis = System.currentTimeMillis();
        C0059j a = C0059j.m269a();
        C0059j jVar = a;
        jVar.mo255a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f257a;
        jVar.mo255a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f259c == 1;
        long j3 = a.f258b;
        long j4 = j2;
        long j5 = a.f257a;
        long j6 = j3;
        boolean z2 = z;
        a.mo255a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f258b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f264a = z2;
        aVar.f265b = j4;
        aVar.f266c = j6;
        aVar.f267d = j5;
        aVar.f268e = j7;
        aVar.f269f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m274b() {
        Location location = null;
        Location a = C0312b.m1535a(this.f261a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m271a("network") : null;
        if (C0312b.m1535a(this.f261a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m271a("gps");
        }
        return (location == null || a == null) ? location != null ? location : a : location.getTime() > a.getTime() ? location : a;
    }

    /* renamed from: c */
    private boolean m275c() {
        return this.f263c.f269f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo256a() {
        C0061a aVar = this.f263c;
        if (m275c()) {
            return aVar.f264a;
        }
        Location b = m274b();
        if (b != null) {
            m273a(b);
            return aVar.f264a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
