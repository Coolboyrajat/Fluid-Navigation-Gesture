package p054c.p055a.p067b;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p069g.C1126a;
import p054c.p055a.p067b.p069g.C1127b;
import p054c.p055a.p067b.p070h.C1134e;
import p054c.p055a.p067b.p072j.C1143a;

/* renamed from: c.a.b.d */
public final class C1111d {

    /* renamed from: c.a.b.d$a */
    static final class C1112a extends C3371l implements C3350b<View, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1127b f3798g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1112a(C1127b bVar) {
            super(1);
            this.f3798g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5187a((View) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5187a(View view) {
            C3370k.m12227b(view, "$receiver");
            ((C1126a) this.f3798g).mo5220b();
        }
    }

    /* renamed from: c.a.b.d$b */
    static final class C1113b extends C3371l implements C3350b<View, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1127b f3799g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1113b(C1127b bVar) {
            super(1);
            this.f3799g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5188a((View) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo5188a(View view) {
            C3370k.m12227b(view, "$receiver");
            ((C1126a) this.f3799g).mo5221c();
        }
    }

    /* renamed from: a */
    public static final C1127b m5549a(RecyclerView recyclerView, C3350b<? super C1114e, Unit> bVar) {
        Collection<C1143a> values;
        C3370k.m12227b(recyclerView, "$this$setup");
        C3370k.m12227b(bVar, "block");
        C1114e eVar = new C1114e(recyclerView);
        bVar.mo5146a(eVar);
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        C1127b e = eVar.mo5196e();
        recyclerView.setAdapter(e.mo5216a());
        boolean z = e instanceof C1126a;
        if (z) {
            C1134e.m5621a(recyclerView, new C1112a(e));
            C1134e.m5624b(recyclerView, new C1113b(e));
        }
        Map<String, C1143a> d = eVar.mo5195d();
        if (!(d == null || (values = d.values()) == null)) {
            for (C1143a aVar : values) {
                if (z) {
                    C1126a aVar2 = (C1126a) e;
                    C1116a<?> d2 = aVar2.mo5222d();
                    if (!(d2 instanceof C1116a)) {
                        d2 = null;
                    }
                    if (d2 != null) {
                        aVar.mo5253a(recyclerView, d2);
                    } else {
                        throw new IllegalStateException((aVar2.mo5222d() + " is not a " + C1116a.class.getName()).toString());
                    }
                } else {
                    throw new IllegalStateException("Handle is not a real implementation.".toString());
                }
            }
        }
        return e;
    }
}
