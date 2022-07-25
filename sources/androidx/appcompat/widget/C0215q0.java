package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.q0 */
class C0215q0 extends C0194i0 {

    /* renamed from: b */
    private final WeakReference<Context> f1057b;

    public C0215q0(Context context, Resources resources) {
        super(resources);
        this.f1057b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1057b.get();
        if (!(drawable == null || context == null)) {
            C0185h0.m929a().mo1376a(context, i, drawable);
        }
        return drawable;
    }
}
