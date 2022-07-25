package androidx.databinding;

import androidx.databinding.C0377h;

/* renamed from: androidx.databinding.a */
public class C0369a implements C0377h {

    /* renamed from: a */
    private transient C0384l f1694a;

    /* renamed from: a */
    public void mo2173a(int i) {
        synchronized (this) {
            if (this.f1694a != null) {
                this.f1694a.mo2177a(this, i, null);
            }
        }
    }

    /* renamed from: a */
    public void mo2174a(C0377h.C0378a aVar) {
        synchronized (this) {
            if (this.f1694a == null) {
                this.f1694a = new C0384l();
            }
        }
        this.f1694a.mo2176a(aVar);
    }

    /* renamed from: b */
    public void mo2175b(C0377h.C0378a aVar) {
        synchronized (this) {
            if (this.f1694a != null) {
                this.f1694a.mo2178b(aVar);
            }
        }
    }
}
