package p054c.p077c.p078a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.c.a.b */
public class C1153b {

    /* renamed from: a */
    private final Map<String, C1157f> f3867a = new HashMap();

    /* renamed from: b */
    private final Set<C1157f> f3868b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final C1162i f3869c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<C1164k> f3870d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    private boolean f3871e = true;

    public C1153b(C1162i iVar) {
        if (iVar != null) {
            this.f3869c = iVar;
            this.f3869c.mo5286a(this);
            return;
        }
        throw new IllegalArgumentException("springLooper is required");
    }

    /* renamed from: a */
    public C1157f mo5260a() {
        C1157f fVar = new C1157f(this);
        mo5262a(fVar);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5261a(double d) {
        for (C1157f next : this.f3868b) {
            if (next.mo5284f()) {
                next.mo5276a(d / 1000.0d);
            } else {
                this.f3868b.remove(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5262a(C1157f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("spring is required");
        } else if (!this.f3867a.containsKey(fVar.mo5278b())) {
            this.f3867a.put(fVar.mo5278b(), fVar);
        } else {
            throw new IllegalArgumentException("spring is already registered");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5263a(String str) {
        C1157f fVar = this.f3867a.get(str);
        if (fVar != null) {
            this.f3868b.add(fVar);
            if (mo5265b()) {
                this.f3871e = false;
                this.f3869c.mo5256a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("springId " + str + " does not reference a registered spring");
    }

    /* renamed from: b */
    public void mo5264b(double d) {
        Iterator<C1164k> it = this.f3870d.iterator();
        while (it.hasNext()) {
            it.next().mo5287a(this);
        }
        mo5261a(d);
        if (this.f3868b.isEmpty()) {
            this.f3871e = true;
        }
        Iterator<C1164k> it2 = this.f3870d.iterator();
        while (it2.hasNext()) {
            it2.next().mo5288b(this);
        }
        if (this.f3871e) {
            this.f3869c.mo5257b();
        }
    }

    /* renamed from: b */
    public boolean mo5265b() {
        return this.f3871e;
    }
}
