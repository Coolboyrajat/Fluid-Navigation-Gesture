package p054c.p119h.p120a.p124k;

import com.joaomgcd.taskerpluginlibrary.output.C2767b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.h.a.k.d */
public final class C1514d extends ArrayList<C1513c> {

    /* renamed from: c.h.a.k.d$a */
    public static final class C1515a {
        private C1515a() {
        }

        public /* synthetic */ C1515a(C3366g gVar) {
            this();
        }
    }

    static {
        new C1515a((C3366g) null);
    }

    /* renamed from: a */
    public /* bridge */ int mo5997a() {
        return super.size();
    }

    /* renamed from: a */
    public final void mo5998a(C2767b<?> bVar) {
        C3370k.m12227b(bVar, "infos");
        Iterator it = iterator();
        while (it.hasNext()) {
            C1513c cVar = (C1513c) it.next();
            bVar.mo8866a(cVar.mo5996b(), cVar.mo5995a());
        }
    }

    /* renamed from: a */
    public /* bridge */ boolean mo5999a(C1513c cVar) {
        return super.contains(cVar);
    }

    /* renamed from: b */
    public /* bridge */ int mo6000b(C1513c cVar) {
        return super.indexOf(cVar);
    }

    /* renamed from: c */
    public /* bridge */ int mo6001c(C1513c cVar) {
        return super.lastIndexOf(cVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1513c) {
            return mo5999a((C1513c) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean mo6003d(C1513c cVar) {
        return super.remove(cVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1513c) {
            return mo6000b((C1513c) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1513c) {
            return mo6001c((C1513c) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C1513c) {
            return mo6003d((C1513c) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return mo5997a();
    }
}
