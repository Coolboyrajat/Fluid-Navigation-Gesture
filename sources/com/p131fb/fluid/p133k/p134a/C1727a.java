package com.p131fb.fluid.p133k.p134a;

import android.view.View;

/* renamed from: com.fb.fluid.k.a.a */
public final class C1727a implements View.OnClickListener {

    /* renamed from: f */
    final C1728a f5025f;

    /* renamed from: g */
    final int f5026g;

    /* renamed from: com.fb.fluid.k.a.a$a */
    public interface C1728a {
        /* renamed from: a */
        void mo6461a(int i, View view);
    }

    public C1727a(C1728a aVar, int i) {
        this.f5025f = aVar;
        this.f5026g = i;
    }

    public void onClick(View view) {
        this.f5025f.mo6461a(this.f5026g, view);
    }
}
