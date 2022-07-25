package p179e.p184b.p185a.p188m0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C3261j;
import kotlin.C3267n;
import kotlin.C3268o;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3211j;
import kotlin.p195s.C3282h;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3359b0;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C2985a0;
import p179e.p184b.p185a.C2989c;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3119o;
import p179e.p184b.p185a.C3121p;
import p179e.p184b.p185a.C3125q;
import p179e.p184b.p185a.C3129s;
import p179e.p184b.p185a.C3132u;
import p179e.p184b.p185a.p187l0.C3024c;
import p179e.p184b.p185a.p187l0.C3026e;
import p179e.p184b.p185a.p187l0.C3027f;
import p179e.p184b.p185a.p187l0.C3048t;

/* renamed from: e.b.a.m0.f */
public final class C3086f implements C3121p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile C3349a<Unit> f7837a;

    /* renamed from: b */
    private final C3132u f7838b;

    /* renamed from: c */
    private final C3088b f7839c;

    /* renamed from: d */
    private final boolean f7840d;

    /* renamed from: e.b.a.m0.f$a */
    static final class C3087a extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C3086f f7841g;

        /* renamed from: h */
        final /* synthetic */ Object f7842h;

        /* renamed from: i */
        final /* synthetic */ C3349a f7843i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3087a(C3086f fVar, Object obj, C3349a aVar) {
            super(0);
            this.f7841g = fVar;
            this.f7842h = obj;
            this.f7843i = aVar;
        }

        public final void invoke() {
            Object obj = this.f7842h;
            C3086f fVar = this.f7841g;
            if (fVar.mo9195a() != null) {
                if (obj != null) {
                    synchronized (obj) {
                        if (fVar.mo9195a() != null) {
                            this.f7841g.f7837a = null;
                            this.f7843i.invoke();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (fVar.mo9195a() != null) {
                    this.f7841g.f7837a = null;
                    this.f7843i.invoke();
                }
            }
        }
    }

    /* renamed from: e.b.a.m0.f$b */
    private static final class C3088b {

        /* renamed from: a */
        private final C3059m.C3069f<?, ?, ?> f7844a;

        /* renamed from: b */
        private final int f7845b;

        /* renamed from: c */
        private final C3088b f7846c;

        /* renamed from: d */
        private final boolean f7847d;

        public C3088b(C3059m.C3069f<?, ?, ?> fVar, int i, C3088b bVar, boolean z) {
            C3370k.m12227b(fVar, "key");
            this.f7844a = fVar;
            this.f7845b = i;
            this.f7846c = bVar;
            this.f7847d = z;
        }

        /* renamed from: a */
        private final List<String> m11688a(C3088b bVar, C3059m.C3069f<?, ?, ?> fVar, int i, List<String> list) {
            List<String> list2;
            while (true) {
                list2 = list;
                if (bVar.f7846c != null && (!C3370k.m12225a((Object) fVar, (Object) bVar.f7844a) || i != bVar.f7845b)) {
                    C3088b bVar2 = bVar.f7846c;
                    List<String> b = C3292r.m12095b(C3283i.m12064a(m11690b(bVar.f7844a, bVar.f7845b)), list2);
                    bVar = bVar2;
                    list2 = b;
                }
            }
            return C3292r.m12095b(C3283i.m12064a(m11690b(bVar.f7844a, bVar.f7845b)), list2);
        }

        /* renamed from: a */
        private final boolean m11689a(C3088b bVar, C3059m.C3069f<?, ?, ?> fVar, int i) {
            do {
                if (C3370k.m12225a((Object) bVar.f7844a, (Object) fVar) && bVar.f7845b == i) {
                    return false;
                }
                bVar = bVar.f7846c;
            } while (bVar != null);
            return true;
        }

        /* renamed from: b */
        private final String m11690b(C3059m.C3069f<?, ?, ?> fVar, int i) {
            C3211j gVar = this.f7847d ? new C3092g(fVar) : new C3093h(fVar);
            if (i == 0) {
                return (String) gVar.mo9202a();
            }
            return "overridden " + ((String) gVar.mo9202a());
        }

        /* renamed from: a */
        public final void mo9199a(C3059m.C3069f<?, ?, ?> fVar, int i) {
            String str;
            C3370k.m12227b(fVar, "searchedKey");
            if (!m11689a(this, fVar, i)) {
                List<T> a = C3292r.m12089a(m11688a(this, fVar, i, C3284j.m12068a()), m11690b(fVar, this.f7845b));
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (T next : a) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str2 = (String) next;
                        sb.append("  ");
                        if (i2 == 0) {
                            str = "   ";
                        } else if (i2 != 1) {
                            sb.append("  ║");
                            sb.append(C3250n.m11926a("  ", i2 - 1));
                            str = "╚>";
                        } else {
                            str = "  ╔╩>";
                        }
                        sb.append(str);
                        sb.append(str2);
                        sb.append("\n");
                        i2 = i3;
                    } else {
                        C3282h.m12055c();
                        throw null;
                    }
                }
                sb.append("    ╚");
                sb.append(C3250n.m11926a("══", a.size() - 1));
                sb.append("╝");
                throw new C3059m.C3068e("Dependency recursion:\n" + sb);
            }
        }
    }

    /* renamed from: e.b.a.m0.f$c */
    static final class C3089c extends C3371l implements C3351c<Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>, Boolean, String> {

        /* renamed from: g */
        public static final C3089c f7848g = new C3089c();

        C3089c() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            return mo9200a((Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>) (Map) obj, ((Boolean) obj2).booleanValue());
        }

        /* renamed from: a */
        public final String mo9200a(Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>> map, boolean z) {
            C3370k.m12227b(map, "$receiver");
            return C2989c.m11484b(map, z, 0, 2, (Object) null);
        }
    }

    /* renamed from: e.b.a.m0.f$d */
    static final class C3090d extends C3371l implements C3351c<Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>, Boolean, String> {

        /* renamed from: g */
        public static final C3090d f7849g = new C3090d();

        C3090d() {
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            return mo9201a((Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>) (Map) obj, ((Boolean) obj2).booleanValue());
        }

        /* renamed from: a */
        public final String mo9201a(Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>> map, boolean z) {
            C3370k.m12227b(map, "$receiver");
            return C2989c.m11481a((Map) map, z, 0, 2, (Object) null);
        }
    }

    /* renamed from: e.b.a.m0.f$e */
    static final class C3091e extends C3371l implements C3349a<Unit> {

        /* renamed from: g */
        final /* synthetic */ C3086f f7850g;

        /* renamed from: h */
        final /* synthetic */ C3080e f7851h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3091e(C3086f fVar, C3080e eVar) {
            super(0);
            this.f7850g = fVar;
            this.f7851h = eVar;
        }

        public final void invoke() {
            C3077c cVar = new C3077c(this.f7850g, C3119o.m11766a());
            for (C3350b a : this.f7851h.mo9191b()) {
                a.mo5146a(cVar);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3086f(C3080e eVar, List<? extends C3027f> list, boolean z, boolean z2) {
        this(new C3100m(eVar.mo9189a(), list, eVar.mo9192c()), (C3088b) null, z);
        C3370k.m12227b(eVar, "builder");
        C3370k.m12227b(list, "externalSources");
        C3091e eVar2 = new C3091e(this, eVar);
        if (z2) {
            eVar2.invoke();
        } else {
            this.f7837a = new C3087a(this, new Object(), eVar2);
        }
    }

    private C3086f(C3132u uVar, C3088b bVar, boolean z) {
        this.f7838b = uVar;
        this.f7839c = bVar;
        this.f7840d = z;
    }

    /* renamed from: a */
    private final <C, A, T> C3024c<C> m11682a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar, C3125q<C> qVar, C3132u uVar, int i) {
        return new C3075a(new C3077c(new C3086f(uVar, new C3088b(fVar, i, this.f7839c, this.f7840d), this.f7840d), qVar), fVar, qVar.getValue(), i);
    }

    /* renamed from: a */
    public final C3349a<Unit> mo9195a() {
        return this.f7837a;
    }

    /* renamed from: a */
    public <C, A, T> C3350b<A, T> mo9196a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar, C c, int i) {
        C3125q<C> qVar;
        C3059m.C3069f<? super C, ? super A, ? extends T> fVar2 = fVar;
        C c2 = c;
        int i2 = i;
        C3370k.m12227b(fVar2, "key");
        boolean z = false;
        List<C3267n> a = C3132u.C3133a.m11789a(mo9197b(), fVar, i, false, 4, (Object) null);
        if (a.size() == 1) {
            C3267n nVar = (C3267n) a.get(0);
            C3129s sVar = (C3129s) nVar.mo9948b();
            C3026e eVar = (C3026e) nVar.mo9949c();
            C3088b bVar = this.f7839c;
            if (bVar != null) {
                bVar.mo9199a(fVar2, i2);
            }
            if ((eVar == null || (qVar = C3048t.m11606a(eVar, c2)) == null) && (qVar = C3125q.f7885a.mo9235a(fVar.mo9176d(), c2)) == null) {
                throw new C3269p("null cannot be cast to non-null type org.kodein.di.KodeinContext<kotlin.Any>");
            }
            return sVar.mo9239a().mo9129a(m11682a(fVar2, qVar, sVar.mo9241c(), i2), fVar2);
        }
        C3024c<C> a2 = m11682a(fVar2, C3125q.f7885a.mo9235a(fVar.mo9176d(), c2), mo9197b(), i2);
        for (C3027f a3 : mo9197b().mo9205a()) {
            C3350b<Object, Object> a4 = a3.mo9135a(a2, fVar2);
            if (a4 != null) {
                C3088b bVar2 = this.f7839c;
                if (bVar2 != null) {
                    bVar2.mo9199a(fVar2, i2);
                }
                if (a4 != null) {
                    C3359b0.m12198a((Object) a4, 1);
                    return a4;
                }
                throw new C3269p("null cannot be cast to non-null type (A) -> T");
            }
        }
        if (i2 != 0) {
            z = true;
        }
        C3211j iVar = this.f7840d ? new C3094i(fVar2) : new C3095j(fVar2);
        C3351c cVar = this.f7840d ? C3089c.f7848g : C3090d.f7849g;
        if (a.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("No binding found for " + ((String) iVar.mo9202a()) + 10);
            List<C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>>> a5 = mo9197b().mo9206a(new C2985a0((C2999g0) null, (C2999g0) null, fVar.mo9183i(), (Object) null, 11, (C3366g) null));
            if (true ^ a5.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Available bindings for this type:\n");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C3198h.m11846a(C3301z.m12116a(C3285k.m12075a(a5, 10)), 16));
                for (C3267n nVar2 : a5) {
                    C3261j a6 = C3268o.m11989a(nVar2.mo9950d(), nVar2.mo9951e());
                    linkedHashMap.put(a6.mo9936c(), a6.mo9937d());
                }
                sb2.append((String) cVar.mo6125a(linkedHashMap, Boolean.valueOf(z)));
                sb.append(sb2.toString());
            }
            sb.append("Registered in this Kodein container:\n" + ((String) cVar.mo6125a(mo9197b().mo9209b(), Boolean.valueOf(z))));
            String sb3 = sb.toString();
            C3370k.m12223a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
            throw new C3059m.C3073h(fVar2, sb3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C3198h.m11846a(C3301z.m12116a(C3285k.m12075a(a, 10)), 16));
        for (C3267n nVar3 : a) {
            Object d = nVar3.mo9950d();
            C3267n a7 = mo9197b().mo9208a((C3059m.C3069f) nVar3.mo9950d());
            if (a7 != null) {
                C3261j a8 = C3268o.m11989a(d, a7.mo9951e());
                linkedHashMap2.put(a8.mo9936c(), a8.mo9937d());
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
        Map<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>> b = mo9197b().mo9209b();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry next : b.entrySet()) {
            if (!linkedHashMap2.keySet().contains((C3059m.C3069f) next.getKey())) {
                linkedHashMap3.put(next.getKey(), next.getValue());
            }
        }
        throw new C3059m.C3073h(fVar2, linkedHashMap2.size() + " bindings found that match " + fVar2 + ":\n" + ((String) cVar.mo6125a(linkedHashMap2, Boolean.valueOf(z))) + "Other bindings registered in Kodein:\n" + ((String) cVar.mo6125a(linkedHashMap3, Boolean.valueOf(z))));
    }

    /* renamed from: b */
    public C3132u mo9197b() {
        return this.f7838b;
    }

    /* renamed from: b */
    public <C, T> C3349a<T> mo9198b(C3059m.C3069f<? super C, ? super Unit, ? extends T> fVar, C c, int i) {
        C3370k.m12227b(fVar, "key");
        return C3121p.C3123b.m11772a(this, fVar, c, i);
    }
}
