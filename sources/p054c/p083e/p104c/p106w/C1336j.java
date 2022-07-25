package p054c.p083e.p104c.p106w;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: c.e.c.w.j */
public class C1336j {
    /* renamed from: a */
    private static String m6279a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: a */
    public static DateFormat m6280a(int i, int i2) {
        return new SimpleDateFormat(m6279a(i) + " " + m6281b(i2), Locale.US);
    }

    /* renamed from: b */
    private static String m6281b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }
}
