package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.d */
class C0572d {

    /* renamed from: a */
    final C0574b f2333a;

    /* renamed from: b */
    final C0573a f2334b = new C0573a();

    /* renamed from: c */
    final List<View> f2335c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.d$a */
    static class C0573a {

        /* renamed from: a */
        long f2336a = 0;

        /* renamed from: b */
        C0573a f2337b;

        C0573a() {
        }

        /* renamed from: b */
        private void m3262b() {
            if (this.f2337b == null) {
                this.f2337b = new C0573a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3482a() {
            this.f2336a = 0;
            C0573a aVar = this.f2337b;
            if (aVar != null) {
                aVar.mo3482a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3483a(int i) {
            if (i >= 64) {
                C0573a aVar = this.f2337b;
                if (aVar != null) {
                    aVar.mo3483a(i - 64);
                    return;
                }
                return;
            }
            this.f2336a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3484a(int i, boolean z) {
            if (i >= 64) {
                m3262b();
                this.f2337b.mo3484a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2336a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2336a;
            this.f2336a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo3488e(i);
            } else {
                mo3483a(i);
            }
            if (z2 || this.f2337b != null) {
                m3262b();
                this.f2337b.mo3484a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3485b(int i) {
            C0573a aVar = this.f2337b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f2336a) : Long.bitCount(this.f2336a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2336a & ((1 << i) - 1)) : aVar.mo3485b(i - 64) + Long.bitCount(this.f2336a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3486c(int i) {
            if (i < 64) {
                return (this.f2336a & (1 << i)) != 0;
            }
            m3262b();
            return this.f2337b.mo3486c(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3487d(int i) {
            if (i >= 64) {
                m3262b();
                return this.f2337b.mo3487d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2336a & j) != 0;
            this.f2336a &= ~j;
            long j2 = j - 1;
            long j3 = this.f2336a;
            this.f2336a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            C0573a aVar = this.f2337b;
            if (aVar != null) {
                if (aVar.mo3486c(0)) {
                    mo3488e(63);
                }
                this.f2337b.mo3487d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3488e(int i) {
            if (i >= 64) {
                m3262b();
                this.f2337b.mo3488e(i - 64);
                return;
            }
            this.f2336a |= 1 << i;
        }

        public String toString() {
            if (this.f2337b == null) {
                return Long.toBinaryString(this.f2336a);
            }
            return this.f2337b.toString() + "xx" + Long.toBinaryString(this.f2336a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    interface C0574b {
        /* renamed from: a */
        View mo3083a(int i);

        /* renamed from: a */
        void mo3084a();

        /* renamed from: a */
        void mo3085a(View view);

        /* renamed from: a */
        void mo3086a(View view, int i);

        /* renamed from: a */
        void mo3087a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        int mo3088b();

        /* renamed from: b */
        RecyclerView.C0524d0 mo3089b(View view);

        /* renamed from: b */
        void mo3090b(int i);

        /* renamed from: c */
        void mo3091c(int i);

        /* renamed from: c */
        void mo3092c(View view);

        /* renamed from: d */
        int mo3093d(View view);
    }

    C0572d(C0574b bVar) {
        this.f2333a = bVar;
    }

    /* renamed from: f */
    private int m3242f(int i) {
        if (i < 0) {
            return -1;
        }
        int b = this.f2333a.mo3088b();
        int i2 = i;
        while (i2 < b) {
            int b2 = i - (i2 - this.f2334b.mo3485b(i2));
            if (b2 == 0) {
                while (this.f2334b.mo3486c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    /* renamed from: g */
    private void m3243g(View view) {
        this.f2335c.add(view);
        this.f2333a.mo3085a(view);
    }

    /* renamed from: h */
    private boolean m3244h(View view) {
        if (!this.f2335c.remove(view)) {
            return false;
        }
        this.f2333a.mo3092c(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3464a() {
        return this.f2333a.mo3088b() - this.f2335c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3465a(int i) {
        int f = m3242f(i);
        this.f2334b.mo3487d(f);
        this.f2333a.mo3091c(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3466a(View view) {
        int d = this.f2333a.mo3093d(view);
        if (d >= 0) {
            this.f2334b.mo3488e(d);
            m3243g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3467a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b = i < 0 ? this.f2333a.mo3088b() : m3242f(i);
        this.f2334b.mo3484a(b, z);
        if (z) {
            m3243g(view);
        }
        this.f2333a.mo3087a(view, b, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3468a(View view, int i, boolean z) {
        int b = i < 0 ? this.f2333a.mo3088b() : m3242f(i);
        this.f2334b.mo3484a(b, z);
        if (z) {
            m3243g(view);
        }
        this.f2333a.mo3086a(view, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3469a(View view, boolean z) {
        mo3468a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3470b() {
        return this.f2333a.mo3088b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3471b(View view) {
        int d = this.f2333a.mo3093d(view);
        if (d != -1 && !this.f2334b.mo3486c(d)) {
            return d - this.f2334b.mo3485b(d);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo3472b(int i) {
        int size = this.f2335c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2335c.get(i2);
            RecyclerView.C0524d0 b = this.f2333a.mo3089b(view);
            if (b.mo3064i() == i && !b.mo3070o() && !b.mo3072q()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo3473c(int i) {
        return this.f2333a.mo3083a(m3242f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3474c() {
        this.f2334b.mo3482a();
        for (int size = this.f2335c.size() - 1; size >= 0; size--) {
            this.f2333a.mo3092c(this.f2335c.get(size));
            this.f2335c.remove(size);
        }
        this.f2333a.mo3084a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3475c(View view) {
        return this.f2335c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo3476d(int i) {
        return this.f2333a.mo3083a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3477d(View view) {
        int d = this.f2333a.mo3093d(view);
        if (d >= 0) {
            if (this.f2334b.mo3487d(d)) {
                m3244h(view);
            }
            this.f2333a.mo3090b(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3478e(int i) {
        int f = m3242f(i);
        View a = this.f2333a.mo3083a(f);
        if (a != null) {
            if (this.f2334b.mo3487d(f)) {
                m3244h(a);
            }
            this.f2333a.mo3090b(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo3479e(View view) {
        int d = this.f2333a.mo3093d(view);
        if (d == -1) {
            m3244h(view);
            return true;
        } else if (!this.f2334b.mo3486c(d)) {
            return false;
        } else {
            this.f2334b.mo3487d(d);
            m3244h(view);
            this.f2333a.mo3090b(d);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3480f(View view) {
        int d = this.f2333a.mo3093d(view);
        if (d < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2334b.mo3486c(d)) {
            this.f2334b.mo3483a(d);
            m3244h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2334b.toString() + ", hidden list:" + this.f2335c.size();
    }
}
