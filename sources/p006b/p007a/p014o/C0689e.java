package p006b.p007a.p014o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p006b.p007a.p014o.C0685b;

/* renamed from: b.a.o.e */
public class C0689e extends C0685b implements C0081g.C0082a {

    /* renamed from: h */
    private Context f2692h;

    /* renamed from: i */
    private ActionBarContextView f2693i;

    /* renamed from: j */
    private C0685b.C0686a f2694j;

    /* renamed from: k */
    private WeakReference<View> f2695k;

    /* renamed from: l */
    private boolean f2696l;

    /* renamed from: m */
    private C0081g f2697m;

    public C0689e(Context context, ActionBarContextView actionBarContextView, C0685b.C0686a aVar, boolean z) {
        this.f2692h = context;
        this.f2693i = actionBarContextView;
        this.f2694j = aVar;
        C0081g gVar = new C0081g(actionBarContextView.getContext());
        gVar.mo477c(1);
        this.f2697m = gVar;
        this.f2697m.mo453a((C0081g.C0082a) this);
    }

    /* renamed from: a */
    public void mo274a() {
        if (!this.f2696l) {
            this.f2696l = true;
            this.f2693i.sendAccessibilityEvent(32);
            this.f2694j.mo214a(this);
        }
    }

    /* renamed from: a */
    public void mo275a(int i) {
        mo277a((CharSequence) this.f2692h.getString(i));
    }

    /* renamed from: a */
    public void mo276a(View view) {
        this.f2693i.setCustomView(view);
        this.f2695k = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo177a(C0081g gVar) {
        mo286i();
        this.f2693i.mo733d();
    }

    /* renamed from: a */
    public void mo277a(CharSequence charSequence) {
        this.f2693i.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo278a(boolean z) {
        super.mo278a(z);
        this.f2693i.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo180a(C0081g gVar, MenuItem menuItem) {
        return this.f2694j.mo216a((C0685b) this, menuItem);
    }

    /* renamed from: b */
    public View mo279b() {
        WeakReference<View> weakReference = this.f2695k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void mo280b(int i) {
        mo281b((CharSequence) this.f2692h.getString(i));
    }

    /* renamed from: b */
    public void mo281b(CharSequence charSequence) {
        this.f2693i.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo282c() {
        return this.f2697m;
    }

    /* renamed from: d */
    public MenuInflater mo283d() {
        return new C0692g(this.f2693i.getContext());
    }

    /* renamed from: e */
    public CharSequence mo284e() {
        return this.f2693i.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo285g() {
        return this.f2693i.getTitle();
    }

    /* renamed from: i */
    public void mo286i() {
        this.f2694j.mo215a((C0685b) this, (Menu) this.f2697m);
    }

    /* renamed from: j */
    public boolean mo287j() {
        return this.f2693i.mo731b();
    }
}
