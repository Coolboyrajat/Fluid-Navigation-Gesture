package p006b.p026g.p027d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p002c.C0315c;
import androidx.core.content.p002c.C0323f;
import p006b.p021d.C0729e;
import p006b.p026g.p032h.C0800b;

/* renamed from: b.g.d.c */
public class C0784c {

    /* renamed from: a */
    private static final C0789h f3137a;

    /* renamed from: b */
    private static final C0729e<String, Typeface> f3138b = new C0729e<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        f3137a = i >= 28 ? new C0788g() : i >= 26 ? new C0787f() : (i < 24 || !C0786e.m4385a()) ? Build.VERSION.SDK_INT >= 21 ? new C0785d() : new C0789h() : new C0786e();
    }

    /* renamed from: a */
    public static Typeface m4370a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f3137a.mo4456a(context, resources, i, str, i2);
        if (a != null) {
            f3138b.mo4120a(m4374a(resources, i, i2), a);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = m4375b(r2, r3, r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m4371a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = m4375b((android.content.Context) r2, (android.graphics.Typeface) r3, (int) r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p027d.C0784c.m4371a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Typeface m4372a(Context context, CancellationSignal cancellationSignal, C0800b.C0806f[] fVarArr, int i) {
        return f3137a.mo4454a(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m4373a(Context context, C0315c.C0316a aVar, Resources resources, int i, int i2, C0323f.C0324a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0315c.C0319d) {
            C0315c.C0319d dVar = (C0315c.C0319d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo1973a() == 0) {
                z2 = true;
            }
            typeface = C0800b.m4449a(context, dVar.mo1974b(), aVar2, handler, z2, z ? dVar.mo1975c() : -1, i2);
        } else {
            typeface = f3137a.mo4455a(context, (C0315c.C0317b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo1977a(typeface, handler);
                } else {
                    aVar2.mo1976a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3138b.mo4120a(m4374a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    private static String m4374a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: b */
    private static Typeface m4375b(Context context, Typeface typeface, int i) {
        C0315c.C0317b a = f3137a.mo4466a(typeface);
        if (a == null) {
            return null;
        }
        return f3137a.mo4455a(context, a, context.getResources(), i);
    }

    /* renamed from: b */
    public static Typeface m4376b(Resources resources, int i, int i2) {
        return f3138b.mo4124b(m4374a(resources, i, i2));
    }
}
