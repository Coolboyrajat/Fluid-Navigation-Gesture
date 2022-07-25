package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.o0 */
public class C0211o0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1045c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0211o0>> f1046d;

    /* renamed from: a */
    private final Resources f1047a;

    /* renamed from: b */
    private final Resources.Theme f1048b;

    private C0211o0(Context context) {
        super(context);
        if (C0244w0.m1228b()) {
            this.f1047a = new C0244w0(this, context.getResources());
            this.f1048b = this.f1047a.newTheme();
            this.f1048b.setTo(context.getTheme());
            return;
        }
        this.f1047a = new C0215q0(this, context.getResources());
        this.f1048b = null;
    }

    /* renamed from: a */
    private static boolean m1038a(Context context) {
        if ((context instanceof C0211o0) || (context.getResources() instanceof C0215q0) || (context.getResources() instanceof C0244w0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0244w0.m1228b();
    }

    /* renamed from: b */
    public static Context m1039b(Context context) {
        if (!m1038a(context)) {
            return context;
        }
        synchronized (f1045c) {
            if (f1046d == null) {
                f1046d = new ArrayList<>();
            } else {
                for (int size = f1046d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1046d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1046d.remove(size);
                    }
                }
                for (int size2 = f1046d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1046d.get(size2);
                    C0211o0 o0Var = weakReference2 != null ? (C0211o0) weakReference2.get() : null;
                    if (o0Var != null && o0Var.getBaseContext() == context) {
                        return o0Var;
                    }
                }
            }
            C0211o0 o0Var2 = new C0211o0(context);
            f1046d.add(new WeakReference(o0Var2));
            return o0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1047a.getAssets();
    }

    public Resources getResources() {
        return this.f1047a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1048b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1048b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
