package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.w0 */
public class C0244w0 extends Resources {

    /* renamed from: b */
    private static boolean f1171b;

    /* renamed from: a */
    private final WeakReference<Context> f1172a;

    public C0244w0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1172a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1227a() {
        return f1171b;
    }

    /* renamed from: b */
    public static boolean m1228b() {
        return m1227a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo1699a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f1172a.get();
        return context != null ? C0185h0.m929a().mo1373a(context, this, i) : super.getDrawable(i);
    }
}
