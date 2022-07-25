package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p006b.p021d.C0723a;
import p006b.p021d.C0728d;
import p006b.p026g.p034j.C0834e;
import p006b.p026g.p034j.C0835f;

/* renamed from: androidx.recyclerview.widget.u */
class C0622u {

    /* renamed from: a */
    final C0723a<RecyclerView.C0524d0, C0623a> f2500a = new C0723a<>();

    /* renamed from: b */
    final C0728d<RecyclerView.C0524d0> f2501b = new C0728d<>();

    /* renamed from: androidx.recyclerview.widget.u$a */
    static class C0623a {

        /* renamed from: d */
        static C0834e<C0623a> f2502d = new C0835f(20);

        /* renamed from: a */
        int f2503a;

        /* renamed from: b */
        RecyclerView.C0532l.C0535c f2504b;

        /* renamed from: c */
        RecyclerView.C0532l.C0535c f2505c;

        private C0623a() {
        }

        /* renamed from: a */
        static void m3526a() {
            do {
            } while (f2502d.mo4543a() != null);
        }

        /* renamed from: a */
        static void m3527a(C0623a aVar) {
            aVar.f2503a = 0;
            aVar.f2504b = null;
            aVar.f2505c = null;
            f2502d.mo4544a(aVar);
        }

        /* renamed from: b */
        static C0623a m3528b() {
            C0623a a = f2502d.mo4543a();
            return a == null ? new C0623a() : a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$b */
    interface C0624b {
        /* renamed from: a */
        void mo3041a(RecyclerView.C0524d0 d0Var);

        /* renamed from: a */
        void mo3042a(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2);

        /* renamed from: b */
        void mo3043b(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2);

        /* renamed from: c */
        void mo3044c(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar, RecyclerView.C0532l.C0535c cVar2);
    }

    C0622u() {
    }

    /* renamed from: a */
    private RecyclerView.C0532l.C0535c m3509a(RecyclerView.C0524d0 d0Var, int i) {
        C0623a d;
        RecyclerView.C0532l.C0535c cVar;
        int a = this.f2500a.mo4188a((Object) d0Var);
        if (a >= 0 && (d = this.f2500a.mo4199d(a)) != null) {
            int i2 = d.f2503a;
            if ((i2 & i) != 0) {
                d.f2503a = (~i) & i2;
                if (i == 4) {
                    cVar = d.f2504b;
                } else if (i == 8) {
                    cVar = d.f2505c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((d.f2503a & 12) == 0) {
                    this.f2500a.mo4195c(a);
                    C0623a.m3527a(d);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RecyclerView.C0524d0 mo3612a(long j) {
        return this.f2501b.mo4110b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3613a() {
        this.f2500a.clear();
        this.f2501b.mo4106a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3614a(long j, RecyclerView.C0524d0 d0Var) {
        this.f2501b.mo4115c(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3615a(RecyclerView.C0524d0 d0Var) {
        C0623a aVar = this.f2500a.get(d0Var);
        if (aVar == null) {
            aVar = C0623a.m3528b();
            this.f2500a.put(d0Var, aVar);
        }
        aVar.f2503a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3616a(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar) {
        C0623a aVar = this.f2500a.get(d0Var);
        if (aVar == null) {
            aVar = C0623a.m3528b();
            this.f2500a.put(d0Var, aVar);
        }
        aVar.f2503a |= 2;
        aVar.f2504b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3617a(C0624b bVar) {
        RecyclerView.C0532l.C0535c cVar;
        RecyclerView.C0532l.C0535c cVar2;
        for (int size = this.f2500a.size() - 1; size >= 0; size--) {
            RecyclerView.C0524d0 b = this.f2500a.mo4194b(size);
            C0623a c = this.f2500a.mo4195c(size);
            int i = c.f2503a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c.f2504b;
                    if (cVar != null) {
                        cVar2 = c.f2505c;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.mo3044c(b, c.f2504b, c.f2505c);
                        } else if ((i & 4) != 0) {
                            cVar = c.f2504b;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        C0623a.m3527a(c);
                    }
                    bVar.mo3042a(b, c.f2504b, c.f2505c);
                    C0623a.m3527a(c);
                }
                bVar.mo3043b(b, cVar, cVar2);
                C0623a.m3527a(c);
            }
            bVar.mo3041a(b);
            C0623a.m3527a(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3618b() {
        C0623a.m3526a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3619b(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar) {
        C0623a aVar = this.f2500a.get(d0Var);
        if (aVar == null) {
            aVar = C0623a.m3528b();
            this.f2500a.put(d0Var, aVar);
        }
        aVar.f2505c = cVar;
        aVar.f2503a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3620b(RecyclerView.C0524d0 d0Var) {
        C0623a aVar = this.f2500a.get(d0Var);
        return (aVar == null || (aVar.f2503a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3621c(RecyclerView.C0524d0 d0Var, RecyclerView.C0532l.C0535c cVar) {
        C0623a aVar = this.f2500a.get(d0Var);
        if (aVar == null) {
            aVar = C0623a.m3528b();
            this.f2500a.put(d0Var, aVar);
        }
        aVar.f2504b = cVar;
        aVar.f2503a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3622c(RecyclerView.C0524d0 d0Var) {
        C0623a aVar = this.f2500a.get(d0Var);
        return (aVar == null || (aVar.f2503a & 4) == 0) ? false : true;
    }

    /* renamed from: d */
    public void mo3623d(RecyclerView.C0524d0 d0Var) {
        mo3626g(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public RecyclerView.C0532l.C0535c mo3624e(RecyclerView.C0524d0 d0Var) {
        return m3509a(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public RecyclerView.C0532l.C0535c mo3625f(RecyclerView.C0524d0 d0Var) {
        return m3509a(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3626g(RecyclerView.C0524d0 d0Var) {
        C0623a aVar = this.f2500a.get(d0Var);
        if (aVar != null) {
            aVar.f2503a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3627h(RecyclerView.C0524d0 d0Var) {
        int b = this.f2501b.mo4109b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (d0Var == this.f2501b.mo4114c(b)) {
                this.f2501b.mo4112b(b);
                break;
            } else {
                b--;
            }
        }
        C0623a remove = this.f2500a.remove(d0Var);
        if (remove != null) {
            C0623a.m3527a(remove);
        }
    }
}
