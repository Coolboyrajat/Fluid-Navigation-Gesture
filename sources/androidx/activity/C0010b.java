package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C0010b {

    /* renamed from: a */
    private boolean f23a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0009a> f24b = new CopyOnWriteArrayList<>();

    public C0010b(boolean z) {
        this.f23a = z;
    }

    /* renamed from: a */
    public abstract void mo20a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21a(C0009a aVar) {
        this.f24b.add(aVar);
    }

    /* renamed from: a */
    public final void mo22a(boolean z) {
        this.f23a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23b(C0009a aVar) {
        this.f24b.remove(aVar);
    }

    /* renamed from: b */
    public final boolean mo24b() {
        return this.f23a;
    }

    /* renamed from: c */
    public final void mo25c() {
        Iterator<C0009a> it = this.f24b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
