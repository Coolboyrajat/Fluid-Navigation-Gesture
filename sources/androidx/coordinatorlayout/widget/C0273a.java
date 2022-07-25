package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p006b.p021d.C0736g;
import p006b.p026g.p034j.C0834e;
import p006b.p026g.p034j.C0835f;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0273a<T> {

    /* renamed from: a */
    private final C0834e<ArrayList<T>> f1408a = new C0835f(10);

    /* renamed from: b */
    private final C0736g<T, ArrayList<T>> f1409b = new C0736g<>();

    /* renamed from: c */
    private final ArrayList<T> f1410c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1411d = new HashSet<>();

    /* renamed from: a */
    private void m1405a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f1409b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m1405a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m1406a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1408a.mo4544a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m1407c() {
        ArrayList<T> a = this.f1408a.mo4543a();
        return a == null ? new ArrayList<>() : a;
    }

    /* renamed from: a */
    public void mo1875a() {
        int size = this.f1409b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f1409b.mo4199d(i);
            if (d != null) {
                m1406a(d);
            }
        }
        this.f1409b.clear();
    }

    /* renamed from: a */
    public void mo1876a(T t) {
        if (!this.f1409b.containsKey(t)) {
            this.f1409b.put(t, null);
        }
    }

    /* renamed from: a */
    public void mo1877a(T t, T t2) {
        if (!this.f1409b.containsKey(t) || !this.f1409b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f1409b.get(t);
        if (arrayList == null) {
            arrayList = m1407c();
            this.f1409b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public ArrayList<T> mo1878b() {
        this.f1410c.clear();
        this.f1411d.clear();
        int size = this.f1409b.size();
        for (int i = 0; i < size; i++) {
            m1405a(this.f1409b.mo4194b(i), this.f1410c, this.f1411d);
        }
        return this.f1410c;
    }

    /* renamed from: b */
    public boolean mo1879b(T t) {
        return this.f1409b.containsKey(t);
    }

    /* renamed from: c */
    public List mo1880c(T t) {
        return this.f1409b.get(t);
    }

    /* renamed from: d */
    public List<T> mo1881d(T t) {
        int size = this.f1409b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f1409b.mo4199d(i);
            if (d != null && d.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1409b.mo4194b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo1882e(T t) {
        int size = this.f1409b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f1409b.mo4199d(i);
            if (d != null && d.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
