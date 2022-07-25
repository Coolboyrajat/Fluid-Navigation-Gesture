package p006b.p050n;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p050n.C0992m;

/* renamed from: b.n.q */
public class C1004q extends C0992m {

    /* renamed from: O */
    private ArrayList<C0992m> f3563O = new ArrayList<>();

    /* renamed from: P */
    private boolean f3564P = true;

    /* renamed from: Q */
    int f3565Q;

    /* renamed from: R */
    boolean f3566R = false;

    /* renamed from: S */
    private int f3567S = 0;

    /* renamed from: b.n.q$a */
    class C1005a extends C0999n {

        /* renamed from: a */
        final /* synthetic */ C0992m f3568a;

        C1005a(C1004q qVar, C0992m mVar) {
            this.f3568a = mVar;
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
            this.f3568a.mo4924n();
            mVar.mo4906b((C0992m.C0998f) this);
        }
    }

    /* renamed from: b.n.q$b */
    static class C1006b extends C0999n {

        /* renamed from: a */
        C1004q f3569a;

        C1006b(C1004q qVar) {
            this.f3569a = qVar;
        }

        /* renamed from: c */
        public void mo4861c(C0992m mVar) {
            C1004q qVar = this.f3569a;
            if (!qVar.f3566R) {
                qVar.mo4925o();
                this.f3569a.f3566R = true;
            }
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
            C1004q qVar = this.f3569a;
            qVar.f3565Q--;
            if (qVar.f3565Q == 0) {
                qVar.f3566R = false;
                qVar.mo4895a();
            }
            mVar.mo4906b((C0992m.C0998f) this);
        }
    }

    /* renamed from: q */
    private void m5216q() {
        C1006b bVar = new C1006b(this);
        Iterator<C0992m> it = this.f3563O.iterator();
        while (it.hasNext()) {
            it.next().mo4892a((C0992m.C0998f) bVar);
        }
        this.f3565Q = this.f3563O.size();
    }

    /* renamed from: a */
    public C0992m mo4936a(int i) {
        if (i < 0 || i >= this.f3563O.size()) {
            return null;
        }
        return this.f3563O.get(i);
    }

    /* renamed from: a */
    public C1004q m5222a(long j) {
        super.mo4889a(j);
        if (this.f3529h >= 0) {
            int size = this.f3563O.size();
            for (int i = 0; i < size; i++) {
                this.f3563O.get(i).mo4889a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C1004q m5223a(TimeInterpolator timeInterpolator) {
        this.f3567S |= 1;
        ArrayList<C0992m> arrayList = this.f3563O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3563O.get(i).mo4890a(timeInterpolator);
            }
        }
        super.mo4890a(timeInterpolator);
        return this;
    }

    /* renamed from: a */
    public C1004q m5224a(View view) {
        for (int i = 0; i < this.f3563O.size(); i++) {
            this.f3563O.get(i).mo4891a(view);
        }
        super.mo4891a(view);
        return this;
    }

    /* renamed from: a */
    public C1004q m5225a(C0992m.C0998f fVar) {
        super.mo4892a(fVar);
        return this;
    }

    /* renamed from: a */
    public C1004q mo4937a(C0992m mVar) {
        this.f3563O.add(mVar);
        mVar.f3544w = this;
        long j = this.f3529h;
        if (j >= 0) {
            mVar.mo4889a(j);
        }
        if ((this.f3567S & 1) != 0) {
            mVar.mo4890a(mo4913d());
        }
        if ((this.f3567S & 2) != 0) {
            mVar.mo4902a(mo4918g());
        }
        if ((this.f3567S & 4) != 0) {
            mVar.mo4900a(mo4917f());
        }
        if ((this.f3567S & 8) != 0) {
            mVar.mo4901a(mo4910c());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo4894a(String str) {
        String a = super.mo4894a(str);
        for (int i = 0; i < this.f3563O.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(this.f3563O.get(i).mo4894a(str + "  "));
            a = sb.toString();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4898a(ViewGroup viewGroup, C1009t tVar, C1009t tVar2, ArrayList<C1008s> arrayList, ArrayList<C1008s> arrayList2) {
        long h = mo4919h();
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            C0992m mVar = this.f3563O.get(i);
            if (h > 0 && (this.f3564P || i == 0)) {
                long h2 = mVar.mo4919h();
                if (h2 > 0) {
                    mVar.mo4905b(h2 + h);
                } else {
                    mVar.mo4905b(h);
                }
            }
            mVar.mo4898a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo4900a(C0977g gVar) {
        super.mo4900a(gVar);
        this.f3567S |= 4;
        for (int i = 0; i < this.f3563O.size(); i++) {
            this.f3563O.get(i).mo4900a(gVar);
        }
    }

    /* renamed from: a */
    public void mo4901a(C0992m.C0997e eVar) {
        super.mo4901a(eVar);
        this.f3567S |= 8;
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            this.f3563O.get(i).mo4901a(eVar);
        }
    }

    /* renamed from: a */
    public void mo4902a(C1003p pVar) {
        super.mo4902a(pVar);
        this.f3567S |= 2;
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            this.f3563O.get(i).mo4902a(pVar);
        }
    }

    /* renamed from: a */
    public void mo4814a(C1008s sVar) {
        if (mo4909b(sVar.f3574b)) {
            Iterator<C0992m> it = this.f3563O.iterator();
            while (it.hasNext()) {
                C0992m next = it.next();
                if (next.mo4909b(sVar.f3574b)) {
                    next.mo4814a(sVar);
                    sVar.f3575c.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public C1004q mo4938b(int i) {
        if (i == 0) {
            this.f3564P = true;
        } else if (i == 1) {
            this.f3564P = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: b */
    public C1004q m5236b(long j) {
        super.mo4905b(j);
        return this;
    }

    /* renamed from: b */
    public C1004q m5237b(C0992m.C0998f fVar) {
        super.mo4906b(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4908b(C1008s sVar) {
        super.mo4908b(sVar);
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            this.f3563O.get(i).mo4908b(sVar);
        }
    }

    /* renamed from: c */
    public void mo4911c(View view) {
        super.mo4911c(view);
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            this.f3563O.get(i).mo4911c(view);
        }
    }

    /* renamed from: c */
    public void mo4815c(C1008s sVar) {
        if (mo4909b(sVar.f3574b)) {
            Iterator<C0992m> it = this.f3563O.iterator();
            while (it.hasNext()) {
                C0992m next = it.next();
                if (next.mo4909b(sVar.f3574b)) {
                    next.mo4815c(sVar);
                    sVar.f3575c.add(next);
                }
            }
        }
    }

    public C0992m clone() {
        C1004q qVar = (C1004q) super.clone();
        qVar.f3563O = new ArrayList<>();
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            qVar.mo4937a(this.f3563O.get(i).clone());
        }
        return qVar;
    }

    /* renamed from: d */
    public C1004q m5242d(View view) {
        for (int i = 0; i < this.f3563O.size(); i++) {
            this.f3563O.get(i).mo4914d(view);
        }
        super.mo4914d(view);
        return this;
    }

    /* renamed from: e */
    public void mo4916e(View view) {
        super.mo4916e(view);
        int size = this.f3563O.size();
        for (int i = 0; i < size; i++) {
            this.f3563O.get(i).mo4916e(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4924n() {
        if (this.f3563O.isEmpty()) {
            mo4925o();
            mo4895a();
            return;
        }
        m5216q();
        if (!this.f3564P) {
            for (int i = 1; i < this.f3563O.size(); i++) {
                this.f3563O.get(i - 1).mo4892a((C0992m.C0998f) new C1005a(this, this.f3563O.get(i)));
            }
            C0992m mVar = this.f3563O.get(0);
            if (mVar != null) {
                mVar.mo4924n();
                return;
            }
            return;
        }
        Iterator<C0992m> it = this.f3563O.iterator();
        while (it.hasNext()) {
            it.next().mo4924n();
        }
    }

    /* renamed from: p */
    public int mo4939p() {
        return this.f3563O.size();
    }
}
