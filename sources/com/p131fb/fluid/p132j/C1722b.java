package com.p131fb.fluid.p132j;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.C0374e;
import androidx.databinding.ViewDataBinding;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.j.b */
public class C1722b extends C1721a {

    /* renamed from: x */
    private static final ViewDataBinding.C0362j f4990x = null;

    /* renamed from: y */
    private static final SparseIntArray f4991y = new SparseIntArray();

    /* renamed from: v */
    private final LinearLayout f4992v;

    /* renamed from: w */
    private long f4993w;

    static {
        f4991y.put(C3148R.C3151id.toolbar_title, 1);
    }

    public C1722b(C0374e eVar, View view) {
        this(eVar, view, ViewDataBinding.m1765a(eVar, view, 2, f4990x, f4991y));
    }

    private C1722b(C0374e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1]);
        this.f4993w = -1;
        this.f4992v = objArr[0];
        this.f4992v.setTag((Object) null);
        mo2134a(view);
        mo6459i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2132a() {
        synchronized (this) {
            this.f4993w = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2137a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: d */
    public boolean mo2141d() {
        synchronized (this) {
            return this.f4993w != 0;
        }
    }

    /* renamed from: i */
    public void mo6459i() {
        synchronized (this) {
            this.f4993w = 1;
        }
        mo2142e();
    }
}
