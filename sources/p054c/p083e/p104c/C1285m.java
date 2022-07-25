package p054c.p083e.p104c;

import java.util.Map;
import java.util.Set;
import p054c.p083e.p104c.p106w.C1327h;

/* renamed from: c.e.c.m */
public final class C1285m extends C1282j {

    /* renamed from: a */
    private final C1327h<String, C1282j> f4148a = new C1327h<>();

    /* renamed from: a */
    public void mo5668a(String str, C1282j jVar) {
        if (jVar == null) {
            jVar = C1284l.f4147a;
        }
        this.f4148a.put(str, jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1285m) && ((C1285m) obj).f4148a.equals(this.f4148a));
    }

    /* renamed from: h */
    public Set<Map.Entry<String, C1282j>> mo5670h() {
        return this.f4148a.entrySet();
    }

    public int hashCode() {
        return this.f4148a.hashCode();
    }
}
