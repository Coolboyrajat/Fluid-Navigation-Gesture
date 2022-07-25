package p006b.p007a.p014o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: b.a.o.b */
public abstract class C0685b {

    /* renamed from: f */
    private Object f2685f;

    /* renamed from: g */
    private boolean f2686g;

    /* renamed from: b.a.o.b$a */
    public interface C0686a {
        /* renamed from: a */
        void mo214a(C0685b bVar);

        /* renamed from: a */
        boolean mo215a(C0685b bVar, Menu menu);

        /* renamed from: a */
        boolean mo216a(C0685b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo217b(C0685b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo274a();

    /* renamed from: a */
    public abstract void mo275a(int i);

    /* renamed from: a */
    public abstract void mo276a(View view);

    /* renamed from: a */
    public abstract void mo277a(CharSequence charSequence);

    /* renamed from: a */
    public void mo3894a(Object obj) {
        this.f2685f = obj;
    }

    /* renamed from: a */
    public void mo278a(boolean z) {
        this.f2686g = z;
    }

    /* renamed from: b */
    public abstract View mo279b();

    /* renamed from: b */
    public abstract void mo280b(int i);

    /* renamed from: b */
    public abstract void mo281b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo282c();

    /* renamed from: d */
    public abstract MenuInflater mo283d();

    /* renamed from: e */
    public abstract CharSequence mo284e();

    /* renamed from: f */
    public Object mo3895f() {
        return this.f2685f;
    }

    /* renamed from: g */
    public abstract CharSequence mo285g();

    /* renamed from: h */
    public boolean mo3896h() {
        return this.f2686g;
    }

    /* renamed from: i */
    public abstract void mo286i();

    /* renamed from: j */
    public abstract boolean mo287j();
}
