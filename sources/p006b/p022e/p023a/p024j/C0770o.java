package p006b.p022e.p023a.p024j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: b.e.a.j.o */
public class C0770o {

    /* renamed from: a */
    HashSet<C0770o> f3120a = new HashSet<>(2);

    /* renamed from: b */
    int f3121b = 0;

    /* renamed from: a */
    public void mo4442a() {
        this.f3121b = 1;
        Iterator<C0770o> it = this.f3120a.iterator();
        while (it.hasNext()) {
            it.next().mo4436e();
        }
    }

    /* renamed from: a */
    public void mo4443a(C0770o oVar) {
        this.f3120a.add(oVar);
    }

    /* renamed from: b */
    public void mo4444b() {
        this.f3121b = 0;
        Iterator<C0770o> it = this.f3120a.iterator();
        while (it.hasNext()) {
            it.next().mo4444b();
        }
    }

    /* renamed from: c */
    public boolean mo4445c() {
        return this.f3121b == 1;
    }

    /* renamed from: d */
    public void mo4435d() {
        this.f3121b = 0;
        this.f3120a.clear();
    }

    /* renamed from: e */
    public void mo4436e() {
    }
}
