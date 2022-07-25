package p179e.p184b.p185a.p188m0;

import java.util.Set;
import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3002h0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.p187l0.C3029g;
import p179e.p184b.p185a.p187l0.C3039l;
import p179e.p184b.p185a.p187l0.C3044p;

/* renamed from: e.b.a.m0.d */
public class C3078d implements C3059m.C3063b {

    /* renamed from: a */
    private final C2999g0<Object> f7821a = C3002h0.m11525a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f7822b;

    /* renamed from: c */
    private final C3080e f7823c;

    /* renamed from: e.b.a.m0.d$a */
    public final class C3079a<T> implements C3059m.C3063b.C3064a<T> {

        /* renamed from: a */
        private final C2999g0<? extends T> f7824a;

        /* renamed from: b */
        private final Object f7825b;

        /* renamed from: c */
        private final Boolean f7826c;

        /* renamed from: d */
        final /* synthetic */ C3078d f7827d;

        public C3079a(C3078d dVar, C2999g0<? extends T> g0Var, Object obj, Boolean bool) {
            C3370k.m12227b(g0Var, "type");
            this.f7827d = dVar;
            this.f7824a = g0Var;
            this.f7825b = obj;
            this.f7826c = bool;
        }

        /* renamed from: a */
        public final C3080e mo9188a() {
            return this.f7827d.mo9187c();
        }

        /* renamed from: a */
        public <C, A> void mo9169a(C3029g<? super C, ? super A, ? extends T> gVar) {
            C3370k.m12227b(gVar, "binding");
            mo9188a().mo9190a(new C3059m.C3069f(gVar.mo9136a(), gVar.mo9140e(), this.f7824a, this.f7825b), gVar, this.f7827d.f7822b, this.f7826c);
        }
    }

    public C3078d(String str, String str2, Set<String> set, C3080e eVar) {
        C3370k.m12227b(str2, "prefix");
        C3370k.m12227b(set, "importedModules");
        C3370k.m12227b(eVar, "containerBuilder");
        this.f7822b = str;
        this.f7823c = eVar;
    }

    /* renamed from: a */
    public C2999g0<Object> mo9166a() {
        return this.f7821a;
    }

    /* renamed from: a */
    public <T> C3079a<T> m11667a(C2999g0<? extends T> g0Var, Object obj, Boolean bool) {
        C3370k.m12227b(g0Var, "type");
        return new C3079a<>(this, g0Var, obj, bool);
    }

    /* renamed from: b */
    public C3044p<Object> mo9167b() {
        return new C3039l();
    }

    /* renamed from: c */
    public C3080e mo9187c() {
        return this.f7823c;
    }
}
