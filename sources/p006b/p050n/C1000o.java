package p006b.p050n;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p021d.C0723a;
import p006b.p026g.p035k.C0890v;
import p006b.p050n.C0992m;

/* renamed from: b.n.o */
public class C1000o {

    /* renamed from: a */
    private static C0992m f3556a = new C0948b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0723a<ViewGroup, ArrayList<C0992m>>>> f3557b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f3558c = new ArrayList<>();

    /* renamed from: b.n.o$a */
    private static class C1001a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        C0992m f3559f;

        /* renamed from: g */
        ViewGroup f3560g;

        /* renamed from: b.n.o$a$a */
        class C1002a extends C0999n {

            /* renamed from: a */
            final /* synthetic */ C0723a f3561a;

            C1002a(C0723a aVar) {
                this.f3561a = aVar;
            }

            /* renamed from: d */
            public void mo4846d(C0992m mVar) {
                ((ArrayList) this.f3561a.get(C1001a.this.f3560g)).remove(mVar);
            }
        }

        C1001a(C0992m mVar, ViewGroup viewGroup) {
            this.f3559f = mVar;
            this.f3560g = viewGroup;
        }

        /* renamed from: a */
        private void m5211a() {
            this.f3560g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3560g.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m5211a();
            if (!C1000o.f3558c.remove(this.f3560g)) {
                return true;
            }
            C0723a<ViewGroup, ArrayList<C0992m>> a = C1000o.m5207a();
            ArrayList arrayList = a.get(this.f3560g);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f3560g, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3559f);
            this.f3559f.mo4892a((C0992m.C0998f) new C1002a(a));
            this.f3559f.mo4899a(this.f3560g, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0992m) it.next()).mo4916e(this.f3560g);
                }
            }
            this.f3559f.mo4897a(this.f3560g);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m5211a();
            C1000o.f3558c.remove(this.f3560g);
            ArrayList arrayList = C1000o.m5207a().get(this.f3560g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0992m) it.next()).mo4916e(this.f3560g);
                }
            }
            this.f3559f.mo4903a(true);
        }
    }

    /* renamed from: a */
    static C0723a<ViewGroup, ArrayList<C0992m>> m5207a() {
        C0723a<ViewGroup, ArrayList<C0992m>> aVar;
        WeakReference weakReference = f3557b.get();
        if (weakReference != null && (aVar = (C0723a) weakReference.get()) != null) {
            return aVar;
        }
        C0723a<ViewGroup, ArrayList<C0992m>> aVar2 = new C0723a<>();
        f3557b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public static void m5208a(ViewGroup viewGroup, C0992m mVar) {
        if (!f3558c.contains(viewGroup) && C0890v.m4732C(viewGroup)) {
            f3558c.add(viewGroup);
            if (mVar == null) {
                mVar = f3556a;
            }
            C0992m clone = mVar.clone();
            m5210c(viewGroup, clone);
            C0990l.m5145a(viewGroup, (C0990l) null);
            m5209b(viewGroup, clone);
        }
    }

    /* renamed from: b */
    private static void m5209b(ViewGroup viewGroup, C0992m mVar) {
        if (mVar != null && viewGroup != null) {
            C1001a aVar = new C1001a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m5210c(ViewGroup viewGroup, C0992m mVar) {
        ArrayList arrayList = m5207a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0992m) it.next()).mo4911c((View) viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo4899a(viewGroup, true);
        }
        C0990l a = C0990l.m5144a(viewGroup);
        if (a != null) {
            a.mo4888a();
        }
    }
}
