package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.m */
public final class C2463m extends RecyclerView.C0524d0 {

    /* renamed from: y */
    private final View f6209y;

    /* renamed from: z */
    private final AppCompatTextView f6210z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2463m(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.line);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.line)");
        this.f6209y = findViewById;
        View findViewById2 = view.findViewById(C3148R.C3151id.txt_label);
        C3370k.m12223a((Object) findViewById2, "itemView.findViewById(R.id.txt_label)");
        this.f6210z = (AppCompatTextView) findViewById2;
    }

    /* renamed from: B */
    public final View mo3763B() {
        return this.f6209y;
    }

    /* renamed from: C */
    public final AppCompatTextView mo7308C() {
        return this.f6210z;
    }
}
