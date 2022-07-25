package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p006b.p026g.p035k.C0887s;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0900x;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.v */
public abstract class C0453v {

    /* renamed from: androidx.fragment.app.v$a */
    class C0454a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f2000f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2001g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f2002h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f2003i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2004j;

        C0454a(C0453v vVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2000f = i;
            this.f2001g = arrayList;
            this.f2002h = arrayList2;
            this.f2003i = arrayList3;
            this.f2004j = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2000f; i++) {
                C0890v.m4759a((View) this.f2001g.get(i), (String) this.f2002h.get(i));
                C0890v.m4759a((View) this.f2003i.get(i), (String) this.f2004j.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    class C0455b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2005f;

        /* renamed from: g */
        final /* synthetic */ Map f2006g;

        C0455b(C0453v vVar, ArrayList arrayList, Map map) {
            this.f2005f = arrayList;
            this.f2006g = map;
        }

        public void run() {
            int size = this.f2005f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2005f.get(i);
                String u = C0890v.m4797u(view);
                if (u != null) {
                    C0890v.m4759a(view, C0453v.m2349a((Map<String, String>) this.f2006g, u));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$c */
    class C0456c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2007f;

        /* renamed from: g */
        final /* synthetic */ Map f2008g;

        C0456c(C0453v vVar, ArrayList arrayList, Map map) {
            this.f2007f = arrayList;
            this.f2008g = map;
        }

        public void run() {
            int size = this.f2007f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2007f.get(i);
                C0890v.m4759a(view, (String) this.f2008g.get(C0890v.m4797u(view)));
            }
        }
    }

    /* renamed from: a */
    static String m2349a(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m2350a(List<View> list, View view) {
        int size = list.size();
        if (!m2352a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2352a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m2351a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    private static boolean m2352a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo2607a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo2635a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0890v.m4797u(view));
            C0890v.m4759a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2636a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2637a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String u = C0890v.m4797u(view2);
            arrayList4.add(u);
            if (u != null) {
                C0890v.m4759a(view2, (String) null);
                String str = map.get(u);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0890v.m4759a(arrayList2.get(i2), u);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C0887s.m4728a(view, new C0454a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2638a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C0887s.m4728a(view, new C0455b(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo2608a(ViewGroup viewGroup, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2639a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C0887s.m4728a(viewGroup, new C0456c(this, arrayList, map));
    }

    /* renamed from: a */
    public abstract void mo2609a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2610a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2611a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2612a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2613a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2614a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2640a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a = C0900x.m4844a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo2640a(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2641a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String u = C0890v.m4797u(view);
            if (u != null) {
                map.put(u, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2641a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2615a(Object obj);

    /* renamed from: b */
    public abstract Object mo2616b(Object obj);

    /* renamed from: b */
    public abstract Object mo2617b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2618b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2619b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2620b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2621c(Object obj);

    /* renamed from: c */
    public abstract void mo2622c(Object obj, View view);
}
