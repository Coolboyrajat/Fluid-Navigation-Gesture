package com.p131fb.fluid.p135l.p137n;

import android.content.Intent;
import androidx.appcompat.app.C0033d;
import kotlin.C3261j;
import kotlin.C3268o;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.n.a */
public abstract class C1761a extends C0033d {

    /* renamed from: x */
    private C3261j<Integer, ? extends C3351c<? super Integer, ? super Intent, ? extends Object>> f5082x;

    /* renamed from: a */
    public final void mo6530a(Intent intent, int i, C3351c<? super Integer, ? super Intent, ? extends Object> cVar) {
        C3370k.m12227b(intent, "intent");
        C3370k.m12227b(cVar, "callback");
        this.f5082x = C3268o.m11989a(Integer.valueOf(i), cVar);
        startActivityForResult(intent, i);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C3351c cVar;
        super.onActivityResult(i, i2, intent);
        C3261j<Integer, ? extends C3351c<? super Integer, ? super Intent, ? extends Object>> jVar = this.f5082x;
        if (jVar != null && jVar.mo9936c().intValue() == i) {
            C3261j<Integer, ? extends C3351c<? super Integer, ? super Intent, ? extends Object>> jVar2 = this.f5082x;
            if (!(jVar2 == null || (cVar = (C3351c) jVar2.mo9937d()) == null)) {
                cVar.mo6125a(Integer.valueOf(i2), intent);
            }
            this.f5082x = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f5082x = null;
    }
}
