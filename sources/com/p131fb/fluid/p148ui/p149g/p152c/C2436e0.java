package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.e0 */
public final class C2436e0 extends RecyclerView.C0524d0 {

    /* renamed from: y */
    private final Toolbar f6176y;

    /* renamed from: z */
    private final AppCompatTextView f6177z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2436e0(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.toolbar);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.toolbar)");
        this.f6176y = (Toolbar) findViewById;
        View findViewById2 = view.findViewById(C3148R.C3151id.toolbar_title);
        C3370k.m12223a((Object) findViewById2, "itemView.findViewById(R.id.toolbar_title)");
        this.f6177z = (AppCompatTextView) findViewById2;
    }

    /* renamed from: B */
    public final AppCompatTextView mo3763B() {
        return this.f6177z;
    }

    /* renamed from: C */
    public final Toolbar mo7275C() {
        return this.f6176y;
    }
}
