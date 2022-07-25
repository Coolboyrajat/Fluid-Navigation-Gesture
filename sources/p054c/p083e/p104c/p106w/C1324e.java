package p054c.p083e.p104c.p106w;

/* renamed from: c.e.c.w.e */
public final class C1324e {

    /* renamed from: a */
    private static final int f4186a = m6257a();

    /* renamed from: a */
    private static int m6257a() {
        return m6260b(System.getProperty("java.version"));
    }

    /* renamed from: a */
    private static int m6258a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m6259b() {
        return f4186a;
    }

    /* renamed from: b */
    static int m6260b(String str) {
        int c = m6261c(str);
        if (c == -1) {
            c = m6258a(str);
        }
        if (c == -1) {
            return 6;
        }
        return c;
    }

    /* renamed from: c */
    private static int m6261c(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m6262c() {
        return f4186a >= 9;
    }
}
