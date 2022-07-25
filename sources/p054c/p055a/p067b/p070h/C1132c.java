package p054c.p055a.p067b.p070h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p069g.C1126a;
import p054c.p055a.p067b.p069g.C1127b;
import p054c.p055a.p067b.p071i.C1137a;

/* renamed from: c.a.b.h.c */
public class C1132c extends RecyclerView.C0527g<RecyclerView.C0524d0> {

    /* renamed from: c */
    private C1127b f3829c;

    /* renamed from: d */
    private C1116a<?> f3830d;

    /* renamed from: a */
    private final int m5605a(Object obj) {
        String name = obj.getClass().getName();
        C3370k.m12223a((Object) name, "this::class.java.name");
        C1127b bVar = this.f3829c;
        if (bVar != null) {
            return bVar.mo5215a(name);
        }
        throw new IllegalStateException("Not attached!".toString());
    }

    /* renamed from: d */
    private final C1108a<?, ?> m5606d(int i) {
        C1108a<?, ?> a;
        C1127b bVar = this.f3829c;
        if (bVar != null && (a = bVar.mo5217a(i)) != null) {
            return a;
        }
        throw new IllegalStateException("Not attached!".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r0 = r1.mo5146a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo3103a(int r5) {
        /*
            r4 = this;
            c.a.b.f.a<?> r0 = r4.f3830d
            r1 = 0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r0.get(r5)
            int r2 = r4.m5605a((java.lang.Object) r0)
            c.a.b.a r2 = r4.m5606d((int) r2)
            boolean r3 = r2 instanceof p054c.p055a.p067b.p071i.C1139b
            if (r3 != 0) goto L_0x0016
            r2 = r1
        L_0x0016:
            c.a.b.i.b r2 = (p054c.p055a.p067b.p071i.C1139b) r2
            if (r2 == 0) goto L_0x001e
            kotlin.x.c.b r1 = r2.mo5237e()
        L_0x001e:
            if (r1 == 0) goto L_0x002d
            java.lang.Object r0 = r1.mo5146a(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002d
            long r0 = r0.longValue()
            goto L_0x0031
        L_0x002d:
            long r0 = super.mo3103a((int) r5)
        L_0x0031:
            return r0
        L_0x0032:
            kotlin.p205x.p207d.C3370k.m12221a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p067b.p070h.C1132c.mo3103a(int):long");
    }

    /* renamed from: a */
    public void mo5226a(C1127b bVar) {
        C3370k.m12227b(bVar, "handle");
        if (bVar instanceof C1126a) {
            C1126a aVar = (C1126a) bVar;
            C1116a<?> d = aVar.mo5222d();
            if (!(d instanceof C1116a)) {
                d = null;
            }
            if (d != null) {
                this.f3830d = d;
                this.f3829c = bVar;
                return;
            }
            throw new IllegalStateException((aVar.mo5222d() + " is not a " + C1116a.class.getName()).toString());
        }
        throw new IllegalStateException("Handle is not a real implementation.".toString());
    }

    /* renamed from: b */
    public int mo3114b() {
        C1116a<?> aVar = this.f3830d;
        if (aVar != null) {
            return aVar.size();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo3115b(int i) {
        Object obj;
        C1116a<?> aVar = this.f3830d;
        if (aVar != null && (obj = aVar.get(i)) != null) {
            return m5605a((Object) obj);
        }
        throw new IllegalStateException("No data source available.".toString());
    }

    /* renamed from: b */
    public RecyclerView.C0524d0 mo3116b(ViewGroup viewGroup, int i) {
        C3370k.m12227b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C1108a<?, ?> d = m5606d(i);
        C3370k.m12223a((Object) inflate, "view");
        return C1137a.m5626a(d, inflate);
    }

    /* renamed from: b */
    public void mo3119b(RecyclerView.C0524d0 d0Var, int i) {
        C3370k.m12227b(d0Var, "holder");
        C1116a<?> aVar = this.f3830d;
        if (aVar != null) {
            Object obj = aVar.get(i);
            C1137a.m5630a(m5606d(m5605a((Object) obj)), d0Var, obj, i);
            return;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: d */
    public void mo3126d(RecyclerView.C0524d0 d0Var) {
        C1116a<?> aVar;
        Object obj;
        C1108a<?, ?> d;
        C3370k.m12227b(d0Var, "holder");
        int f = d0Var.mo3061f();
        if (!(f <= -1 || (aVar = this.f3830d) == null || (obj = aVar.get(f)) == null || (d = m5606d(Integer.valueOf(m5605a((Object) obj)).intValue())) == null)) {
            C1137a.m5629a(d, d0Var);
        }
        super.mo3126d(d0Var);
    }

    /* renamed from: f */
    public void mo5227f() {
        this.f3830d = null;
        this.f3829c = null;
    }
}
