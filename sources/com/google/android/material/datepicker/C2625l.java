package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C2609h;
import p006b.p026g.p035k.C0890v;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.C1175h;

/* renamed from: com.google.android.material.datepicker.l */
class C2625l extends RecyclerView.C0527g<C2627b> {

    /* renamed from: c */
    private final C2600a f6882c;

    /* renamed from: d */
    private final C2606e<?> f6883d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2609h.C2620k f6884e;

    /* renamed from: f */
    private final int f6885f;

    /* renamed from: com.google.android.material.datepicker.l$a */
    class C2626a implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f6886f;

        C2626a(MaterialCalendarGridView materialCalendarGridView) {
            this.f6886f = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f6886f.getAdapter().mo8277e(i)) {
                C2625l.this.f6884e.mo8253a(this.f6886f.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$b */
    public static class C2627b extends RecyclerView.C0524d0 {

        /* renamed from: y */
        final TextView f6888y;

        /* renamed from: z */
        final MaterialCalendarGridView f6889z;

        C2627b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            this.f6888y = (TextView) linearLayout.findViewById(C1173f.month_title);
            C0890v.m4760a((View) this.f6888y, true);
            this.f6889z = (MaterialCalendarGridView) linearLayout.findViewById(C1173f.month_grid);
            if (!z) {
                this.f6888y.setVisibility(8);
            }
        }
    }

    C2625l(Context context, C2606e<?> eVar, C2600a aVar, C2609h.C2620k kVar) {
        C2622j u = aVar.mo8230u();
        C2622j r = aVar.mo8227r();
        C2622j t = aVar.mo8229t();
        if (u.compareTo(t) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (t.compareTo(r) <= 0) {
            this.f6885f = (C2624k.f6877j * C2609h.m10273b(context)) + (C2621i.m10298b(context) ? C2609h.m10273b(context) : 0);
            this.f6882c = aVar;
            this.f6883d = eVar;
            this.f6884e = kVar;
            mo3112a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8283a(C2622j jVar) {
        return this.f6882c.mo8230u().mo8259b(jVar);
    }

    /* renamed from: a */
    public long mo3103a(int i) {
        return this.f6882c.mo8230u().mo8260b(i).mo8267s();
    }

    /* renamed from: a */
    public void mo3119b(C2627b bVar, int i) {
        C2622j b = this.f6882c.mo8230u().mo8260b(i);
        bVar.f6888y.setText(b.mo8266r());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f6889z.findViewById(C1173f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().f6878f)) {
            C2624k kVar = new C2624k(b, this.f6883d, this.f6882c);
            materialCalendarGridView.setNumColumns(b.f6875j);
            materialCalendarGridView.setAdapter((ListAdapter) kVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C2626a(materialCalendarGridView));
    }

    /* renamed from: b */
    public int mo3114b() {
        return this.f6882c.mo8228s();
    }

    /* renamed from: b */
    public C2627b m10322b(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1175h.mtrl_calendar_month_labeled, viewGroup, false);
        linearLayout.setLayoutParams(new RecyclerView.C0543p(-1, this.f6885f));
        return new C2627b(linearLayout, C2621i.m10298b(viewGroup.getContext()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C2622j mo8285d(int i) {
        return this.f6882c.mo8230u().mo8260b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public CharSequence mo8286e(int i) {
        return mo8285d(i).mo8266r();
    }
}
