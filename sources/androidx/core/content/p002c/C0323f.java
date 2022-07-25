package androidx.core.content.p002c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import p006b.p026g.p034j.C0837h;

/* renamed from: androidx.core.content.c.f */
public final class C0323f {

    /* renamed from: androidx.core.content.c.f$a */
    public static abstract class C0324a {

        /* renamed from: androidx.core.content.c.f$a$a */
        class C0325a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Typeface f1557f;

            C0325a(Typeface typeface) {
                this.f1557f = typeface;
            }

            public void run() {
                C0324a.this.mo1672a(this.f1557f);
            }
        }

        /* renamed from: androidx.core.content.c.f$a$b */
        class C0326b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f1559f;

            C0326b(int i) {
                this.f1559f = i;
            }

            public void run() {
                C0324a.this.mo1671a(this.f1559f);
            }
        }

        /* renamed from: a */
        public abstract void mo1671a(int i);

        /* renamed from: a */
        public final void mo1976a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0326b(i));
        }

        /* renamed from: a */
        public abstract void mo1672a(Typeface typeface);

        /* renamed from: a */
        public final void mo1977a(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0325a(typeface));
        }
    }

    /* renamed from: a */
    public static Typeface m1580a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m1582a(context, i, new TypedValue(), 0, (C0324a) null, (Handler) null, false);
    }

    /* renamed from: a */
    public static Typeface m1581a(Context context, int i, TypedValue typedValue, int i2, C0324a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m1582a(context, i, typedValue, i2, aVar, (Handler) null, true);
    }

    /* renamed from: a */
    private static Typeface m1582a(Context context, int i, TypedValue typedValue, int i2, C0324a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m1583a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m1583a(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, androidx.core.content.p002c.C0323f.C0324a r20, android.os.Handler r21, boolean r22) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x009a
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = 0
            r14 = -3
            if (r1 != 0) goto L_0x0026
            if (r9 == 0) goto L_0x0025
            r9.mo1976a((int) r14, (android.os.Handler) r10)
        L_0x0025:
            return r13
        L_0x0026:
            android.graphics.Typeface r1 = p006b.p026g.p027d.C0784c.m4376b((android.content.res.Resources) r0, (int) r4, (int) r5)
            if (r1 == 0) goto L_0x0032
            if (r9 == 0) goto L_0x0031
            r9.mo1977a((android.graphics.Typeface) r1, (android.os.Handler) r10)
        L_0x0031:
            return r1
        L_0x0032:
            java.lang.String r1 = r12.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            androidx.core.content.c.c$a r2 = androidx.core.content.p002c.C0315c.m1556a((org.xmlpull.v1.XmlPullParser) r1, (android.content.res.Resources) r0)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0052
            r9.mo1976a((int) r14, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
        L_0x0052:
            return r13
        L_0x0053:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = p006b.p026g.p027d.C0784c.m4373a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r15
            android.graphics.Typeface r0 = p006b.p026g.p027d.C0784c.m4370a(r15, r0, r4, r12, r5)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo1977a((android.graphics.Typeface) r0, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo1976a((int) r14, (android.os.Handler) r10)     // Catch:{ XmlPullParserException -> 0x007f, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0087
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0087:
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            if (r9 == 0) goto L_0x0099
            r9.mo1976a((int) r14, (android.os.Handler) r10)
        L_0x0099:
            return r13
        L_0x009a:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p002c.C0323f.m1583a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Drawable m1584a(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    /* renamed from: a */
    public static void m1585a(Context context, int i, C0324a aVar, Handler handler) {
        C0837h.m4534a(aVar);
        if (context.isRestricted()) {
            aVar.mo1976a(-4, handler);
            return;
        }
        m1582a(context, i, new TypedValue(), 0, aVar, handler, false);
    }
}
