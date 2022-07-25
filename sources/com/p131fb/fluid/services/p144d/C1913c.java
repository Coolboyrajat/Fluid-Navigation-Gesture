package com.p131fb.fluid.services.p144d;

import com.p131fb.fluid.p135l.p143t.C1798b;
import java.util.concurrent.TimeUnit;
import p155d.p156a.C2790h;
import p155d.p156a.p160o.C2810b;
import p155d.p156a.p162q.C2826d;
import p155d.p156a.p162q.C2827e;
import p155d.p156a.p177v.C2964b;
import p155d.p156a.p178w.C2973a;

/* renamed from: com.fb.fluid.services.d.c */
public final class C1913c {

    /* renamed from: a */
    private long f5333a;

    /* renamed from: b */
    private C2810b f5334b;

    /* renamed from: c */
    private final C1798b<Boolean> f5335c = new C1798b<>(false);

    /* renamed from: com.fb.fluid.services.d.c$a */
    public static final class C1914a {
        private C1914a() {
        }

        public /* synthetic */ C1914a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.fb.fluid.services.d.c$b */
    static final class C1915b implements C2826d {

        /* renamed from: a */
        final /* synthetic */ C1913c f5336a;

        C1915b(C1913c cVar) {
            this.f5336a = cVar;
        }

        /* renamed from: a */
        public final boolean mo6039a() {
            return !this.f5336a.m7816d();
        }
    }

    /* renamed from: com.fb.fluid.services.d.c$c */
    static final class C1916c<T> implements C2827e<Long> {

        /* renamed from: a */
        final /* synthetic */ C1913c f5337a;

        C1916c(C1913c cVar) {
            this.f5337a = cVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            if (!this.f5337a.m7816d()) {
                this.f5337a.mo6696c();
            }
        }
    }

    static {
        new C1914a((C3366g) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m7816d() {
        return System.currentTimeMillis() < this.f5333a;
    }

    /* renamed from: a */
    public final C2973a<Boolean> mo6694a() {
        return this.f5335c.mo6587a();
    }

    /* renamed from: b */
    public final void mo6695b() {
        this.f5333a = System.currentTimeMillis() + ((long) 2000);
        C2810b bVar = this.f5334b;
        if (bVar == null || bVar.mo6028b()) {
            this.f5335c.mo6588a(true);
            this.f5334b = C2790h.m10993c(1, TimeUnit.SECONDS, C2964b.m11437b()).mo8910a((C2826d) new C1915b(this)).mo8901a().mo8927b(new C1916c(this));
        }
    }

    /* renamed from: c */
    public final void mo6696c() {
        this.f5333a = 0;
        C2810b bVar = this.f5334b;
        if (bVar != null) {
            bVar.mo6027a();
        }
        this.f5335c.mo6588a(false);
    }
}
