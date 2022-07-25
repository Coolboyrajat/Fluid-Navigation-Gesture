package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.e */
public final class C2435e extends RecyclerView.C0524d0 {

    /* renamed from: A */
    private final AppCompatImageView f6171A;

    /* renamed from: B */
    private final LinearLayout f6172B;

    /* renamed from: C */
    private final AppCompatTextView f6173C;

    /* renamed from: y */
    private final View f6174y;

    /* renamed from: z */
    private final View f6175z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2435e(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        View findViewById = view.findViewById(C3148R.C3151id.but_icon);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.but_icon)");
        this.f6174y = findViewById;
        View findViewById2 = view.findViewById(C3148R.C3151id.img_add);
        C3370k.m12223a((Object) findViewById2, "itemView.findViewById(R.id.img_add)");
        this.f6175z = findViewById2;
        View findViewById3 = view.findViewById(C3148R.C3151id.img_icon);
        C3370k.m12223a((Object) findViewById3, "itemView.findViewById(R.id.img_icon)");
        this.f6171A = (AppCompatImageView) findViewById3;
        View findViewById4 = view.findViewById(C3148R.C3151id.layout_app);
        C3370k.m12223a((Object) findViewById4, "itemView.findViewById(R.id.layout_app)");
        this.f6172B = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(C3148R.C3151id.txt_label);
        C3370k.m12223a((Object) findViewById5, "itemView.findViewById(R.id.txt_label)");
        this.f6173C = (AppCompatTextView) findViewById5;
    }

    /* renamed from: B */
    public final View mo3763B() {
        return this.f6175z;
    }

    /* renamed from: C */
    public final AppCompatImageView mo7271C() {
        return this.f6171A;
    }

    /* renamed from: D */
    public final LinearLayout mo7272D() {
        return this.f6172B;
    }

    /* renamed from: E */
    public final View mo7273E() {
        return this.f6174y;
    }

    /* renamed from: F */
    public final AppCompatTextView mo7274F() {
        return this.f6173C;
    }
}
