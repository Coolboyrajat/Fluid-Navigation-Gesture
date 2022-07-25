package p006b.p050n;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: b.n.v */
class C1011v implements C1012w {

    /* renamed from: a */
    private final ViewGroupOverlay f3580a;

    C1011v(ViewGroup viewGroup) {
        this.f3580a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo4800a(Drawable drawable) {
        this.f3580a.add(drawable);
    }

    /* renamed from: a */
    public void mo4943a(View view) {
        this.f3580a.add(view);
    }

    /* renamed from: b */
    public void mo4801b(Drawable drawable) {
        this.f3580a.remove(drawable);
    }

    /* renamed from: b */
    public void mo4944b(View view) {
        this.f3580a.remove(view);
    }
}
