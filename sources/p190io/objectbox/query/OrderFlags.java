package p190io.objectbox.query;

import p190io.objectbox.android.BuildConfig;

/* renamed from: io.objectbox.query.OrderFlags */
public final class OrderFlags {
    public static final int CASE_SENSITIVE = 2;
    public static final int DESCENDING = 1;
    public static final int NULLS_LAST = 8;
    public static final int NULLS_ZERO = 16;
    public static final int UNSIGNED = 4;
    public static final String[] names = {"DESCENDING", "CASE_SENSITIVE", BuildConfig.FLAVOR, "UNSIGNED", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "NULLS_LAST", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "NULLS_ZERO"};

    private OrderFlags() {
    }

    public static String name(int i) {
        return names[i - 1];
    }
}
