package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.z */
public final class C2492z extends RecyclerView.C0524d0 {

    /* renamed from: y */
    private final LinearLayout f6286y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2492z(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.layout_root);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.layout_root)");
        this.f6286y = (LinearLayout) findViewById;
    }

    /* renamed from: B */
    public final LinearLayout mo3763B() {
        return this.f6286y;
    }
}
