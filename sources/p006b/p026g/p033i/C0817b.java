package p006b.p026g.p033i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: b.g.i.b */
public final class C0817b {

    /* renamed from: a */
    private static Method f3219a;

    /* renamed from: b */
    private static Method f3220b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f3219a = cls.getMethod("getScript", new Class[]{String.class});
                    f3220b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception e) {
                f3219a = null;
                f3220b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f3220b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m4496a(String str) {
        try {
            if (f3219a != null) {
                return (String) f3219a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: a */
    private static String m4497a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f3220b != null) {
                return (String) f3220b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    /* renamed from: b */
    public static String m4498b(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f3220b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String a = m4497a(locale);
            if (a != null) {
                return m4496a(a);
            }
            return null;
        }
    }
}
