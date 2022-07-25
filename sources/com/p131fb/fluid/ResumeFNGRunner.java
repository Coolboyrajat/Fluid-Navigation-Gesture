package com.p131fb.fluid;

import android.content.Context;
import com.joaomgcd.taskerpluginlibrary.action.TaskerPluginRunnerActionNoOutputOrInput;
import com.joaomgcd.taskerpluginlibrary.output.p154e.C2772b;
import com.p131fb.fluid.utils.preferences.C2527h;
import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;
import p054c.p119h.p120a.p123j.C1483a;
import p054c.p119h.p120a.p124k.C1516e;
import p054c.p119h.p120a.p124k.C1521j;

/* renamed from: com.fb.fluid.ResumeFNGRunner */
public final class ResumeFNGRunner extends TaskerPluginRunnerActionNoOutputOrInput {
    public C1516e<Unit> run(Context context, C1483a<Unit> aVar) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(aVar, "input");
        new C2527h(context).mo7515d(true);
        return new C1521j((Object) null, (C2772b) null, 3, (C3366g) null);
    }
}
