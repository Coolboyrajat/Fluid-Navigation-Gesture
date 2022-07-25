package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.f0 */
public final class C2438f0 extends RecyclerView.C0524d0 {

    /* renamed from: A */
    private final AppCompatTextView f6181A;

    /* renamed from: y */
    private final View f6182y;

    /* renamed from: z */
    private final AppCompatImageView f6183z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2438f0(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.button_root);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.button_root)");
        this.f6182y = findViewById;
        View findViewById2 = view.findViewById(C3148R.C3151id.img_icon);
        C3370k.m12223a((Object) findViewById2, "itemView.findViewById(R.id.img_icon)");
        this.f6183z = (AppCompatImageView) findViewById2;
        View findViewById3 = view.findViewById(C3148R.C3151id.txt_label);
        C3370k.m12223a((Object) findViewById3, "itemView.findViewById(R.id.txt_label)");
        this.f6181A = (AppCompatTextView) findViewById3;
    }

    /* renamed from: B */
    public final View mo3763B() {
        return this.f6182y;
    }

    /* renamed from: C */
    public final AppCompatImageView mo7280C() {
        return this.f6183z;
    }

    /* renamed from: D */
    public final AppCompatTextView mo7281D() {
        return this.f6181A;
    }
}
