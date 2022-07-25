package p054c.p055a.p067b.p071i;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0524d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p073k.C1146c;

/* renamed from: c.a.b.i.b */
public final class C1139b<IT, VH extends RecyclerView.C0524d0> implements C1108a<IT, VH> {

    /* renamed from: a */
    private C3351c<? super C1146c<? extends Object>, ? super Integer, Unit> f3840a;

    /* renamed from: b */
    private C3351c<? super C1146c<? extends Object>, ? super Integer, Unit> f3841b;

    /* renamed from: c */
    private C3350b<? super View, ?> f3842c;

    /* renamed from: d */
    private C3352d<?, ? super Integer, ?, Unit> f3843d;

    /* renamed from: e */
    private C3350b<Object, ? extends Number> f3844e;

    /* renamed from: f */
    private C3350b<Object, Unit> f3845f;

    /* renamed from: g */
    private List<C1140a<?, ?, ?>> f3846g = new ArrayList();

    /* renamed from: h */
    private final View.OnClickListener f3847h = new C1141b(this);

    /* renamed from: i */
    private final View.OnLongClickListener f3848i = new C1142c(this);

    /* renamed from: j */
    private final C1114e f3849j;

    /* renamed from: k */
    private final String f3850k;

    /* renamed from: c.a.b.i.b$a */
    public static final class C1140a<IT, VH extends RecyclerView.C0524d0, VT extends View> {

        /* renamed from: a */
        private final Class<VH> f3851a;

        /* renamed from: b */
        private final C3350b<VH, VT> f3852b;

        /* renamed from: c */
        private final C3352d<C1146c<? extends IT>, Integer, VT, Unit> f3853c;

        /* renamed from: a */
        public final C3352d<C1146c<? extends IT>, Integer, VT, Unit> mo5245a() {
            return this.f3853c;
        }

        /* renamed from: b */
        public final C3350b<VH, VT> mo5246b() {
            return this.f3852b;
        }

        /* renamed from: c */
        public final Class<VH> mo5247c() {
            return this.f3851a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1140a)) {
                return false;
            }
            C1140a aVar = (C1140a) obj;
            return C3370k.m12225a((Object) this.f3851a, (Object) aVar.f3851a) && C3370k.m12225a((Object) this.f3852b, (Object) aVar.f3852b) && C3370k.m12225a((Object) this.f3853c, (Object) aVar.f3853c);
        }

        public int hashCode() {
            Class<VH> cls = this.f3851a;
            int i = 0;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            C3350b<VH, VT> bVar = this.f3852b;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
            C3352d<C1146c<? extends IT>, Integer, VT, Unit> dVar = this.f3853c;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ChildClickData(viewHolderType=" + this.f3851a + ", child=" + this.f3852b + ", callback=" + this.f3853c + ")";
        }
    }

    /* renamed from: c.a.b.i.b$b */
    static final class C1141b implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C1139b f3854f;

        C1141b(C1139b bVar) {
            this.f3854f = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            kotlin.p204w.C3346a.m12185a(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                c.a.b.h.a r0 = p054c.p055a.p067b.p070h.C1128a.f3826c
                java.lang.String r1 = "itemView"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r5, (java.lang.String) r1)
                boolean r0 = r0.mo5223a(r5)
                if (r0 == 0) goto L_0x004f
                androidx.recyclerview.widget.RecyclerView$d0 r5 = p054c.p055a.p067b.p071i.C1137a.m5625a((android.view.View) r5)
                int r5 = r5.mo3061f()
                c.a.b.i.b r0 = r4.f3854f
                c.a.b.k.c r0 = p054c.p055a.p067b.p071i.C1137a.m5628a(r0, (int) r5)
                r1 = 0
                c.a.b.i.b r2 = r4.f3854f     // Catch:{ all -> 0x0048 }
                kotlin.x.c.c r2 = r2.mo5239g()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x002e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r2 = r2.mo6125a(r0, r3)     // Catch:{ all -> 0x0048 }
                kotlin.Unit r2 = (kotlin.Unit) r2     // Catch:{ all -> 0x0048 }
            L_0x002e:
                c.a.b.i.b r2 = r4.f3854f     // Catch:{ all -> 0x0048 }
                c.a.b.e r2 = r2.mo5242j()     // Catch:{ all -> 0x0048 }
                kotlin.x.c.c r2 = r2.mo5193b()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x0044
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r5 = r2.mo6125a(r0, r5)     // Catch:{ all -> 0x0048 }
                kotlin.Unit r5 = (kotlin.Unit) r5     // Catch:{ all -> 0x0048 }
            L_0x0044:
                kotlin.p204w.C3346a.m12185a(r0, r1)
                goto L_0x004f
            L_0x0048:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                kotlin.p204w.C3346a.m12185a(r0, r5)
                throw r1
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p067b.p071i.C1139b.C1141b.onClick(android.view.View):void");
        }
    }

    /* renamed from: c.a.b.i.b$c */
    static final class C1142c implements View.OnLongClickListener {

        /* renamed from: f */
        final /* synthetic */ C1139b f3855f;

        C1142c(C1139b bVar) {
            this.f3855f = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            kotlin.p204w.C3346a.m12185a(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r5) {
            /*
                r4 = this;
                c.a.b.h.a r0 = p054c.p055a.p067b.p070h.C1128a.f3826c
                java.lang.String r1 = "itemView"
                kotlin.p205x.p207d.C3370k.m12223a((java.lang.Object) r5, (java.lang.String) r1)
                boolean r0 = r0.mo5223a(r5)
                if (r0 == 0) goto L_0x004f
                androidx.recyclerview.widget.RecyclerView$d0 r5 = p054c.p055a.p067b.p071i.C1137a.m5625a((android.view.View) r5)
                int r5 = r5.mo3061f()
                c.a.b.i.b r0 = r4.f3855f
                c.a.b.k.c r0 = p054c.p055a.p067b.p071i.C1137a.m5628a(r0, (int) r5)
                r1 = 0
                c.a.b.i.b r2 = r4.f3855f     // Catch:{ all -> 0x0048 }
                kotlin.x.c.c r2 = r2.mo5240h()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x002e
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r2 = r2.mo6125a(r0, r3)     // Catch:{ all -> 0x0048 }
                kotlin.Unit r2 = (kotlin.Unit) r2     // Catch:{ all -> 0x0048 }
            L_0x002e:
                c.a.b.i.b r2 = r4.f3855f     // Catch:{ all -> 0x0048 }
                c.a.b.e r2 = r2.mo5242j()     // Catch:{ all -> 0x0048 }
                kotlin.x.c.c r2 = r2.mo5194c()     // Catch:{ all -> 0x0048 }
                if (r2 == 0) goto L_0x0044
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r5 = r2.mo6125a(r0, r5)     // Catch:{ all -> 0x0048 }
                kotlin.Unit r5 = (kotlin.Unit) r5     // Catch:{ all -> 0x0048 }
            L_0x0044:
                kotlin.p204w.C3346a.m12185a(r0, r1)
                goto L_0x004f
            L_0x0048:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                kotlin.p204w.C3346a.m12185a(r0, r5)
                throw r1
            L_0x004f:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p067b.p071i.C1139b.C1142c.onLongClick(android.view.View):boolean");
        }
    }

    public C1139b(C1114e eVar, String str) {
        C3370k.m12227b(eVar, "setup");
        C3370k.m12227b(str, "itemClassName");
        this.f3849j = eVar;
        this.f3850k = str;
    }

    /* renamed from: a */
    public C1108a<IT, VH> mo5186a(C3350b<? super View, ? extends VH> bVar, C3352d<? super VH, ? super Integer, ? super IT, Unit> dVar) {
        C3370k.m12227b(bVar, "viewHolderCreator");
        C3370k.m12227b(dVar, "block");
        this.f3842c = bVar;
        this.f3843d = dVar;
        return this;
    }

    /* renamed from: a */
    public final C3352d<?, Integer, ?, Unit> mo5233a() {
        return this.f3843d;
    }

    /* renamed from: b */
    public final List<C1140a<?, ?, ?>> mo5234b() {
        return this.f3846g;
    }

    /* renamed from: c */
    public final C3350b<View, ?> mo5235c() {
        return this.f3842c;
    }

    /* renamed from: d */
    public final C1116a<?> mo5236d() {
        return this.f3849j.mo5191a();
    }

    /* renamed from: e */
    public final C3350b<Object, Number> mo5237e() {
        return this.f3844e;
    }

    /* renamed from: f */
    public final String mo5238f() {
        return this.f3850k;
    }

    /* renamed from: g */
    public final C3351c<C1146c<? extends Object>, Integer, Unit> mo5239g() {
        return this.f3840a;
    }

    /* renamed from: h */
    public final C3351c<C1146c<? extends Object>, Integer, Unit> mo5240h() {
        return this.f3841b;
    }

    /* renamed from: i */
    public final C3350b<Object, Unit> mo5241i() {
        return this.f3845f;
    }

    /* renamed from: j */
    public final C1114e mo5242j() {
        return this.f3849j;
    }

    /* renamed from: k */
    public final View.OnClickListener mo5243k() {
        return this.f3847h;
    }

    /* renamed from: l */
    public final View.OnLongClickListener mo5244l() {
        return this.f3848i;
    }
}
