package com.p131fb.fluid.p148ui.p149g.p152c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.p148ui.views.PreferenceView;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3499j1;

/* renamed from: com.fb.fluid.ui.g.c.w */
public class C2485w extends RecyclerView.C0524d0 {

    /* renamed from: y */
    private final PreferenceView f6272y;

    /* renamed from: z */
    private C3499j1 f6273z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2485w(View view) {
        super(view);
        C3370k.m12227b(view, "itemView");
        PreferenceView preferenceView = (PreferenceView) view.findViewById(C1718g.layout_root);
        C3370k.m12223a((Object) preferenceView, "itemView.layout_root");
        this.f6272y = preferenceView;
    }

    /* renamed from: B */
    public final C3499j1 mo3763B() {
        return this.f6273z;
    }

    /* renamed from: C */
    public final PreferenceView mo7348C() {
        return this.f6272y;
    }

    /* renamed from: a */
    public final void mo7349a(C3499j1 j1Var) {
        this.f6273z = j1Var;
    }
}
