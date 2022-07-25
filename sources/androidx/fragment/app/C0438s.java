package androidx.fragment.app;

import androidx.lifecycle.C0481i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.s */
public abstract class C0438s {

    /* renamed from: a */
    ArrayList<C0439a> f1925a = new ArrayList<>();

    /* renamed from: b */
    int f1926b;

    /* renamed from: c */
    int f1927c;

    /* renamed from: d */
    int f1928d;

    /* renamed from: e */
    int f1929e;

    /* renamed from: f */
    int f1930f;

    /* renamed from: g */
    boolean f1931g;

    /* renamed from: h */
    String f1932h;

    /* renamed from: i */
    int f1933i;

    /* renamed from: j */
    CharSequence f1934j;

    /* renamed from: k */
    int f1935k;

    /* renamed from: l */
    CharSequence f1936l;

    /* renamed from: m */
    ArrayList<String> f1937m;

    /* renamed from: n */
    ArrayList<String> f1938n;

    /* renamed from: o */
    boolean f1939o = false;

    /* renamed from: p */
    ArrayList<Runnable> f1940p;

    /* renamed from: androidx.fragment.app.s$a */
    static final class C0439a {

        /* renamed from: a */
        int f1941a;

        /* renamed from: b */
        Fragment f1942b;

        /* renamed from: c */
        int f1943c;

        /* renamed from: d */
        int f1944d;

        /* renamed from: e */
        int f1945e;

        /* renamed from: f */
        int f1946f;

        /* renamed from: g */
        C0481i.C0483b f1947g;

        /* renamed from: h */
        C0481i.C0483b f1948h;

        C0439a() {
        }

        C0439a(int i, Fragment fragment) {
            this.f1941a = i;
            this.f1942b = fragment;
            C0481i.C0483b bVar = C0481i.C0483b.RESUMED;
            this.f1947g = bVar;
            this.f1948h = bVar;
        }

        C0439a(int i, Fragment fragment, C0481i.C0483b bVar) {
            this.f1941a = i;
            this.f1942b = fragment;
            this.f1947g = fragment.f1728U;
            this.f1948h = bVar;
        }
    }

    C0438s(C0406h hVar, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public abstract int mo2322a();

    /* renamed from: a */
    public C0438s mo2590a(int i) {
        this.f1930f = i;
        return this;
    }

    /* renamed from: a */
    public C0438s mo2591a(int i, Fragment fragment) {
        mo2596b(i, fragment, (String) null);
        return this;
    }

    /* renamed from: a */
    public C0438s mo2592a(int i, Fragment fragment, String str) {
        mo2326a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0438s mo2593a(Fragment fragment) {
        mo2595a(new C0439a(7, fragment));
        return this;
    }

    /* renamed from: a */
    public C0438s mo2325a(Fragment fragment, C0481i.C0483b bVar) {
        mo2595a(new C0439a(10, fragment, bVar));
        return this;
    }

    /* renamed from: a */
    public C0438s mo2594a(Fragment fragment, String str) {
        mo2326a(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2326a(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f1710C;
            if (str2 == null || str.equals(str2)) {
                fragment.f1710C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f1710C + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f1708A;
                if (i3 == 0 || i3 == i) {
                    fragment.f1708A = i;
                    fragment.f1709B = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f1708A + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo2595a(new C0439a(i2, fragment));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2595a(C0439a aVar) {
        this.f1925a.add(aVar);
        aVar.f1943c = this.f1926b;
        aVar.f1944d = this.f1927c;
        aVar.f1945e = this.f1928d;
        aVar.f1946f = this.f1929e;
    }

    /* renamed from: b */
    public abstract int mo2332b();

    /* renamed from: b */
    public C0438s mo2596b(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo2326a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public C0438s mo2334b(Fragment fragment) {
        mo2595a(new C0439a(6, fragment));
        return this;
    }

    /* renamed from: c */
    public C0438s mo2337c(Fragment fragment) {
        mo2595a(new C0439a(3, fragment));
        return this;
    }

    /* renamed from: c */
    public abstract void mo2338c();

    /* renamed from: d */
    public C0438s mo2597d() {
        if (!this.f1931g) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: d */
    public C0438s mo2340d(Fragment fragment) {
        mo2595a(new C0439a(8, fragment));
        return this;
    }
}
