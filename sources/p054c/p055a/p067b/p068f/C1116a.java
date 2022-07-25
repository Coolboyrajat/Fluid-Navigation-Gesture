package p054c.p055a.p067b.p068f;

import java.util.Collection;
import java.util.List;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import p054c.p055a.p067b.p069g.C1127b;

/* renamed from: c.a.b.f.a */
public interface C1116a<IT> {

    /* renamed from: c.a.b.f.a$a */
    public static final class C1117a {
        /* renamed from: a */
        public static /* synthetic */ void m5570a(C1116a aVar, List list, C3351c cVar, C3351c cVar2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    cVar = null;
                }
                if ((i & 4) != 0) {
                    cVar2 = null;
                }
                aVar.mo5201a(list, cVar, cVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
        }
    }

    /* renamed from: a */
    int mo5197a(C3350b<? super IT, Boolean> bVar);

    /* renamed from: a */
    void mo5198a();

    /* renamed from: a */
    void mo5199a(int i);

    /* renamed from: a */
    void mo5200a(C1127b bVar);

    /* renamed from: a */
    void mo5201a(List<? extends IT> list, C3351c<? super IT, ? super IT, Boolean> cVar, C3351c<? super IT, ? super IT, Boolean> cVar2);

    /* renamed from: a */
    void mo5202a(IT... itArr);

    void addAll(Collection<? extends IT> collection);

    /* renamed from: b */
    List<IT> mo5204b();

    /* renamed from: c */
    void mo5205c();

    void clear();

    IT get(int i);

    boolean isEmpty();

    int size();
}
