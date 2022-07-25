package p054c.p083e.p104c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.e.c.g */
public final class C1279g extends C1282j implements Iterable<C1282j> {

    /* renamed from: f */
    private final List<C1282j> f4146f = new ArrayList();

    /* renamed from: a */
    public void mo5653a(C1282j jVar) {
        if (jVar == null) {
            jVar = C1284l.f4147a;
        }
        this.f4146f.add(jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1279g) && ((C1279g) obj).f4146f.equals(this.f4146f));
    }

    public int hashCode() {
        return this.f4146f.hashCode();
    }

    public Iterator<C1282j> iterator() {
        return this.f4146f.iterator();
    }
}
