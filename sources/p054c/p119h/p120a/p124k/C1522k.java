package p054c.p119h.p120a.p124k;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import com.joaomgcd.taskerpluginlibrary.output.C2766a;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p054c.p119h.p120a.p122i.C1472a;
import p054c.p119h.p120a.p123j.C1483a;

/* renamed from: c.h.a.k.k */
public abstract class C1522k<TInput, TOutput> {
    public static final C1523a Companion = new C1523a((C3366g) null);
    public static final String NOTIFICATION_CHANNEL_ID = "taskerpluginforegroundd";

    /* renamed from: c.h.a.k.k$a */
    public static final class C1523a {
        private C1523a() {
        }

        public /* synthetic */ C1523a(C3366g gVar) {
            this();
        }

        @TargetApi(26)
        /* renamed from: a */
        public static /* synthetic */ void m6805a(C1523a aVar, Service service, C1524b bVar, int i, Object obj) {
            if ((i & 2) != 0) {
                bVar = new C1524b(0, 0, 0, 0, 0, 31, (C3366g) null);
            }
            aVar.mo6018a(service, bVar);
        }

        @TargetApi(26)
        /* renamed from: a */
        public final void mo6018a(Service service, C1524b bVar) {
            C3370k.m12227b(service, "intentService");
            C3370k.m12227b(bVar, "notificationProperties");
            if (C1472a.m6712b((Context) service)) {
                mo6019a(service, C1522k.NOTIFICATION_CHANNEL_ID, bVar);
                Notification a = bVar.mo6021a(service);
                C3370k.m12223a((Object) a, "notificationProperties.g…tification(intentService)");
                service.startForeground(hashCode(), a);
            }
        }

        @TargetApi(26)
        /* renamed from: a */
        public final void mo6019a(Service service, String str, C1524b bVar) {
            C3370k.m12227b(service, "receiver$0");
            C3370k.m12227b(str, "channelId");
            C3370k.m12227b(bVar, "notificationProperties");
            NotificationChannel notificationChannel = new NotificationChannel(str, service.getString(bVar.mo6022b()), 0);
            notificationChannel.setDescription(service.getString(bVar.mo6020a()));
            ((NotificationManager) service.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: c.h.a.k.k$b */
    public static final class C1524b {

        /* renamed from: a */
        private final int f4560a;

        /* renamed from: b */
        private final int f4561b;

        /* renamed from: c */
        private final int f4562c;

        /* renamed from: d */
        private final int f4563d;

        /* renamed from: e */
        private final int f4564e;

        public C1524b(int i, int i2, int i3, int i4, int i5) {
            this.f4560a = i;
            this.f4561b = i2;
            this.f4562c = i3;
            this.f4563d = i4;
            this.f4564e = i5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C1524b(int r4, int r5, int r6, int r7, int r8, int r9, kotlin.p205x.p207d.C3366g r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                int r4 = p054c.p119h.p120a.C1454c.tasker_plugin_service
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000c
                int r5 = p054c.p119h.p120a.C1454c.tasker_plugin_service_description
            L_0x000c:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                int r6 = p054c.p119h.p120a.C1454c.app_name
            L_0x0013:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L_0x001a
                int r7 = p054c.p119h.p120a.C1454c.running_tasker_plugin
            L_0x001a:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L_0x0021
                int r8 = p054c.p119h.p120a.C1453b.ic_launcher
            L_0x0021:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p119h.p120a.p124k.C1522k.C1524b.<init>(int, int, int, int, int, int, kotlin.x.d.g):void");
        }

        /* renamed from: a */
        public final int mo6020a() {
            return this.f4561b;
        }

        @TargetApi(26)
        /* renamed from: a */
        public final Notification mo6021a(Context context) {
            C3370k.m12227b(context, "context");
            return new Notification.Builder(context, C1522k.NOTIFICATION_CHANNEL_ID).setContentTitle(context.getString(this.f4562c)).setContentText(context.getString(this.f4563d)).setSmallIcon(Icon.createWithResource(context, this.f4564e)).build();
        }

        /* renamed from: b */
        public final int mo6022b() {
            return this.f4560a;
        }
    }

    public void addOutputVariableRenames(Context context, C1483a<TInput> aVar, C1514d dVar) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(aVar, "input");
        C3370k.m12227b(dVar, "renames");
    }

    public final Class<TInput> getInputClass(Intent intent) {
        C3370k.m12227b(intent, "taskerIntent");
        Class<?> cls = Class.forName(C1472a.m6704a(C1472a.m6701a(intent)));
        if (cls != null) {
            return cls;
        }
        throw new C3269p("null cannot be cast to non-null type java.lang.Class<TInput>");
    }

    /* access modifiers changed from: protected */
    public C1524b getNotificationProperties() {
        return new C1524b(0, 0, 0, 0, 0, 31, (C3366g) null);
    }

    public final C1514d getRenames$taskerpluginlibrary_release(Context context, C1483a<TInput> aVar) {
        C3370k.m12227b(context, "context");
        if (aVar == null) {
            return null;
        }
        C1514d dVar = new C1514d();
        addOutputVariableRenames(context, aVar, dVar);
        return dVar;
    }

    public boolean shouldAddOutput(Context context, C1483a<TInput> aVar, C2766a aVar2) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(aVar2, "ouput");
        return true;
    }

    /* access modifiers changed from: protected */
    @TargetApi(26)
    public final void startForegroundIfNeeded(IntentService intentService) {
        C3370k.m12227b(intentService, "receiver$0");
        Companion.mo6018a(intentService, getNotificationProperties());
    }
}
