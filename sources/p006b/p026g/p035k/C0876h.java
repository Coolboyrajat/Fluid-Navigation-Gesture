package p006b.p026g.p035k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p006b.p026g.p028e.p029a.C0795b;

/* renamed from: b.g.k.h */
public final class C0876h {
    /* renamed from: a */
    public static MenuItem m4690a(MenuItem menuItem, C0841b bVar) {
        if (menuItem instanceof C0795b) {
            return ((C0795b) menuItem).mo326a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m4691a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0795b) {
            ((C0795b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m4692a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0795b) {
            ((C0795b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4693a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C0795b) {
            ((C0795b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m4694a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0795b) {
            ((C0795b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m4695b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0795b) {
            ((C0795b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: b */
    public static void m4696b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0795b) {
            ((C0795b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
