package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.u */
class C0448u extends C0453v {

    /* renamed from: androidx.fragment.app.u$a */
    class C0449a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f1989a;

        C0449a(C0448u uVar, Rect rect) {
            this.f1989a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f1989a;
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    class C0450b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f1990a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1991b;

        C0450b(C0448u uVar, View view, ArrayList arrayList) {
            this.f1990a = view;
            this.f1991b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1990a.setVisibility(8);
            int size = this.f1991b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1991b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.u$c */
    class C0451c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f1992a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1993b;

        /* renamed from: c */
        final /* synthetic */ Object f1994c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f1995d;

        /* renamed from: e */
        final /* synthetic */ Object f1996e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f1997f;

        C0451c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1992a = obj;
            this.f1993b = arrayList;
            this.f1994c = obj2;
            this.f1995d = arrayList2;
            this.f1996e = obj3;
            this.f1997f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f1992a;
            if (obj != null) {
                C0448u.this.mo2614a(obj, (ArrayList<View>) this.f1993b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1994c;
            if (obj2 != null) {
                C0448u.this.mo2614a(obj2, (ArrayList<View>) this.f1995d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1996e;
            if (obj3 != null) {
                C0448u.this.mo2614a(obj3, (ArrayList<View>) this.f1997f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.u$d */
    class C0452d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f1999a;

        C0452d(C0448u uVar, Rect rect) {
            this.f1999a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1999a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1999a;
        }
    }

    C0448u() {
    }

    /* renamed from: a */
    private static boolean m2332a(Transition transition) {
        return !C0453v.m2351a((List) transition.getTargetIds()) || !C0453v.m2351a((List) transition.getTargetNames()) || !C0453v.m2351a((List) transition.getTargetTypes());
    }

    /* renamed from: a */
    public Object mo2607a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo2608a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo2609a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0452d(this, rect));
        }
    }

    /* renamed from: a */
    public void mo2610a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo2611a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0450b(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo2612a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0451c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public void mo2613a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2613a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2332a(transition) && C0453v.m2351a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2614a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2614a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2332a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: a */
    public boolean mo2615a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo2616b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo2617b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public void mo2618b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: b */
    public void mo2619b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0453v.m2350a((List<View>) targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2613a((Object) transitionSet, arrayList);
    }

    /* renamed from: b */
    public void mo2620b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2614a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo2621c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: c */
    public void mo2622c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo2636a(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0449a(this, rect));
        }
    }
}
