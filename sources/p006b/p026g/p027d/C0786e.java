package p006b.p026g.p027d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p002c.C0315c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p006b.p021d.C0736g;
import p006b.p026g.p032h.C0800b;

/* renamed from: b.g.d.e */
class C0786e extends C0789h {

    /* renamed from: b */
    private static final Class f3144b;

    /* renamed from: c */
    private static final Constructor f3145c;

    /* renamed from: d */
    private static final Method f3146d;

    /* renamed from: e */
    private static final Method f3147e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f3145c = constructor;
        f3144b = cls;
        f3146d = method;
        f3147e = method2;
    }

    C0786e() {
    }

    /* renamed from: a */
    private static Typeface m4384a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3144b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3147e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m4385a() {
        if (f3146d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f3146d != null;
    }

    /* renamed from: a */
    private static boolean m4386a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3146d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static Object m4387b() {
        try {
            return f3145c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo4454a(Context context, CancellationSignal cancellationSignal, C0800b.C0806f[] fVarArr, int i) {
        Object b = m4387b();
        if (b == null) {
            return null;
        }
        C0736g gVar = new C0736g();
        for (C0800b.C0806f fVar : fVarArr) {
            Uri c = fVar.mo4491c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C0793i.m4431a(context, cancellationSignal, c);
                gVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m4386a(b, byteBuffer, fVar.mo4490b(), fVar.mo4492d(), fVar.mo4493e())) {
                return null;
            }
        }
        Typeface a = m4384a(b);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }

    /* renamed from: a */
    public Typeface mo4455a(Context context, C0315c.C0317b bVar, Resources resources, int i) {
        Object b = m4387b();
        if (b == null) {
            return null;
        }
        for (C0315c.C0318c cVar : bVar.mo1966a()) {
            ByteBuffer a = C0793i.m4430a(context, resources, cVar.mo1968b());
            if (a == null || !m4386a(b, a, cVar.mo1969c(), cVar.mo1971e(), cVar.mo1972f())) {
                return null;
            }
        }
        return m4384a(b);
    }
}
