package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p006b.p021d.C0725b;

/* renamed from: androidx.appcompat.app.f */
public abstract class C0035f {

    /* renamed from: f */
    private static int f147f = -100;

    /* renamed from: g */
    private static final C0725b<WeakReference<C0035f>> f148g = new C0725b<>();

    /* renamed from: h */
    private static final Object f149h = new Object();

    C0035f() {
    }

    /* renamed from: a */
    public static C0035f m110a(Activity activity, C0034e eVar) {
        return new C0036g(activity, eVar);
    }

    /* renamed from: a */
    public static C0035f m111a(Dialog dialog, C0034e eVar) {
        return new C0036g(dialog, eVar);
    }

    /* renamed from: a */
    static void m112a(C0035f fVar) {
        synchronized (f149h) {
            m114c(fVar);
            f148g.add(new WeakReference(fVar));
        }
    }

    /* renamed from: b */
    static void m113b(C0035f fVar) {
        synchronized (f149h) {
            m114c(fVar);
        }
    }

    /* renamed from: c */
    private static void m114c(C0035f fVar) {
        synchronized (f149h) {
            Iterator<WeakReference<C0035f>> it = f148g.iterator();
            while (it.hasNext()) {
                C0035f fVar2 = (C0035f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    public static void m115e(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f147f != i) {
            f147f = i;
            mo191k();
        }
    }

    /* renamed from: k */
    private static void mo191k() {
        synchronized (f149h) {
            Iterator<WeakReference<C0035f>> it = f148g.iterator();
            while (it.hasNext()) {
                C0035f fVar = (C0035f) it.next().get();
                if (fVar != null) {
                    fVar.mo154a();
                }
            }
        }
    }

    /* renamed from: l */
    public static int m117l() {
        return f147f;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo147a(int i);

    /* renamed from: a */
    public void mo148a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo149a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo150a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo151a(View view);

    /* renamed from: a */
    public abstract void mo152a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo153a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo154a();

    /* renamed from: b */
    public int mo155b() {
        return -100;
    }

    /* renamed from: b */
    public abstract void mo156b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo157b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo158b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo159c();

    /* renamed from: c */
    public abstract void mo160c(int i);

    /* renamed from: c */
    public abstract void mo161c(Bundle bundle);

    /* renamed from: d */
    public abstract C0026a mo162d();

    /* renamed from: d */
    public void mo163d(int i) {
    }

    /* renamed from: e */
    public abstract void mo164e();

    /* renamed from: f */
    public abstract void mo165f();

    /* renamed from: g */
    public abstract void mo166g();

    /* renamed from: h */
    public abstract void mo167h();

    /* renamed from: i */
    public abstract void mo168i();

    /* renamed from: j */
    public abstract void mo169j();
}
