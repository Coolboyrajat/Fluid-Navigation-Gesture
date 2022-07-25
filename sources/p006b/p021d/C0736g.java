package p006b.p021d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: b.d.g */
public class C0736g<K, V> {

    /* renamed from: i */
    static Object[] f2856i;

    /* renamed from: j */
    static int f2857j;

    /* renamed from: k */
    static Object[] f2858k;

    /* renamed from: l */
    static int f2859l;

    /* renamed from: f */
    int[] f2860f;

    /* renamed from: g */
    Object[] f2861g;

    /* renamed from: h */
    int f2862h;

    public C0736g() {
        this.f2860f = C0727c.f2825a;
        this.f2861g = C0727c.f2827c;
        this.f2862h = 0;
    }

    public C0736g(int i) {
        if (i == 0) {
            this.f2860f = C0727c.f2825a;
            this.f2861g = C0727c.f2827c;
        } else {
            m4035e(i);
        }
        this.f2862h = 0;
    }

    public C0736g(C0736g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo4192a(gVar);
        }
    }

    /* renamed from: a */
    private static int m4033a(int[] iArr, int i, int i2) {
        try {
            return C0727c.m3989a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m4034a(int[] iArr, Object[] objArr, int i) {
        Class<C0736g> cls = C0736g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f2859l < 10) {
                    objArr[0] = f2858k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2858k = objArr;
                    f2859l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f2857j < 10) {
                    objArr[0] = f2856i;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2856i = objArr;
                    f2857j++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m4035e(int i) {
        Class<C0736g> cls = C0736g.class;
        if (i == 8) {
            synchronized (cls) {
                if (f2858k != null) {
                    Object[] objArr = f2858k;
                    this.f2861g = objArr;
                    f2858k = (Object[]) objArr[0];
                    this.f2860f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2859l--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f2856i != null) {
                    Object[] objArr2 = f2856i;
                    this.f2861g = objArr2;
                    f2856i = (Object[]) objArr2[0];
                    this.f2860f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2857j--;
                    return;
                }
            }
        }
        this.f2860f = new int[i];
        this.f2861g = new Object[(i << 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4187a() {
        int i = this.f2862h;
        if (i == 0) {
            return -1;
        }
        int a = m4033a(this.f2860f, i, 0);
        if (a < 0 || this.f2861g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2860f[i2] == 0) {
            if (this.f2861g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f2860f[i3] == 0) {
            if (this.f2861g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    public int mo4188a(Object obj) {
        return obj == null ? mo4187a() : mo4189a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo4189a(Object obj, int i) {
        int i2 = this.f2862h;
        if (i2 == 0) {
            return -1;
        }
        int a = m4033a(this.f2860f, i2, i);
        if (a < 0 || obj.equals(this.f2861g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2860f[i3] == i) {
            if (obj.equals(this.f2861g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2860f[i4] == i) {
            if (obj.equals(this.f2861g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    public V mo4190a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f2861g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo4191a(int i) {
        int i2 = this.f2862h;
        int[] iArr = this.f2860f;
        if (iArr.length < i) {
            Object[] objArr = this.f2861g;
            m4035e(i);
            if (this.f2862h > 0) {
                System.arraycopy(iArr, 0, this.f2860f, 0, i2);
                System.arraycopy(objArr, 0, this.f2861g, 0, i2 << 1);
            }
            m4034a(iArr, objArr, i2);
        }
        if (this.f2862h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo4192a(C0736g<? extends K, ? extends V> gVar) {
        int i = gVar.f2862h;
        mo4191a(this.f2862h + i);
        if (this.f2862h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo4194b(i2), gVar.mo4199d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f2860f, 0, this.f2860f, 0, i);
            System.arraycopy(gVar.f2861g, 0, this.f2861g, 0, i << 1);
            this.f2862h = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo4193b(Object obj) {
        int i = this.f2862h * 2;
        Object[] objArr = this.f2861g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo4194b(int i) {
        return this.f2861g[i << 1];
    }

    /* renamed from: c */
    public V mo4195c(int i) {
        int i2;
        V[] vArr = this.f2861g;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f2862h;
        if (i4 <= 1) {
            m4034a(this.f2860f, (Object[]) vArr, i4);
            this.f2860f = C0727c.f2825a;
            this.f2861g = C0727c.f2827c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f2860f;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f2860f;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f2861g;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f2861g;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f2860f;
                Object[] objArr3 = this.f2861g;
                m4035e(i5);
                if (i4 == this.f2862h) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f2860f, 0, i);
                        System.arraycopy(objArr3, 0, this.f2861g, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f2860f, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f2861g, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f2862h) {
            this.f2862h = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f2862h;
        if (i > 0) {
            int[] iArr = this.f2860f;
            Object[] objArr = this.f2861g;
            this.f2860f = C0727c.f2825a;
            this.f2861g = C0727c.f2827c;
            this.f2862h = 0;
            m4034a(iArr, objArr, i);
        }
        if (this.f2862h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo4188a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo4193b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo4199d(int i) {
        return this.f2861g[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0736g) {
            C0736g gVar = (C0736g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f2862h) {
                try {
                    Object b = mo4194b(i);
                    Object d = mo4199d(i);
                    Object obj2 = gVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !gVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f2862h) {
                try {
                    Object b2 = mo4194b(i2);
                    Object d2 = mo4199d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int a = mo4188a(obj);
        return a >= 0 ? this.f2861g[(a << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f2860f;
        Object[] objArr = this.f2861g;
        int i = this.f2862h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f2862h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f2862h;
        if (k == null) {
            i2 = mo4187a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo4189a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f2861g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f2860f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f2860f;
            Object[] objArr = this.f2861g;
            m4035e(i6);
            if (i3 == this.f2862h) {
                int[] iArr2 = this.f2860f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f2861g, 0, objArr.length);
                }
                m4034a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2860f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f2861g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f2862h - i5) << 1);
        }
        int i8 = this.f2862h;
        if (i3 == i8) {
            int[] iArr4 = this.f2860f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f2861g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f2862h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int a = mo4188a(obj);
        if (a >= 0) {
            return mo4195c(a);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a = mo4188a(obj);
        if (a < 0) {
            return false;
        }
        Object d = mo4199d(a);
        if (obj2 != d && (obj2 == null || !obj2.equals(d))) {
            return false;
        }
        mo4195c(a);
        return true;
    }

    public V replace(K k, V v) {
        int a = mo4188a((Object) k);
        if (a >= 0) {
            return mo4190a(a, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a = mo4188a((Object) k);
        if (a < 0) {
            return false;
        }
        V d = mo4199d(a);
        if (d != v && (v == null || !v.equals(d))) {
            return false;
        }
        mo4190a(a, v2);
        return true;
    }

    public int size() {
        return this.f2862h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2862h * 28);
        sb.append('{');
        for (int i = 0; i < this.f2862h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo4194b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object d = mo4199d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
