package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0411l;
import androidx.fragment.app.C0438s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0481i;
import java.io.PrintWriter;
import java.util.ArrayList;
import p006b.p026g.p034j.C0831b;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: androidx.fragment.app.a */
final class C0396a extends C0438s implements C0411l.C0421i, C0411l.C0426n {

    /* renamed from: q */
    final C0411l f1777q;

    /* renamed from: r */
    boolean f1778r;

    /* renamed from: s */
    int f1779s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0396a(androidx.fragment.app.C0411l r3) {
        /*
            r2 = this;
            androidx.fragment.app.h r0 = r3.mo2511p()
            androidx.fragment.app.i<?> r1 = r3.f1851o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.mo2432d()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f1779s = r0
            r2.f1777q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0396a.<init>(androidx.fragment.app.l):void");
    }

    /* renamed from: b */
    private static boolean m2001b(C0438s.C0439a aVar) {
        Fragment fragment = aVar.f1942b;
        return fragment != null && fragment.f1744p && fragment.f1719L != null && !fragment.f1712E && !fragment.f1711D && fragment.mo2245a0();
    }

    /* renamed from: a */
    public int mo2322a() {
        return mo2323a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2323a(boolean z) {
        if (!this.f1778r) {
            if (C0411l.f1831F) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0831b("FragmentManager"));
                mo2328a("  ", printWriter);
                printWriter.close();
            }
            this.f1778r = true;
            this.f1779s = this.f1931g ? this.f1777q.mo2452a() : -1;
            this.f1777q.mo2468a((C0411l.C0426n) this, z);
            return this.f1779s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo2324a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1925a.size()) {
            C0438s.C0439a aVar = this.f1925a.get(i);
            int i2 = aVar.f1941a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f1942b;
                    int i3 = fragment3.f1709B;
                    Fragment fragment4 = fragment2;
                    int i4 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList2.get(size);
                        if (fragment5.f1709B == i3) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f1925a.add(i4, new C0438s.C0439a(9, fragment5));
                                    i4++;
                                    fragment4 = null;
                                }
                                C0438s.C0439a aVar2 = new C0438s.C0439a(3, fragment5);
                                aVar2.f1943c = aVar.f1943c;
                                aVar2.f1945e = aVar.f1945e;
                                aVar2.f1944d = aVar.f1944d;
                                aVar2.f1946f = aVar.f1946f;
                                this.f1925a.add(i4, aVar2);
                                arrayList2.remove(fragment5);
                                i4++;
                            }
                        }
                    }
                    if (z) {
                        this.f1925a.remove(i4);
                        i4--;
                    } else {
                        aVar.f1941a = 1;
                        arrayList2.add(fragment3);
                    }
                    i = i4;
                    fragment2 = fragment4;
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f1942b);
                    Fragment fragment6 = aVar.f1942b;
                    if (fragment6 == fragment2) {
                        this.f1925a.add(i, new C0438s.C0439a(9, fragment6));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f1925a.add(i, new C0438s.C0439a(9, fragment2));
                        i++;
                        fragment2 = aVar.f1942b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f1942b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: a */
    public C0438s mo2325a(Fragment fragment, C0481i.C0483b bVar) {
        if (fragment.f1751w != this.f1777q) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f1777q);
        } else if (bVar.mo2703a(C0481i.C0483b.CREATED)) {
            super.mo2325a(fragment, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + C0481i.C0483b.CREATED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2326a(int i, Fragment fragment, String str, int i2) {
        super.mo2326a(i, fragment, str, i2);
        fragment.f1751w = this.f1777q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2327a(Fragment.C0395f fVar) {
        for (int i = 0; i < this.f1925a.size(); i++) {
            C0438s.C0439a aVar = this.f1925a.get(i);
            if (m2001b(aVar)) {
                aVar.f1942b.mo2240a(fVar);
            }
        }
    }

    /* renamed from: a */
    public void mo2328a(String str, PrintWriter printWriter) {
        mo2329a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo2329a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1932h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1779s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1778r);
            if (this.f1930f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1930f));
            }
            if (!(this.f1926b == 0 && this.f1927c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1926b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1927c));
            }
            if (!(this.f1928d == 0 && this.f1929e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1928d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1929e));
            }
            if (!(this.f1933i == 0 && this.f1934j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1933i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1934j);
            }
            if (!(this.f1935k == 0 && this.f1936l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1935k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1936l);
            }
        }
        if (!this.f1925a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1925a.size();
            for (int i = 0; i < size; i++) {
                C0438s.C0439a aVar = this.f1925a.get(i);
                switch (aVar.f1941a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1941a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1942b);
                if (z) {
                    if (!(aVar.f1943c == 0 && aVar.f1944d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1943c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1944d));
                    }
                    if (aVar.f1945e != 0 || aVar.f1946f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1945e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1946f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2330a(ArrayList<C0396a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1925a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1925a.get(i4).f1942b;
            int i5 = fragment != null ? fragment.f1709B : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0396a aVar = arrayList.get(i6);
                    int size2 = aVar.f1925a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f1925a.get(i7).f1942b;
                        if ((fragment2 != null ? fragment2.f1709B : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2331a(ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0411l.f1831F) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1931g) {
            return true;
        }
        this.f1777q.mo2465a(this);
        return true;
    }

    /* renamed from: b */
    public int mo2332b() {
        return mo2323a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Fragment mo2333b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1925a.size() - 1; size >= 0; size--) {
            C0438s.C0439a aVar = this.f1925a.get(size);
            int i = aVar.f1941a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1942b;
                            break;
                        case 10:
                            aVar.f1948h = aVar.f1947g;
                            break;
                    }
                }
                arrayList.add(aVar.f1942b);
            }
            arrayList.remove(aVar.f1942b);
        }
        return fragment;
    }

    /* renamed from: b */
    public C0438s mo2334b(Fragment fragment) {
        C0411l lVar = fragment.f1751w;
        if (lVar == null || lVar == this.f1777q) {
            super.mo2334b(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2335b(int i) {
        if (this.f1931g) {
            if (C0411l.f1831F) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1925a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0438s.C0439a aVar = this.f1925a.get(i2);
                Fragment fragment = aVar.f1942b;
                if (fragment != null) {
                    fragment.f1750v += i;
                    if (C0411l.f1831F) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1942b + " to " + aVar.f1942b.f1750v);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2336b(boolean z) {
        for (int size = this.f1925a.size() - 1; size >= 0; size--) {
            C0438s.C0439a aVar = this.f1925a.get(size);
            Fragment fragment = aVar.f1942b;
            if (fragment != null) {
                fragment.mo2255c(C0411l.m2149d(this.f1930f));
            }
            switch (aVar.f1941a) {
                case 1:
                    fragment.mo2247b(aVar.f1946f);
                    this.f1777q.mo2464a(fragment, true);
                    this.f1777q.mo2504l(fragment);
                    break;
                case 3:
                    fragment.mo2247b(aVar.f1945e);
                    this.f1777q.mo2460a(fragment);
                    break;
                case 4:
                    fragment.mo2247b(aVar.f1945e);
                    this.f1777q.mo2512p(fragment);
                    break;
                case 5:
                    fragment.mo2247b(aVar.f1946f);
                    this.f1777q.mo2464a(fragment, true);
                    this.f1777q.mo2492f(fragment);
                    break;
                case 6:
                    fragment.mo2247b(aVar.f1945e);
                    this.f1777q.mo2484c(fragment);
                    break;
                case 7:
                    fragment.mo2247b(aVar.f1946f);
                    this.f1777q.mo2464a(fragment, true);
                    this.f1777q.mo2488d(fragment);
                    break;
                case 8:
                    this.f1777q.mo2507n((Fragment) null);
                    break;
                case 9:
                    this.f1777q.mo2507n(fragment);
                    break;
                case 10:
                    this.f1777q.mo2463a(fragment, aVar.f1947g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1941a);
            }
            if (!(this.f1939o || aVar.f1941a == 3 || fragment == null)) {
                this.f1777q.mo2498i(fragment);
            }
        }
        if (!this.f1939o && z) {
            C0411l lVar = this.f1777q;
            lVar.mo2456a(lVar.f1850n, true);
        }
    }

    /* renamed from: c */
    public C0438s mo2337c(Fragment fragment) {
        C0411l lVar = fragment.f1751w;
        if (lVar == null || lVar == this.f1777q) {
            super.mo2337c(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: c */
    public void mo2338c() {
        mo2597d();
        this.f1777q.mo2478b((C0411l.C0426n) this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2339c(int i) {
        int size = this.f1925a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1925a.get(i2).f1942b;
            int i3 = fragment != null ? fragment.f1709B : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public C0438s mo2340d(Fragment fragment) {
        C0411l lVar;
        if (fragment == null || (lVar = fragment.f1751w) == null || lVar == this.f1777q) {
            super.mo2340d(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2341e() {
        int size = this.f1925a.size();
        for (int i = 0; i < size; i++) {
            C0438s.C0439a aVar = this.f1925a.get(i);
            Fragment fragment = aVar.f1942b;
            if (fragment != null) {
                fragment.mo2255c(this.f1930f);
            }
            switch (aVar.f1941a) {
                case 1:
                    fragment.mo2247b(aVar.f1943c);
                    this.f1777q.mo2464a(fragment, false);
                    this.f1777q.mo2460a(fragment);
                    break;
                case 3:
                    fragment.mo2247b(aVar.f1944d);
                    this.f1777q.mo2504l(fragment);
                    break;
                case 4:
                    fragment.mo2247b(aVar.f1944d);
                    this.f1777q.mo2492f(fragment);
                    break;
                case 5:
                    fragment.mo2247b(aVar.f1943c);
                    this.f1777q.mo2464a(fragment, false);
                    this.f1777q.mo2512p(fragment);
                    break;
                case 6:
                    fragment.mo2247b(aVar.f1944d);
                    this.f1777q.mo2488d(fragment);
                    break;
                case 7:
                    fragment.mo2247b(aVar.f1943c);
                    this.f1777q.mo2464a(fragment, false);
                    this.f1777q.mo2484c(fragment);
                    break;
                case 8:
                    this.f1777q.mo2507n(fragment);
                    break;
                case 9:
                    this.f1777q.mo2507n((Fragment) null);
                    break;
                case 10:
                    this.f1777q.mo2463a(fragment, aVar.f1948h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1941a);
            }
            if (!(this.f1939o || aVar.f1941a == 1 || fragment == null)) {
                this.f1777q.mo2498i(fragment);
            }
        }
        if (!this.f1939o) {
            C0411l lVar = this.f1777q;
            lVar.mo2456a(lVar.f1850n, true);
        }
    }

    /* renamed from: f */
    public String mo2342f() {
        return this.f1932h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo2343g() {
        for (int i = 0; i < this.f1925a.size(); i++) {
            if (m2001b(this.f1925a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void mo2344h() {
        if (this.f1940p != null) {
            for (int i = 0; i < this.f1940p.size(); i++) {
                this.f1940p.get(i).run();
            }
            this.f1940p = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PropertyFlags.ID_SELF_ASSIGNABLE);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1779s >= 0) {
            sb.append(" #");
            sb.append(this.f1779s);
        }
        if (this.f1932h != null) {
            sb.append(" ");
            sb.append(this.f1932h);
        }
        sb.append("}");
        return sb.toString();
    }
}
