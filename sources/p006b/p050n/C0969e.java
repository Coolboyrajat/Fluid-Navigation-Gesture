package p006b.p050n;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0453v;
import java.util.ArrayList;
import java.util.List;
import p006b.p050n.C0992m;

/* renamed from: b.n.e */
public class C0969e extends C0453v {

    /* renamed from: b.n.e$a */
    class C0970a extends C0992m.C0997e {
        C0970a(C0969e eVar, Rect rect) {
        }
    }

    /* renamed from: b.n.e$b */
    class C0971b implements C0992m.C0998f {

        /* renamed from: a */
        final /* synthetic */ View f3467a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3468b;

        C0971b(C0969e eVar, View view, ArrayList arrayList) {
            this.f3467a = view;
            this.f3468b = arrayList;
        }

        /* renamed from: a */
        public void mo4844a(C0992m mVar) {
        }

        /* renamed from: b */
        public void mo4845b(C0992m mVar) {
        }

        /* renamed from: c */
        public void mo4861c(C0992m mVar) {
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
            mVar.mo4906b((C0992m.C0998f) this);
            this.f3467a.setVisibility(8);
            int size = this.f3468b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3468b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: b.n.e$c */
    class C0972c implements C0992m.C0998f {

        /* renamed from: a */
        final /* synthetic */ Object f3469a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3470b;

        /* renamed from: c */
        final /* synthetic */ Object f3471c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3472d;

        /* renamed from: e */
        final /* synthetic */ Object f3473e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3474f;

        C0972c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3469a = obj;
            this.f3470b = arrayList;
            this.f3471c = obj2;
            this.f3472d = arrayList2;
            this.f3473e = obj3;
            this.f3474f = arrayList3;
        }

        /* renamed from: a */
        public void mo4844a(C0992m mVar) {
        }

        /* renamed from: b */
        public void mo4845b(C0992m mVar) {
        }

        /* renamed from: c */
        public void mo4861c(C0992m mVar) {
            Object obj = this.f3469a;
            if (obj != null) {
                C0969e.this.mo2614a(obj, (ArrayList<View>) this.f3470b, (ArrayList<View>) null);
            }
            Object obj2 = this.f3471c;
            if (obj2 != null) {
                C0969e.this.mo2614a(obj2, (ArrayList<View>) this.f3472d, (ArrayList<View>) null);
            }
            Object obj3 = this.f3473e;
            if (obj3 != null) {
                C0969e.this.mo2614a(obj3, (ArrayList<View>) this.f3474f, (ArrayList<View>) null);
            }
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
        }
    }

    /* renamed from: b.n.e$d */
    class C0973d extends C0992m.C0997e {
        C0973d(C0969e eVar, Rect rect) {
        }
    }

    /* renamed from: a */
    private static boolean m5077a(C0992m mVar) {
        return !C0453v.m2351a((List) mVar.mo4920i()) || !C0453v.m2351a((List) mVar.mo4921j()) || !C0453v.m2351a((List) mVar.mo4922k());
    }

    /* renamed from: a */
    public Object mo2607a(Object obj, Object obj2, Object obj3) {
        C0992m mVar = (C0992m) obj;
        C0992m mVar2 = (C0992m) obj2;
        C0992m mVar3 = (C0992m) obj3;
        if (mVar != null && mVar2 != null) {
            C1004q qVar = new C1004q();
            qVar.mo4937a(mVar);
            qVar.mo4937a(mVar2);
            qVar.mo4938b(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C1004q qVar2 = new C1004q();
        if (mVar != null) {
            qVar2.mo4937a(mVar);
        }
        qVar2.mo4937a(mVar3);
        return qVar2;
    }

    /* renamed from: a */
    public void mo2608a(ViewGroup viewGroup, Object obj) {
        C1000o.m5208a(viewGroup, (C0992m) obj);
    }

    /* renamed from: a */
    public void mo2609a(Object obj, Rect rect) {
        if (obj != null) {
            ((C0992m) obj).mo4901a((C0992m.C0997e) new C0973d(this, rect));
        }
    }

    /* renamed from: a */
    public void mo2610a(Object obj, View view) {
        if (obj != null) {
            ((C0992m) obj).mo4891a(view);
        }
    }

    /* renamed from: a */
    public void mo2611a(Object obj, View view, ArrayList<View> arrayList) {
        ((C0992m) obj).mo4892a((C0992m.C0998f) new C0971b(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo2612a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C0992m) obj).mo4892a((C0992m.C0998f) new C0972c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public void mo2613a(Object obj, ArrayList<View> arrayList) {
        C0992m mVar = (C0992m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C1004q) {
                C1004q qVar = (C1004q) mVar;
                int p = qVar.mo4939p();
                while (i < p) {
                    mo2613a((Object) qVar.mo4936a(i), arrayList);
                    i++;
                }
            } else if (!m5077a(mVar) && C0453v.m2351a((List) mVar.mo4923l())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo4891a(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2614a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0992m mVar = (C0992m) obj;
        int i = 0;
        if (mVar instanceof C1004q) {
            C1004q qVar = (C1004q) mVar;
            int p = qVar.mo4939p();
            while (i < p) {
                mo2614a((Object) qVar.mo4936a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m5077a(mVar)) {
            List<View> l = mVar.mo4923l();
            if (l.size() == arrayList.size() && l.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.mo4891a(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.mo4914d(arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo2615a(Object obj) {
        return obj instanceof C0992m;
    }

    /* renamed from: b */
    public Object mo2616b(Object obj) {
        if (obj != null) {
            return ((C0992m) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo2617b(Object obj, Object obj2, Object obj3) {
        C1004q qVar = new C1004q();
        if (obj != null) {
            qVar.mo4937a((C0992m) obj);
        }
        if (obj2 != null) {
            qVar.mo4937a((C0992m) obj2);
        }
        if (obj3 != null) {
            qVar.mo4937a((C0992m) obj3);
        }
        return qVar;
    }

    /* renamed from: b */
    public void mo2618b(Object obj, View view) {
        if (obj != null) {
            ((C0992m) obj).mo4914d(view);
        }
    }

    /* renamed from: b */
    public void mo2619b(Object obj, View view, ArrayList<View> arrayList) {
        C1004q qVar = (C1004q) obj;
        List<View> l = qVar.mo4923l();
        l.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0453v.m2350a(l, arrayList.get(i));
        }
        l.add(view);
        arrayList.add(view);
        mo2613a((Object) qVar, arrayList);
    }

    /* renamed from: b */
    public void mo2620b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1004q qVar = (C1004q) obj;
        if (qVar != null) {
            qVar.mo4923l().clear();
            qVar.mo4923l().addAll(arrayList2);
            mo2614a((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo2621c(Object obj) {
        if (obj == null) {
            return null;
        }
        C1004q qVar = new C1004q();
        qVar.mo4937a((C0992m) obj);
        return qVar;
    }

    /* renamed from: c */
    public void mo2622c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo2636a(view, rect);
            ((C0992m) obj).mo4901a((C0992m.C0997e) new C0970a(this, rect));
        }
    }
}
