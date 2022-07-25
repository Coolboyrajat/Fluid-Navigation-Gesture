package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.afollestad.materialdialogs.internal.list.d */
public final class C1601d extends RecyclerView.C0524d0 implements View.OnClickListener {

    /* renamed from: y */
    private final TextView f4677y;

    /* renamed from: z */
    private final C1600c f4678z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1601d(View view, C1600c cVar) {
        super(view);
        C3370k.m12227b(view, "itemView");
        C3370k.m12227b(cVar, "adapter");
        this.f4678z = cVar;
        view.setOnClickListener(this);
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt != null) {
            this.f4677y = (TextView) childAt;
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: B */
    public final TextView mo3763B() {
        return this.f4677y;
    }

    public void onClick(View view) {
        C3370k.m12227b(view, "view");
        this.f4678z.mo6132d(mo3061f());
    }
}
