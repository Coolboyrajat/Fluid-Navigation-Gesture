package p006b.p026g.p033i;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import p190io.objectbox.android.BuildConfig;

/* renamed from: b.g.i.f */
public final class C0829f {

    /* renamed from: a */
    private static final Locale f3242a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* renamed from: a */
    private static int m4520a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m4521b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f3242a)) {
            return 0;
        }
        String b = C0817b.m4498b(locale);
        return b == null ? m4520a(locale) : (b.equalsIgnoreCase("Arab") || b.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
