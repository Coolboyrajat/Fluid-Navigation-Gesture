package p054c.p055a.p067b.p069g;

import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p070h.C1132c;

/* renamed from: c.a.b.g.a */
public final class C1126a implements C1127b {

    /* renamed from: a */
    private final View f3819a;

    /* renamed from: b */
    private final C1132c f3820b;

    /* renamed from: c */
    private final Map<String, Integer> f3821c;

    /* renamed from: d */
    private final Map<Integer, C1108a<?, ?>> f3822d;

    /* renamed from: e */
    private final C1116a<?> f3823e;

    public C1126a(View view, C1132c cVar, Map<String, Integer> map, Map<Integer, C1108a<?, ?>> map2, C1116a<?> aVar) {
        C3370k.m12227b(cVar, "adapter");
        C3370k.m12227b(map, "itemClassToType");
        C3370k.m12227b(map2, "bindingsToTypes");
        C3370k.m12227b(aVar, "dataSource");
        this.f3819a = view;
        this.f3820b = cVar;
        this.f3821c = map;
        this.f3822d = map2;
        this.f3823e = aVar;
    }

    /* renamed from: a */
    public int mo5215a(String str) {
        C3370k.m12227b(str, "name");
        Integer num = this.f3821c.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("Didn't find type for class " + str).toString());
    }

    /* renamed from: a */
    public RecyclerView.C0527g<?> mo5216a() {
        return this.f3820b;
    }

    /* renamed from: a */
    public C1108a<?, ?> mo5217a(int i) {
        C1108a<?, ?> aVar = this.f3822d.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Unable to view item definition for viewType " + i).toString());
    }

    /* renamed from: a */
    public void mo5218a(C3350b<? super RecyclerView.C0527g<?>, Unit> bVar) {
        C3370k.m12227b(bVar, "block");
        if (C3370k.m12225a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            bVar.mo5146a(mo5216a());
            mo5219a(this.f3823e.isEmpty());
            return;
        }
        throw new IllegalStateException("DataSource interaction must be done on the main (UI) thread.".toString());
    }

    /* renamed from: a */
    public void mo5219a(boolean z) {
        if (C3370k.m12225a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            View view = this.f3819a;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
                return;
            }
            return;
        }
        throw new IllegalStateException("DataSource interaction must be done on the main (UI) thread.".toString());
    }

    /* renamed from: b */
    public final void mo5220b() {
        this.f3823e.mo5200a((C1127b) this);
        this.f3820b.mo5226a((C1127b) this);
    }

    /* renamed from: c */
    public final void mo5221c() {
        this.f3823e.mo5198a();
        this.f3820b.mo5227f();
    }

    /* renamed from: d */
    public final C1116a<?> mo5222d() {
        return this.f3823e;
    }
}
