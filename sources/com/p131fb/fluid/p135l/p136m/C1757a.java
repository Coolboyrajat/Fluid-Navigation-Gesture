package com.p131fb.fluid.p135l.p136m;

import android.content.Context;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.m.a */
public final class C1757a {

    /* renamed from: a */
    private final C1759b f5078a = C1759b.f5081b.mo6528a();

    /* renamed from: b */
    private final C1759b f5079b = C1759b.f5081b.mo6528a();

    /* renamed from: com.fb.fluid.l.m.a$a */
    public static final class C1758a {
        private C1758a() {
        }

        public /* synthetic */ C1758a(C3366g gVar) {
            this();
        }
    }

    static {
        new C1758a((C3366g) null);
    }

    public C1757a(Context context) {
        C3370k.m12227b(context, "context");
    }

    /* renamed from: a */
    public static /* synthetic */ void m7423a(C1757a aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        aVar.mo6525a(str);
    }

    /* renamed from: a */
    public final void mo6525a(String str) {
        if (str instanceof String) {
            this.f5078a.remove(str);
            this.f5079b.remove(str);
            return;
        }
        this.f5078a.evictAll();
        this.f5079b.evictAll();
    }
}
