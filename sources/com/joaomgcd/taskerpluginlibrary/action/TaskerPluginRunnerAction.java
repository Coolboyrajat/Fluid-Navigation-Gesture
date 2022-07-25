package com.joaomgcd.taskerpluginlibrary.action;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.joaomgcd.taskerpluginlibrary.output.p154e.C2770a;
import kotlin.C3269p;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p119h.p120a.p122i.C1472a;
import p054c.p119h.p120a.p123j.C1483a;
import p054c.p119h.p120a.p124k.C1506a;
import p054c.p119h.p120a.p124k.C1507b;
import p054c.p119h.p120a.p124k.C1514d;
import p054c.p119h.p120a.p124k.C1516e;
import p054c.p119h.p120a.p124k.C1520i;
import p054c.p119h.p120a.p124k.C1522k;

public abstract class TaskerPluginRunnerAction<TInput, TOutput> extends C1522k<TInput, TOutput> {
    public static final C2757a Companion = new C2757a((C3366g) null);

    /* renamed from: com.joaomgcd.taskerpluginlibrary.action.TaskerPluginRunnerAction$a */
    public static final class C2757a {
        private C2757a() {
        }

        public /* synthetic */ C2757a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2758b mo8833a(C1507b bVar, Intent intent) {
            String b;
            Class<?> cls;
            if (bVar == null) {
                return new C2758b(false);
            }
            if (intent == null) {
                return new C2758b(false);
            }
            C1522k.C1523a aVar = C1522k.Companion;
            Bundle a = C1472a.m6701a(intent);
            TaskerPluginRunnerAction taskerPluginRunnerAction = null;
            if (!(a == null || (b = C1472a.m6710b(a)) == null)) {
                try {
                    cls = Class.forName(b);
                } catch (Throwable th) {
                    th.printStackTrace();
                    cls = null;
                }
                if (cls != null) {
                    try {
                        Object newInstance = cls.newInstance();
                        if (newInstance != null) {
                            taskerPluginRunnerAction = (TaskerPluginRunnerAction) newInstance;
                        } else {
                            throw new C3269p("null cannot be cast to non-null type com.joaomgcd.taskerpluginlibrary.action.TaskerPluginRunnerAction<out kotlin.Any, out kotlin.Any>");
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
            if (taskerPluginRunnerAction != null) {
                return taskerPluginRunnerAction.runWithIntent$taskerpluginlibrary_release(bVar, intent);
            }
            new C1520i(0, "Couldn't get action runner from intent").mo6008a(new C1506a(bVar, intent, (C1514d) null, (C3350b) null, 12, (C3366g) null));
            return new C2758b(false);
        }
    }

    /* renamed from: com.joaomgcd.taskerpluginlibrary.action.TaskerPluginRunnerAction$b */
    public static final class C2758b {

        /* renamed from: a */
        private final boolean f7333a;

        public C2758b(boolean z) {
            this.f7333a = z;
        }

        /* renamed from: a */
        public final boolean mo8834a() {
            return this.f7333a;
        }
    }

    /* renamed from: com.joaomgcd.taskerpluginlibrary.action.TaskerPluginRunnerAction$c */
    static final class C2759c extends C3371l implements C3350b<C2770a, Boolean> {

        /* renamed from: g */
        final /* synthetic */ TaskerPluginRunnerAction f7334g;

        /* renamed from: h */
        final /* synthetic */ Context f7335h;

        /* renamed from: i */
        final /* synthetic */ C1483a f7336i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2759c(TaskerPluginRunnerAction taskerPluginRunnerAction, Context context, C1483a aVar) {
            super(1);
            this.f7334g = taskerPluginRunnerAction;
            this.f7335h = context;
            this.f7336i = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo8835a((C2770a) obj));
        }

        /* renamed from: a */
        public final boolean mo8835a(C2770a aVar) {
            C3370k.m12227b(aVar, "output");
            return this.f7334g.shouldAddOutput(this.f7335h, this.f7336i, aVar);
        }
    }

    public static /* synthetic */ C1506a getArgsSignalFinish$default(TaskerPluginRunnerAction taskerPluginRunnerAction, Context context, Intent intent, C1483a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                aVar = null;
            }
            return taskerPluginRunnerAction.getArgsSignalFinish(context, intent, aVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getArgsSignalFinish");
    }

    public final C1506a getArgsSignalFinish(Context context, Intent intent, C1483a<TInput> aVar) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(intent, "taskerIntent");
        return new C1506a(context, intent, getRenames$taskerpluginlibrary_release(context, aVar), new C2759c(this, context, aVar));
    }

    public abstract C1516e<TOutput> run(Context context, C1483a<TInput> aVar);

    public final C2758b runWithIntent$taskerpluginlibrary_release(C1507b bVar, Intent intent) {
        if (bVar == null) {
            return new C2758b(false);
        }
        if (intent == null) {
            return new C2758b(false);
        }
        bVar.mo5986b();
        try {
            C1483a a = C1472a.m6703a(intent, bVar, getInputClass(intent), (Object) null, 4, (Object) null);
            run(bVar, a).mo6008a(getArgsSignalFinish(bVar, intent, a));
        } catch (Throwable th) {
            new C1520i(th).mo6008a(getArgsSignalFinish$default(this, bVar, intent, (C1483a) null, 4, (Object) null));
        }
        return new C2758b(true);
    }
}
