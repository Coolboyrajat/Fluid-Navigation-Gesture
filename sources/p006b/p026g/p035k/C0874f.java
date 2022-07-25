package p006b.p026g.p035k;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: b.g.k.f */
public final class C0874f {

    /* renamed from: a */
    private static Field f3306a;

    /* renamed from: b */
    private static boolean f3307b;

    /* renamed from: a */
    private static void m4686a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f3307b) {
            try {
                f3306a = LayoutInflater.class.getDeclaredField("mFactory2");
                f3306a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f3307b = true;
        }
        Field field = f3306a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m4687b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m4686a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m4686a(layoutInflater, factory2);
            }
        }
    }
}
