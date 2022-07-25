package p179e.p184b.p185a.p188m0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C3261j;
import kotlin.C3267n;
import kotlin.C3268o;
import kotlin.C3269p;
import kotlin.p193c0.C3221d;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C2985a0;
import p179e.p184b.p185a.C2999g0;
import p179e.p184b.p185a.C3002h0;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.C3128r;
import p179e.p184b.p185a.C3129s;
import p179e.p184b.p185a.C3132u;
import p179e.p184b.p185a.p187l0.C3025d;
import p179e.p184b.p185a.p187l0.C3026e;
import p179e.p184b.p185a.p187l0.C3027f;
import p179e.p184b.p185a.p188m0.C3114o;

/* renamed from: e.b.a.m0.m */
public final class C3100m implements C3132u {

    /* renamed from: a */
    private final Map<C3059m.C3069f<?, ?, ?>, C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>>> f7859a = C3113n.m11754a();

    /* renamed from: b */
    private final Map<C3114o, Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>> f7860b = new HashMap();

    /* renamed from: c */
    private final Map<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>> f7861c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayList<C3026e<?, ?>> f7862d = new ArrayList<>(mo9210c());

    /* renamed from: e */
    private final List<C3027f> f7863e;

    /* renamed from: f */
    private final List<C3026e<?, ?>> f7864f;

    /* renamed from: e.b.a.m0.m$a */
    static final class C3101a extends C3371l implements C3350b<Map.Entry<? extends C3114o, ? extends Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>>, Boolean> {

        /* renamed from: g */
        final /* synthetic */ C2999g0 f7865g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3101a(C2999g0 g0Var) {
            super(1);
            this.f7865g = g0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo9211a((Map.Entry<? extends C3114o, ? extends Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>>) (Map.Entry) obj));
        }

        /* renamed from: a */
        public final boolean mo9211a(Map.Entry<? extends C3114o, ? extends Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>> entry) {
            C3370k.m12227b(entry, "<name for destructuring parameter 0>");
            return ((C3114o) entry.getKey()).mo9223a(this.f7865g);
        }
    }

    /* renamed from: e.b.a.m0.m$b */
    static final class C3102b extends C3371l implements C3350b<C3267n<? extends C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>, ? extends C3026e<?, ?>>, C3267n<? extends C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>, ? extends C3026e<?, ?>>> {

        /* renamed from: g */
        final /* synthetic */ C3100m f7866g;

        /* renamed from: h */
        final /* synthetic */ C2999g0 f7867h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3102b(C3100m mVar, C2999g0 g0Var) {
            super(1);
            this.f7866g = mVar;
            this.f7867h = g0Var;
        }

        /* renamed from: a */
        public final C3267n<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>, C3026e<?, ?>> mo5146a(C3267n<C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>, ? extends C3026e<?, ?>> nVar) {
            Object obj;
            boolean z;
            C3370k.m12227b(nVar, "triple");
            C3114o.C3115a a = nVar.mo9946a();
            if (a.mo9223a(this.f7867h)) {
                return nVar;
            }
            Iterator it = this.f7866g.f7862d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C3026e eVar = (C3026e) obj;
                if (!eVar.mo9131a().mo9115a((C2999g0<?>) this.f7867h) || !a.mo9223a(eVar.mo9133b())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C3026e eVar2 = (C3026e) obj;
            if (eVar2 != null) {
                return C3267n.m11981a(nVar, (Object) null, (Object) null, eVar2, 3, (Object) null);
            }
            return null;
        }
    }

    /* renamed from: e.b.a.m0.m$c */
    static final class C3103c extends C3371l implements C3350b<C3267n<? extends C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>>, Boolean> {

        /* renamed from: g */
        final /* synthetic */ C2999g0 f7868g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3103c(C2999g0 g0Var) {
            super(1);
            this.f7868g = g0Var;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo9213a((C3267n<C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>>) (C3267n) obj));
        }

        /* renamed from: a */
        public final boolean mo9213a(C3267n<C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>> nVar) {
            C3370k.m12227b(nVar, "<name for destructuring parameter 0>");
            return nVar.mo9946a().mo9223a(this.f7868g);
        }
    }

    /* renamed from: e.b.a.m0.m$d */
    static final class C3104d extends C3371l implements C3350b<C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>>, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Object f7869g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3104d(Object obj) {
            super(1);
            this.f7869g = obj;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo9214a((C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>>) (C3267n) obj));
        }

        /* renamed from: a */
        public final boolean mo9214a(C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>> nVar) {
            C3370k.m12227b(nVar, "<name for destructuring parameter 0>");
            return C3370k.m12225a((Object) nVar.mo9946a(), this.f7869g);
        }
    }

    /* renamed from: e.b.a.m0.m$e */
    static final class C3105e extends C3371l implements C3350b<C3267n<? extends C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>, ? extends C3026e<?, ?>>, C3221d<? extends C3267n<? extends C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>>>> {

        /* renamed from: g */
        public static final C3105e f7870g = new C3105e();

        /* renamed from: e.b.a.m0.m$e$a */
        static final class C3106a extends C3371l implements C3350b<Map.Entry<? extends C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>>, C3267n<? extends C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>>> {

            /* renamed from: g */
            final /* synthetic */ C3026e f7871g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3106a(C3026e eVar) {
                super(1);
                this.f7871g = eVar;
            }

            /* renamed from: a */
            public final C3267n<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>, C3026e<?, ?>> mo5146a(Map.Entry<C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>> entry) {
                C3370k.m12227b(entry, "it");
                return new C3267n<>(entry.getKey(), entry.getValue(), this.f7871g);
            }
        }

        C3105e() {
            super(1);
        }

        /* renamed from: a */
        public final C3221d<C3267n<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>, C3026e<?, ?>>> mo5146a(C3267n<C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>, ? extends C3026e<?, ?>> nVar) {
            C3370k.m12227b(nVar, "<name for destructuring parameter 0>");
            return C3228j.m11887d(C3273a0.m11991a((Map) nVar.mo9948b()), new C3106a((C3026e) nVar.mo9949c()));
        }
    }

    /* renamed from: e.b.a.m0.m$f */
    static final class C3107f extends C3371l implements C3350b<Map.Entry<? extends C3114o, ? extends Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>>, C3221d<? extends C3267n>> {

        /* renamed from: g */
        public static final C3107f f7872g = new C3107f();

        /* renamed from: e.b.a.m0.m$f$a */
        static final class C3108a extends C3371l implements C3350b<Map.Entry<? extends C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>, C3267n> {

            /* renamed from: g */
            public static final C3108a f7873g = new C3108a();

            C3108a() {
                super(1);
            }

            /* renamed from: a */
            public final C3267n mo5146a(Map.Entry<C3114o.C3115a, ? extends Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>> entry) {
                C3370k.m12227b(entry, "it");
                return new C3267n(entry.getKey(), entry.getValue(), null);
            }
        }

        C3107f() {
            super(1);
        }

        /* renamed from: a */
        public final C3221d<C3267n> mo5146a(Map.Entry<? extends C3114o, ? extends Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>> entry) {
            C3370k.m12227b(entry, "<name for destructuring parameter 0>");
            return C3228j.m11887d(C3273a0.m11991a((Map) entry.getValue()), C3108a.f7873g);
        }
    }

    /* renamed from: e.b.a.m0.m$g */
    static final class C3109g extends C3371l implements C3350b<C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>>, C3261j<? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>>> {

        /* renamed from: g */
        public static final C3109g f7874g = new C3109g();

        C3109g() {
            super(1);
        }

        /* renamed from: a */
        public final C3261j<C3059m.C3069f<?, ?, ?>, C3026e<?, ?>> mo5146a(C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>> nVar) {
            C3370k.m12227b(nVar, "<name for destructuring parameter 0>");
            return C3268o.m11989a((C3059m.C3069f) nVar.mo9948b(), (C3026e) nVar.mo9949c());
        }
    }

    /* renamed from: e.b.a.m0.m$h */
    static final class C3110h extends C3371l implements C3350b<C3267n<? extends C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>>, C3221d<? extends C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>>>> {

        /* renamed from: g */
        public static final C3110h f7875g = new C3110h();

        /* renamed from: e.b.a.m0.m$h$a */
        static final class C3111a extends C3371l implements C3350b<Map.Entry<? extends Object, ? extends C3059m.C3069f<?, ?, ?>>, C3267n<? extends Object, ? extends C3059m.C3069f<?, ?, ?>, ? extends C3026e<?, ?>>> {

            /* renamed from: g */
            final /* synthetic */ C3026e f7876g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3111a(C3026e eVar) {
                super(1);
                this.f7876g = eVar;
            }

            /* renamed from: a */
            public final C3267n<Object, C3059m.C3069f<?, ?, ?>, C3026e<?, ?>> mo5146a(Map.Entry<? extends Object, ? extends C3059m.C3069f<?, ?, ?>> entry) {
                C3370k.m12227b(entry, "it");
                return new C3267n<>(entry.getKey(), entry.getValue(), this.f7876g);
            }
        }

        C3110h() {
            super(1);
        }

        /* renamed from: a */
        public final C3221d<C3267n<Object, C3059m.C3069f<?, ?, ?>, C3026e<?, ?>>> mo5146a(C3267n<C3114o.C3115a, ? extends Map<Object, C3059m.C3069f<?, ?, ?>>, ? extends C3026e<?, ?>> nVar) {
            C3370k.m12227b(nVar, "<name for destructuring parameter 0>");
            return C3228j.m11887d(C3273a0.m11991a((Map) nVar.mo9948b()), new C3111a((C3026e) nVar.mo9949c()));
        }
    }

    /* renamed from: e.b.a.m0.m$i */
    static final class C3112i extends C3371l implements C3350b<C3059m.C3069f<?, ?, ?>, String> {

        /* renamed from: g */
        public static final C3112i f7877g = new C3112i();

        C3112i() {
            super(1);
        }

        /* renamed from: a */
        public final String mo5146a(C3059m.C3069f<?, ?, ?> fVar) {
            C3370k.m12227b(fVar, "it");
            return fVar.mo9180g();
        }
    }

    public C3100m(Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3128r<?, ?, ?>>> map, List<? extends C3027f> list, List<? extends C3026e<?, ?>> list2) {
        ArrayList arrayList;
        boolean z;
        C3370k.m12227b(map, "map");
        C3370k.m12227b(list, "externalSources");
        C3370k.m12227b(list2, "registeredTranslators");
        this.f7863e = list;
        this.f7864f = list2;
        for (Map.Entry next : map.entrySet()) {
            C3059m.C3069f fVar = (C3059m.C3069f) next.getKey();
            List<C3128r> list3 = (List) next.getValue();
            ArrayList arrayList2 = new ArrayList(C3285k.m12075a(list3, 10));
            for (C3128r rVar : list3) {
                arrayList2.add(rVar instanceof C3129s ? (C3129s) rVar : new C3129s(rVar.mo9239a(), rVar.mo9240b(), this));
            }
            this.f7859a.put(fVar, new C3267n(fVar, arrayList2, null));
            Object aVar = ((C3128r) C3292r.m12099e(list3)).mo9239a().mo9139d() ? new C3114o.C3115a(fVar.mo9183i()) : new C3114o.C3116b(fVar.mo9183i());
            Map<C3114o, Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>> map2 = this.f7860b;
            Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>> map3 = map2.get(aVar);
            if (map3 == null) {
                map3 = new HashMap<>();
                map2.put(aVar, map3);
            }
            Map map4 = map3;
            C3114o.C3115a aVar2 = new C3114o.C3115a(fVar.mo9176d());
            Object obj = map4.get(aVar2);
            if (obj == null) {
                obj = new HashMap();
                map4.put(aVar2, obj);
            }
            Map map5 = (Map) obj;
            C3114o.C3115a aVar3 = new C3114o.C3115a(fVar.mo9172a());
            Object obj2 = map5.get(aVar3);
            if (obj2 == null) {
                obj2 = new HashMap();
                map5.put(aVar3, obj2);
            }
            ((Map) obj2).put(fVar.mo9181h(), fVar);
        }
        Map<C3059m.C3069f<?, ?, ?>, C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>>> map6 = this.f7859a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C3301z.m12116a(map6.size()));
        for (Map.Entry entry : map6.entrySet()) {
            linkedHashMap.put(entry.getKey(), (List) ((C3267n) entry.getValue()).mo9951e());
        }
        this.f7861c = new HashMap(linkedHashMap);
        do {
            arrayList = new ArrayList();
            Iterator<C3026e<?, ?>> it = this.f7862d.iterator();
            while (it.hasNext()) {
                C3026e next2 = it.next();
                Iterator<C3026e<?, ?>> it2 = this.f7862d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C3026e next3 = it2.next();
                        if (next3.mo9131a().mo9115a((C2999g0<?>) next2.mo9133b())) {
                            boolean z2 = true;
                            if (!C3370k.m12225a((Object) next2.mo9131a(), (Object) next3.mo9133b())) {
                                ArrayList<C3026e<?, ?>> arrayList3 = this.f7862d;
                                if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                                    Iterator<T> it3 = arrayList3.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        C3026e eVar = (C3026e) it3.next();
                                        if (!C3370k.m12225a((Object) eVar.mo9131a(), (Object) next2.mo9131a()) || !C3370k.m12225a((Object) eVar.mo9133b(), (Object) next3.mo9133b())) {
                                            z = false;
                                            continue;
                                        } else {
                                            z = true;
                                            continue;
                                        }
                                        if (z) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                }
                                if (!z2) {
                                    continue;
                                } else if (next2 == null) {
                                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.bindings.ContextTranslator<kotlin.Any, kotlin.Any>");
                                } else if (next3 != null) {
                                    arrayList.add(new C3025d(next2, next3));
                                } else {
                                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.bindings.ContextTranslator<kotlin.Any, kotlin.Any>");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            boolean unused = C3289o.m12079a(this.f7862d, arrayList);
        } while (!arrayList.isEmpty());
    }

    /* renamed from: a */
    private final IllegalStateException m11721a(C3059m.C3069f<?, ?, ?> fVar, C3059m.C3069f<?, ?, ?> fVar2) {
        return new IllegalStateException("Tree returned key " + fVar.mo9180g() + " that is not in cache when searching for " + fVar2.mo9180g() + ".\nKeys in cache:\n" + C3292r.m12086a(this.f7859a.keySet(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C3112i.f7877g, 30, (Object) null));
    }

    /* renamed from: b */
    private final List<C3261j<C3059m.C3069f<?, ?, ?>, C3026e<?, ?>>> m11723b(C2985a0 a0Var) {
        C3221d<Map.Entry<C3114o, Map<C3114o.C3115a, Map<C3114o.C3115a, Map<Object, C3059m.C3069f<?, ?, ?>>>>>> a = C3273a0.m11991a(this.f7860b);
        C2999g0<?> d = a0Var.mo9107d();
        if (d != null && (!C3370k.m12225a((Object) d, (Object) C3002h0.m11525a()))) {
            a = C3228j.m11881a(a, new C3101a(d));
        }
        C3221d<R> c = C3228j.m11885c(a, C3107f.f7872g);
        C2999g0<?> b = a0Var.mo9105b();
        if (b != null) {
            c = C3228j.m11889e(c, new C3102b(this, b));
        }
        C3221d<R> c2 = C3228j.m11885c(c, C3105e.f7870g);
        C2999g0<?> a2 = a0Var.mo9104a();
        if (a2 != null) {
            c2 = C3228j.m11881a(c2, new C3103c(a2));
        }
        C3221d<R> c3 = C3228j.m11885c(c2, C3110h.f7875g);
        Object c4 = a0Var.mo9106c();
        if (!C3370k.m12225a(c4, (Object) C2985a0.C2986a.f7749a)) {
            c3 = C3228j.m11881a(c3, new C3104d(c4));
        }
        return C3228j.m11886d(C3228j.m11887d(c3, C3109g.f7874g));
    }

    /* renamed from: a */
    public List<C3027f> mo9205a() {
        return this.f7863e;
    }

    /* renamed from: a */
    public List<C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>>> mo9206a(C2985a0 a0Var) {
        C3370k.m12227b(a0Var, "search");
        List<C3261j<C3059m.C3069f<?, ?, ?>, C3026e<?, ?>>> b = m11723b(a0Var);
        ArrayList arrayList = new ArrayList(C3285k.m12075a(b, 10));
        for (C3261j jVar : b) {
            C3059m.C3069f fVar = (C3059m.C3069f) jVar.mo9934a();
            C3026e eVar = (C3026e) jVar.mo9935b();
            C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>> nVar = this.f7859a.get(fVar);
            if (nVar != null) {
                arrayList.add(new C3267n(fVar, nVar.mo9951e(), eVar));
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <C, A, T> List<C3267n<C3059m.C3069f<Object, A, T>, C3129s<Object, A, T>, C3026e<C, Object>>> mo9207a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar, int i, boolean z) {
        C3267n nVar;
        C3267n a;
        C3267n nVar2;
        C3370k.m12227b(fVar, "key");
        if (!z) {
            C3267n nVar3 = this.f7859a.get(fVar);
            if (nVar3 != null) {
                C3059m.C3069f fVar2 = (C3059m.C3069f) nVar3.mo9946a();
                C3026e eVar = (C3026e) nVar3.mo9949c();
                C3129s sVar = (C3129s) C3292r.m12084a((List) nVar3.mo9948b(), i);
                if (sVar == null) {
                    return C3284j.m12068a();
                }
                if (fVar2 == null) {
                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                } else if (sVar != null) {
                    return C3283i.m12064a(new C3267n(fVar2, sVar, eVar));
                } else {
                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.KodeinDefinition<kotlin.Any, A, T>");
                }
            } else {
                if ((!C3370k.m12225a((Object) fVar.mo9176d(), (Object) C3002h0.m11525a())) && (nVar2 = this.f7859a.get(C3059m.C3069f.m11641a(fVar, C3002h0.m11525a(), (C2999g0) null, (C2999g0) null, (Object) null, 14, (Object) null))) != null) {
                    C3059m.C3069f fVar3 = (C3059m.C3069f) nVar2.mo9946a();
                    List list = (List) nVar2.mo9948b();
                    C3026e eVar2 = (C3026e) nVar2.mo9949c();
                    if ((eVar2 == null || !(!C3370k.m12225a((Object) eVar2.mo9131a(), (Object) fVar.mo9176d()))) && (eVar2 != null || !(!C3370k.m12225a((Object) fVar3.mo9176d(), (Object) fVar.mo9176d())))) {
                        this.f7859a.put(fVar, nVar2);
                        C3129s sVar2 = (C3129s) C3292r.m12084a(list, i);
                        if (sVar2 == null) {
                            return C3284j.m12068a();
                        }
                        if (fVar3 == null) {
                            throw new C3269p("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                        } else if (sVar2 != null) {
                            return C3283i.m12064a(new C3267n(fVar3, sVar2, eVar2));
                        } else {
                            throw new C3269p("null cannot be cast to non-null type org.kodein.di.KodeinDefinition<kotlin.Any, A, T>");
                        }
                    }
                }
                ArrayList<C3026e<?, ?>> arrayList = this.f7862d;
                ArrayList arrayList2 = new ArrayList();
                for (T next : arrayList) {
                    if (C3370k.m12225a((Object) ((C3026e) next).mo9131a(), (Object) fVar.mo9176d())) {
                        arrayList2.add(next);
                    }
                }
                ArrayList<C3026e<?, ?>> arrayList3 = this.f7862d;
                ArrayList arrayList4 = new ArrayList();
                for (T next2 : arrayList3) {
                    if (C3370k.m12225a((Object) ((C3026e) next2).mo9131a(), (Object) C3002h0.m11525a())) {
                        arrayList4.add(next2);
                    }
                }
                for (C3026e eVar3 : C3292r.m12095b(arrayList2, arrayList4)) {
                    C3267n nVar4 = this.f7859a.get(new C3059m.C3069f(eVar3.mo9133b(), fVar.mo9172a(), fVar.mo9183i(), fVar.mo9181h()));
                    if (nVar4 != null) {
                        C3267n nVar5 = nVar4.mo9953f() == null ? nVar4 : null;
                        if (nVar5 != null && nVar5.mo9953f() == null) {
                            this.f7859a.put(fVar, C3267n.m11981a(nVar5, (Object) null, (Object) null, eVar3, 3, (Object) null));
                            C3059m.C3069f fVar4 = (C3059m.C3069f) nVar5.mo9946a();
                            C3129s sVar3 = (C3129s) C3292r.m12084a((List) nVar5.mo9948b(), i);
                            if (sVar3 == null) {
                                return C3284j.m12068a();
                            }
                            if (fVar4 == null) {
                                throw new C3269p("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                            } else if (sVar3 != null) {
                                return C3283i.m12064a(new C3267n(fVar4, sVar3, eVar3));
                            } else {
                                throw new C3269p("null cannot be cast to non-null type org.kodein.di.KodeinDefinition<kotlin.Any, A, T>");
                            }
                        }
                    }
                }
            }
        }
        List<C3261j<C3059m.C3069f<?, ?, ?>, C3026e<?, ?>>> b = m11723b(new C2985a0(fVar.mo9176d(), fVar.mo9172a(), fVar.mo9183i(), fVar.mo9181h()));
        if (b.size() == 1) {
            C3261j jVar = (C3261j) C3292r.m12099e(b);
            C3059m.C3069f fVar5 = (C3059m.C3069f) jVar.mo9934a();
            C3026e eVar4 = (C3026e) jVar.mo9935b();
            Map<C3059m.C3069f<?, ?, ?>, C3267n<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>, C3026e<?, ?>>> map = this.f7859a;
            C3267n nVar6 = map.get(fVar5);
            if (nVar6 == null || (a = C3267n.m11981a(nVar6, (Object) null, (Object) null, eVar4, 3, (Object) null)) == null) {
                throw m11721a(fVar5, fVar);
            }
            map.put(fVar, a);
        }
        ArrayList arrayList5 = new ArrayList();
        for (C3261j jVar2 : b) {
            C3059m.C3069f fVar6 = (C3059m.C3069f) jVar2.mo9934a();
            C3026e eVar5 = (C3026e) jVar2.mo9935b();
            C3267n nVar7 = this.f7859a.get(fVar6);
            if (nVar7 != null) {
                C3129s sVar4 = (C3129s) C3292r.m12084a((List) nVar7.mo9948b(), i);
                if (sVar4 == null) {
                    nVar = null;
                } else if (fVar6 == null) {
                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.Kodein.Key<kotlin.Any, A, T>");
                } else if (sVar4 != null) {
                    nVar = new C3267n(fVar6, sVar4, eVar5);
                } else {
                    throw new C3269p("null cannot be cast to non-null type org.kodein.di.KodeinDefinition<kotlin.Any, A, T>");
                }
                if (nVar != null) {
                    arrayList5.add(nVar);
                }
            } else {
                throw m11721a(fVar6, fVar);
            }
        }
        return arrayList5;
    }

    /* renamed from: a */
    public <C, A, T> C3267n<C3059m.C3069f<Object, A, T>, List<C3129s<Object, A, T>>, C3026e<C, Object>> mo9208a(C3059m.C3069f<? super C, ? super A, ? extends T> fVar) {
        C3370k.m12227b(fVar, "key");
        return this.f7859a.get(fVar);
    }

    /* renamed from: b */
    public Map<C3059m.C3069f<?, ?, ?>, List<C3129s<?, ?, ?>>> mo9209b() {
        return this.f7861c;
    }

    /* renamed from: c */
    public List<C3026e<?, ?>> mo9210c() {
        return this.f7864f;
    }
}
