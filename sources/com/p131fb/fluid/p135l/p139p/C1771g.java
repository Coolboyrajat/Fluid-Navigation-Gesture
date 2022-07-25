package com.p131fb.fluid.p135l.p139p;

import java.util.Calendar;
import java.util.Date;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.g */
public final class C1771g {
    /* renamed from: a */
    public static final Date m7471a(Date date, int i) {
        C3370k.m12227b(date, "$this$minusMinutes");
        Calendar instance = Calendar.getInstance();
        instance.add(12, -i);
        C3370k.m12223a((Object) instance, "Calendar.getInstance().a…ndar.MINUTE, - minutes) }");
        Date time = instance.getTime();
        C3370k.m12223a((Object) time, "Calendar.getInstance().a…MINUTE, - minutes) }.time");
        return time;
    }

    /* renamed from: b */
    public static final Date m7472b(Date date, int i) {
        C3370k.m12227b(date, "$this$plusDays");
        Calendar instance = Calendar.getInstance();
        instance.add(5, i);
        C3370k.m12223a((Object) instance, "Calendar.getInstance().a…dd(Calendar.DATE, days) }");
        Date time = instance.getTime();
        C3370k.m12223a((Object) time, "Calendar.getInstance().a…lendar.DATE, days) }.time");
        return time;
    }
}
