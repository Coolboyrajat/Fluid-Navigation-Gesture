package org.kodein.p214di.android.p215x;

import androidx.lifecycle.C0490o;
import java.util.HashMap;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3384y;
import p179e.p184b.p185a.p187l0.C3044p;
import p179e.p184b.p185a.p187l0.C3047s;
import p179e.p184b.p185a.p187l0.C3057x;

/* renamed from: org.kodein.di.android.x.AndroidLifecycleScope */
public class AndroidLifecycleScope implements C3044p<C0490o> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashMap<C0490o, C3047s> f8275a;

    /* renamed from: b */
    private final C3349a<C3047s> f8276b;

    /* renamed from: org.kodein.di.android.x.AndroidLifecycleScope$a */
    public static final class C3565a extends AndroidLifecycleScope {

        /* renamed from: org.kodein.di.android.x.AndroidLifecycleScope$a$a */
        static final /* synthetic */ class C3566a extends C3368i implements C3349a<C3057x> {

            /* renamed from: j */
            public static final C3566a f8277j = new C3566a();

            C3566a() {
                super(0);
            }

            /* renamed from: b */
            public final String mo6062b() {
                return "<init>";
            }

            /* renamed from: h */
            public final C3204e mo6063h() {
                return C3384y.m12254a(C3057x.class);
            }

            public final C3057x invoke() {
                return new C3057x();
            }

            /* renamed from: j */
            public final String mo6064j() {
                return "<init>()V";
            }
        }

        private C3565a() {
            super(C3566a.f8277j, (C3366g) null);
        }

        public /* synthetic */ C3565a(C3366g gVar) {
            this();
        }
    }

    static {
        new C3565a((C3366g) null);
    }

    private AndroidLifecycleScope(C3349a<? extends C3047s> aVar) {
        this.f8276b = aVar;
        this.f8275a = new HashMap<>();
    }

    public /* synthetic */ AndroidLifecycleScope(C3349a aVar, C3366g gVar) {
        this(aVar);
    }

    /* renamed from: a */
    public C3047s mo9146a(C0490o oVar) {
        C3370k.m12227b(oVar, "context");
        HashMap<C0490o, C3047s> hashMap = this.f8275a;
        C3047s sVar = hashMap.get(oVar);
        if (sVar == null) {
            if (hashMap == null) {
                C3047s sVar2 = this.f8275a.get(oVar);
                if (sVar2 != null) {
                    sVar = sVar2;
                } else {
                    sVar = this.f8276b.invoke();
                    this.f8275a.put(oVar, sVar);
                    oVar.mo5a().mo2701a(new C3567xabb9e8bf(sVar, this, oVar));
                    C3370k.m12223a((Object) sVar, "synchronizedIfNull(\n    …              }\n        )");
                    return sVar;
                }
            } else {
                synchronized (hashMap) {
                    sVar = this.f8275a.get(oVar);
                    if (sVar == null) {
                        sVar = this.f8276b.invoke();
                        this.f8275a.put(oVar, sVar);
                        oVar.mo5a().mo2701a(new C3568xabb9e8c0(sVar, this, oVar));
                    }
                }
                C3370k.m12223a((Object) sVar, "synchronizedIfNull(\n    …              }\n        )");
                return sVar;
            }
        }
        C3370k.m12223a((Object) sVar, "it");
        C3370k.m12223a((Object) sVar, "synchronizedIfNull(\n    …              }\n        )");
        return sVar;
    }
}
