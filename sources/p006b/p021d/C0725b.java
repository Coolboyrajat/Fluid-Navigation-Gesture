package p006b.p021d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: b.d.b */
public final class C0725b<E> implements Collection<E>, Set<E> {

    /* renamed from: j */
    private static final int[] f2814j = new int[0];

    /* renamed from: k */
    private static final Object[] f2815k = new Object[0];

    /* renamed from: l */
    private static Object[] f2816l;

    /* renamed from: m */
    private static int f2817m;

    /* renamed from: n */
    private static Object[] f2818n;

    /* renamed from: o */
    private static int f2819o;

    /* renamed from: f */
    private int[] f2820f;

    /* renamed from: g */
    Object[] f2821g;

    /* renamed from: h */
    int f2822h;

    /* renamed from: i */
    private C0730f<E, E> f2823i;

    /* renamed from: b.d.b$a */
    class C0726a extends C0730f<E, E> {
        C0726a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo4076a(Object obj) {
            return C0725b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo4077a(int i, int i2) {
            return C0725b.this.f2821g[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo4078a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4079a() {
            C0725b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4080a(int i) {
            C0725b.this.mo4088b(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4081a(E e, E e2) {
            C0725b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo4082b(Object obj) {
            return C0725b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<E, E> mo4083b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo4084c() {
            return C0725b.this.f2822h;
        }
    }

    public C0725b() {
        this(0);
    }

    public C0725b(int i) {
        if (i == 0) {
            this.f2820f = f2814j;
            this.f2821g = f2815k;
        } else {
            m3975d(i);
        }
        this.f2822h = 0;
    }

    /* renamed from: a */
    private int m3971a(Object obj, int i) {
        int i2 = this.f2822h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0727c.m3989a(this.f2820f, i2, i);
        if (a < 0 || obj.equals(this.f2821g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f2820f[i3] == i) {
            if (obj.equals(this.f2821g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f2820f[i4] == i) {
            if (obj.equals(this.f2821g[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private C0730f<E, E> m3972a() {
        if (this.f2823i == null) {
            this.f2823i = new C0726a();
        }
        return this.f2823i;
    }

    /* renamed from: a */
    private static void m3973a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0725b.class) {
                if (f2819o < 10) {
                    objArr[0] = f2818n;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f2818n = objArr;
                    f2819o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0725b.class) {
                if (f2817m < 10) {
                    objArr[0] = f2816l;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2816l = objArr;
                    f2817m++;
                }
            }
        }
    }

    /* renamed from: b */
    private int m3974b() {
        int i = this.f2822h;
        if (i == 0) {
            return -1;
        }
        int a = C0727c.m3989a(this.f2820f, i, 0);
        if (a < 0 || this.f2821g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f2820f[i2] == 0) {
            if (this.f2821g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f2820f[i3] == 0) {
            if (this.f2821g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: d */
    private void m3975d(int i) {
        if (i == 8) {
            synchronized (C0725b.class) {
                if (f2818n != null) {
                    Object[] objArr = f2818n;
                    this.f2821g = objArr;
                    f2818n = (Object[]) objArr[0];
                    this.f2820f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2819o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0725b.class) {
                if (f2816l != null) {
                    Object[] objArr2 = f2816l;
                    this.f2821g = objArr2;
                    f2816l = (Object[]) objArr2[0];
                    this.f2820f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2817m--;
                    return;
                }
            }
        }
        this.f2820f = new int[i];
        this.f2821g = new Object[i];
    }

    /* renamed from: a */
    public void mo4085a(int i) {
        int[] iArr = this.f2820f;
        if (iArr.length < i) {
            Object[] objArr = this.f2821g;
            m3975d(i);
            int i2 = this.f2822h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2820f, 0, i2);
                System.arraycopy(objArr, 0, this.f2821g, 0, this.f2822h);
            }
            m3973a(iArr, objArr, this.f2822h);
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m3974b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m3971a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f2822h;
        if (i4 >= this.f2820f.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f2820f;
            Object[] objArr = this.f2821g;
            m3975d(i5);
            int[] iArr2 = this.f2820f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2821g, 0, objArr.length);
            }
            m3973a(iArr, objArr, this.f2822h);
        }
        int i6 = this.f2822h;
        if (i3 < i6) {
            int[] iArr3 = this.f2820f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2821g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2822h - i3);
        }
        this.f2820f[i3] = i;
        this.f2821g[i3] = e;
        this.f2822h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo4085a(this.f2822h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public E mo4088b(int i) {
        E[] eArr = this.f2821g;
        E e = eArr[i];
        int i2 = this.f2822h;
        if (i2 <= 1) {
            m3973a(this.f2820f, eArr, i2);
            this.f2820f = f2814j;
            this.f2821g = f2815k;
            this.f2822h = 0;
        } else {
            int[] iArr = this.f2820f;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f2822h--;
                int i4 = this.f2822h;
                if (i < i4) {
                    int[] iArr2 = this.f2820f;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f2821g;
                    System.arraycopy(objArr, i5, objArr, i, this.f2822h - i);
                }
                this.f2821g[this.f2822h] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f2820f;
                Object[] objArr2 = this.f2821g;
                m3975d(i3);
                this.f2822h--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f2820f, 0, i);
                    System.arraycopy(objArr2, 0, this.f2821g, 0, i);
                }
                int i6 = this.f2822h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f2820f, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f2821g, i, this.f2822h - i);
                }
            }
        }
        return e;
    }

    /* renamed from: c */
    public E mo4089c(int i) {
        return this.f2821g[i];
    }

    public void clear() {
        int i = this.f2822h;
        if (i != 0) {
            m3973a(this.f2820f, this.f2821g, i);
            this.f2820f = f2814j;
            this.f2821g = f2815k;
            this.f2822h = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f2822h) {
                try {
                    if (!set.contains(mo4089c(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f2820f;
        int i = this.f2822h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m3974b() : m3971a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f2822h <= 0;
    }

    public Iterator<E> iterator() {
        return m3972a().mo4129e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo4088b(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f2822h - 1; i >= 0; i--) {
            if (!collection.contains(this.f2821g[i])) {
                mo4088b(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f2822h;
    }

    public Object[] toArray() {
        int i = this.f2822h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f2821g, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2822h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2822h);
        }
        System.arraycopy(this.f2821g, 0, tArr, 0, this.f2822h);
        int length = tArr.length;
        int i = this.f2822h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2822h * 14);
        sb.append('{');
        for (int i = 0; i < this.f2822h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object c = mo4089c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
