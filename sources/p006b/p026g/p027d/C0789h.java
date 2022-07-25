package p006b.p026g.p027d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p002c.C0315c;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p006b.p026g.p032h.C0800b;

/* renamed from: b.g.d.h */
class C0789h {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0315c.C0317b> f3155a = new ConcurrentHashMap<>();

    /* renamed from: b.g.d.h$a */
    class C0790a implements C0792c<C0800b.C0806f> {
        C0790a(C0789h hVar) {
        }

        /* renamed from: a */
        public int mo4469a(C0800b.C0806f fVar) {
            return fVar.mo4492d();
        }

        /* renamed from: b */
        public boolean mo4471b(C0800b.C0806f fVar) {
            return fVar.mo4493e();
        }
    }

    /* renamed from: b.g.d.h$b */
    class C0791b implements C0792c<C0315c.C0318c> {
        C0791b(C0789h hVar) {
        }

        /* renamed from: a */
        public int mo4469a(C0315c.C0318c cVar) {
            return cVar.mo1971e();
        }

        /* renamed from: b */
        public boolean mo4471b(C0315c.C0318c cVar) {
            return cVar.mo1972f();
        }
    }

    /* renamed from: b.g.d.h$c */
    private interface C0792c<T> {
        /* renamed from: a */
        int mo4469a(T t);

        /* renamed from: b */
        boolean mo4471b(T t);
    }

    C0789h() {
    }

    /* renamed from: a */
    private C0315c.C0318c m4409a(C0315c.C0317b bVar, int i) {
        return (C0315c.C0318c) m4410a(bVar.mo1966a(), i, new C0791b(this));
    }

    /* renamed from: a */
    private static <T> T m4410a(T[] tArr, int i, C0792c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo4469a(t2) - i2) * 2) + (cVar.mo4471b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    private void m4411a(Typeface typeface, C0315c.C0317b bVar) {
        long b = m4412b(typeface);
        if (b != 0) {
            this.f3155a.put(Long.valueOf(b), bVar);
        }
    }

    /* renamed from: b */
    private static long m4412b(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: a */
    public Typeface mo4456a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0793i.m4429a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0793i.m4434a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo4454a(Context context, CancellationSignal cancellationSignal, C0800b.C0806f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo4467a(fVarArr, i).mo4491c());
            try {
                Typeface a = mo4465a(context, inputStream);
                C0793i.m4433a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0793i.m4433a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0793i.m4433a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0793i.m4433a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0793i.m4433a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo4455a(Context context, C0315c.C0317b bVar, Resources resources, int i) {
        C0315c.C0318c a = m4409a(bVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C0784c.m4370a(context, resources, a.mo1968b(), a.mo1967a(), i);
        m4411a(a2, bVar);
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4465a(Context context, InputStream inputStream) {
        File a = C0793i.m4429a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0793i.m4435a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0315c.C0317b mo4466a(Typeface typeface) {
        long b = m4412b(typeface);
        if (b == 0) {
            return null;
        }
        return this.f3155a.get(Long.valueOf(b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0800b.C0806f mo4467a(C0800b.C0806f[] fVarArr, int i) {
        return (C0800b.C0806f) m4410a(fVarArr, i, new C0790a(this));
    }
}
