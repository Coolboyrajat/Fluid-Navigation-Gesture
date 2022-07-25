package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.r */
public final class C2470r extends RecyclerView.C0524d0 {

    /* renamed from: y */
    private final AppCompatImageView f6214y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2470r(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.img);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.img)");
        this.f6214y = (AppCompatImageView) findViewById;
    }

    /* renamed from: B */
    public final AppCompatImageView mo3763B() {
        return this.f6214y;
    }
}
