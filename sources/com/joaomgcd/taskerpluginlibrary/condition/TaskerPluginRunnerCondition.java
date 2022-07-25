package com.joaomgcd.taskerpluginlibrary.condition;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.joaomgcd.taskerpluginlibrary.output.p154e.C2770a;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import net.dinglisch.android.tasker.C3559a;
import p054c.p119h.p120a.C1452a;
import p054c.p119h.p120a.p122i.C1472a;
import p054c.p119h.p120a.p123j.C1483a;
import p054c.p119h.p120a.p123j.C1499f;
import p054c.p119h.p120a.p124k.C1517f;
import p054c.p119h.p120a.p124k.C1518g;
import p054c.p119h.p120a.p124k.C1519h;
import p054c.p119h.p120a.p124k.C1522k;

public abstract class TaskerPluginRunnerCondition<TInput, TOutput, TUpdate> extends C1522k<TInput, TOutput> {
    public static final C2762a Companion = new C2762a((C3366g) null);

    /* renamed from: com.joaomgcd.taskerpluginlibrary.condition.TaskerPluginRunnerCondition$a */
    public static final class C2762a {
        private C2762a() {
        }

        public /* synthetic */ C2762a(C3366g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.joaomgcd.taskerpluginlibrary.condition.C2765b mo8842a(android.content.Context r4, android.content.Intent r5) {
            /*
                r3 = this;
                c.h.a.k.k$a r0 = p054c.p119h.p120a.p124k.C1522k.Companion
                r0 = 0
                if (r5 == 0) goto L_0x0032
                android.os.Bundle r1 = p054c.p119h.p120a.p122i.C1472a.m6701a((android.content.Intent) r5)
                if (r1 == 0) goto L_0x0032
                java.lang.String r1 = p054c.p119h.p120a.p122i.C1472a.m6710b((android.os.Bundle) r1)
                if (r1 == 0) goto L_0x0032
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0016 }
                goto L_0x001b
            L_0x0016:
                r1 = move-exception
                r1.printStackTrace()
                r1 = r0
            L_0x001b:
                if (r1 == 0) goto L_0x0032
                java.lang.Object r1 = r1.newInstance()     // Catch:{ all -> 0x002e }
                if (r1 == 0) goto L_0x0026
                com.joaomgcd.taskerpluginlibrary.condition.TaskerPluginRunnerCondition r1 = (com.joaomgcd.taskerpluginlibrary.condition.TaskerPluginRunnerCondition) r1     // Catch:{ all -> 0x002e }
                goto L_0x0033
            L_0x0026:
                kotlin.p r1 = new kotlin.p     // Catch:{ all -> 0x002e }
                java.lang.String r2 = "null cannot be cast to non-null type com.joaomgcd.taskerpluginlibrary.condition.TaskerPluginRunnerCondition<out kotlin.Any, out kotlin.Any, out kotlin.Any>"
                r1.<init>(r2)     // Catch:{ all -> 0x002e }
                throw r1     // Catch:{ all -> 0x002e }
            L_0x002e:
                r1 = move-exception
                r1.printStackTrace()
            L_0x0032:
                r1 = r0
            L_0x0033:
                if (r1 == 0) goto L_0x0039
                com.joaomgcd.taskerpluginlibrary.condition.b r0 = r1.getResultFromIntent$taskerpluginlibrary_release(r4, r5)
            L_0x0039:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.joaomgcd.taskerpluginlibrary.condition.TaskerPluginRunnerCondition.C2762a.mo8842a(android.content.Context, android.content.Intent):com.joaomgcd.taskerpluginlibrary.condition.b");
        }
    }

    /* renamed from: com.joaomgcd.taskerpluginlibrary.condition.TaskerPluginRunnerCondition$b */
    static final class C2763b extends C3371l implements C3350b<C2770a, Boolean> {

        /* renamed from: g */
        final /* synthetic */ TaskerPluginRunnerCondition f7339g;

        /* renamed from: h */
        final /* synthetic */ C1517f f7340h;

        /* renamed from: i */
        final /* synthetic */ C1483a f7341i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2763b(TaskerPluginRunnerCondition taskerPluginRunnerCondition, C1517f fVar, C1483a aVar) {
            super(1);
            this.f7339g = taskerPluginRunnerCondition;
            this.f7340h = fVar;
            this.f7341i = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo8843a((C2770a) obj));
        }

        /* renamed from: a */
        public final boolean mo8843a(C2770a aVar) {
            C3370k.m12227b(aVar, "output");
            return this.f7339g.shouldAddOutput(((C1518g) this.f7340h).mo6011b(), this.f7341i, aVar);
        }
    }

    private final C2765b getConditionResult(C1517f<TOutput> fVar, boolean z, C1483a<TInput> aVar) {
        Bundle bundle;
        if (fVar instanceof C1518g) {
            C1518g gVar = (C1518g) fVar;
            bundle = gVar.mo6010a(getRenames$taskerpluginlibrary_release(gVar.mo6011b(), aVar), new C2763b(this, fVar, aVar));
        } else {
            bundle = null;
        }
        return new C2765b(fVar.mo6009a(), bundle, z);
    }

    static /* synthetic */ C2765b getConditionResult$default(TaskerPluginRunnerCondition taskerPluginRunnerCondition, C1517f fVar, boolean z, C1483a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                aVar = null;
            }
            return taskerPluginRunnerCondition.getConditionResult(fVar, z, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConditionResult");
    }

    private final <TUpdate> TUpdate getUpdate(Context context, Intent intent) {
        String string;
        Bundle a = C3559a.C3563d.m12853a(intent);
        if (a == null || (string = a.getString("net.dinglisch.android.tasker.extras.CONDITION_UPDATE_CLASS")) == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string);
            TUpdate newInstance = cls != null ? cls.newInstance() : null;
            if (newInstance == null) {
                throw new C3269p("null cannot be cast to non-null type TUpdate");
            } else if (newInstance == Unit.INSTANCE) {
                return null;
            } else {
                C1499f.f4528f.mo5978a(context, newInstance, a);
                return newInstance;
            }
        } catch (InstantiationException unused) {
            throw new C1452a(string);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final C2765b getResultFromIntent$taskerpluginlibrary_release(Context context, Intent intent) {
        boolean z;
        boolean z2 = false;
        if (context == null || intent == null) {
            return getConditionResult$default(this, new C1519h(), false, (C1483a) null, 2, (Object) null);
        }
        try {
            if (!isEvent() || C3559a.C3563d.m12855b(intent) != -1) {
                if (context instanceof IntentService) {
                    startForegroundIfNeeded((IntentService) context);
                    z2 = true;
                }
                try {
                    C1483a a = C1472a.m6703a(intent, context, getInputClass(intent), (Object) null, 4, (Object) null);
                    return getConditionResult(getSatisfiedCondition(context, a, getUpdate(context, intent)), z2, a);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    th.printStackTrace();
                    return getConditionResult$default(this, new C1519h(), z, (C1483a) null, 2, (Object) null);
                }
            } else {
                return getConditionResult$default(this, new C1519h(), false, (C1483a) null, 2, (Object) null);
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            th.printStackTrace();
            return getConditionResult$default(this, new C1519h(), z, (C1483a) null, 2, (Object) null);
        }
    }

    public abstract C1517f<TOutput> getSatisfiedCondition(Context context, C1483a<TInput> aVar, TUpdate tupdate);

    /* access modifiers changed from: protected */
    public abstract boolean isEvent();
}
