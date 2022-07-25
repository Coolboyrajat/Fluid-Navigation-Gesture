package p054c.p055a.p067b.p070h;

import androidx.recyclerview.widget.C0586f;
import java.util.List;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.b.h.d */
public final class C1133d<IT> extends C0586f.C0588b {

    /* renamed from: a */
    private final List<IT> f3831a;

    /* renamed from: b */
    private final List<IT> f3832b;

    /* renamed from: c */
    private final C3351c<IT, IT, Boolean> f3833c;

    /* renamed from: d */
    private final C3351c<IT, IT, Boolean> f3834d;

    public C1133d(List<? extends IT> list, List<? extends IT> list2, C3351c<? super IT, ? super IT, Boolean> cVar, C3351c<? super IT, ? super IT, Boolean> cVar2) {
        C3370k.m12227b(list, "oldItems");
        C3370k.m12227b(list2, "newItems");
        C3370k.m12227b(cVar, "areTheSame");
        C3370k.m12227b(cVar2, "areContentsTheSame");
        this.f3831a = list;
        this.f3832b = list2;
        this.f3833c = cVar;
        this.f3834d = cVar2;
    }

    /* renamed from: a */
    public int mo3517a() {
        return this.f3832b.size();
    }

    /* renamed from: a */
    public boolean mo3518a(int i, int i2) {
        return this.f3834d.mo6125a(this.f3831a.get(i), this.f3832b.get(i2)).booleanValue();
    }

    /* renamed from: b */
    public int mo3519b() {
        return this.f3831a.size();
    }

    /* renamed from: b */
    public boolean mo3520b(int i, int i2) {
        return this.f3833c.mo6125a(this.f3831a.get(i), this.f3832b.get(i2)).booleanValue();
    }
}
