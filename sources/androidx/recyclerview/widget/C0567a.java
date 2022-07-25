package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0607n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p006b.p026g.p034j.C0834e;
import p006b.p026g.p034j.C0835f;

/* renamed from: androidx.recyclerview.widget.a */
class C0567a implements C0607n.C0608a {

    /* renamed from: a */
    private C0834e<C0569b> f2315a;

    /* renamed from: b */
    final ArrayList<C0569b> f2316b;

    /* renamed from: c */
    final ArrayList<C0569b> f2317c;

    /* renamed from: d */
    final C0568a f2318d;

    /* renamed from: e */
    Runnable f2319e;

    /* renamed from: f */
    final boolean f2320f;

    /* renamed from: g */
    final C0607n f2321g;

    /* renamed from: h */
    private int f2322h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C0568a {
        /* renamed from: a */
        RecyclerView.C0524d0 mo3094a(int i);

        /* renamed from: a */
        void mo3095a(int i, int i2);

        /* renamed from: a */
        void mo3096a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo3097a(C0569b bVar);

        /* renamed from: b */
        void mo3098b(int i, int i2);

        /* renamed from: b */
        void mo3099b(C0569b bVar);

        /* renamed from: c */
        void mo3100c(int i, int i2);

        /* renamed from: d */
        void mo3102d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class C0569b {

        /* renamed from: a */
        int f2323a;

        /* renamed from: b */
        int f2324b;

        /* renamed from: c */
        Object f2325c;

        /* renamed from: d */
        int f2326d;

        C0569b(int i, int i2, int i3, Object obj) {
            this.f2323a = i;
            this.f2324b = i2;
            this.f2326d = i3;
            this.f2325c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo3455a() {
            int i = this.f2323a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0569b.class != obj.getClass()) {
                return false;
            }
            C0569b bVar = (C0569b) obj;
            int i = this.f2323a;
            if (i != bVar.f2323a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2326d - this.f2324b) == 1 && this.f2326d == bVar.f2324b && this.f2324b == bVar.f2326d) {
                return true;
            }
            if (this.f2326d != bVar.f2326d || this.f2324b != bVar.f2324b) {
                return false;
            }
            Object obj2 = this.f2325c;
            Object obj3 = bVar.f2325c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2323a * 31) + this.f2324b) * 31) + this.f2326d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo3455a() + ",s:" + this.f2324b + "c:" + this.f2326d + ",p:" + this.f2325c + "]";
        }
    }

    C0567a(C0568a aVar) {
        this(aVar, false);
    }

    C0567a(C0568a aVar, boolean z) {
        this.f2315a = new C0835f(30);
        this.f2316b = new ArrayList<>();
        this.f2317c = new ArrayList<>();
        this.f2322h = 0;
        this.f2318d = aVar;
        this.f2320f = z;
        this.f2321g = new C0607n(this);
    }

    /* renamed from: b */
    private void m3198b(C0569b bVar) {
        m3205g(bVar);
    }

    /* renamed from: c */
    private void m3199c(C0569b bVar) {
        m3205g(bVar);
    }

    /* renamed from: d */
    private int m3200d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f2317c.size() - 1; size >= 0; size--) {
            C0569b bVar = this.f2317c.get(size);
            int i7 = bVar.f2323a;
            if (i7 == 8) {
                int i8 = bVar.f2324b;
                int i9 = bVar.f2326d;
                if (i8 >= i9) {
                    int i10 = i9;
                    i9 = i8;
                    i8 = i10;
                }
                if (i < i8 || i > i9) {
                    int i11 = bVar.f2324b;
                    if (i < i11) {
                        if (i2 == 1) {
                            bVar.f2324b = i11 + 1;
                            i4 = bVar.f2326d + 1;
                        } else if (i2 == 2) {
                            bVar.f2324b = i11 - 1;
                            i4 = bVar.f2326d - 1;
                        }
                        bVar.f2326d = i4;
                    }
                } else {
                    int i12 = bVar.f2324b;
                    if (i8 == i12) {
                        if (i2 == 1) {
                            i6 = bVar.f2326d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f2326d - 1;
                            }
                            i++;
                        }
                        bVar.f2326d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i12 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i12 - 1;
                            }
                            i--;
                        }
                        bVar.f2324b = i5;
                        i--;
                    }
                }
            } else {
                int i13 = bVar.f2324b;
                if (i13 > i) {
                    if (i2 == 1) {
                        i3 = i13 + 1;
                    } else if (i2 == 2) {
                        i3 = i13 - 1;
                    }
                    bVar.f2324b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f2326d;
                } else if (i7 == 2) {
                    i += bVar.f2326d;
                }
            }
        }
        for (int size2 = this.f2317c.size() - 1; size2 >= 0; size2--) {
            C0569b bVar2 = this.f2317c.get(size2);
            if (bVar2.f2323a == 8) {
                int i14 = bVar2.f2326d;
                if (i14 != bVar2.f2324b && i14 >= 0) {
                }
            } else if (bVar2.f2326d > 0) {
            }
            this.f2317c.remove(size2);
            mo3441a(bVar2);
        }
        return i;
    }

    /* renamed from: d */
    private void m3201d(C0569b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f2324b;
        int i2 = bVar.f2326d + i;
        int i3 = 0;
        char c2 = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.f2318d.mo3094a(i4) != null || m3202d(i4)) {
                if (c2 == 0) {
                    m3204f(mo3439a(2, i, i3, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m3205g(mo3439a(2, i, i3, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
            c2 = c;
        }
        if (i3 != bVar.f2326d) {
            mo3441a(bVar);
            bVar = mo3439a(2, i, i3, (Object) null);
        }
        if (c2 == 0) {
            m3204f(bVar);
        } else {
            m3205g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m3202d(int i) {
        int size = this.f2317c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0569b bVar = this.f2317c.get(i2);
            int i3 = bVar.f2323a;
            if (i3 == 8) {
                if (mo3438a(bVar.f2326d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2324b;
                int i5 = bVar.f2326d + i4;
                while (i4 < i5) {
                    if (mo3438a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m3203e(C0569b bVar) {
        int i = bVar.f2324b;
        int i2 = bVar.f2326d + i;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        while (i < i2) {
            if (this.f2318d.mo3094a(i) != null || m3202d(i)) {
                if (c == 0) {
                    m3204f(mo3439a(4, i3, i4, bVar.f2325c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m3205g(mo3439a(4, i3, i4, bVar.f2325c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f2326d) {
            Object obj = bVar.f2325c;
            mo3441a(bVar);
            bVar = mo3439a(4, i3, i4, obj);
        }
        if (c == 0) {
            m3204f(bVar);
        } else {
            m3205g(bVar);
        }
    }

    /* renamed from: f */
    private void m3204f(C0569b bVar) {
        int i;
        int i2 = bVar.f2323a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m3200d(bVar.f2324b, i2);
        int i3 = bVar.f2324b;
        int i4 = bVar.f2323a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = d;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f2326d; i8++) {
            int d2 = m3200d(bVar.f2324b + (i * i8), bVar.f2323a);
            int i9 = bVar.f2323a;
            if (i9 == 2 ? d2 == i5 : i9 == 4 && d2 == i5 + 1) {
                i7++;
            } else {
                C0569b a = mo3439a(bVar.f2323a, i5, i7, bVar.f2325c);
                mo3442a(a, i6);
                mo3441a(a);
                if (bVar.f2323a == 4) {
                    i6 += i7;
                }
                i5 = d2;
                i7 = 1;
            }
        }
        Object obj = bVar.f2325c;
        mo3441a(bVar);
        if (i7 > 0) {
            C0569b a2 = mo3439a(bVar.f2323a, i5, i7, obj);
            mo3442a(a2, i6);
            mo3441a(a2);
        }
    }

    /* renamed from: g */
    private void m3205g(C0569b bVar) {
        this.f2317c.add(bVar);
        int i = bVar.f2323a;
        if (i == 1) {
            this.f2318d.mo3102d(bVar.f2324b, bVar.f2326d);
        } else if (i == 2) {
            this.f2318d.mo3100c(bVar.f2324b, bVar.f2326d);
        } else if (i == 4) {
            this.f2318d.mo3096a(bVar.f2324b, bVar.f2326d, bVar.f2325c);
        } else if (i == 8) {
            this.f2318d.mo3095a(bVar.f2324b, bVar.f2326d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: a */
    public int mo3437a(int i) {
        int size = this.f2316b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0569b bVar = this.f2316b.get(i2);
            int i3 = bVar.f2323a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2324b;
                    if (i4 <= i) {
                        int i5 = bVar.f2326d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2324b;
                    if (i6 == i) {
                        i = bVar.f2326d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2326d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2324b <= i) {
                i += bVar.f2326d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo3438a(int i, int i2) {
        int size = this.f2317c.size();
        while (i2 < size) {
            C0569b bVar = this.f2317c.get(i2);
            int i3 = bVar.f2323a;
            if (i3 == 8) {
                int i4 = bVar.f2324b;
                if (i4 == i) {
                    i = bVar.f2326d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2326d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2324b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2326d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2326d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public C0569b mo3439a(int i, int i2, int i3, Object obj) {
        C0569b a = this.f2315a.mo4543a();
        if (a == null) {
            return new C0569b(i, i2, i3, obj);
        }
        a.f2323a = i;
        a.f2324b = i2;
        a.f2326d = i3;
        a.f2325c = obj;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3440a() {
        int size = this.f2317c.size();
        for (int i = 0; i < size; i++) {
            this.f2318d.mo3097a(this.f2317c.get(i));
        }
        mo3443a((List<C0569b>) this.f2317c);
        this.f2322h = 0;
    }

    /* renamed from: a */
    public void mo3441a(C0569b bVar) {
        if (!this.f2320f) {
            bVar.f2325c = null;
            this.f2315a.mo4544a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3442a(C0569b bVar, int i) {
        this.f2318d.mo3099b(bVar);
        int i2 = bVar.f2323a;
        if (i2 == 2) {
            this.f2318d.mo3098b(i, bVar.f2326d);
        } else if (i2 == 4) {
            this.f2318d.mo3096a(i, bVar.f2326d, bVar.f2325c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3443a(List<C0569b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3441a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3444a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f2316b.add(mo3439a(8, i, i2, (Object) null));
            this.f2322h |= 8;
            return this.f2316b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3445a(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f2316b.add(mo3439a(4, i, i2, obj));
        this.f2322h |= 4;
        return this.f2316b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3446b(int i) {
        return mo3438a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3447b() {
        mo3440a();
        int size = this.f2316b.size();
        for (int i = 0; i < size; i++) {
            C0569b bVar = this.f2316b.get(i);
            int i2 = bVar.f2323a;
            if (i2 == 1) {
                this.f2318d.mo3097a(bVar);
                this.f2318d.mo3102d(bVar.f2324b, bVar.f2326d);
            } else if (i2 == 2) {
                this.f2318d.mo3097a(bVar);
                this.f2318d.mo3098b(bVar.f2324b, bVar.f2326d);
            } else if (i2 == 4) {
                this.f2318d.mo3097a(bVar);
                this.f2318d.mo3096a(bVar.f2324b, bVar.f2326d, bVar.f2325c);
            } else if (i2 == 8) {
                this.f2318d.mo3097a(bVar);
                this.f2318d.mo3095a(bVar.f2324b, bVar.f2326d);
            }
            Runnable runnable = this.f2319e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo3443a((List<C0569b>) this.f2316b);
        this.f2322h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3448b(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2316b.add(mo3439a(1, i, i2, (Object) null));
        this.f2322h |= 1;
        return this.f2316b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3449c() {
        return this.f2316b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3450c(int i) {
        return (i & this.f2322h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3451c(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2316b.add(mo3439a(2, i, i2, (Object) null));
        this.f2322h |= 2;
        return this.f2316b.size() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3452d() {
        return !this.f2317c.isEmpty() && !this.f2316b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3453e() {
        this.f2321g.mo3563a(this.f2316b);
        int size = this.f2316b.size();
        for (int i = 0; i < size; i++) {
            C0569b bVar = this.f2316b.get(i);
            int i2 = bVar.f2323a;
            if (i2 == 1) {
                m3198b(bVar);
            } else if (i2 == 2) {
                m3201d(bVar);
            } else if (i2 == 4) {
                m3203e(bVar);
            } else if (i2 == 8) {
                m3199c(bVar);
            }
            Runnable runnable = this.f2319e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2316b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3454f() {
        mo3443a((List<C0569b>) this.f2316b);
        mo3443a((List<C0569b>) this.f2317c);
        this.f2322h = 0;
    }
}
