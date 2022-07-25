package com.p131fb.fluid.p132j;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.C0374e;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.p003m.C0386a;
import androidx.lifecycle.C0497t;
import androidx.lifecycle.LiveData;
import com.google.android.material.button.MaterialButton;
import com.p131fb.fluid.p133k.p134a.C1727a;
import com.p131fb.fluid.p148ui.billing.C2046b;
import com.p131fb.fluid.p148ui.billing.C2047c;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.j.f */
public class C1726f extends C1725e implements C1727a.C1728a {

    /* renamed from: G */
    private static final ViewDataBinding.C0362j f5014G = null;

    /* renamed from: H */
    private static final SparseIntArray f5015H = new SparseIntArray();

    /* renamed from: A */
    private final MaterialButton f5016A;

    /* renamed from: B */
    private final MaterialButton f5017B;

    /* renamed from: C */
    private final View.OnClickListener f5018C;

    /* renamed from: D */
    private final View.OnClickListener f5019D;

    /* renamed from: E */
    private final View.OnClickListener f5020E;

    /* renamed from: F */
    private long f5021F;

    /* renamed from: x */
    private final NestedScrollView f5022x;

    /* renamed from: y */
    private final MaterialButton f5023y;

    /* renamed from: z */
    private final View f5024z;

    static {
        f5015H.put(C3148R.C3151id.toolbar_title, 5);
        f5015H.put(C3148R.C3151id.txt_title, 6);
    }

    public C1726f(C0374e eVar, View view) {
        this(eVar, view, ViewDataBinding.m1765a(eVar, view, 7, f5014G, f5015H));
    }

    private C1726f(C0374e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, objArr[5], objArr[6]);
        this.f5021F = -1;
        this.f5022x = objArr[0];
        this.f5022x.setTag((Object) null);
        this.f5023y = objArr[1];
        this.f5023y.setTag((Object) null);
        this.f5024z = objArr[2];
        this.f5024z.setTag((Object) null);
        this.f5016A = objArr[3];
        this.f5016A.setTag((Object) null);
        this.f5017B = objArr[4];
        this.f5017B.setTag((Object) null);
        mo2134a(view);
        this.f5018C = new C1727a(this, 3);
        this.f5019D = new C1727a(this, 1);
        this.f5020E = new C1727a(this, 2);
        mo6459i();
    }

    /* renamed from: a */
    private boolean m7330a(C0497t<Integer> tVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f5021F |= 2;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m7331b(C0497t<String> tVar, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f5021F |= 1;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2132a() {
        long j;
        int i;
        synchronized (this) {
            j = this.f5021F;
            this.f5021F = 0;
        }
        C2046b bVar = this.f5012v;
        C2047c cVar = this.f5013w;
        String str = null;
        int i2 = ((22 & j) > 0 ? 1 : ((22 & j) == 0 ? 0 : -1));
        if (i2 != 0) {
            C0497t<Integer> o = bVar != null ? bVar.mo6901o() : null;
            mo2136a(1, (LiveData<?>) o);
            i = ViewDataBinding.m1757a(o != null ? o.getValue() : null);
        } else {
            i = 0;
        }
        int i3 = ((25 & j) > 0 ? 1 : ((25 & j) == 0 ? 0 : -1));
        if (i3 != 0) {
            C0497t<String> g = cVar != null ? cVar.mo6911g() : null;
            mo2136a(0, (LiveData<?>) g);
            if (g != null) {
                str = g.getValue();
            }
        }
        if (i3 != 0) {
            C0386a.m1867a((TextView) this.f5023y, (CharSequence) str);
        }
        if ((j & 16) != 0) {
            this.f5023y.setOnClickListener(this.f5019D);
            this.f5016A.setOnClickListener(this.f5020E);
            this.f5017B.setOnClickListener(this.f5018C);
        }
        if (i2 != 0) {
            this.f5024z.setVisibility(i);
            this.f5016A.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo6461a(int i, View view) {
        boolean z = false;
        if (i == 1) {
            C2046b bVar = this.f5012v;
            if (bVar != null) {
                z = true;
            }
            if (z) {
                bVar.mo6900n();
            }
        } else if (i == 2) {
            C2046b bVar2 = this.f5012v;
            if (bVar2 != null) {
                z = true;
            }
            if (z) {
                bVar2.mo6902s();
            }
        } else if (i == 3) {
            C2046b bVar3 = this.f5012v;
            if (bVar3 != null) {
                z = true;
            }
            if (z) {
                bVar3.mo6899i();
            }
        }
    }

    /* renamed from: a */
    public void mo6462a(C2046b bVar) {
        this.f5012v = bVar;
        synchronized (this) {
            this.f5021F |= 4;
        }
        mo2173a(1);
        super.mo2142e();
    }

    /* renamed from: a */
    public void mo6463a(C2047c cVar) {
        this.f5013w = cVar;
        synchronized (this) {
            this.f5021F |= 8;
        }
        mo2173a(2);
        super.mo2142e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2137a(int i, Object obj, int i2) {
        if (i == 0) {
            return m7331b((C0497t) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return m7330a((C0497t<Integer>) (C0497t) obj, i2);
    }

    /* renamed from: d */
    public boolean mo2141d() {
        synchronized (this) {
            return this.f5021F != 0;
        }
    }

    /* renamed from: i */
    public void mo6459i() {
        synchronized (this) {
            this.f5021F = 16;
        }
        mo2142e();
    }
}
