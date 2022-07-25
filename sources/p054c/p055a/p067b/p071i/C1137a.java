package p054c.p055a.p067b.p071i;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3359b0;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1110c;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p068f.C1125d;
import p054c.p055a.p067b.p070h.C1130b;
import p054c.p055a.p067b.p070h.C1134e;
import p054c.p055a.p067b.p071i.C1139b;
import p054c.p055a.p067b.p073k.C1144a;
import p054c.p055a.p067b.p073k.C1145b;
import p054c.p055a.p067b.p073k.C1146c;

/* renamed from: c.a.b.i.a */
public final class C1137a {

    /* renamed from: c.a.b.i.a$a */
    static final class C1138a extends C3371l implements C3350b<View, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1108a f3837g;

        /* renamed from: h */
        final /* synthetic */ RecyclerView.C0524d0 f3838h;

        /* renamed from: i */
        final /* synthetic */ C3352d f3839i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1138a(C1108a aVar, RecyclerView.C0524d0 d0Var, C3352d dVar) {
            super(1);
            this.f3837g = aVar;
            this.f3838h = d0Var;
            this.f3839i = dVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo5232a((View) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            kotlin.p204w.C3346a.m12185a(r1, r4);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5232a(android.view.View r4) {
            /*
                r3 = this;
                java.lang.String r0 = "child"
                kotlin.p205x.p207d.C3370k.m12227b(r4, r0)
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r3.f3838h
                android.view.View r0 = r0.f2168f
                java.lang.String r1 = "viewHolder.itemView"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r0, (java.lang.String) r1)
                androidx.recyclerview.widget.RecyclerView$d0 r0 = p054c.p055a.p067b.p071i.C1137a.m5625a((android.view.View) r0)
                int r0 = r0.mo3061f()
                c.a.b.a r1 = r3.f3837g
                c.a.b.k.c r1 = p054c.p055a.p067b.p071i.C1137a.m5628a(r1, (int) r0)
                kotlin.x.c.d r2 = r3.f3839i     // Catch:{ all -> 0x002c }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x002c }
                r2.mo6842a(r1, r0, r4)     // Catch:{ all -> 0x002c }
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002c }
                r4 = 0
                kotlin.p204w.C3346a.m12185a(r1, r4)
                return
            L_0x002c:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x002e }
            L_0x002e:
                r0 = move-exception
                kotlin.p204w.C3346a.m12185a(r1, r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p067b.p071i.C1137a.C1138a.mo5232a(android.view.View):void");
        }
    }

    /* renamed from: a */
    public static final RecyclerView.C0524d0 m5625a(View view) {
        C3370k.m12227b(view, "$this$viewHolder");
        Object tag = view.getTag(C1110c.rec_view_item_view_holder);
        if (!(tag instanceof RecyclerView.C0524d0)) {
            tag = null;
        }
        RecyclerView.C0524d0 d0Var = (RecyclerView.C0524d0) tag;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Didn't find view holder in itemView tag.".toString());
    }

    /* renamed from: a */
    public static final RecyclerView.C0524d0 m5626a(C1108a<?, ?> aVar, View view) {
        C3370k.m12227b(aVar, "$this$createViewHolder");
        C3370k.m12227b(view, "itemView");
        C1139b<?, ?> a = m5627a(aVar);
        C1114e j = a.mo5242j();
        if (!(a.mo5239g() == null && j.mo5193b() == null)) {
            view.setOnClickListener(a.mo5243k());
            C1134e.m5623b(view);
        }
        if (!(a.mo5240h() == null && j.mo5194c() == null)) {
            view.setOnLongClickListener(a.mo5244l());
            C1134e.m5623b(view);
        }
        C3350b<View, ?> c = a.mo5235c();
        if (!C3359b0.m12202b(c, 1)) {
            c = null;
        }
        if (c != null) {
            RecyclerView.C0524d0 d0Var = (RecyclerView.C0524d0) c.mo5146a(view);
            m5631b(aVar, d0Var);
            return d0Var;
        }
        throw new IllegalStateException(("View holder creator not provided for item definition " + a.mo5238f()).toString());
    }

    /* renamed from: a */
    public static final C1139b<?, ?> m5627a(C1108a<?, ?> aVar) {
        C3370k.m12227b(aVar, "$this$realDefinition");
        C1139b<?, ?> bVar = (C1139b) (!(aVar instanceof C1139b) ? null : aVar);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException((aVar + " is not a RealItemDefinition").toString());
    }

    /* renamed from: a */
    public static final <IT, VH extends RecyclerView.C0524d0> C1146c<IT> m5628a(C1108a<? extends IT, VH> aVar, int i) {
        C3370k.m12227b(aVar, "$this$getSelectionStateProvider");
        boolean z = aVar instanceof C1139b;
        if (z) {
            C1139b bVar = (C1139b) aVar;
            C1116a<?> d = bVar.mo5236d();
            if (!(d instanceof C1125d)) {
                d = null;
            }
            C1125d dVar = (C1125d) d;
            if (dVar != null) {
                return new C1145b(dVar, i);
            }
            if (z) {
                C1116a<?> d2 = bVar.mo5236d();
                if (!(d2 instanceof C1116a)) {
                    d2 = null;
                }
                return new C1144a(d2, i);
            }
            throw new IllegalStateException((aVar + " is not a RealItemDefinition").toString());
        }
        throw new IllegalStateException((aVar + " is not a RealItemDefinition").toString());
    }

    /* renamed from: a */
    public static final void m5629a(C1108a<?, ?> aVar, RecyclerView.C0524d0 d0Var) {
        C3370k.m12227b(aVar, "$this$recycleViewHolder");
        C3370k.m12227b(d0Var, "viewHolder");
        C3350b<Object, Unit> i = m5627a(aVar).mo5241i();
        if (i != null) {
            Unit a = i.mo5146a(d0Var);
        }
    }

    /* renamed from: a */
    public static final void m5630a(C1108a<?, ?> aVar, RecyclerView.C0524d0 d0Var, Object obj, int i) {
        C3370k.m12227b(aVar, "$this$bindViewHolder");
        C3370k.m12227b(d0Var, "viewHolder");
        C3370k.m12227b(obj, "item");
        C1139b<?, ?> a = m5627a(aVar);
        View view = d0Var.f2168f;
        view.setTag(C1110c.rec_view_item_view_holder, d0Var);
        view.setTag(C1110c.rec_view_item_selectable_data_source, a.mo5236d());
        C3352d<?, Integer, ?, Unit> a2 = a.mo5233a();
        if (!C3359b0.m12202b(a2, 3)) {
            a2 = null;
        }
        if (a2 != null) {
            Unit a3 = a2.mo6842a(d0Var, Integer.valueOf(i), obj);
        }
        d0Var.f2168f.setTag(C1110c.rec_view_item_selectable_data_source, (Object) null);
    }

    /* renamed from: b */
    private static final void m5631b(C1108a<?, ?> aVar, RecyclerView.C0524d0 d0Var) {
        C1139b<?, ?> a = m5627a(aVar);
        if (!a.mo5234b().isEmpty()) {
            List<C1139b.C1140a<?, ?, ?>> b = a.mo5234b();
            ArrayList<C1139b.C1140a> arrayList = new ArrayList<>();
            for (T next : b) {
                if (C3370k.m12225a((Object) ((C1139b.C1140a) next).mo5247c(), (Object) d0Var.getClass())) {
                    arrayList.add(next);
                }
            }
            for (C1139b.C1140a aVar2 : arrayList) {
                C3350b b2 = aVar2.mo5246b();
                if (b2 != null) {
                    C3359b0.m12198a((Object) b2, 1);
                    C3350b bVar = b2;
                    C3352d a2 = aVar2.mo5245a();
                    if (a2 != null) {
                        C3359b0.m12198a((Object) a2, 3);
                        C1130b.m5604a((View) bVar.mo5146a(d0Var), new C1138a(aVar, d0Var, a2));
                    } else {
                        throw new C3269p("null cannot be cast to non-null type com.afollestad.recyclical.viewholder.SelectionStateProvider<kotlin.Any>.(kotlin.Int, kotlin.Any) -> kotlin.Unit");
                    }
                } else {
                    throw new C3269p("null cannot be cast to non-null type (com.afollestad.recyclical.ViewHolder /* = androidx.recyclerview.widget.RecyclerView.ViewHolder */) -> android.view.View");
                }
            }
        }
    }
}
