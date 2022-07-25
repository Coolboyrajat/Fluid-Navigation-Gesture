package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: androidx.core.app.h */
public class C0292h {

    /* renamed from: androidx.core.app.h$a */
    public static class C0293a {

        /* renamed from: a */
        final Bundle f1444a;

        /* renamed from: b */
        private final C0305l[] f1445b;

        /* renamed from: c */
        private final C0305l[] f1446c;

        /* renamed from: d */
        private boolean f1447d;

        /* renamed from: e */
        boolean f1448e;

        /* renamed from: f */
        private final int f1449f;

        /* renamed from: g */
        public int f1450g;

        /* renamed from: h */
        public CharSequence f1451h;

        /* renamed from: i */
        public PendingIntent f1452i;

        /* renamed from: a */
        public PendingIntent mo1906a() {
            return this.f1452i;
        }

        /* renamed from: b */
        public boolean mo1907b() {
            return this.f1447d;
        }

        /* renamed from: c */
        public C0305l[] mo1908c() {
            return this.f1446c;
        }

        /* renamed from: d */
        public Bundle mo1909d() {
            return this.f1444a;
        }

        /* renamed from: e */
        public int mo1910e() {
            return this.f1450g;
        }

        /* renamed from: f */
        public C0305l[] mo1911f() {
            return this.f1445b;
        }

        /* renamed from: g */
        public int mo1912g() {
            return this.f1449f;
        }

        /* renamed from: h */
        public boolean mo1913h() {
            return this.f1448e;
        }

        /* renamed from: i */
        public CharSequence mo1914i() {
            return this.f1451h;
        }
    }

    /* renamed from: androidx.core.app.h$b */
    public static class C0294b {

        /* renamed from: A */
        String f1453A;

        /* renamed from: B */
        Bundle f1454B;

        /* renamed from: C */
        int f1455C = 0;

        /* renamed from: D */
        int f1456D = 0;

        /* renamed from: E */
        Notification f1457E;

        /* renamed from: F */
        RemoteViews f1458F;

        /* renamed from: G */
        RemoteViews f1459G;

        /* renamed from: H */
        RemoteViews f1460H;

        /* renamed from: I */
        String f1461I;

        /* renamed from: J */
        int f1462J = 0;

        /* renamed from: K */
        String f1463K;

        /* renamed from: L */
        long f1464L;

        /* renamed from: M */
        int f1465M = 0;

        /* renamed from: N */
        Notification f1466N = new Notification();
        @Deprecated

        /* renamed from: O */
        public ArrayList<String> f1467O;

        /* renamed from: a */
        public Context f1468a;

        /* renamed from: b */
        public ArrayList<C0293a> f1469b = new ArrayList<>();

        /* renamed from: c */
        ArrayList<C0293a> f1470c = new ArrayList<>();

        /* renamed from: d */
        CharSequence f1471d;

        /* renamed from: e */
        CharSequence f1472e;

        /* renamed from: f */
        PendingIntent f1473f;

        /* renamed from: g */
        PendingIntent f1474g;

        /* renamed from: h */
        RemoteViews f1475h;

        /* renamed from: i */
        Bitmap f1476i;

        /* renamed from: j */
        CharSequence f1477j;

        /* renamed from: k */
        int f1478k;

        /* renamed from: l */
        int f1479l;

        /* renamed from: m */
        boolean f1480m = true;

        /* renamed from: n */
        boolean f1481n;

        /* renamed from: o */
        C0295c f1482o;

        /* renamed from: p */
        CharSequence f1483p;

        /* renamed from: q */
        CharSequence[] f1484q;

        /* renamed from: r */
        int f1485r;

        /* renamed from: s */
        int f1486s;

        /* renamed from: t */
        boolean f1487t;

        /* renamed from: u */
        String f1488u;

        /* renamed from: v */
        boolean f1489v;

        /* renamed from: w */
        String f1490w;

        /* renamed from: x */
        boolean f1491x = false;

        /* renamed from: y */
        boolean f1492y;

        /* renamed from: z */
        boolean f1493z;

        public C0294b(Context context, String str) {
            this.f1468a = context;
            this.f1461I = str;
            this.f1466N.when = System.currentTimeMillis();
            this.f1466N.audioStreamType = -1;
            this.f1479l = 0;
            this.f1467O = new ArrayList<>();
        }

        /* renamed from: b */
        protected static CharSequence m1461b(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: a */
        public Notification mo1915a() {
            return new C0296i(this).mo1925a();
        }

        /* renamed from: a */
        public C0294b mo1916a(int i) {
            this.f1479l = i;
            return this;
        }

        /* renamed from: a */
        public C0294b mo1917a(CharSequence charSequence) {
            this.f1471d = m1461b(charSequence);
            return this;
        }

        /* renamed from: b */
        public Bundle mo1918b() {
            if (this.f1454B == null) {
                this.f1454B = new Bundle();
            }
            return this.f1454B;
        }

        /* renamed from: b */
        public C0294b mo1919b(int i) {
            this.f1466N.icon = i;
            return this;
        }
    }

    /* renamed from: androidx.core.app.h$c */
    public static abstract class C0295c {
        /* renamed from: a */
        public abstract void mo1920a(Bundle bundle);

        /* renamed from: a */
        public abstract void mo1921a(C0291g gVar);

        /* renamed from: b */
        public abstract RemoteViews mo1922b(C0291g gVar);

        /* renamed from: c */
        public abstract RemoteViews mo1923c(C0291g gVar);

        /* renamed from: d */
        public abstract RemoteViews mo1924d(C0291g gVar);
    }

    /* renamed from: a */
    public static Bundle m1451a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0297j.m1477a(notification);
        }
        return null;
    }
}
