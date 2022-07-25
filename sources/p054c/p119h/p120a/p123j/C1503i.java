package p054c.p119h.p120a.p123j;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p119h.p120a.C1452a;
import p054c.p119h.p120a.p122i.C1472a;

/* renamed from: c.h.a.j.i */
public final class C1503i {

    /* renamed from: c.h.a.j.i$a */
    static final class C1504a extends C3371l implements C3349a<TInput> {

        /* renamed from: g */
        final /* synthetic */ Class f4529g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1504a(Class cls) {
            super(0);
            this.f4529g = cls;
        }

        public final TInput invoke() {
            try {
                TInput newInstance = C3370k.m12225a((Object) this.f4529g, (Object) Unit.class) ? Unit.INSTANCE : this.f4529g.newInstance();
                if (newInstance != null) {
                    return newInstance;
                }
                throw new C3269p("null cannot be cast to non-null type TInput");
            } catch (Throwable unused) {
                String name = this.f4529g.getName();
                C3370k.m12223a((Object) name, "inputClass.name");
                throw new C1452a(name);
            }
        }
    }

    /* renamed from: c.h.a.j.i$b */
    static final class C1505b extends C3371l implements C3349a<TInput> {

        /* renamed from: g */
        final /* synthetic */ Intent f4530g;

        /* renamed from: h */
        final /* synthetic */ Object f4531h;

        /* renamed from: i */
        final /* synthetic */ C1504a f4532i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1505b(Intent intent, Object obj, C1504a aVar) {
            super(0);
            this.f4530g = intent;
            this.f4531h = obj;
            this.f4532i = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = p054c.p119h.p120a.p122i.C1472a.m6701a(r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final TInput invoke() {
            /*
                r1 = this;
                android.content.Intent r0 = r1.f4530g
                if (r0 == 0) goto L_0x000f
                android.os.Bundle r0 = p054c.p119h.p120a.p122i.C1472a.m6701a((android.content.Intent) r0)
                if (r0 == 0) goto L_0x000f
                boolean r0 = p054c.p119h.p120a.p122i.C1472a.m6713c(r0)
                goto L_0x0010
            L_0x000f:
                r0 = 0
            L_0x0010:
                if (r0 != 0) goto L_0x0017
                java.lang.Object r0 = r1.f4531h
                if (r0 == 0) goto L_0x0017
                goto L_0x001d
            L_0x0017:
                c.h.a.j.i$a r0 = r1.f4532i
                java.lang.Object r0 = r0.invoke()
            L_0x001d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p119h.p120a.p123j.C1503i.C1505b.invoke():java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <TInput> C1483a<TInput> m6777a(Context context, Intent intent, Class<TInput> cls, TInput tinput) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(cls, "inputClass");
        C1505b bVar = new C1505b(intent, tinput, new C1504a(cls));
        if (intent == null) {
            return new C1483a<>(bVar.invoke(), (C1499f) null, 2, (C3366g) null);
        }
        Bundle a = C1472a.m6701a(intent);
        Object invoke = bVar.invoke();
        return new C1483a<>(invoke, C1499f.f4528f.mo5978a(context, invoke, a));
    }
}
