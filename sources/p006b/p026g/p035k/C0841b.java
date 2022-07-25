package p006b.p026g.p035k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: b.g.k.b */
public abstract class C0841b {

    /* renamed from: a */
    private C0843b f3254a;

    /* renamed from: b.g.k.b$a */
    public interface C0842a {
    }

    /* renamed from: b.g.k.b$b */
    public interface C0843b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0841b(Context context) {
    }

    /* renamed from: a */
    public View mo637a(MenuItem menuItem) {
        return mo635c();
    }

    /* renamed from: a */
    public void mo633a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo4561a(C0842a aVar) {
    }

    /* renamed from: a */
    public void mo638a(C0843b bVar) {
        if (!(this.f3254a == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3254a = bVar;
    }

    /* renamed from: a */
    public boolean mo634a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo639b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo635c();

    /* renamed from: d */
    public boolean mo636d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo640e() {
        return false;
    }

    /* renamed from: f */
    public void mo4562f() {
        this.f3254a = null;
    }
}
