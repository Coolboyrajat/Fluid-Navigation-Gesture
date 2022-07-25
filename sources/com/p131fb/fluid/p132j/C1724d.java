package com.p131fb.fluid.p132j;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C0374e;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.p003m.C0386a;
import com.google.android.material.button.MaterialButton;
import com.p131fb.fluid.p133k.p134a.C1727a;
import com.p131fb.fluid.p148ui.C2032b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.j.d */
public class C1724d extends C1723c implements C1727a.C1728a {

    /* renamed from: L */
    private static final ViewDataBinding.C0362j f4998L = null;

    /* renamed from: M */
    private static final SparseIntArray f4999M = new SparseIntArray();

    /* renamed from: A */
    private final MaterialButton f5000A;

    /* renamed from: B */
    private final MaterialButton f5001B;

    /* renamed from: C */
    private final MaterialButton f5002C;

    /* renamed from: D */
    private final MaterialButton f5003D;

    /* renamed from: E */
    private final View.OnClickListener f5004E;

    /* renamed from: F */
    private final View.OnClickListener f5005F;

    /* renamed from: G */
    private final View.OnClickListener f5006G;

    /* renamed from: H */
    private final View.OnClickListener f5007H;

    /* renamed from: I */
    private final View.OnClickListener f5008I;

    /* renamed from: J */
    private final View.OnClickListener f5009J;

    /* renamed from: K */
    private long f5010K;

    /* renamed from: z */
    private final NestedScrollView f5011z;

    static {
        f4999M.put(C3148R.C3151id.toolbar_title, 8);
        f4999M.put(C3148R.C3151id.txt_title, 9);
    }

    public C1724d(C0374e eVar, View view) {
        this(eVar, view, ViewDataBinding.m1765a(eVar, view, 10, f4998L, f4999M));
    }

    private C1724d(C0374e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[6], objArr[7], objArr[8], objArr[1], objArr[9]);
        this.f5010K = -1;
        this.f4994v.setTag((Object) null);
        this.f4995w.setTag((Object) null);
        this.f5011z = objArr[0];
        this.f5011z.setTag((Object) null);
        this.f5000A = objArr[2];
        this.f5000A.setTag((Object) null);
        this.f5001B = objArr[3];
        this.f5001B.setTag((Object) null);
        this.f5002C = objArr[4];
        this.f5002C.setTag((Object) null);
        this.f5003D = objArr[5];
        this.f5003D.setTag((Object) null);
        this.f4996x.setTag((Object) null);
        mo2134a(view);
        this.f5004E = new C1727a(this, 5);
        this.f5005F = new C1727a(this, 6);
        this.f5006G = new C1727a(this, 3);
        this.f5007H = new C1727a(this, 4);
        this.f5008I = new C1727a(this, 1);
        this.f5009J = new C1727a(this, 2);
        mo6459i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2132a() {
        long j;
        synchronized (this) {
            j = this.f5010K;
            this.f5010K = 0;
        }
        C2032b bVar = this.f4997y;
        String str = null;
        int i = ((3 & j) > 0 ? 1 : ((3 & j) == 0 ? 0 : -1));
        if (!(i == 0 || bVar == null)) {
            str = bVar.mo6876l();
        }
        if ((j & 2) != 0) {
            this.f4994v.setOnClickListener(this.f5004E);
            this.f4995w.setOnClickListener(this.f5005F);
            this.f5000A.setOnClickListener(this.f5008I);
            this.f5001B.setOnClickListener(this.f5009J);
            this.f5002C.setOnClickListener(this.f5006G);
            this.f5003D.setOnClickListener(this.f5007H);
        }
        if (i != 0) {
            C0386a.m1867a((TextView) this.f4996x, (CharSequence) str);
        }
    }

    /* renamed from: a */
    public final void mo6461a(int i, View view) {
        boolean z = true;
        switch (i) {
            case 1:
                C2032b bVar = this.f4997y;
                if (bVar == null) {
                    z = false;
                }
                if (z) {
                    bVar.mo6874j();
                    return;
                }
                return;
            case 2:
                C2032b bVar2 = this.f4997y;
                if (bVar2 == null) {
                    z = false;
                }
                if (z) {
                    bVar2.mo6880r();
                    return;
                }
                return;
            case 3:
                C2032b bVar3 = this.f4997y;
                if (bVar3 == null) {
                    z = false;
                }
                if (z) {
                    bVar3.mo6875k();
                    return;
                }
                return;
            case 4:
                C2032b bVar4 = this.f4997y;
                if (bVar4 == null) {
                    z = false;
                }
                if (z) {
                    bVar4.mo6879q();
                    return;
                }
                return;
            case 5:
                C2032b bVar5 = this.f4997y;
                if (bVar5 == null) {
                    z = false;
                }
                if (z) {
                    bVar5.mo6877m();
                    return;
                }
                return;
            case 6:
                C2032b bVar6 = this.f4997y;
                if (bVar6 == null) {
                    z = false;
                }
                if (z) {
                    bVar6.mo6878p();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo6460a(C2032b bVar) {
        this.f4997y = bVar;
        synchronized (this) {
            this.f5010K |= 1;
        }
        mo2173a(1);
        super.mo2142e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2137a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: d */
    public boolean mo2141d() {
        synchronized (this) {
            return this.f5010K != 0;
        }
    }

    /* renamed from: i */
    public void mo6459i() {
        synchronized (this) {
            this.f5010K = 2;
        }
        mo2142e();
    }
}
