package p054c.p055a.p067b.p068f;

import androidx.recyclerview.widget.C0586f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p069g.C1127b;
import p054c.p055a.p067b.p070h.C1133d;

/* renamed from: c.a.b.f.c */
public class C1119c<IT> implements C1116a<IT> {

    /* renamed from: a */
    private List<IT> f3810a;

    /* renamed from: b */
    private C1127b f3811b;

    /* renamed from: c.a.b.f.c$a */
    static final class C1120a extends C3371l implements C3350b<RecyclerView.C0527g<?>, Unit> {

        /* renamed from: g */
        final /* synthetic */ int f3812g;

        /* renamed from: h */
        final /* synthetic */ Object[] f3813h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1120a(int i, Object[] objArr) {
            super(1);
            this.f3812g = i;
            this.f3813h = objArr;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5210a((RecyclerView.C0527g<?>) (RecyclerView.C0527g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5210a(RecyclerView.C0527g<?> gVar) {
            C3370k.m12227b(gVar, "$receiver");
            gVar.mo3117b(this.f3812g, this.f3813h.length);
        }
    }

    /* renamed from: c.a.b.f.c$b */
    static final class C1121b extends C3371l implements C3350b<RecyclerView.C0527g<?>, Unit> {

        /* renamed from: g */
        final /* synthetic */ int f3814g;

        /* renamed from: h */
        final /* synthetic */ Collection f3815h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1121b(int i, Collection collection) {
            super(1);
            this.f3814g = i;
            this.f3815h = collection;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5211a((RecyclerView.C0527g<?>) (RecyclerView.C0527g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5211a(RecyclerView.C0527g<?> gVar) {
            C3370k.m12227b(gVar, "$receiver");
            gVar.mo3117b(this.f3814g, this.f3815h.size());
        }
    }

    /* renamed from: c.a.b.f.c$c */
    static final class C1122c extends C3371l implements C3350b<RecyclerView.C0527g<?>, Unit> {

        /* renamed from: g */
        public static final C1122c f3816g = new C1122c();

        C1122c() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5212a((RecyclerView.C0527g<?>) (RecyclerView.C0527g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5212a(RecyclerView.C0527g<?> gVar) {
            C3370k.m12227b(gVar, "$receiver");
            gVar.mo3128e();
        }
    }

    /* renamed from: c.a.b.f.c$d */
    static final class C1123d extends C3371l implements C3350b<RecyclerView.C0527g<?>, Unit> {

        /* renamed from: g */
        final /* synthetic */ int f3817g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1123d(int i) {
            super(1);
            this.f3817g = i;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5213a((RecyclerView.C0527g<?>) (RecyclerView.C0527g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5213a(RecyclerView.C0527g<?> gVar) {
            C3370k.m12227b(gVar, "$receiver");
            gVar.mo3122c(this.f3817g);
        }
    }

    /* renamed from: c.a.b.f.c$e */
    static final class C1124e extends C3371l implements C3350b<RecyclerView.C0527g<?>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C0586f.C0589c f3818g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1124e(C0586f.C0589c cVar) {
            super(1);
            this.f3818g = cVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5214a((RecyclerView.C0527g<?>) (RecyclerView.C0527g) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5214a(RecyclerView.C0527g<?> gVar) {
            C3370k.m12227b(gVar, "$receiver");
            this.f3818g.mo3522a((RecyclerView.C0527g) gVar);
        }
    }

    public C1119c(List<? extends IT> list) {
        C3370k.m12227b(list, "initialData");
        this.f3810a = C3292r.m12094b(list);
    }

    /* renamed from: a */
    public int mo5197a(C3350b<? super IT, Boolean> bVar) {
        C3370k.m12227b(bVar, "predicate");
        int i = 0;
        for (IT a : this.f3810a) {
            if (bVar.mo5146a(a).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo5198a() {
        this.f3811b = null;
    }

    /* renamed from: a */
    public void mo5199a(int i) {
        C1127b bVar = this.f3811b;
        if (bVar != null) {
            bVar.mo5218a((C3350b<? super RecyclerView.C0527g<?>, Unit>) new C1123d(i));
        }
    }

    /* renamed from: a */
    public void mo5200a(C1127b bVar) {
        C3370k.m12227b(bVar, "handle");
        if (this.f3811b == null) {
            this.f3811b = bVar;
            mo5205c();
        }
    }

    /* renamed from: a */
    public void mo5201a(List<? extends IT> list, C3351c<? super IT, ? super IT, Boolean> cVar, C3351c<? super IT, ? super IT, Boolean> cVar2) {
        C3370k.m12227b(list, "newItems");
        if (!(!this.f3810a.isEmpty()) || cVar == null || cVar2 == null) {
            this.f3810a = C3292r.m12094b(list);
            mo5205c();
            return;
        }
        List<IT> list2 = this.f3810a;
        this.f3810a = C3292r.m12094b(list);
        C0586f.C0589c a = C0586f.m3300a(new C1133d(list2, this.f3810a, cVar, cVar2));
        C3370k.m12223a((Object) a, "DiffUtil.calculateDiff(diffCallback)");
        C1127b bVar = this.f3811b;
        if (bVar != null) {
            bVar.mo5218a((C3350b<? super RecyclerView.C0527g<?>, Unit>) new C1124e(a));
        }
    }

    /* renamed from: a */
    public void mo5202a(IT... itArr) {
        C3370k.m12227b(itArr, "newItems");
        int size = this.f3810a.size();
        boolean unused = C3289o.m12080a(this.f3810a, (T[]) itArr);
        C1127b bVar = this.f3811b;
        if (bVar != null) {
            bVar.mo5218a((C3350b<? super RecyclerView.C0527g<?>, Unit>) new C1120a(size, itArr));
        }
    }

    public void addAll(Collection<? extends IT> collection) {
        C3370k.m12227b(collection, "newItems");
        int size = this.f3810a.size();
        this.f3810a.addAll(collection);
        C1127b bVar = this.f3811b;
        if (bVar != null) {
            bVar.mo5218a((C3350b<? super RecyclerView.C0527g<?>, Unit>) new C1121b(size, collection));
        }
    }

    /* renamed from: b */
    public List<IT> mo5204b() {
        return C3292r.m12104g(this.f3810a);
    }

    /* renamed from: c */
    public void mo5205c() {
        C1127b bVar = this.f3811b;
        if (bVar != null) {
            bVar.mo5218a((C3350b<? super RecyclerView.C0527g<?>, Unit>) C1122c.f3816g);
        }
    }

    public void clear() {
        this.f3810a.clear();
        mo5205c();
    }

    public IT get(int i) {
        return this.f3810a.get(i);
    }

    public boolean isEmpty() {
        return this.f3810a.isEmpty();
    }

    public int size() {
        return this.f3810a.size();
    }
}
