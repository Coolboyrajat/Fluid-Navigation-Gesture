package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C0342c {

    /* renamed from: a */
    private static Field f1647a;

    /* renamed from: b */
    private static boolean f1648b;

    /* renamed from: a */
    public static Drawable m1718a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1648b) {
            try {
                f1647a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1647a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f1648b = true;
        }
        Field field = f1647a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f1647a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m1719a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0350j) {
            ((C0350j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1720a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0350j) {
            ((C0350j) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: b */
    public static ColorStateList m1721b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof C0350j) {
            return ((C0350j) compoundButton).getSupportButtonTintList();
        }
        return null;
    }
}
