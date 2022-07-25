package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
class C2705b {

    /* renamed from: e */
    private static C2705b f7151e;

    /* renamed from: a */
    private final Object f7152a = new Object();

    /* renamed from: b */
    private final Handler f7153b = new Handler(Looper.getMainLooper(), new C2706a());

    /* renamed from: c */
    private C2708c f7154c;

    /* renamed from: d */
    private C2708c f7155d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    class C2706a implements Handler.Callback {
        C2706a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2705b.this.mo8626a((C2708c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    interface C2707b {
        /* renamed from: a */
        void mo8589a();

        /* renamed from: a */
        void mo8590a(int i);
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    private static class C2708c {

        /* renamed from: a */
        final WeakReference<C2707b> f7157a;

        /* renamed from: b */
        int f7158b;

        /* renamed from: c */
        boolean f7159c;

        C2708c(int i, C2707b bVar) {
            this.f7157a = new WeakReference<>(bVar);
            this.f7158b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8633a(C2707b bVar) {
            return bVar != null && this.f7157a.get() == bVar;
        }
    }

    private C2705b() {
    }

    /* renamed from: a */
    static C2705b m10678a() {
        if (f7151e == null) {
            f7151e = new C2705b();
        }
        return f7151e;
    }

    /* renamed from: a */
    private boolean m10679a(C2708c cVar, int i) {
        C2707b bVar = (C2707b) cVar.f7157a.get();
        if (bVar == null) {
            return false;
        }
        this.f7153b.removeCallbacksAndMessages(cVar);
        bVar.mo8590a(i);
        return true;
    }

    /* renamed from: b */
    private void m10680b() {
        C2708c cVar = this.f7155d;
        if (cVar != null) {
            this.f7154c = cVar;
            this.f7155d = null;
            C2707b bVar = (C2707b) this.f7154c.f7157a.get();
            if (bVar != null) {
                bVar.mo8589a();
            } else {
                this.f7154c = null;
            }
        }
    }

    /* renamed from: b */
    private void m10681b(C2708c cVar) {
        int i = cVar.f7158b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f7153b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f7153b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: f */
    private boolean m10682f(C2707b bVar) {
        C2708c cVar = this.f7154c;
        return cVar != null && cVar.mo8633a(bVar);
    }

    /* renamed from: g */
    private boolean m10683g(C2707b bVar) {
        C2708c cVar = this.f7155d;
        return cVar != null && cVar.mo8633a(bVar);
    }

    /* renamed from: a */
    public void mo8624a(int i, C2707b bVar) {
        synchronized (this.f7152a) {
            if (m10682f(bVar)) {
                this.f7154c.f7158b = i;
                this.f7153b.removeCallbacksAndMessages(this.f7154c);
                m10681b(this.f7154c);
                return;
            }
            if (m10683g(bVar)) {
                this.f7155d.f7158b = i;
            } else {
                this.f7155d = new C2708c(i, bVar);
            }
            if (this.f7154c == null || !m10679a(this.f7154c, 4)) {
                this.f7154c = null;
                m10680b();
            }
        }
    }

    /* renamed from: a */
    public void mo8625a(C2707b bVar, int i) {
        C2708c cVar;
        synchronized (this.f7152a) {
            if (m10682f(bVar)) {
                cVar = this.f7154c;
            } else if (m10683g(bVar)) {
                cVar = this.f7155d;
            }
            m10679a(cVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8626a(C2708c cVar) {
        synchronized (this.f7152a) {
            if (this.f7154c == cVar || this.f7155d == cVar) {
                m10679a(cVar, 2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo8627a(C2707b bVar) {
        boolean z;
        synchronized (this.f7152a) {
            if (!m10682f(bVar)) {
                if (!m10683g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void mo8628b(C2707b bVar) {
        synchronized (this.f7152a) {
            if (m10682f(bVar)) {
                this.f7154c = null;
                if (this.f7155d != null) {
                    m10680b();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo8629c(C2707b bVar) {
        synchronized (this.f7152a) {
            if (m10682f(bVar)) {
                m10681b(this.f7154c);
            }
        }
    }

    /* renamed from: d */
    public void mo8630d(C2707b bVar) {
        synchronized (this.f7152a) {
            if (m10682f(bVar) && !this.f7154c.f7159c) {
                this.f7154c.f7159c = true;
                this.f7153b.removeCallbacksAndMessages(this.f7154c);
            }
        }
    }

    /* renamed from: e */
    public void mo8631e(C2707b bVar) {
        synchronized (this.f7152a) {
            if (m10682f(bVar) && this.f7154c.f7159c) {
                this.f7154c.f7159c = false;
                m10681b(this.f7154c);
            }
        }
    }
}
