package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.recyclerview.widget.e */
public class C0575e extends C0615r {

    /* renamed from: s */
    private static TimeInterpolator f2338s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C0524d0> f2339h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C0524d0> f2340i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0585j> f2341j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0584i> f2342k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C0524d0>> f2343l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0585j>> f2344m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0584i>> f2345n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C0524d0> f2346o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C0524d0> f2347p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C0524d0> f2348q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C0524d0> f2349r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    class C0576a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2350f;

        C0576a(ArrayList arrayList) {
            this.f2350f = arrayList;
        }

        public void run() {
            Iterator it = this.f2350f.iterator();
            while (it.hasNext()) {
                C0585j jVar = (C0585j) it.next();
                C0575e.this.mo3494b(jVar.f2384a, jVar.f2385b, jVar.f2386c, jVar.f2387d, jVar.f2388e);
            }
            this.f2350f.clear();
            C0575e.this.f2344m.remove(this.f2350f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    class C0577b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2352f;

        C0577b(ArrayList arrayList) {
            this.f2352f = arrayList;
        }

        public void run() {
            Iterator it = this.f2352f.iterator();
            while (it.hasNext()) {
                C0575e.this.mo3490a((C0584i) it.next());
            }
            this.f2352f.clear();
            C0575e.this.f2345n.remove(this.f2352f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    class C0578c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2354f;

        C0578c(ArrayList arrayList) {
            this.f2354f = arrayList;
        }

        public void run() {
            Iterator it = this.f2354f.iterator();
            while (it.hasNext()) {
                C0575e.this.mo3498t((RecyclerView.C0524d0) it.next());
            }
            this.f2354f.clear();
            C0575e.this.f2343l.remove(this.f2354f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    class C0579d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0524d0 f2356a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2357b;

        /* renamed from: c */
        final /* synthetic */ View f2358c;

        C0579d(RecyclerView.C0524d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2356a = d0Var;
            this.f2357b = viewPropertyAnimator;
            this.f2358c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2357b.setListener((Animator.AnimatorListener) null);
            this.f2358c.setAlpha(1.0f);
            C0575e.this.mo3592l(this.f2356a);
            C0575e.this.f2348q.remove(this.f2356a);
            C0575e.this.mo3497j();
        }

        public void onAnimationStart(Animator animator) {
            C0575e.this.mo3593m(this.f2356a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e */
    class C0580e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0524d0 f2360a;

        /* renamed from: b */
        final /* synthetic */ View f2361b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f2362c;

        C0580e(RecyclerView.C0524d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2360a = d0Var;
            this.f2361b = view;
            this.f2362c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2361b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2362c.setListener((Animator.AnimatorListener) null);
            C0575e.this.mo3588h(this.f2360a);
            C0575e.this.f2346o.remove(this.f2360a);
            C0575e.this.mo3497j();
        }

        public void onAnimationStart(Animator animator) {
            C0575e.this.mo3589i(this.f2360a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$f */
    class C0581f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0524d0 f2364a;

        /* renamed from: b */
        final /* synthetic */ int f2365b;

        /* renamed from: c */
        final /* synthetic */ View f2366c;

        /* renamed from: d */
        final /* synthetic */ int f2367d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f2368e;

        C0581f(RecyclerView.C0524d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2364a = d0Var;
            this.f2365b = i;
            this.f2366c = view;
            this.f2367d = i2;
            this.f2368e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2365b != 0) {
                this.f2366c.setTranslationX(0.0f);
            }
            if (this.f2367d != 0) {
                this.f2366c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f2368e.setListener((Animator.AnimatorListener) null);
            C0575e.this.mo3590j(this.f2364a);
            C0575e.this.f2347p.remove(this.f2364a);
            C0575e.this.mo3497j();
        }

        public void onAnimationStart(Animator animator) {
            C0575e.this.mo3591k(this.f2364a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$g */
    class C0582g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0584i f2370a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2371b;

        /* renamed from: c */
        final /* synthetic */ View f2372c;

        C0582g(C0584i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2370a = iVar;
            this.f2371b = viewPropertyAnimator;
            this.f2372c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2371b.setListener((Animator.AnimatorListener) null);
            this.f2372c.setAlpha(1.0f);
            this.f2372c.setTranslationX(0.0f);
            this.f2372c.setTranslationY(0.0f);
            C0575e.this.mo3584a(this.f2370a.f2378a, true);
            C0575e.this.f2349r.remove(this.f2370a.f2378a);
            C0575e.this.mo3497j();
        }

        public void onAnimationStart(Animator animator) {
            C0575e.this.mo3585b(this.f2370a.f2378a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$h */
    class C0583h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0584i f2374a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2375b;

        /* renamed from: c */
        final /* synthetic */ View f2376c;

        C0583h(C0584i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2374a = iVar;
            this.f2375b = viewPropertyAnimator;
            this.f2376c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2375b.setListener((Animator.AnimatorListener) null);
            this.f2376c.setAlpha(1.0f);
            this.f2376c.setTranslationX(0.0f);
            this.f2376c.setTranslationY(0.0f);
            C0575e.this.mo3584a(this.f2374a.f2379b, false);
            C0575e.this.f2349r.remove(this.f2374a.f2379b);
            C0575e.this.mo3497j();
        }

        public void onAnimationStart(Animator animator) {
            C0575e.this.mo3585b(this.f2374a.f2379b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$i */
    private static class C0584i {

        /* renamed from: a */
        public RecyclerView.C0524d0 f2378a;

        /* renamed from: b */
        public RecyclerView.C0524d0 f2379b;

        /* renamed from: c */
        public int f2380c;

        /* renamed from: d */
        public int f2381d;

        /* renamed from: e */
        public int f2382e;

        /* renamed from: f */
        public int f2383f;

        private C0584i(RecyclerView.C0524d0 d0Var, RecyclerView.C0524d0 d0Var2) {
            this.f2378a = d0Var;
            this.f2379b = d0Var2;
        }

        C0584i(RecyclerView.C0524d0 d0Var, RecyclerView.C0524d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f2380c = i;
            this.f2381d = i2;
            this.f2382e = i3;
            this.f2383f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2378a + ", newHolder=" + this.f2379b + ", fromX=" + this.f2380c + ", fromY=" + this.f2381d + ", toX=" + this.f2382e + ", toY=" + this.f2383f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$j */
    private static class C0585j {

        /* renamed from: a */
        public RecyclerView.C0524d0 f2384a;

        /* renamed from: b */
        public int f2385b;

        /* renamed from: c */
        public int f2386c;

        /* renamed from: d */
        public int f2387d;

        /* renamed from: e */
        public int f2388e;

        C0585j(RecyclerView.C0524d0 d0Var, int i, int i2, int i3, int i4) {
            this.f2384a = d0Var;
            this.f2385b = i;
            this.f2386c = i2;
            this.f2387d = i3;
            this.f2388e = i4;
        }
    }

    /* renamed from: a */
    private void m3281a(List<C0584i> list, RecyclerView.C0524d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0584i iVar = list.get(size);
            if (m3282a(iVar, d0Var) && iVar.f2378a == null && iVar.f2379b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m3282a(C0584i iVar, RecyclerView.C0524d0 d0Var) {
        boolean z = false;
        if (iVar.f2379b == d0Var) {
            iVar.f2379b = null;
        } else if (iVar.f2378a != d0Var) {
            return false;
        } else {
            iVar.f2378a = null;
            z = true;
        }
        d0Var.f2168f.setAlpha(1.0f);
        d0Var.f2168f.setTranslationX(0.0f);
        d0Var.f2168f.setTranslationY(0.0f);
        mo3584a(d0Var, z);
        return true;
    }

    /* renamed from: b */
    private void m3283b(C0584i iVar) {
        RecyclerView.C0524d0 d0Var = iVar.f2378a;
        if (d0Var != null) {
            m3282a(iVar, d0Var);
        }
        RecyclerView.C0524d0 d0Var2 = iVar.f2379b;
        if (d0Var2 != null) {
            m3282a(iVar, d0Var2);
        }
    }

    /* renamed from: u */
    private void m3284u(RecyclerView.C0524d0 d0Var) {
        View view = d0Var.f2168f;
        ViewPropertyAnimator animate = view.animate();
        this.f2348q.add(d0Var);
        animate.setDuration(mo3161f()).alpha(0.0f).setListener(new C0579d(d0Var, animate, view)).start();
    }

    /* renamed from: v */
    private void m3285v(RecyclerView.C0524d0 d0Var) {
        if (f2338s == null) {
            f2338s = new ValueAnimator().getInterpolator();
        }
        d0Var.f2168f.animate().setInterpolator(f2338s);
        mo3156c(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3490a(C0584i iVar) {
        RecyclerView.C0524d0 d0Var = iVar.f2378a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f2168f;
        RecyclerView.C0524d0 d0Var2 = iVar.f2379b;
        if (d0Var2 != null) {
            view = d0Var2.f2168f;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo3158d());
            this.f2349r.add(iVar.f2378a);
            duration.translationX((float) (iVar.f2382e - iVar.f2380c));
            duration.translationY((float) (iVar.f2383f - iVar.f2381d));
            duration.alpha(0.0f).setListener(new C0582g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f2349r.add(iVar.f2379b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo3158d()).alpha(1.0f).setListener(new C0583h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3491a(List<RecyclerView.C0524d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2168f.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo3492a(RecyclerView.C0524d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f2168f;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f2168f.getTranslationY());
        m3285v(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo3590j(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f2341j.add(new C0585j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo3493a(RecyclerView.C0524d0 d0Var, RecyclerView.C0524d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo3492a(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f2168f.getTranslationX();
        float translationY = d0Var.f2168f.getTranslationY();
        float alpha = d0Var.f2168f.getAlpha();
        m3285v(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f2168f.setTranslationX(translationX);
        d0Var.f2168f.setTranslationY(translationY);
        d0Var.f2168f.setAlpha(alpha);
        if (d0Var2 != null) {
            m3285v(d0Var2);
            d0Var2.f2168f.setTranslationX((float) (-i5));
            d0Var2.f2168f.setTranslationY((float) (-i6));
            d0Var2.f2168f.setAlpha(0.0f);
        }
        this.f2342k.add(new C0584i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo3151a(RecyclerView.C0524d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo3151a(d0Var, list);
    }

    /* renamed from: b */
    public void mo3152b() {
        int size = this.f2341j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0585j jVar = this.f2341j.get(size);
            View view = jVar.f2384a.f2168f;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo3590j(jVar.f2384a);
            this.f2341j.remove(size);
        }
        for (int size2 = this.f2339h.size() - 1; size2 >= 0; size2--) {
            mo3592l(this.f2339h.get(size2));
            this.f2339h.remove(size2);
        }
        int size3 = this.f2340i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0524d0 d0Var = this.f2340i.get(size3);
            d0Var.f2168f.setAlpha(1.0f);
            mo3588h(d0Var);
            this.f2340i.remove(size3);
        }
        for (int size4 = this.f2342k.size() - 1; size4 >= 0; size4--) {
            m3283b(this.f2342k.get(size4));
        }
        this.f2342k.clear();
        if (mo3162g()) {
            for (int size5 = this.f2344m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f2344m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0585j jVar2 = (C0585j) arrayList.get(size6);
                    View view2 = jVar2.f2384a.f2168f;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo3590j(jVar2.f2384a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2344m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2343l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f2343l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C0524d0 d0Var2 = (RecyclerView.C0524d0) arrayList2.get(size8);
                    d0Var2.f2168f.setAlpha(1.0f);
                    mo3588h(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2343l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2345n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f2345n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3283b((C0584i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2345n.remove(arrayList3);
                    }
                }
            }
            mo3491a((List<RecyclerView.C0524d0>) this.f2348q);
            mo3491a((List<RecyclerView.C0524d0>) this.f2347p);
            mo3491a((List<RecyclerView.C0524d0>) this.f2346o);
            mo3491a((List<RecyclerView.C0524d0>) this.f2349r);
            mo3146a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3494b(RecyclerView.C0524d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f2168f;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2347p.add(d0Var);
        animate.setDuration(mo3160e()).setListener(new C0581f(d0Var, i5, view, i6, animate)).start();
    }

    /* renamed from: c */
    public void mo3156c(RecyclerView.C0524d0 d0Var) {
        View view = d0Var.f2168f;
        view.animate().cancel();
        int size = this.f2341j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2341j.get(size).f2384a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo3590j(d0Var);
                this.f2341j.remove(size);
            }
        }
        m3281a((List<C0584i>) this.f2342k, d0Var);
        if (this.f2339h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo3592l(d0Var);
        }
        if (this.f2340i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo3588h(d0Var);
        }
        for (int size2 = this.f2345n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f2345n.get(size2);
            m3281a((List<C0584i>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f2345n.remove(size2);
            }
        }
        for (int size3 = this.f2344m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f2344m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0585j) arrayList2.get(size4)).f2384a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo3590j(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2344m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2343l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f2343l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo3588h(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f2343l.remove(size5);
                }
            }
        }
        this.f2348q.remove(d0Var);
        this.f2346o.remove(d0Var);
        this.f2349r.remove(d0Var);
        this.f2347p.remove(d0Var);
        mo3497j();
    }

    /* renamed from: f */
    public boolean mo3495f(RecyclerView.C0524d0 d0Var) {
        m3285v(d0Var);
        d0Var.f2168f.setAlpha(0.0f);
        this.f2340i.add(d0Var);
        return true;
    }

    /* renamed from: g */
    public boolean mo3162g() {
        return !this.f2340i.isEmpty() || !this.f2342k.isEmpty() || !this.f2341j.isEmpty() || !this.f2339h.isEmpty() || !this.f2347p.isEmpty() || !this.f2348q.isEmpty() || !this.f2346o.isEmpty() || !this.f2349r.isEmpty() || !this.f2344m.isEmpty() || !this.f2343l.isEmpty() || !this.f2345n.isEmpty();
    }

    /* renamed from: g */
    public boolean mo3496g(RecyclerView.C0524d0 d0Var) {
        m3285v(d0Var);
        this.f2339h.add(d0Var);
        return true;
    }

    /* renamed from: i */
    public void mo3164i() {
        boolean z = !this.f2339h.isEmpty();
        boolean z2 = !this.f2341j.isEmpty();
        boolean z3 = !this.f2342k.isEmpty();
        boolean z4 = !this.f2340i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0524d0> it = this.f2339h.iterator();
            while (it.hasNext()) {
                m3284u(it.next());
            }
            this.f2339h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f2341j);
                this.f2344m.add(arrayList);
                this.f2341j.clear();
                C0576a aVar = new C0576a(arrayList);
                if (z) {
                    C0890v.m4758a(((C0585j) arrayList.get(0)).f2384a.f2168f, (Runnable) aVar, mo3161f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f2342k);
                this.f2345n.add(arrayList2);
                this.f2342k.clear();
                C0577b bVar = new C0577b(arrayList2);
                if (z) {
                    C0890v.m4758a(((C0584i) arrayList2.get(0)).f2378a.f2168f, (Runnable) bVar, mo3161f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f2340i);
                this.f2343l.add(arrayList3);
                this.f2340i.clear();
                C0578c cVar = new C0578c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? mo3161f() : 0;
                    long e = z2 ? mo3160e() : 0;
                    if (z3) {
                        j = mo3158d();
                    }
                    C0890v.m4758a(((RecyclerView.C0524d0) arrayList3.get(0)).f2168f, (Runnable) cVar, f + Math.max(e, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3497j() {
        if (!mo3162g()) {
            mo3146a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3498t(RecyclerView.C0524d0 d0Var) {
        View view = d0Var.f2168f;
        ViewPropertyAnimator animate = view.animate();
        this.f2346o.add(d0Var);
        animate.alpha(1.0f).setDuration(mo3155c()).setListener(new C0580e(d0Var, view, animate)).start();
    }
}
