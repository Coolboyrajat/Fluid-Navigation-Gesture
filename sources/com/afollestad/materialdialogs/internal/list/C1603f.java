package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1051i;

/* renamed from: com.afollestad.materialdialogs.internal.list.f */
public final class C1603f extends RecyclerView.C0524d0 implements View.OnClickListener {

    /* renamed from: A */
    private final C1602e f4685A;

    /* renamed from: y */
    private final AppCompatRadioButton f4686y;

    /* renamed from: z */
    private final TextView f4687z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1603f(View view, C1602e eVar) {
        super(view);
        C3370k.m12227b(view, "itemView");
        C3370k.m12227b(eVar, "adapter");
        this.f4685A = eVar;
        view.setOnClickListener(this);
        View findViewById = view.findViewById(C1051i.md_control);
        C3370k.m12223a((Object) findViewById, "itemView.findViewById(R.id.md_control)");
        this.f4686y = (AppCompatRadioButton) findViewById;
        View findViewById2 = view.findViewById(C1051i.md_title);
        C3370k.m12223a((Object) findViewById2, "itemView.findViewById(R.id.md_title)");
        this.f4687z = (TextView) findViewById2;
    }

    /* renamed from: B */
    public final AppCompatRadioButton mo3763B() {
        return this.f4686y;
    }

    /* renamed from: C */
    public final TextView mo6139C() {
        return this.f4687z;
    }

    /* renamed from: b */
    public final void mo6140b(boolean z) {
        View view = this.f2168f;
        C3370k.m12223a((Object) view, "itemView");
        view.setEnabled(z);
        this.f4686y.setEnabled(z);
        this.f4687z.setEnabled(z);
    }

    public void onClick(View view) {
        C3370k.m12227b(view, "view");
        this.f4685A.mo6138d(mo3061f());
    }
}
