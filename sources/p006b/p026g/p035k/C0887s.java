package p006b.p026g.p035k;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: b.g.k.s */
public final class C0887s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f3315f;

    /* renamed from: g */
    private ViewTreeObserver f3316g;

    /* renamed from: h */
    private final Runnable f3317h;

    private C0887s(View view, Runnable runnable) {
        this.f3315f = view;
        this.f3316g = view.getViewTreeObserver();
        this.f3317h = runnable;
    }

    /* renamed from: a */
    public static C0887s m4728a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C0887s sVar = new C0887s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return sVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: a */
    public void mo4671a() {
        (this.f3316g.isAlive() ? this.f3316g : this.f3315f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3315f.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo4671a();
        this.f3317h.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3316g = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo4671a();
    }
}
