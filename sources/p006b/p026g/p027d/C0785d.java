package p006b.p026g.p027d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p002c.C0315c;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.d.d */
class C0785d extends C0789h {

    /* renamed from: b */
    private static Class f3139b;

    /* renamed from: c */
    private static Constructor f3140c;

    /* renamed from: d */
    private static Method f3141d;

    /* renamed from: e */
    private static Method f3142e;

    /* renamed from: f */
    private static boolean f3143f;

    C0785d() {
    }

    /* renamed from: a */
    private static Typeface mo4457a(Object obj) {
        mo4458a();
        try {
            Object newInstance = Array.newInstance(f3139b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3142e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private File m4378a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static void mo4458a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f3143f) {
            f3143f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f3140c = constructor;
            f3139b = cls;
            f3141d = method;
            f3142e = method2;
        }
    }

    /* renamed from: a */
    private static boolean m4380a(Object obj, String str, int i, boolean z) {
        mo4458a();
        try {
            return ((Boolean) f3141d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m4381b() {
        mo4458a();
        try {
            return f3140c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005c, code lost:
        if (r5 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0066, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo4454a(android.content.Context r4, android.os.CancellationSignal r5, p006b.p026g.p032h.C0800b.C0806f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            b.g.h.b$f r6 = r3.mo4467a((p006b.p026g.p032h.C0800b.C0806f[]) r6, (int) r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.mo4491c()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0067 }
            if (r5 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001f
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.File r6 = r3.m4378a((android.os.ParcelFileDescriptor) r5)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x0036
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0036:
            return r4
        L_0x0037:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0059 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            android.graphics.Typeface r4 = super.mo4465a((android.content.Context) r4, (java.io.InputStream) r6)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x004c:
            return r4
        L_0x004d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004f:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r7     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p026g.p027d.C0785d.mo4454a(android.content.Context, android.os.CancellationSignal, b.g.h.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo4455a(Context context, C0315c.C0317b bVar, Resources resources, int i) {
        Object b = m4381b();
        C0315c.C0318c[] a = bVar.mo1966a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0315c.C0318c cVar = a[i2];
            File a2 = C0793i.m4429a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!C0793i.m4434a(a2, resources, cVar.mo1968b())) {
                    a2.delete();
                    return null;
                } else if (!m4380a(b, a2.getPath(), cVar.mo1971e(), cVar.mo1972f())) {
                    return null;
                } else {
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return mo4457a(b);
    }
}
