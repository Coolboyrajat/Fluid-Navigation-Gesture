package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0306m;
import androidx.fragment.app.C0411l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p006b.p021d.C0723a;
import p006b.p026g.p035k.C0887s;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.fragment.app.t */
class C0440t {

    /* renamed from: a */
    private static final int[] f1949a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0453v f1950b = (Build.VERSION.SDK_INT >= 21 ? new C0448u() : null);

    /* renamed from: c */
    private static final C0453v f1951c = m2304a();

    /* renamed from: androidx.fragment.app.t$a */
    static class C0441a implements C0411l.C0423k {
        C0441a() {
        }

        public void cancel() {
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    static class C0442b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f1952a;

        /* renamed from: b */
        final /* synthetic */ C0411l f1953b;

        /* renamed from: c */
        final /* synthetic */ C0411l.C0423k f1954c;

        C0442b(Fragment fragment, C0411l lVar, C0411l.C0423k kVar) {
            this.f1952a = fragment;
            this.f1953b = lVar;
            this.f1954c = kVar;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            Fragment fragment = this.f1952a;
            if (fragment.f1719L != null && fragment.f1734f <= 1) {
                if (fragment.f1745q || fragment.mo2216W()) {
                    this.f1953b.mo2477b(this.f1952a, this.f1954c);
                }
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.t$c */
    static class C0443c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f1955f;

        C0443c(ArrayList arrayList) {
            this.f1955f = arrayList;
        }

        public void run() {
            C0440t.m2324a((ArrayList<View>) this.f1955f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.t$d */
    static class C0444d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f1956f;

        /* renamed from: g */
        final /* synthetic */ C0453v f1957g;

        /* renamed from: h */
        final /* synthetic */ View f1958h;

        /* renamed from: i */
        final /* synthetic */ Fragment f1959i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f1960j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f1961k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f1962l;

        /* renamed from: m */
        final /* synthetic */ Object f1963m;

        C0444d(Object obj, C0453v vVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f1956f = obj;
            this.f1957g = vVar;
            this.f1958h = view;
            this.f1959i = fragment;
            this.f1960j = arrayList;
            this.f1961k = arrayList2;
            this.f1962l = arrayList3;
            this.f1963m = obj2;
        }

        public void run() {
            Object obj = this.f1956f;
            if (obj != null) {
                this.f1957g.mo2618b(obj, this.f1958h);
                this.f1961k.addAll(C0440t.m2313a(this.f1957g, this.f1956f, this.f1959i, (ArrayList<View>) this.f1960j, this.f1958h));
            }
            if (this.f1962l != null) {
                if (this.f1963m != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f1958h);
                    this.f1957g.mo2614a(this.f1963m, (ArrayList<View>) this.f1962l, (ArrayList<View>) arrayList);
                }
                this.f1962l.clear();
                this.f1962l.add(this.f1958h);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$e */
    static class C0445e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f1964f;

        /* renamed from: g */
        final /* synthetic */ Fragment f1965g;

        /* renamed from: h */
        final /* synthetic */ boolean f1966h;

        /* renamed from: i */
        final /* synthetic */ C0723a f1967i;

        /* renamed from: j */
        final /* synthetic */ View f1968j;

        /* renamed from: k */
        final /* synthetic */ C0453v f1969k;

        /* renamed from: l */
        final /* synthetic */ Rect f1970l;

        C0445e(Fragment fragment, Fragment fragment2, boolean z, C0723a aVar, View view, C0453v vVar, Rect rect) {
            this.f1964f = fragment;
            this.f1965g = fragment2;
            this.f1966h = z;
            this.f1967i = aVar;
            this.f1968j = view;
            this.f1969k = vVar;
            this.f1970l = rect;
        }

        public void run() {
            C0440t.m2314a(this.f1964f, this.f1965g, this.f1966h, (C0723a<String, View>) this.f1967i, false);
            View view = this.f1968j;
            if (view != null) {
                this.f1969k.mo2636a(view, this.f1970l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$f */
    static class C0446f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0453v f1971f;

        /* renamed from: g */
        final /* synthetic */ C0723a f1972g;

        /* renamed from: h */
        final /* synthetic */ Object f1973h;

        /* renamed from: i */
        final /* synthetic */ C0447g f1974i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f1975j;

        /* renamed from: k */
        final /* synthetic */ View f1976k;

        /* renamed from: l */
        final /* synthetic */ Fragment f1977l;

        /* renamed from: m */
        final /* synthetic */ Fragment f1978m;

        /* renamed from: n */
        final /* synthetic */ boolean f1979n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f1980o;

        /* renamed from: p */
        final /* synthetic */ Object f1981p;

        /* renamed from: q */
        final /* synthetic */ Rect f1982q;

        C0446f(C0453v vVar, C0723a aVar, Object obj, C0447g gVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f1971f = vVar;
            this.f1972g = aVar;
            this.f1973h = obj;
            this.f1974i = gVar;
            this.f1975j = arrayList;
            this.f1976k = view;
            this.f1977l = fragment;
            this.f1978m = fragment2;
            this.f1979n = z;
            this.f1980o = arrayList2;
            this.f1981p = obj2;
            this.f1982q = rect;
        }

        public void run() {
            C0723a<String, View> a = C0440t.m2307a(this.f1971f, (C0723a<String, String>) this.f1972g, this.f1973h, this.f1974i);
            if (a != null) {
                this.f1975j.addAll(a.values());
                this.f1975j.add(this.f1976k);
            }
            C0440t.m2314a(this.f1977l, this.f1978m, this.f1979n, a, false);
            Object obj = this.f1973h;
            if (obj != null) {
                this.f1971f.mo2620b(obj, (ArrayList<View>) this.f1980o, (ArrayList<View>) this.f1975j);
                View a2 = C0440t.m2302a(a, this.f1974i, this.f1981p, this.f1979n);
                if (a2 != null) {
                    this.f1971f.mo2636a(a2, this.f1982q);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$g */
    static class C0447g {

        /* renamed from: a */
        public Fragment f1983a;

        /* renamed from: b */
        public boolean f1984b;

        /* renamed from: c */
        public C0396a f1985c;

        /* renamed from: d */
        public Fragment f1986d;

        /* renamed from: e */
        public boolean f1987e;

        /* renamed from: f */
        public C0396a f1988f;

        C0447g() {
        }
    }

    /* renamed from: a */
    static View m2302a(C0723a<String, View> aVar, C0447g gVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0396a aVar2 = gVar.f1985c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1937m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f1937m : aVar2.f1938n).get(0));
    }

    /* renamed from: a */
    private static C0447g m2303a(C0447g gVar, SparseArray<C0447g> sparseArray, int i) {
        if (gVar != null) {
            return gVar;
        }
        C0447g gVar2 = new C0447g();
        sparseArray.put(i, gVar2);
        return gVar2;
    }

    /* renamed from: a */
    private static C0453v m2304a() {
        try {
            return (C0453v) Class.forName("b.n.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0453v m2305a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object E = fragment.mo2198E();
            if (E != null) {
                arrayList.add(E);
            }
            Object O = fragment.mo2208O();
            if (O != null) {
                arrayList.add(O);
            }
            Object Q = fragment.mo2210Q();
            if (Q != null) {
                arrayList.add(Q);
            }
        }
        if (fragment2 != null) {
            Object C = fragment2.mo2196C();
            if (C != null) {
                arrayList.add(C);
            }
            Object L = fragment2.mo2205L();
            if (L != null) {
                arrayList.add(L);
            }
            Object P = fragment2.mo2209P();
            if (P != null) {
                arrayList.add(P);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0453v vVar = f1950b;
        if (vVar != null && m2326a(vVar, (List<Object>) arrayList)) {
            return f1950b;
        }
        C0453v vVar2 = f1951c;
        if (vVar2 != null && m2326a(vVar2, (List<Object>) arrayList)) {
            return f1951c;
        }
        if (f1950b == null && f1951c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0723a<String, String> m2306a(int i, ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0723a<String, String> aVar = new C0723a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0396a aVar2 = arrayList.get(i4);
            if (aVar2.mo2339c(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f1937m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f1937m;
                        arrayList4 = aVar2.f1938n;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f1937m;
                        arrayList3 = aVar2.f1938n;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static C0723a<String, View> m2307a(C0453v vVar, C0723a<String, String> aVar, Object obj, C0447g gVar) {
        C0306m mVar;
        ArrayList<String> arrayList;
        String a;
        Fragment fragment = gVar.f1983a;
        View T = fragment.mo2213T();
        if (aVar.isEmpty() || obj == null || T == null) {
            aVar.clear();
            return null;
        }
        C0723a<String, View> aVar2 = new C0723a<>();
        vVar.mo2641a((Map<String, View>) aVar2, T);
        C0396a aVar3 = gVar.f1985c;
        if (gVar.f1984b) {
            mVar = fragment.mo2199F();
            arrayList = aVar3.f1937m;
        } else {
            mVar = fragment.mo2197D();
            arrayList = aVar3.f1938n;
        }
        if (arrayList != null) {
            aVar2.mo4071a(arrayList);
            aVar2.mo4071a(aVar.values());
        }
        if (mVar != null) {
            mVar.mo1940a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String a2 = m2312a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C0890v.m4797u(view)) && (a = m2312a(aVar, str)) != null) {
                    aVar.put(a, C0890v.m4797u(view));
                }
            }
        } else {
            m2323a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static Object m2308a(C0453v vVar, ViewGroup viewGroup, View view, C0723a<String, String> aVar, C0447g gVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0723a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0453v vVar2 = vVar;
        C0447g gVar2 = gVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = gVar2.f1983a;
        Fragment fragment2 = gVar2.f1986d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = gVar2.f1984b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m2309a(vVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C0723a<String, View> b = m2327b(vVar2, aVar2, obj3, gVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2314a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            vVar2.mo2619b(obj4, view, arrayList3);
            m2322a(vVar, obj4, obj2, b, gVar2.f1987e, gVar2.f1988f);
            if (obj5 != null) {
                vVar2.mo2609a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0446f fVar = r0;
        C0446f fVar2 = new C0446f(vVar, aVar, obj4, gVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C0887s.m4728a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: a */
    private static Object m2309a(C0453v vVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return vVar.mo2621c(vVar.mo2616b(z ? fragment2.mo2210Q() : fragment.mo2209P()));
    }

    /* renamed from: a */
    private static Object m2310a(C0453v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.mo2616b(z ? fragment.mo2205L() : fragment.mo2196C());
    }

    /* renamed from: a */
    private static Object m2311a(C0453v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo2308w() : fragment.mo2306v() ? vVar.mo2617b(obj2, obj, obj3) : vVar.mo2607a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m2312a(C0723a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo4199d(i))) {
                return aVar.mo4194b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m2313a(C0453v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View T = fragment.mo2213T();
        if (T != null) {
            vVar.mo2640a(arrayList2, T);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        vVar.mo2613a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m2314a(Fragment fragment, Fragment fragment2, boolean z, C0723a<String, View> aVar, boolean z2) {
        C0306m D = z ? fragment2.mo2197D() : fragment.mo2197D();
        if (D != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo4194b(i));
                arrayList.add(aVar.mo4199d(i));
            }
            if (z2) {
                D.mo1941b(arrayList2, arrayList, (List<View>) null);
            } else {
                D.mo1939a(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: a */
    public static void m2315a(C0396a aVar, SparseArray<C0447g> sparseArray, boolean z) {
        int size = aVar.f1925a.size();
        for (int i = 0; i < size; i++) {
            m2316a(aVar, aVar.f1925a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f1744p != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.f1711D == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2316a(androidx.fragment.app.C0396a r8, androidx.fragment.app.C0438s.C0439a r9, android.util.SparseArray<androidx.fragment.app.C0440t.C0447g> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f1942b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f1709B
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f1949a
            int r9 = r9.f1941a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f1941a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f1724Q
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.f1711D
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f1744p
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.f1711D
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f1724Q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1744p
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1711D
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f1744p
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1711D
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.f1744p
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f1719L
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f1725R
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1711D
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.f1723P
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f1744p
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f1711D
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0090:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.t$g r6 = (androidx.fragment.app.C0440t.C0447g) r6
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.t$g r6 = m2303a((androidx.fragment.app.C0440t.C0447g) r6, (android.util.SparseArray<androidx.fragment.app.C0440t.C0447g>) r10, (int) r1)
            r6.f1983a = r0
            r6.f1984b = r11
            r6.f1985c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            if (r6 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r9 = r6.f1986d
            if (r9 != r0) goto L_0x00af
            r6.f1986d = r2
        L_0x00af:
            androidx.fragment.app.l r9 = r8.f1777q
            int r7 = r0.f1734f
            if (r7 >= r3) goto L_0x00c3
            int r7 = r9.f1850n
            if (r7 < r3) goto L_0x00c3
            boolean r7 = r8.f1939o
            if (r7 != 0) goto L_0x00c3
            r9.mo2496h(r0)
            r9.mo2461a((androidx.fragment.app.Fragment) r0, (int) r3)
        L_0x00c3:
            if (r5 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r9 = r6.f1986d
            if (r9 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.t$g r6 = m2303a((androidx.fragment.app.C0440t.C0447g) r6, (android.util.SparseArray<androidx.fragment.app.C0440t.C0447g>) r10, (int) r1)
            r6.f1986d = r0
            r6.f1987e = r11
            r6.f1988f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r6.f1983a
            if (r8 != r0) goto L_0x00e1
            r6.f1983a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0440t.m2316a(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static void m2317a(C0411l lVar, int i, C0447g gVar, View view, C0723a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        C0453v a;
        Object obj;
        C0411l lVar2 = lVar;
        C0447g gVar2 = gVar;
        View view2 = view;
        C0723a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = lVar2.f1852p.mo2319b() ? (ViewGroup) lVar2.f1852p.mo2318a(i) : null;
        if (viewGroup != null && (a = m2305a(fragment2, fragment)) != null) {
            boolean z = gVar2.f1984b;
            boolean z2 = gVar2.f1987e;
            Object a2 = m2310a(a, (fragment = gVar2.f1983a), z);
            Object b = m2329b(a, (fragment2 = gVar2.f1986d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = b;
            C0453v vVar = a;
            Object obj3 = a2;
            Fragment fragment3 = fragment2;
            Object a3 = m2308a(a, viewGroup, view, aVar, gVar, (ArrayList<View>) arrayList3, (ArrayList<View>) arrayList2, obj3, obj2);
            if (obj3 == null && a3 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> a4 = m2313a(vVar, obj, fragment3, (ArrayList<View>) arrayList4, view2);
            Object obj4 = (a4 == null || a4.isEmpty()) ? null : obj;
            vVar.mo2610a(obj3, view2);
            Object a5 = m2311a(vVar, obj3, obj4, a3, fragment, gVar2.f1984b);
            if (!(fragment3 == null || a4 == null || (a4.size() <= 0 && arrayList4.size() <= 0))) {
                m2318a(lVar2, fragment3, a5);
            }
            if (a5 != null) {
                ArrayList arrayList5 = new ArrayList();
                C0453v vVar2 = vVar;
                vVar2.mo2612a(a5, obj3, arrayList5, obj4, a4, a3, arrayList2);
                m2320a(vVar2, viewGroup, fragment, view, (ArrayList<View>) arrayList2, obj3, (ArrayList<View>) arrayList5, obj4, a4);
                ArrayList arrayList6 = arrayList2;
                C0723a<String, String> aVar3 = aVar;
                vVar.mo2638a((View) viewGroup, (ArrayList<View>) arrayList6, (Map<String, String>) aVar3);
                vVar.mo2608a(viewGroup, a5);
                vVar.mo2639a(viewGroup, (ArrayList<View>) arrayList6, (Map<String, String>) aVar3);
            }
        }
    }

    /* renamed from: a */
    private static void m2318a(C0411l lVar, Fragment fragment, Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0441a aVar = new C0441a();
            lVar.mo2462a(fragment, (C0411l.C0423k) aVar);
            ((Transition) obj).addListener(new C0442b(fragment, lVar, aVar));
        }
    }

    /* renamed from: a */
    static void m2319a(C0411l lVar, ArrayList<C0396a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (lVar.f1850n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0396a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m2330b(aVar, (SparseArray<C0447g>) sparseArray, z);
                } else {
                    m2315a(aVar, (SparseArray<C0447g>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lVar.f1851o.mo2432d());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0723a<String, String> a = m2306a(keyAt, arrayList, arrayList2, i, i2);
                    C0447g gVar = (C0447g) sparseArray.valueAt(i4);
                    if (z) {
                        m2331b(lVar, keyAt, gVar, view, a);
                    } else {
                        m2317a(lVar, keyAt, gVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2320a(C0453v vVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C0887s.m4728a(viewGroup, new C0444d(obj, vVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: a */
    private static void m2321a(C0453v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1744p && fragment.f1711D && fragment.f1724Q) {
            fragment.mo2275g(true);
            vVar.mo2611a(obj, fragment.mo2213T(), arrayList);
            C0887s.m4728a(fragment.f1718K, new C0443c(arrayList));
        }
    }

    /* renamed from: a */
    private static void m2322a(C0453v vVar, Object obj, Object obj2, C0723a<String, View> aVar, boolean z, C0396a aVar2) {
        ArrayList<String> arrayList = aVar2.f1937m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f1938n : aVar2.f1937m).get(0));
            vVar.mo2622c(obj, view);
            if (obj2 != null) {
                vVar.mo2622c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m2323a(C0723a<String, String> aVar, C0723a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo4199d(size))) {
                aVar.mo4195c(size);
            }
        }
    }

    /* renamed from: a */
    static void m2324a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m2325a(ArrayList<View> arrayList, C0723a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View d = aVar.mo4199d(size);
            if (collection.contains(C0890v.m4797u(d))) {
                arrayList.add(d);
            }
        }
    }

    /* renamed from: a */
    private static boolean m2326a(C0453v vVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vVar.mo2615a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0723a<String, View> m2327b(C0453v vVar, C0723a<String, String> aVar, Object obj, C0447g gVar) {
        C0306m mVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = gVar.f1986d;
        C0723a<String, View> aVar2 = new C0723a<>();
        vVar.mo2641a((Map<String, View>) aVar2, fragment.mo2193A0());
        C0396a aVar3 = gVar.f1988f;
        if (gVar.f1987e) {
            mVar = fragment.mo2197D();
            arrayList = aVar3.f1938n;
        } else {
            mVar = fragment.mo2199F();
            arrayList = aVar3.f1937m;
        }
        if (arrayList != null) {
            aVar2.mo4071a(arrayList);
        }
        if (mVar != null) {
            mVar.mo1940a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0890v.m4797u(view))) {
                    aVar.put(C0890v.m4797u(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo4071a(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: b */
    private static Object m2328b(C0453v vVar, ViewGroup viewGroup, View view, C0723a<String, String> aVar, C0447g gVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C0453v vVar2 = vVar;
        View view3 = view;
        C0723a<String, String> aVar2 = aVar;
        C0447g gVar2 = gVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = gVar2.f1983a;
        Fragment fragment2 = gVar2.f1986d;
        if (fragment != null) {
            fragment.mo2193A0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = gVar2.f1984b;
        Object a = aVar.isEmpty() ? null : m2309a(vVar, fragment, fragment2, z);
        C0723a<String, View> b = m2327b(vVar, aVar2, a, gVar2);
        C0723a<String, View> a2 = m2307a(vVar, aVar2, a, gVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
            obj3 = null;
        } else {
            m2325a(arrayList3, b, (Collection<String>) aVar.keySet());
            m2325a(arrayList4, a2, aVar.values());
            obj3 = a;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2314a(fragment, fragment2, z, b, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            vVar.mo2619b(obj3, view3, arrayList3);
            m2322a(vVar, obj3, obj2, b, gVar2.f1987e, gVar2.f1988f);
            Rect rect2 = new Rect();
            View a3 = m2302a(a2, gVar2, obj4, z);
            if (a3 != null) {
                vVar.mo2609a(obj4, rect2);
            }
            rect = rect2;
            view2 = a3;
        } else {
            view2 = null;
            rect = null;
        }
        C0887s.m4728a(viewGroup, new C0445e(fragment, fragment2, z, a2, view2, vVar, rect));
        return obj3;
    }

    /* renamed from: b */
    private static Object m2329b(C0453v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.mo2616b(z ? fragment.mo2208O() : fragment.mo2198E());
    }

    /* renamed from: b */
    public static void m2330b(C0396a aVar, SparseArray<C0447g> sparseArray, boolean z) {
        if (aVar.f1777q.f1852p.mo2319b()) {
            for (int size = aVar.f1925a.size() - 1; size >= 0; size--) {
                m2316a(aVar, aVar.f1925a.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r12 = r5.f1983a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2331b(androidx.fragment.app.C0411l r17, int r18, androidx.fragment.app.C0440t.C0447g r19, android.view.View r20, p006b.p021d.C0723a<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r5 = r19
            r10 = r20
            androidx.fragment.app.e r1 = r0.f1852p
            boolean r1 = r1.mo2319b()
            if (r1 == 0) goto L_0x0019
            androidx.fragment.app.e r1 = r0.f1852p
            r2 = r18
            android.view.View r1 = r1.mo2318a(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r11 = r1
            if (r11 != 0) goto L_0x001e
            return
        L_0x001e:
            androidx.fragment.app.Fragment r12 = r5.f1983a
            androidx.fragment.app.Fragment r13 = r5.f1986d
            androidx.fragment.app.v r14 = m2305a((androidx.fragment.app.Fragment) r13, (androidx.fragment.app.Fragment) r12)
            if (r14 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r15 = r5.f1984b
            boolean r1 = r5.f1987e
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = m2310a((androidx.fragment.app.C0453v) r14, (androidx.fragment.app.Fragment) r12, (boolean) r15)
            java.lang.Object r6 = m2329b((androidx.fragment.app.C0453v) r14, (androidx.fragment.app.Fragment) r13, (boolean) r1)
            r1 = r14
            r2 = r11
            r3 = r20
            r4 = r21
            r5 = r19
            r18 = r6
            r6 = r8
            r19 = r7
            r7 = r9
            r16 = r11
            r11 = r8
            r8 = r19
            r0 = r9
            r9 = r18
            java.lang.Object r8 = m2328b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r7 = r19
            if (r7 != 0) goto L_0x0064
            if (r8 != 0) goto L_0x0064
            r9 = r18
            if (r9 != 0) goto L_0x0066
            return
        L_0x0064:
            r9 = r18
        L_0x0066:
            java.util.ArrayList r6 = m2313a((androidx.fragment.app.C0453v) r14, (java.lang.Object) r9, (androidx.fragment.app.Fragment) r13, (java.util.ArrayList<android.view.View>) r11, (android.view.View) r10)
            java.util.ArrayList r10 = m2313a((androidx.fragment.app.C0453v) r14, (java.lang.Object) r7, (androidx.fragment.app.Fragment) r12, (java.util.ArrayList<android.view.View>) r0, (android.view.View) r10)
            r1 = 4
            m2324a((java.util.ArrayList<android.view.View>) r10, (int) r1)
            r1 = r14
            r2 = r7
            r3 = r9
            r4 = r8
            r5 = r12
            r12 = r6
            r6 = r15
            java.lang.Object r15 = m2311a((androidx.fragment.app.C0453v) r1, (java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (androidx.fragment.app.Fragment) r5, (boolean) r6)
            if (r13 == 0) goto L_0x0094
            if (r12 == 0) goto L_0x0094
            int r1 = r12.size()
            if (r1 > 0) goto L_0x008d
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x0094
        L_0x008d:
            r6 = r0
            r0 = r17
            m2318a((androidx.fragment.app.C0411l) r0, (androidx.fragment.app.Fragment) r13, (java.lang.Object) r15)
            goto L_0x0095
        L_0x0094:
            r6 = r0
        L_0x0095:
            if (r15 == 0) goto L_0x00c0
            m2321a((androidx.fragment.app.C0453v) r14, (java.lang.Object) r9, (androidx.fragment.app.Fragment) r13, (java.util.ArrayList<android.view.View>) r12)
            java.util.ArrayList r13 = r14.mo2635a((java.util.ArrayList<android.view.View>) r6)
            r0 = r14
            r1 = r15
            r2 = r7
            r3 = r10
            r4 = r9
            r5 = r12
            r9 = r6
            r6 = r8
            r7 = r9
            r0.mo2612a(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            r14.mo2608a((android.view.ViewGroup) r1, (java.lang.Object) r15)
            r2 = r14
            r3 = r1
            r4 = r11
            r5 = r9
            r6 = r13
            r7 = r21
            r2.mo2637a(r3, r4, r5, r6, r7)
            r0 = 0
            m2324a((java.util.ArrayList<android.view.View>) r10, (int) r0)
            r14.mo2620b((java.lang.Object) r8, (java.util.ArrayList<android.view.View>) r11, (java.util.ArrayList<android.view.View>) r9)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0440t.m2331b(androidx.fragment.app.l, int, androidx.fragment.app.t$g, android.view.View, b.d.a):void");
    }
}
