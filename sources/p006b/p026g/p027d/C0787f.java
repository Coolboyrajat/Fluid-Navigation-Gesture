package p006b.p026g.p027d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import androidx.core.content.p002c.C0315c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: b.g.d.f */
public class C0787f extends C0785d {

    /* renamed from: g */
    protected final Class f3148g;

    /* renamed from: h */
    protected final Constructor f3149h;

    /* renamed from: i */
    protected final Method f3150i;

    /* renamed from: j */
    protected final Method f3151j;

    /* renamed from: k */
    protected final Method f3152k;

    /* renamed from: l */
    protected final Method f3153l;

    /* renamed from: m */
    protected final Method f3154m;

    public C0787f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor constructor;
        Method method5;
        Class cls = null;
        try {
            Class a = mo4458a();
            constructor = mo4463e(a);
            method4 = mo4460b(a);
            method3 = mo4461c(a);
            method2 = mo4464f(a);
            method = mo4459a(a);
            Class cls2 = a;
            method5 = mo4462d(a);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3148g = cls;
        this.f3149h = constructor;
        this.f3150i = method4;
        this.f3151j = method3;
        this.f3152k = method2;
        this.f3153l = method;
        this.f3154m = method5;
    }

    /* renamed from: a */
    private boolean m4390a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3150i.invoke(obj, new Object[]{context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m4391a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3151j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m4392b(Object obj) {
        try {
            this.f3153l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: b */
    private boolean m4393b() {
        if (this.f3150i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3150i != null;
    }

    /* renamed from: c */
    private Object m4394c() {
        try {
            return this.f3149h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private boolean m4395c(Object obj) {
        try {
            return ((Boolean) this.f3152k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public Typeface mo4456a(Context context, Resources resources, int i, String str, int i2) {
        if (!m4393b()) {
            return super.mo4456a(context, resources, i, str, i2);
        }
        Object c = m4394c();
        if (c == null) {
            return null;
        }
        if (!m4390a(context, c, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m4392b(c);
            return null;
        } else if (!m4395c(c)) {
            return null;
        } else {
            return mo4457a(c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        throw r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4454a(android.content.Context r11, android.os.CancellationSignal r12, p006b.p026g.p032h.C0800b.C0806f[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r10.m4393b()
            if (r0 != 0) goto L_0x0058
            b.g.h.b$f r13 = r10.mo4467a((p006b.p026g.p032h.C0800b.C0806f[]) r13, (int) r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.mo4491c()     // Catch:{ IOException -> 0x0057 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0057 }
            if (r11 != 0) goto L_0x0026
            if (r11 == 0) goto L_0x0025
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0025:
            return r2
        L_0x0026:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r12.<init>(r14)     // Catch:{ all -> 0x0049 }
            int r14 = r13.mo4492d()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ all -> 0x0049 }
            boolean r13 = r13.mo4493e()     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x0048
            r11.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0048:
            return r12
        L_0x0049:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x004b }
        L_0x004b:
            r13 = move-exception
            if (r11 == 0) goto L_0x0056
            r11.close()     // Catch:{ all -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch:{ IOException -> 0x0057 }
        L_0x0056:
            throw r13     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            return r2
        L_0x0058:
            java.util.Map r11 = p006b.p026g.p032h.C0800b.m4454a((android.content.Context) r11, (p006b.p026g.p032h.C0800b.C0806f[]) r13, (android.os.CancellationSignal) r12)
            java.lang.Object r12 = r10.m4394c()
            if (r12 != 0) goto L_0x0063
            return r2
        L_0x0063:
            int r0 = r13.length
            r3 = 0
            r9 = 0
        L_0x0066:
            if (r9 >= r0) goto L_0x0093
            r4 = r13[r9]
            android.net.Uri r5 = r4.mo4491c()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0077
            goto L_0x0090
        L_0x0077:
            int r6 = r4.mo4490b()
            int r7 = r4.mo4492d()
            boolean r8 = r4.mo4493e()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m4391a((java.lang.Object) r4, (java.nio.ByteBuffer) r5, (int) r6, (int) r7, (int) r8)
            if (r3 != 0) goto L_0x008f
            r10.m4392b((java.lang.Object) r12)
            return r2
        L_0x008f:
            r3 = 1
        L_0x0090:
            int r9 = r9 + 1
            goto L_0x0066
        L_0x0093:
            if (r3 != 0) goto L_0x0099
            r10.m4392b((java.lang.Object) r12)
            return r2
        L_0x0099:
            boolean r11 = r10.m4395c((java.lang.Object) r12)
            if (r11 != 0) goto L_0x00a0
            return r2
        L_0x00a0:
            android.graphics.Typeface r11 = r10.mo4457a((java.lang.Object) r12)
            if (r11 != 0) goto L_0x00a7
            return r2
        L_0x00a7:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p027d.C0787f.mo4454a(android.content.Context, android.os.CancellationSignal, b.g.h.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo4455a(Context context, C0315c.C0317b bVar, Resources resources, int i) {
        if (!m4393b()) {
            return super.mo4455a(context, bVar, resources, i);
        }
        Object c = m4394c();
        if (c == null) {
            return null;
        }
        for (C0315c.C0318c cVar : bVar.mo1966a()) {
            if (!m4390a(context, c, cVar.mo1967a(), cVar.mo1969c(), cVar.mo1971e(), cVar.mo1972f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo1970d()))) {
                m4392b(c);
                return null;
            }
        }
        if (!m4395c(c)) {
            return null;
        }
        return mo4457a(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4457a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3148g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3154m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo4458a() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo4459a(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo4460b(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo4461c(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo4462d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Constructor mo4463e(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo4464f(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
