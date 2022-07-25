package com.p131fb.fluid.p135l;

import android.annotation.SuppressLint;
import android.os.Build;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: com.fb.fluid.l.c */
public final class C1734c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final boolean f5031a = (Build.VERSION.SDK_INT == 29);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f5032b = (Build.VERSION.SDK_INT >= 29);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f5033c = (Build.VERSION.SDK_INT >= 28);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f5034d = (Build.VERSION.SDK_INT >= 26);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f5035e = (Build.VERSION.SDK_INT >= 25);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f5036f = (Build.VERSION.SDK_INT >= 24);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final boolean f5037g;

    /* renamed from: h */
    public static final C1735a f5038h = new C1735a((C3366g) null);

    /* renamed from: com.fb.fluid.l.c$a */
    public static final class C1735a {
        private C1735a() {
        }

        public /* synthetic */ C1735a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo6472a() {
            return C1734c.f5032b;
        }

        /* renamed from: b */
        public final boolean mo6473b() {
            return C1734c.f5037g;
        }

        /* renamed from: c */
        public final boolean mo6474c() {
            return C1734c.f5036f;
        }

        /* renamed from: d */
        public final boolean mo6475d() {
            return C1734c.f5035e;
        }

        /* renamed from: e */
        public final boolean mo6476e() {
            return C1734c.f5034d;
        }

        /* renamed from: f */
        public final boolean mo6477f() {
            return C1734c.f5033c;
        }

        /* renamed from: g */
        public final boolean mo6478g() {
            return C1734c.f5031a;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 23) {
            z = false;
        }
        f5037g = z;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
    }
}
