package p179e.p184b.p185a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.C3059m;
import p179e.p184b.p185a.p187l0.C3029g;

/* renamed from: e.b.a.c */
public final class C2989c {

    /* renamed from: e.b.a.c$a */
    static final class C2990a extends C3371l implements C3352d<StringBuilder, Integer, List<? extends Map.Entry<? extends C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C3350b f7752g;

        /* renamed from: h */
        final /* synthetic */ C3350b f7753h;

        /* renamed from: i */
        final /* synthetic */ boolean f7754i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2990a(C3350b bVar, C3350b bVar2, boolean z) {
            super(3);
            this.f7752g = bVar;
            this.f7753h = bVar2;
            this.f7754i = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo9110a((StringBuilder) obj, ((Number) obj2).intValue(), (List<? extends Map.Entry<? extends C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>>) (List) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo9110a(StringBuilder sb, int i, List<? extends Map.Entry<? extends C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>> list) {
            C3370k.m12227b(sb, "$this$appendBindings");
            C3370k.m12227b(list, "entries");
            for (Map.Entry entry : list) {
                String str = (String) this.f7752g.mo5146a(entry.getKey());
                sb.append(C3250n.m11926a(" ", i) + str + " with " + ((String) this.f7753h.mo5146a(((C3129s) C3292r.m12099e((List) entry.getValue())).mo9239a())));
                if (this.f7754i) {
                    int length = str.length() - 4;
                    for (C3129s a : ((List) entry.getValue()).subList(1, ((List) entry.getValue()).size())) {
                        sb.append(C3250n.m11926a(" ", length) + "overrides " + ((String) this.f7753h.mo5146a(a.mo9239a())));
                    }
                }
                sb.append("\n");
            }
        }
    }

    /* renamed from: a */
    public static final String m11480a(Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>> map, boolean z, int i) {
        C3370k.m12227b(map, "$this$description");
        return m11482a(map, z, i, (C3350b<? super C3059m.C3069f<?, ?, ?>, String>) C2984a.f7744i, (C3350b<? super C3029g<?, ?, ?>, String>) C2987b.f7750i);
    }

    /* renamed from: a */
    public static /* synthetic */ String m11481a(Map map, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 8;
        }
        return m11480a(map, z, i);
    }

    /* renamed from: a */
    private static final String m11482a(Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>> map, boolean z, int i, C3350b<? super C3059m.C3069f<?, ?, ?>, String> bVar, C3350b<? super C3029g<?, ?, ?>, String> bVar2) {
        C2990a aVar = new C2990a(bVar, bVar2, z);
        Set<Map.Entry<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : entrySet) {
            String b = ((C3129s) C3292r.m12099e((List) ((Map.Entry) next).getValue())).mo9240b();
            Object obj = linkedHashMap.get(b);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b, obj);
            }
            ((List) obj).add(next);
        }
        List<String> e = C3292r.m12100e(C3292r.m12097c(linkedHashMap.keySet()));
        StringBuilder sb = new StringBuilder();
        List list = (List) linkedHashMap.get((Object) null);
        if (list != null) {
            aVar.mo9110a(sb, i, (List<? extends Map.Entry<? extends C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>>) list);
        }
        for (String str : e) {
            sb.append(C3250n.m11926a(" ", i) + "module " + str + " {\n");
            int i2 = i + 4;
            Object obj2 = linkedHashMap.get(str);
            if (obj2 != null) {
                aVar.mo9110a(sb, i2, (List<? extends Map.Entry<? extends C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>>>) (List) obj2);
                sb.append(C3250n.m11926a(" ", i) + "}\n");
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final String m11483b(Map<C3059m.C3069f<?, ?, ?>, ? extends List<? extends C3129s<?, ?, ?>>> map, boolean z, int i) {
        C3370k.m12227b(map, "$this$fullDescription");
        return m11482a(map, z, i, (C3350b<? super C3059m.C3069f<?, ?, ?>, String>) C2992d.f7758i, (C3350b<? super C3029g<?, ?, ?>, String>) C2994e.f7759i);
    }

    /* renamed from: b */
    public static /* synthetic */ String m11484b(Map map, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 8;
        }
        return m11483b(map, z, i);
    }
}
