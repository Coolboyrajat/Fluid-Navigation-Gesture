package p006b.p022e.p023a.p024j;

import java.util.ArrayList;
import p006b.p022e.p023a.C0740c;

/* renamed from: b.e.a.j.q */
public class C0773q extends C0758f {

    /* renamed from: k0 */
    protected ArrayList<C0758f> f3132k0 = new ArrayList<>();

    /* renamed from: D */
    public void mo4324D() {
        this.f3132k0.clear();
        super.mo4324D();
    }

    /* renamed from: H */
    public void mo4326H() {
        super.mo4326H();
        ArrayList<C0758f> arrayList = this.f3132k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0758f fVar = this.f3132k0.get(i);
                fVar.mo4346b(mo4366g(), mo4368h());
                if (!(fVar instanceof C0761g)) {
                    fVar.mo4326H();
                }
            }
        }
    }

    /* renamed from: J */
    public C0761g mo4421J() {
        C0758f k = mo4374k();
        C0761g gVar = this instanceof C0761g ? (C0761g) this : null;
        while (k != null) {
            C0758f k2 = k.mo4374k();
            if (k instanceof C0761g) {
                gVar = (C0761g) k;
            }
            k = k2;
        }
        return gVar;
    }

    /* renamed from: K */
    public void mo4400K() {
        mo4326H();
        ArrayList<C0758f> arrayList = this.f3132k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0758f fVar = this.f3132k0.get(i);
                if (fVar instanceof C0773q) {
                    ((C0773q) fVar).mo4400K();
                }
            }
        }
    }

    /* renamed from: L */
    public void mo4450L() {
        this.f3132k0.clear();
    }

    /* renamed from: a */
    public void mo4334a(C0740c cVar) {
        super.mo4334a(cVar);
        int size = this.f3132k0.size();
        for (int i = 0; i < size; i++) {
            this.f3132k0.get(i).mo4334a(cVar);
        }
    }

    /* renamed from: b */
    public void mo4346b(int i, int i2) {
        super.mo4346b(i, i2);
        int size = this.f3132k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f3132k0.get(i3).mo4346b(mo4382o(), mo4384p());
        }
    }

    /* renamed from: b */
    public void mo4451b(C0758f fVar) {
        this.f3132k0.add(fVar);
        if (fVar.mo4374k() != null) {
            ((C0773q) fVar.mo4374k()).mo4452c(fVar);
        }
        fVar.mo4337a((C0758f) this);
    }

    /* renamed from: c */
    public void mo4452c(C0758f fVar) {
        this.f3132k0.remove(fVar);
        fVar.mo4337a((C0758f) null);
    }
}
