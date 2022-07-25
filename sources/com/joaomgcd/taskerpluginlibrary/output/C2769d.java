package com.joaomgcd.taskerpluginlibrary.output;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.d */
public final class C2769d extends C2767b<C2768c> {
    /* renamed from: a */
    public C2769d m10943a(Context context, TaskerOutputVariable taskerOutputVariable, Method method, Object obj, boolean z, boolean z2, ArrayList<Integer> arrayList) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(taskerOutputVariable, "taskerVariable");
        C3370k.m12227b(method, "method");
        C2769d dVar = new C2769d();
        dVar.add(new C2768c(context, taskerOutputVariable, method, z, z2));
        return dVar;
    }
}
