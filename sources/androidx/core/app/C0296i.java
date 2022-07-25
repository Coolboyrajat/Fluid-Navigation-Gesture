package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0292h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: androidx.core.app.i */
class C0296i implements C0291g {

    /* renamed from: a */
    private final Notification.Builder f1494a;

    /* renamed from: b */
    private final C0292h.C0294b f1495b;

    /* renamed from: c */
    private RemoteViews f1496c;

    /* renamed from: d */
    private RemoteViews f1497d;

    /* renamed from: e */
    private final List<Bundle> f1498e = new ArrayList();

    /* renamed from: f */
    private final Bundle f1499f = new Bundle();

    /* renamed from: g */
    private int f1500g;

    /* renamed from: h */
    private RemoteViews f1501h;

    C0296i(C0292h.C0294b bVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.f1495b = bVar;
        this.f1494a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(bVar.f1468a, bVar.f1461I) : new Notification.Builder(bVar.f1468a);
        Notification notification = bVar.f1466N;
        this.f1494a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, bVar.f1475h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(bVar.f1471d).setContentText(bVar.f1472e).setContentInfo(bVar.f1477j).setContentIntent(bVar.f1473f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(bVar.f1474g, (notification.flags & PropertyFlags.ID_SELF_ASSIGNABLE) != 0).setLargeIcon(bVar.f1476i).setNumber(bVar.f1478k).setProgress(bVar.f1485r, bVar.f1486s, bVar.f1487t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1494a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1494a.setSubText(bVar.f1483p).setUsesChronometer(bVar.f1481n).setPriority(bVar.f1479l);
            Iterator<C0292h.C0293a> it = bVar.f1469b.iterator();
            while (it.hasNext()) {
                m1473a(it.next());
            }
            Bundle bundle2 = bVar.f1454B;
            if (bundle2 != null) {
                this.f1499f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (bVar.f1491x) {
                    this.f1499f.putBoolean("android.support.localOnly", true);
                }
                String str2 = bVar.f1488u;
                if (str2 != null) {
                    this.f1499f.putString("android.support.groupKey", str2);
                    if (bVar.f1489v) {
                        bundle = this.f1499f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1499f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = bVar.f1490w;
                if (str3 != null) {
                    this.f1499f.putString("android.support.sortKey", str3);
                }
            }
            this.f1496c = bVar.f1458F;
            this.f1497d = bVar.f1459G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1494a.setShowWhen(bVar.f1480m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = bVar.f1467O) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f1499f;
                ArrayList<String> arrayList2 = bVar.f1467O;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1494a.setLocalOnly(bVar.f1491x).setGroup(bVar.f1488u).setGroupSummary(bVar.f1489v).setSortKey(bVar.f1490w);
            this.f1500g = bVar.f1465M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1494a.setCategory(bVar.f1453A).setColor(bVar.f1455C).setVisibility(bVar.f1456D).setPublicVersion(bVar.f1457E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = bVar.f1467O.iterator();
            while (it2.hasNext()) {
                this.f1494a.addPerson(it2.next());
            }
            this.f1501h = bVar.f1460H;
            if (bVar.f1470c.size() > 0) {
                Bundle bundle4 = bVar.mo1918b().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < bVar.f1470c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), C0297j.m1478a(bVar.f1470c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                bVar.mo1918b().putBundle("android.car.EXTENSIONS", bundle4);
                this.f1499f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1494a.setExtras(bVar.f1454B).setRemoteInputHistory(bVar.f1484q);
            RemoteViews remoteViews = bVar.f1458F;
            if (remoteViews != null) {
                this.f1494a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = bVar.f1459G;
            if (remoteViews2 != null) {
                this.f1494a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = bVar.f1460H;
            if (remoteViews3 != null) {
                this.f1494a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1494a.setBadgeIconType(bVar.f1462J).setShortcutId(bVar.f1463K).setTimeoutAfter(bVar.f1464L).setGroupAlertBehavior(bVar.f1465M);
            if (bVar.f1493z) {
                this.f1494a.setColorized(bVar.f1492y);
            }
            if (!TextUtils.isEmpty(bVar.f1461I)) {
                this.f1494a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: a */
    private void m1472a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m1473a(C0292h.C0293a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo1910e(), aVar.mo1914i(), aVar.mo1906a());
            if (aVar.mo1911f() != null) {
                for (RemoteInput addRemoteInput : C0305l.m1504a(aVar.mo1911f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo1909d() != null ? new Bundle(aVar.mo1909d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1907b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo1907b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo1912g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo1912g());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo1913h());
            builder.addExtras(bundle);
            this.f1494a.addAction(builder.build());
        } else if (i >= 16) {
            this.f1498e.add(C0297j.m1476a(this.f1494a, aVar));
        }
    }

    /* renamed from: a */
    public Notification mo1925a() {
        Bundle a;
        RemoteViews d;
        RemoteViews b;
        C0292h.C0295c cVar = this.f1495b.f1482o;
        if (cVar != null) {
            cVar.mo1921a((C0291g) this);
        }
        RemoteViews c = cVar != null ? cVar.mo1923c(this) : null;
        Notification b2 = mo1926b();
        if (!(c == null && (c = this.f1495b.f1458F) == null)) {
            b2.contentView = c;
        }
        if (!(Build.VERSION.SDK_INT < 16 || cVar == null || (b = cVar.mo1922b(this)) == null)) {
            b2.bigContentView = b;
        }
        if (!(Build.VERSION.SDK_INT < 21 || cVar == null || (d = this.f1495b.f1482o.mo1924d(this)) == null)) {
            b2.headsUpContentView = d;
        }
        if (!(Build.VERSION.SDK_INT < 16 || cVar == null || (a = C0292h.m1451a(b2)) == null)) {
            cVar.mo1920a(a);
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Notification mo1926b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1494a.build();
        }
        if (i >= 24) {
            Notification build = this.f1494a.build();
            if (this.f1500g != 0) {
                if (!(build.getGroup() == null || (build.flags & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0 || this.f1500g != 2)) {
                    m1472a(build);
                }
                if (build.getGroup() != null && (build.flags & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0 && this.f1500g == 1) {
                    m1472a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1494a.setExtras(this.f1499f);
            Notification build2 = this.f1494a.build();
            RemoteViews remoteViews = this.f1496c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1497d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1501h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1500g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0 || this.f1500g != 2)) {
                    m1472a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0 && this.f1500g == 1) {
                    m1472a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1494a.setExtras(this.f1499f);
            Notification build3 = this.f1494a.build();
            RemoteViews remoteViews4 = this.f1496c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1497d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1500g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0 || this.f1500g != 2)) {
                    m1472a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & PropertyFlags.INDEX_PARTIAL_SKIP_ZERO) == 0 && this.f1500g == 1) {
                    m1472a(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0297j.m1480a(this.f1498e);
            if (a != null) {
                this.f1499f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f1494a.setExtras(this.f1499f);
            Notification build4 = this.f1494a.build();
            RemoteViews remoteViews6 = this.f1496c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1497d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f1494a.getNotification();
        } else {
            Notification build5 = this.f1494a.build();
            Bundle a2 = C0292h.m1451a(build5);
            Bundle bundle = new Bundle(this.f1499f);
            for (String str : this.f1499f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0297j.m1480a(this.f1498e);
            if (a3 != null) {
                C0292h.m1451a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f1496c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1497d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
