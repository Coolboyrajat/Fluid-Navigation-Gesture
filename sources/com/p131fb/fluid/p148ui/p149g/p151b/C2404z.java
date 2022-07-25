package com.p131fb.fluid.p148ui.p149g.p151b;

import android.app.Application;
import androidx.lifecycle.C0497t;
import com.p131fb.fluid.p148ui.p149g.p150a.C2064c;
import com.p131fb.fluid.p148ui.p149g.p150a.C2068g;
import com.p131fb.fluid.p148ui.p149g.p152c.C2428c0;
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

/* renamed from: com.fb.fluid.ui.g.b.z */
public final class C2404z extends C2317o {

    /* renamed from: com.fb.fluid.ui.g.b.z$a */
    static final class C2405a extends C3371l implements C3350b<C2471s, Unit> {

        /* renamed from: g */
        final /* synthetic */ String f6110g;

        /* renamed from: h */
        final /* synthetic */ int f6111h;

        /* renamed from: i */
        final /* synthetic */ C2404z f6112i;

        /* renamed from: j */
        final /* synthetic */ String[] f6113j;

        /* renamed from: k */
        final /* synthetic */ String[] f6114k;

        /* renamed from: com.fb.fluid.ui.g.b.z$a$a */
        static final class C2406a extends C3371l implements C3351c<C2471s, Integer, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2405a f6115g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2406a(C2405a aVar) {
                super(2);
                this.f6115g = aVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
                mo7231a((C2471s) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7231a(C2471s sVar, int i) {
                C3370k.m12227b(sVar, "<anonymous parameter 0>");
                C0497t<C2068g> h = this.f6115g.f6112i.mo7160h();
                C2405a aVar = this.f6115g;
                String str = aVar.f6114k[aVar.f6111h];
                C3370k.m12223a((Object) str, "urls[index]");
                h.setValue(new C2064c(str));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2405a(String str, int i, C2404z zVar, String[] strArr, String[] strArr2) {
            super(1);
            this.f6110g = str;
            this.f6111h = i;
            this.f6112i = zVar;
            this.f6113j = strArr;
            this.f6114k = strArr2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo7230a((C2471s) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7230a(C2471s sVar) {
            C3370k.m12227b(sVar, "$receiver");
            C2472t.m9231b(sVar, this.f6110g, (Integer) null, (C3349a) null, 6, (Object) null);
            C2472t.m9227a((C2472t) sVar, this.f6113j[this.f6111h], (Integer) null, (C3349a) null, 6, (Object) null);
            sVar.mo7315a(new C2406a(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2404z(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        C1116a.C1117a.m5570a(mo7159g(), C3283i.m12064a(new C2428c0((String) null, Integer.valueOf(C3148R.string.header_licences), false, false, false, true, 0, (C3350b) null, 197, (C3366g) null)), (C3351c) null, (C3351c) null, 6, (Object) null);
        String[] stringArray = application.getResources().getStringArray(C3148R.array.licences_url);
        C3370k.m12223a((Object) stringArray, "app.resources.getStringArray(R.array.licences_url)");
        String[] stringArray2 = application.getResources().getStringArray(C3148R.array.licences_type);
        C3370k.m12223a((Object) stringArray2, "app.resources.getStringA…ay(R.array.licences_type)");
        String[] stringArray3 = application.getResources().getStringArray(C3148R.array.licences_title);
        C3370k.m12223a((Object) stringArray3, "app.resources.getStringA…y(R.array.licences_title)");
        int length = stringArray3.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            String str = stringArray3[i2];
            C1116a<Object> g = mo7159g();
            C2405a aVar = r3;
            C2405a aVar2 = new C2405a(str, i, this, stringArray2, stringArray);
            g.mo5202a((IT[]) new Object[]{new C2471s(aVar)});
            i2++;
            i++;
        }
    }
}
