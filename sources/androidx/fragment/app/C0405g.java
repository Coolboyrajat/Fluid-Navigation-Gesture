package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0476d0;
import p006b.p026g.p034j.C0837h;

/* renamed from: androidx.fragment.app.g */
public class C0405g {

    /* renamed from: a */
    private final C0407i<?> f1820a;

    private C0405g(C0407i<?> iVar) {
        this.f1820a = iVar;
    }

    /* renamed from: a */
    public static C0405g m2069a(C0407i<?> iVar) {
        C0837h.m4535a(iVar, (Object) "callbacks == null");
        return new C0405g(iVar);
    }

    /* renamed from: a */
    public View mo2406a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1820a.f1825i.mo2514r().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public Fragment mo2407a(String str) {
        return this.f1820a.f1825i.mo2483c(str);
    }

    /* renamed from: a */
    public void mo2408a() {
        this.f1820a.f1825i.mo2487d();
    }

    /* renamed from: a */
    public void mo2409a(Configuration configuration) {
        this.f1820a.f1825i.mo2457a(configuration);
    }

    /* renamed from: a */
    public void mo2410a(Parcelable parcelable) {
        C0407i<?> iVar = this.f1820a;
        if (iVar instanceof C0476d0) {
            iVar.f1825i.mo2458a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: a */
    public void mo2411a(Menu menu) {
        this.f1820a.f1825i.mo2459a(menu);
    }

    /* renamed from: a */
    public void mo2412a(Fragment fragment) {
        C0407i<?> iVar = this.f1820a;
        iVar.f1825i.mo2467a(iVar, (C0403e) iVar, fragment);
    }

    /* renamed from: a */
    public void mo2413a(boolean z) {
        this.f1820a.f1825i.mo2470a(z);
    }

    /* renamed from: a */
    public boolean mo2414a(Menu menu, MenuInflater menuInflater) {
        return this.f1820a.f1825i.mo2471a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo2415a(MenuItem menuItem) {
        return this.f1820a.f1825i.mo2472a(menuItem);
    }

    /* renamed from: b */
    public void mo2416b() {
        this.f1820a.f1825i.mo2490e();
    }

    /* renamed from: b */
    public void mo2417b(boolean z) {
        this.f1820a.f1825i.mo2479b(z);
    }

    /* renamed from: b */
    public boolean mo2418b(Menu menu) {
        return this.f1820a.f1825i.mo2481b(menu);
    }

    /* renamed from: b */
    public boolean mo2419b(MenuItem menuItem) {
        return this.f1820a.f1825i.mo2482b(menuItem);
    }

    /* renamed from: c */
    public void mo2420c() {
        this.f1820a.f1825i.mo2491f();
    }

    /* renamed from: d */
    public void mo2421d() {
        this.f1820a.f1825i.mo2495h();
    }

    /* renamed from: e */
    public void mo2422e() {
        this.f1820a.f1825i.mo2497i();
    }

    /* renamed from: f */
    public void mo2423f() {
        this.f1820a.f1825i.mo2501k();
    }

    /* renamed from: g */
    public void mo2424g() {
        this.f1820a.f1825i.mo2503l();
    }

    /* renamed from: h */
    public void mo2425h() {
        this.f1820a.f1825i.mo2505m();
    }

    /* renamed from: i */
    public boolean mo2426i() {
        return this.f1820a.f1825i.mo2486c(true);
    }

    /* renamed from: j */
    public C0411l mo2427j() {
        return this.f1820a.f1825i;
    }

    /* renamed from: k */
    public void mo2428k() {
        this.f1820a.f1825i.mo2522y();
    }

    /* renamed from: l */
    public Parcelable mo2429l() {
        return this.f1820a.f1825i.mo2450A();
    }
}
