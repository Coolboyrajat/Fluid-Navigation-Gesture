package p054c.p055a.p067b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p069g.C1126a;
import p054c.p055a.p067b.p069g.C1127b;
import p054c.p055a.p067b.p070h.C1132c;
import p054c.p055a.p067b.p071i.C1139b;
import p054c.p055a.p067b.p072j.C1143a;
import p054c.p055a.p067b.p073k.C1146c;

/* renamed from: c.a.b.e */
public final class C1114e {

    /* renamed from: a */
    private Map<String, Integer> f3800a = new LinkedHashMap();

    /* renamed from: b */
    private Map<Integer, C1108a<?, ?>> f3801b = new LinkedHashMap();

    /* renamed from: c */
    private View f3802c;

    /* renamed from: d */
    private Map<String, C1143a> f3803d;

    /* renamed from: e */
    private C3351c<? super C1146c<? extends Object>, ? super Integer, Unit> f3804e;

    /* renamed from: f */
    private C3351c<? super C1146c<? extends Object>, ? super Integer, Unit> f3805f;

    /* renamed from: g */
    private C1116a<?> f3806g;

    /* renamed from: h */
    private C3349a<? extends C1132c> f3807h = C1115a.f3809g;

    /* renamed from: i */
    private final RecyclerView f3808i;

    /* renamed from: c.a.b.e$a */
    static final class C1115a extends C3371l implements C3349a<C1132c> {

        /* renamed from: g */
        public static final C1115a f3809g = new C1115a();

        C1115a() {
            super(0);
        }

        public final C1132c invoke() {
            return new C1132c();
        }
    }

    public C1114e(RecyclerView recyclerView) {
        C3370k.m12227b(recyclerView, "recyclerView");
        this.f3808i = recyclerView;
    }

    /* renamed from: a */
    public final C1114e mo5189a(RecyclerView.C0538o oVar) {
        C3370k.m12227b(oVar, "layoutManager");
        this.f3808i.setLayoutManager(oVar);
        return this;
    }

    /* renamed from: a */
    public final C1114e mo5190a(C1116a<?> aVar) {
        C3370k.m12227b(aVar, "dataSource");
        this.f3806g = aVar;
        return this;
    }

    /* renamed from: a */
    public final C1116a<?> mo5191a() {
        return this.f3806g;
    }

    /* renamed from: a */
    public final void mo5192a(String str, int i, C1108a<?, ?> aVar) {
        C3370k.m12227b(str, "className");
        C3370k.m12227b(aVar, "definition");
        this.f3800a.put(str, Integer.valueOf(i));
        this.f3801b.put(Integer.valueOf(i), aVar);
    }

    /* renamed from: b */
    public final C3351c<C1146c<? extends Object>, Integer, Unit> mo5193b() {
        return this.f3804e;
    }

    /* renamed from: c */
    public final C3351c<C1146c<? extends Object>, Integer, Unit> mo5194c() {
        return this.f3805f;
    }

    /* renamed from: d */
    public final Map<String, C1143a> mo5195d() {
        return this.f3803d;
    }

    /* renamed from: e */
    public final C1127b mo5196e() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (!this.f3800a.isEmpty()) {
            if (this.f3801b.size() == this.f3800a.size()) {
                Collection<C1108a<?, ?>> values = this.f3801b.values();
                boolean z5 = values instanceof Collection;
                if (!z5 || !values.isEmpty()) {
                    Iterator<T> it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1108a aVar = (C1108a) it.next();
                        if (!(aVar instanceof C1139b)) {
                            aVar = null;
                        }
                        C1139b bVar = (C1139b) aVar;
                        if ((bVar != null ? bVar.mo5237e() : null) != null) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    if (!z5 || !values.isEmpty()) {
                        Iterator<T> it2 = values.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C1108a aVar2 = (C1108a) it2.next();
                            if (!(aVar2 instanceof C1139b)) {
                                aVar2 = null;
                            }
                            C1139b bVar2 = (C1139b) aVar2;
                            if ((bVar2 != null ? bVar2.mo5237e() : null) != null) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (!z2) {
                                z4 = false;
                                break;
                            }
                        }
                    }
                    if (!z4) {
                        throw new IllegalStateException("If you specify that one item type has stable IDs, all item types must.");
                    }
                }
                C1116a<?> aVar3 = this.f3806g;
                if (aVar3 != null) {
                    C1126a aVar4 = new C1126a(this.f3802c, (C1132c) this.f3807h.invoke(), this.f3800a, this.f3801b, aVar3);
                    aVar4.mo5216a().mo3112a(z);
                    aVar3.mo5200a((C1127b) aVar4);
                    return aVar4;
                }
                throw new IllegalStateException("Must set a data source.".toString());
            }
            throw new IllegalStateException("Something is very wrong - binding maps don't have matching sizes. Make sure you aren't using the same layout for multiple item classes.".toString());
        }
        throw new IllegalStateException("No bindings defined.".toString());
    }
}
