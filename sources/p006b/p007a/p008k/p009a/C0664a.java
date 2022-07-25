package p006b.p007a.p008k.p009a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0185h0;
import androidx.core.content.C0311a;
import androidx.core.content.p002c.C0313a;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.a.k.a.a */
public final class C0664a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2611a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0665a>> f2612b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f2613c = new Object();

    /* renamed from: b.a.k.a.a$a */
    private static class C0665a {

        /* renamed from: a */
        final ColorStateList f2614a;

        /* renamed from: b */
        final Configuration f2615b;

        C0665a(ColorStateList colorStateList, Configuration configuration) {
            this.f2614a = colorStateList;
            this.f2615b = configuration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3678a(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f2613c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<b.a.k.a.a$a>> r1 = f2612b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            b.a.k.a.a$a r2 = (p006b.p007a.p008k.p009a.C0664a.C0665a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f2615b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f2614a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p007a.p008k.p009a.C0664a.m3678a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static TypedValue m3679a() {
        TypedValue typedValue = f2611a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2611a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m3680a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f2613c) {
            SparseArray sparseArray = f2612b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2612b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0665a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m3681b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m3678a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m3683d(context, i);
        if (d == null) {
            return C0311a.m1532b(context, i);
        }
        m3680a(context, i, d);
        return d;
    }

    /* renamed from: c */
    public static Drawable m3682c(Context context, int i) {
        return C0185h0.m929a().mo1371a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m3683d(Context context, int i) {
        if (m3684e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0313a.m1539a(resources, (XmlPullParser) resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m3684e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m3679a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
