package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: kotlinx.coroutines.j0 */
public final class C3498j0 {

    /* renamed from: a */
    private static final boolean f8210a = C3408c0.class.desiredAssertionStatus();

    /* renamed from: b */
    private static final boolean f8211b;

    /* renamed from: c */
    private static final boolean f8212c;

    /* renamed from: d */
    private static final AtomicLong f8213d = new AtomicLong(0);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0.equals("auto") != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r0.equals("on") != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r0.equals(p190io.objectbox.android.BuildConfig.FLAVOR) != false) goto L_0x004d;
     */
    static {
        /*
            java.lang.Class<kotlinx.coroutines.c0> r0 = kotlinx.coroutines.C3408c0.class
            boolean r0 = r0.desiredAssertionStatus()
            f8210a = r0
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = kotlinx.coroutines.internal.C3488v.m12584a(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0013
            goto L_0x002f
        L_0x0013:
            int r3 = r0.hashCode()
            if (r3 == 0) goto L_0x0045
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L_0x003c
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L_0x0032
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L_0x0069
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0069
        L_0x002f:
            boolean r0 = f8210a
            goto L_0x004e
        L_0x0032:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0069
            r0 = 0
            goto L_0x004e
        L_0x003c:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0069
            goto L_0x004d
        L_0x0045:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0069
        L_0x004d:
            r0 = 1
        L_0x004e:
            f8211b = r0
            boolean r0 = f8211b
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            boolean r0 = kotlinx.coroutines.internal.C3488v.m12585a(r0, r2)
            if (r0 == 0) goto L_0x005d
            r1 = 1
        L_0x005d:
            f8212c = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            f8213d = r0
            return
        L_0x0069:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C3498j0.<clinit>():void");
    }

    /* renamed from: a */
    public static final boolean m12618a() {
        return f8210a;
    }

    /* renamed from: b */
    public static final AtomicLong m12619b() {
        return f8213d;
    }

    /* renamed from: c */
    public static final boolean m12620c() {
        return f8211b;
    }

    /* renamed from: d */
    public static final boolean m12621d() {
        return f8212c;
    }
}
