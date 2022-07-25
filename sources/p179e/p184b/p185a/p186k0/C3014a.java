package p179e.p184b.p185a.p186k0;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.C3269p;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3117n;

/* renamed from: e.b.a.k0.a */
public final class C3014a {

    /* renamed from: e.b.a.k0.a$a */
    static final class C3015a extends C3371l implements C3349a<Context> {

        /* renamed from: g */
        final /* synthetic */ Context f7770g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3015a(Context context) {
            super(0);
            this.f7770g = context;
        }

        public final Context invoke() {
            return this.f7770g;
        }
    }

    /* renamed from: a */
    public static final C3018c<Context> m11539a() {
        return m11543b();
    }

    /* renamed from: a */
    public static final C3018c<Object> m11540a(Context context) {
        C3370k.m12227b(context, "context");
        return m11544b(context);
    }

    /* renamed from: a */
    public static final C3018c<Object> m11541a(C3349a<? extends Context> aVar) {
        C3370k.m12227b(aVar, "getContext");
        return new C3019d(aVar);
    }

    /* renamed from: b */
    public static final C3018c<Context> m11543b() {
        return new C3016b();
    }

    /* renamed from: b */
    public static final C3018c<Object> m11544b(Context context) {
        C3370k.m12227b(context, "context");
        return new C3019d(new C3015a(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C3059m m11545b(Object obj, Context context) {
        for (Context context2 = context; context2 != null; context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null) {
            if ((!C3370k.m12225a((Object) context2, obj)) && (context2 instanceof C3117n)) {
                return ((C3117n) context2).mo6351e();
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((C3117n) applicationContext).mo6351e();
        }
        throw new C3269p("null cannot be cast to non-null type org.kodein.di.KodeinAware");
    }
}
