package com.joaomgcd.taskerpluginlibrary.output;

import kotlin.p205x.p207d.C3370k;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.c */
public final class C2768c extends C2766a {

    /* renamed from: f */
    private final String f7350f;

    /* renamed from: g */
    private final String f7351g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2768c(android.content.Context r2, com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable r3, java.lang.reflect.Method r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.p205x.p207d.C3370k.m12227b(r2, r0)
            java.lang.String r0 = "taskerVariable"
            kotlin.p205x.p207d.C3370k.m12227b(r3, r0)
            java.lang.String r0 = "method"
            kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r0 = "method.returnType"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r0)
            boolean r4 = r4.isArray()
            if (r4 != 0) goto L_0x0025
            if (r5 != 0) goto L_0x0025
            if (r6 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r4 = 0
            goto L_0x0026
        L_0x0025:
            r4 = 1
        L_0x0026:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joaomgcd.taskerpluginlibrary.output.C2768c.<init>(android.content.Context, com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable, java.lang.reflect.Method, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2768c(android.content.Context r9, com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.p205x.p207d.C3370k.m12227b(r9, r0)
            java.lang.String r0 = "taskerVariable"
            kotlin.p205x.p207d.C3370k.m12227b(r10, r0)
            java.lang.String r2 = r10.name()
            int r0 = r10.labelResId()
            java.lang.String r3 = r9.getString(r0)
            java.lang.String r0 = "context.getString(taskerVariable.labelResId)"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r3, (java.lang.String) r0)
            int r0 = r10.htmlLabelResId()
            java.lang.String r4 = r9.getString(r0)
            java.lang.String r9 = "context.getString(taskerVariable.htmlLabelResId)"
            kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r4, (java.lang.String) r9)
            int r6 = r10.minApi()
            int r7 = r10.maxApi()
            r1 = r8
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joaomgcd.taskerpluginlibrary.output.C2768c.<init>(android.content.Context, com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2768c(String str, String str2, String str3, boolean z, int i, int i2) {
        super(str, z, i, i2, false, 16, (C3366g) null);
        C3370k.m12227b(str, "nameNoSuffix");
        C3370k.m12227b(str2, "label");
        C3370k.m12227b(str3, "htmlLabel");
        this.f7350f = str2;
        this.f7351g = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2768c(String str, String str2, String str3, boolean z, int i, int i2, int i3, C3366g gVar) {
        this(str, str2, str3, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? Integer.MAX_VALUE : i2);
    }

    public String toString() {
        return '%' + mo8857d() + 10 + this.f7350f + 10 + this.f7351g;
    }
}
