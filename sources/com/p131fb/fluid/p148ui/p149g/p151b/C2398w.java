package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
import com.p131fb.fluid.p148ui.p149g.p152c.C2466p;
import com.p131fb.fluid.p148ui.p149g.p152c.C2471s;
import com.p131fb.fluid.p148ui.p149g.p152c.C2472t;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.b.w */
public final class C2398w extends C2317o {

    /* renamed from: i */
    private final C0497t<C2068g> f6104i = new C0497t<>();

    /* renamed from: com.fb.fluid.ui.g.b.w$a */
    static final class C2399a extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2399a f6105g = new C2399a();

        C2399a() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7228a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7228a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.intro_swipe), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.intro_swipe_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.w$b */
    static final class C2400b extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        public static final C2400b f6106g = new C2400b();

        C2400b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7229a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7229a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2471s sVar2 = sVar;
            C2472t.m9231b(sVar2, (String) null, Integer.valueOf(C3148R.string.intro_swipe_hold), (C3349a) null, 5, (Object) null);
            C2472t.m9227a((C2472t) sVar2, (String) null, Integer.valueOf(C3148R.string.intro_swipe_hold_sum), (C3349a) null, 5, (Object) null);
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.w$c */
    public static final class C2401c {
        private C2401c() {
        }

        public /* synthetic */ C2401c(C3366g gVar) {
            this();
        }
    }

    static {
        new C2401c((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2398w(Application application, int i) {
        super(application);
        int i2 = i;
        C3370k.m12227b(application, "app");
        if (i2 == 0) {
            C1116a.C1117a.m5570a(mo7159g(), C3284j.m12070b((T[]) new Object[]{new C2466p(C3148R.C3149drawable.ic_intro_fng), new C2428c0((String) null, Integer.valueOf(C3148R.string.app_name), true, false, false, false, 0, (C3350b) null, 241, (C3366g) null)}), (C3351c) null, (C3351c) null, 6, (Object) null);
        } else if (i2 == 1) {
            C1116a.C1117a.m5570a(mo7159g(), C3284j.m12070b((T[]) new Object[]{new C2466p(C3148R.C3149drawable.ic_intro_quick_swipe), new C2471s(C2399a.f6105g)}), (C3351c) null, (C3351c) null, 6, (Object) null);
        } else if (i2 == 2) {
            C1116a.C1117a.m5570a(mo7159g(), C3284j.m12070b((T[]) new Object[]{new C2466p(C3148R.C3149drawable.ic_intro_swipe_hold), new C2471s(C2400b.f6106g)}), (C3351c) null, (C3351c) null, 6, (Object) null);
        }
    }

    /* renamed from: i */
    public final C0497t<C2068g> mo7227i() {
        return this.f6104i;
    }
}
