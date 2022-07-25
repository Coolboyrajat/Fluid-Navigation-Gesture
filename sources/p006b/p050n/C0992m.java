package p006b.p050n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006b.p021d.C0723a;
import p006b.p021d.C0728d;
import p006b.p021d.C0736g;
import p006b.p026g.p035k.C0890v;
import p190io.objectbox.android.BuildConfig;

/* renamed from: b.n.m */
public abstract class C0992m implements Cloneable {

    /* renamed from: L */
    private static final int[] f3513L = {2, 1, 3, 4};

    /* renamed from: M */
    private static final C0977g f3514M = new C0993a();

    /* renamed from: N */
    private static ThreadLocal<C0723a<Animator, C0996d>> f3515N = new ThreadLocal<>();

    /* renamed from: A */
    boolean f3516A = false;

    /* renamed from: B */
    ArrayList<Animator> f3517B = new ArrayList<>();

    /* renamed from: C */
    private int f3518C = 0;

    /* renamed from: D */
    private boolean f3519D = false;

    /* renamed from: E */
    private boolean f3520E = false;

    /* renamed from: F */
    private ArrayList<C0998f> f3521F = null;

    /* renamed from: G */
    private ArrayList<Animator> f3522G = new ArrayList<>();

    /* renamed from: H */
    C1003p f3523H;

    /* renamed from: I */
    private C0997e f3524I;

    /* renamed from: J */
    private C0723a<String, String> f3525J;

    /* renamed from: K */
    private C0977g f3526K = f3514M;

    /* renamed from: f */
    private String f3527f = getClass().getName();

    /* renamed from: g */
    private long f3528g = -1;

    /* renamed from: h */
    long f3529h = -1;

    /* renamed from: i */
    private TimeInterpolator f3530i = null;

    /* renamed from: j */
    ArrayList<Integer> f3531j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<View> f3532k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<String> f3533l = null;

    /* renamed from: m */
    private ArrayList<Class> f3534m = null;

    /* renamed from: n */
    private ArrayList<Integer> f3535n = null;

    /* renamed from: o */
    private ArrayList<View> f3536o = null;

    /* renamed from: p */
    private ArrayList<Class> f3537p = null;

    /* renamed from: q */
    private ArrayList<String> f3538q = null;

    /* renamed from: r */
    private ArrayList<Integer> f3539r = null;

    /* renamed from: s */
    private ArrayList<View> f3540s = null;

    /* renamed from: t */
    private ArrayList<Class> f3541t = null;

    /* renamed from: u */
    private C1009t f3542u = new C1009t();

    /* renamed from: v */
    private C1009t f3543v = new C1009t();

    /* renamed from: w */
    C1004q f3544w = null;

    /* renamed from: x */
    private int[] f3545x = f3513L;

    /* renamed from: y */
    private ArrayList<C1008s> f3546y;

    /* renamed from: z */
    private ArrayList<C1008s> f3547z;

    /* renamed from: b.n.m$a */
    static class C0993a extends C0977g {
        C0993a() {
        }

        /* renamed from: a */
        public Path mo4868a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: b.n.m$b */
    class C0994b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0723a f3548a;

        C0994b(C0723a aVar) {
            this.f3548a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3548a.remove(animator);
            C0992m.this.f3517B.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C0992m.this.f3517B.add(animator);
        }
    }

    /* renamed from: b.n.m$c */
    class C0995c extends AnimatorListenerAdapter {
        C0995c() {
        }

        public void onAnimationEnd(Animator animator) {
            C0992m.this.mo4895a();
            animator.removeListener(this);
        }
    }

    /* renamed from: b.n.m$d */
    private static class C0996d {

        /* renamed from: a */
        View f3551a;

        /* renamed from: b */
        String f3552b;

        /* renamed from: c */
        C1008s f3553c;

        /* renamed from: d */
        C0991l0 f3554d;

        /* renamed from: e */
        C0992m f3555e;

        C0996d(View view, String str, C0992m mVar, C0991l0 l0Var, C1008s sVar) {
            this.f3551a = view;
            this.f3552b = str;
            this.f3553c = sVar;
            this.f3554d = l0Var;
            this.f3555e = mVar;
        }
    }

    /* renamed from: b.n.m$e */
    public static abstract class C0997e {
    }

    /* renamed from: b.n.m$f */
    public interface C0998f {
        /* renamed from: a */
        void mo4844a(C0992m mVar);

        /* renamed from: b */
        void mo4845b(C0992m mVar);

        /* renamed from: c */
        void mo4861c(C0992m mVar);

        /* renamed from: d */
        void mo4846d(C0992m mVar);
    }

    /* renamed from: a */
    private void m5147a(Animator animator, C0723a<Animator, C0996d> aVar) {
        if (animator != null) {
            animator.addListener(new C0994b(aVar));
            mo4896a(animator);
        }
    }

    /* renamed from: a */
    private void m5148a(C0723a<View, C1008s> aVar, C0723a<View, C1008s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1008s d = aVar.mo4199d(i);
            if (mo4909b(d.f3574b)) {
                this.f3546y.add(d);
                this.f3547z.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1008s d2 = aVar2.mo4199d(i2);
            if (mo4909b(d2.f3574b)) {
                this.f3547z.add(d2);
                this.f3546y.add((Object) null);
            }
        }
    }

    /* renamed from: a */
    private void m5149a(C0723a<View, C1008s> aVar, C0723a<View, C1008s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo4909b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo4909b(view)) {
                C1008s sVar = aVar.get(valueAt);
                C1008s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f3546y.add(sVar);
                    this.f3547z.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m5150a(C0723a<View, C1008s> aVar, C0723a<View, C1008s> aVar2, C0723a<String, View> aVar3, C0723a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View d = aVar3.mo4199d(i);
            if (d != null && mo4909b(d) && (view = aVar4.get(aVar3.mo4194b(i))) != null && mo4909b(view)) {
                C1008s sVar = aVar.get(d);
                C1008s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f3546y.add(sVar);
                    this.f3547z.add(sVar2);
                    aVar.remove(d);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m5151a(C0723a<View, C1008s> aVar, C0723a<View, C1008s> aVar2, C0728d<View> dVar, C0728d<View> dVar2) {
        View b;
        int b2 = dVar.mo4109b();
        for (int i = 0; i < b2; i++) {
            View c = dVar.mo4114c(i);
            if (c != null && mo4909b(c) && (b = dVar2.mo4110b(dVar.mo4105a(i))) != null && mo4909b(b)) {
                C1008s sVar = aVar.get(c);
                C1008s sVar2 = aVar2.get(b);
                if (!(sVar == null || sVar2 == null)) {
                    this.f3546y.add(sVar);
                    this.f3547z.add(sVar2);
                    aVar.remove(c);
                    aVar2.remove(b);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m5152a(C1009t tVar, View view, C1008s sVar) {
        tVar.f3576a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f3577b.indexOfKey(id) >= 0) {
                tVar.f3577b.put(id, (Object) null);
            } else {
                tVar.f3577b.put(id, view);
            }
        }
        String u = C0890v.m4797u(view);
        if (u != null) {
            if (tVar.f3579d.containsKey(u)) {
                tVar.f3579d.put(u, null);
            } else {
                tVar.f3579d.put(u, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f3578c.mo4113c(itemIdAtPosition) >= 0) {
                    View b = tVar.f3578c.mo4110b(itemIdAtPosition);
                    if (b != null) {
                        C0890v.m4772c(b, false);
                        tVar.f3578c.mo4115c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0890v.m4772c(view, true);
                tVar.f3578c.mo4115c(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    private void m5153a(C1009t tVar, C1009t tVar2) {
        C0723a aVar = new C0723a((C0736g) tVar.f3576a);
        C0723a aVar2 = new C0723a((C0736g) tVar2.f3576a);
        int i = 0;
        while (true) {
            int[] iArr = this.f3545x;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m5155b((C0723a<View, C1008s>) aVar, (C0723a<View, C1008s>) aVar2);
                } else if (i2 == 2) {
                    m5150a((C0723a<View, C1008s>) aVar, (C0723a<View, C1008s>) aVar2, tVar.f3579d, tVar2.f3579d);
                } else if (i2 == 3) {
                    m5149a((C0723a<View, C1008s>) aVar, (C0723a<View, C1008s>) aVar2, tVar.f3577b, tVar2.f3577b);
                } else if (i2 == 4) {
                    m5151a((C0723a<View, C1008s>) aVar, (C0723a<View, C1008s>) aVar2, tVar.f3578c, tVar2.f3578c);
                }
                i++;
            } else {
                m5148a((C0723a<View, C1008s>) aVar, (C0723a<View, C1008s>) aVar2);
                return;
            }
        }
    }

    /* renamed from: a */
    private static boolean m5154a(C1008s sVar, C1008s sVar2, String str) {
        Object obj = sVar.f3573a.get(str);
        Object obj2 = sVar2.f3573a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: b */
    private void m5155b(C0723a<View, C1008s> aVar, C0723a<View, C1008s> aVar2) {
        C1008s remove;
        View view;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b = aVar.mo4194b(size);
            if (!(b == null || !mo4909b(b) || (remove = aVar2.remove(b)) == null || (view = remove.f3574b) == null || !mo4909b(view))) {
                this.f3546y.add(aVar.mo4195c(size));
                this.f3547z.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m5156c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f3535n;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f3536o;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f3537p;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f3537p.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1008s sVar = new C1008s();
                        sVar.f3574b = view;
                        if (z) {
                            mo4815c(sVar);
                        } else {
                            mo4814a(sVar);
                        }
                        sVar.f3575c.add(this);
                        mo4908b(sVar);
                        m5152a(z ? this.f3542u : this.f3543v, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f3539r;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f3540s;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f3541t;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f3541t.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m5156c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private static C0723a<Animator, C0996d> mo4939p() {
        C0723a<Animator, C0996d> aVar = f3515N.get();
        if (aVar != null) {
            return aVar;
        }
        C0723a<Animator, C0996d> aVar2 = new C0723a<>();
        f3515N.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo4813a(ViewGroup viewGroup, C1008s sVar, C1008s sVar2) {
        return null;
    }

    /* renamed from: a */
    public C0992m mo4889a(long j) {
        this.f3529h = j;
        return this;
    }

    /* renamed from: a */
    public C0992m mo4890a(TimeInterpolator timeInterpolator) {
        this.f3530i = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public C0992m mo4891a(View view) {
        this.f3532k.add(view);
        return this;
    }

    /* renamed from: a */
    public C0992m mo4892a(C0998f fVar) {
        if (this.f3521F == null) {
            this.f3521F = new ArrayList<>();
        }
        this.f3521F.add(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1008s mo4893a(View view, boolean z) {
        C1004q qVar = this.f3544w;
        if (qVar != null) {
            return qVar.mo4893a(view, z);
        }
        ArrayList<C1008s> arrayList = z ? this.f3546y : this.f3547z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1008s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f3574b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f3547z : this.f3546y).get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo4894a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3529h != -1) {
            str2 = str2 + "dur(" + this.f3529h + ") ";
        }
        if (this.f3528g != -1) {
            str2 = str2 + "dly(" + this.f3528g + ") ";
        }
        if (this.f3530i != null) {
            str2 = str2 + "interp(" + this.f3530i + ") ";
        }
        if (this.f3531j.size() <= 0 && this.f3532k.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f3531j.size() > 0) {
            String str4 = str3;
            for (int i = 0; i < this.f3531j.size(); i++) {
                if (i > 0) {
                    str4 = str4 + ", ";
                }
                str4 = str4 + this.f3531j.get(i);
            }
            str3 = str4;
        }
        if (this.f3532k.size() > 0) {
            for (int i2 = 0; i2 < this.f3532k.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3532k.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4895a() {
        this.f3518C--;
        if (this.f3518C == 0) {
            ArrayList<C0998f> arrayList = this.f3521F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3521F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0998f) arrayList2.get(i)).mo4846d(this);
                }
            }
            for (int i2 = 0; i2 < this.f3542u.f3578c.mo4109b(); i2++) {
                View c = this.f3542u.f3578c.mo4114c(i2);
                if (c != null) {
                    C0890v.m4772c(c, false);
                }
            }
            for (int i3 = 0; i3 < this.f3543v.f3578c.mo4109b(); i3++) {
                View c2 = this.f3543v.f3578c.mo4114c(i3);
                if (c2 != null) {
                    C0890v.m4772c(c2, false);
                }
            }
            this.f3520E = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4896a(Animator animator) {
        if (animator == null) {
            mo4895a();
            return;
        }
        if (mo4904b() >= 0) {
            animator.setDuration(mo4904b());
        }
        if (mo4919h() >= 0) {
            animator.setStartDelay(mo4919h());
        }
        if (mo4913d() != null) {
            animator.setInterpolator(mo4913d());
        }
        animator.addListener(new C0995c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4897a(ViewGroup viewGroup) {
        C0996d dVar;
        this.f3546y = new ArrayList<>();
        this.f3547z = new ArrayList<>();
        m5153a(this.f3542u, this.f3543v);
        C0723a<Animator, C0996d> p = mo4939p();
        int size = p.size();
        C0991l0 d = C0966d0.m5071d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b = p.mo4194b(i);
            if (!(b == null || (dVar = p.get(b)) == null || dVar.f3551a == null || !d.equals(dVar.f3554d))) {
                C1008s sVar = dVar.f3553c;
                View view = dVar.f3551a;
                C1008s b2 = mo4907b(view, true);
                C1008s a = mo4893a(view, true);
                if (b2 == null && a == null) {
                    a = this.f3543v.f3576a.get(view);
                }
                if (!(b2 == null && a == null) && dVar.f3555e.mo4875a(sVar, a)) {
                    if (b.isRunning() || b.isStarted()) {
                        b.cancel();
                    } else {
                        p.remove(b);
                    }
                }
            }
        }
        mo4898a(viewGroup, this.f3542u, this.f3543v, this.f3546y, this.f3547z);
        mo4924n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4898a(ViewGroup viewGroup, C1009t tVar, C1009t tVar2, ArrayList<C1008s> arrayList, ArrayList<C1008s> arrayList2) {
        int i;
        int i2;
        Animator a;
        View view;
        Animator animator;
        C1008s sVar;
        C1008s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C0723a<Animator, C0996d> p = mo4939p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1008s sVar3 = arrayList.get(i3);
            C1008s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f3575c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f3575c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || mo4875a(sVar3, sVar4)) && (a = mo4813a(viewGroup2, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f3574b;
                        String[] m = mo4816m();
                        if (view != null && m != null && m.length > 0) {
                            sVar2 = new C1008s();
                            sVar2.f3574b = view;
                            Animator animator3 = a;
                            i2 = size;
                            C1008s sVar5 = tVar2.f3576a.get(view);
                            if (sVar5 != null) {
                                int i4 = 0;
                                while (i4 < m.length) {
                                    sVar2.f3573a.put(m[i4], sVar5.f3573a.get(m[i4]));
                                    i4++;
                                    ArrayList<C1008s> arrayList3 = arrayList2;
                                    i3 = i3;
                                    sVar5 = sVar5;
                                }
                            }
                            i = i3;
                            int size2 = p.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C0996d dVar = p.get(p.mo4194b(i5));
                                if (dVar.f3553c != null && dVar.f3551a == view && dVar.f3552b.equals(mo4915e()) && dVar.f3553c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = a;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = sVar3.f3574b;
                        animator = a;
                        sVar = null;
                    }
                    if (animator != null) {
                        C1003p pVar = this.f3523H;
                        if (pVar != null) {
                            long a2 = pVar.mo4933a(viewGroup2, this, sVar3, sVar4);
                            sparseIntArray.put(this.f3522G.size(), (int) a2);
                            j = Math.min(a2, j);
                        }
                        p.put(animator, new C0996d(view, mo4915e(), this, C0966d0.m5071d(viewGroup), sVar));
                        this.f3522G.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f3522G.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4899a(ViewGroup viewGroup, boolean z) {
        C0723a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        mo4903a(z);
        if ((this.f3531j.size() > 0 || this.f3532k.size() > 0) && (((arrayList = this.f3533l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3534m) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f3531j.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f3531j.get(i).intValue());
                if (findViewById != null) {
                    C1008s sVar = new C1008s();
                    sVar.f3574b = findViewById;
                    if (z) {
                        mo4815c(sVar);
                    } else {
                        mo4814a(sVar);
                    }
                    sVar.f3575c.add(this);
                    mo4908b(sVar);
                    m5152a(z ? this.f3542u : this.f3543v, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f3532k.size(); i2++) {
                View view = this.f3532k.get(i2);
                C1008s sVar2 = new C1008s();
                sVar2.f3574b = view;
                if (z) {
                    mo4815c(sVar2);
                } else {
                    mo4814a(sVar2);
                }
                sVar2.f3575c.add(this);
                mo4908b(sVar2);
                m5152a(z ? this.f3542u : this.f3543v, view, sVar2);
            }
        } else {
            m5156c(viewGroup, z);
        }
        if (!z && (aVar = this.f3525J) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f3542u.f3579d.remove(this.f3525J.mo4194b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f3542u.f3579d.put(this.f3525J.mo4199d(i4), view2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4900a(C0977g gVar) {
        if (gVar == null) {
            gVar = f3514M;
        }
        this.f3526K = gVar;
    }

    /* renamed from: a */
    public void mo4901a(C0997e eVar) {
        this.f3524I = eVar;
    }

    /* renamed from: a */
    public void mo4902a(C1003p pVar) {
        this.f3523H = pVar;
    }

    /* renamed from: a */
    public abstract void mo4814a(C1008s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4903a(boolean z) {
        C1009t tVar;
        if (z) {
            this.f3542u.f3576a.clear();
            this.f3542u.f3577b.clear();
            tVar = this.f3542u;
        } else {
            this.f3543v.f3576a.clear();
            this.f3543v.f3577b.clear();
            tVar = this.f3543v;
        }
        tVar.f3578c.mo4106a();
    }

    /* renamed from: a */
    public boolean mo4875a(C1008s sVar, C1008s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] m = mo4816m();
        if (m != null) {
            int length = m.length;
            int i = 0;
            while (i < length) {
                if (!m5154a(sVar, sVar2, m[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : sVar.f3573a.keySet()) {
            if (m5154a(sVar, sVar2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    public long mo4904b() {
        return this.f3529h;
    }

    /* renamed from: b */
    public C0992m mo4905b(long j) {
        this.f3528g = j;
        return this;
    }

    /* renamed from: b */
    public C0992m mo4906b(C0998f fVar) {
        ArrayList<C0998f> arrayList = this.f3521F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f3521F.size() == 0) {
            this.f3521F = null;
        }
        return this;
    }

    /* renamed from: b */
    public C1008s mo4907b(View view, boolean z) {
        C1004q qVar = this.f3544w;
        if (qVar != null) {
            return qVar.mo4907b(view, z);
        }
        return (z ? this.f3542u : this.f3543v).f3576a.get(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4908b(C1008s sVar) {
        String[] a;
        if (this.f3523H != null && !sVar.f3573a.isEmpty() && (a = this.f3523H.mo4935a()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= a.length) {
                    z = true;
                    break;
                } else if (!sVar.f3573a.containsKey(a[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f3523H.mo4934a(sVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4909b(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f3535n;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f3536o;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f3537p;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f3537p.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f3538q != null && C0890v.m4797u(view) != null && this.f3538q.contains(C0890v.m4797u(view))) {
            return false;
        }
        if ((this.f3531j.size() == 0 && this.f3532k.size() == 0 && (((arrayList = this.f3534m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3533l) == null || arrayList2.isEmpty()))) || this.f3531j.contains(Integer.valueOf(id)) || this.f3532k.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f3533l;
        if (arrayList6 != null && arrayList6.contains(C0890v.m4797u(view))) {
            return true;
        }
        if (this.f3534m != null) {
            for (int i2 = 0; i2 < this.f3534m.size(); i2++) {
                if (this.f3534m.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public C0997e mo4910c() {
        return this.f3524I;
    }

    /* renamed from: c */
    public void mo4911c(View view) {
        if (!this.f3520E) {
            C0723a<Animator, C0996d> p = mo4939p();
            int size = p.size();
            C0991l0 d = C0966d0.m5071d(view);
            for (int i = size - 1; i >= 0; i--) {
                C0996d d2 = p.mo4199d(i);
                if (d2.f3551a != null && d.equals(d2.f3554d)) {
                    C0944a.m5014a(p.mo4194b(i));
                }
            }
            ArrayList<C0998f> arrayList = this.f3521F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3521F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0998f) arrayList2.get(i2)).mo4844a(this);
                }
            }
            this.f3519D = true;
        }
    }

    /* renamed from: c */
    public abstract void mo4815c(C1008s sVar);

    public C0992m clone() {
        try {
            C0992m mVar = (C0992m) super.clone();
            mVar.f3522G = new ArrayList<>();
            mVar.f3542u = new C1009t();
            mVar.f3543v = new C1009t();
            mVar.f3546y = null;
            mVar.f3547z = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public TimeInterpolator mo4913d() {
        return this.f3530i;
    }

    /* renamed from: d */
    public C0992m mo4914d(View view) {
        this.f3532k.remove(view);
        return this;
    }

    /* renamed from: e */
    public String mo4915e() {
        return this.f3527f;
    }

    /* renamed from: e */
    public void mo4916e(View view) {
        if (this.f3519D) {
            if (!this.f3520E) {
                C0723a<Animator, C0996d> p = mo4939p();
                int size = p.size();
                C0991l0 d = C0966d0.m5071d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0996d d2 = p.mo4199d(i);
                    if (d2.f3551a != null && d.equals(d2.f3554d)) {
                        C0944a.m5016b(p.mo4194b(i));
                    }
                }
                ArrayList<C0998f> arrayList = this.f3521F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3521F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0998f) arrayList2.get(i2)).mo4845b(this);
                    }
                }
            }
            this.f3519D = false;
        }
    }

    /* renamed from: f */
    public C0977g mo4917f() {
        return this.f3526K;
    }

    /* renamed from: g */
    public C1003p mo4918g() {
        return this.f3523H;
    }

    /* renamed from: h */
    public long mo4919h() {
        return this.f3528g;
    }

    /* renamed from: i */
    public List<Integer> mo4920i() {
        return this.f3531j;
    }

    /* renamed from: j */
    public List<String> mo4921j() {
        return this.f3533l;
    }

    /* renamed from: k */
    public List<Class> mo4922k() {
        return this.f3534m;
    }

    /* renamed from: l */
    public List<View> mo4923l() {
        return this.f3532k;
    }

    /* renamed from: m */
    public String[] mo4816m() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4924n() {
        mo4925o();
        C0723a<Animator, C0996d> p = mo4939p();
        Iterator<Animator> it = this.f3522G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p.containsKey(next)) {
                mo4925o();
                m5147a(next, p);
            }
        }
        this.f3522G.clear();
        mo4895a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4925o() {
        if (this.f3518C == 0) {
            ArrayList<C0998f> arrayList = this.f3521F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3521F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C0998f) arrayList2.get(i)).mo4861c(this);
                }
            }
            this.f3520E = false;
        }
        this.f3518C++;
    }

    public String toString() {
        return mo4894a(BuildConfig.FLAVOR);
    }
}
