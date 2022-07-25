package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p068f.C1118b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.j0 */
public final class C2457j0 extends RecyclerView.C0524d0 {

    /* renamed from: y */
    private final C1116a<Object> f6205y = C1118b.m5571a(new Object[0]);

    /* renamed from: z */
    private final RecyclerView f6206z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2457j0(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.recycler_view);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.recycler_view)");
        this.f6206z = (RecyclerView) findViewById;
    }

    /* renamed from: B */
    public final C1116a<Object> mo3763B() {
        return this.f6205y;
    }

    /* renamed from: C */
    public final RecyclerView mo7303C() {
        return this.f6206z;
    }
}
