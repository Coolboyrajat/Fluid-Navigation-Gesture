package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p021d.C0723a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C0631a {

    /* renamed from: a */
    protected final C0723a<String, Method> f2515a;

    /* renamed from: b */
    protected final C0723a<String, Method> f2516b;

    /* renamed from: c */
    protected final C0723a<String, Class> f2517c;

    public C0631a(C0723a<String, Method> aVar, C0723a<String, Method> aVar2, C0723a<String, Class> aVar3) {
        this.f2515a = aVar;
        this.f2516b = aVar2;
        this.f2517c = aVar3;
    }

    /* renamed from: a */
    private Class m3546a(Class<? extends C0633c> cls) {
        Class cls2 = this.f2517c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f2517c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: b */
    private Method m3547b(Class cls) {
        Method method = this.f2516b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class a = m3546a((Class<? extends C0633c>) cls);
        System.currentTimeMillis();
        Method declaredMethod = a.getDeclaredMethod("write", new Class[]{cls, C0631a.class});
        this.f2516b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Method m3548b(String str) {
        Class<C0631a> cls = C0631a.class;
        Method method = this.f2515a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f2515a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private void m3549b(C0633c cVar) {
        try {
            mo3651a(m3546a((Class<? extends C0633c>) cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: a */
    public int mo3640a(int i, int i2) {
        return !mo3655a(i2) ? i : mo3672g();
    }

    /* renamed from: a */
    public <T extends Parcelable> T mo3641a(T t, int i) {
        return !mo3655a(i) ? t : mo3673h();
    }

    /* renamed from: a */
    public <T extends C0633c> T mo3642a(T t, int i) {
        return !mo3655a(i) ? t : mo3675j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0633c> T mo3643a(String str, C0631a aVar) {
        try {
            return (C0633c) m3548b(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    public CharSequence mo3644a(CharSequence charSequence, int i) {
        return !mo3655a(i) ? charSequence : mo3671f();
    }

    /* renamed from: a */
    public String mo3645a(String str, int i) {
        return !mo3655a(i) ? str : mo3674i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3646a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3647a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3648a(C0633c cVar) {
        if (cVar == null) {
            mo3651a((String) null);
            return;
        }
        m3549b(cVar);
        C0631a b = mo3658b();
        mo3649a(cVar, b);
        b.mo3646a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0633c> void mo3649a(T t, C0631a aVar) {
        try {
            m3547b((Class) t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3650a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3651a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3652a(boolean z);

    /* renamed from: a */
    public void mo3653a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3654a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3655a(int i);

    /* renamed from: a */
    public boolean mo3656a(boolean z, int i) {
        return !mo3655a(i) ? z : mo3669d();
    }

    /* renamed from: a */
    public byte[] mo3657a(byte[] bArr, int i) {
        return !mo3655a(i) ? bArr : mo3670e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0631a mo3658b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3659b(int i);

    /* renamed from: b */
    public void mo3660b(int i, int i2) {
        mo3659b(i2);
        mo3667c(i);
    }

    /* renamed from: b */
    public void mo3661b(Parcelable parcelable, int i) {
        mo3659b(i);
        mo3647a(parcelable);
    }

    /* renamed from: b */
    public void mo3662b(C0633c cVar, int i) {
        mo3659b(i);
        mo3648a(cVar);
    }

    /* renamed from: b */
    public void mo3663b(CharSequence charSequence, int i) {
        mo3659b(i);
        mo3650a(charSequence);
    }

    /* renamed from: b */
    public void mo3664b(String str, int i) {
        mo3659b(i);
        mo3651a(str);
    }

    /* renamed from: b */
    public void mo3665b(boolean z, int i) {
        mo3659b(i);
        mo3652a(z);
    }

    /* renamed from: b */
    public void mo3666b(byte[] bArr, int i) {
        mo3659b(i);
        mo3654a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3667c(int i);

    /* renamed from: c */
    public boolean mo3668c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo3669d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo3670e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract CharSequence mo3671f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract int mo3672g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo3673h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo3674i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends C0633c> T mo3675j() {
        String i = mo3674i();
        if (i == null) {
            return null;
        }
        return mo3643a(i, mo3658b());
    }
}
