package com.p131fb.fluid.p135l.p140q;

import android.content.Context;
import android.provider.Settings;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.q.d */
public final class C1789d {

    /* renamed from: a */
    public static final C1790a f5092a = new C1790a((C3366g) null);

    /* renamed from: com.fb.fluid.l.q.d$a */
    public static final class C1790a {
        private C1790a() {
        }

        public /* synthetic */ C1790a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo6560a(Context context, boolean z) {
            C3370k.m12227b(context, "context");
            try {
                return Settings.Global.putInt(context.getContentResolver(), "force_fsg_nav_bar", z ? 1 : 0);
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
