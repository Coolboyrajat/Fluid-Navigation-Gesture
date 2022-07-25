package p006b.p050n;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: b.n.b0 */
class C0949b0 implements C0962c0 {

    /* renamed from: a */
    private final ViewOverlay f3426a;

    C0949b0(View view) {
        this.f3426a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo4800a(Drawable drawable) {
        this.f3426a.add(drawable);
    }

    /* renamed from: b */
    public void mo4801b(Drawable drawable) {
        this.f3426a.remove(drawable);
    }
}
