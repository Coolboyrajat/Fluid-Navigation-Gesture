package p179e.p184b.p185a.p188m0;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p179e.p184b.p185a.C3001h;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3121p;
import p179e.p184b.p185a.C3128r;
import p179e.p184b.p185a.p187l0.C3026e;
import p179e.p184b.p185a.p187l0.C3029g;

/* renamed from: e.b.a.m0.e */
public final class C3080e implements C3121p.C3122a {

    /* renamed from: a */
    private final C3081a f7828a;

    /* renamed from: b */
    private final Map<C3059m.C3069f<?, ?, ?>, List<C3128r<?, ?, ?>>> f7829b;

    /* renamed from: c */
    private final List<C3350b<C3001h, Unit>> f7830c;

    /* renamed from: d */
    private final List<C3026e<?, ?>> f7831d;

    /* renamed from: e.b.a.m0.e$a */
    private enum C3081a {
        ;
        

        /* renamed from: j */
        public static final C3084c f7836j = null;

        /* renamed from: e.b.a.m0.e$a$a */
        static final class C3082a extends C3081a {
            C3082a(String str, int i) {
                super(str, i, (C3366g) null);
            }

            /* renamed from: a */
            public Boolean mo9193a(Boolean bool) {
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        }

        /* renamed from: e.b.a.m0.e$a$b */
        static final class C3083b extends C3081a {
            C3083b(String str, int i) {
                super(str, i, (C3366g) null);
            }

            /* renamed from: a */
            public Boolean mo9193a(Boolean bool) {
                return bool;
            }
        }

        /* renamed from: e.b.a.m0.e$a$c */
        public static final class C3084c {
            private C3084c() {
            }

            public /* synthetic */ C3084c(C3366g gVar) {
                this();
            }

            /* renamed from: a */
            public final C3081a mo9194a(boolean z, boolean z2) {
                return !z ? C3081a.f7834h : z2 ? C3081a.f7832f : C3081a.f7833g;
            }
        }

        /* renamed from: e.b.a.m0.e$a$d */
        static final class C3085d extends C3081a {
            C3085d(String str, int i) {
                super(str, i, (C3366g) null);
            }

            /* renamed from: a */
            public Boolean mo9193a(Boolean bool) {
                if (bool == null || !bool.booleanValue()) {
                    return false;
                }
                throw new C3059m.C3074i("Overriding has been forbidden");
            }
        }

        static {
            f7836j = new C3084c((C3366g) null);
        }

        /* renamed from: a */
        public abstract Boolean mo9193a(Boolean bool);
    }

    public C3080e(boolean z, boolean z2, Map<C3059m.C3069f<?, ?, ?>, List<C3128r<?, ?, ?>>> map, List<C3350b<C3001h, Unit>> list, List<C3026e<?, ?>> list2) {
        C3370k.m12227b(map, "bindingsMap");
        C3370k.m12227b(list, "callbacks");
        C3370k.m12227b(list2, "translators");
        this.f7829b = map;
        this.f7830c = list;
        this.f7831d = list2;
        this.f7828a = C3081a.f7836j.mo9194a(z, z2);
    }

    /* renamed from: a */
    private final void m11672a(C3059m.C3069f<?, ?, ?> fVar, Boolean bool) {
        Boolean a = this.f7828a.mo9193a(bool);
        if (a == null) {
            return;
        }
        if (a.booleanValue() && !this.f7829b.containsKey(fVar)) {
            throw new C3059m.C3074i("Binding " + fVar + " must override an existing binding.");
        } else if (!a.booleanValue() && this.f7829b.containsKey(fVar)) {
            throw new C3059m.C3074i("Binding " + fVar + " must not override an existing binding.");
        }
    }

    /* renamed from: a */
    public final Map<C3059m.C3069f<?, ?, ?>, List<C3128r<?, ?, ?>>> mo9189a() {
        return this.f7829b;
    }

    /* renamed from: a */
    public <C, A, T> void mo9190a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar, C3029g<? super C, ? super A, ? extends T> gVar, String str, Boolean bool) {
        C3370k.m12227b(fVar, "key");
        C3370k.m12227b(gVar, "binding");
        fVar.mo9183i().mo9114a((Object) fVar);
        fVar.mo9172a().mo9114a((Object) fVar);
        m11672a(fVar, bool);
        Map<C3059m.C3069f<?, ?, ?>, List<C3128r<?, ?, ?>>> map = this.f7829b;
        List<C3128r<?, ?, ?>> list = map.get(fVar);
        if (list == null) {
            list = C3113n.m11755b();
            map.put(fVar, list);
        }
        list.add(0, new C3128r(gVar, str));
    }

    /* renamed from: b */
    public final List<C3350b<C3001h, Unit>> mo9191b() {
        return this.f7830c;
    }

    /* renamed from: c */
    public final List<C3026e<?, ?>> mo9192c() {
        return this.f7831d;
    }
}
