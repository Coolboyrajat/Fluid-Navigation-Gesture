package p054c.p083e.p084a.p085a.p099w;

import android.graphics.Typeface;

/* renamed from: c.e.a.a.w.a */
public final class C1215a extends C1223f {

    /* renamed from: a */
    private final Typeface f3969a;

    /* renamed from: b */
    private final C1216a f3970b;

    /* renamed from: c */
    private boolean f3971c;

    /* renamed from: c.e.a.a.w.a$a */
    public interface C1216a {
        /* renamed from: a */
        void mo5456a(Typeface typeface);
    }

    public C1215a(C1216a aVar, Typeface typeface) {
        this.f3969a = typeface;
        this.f3970b = aVar;
    }

    /* renamed from: a */
    private void m5850a(Typeface typeface) {
        if (!this.f3971c) {
            this.f3970b.mo5456a(typeface);
        }
    }

    /* renamed from: a */
    public void mo5453a() {
        this.f3971c = true;
    }

    /* renamed from: a */
    public void mo5454a(int i) {
        m5850a(this.f3969a);
    }

    /* renamed from: a */
    public void mo5455a(Typeface typeface, boolean z) {
        m5850a(typeface);
    }
}
