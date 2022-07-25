package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C2609h;
import java.util.Calendar;
import java.util.Locale;
import p054c.p083e.p084a.p085a.C1175h;
import p054c.p083e.p084a.p085a.C1176i;

/* renamed from: com.google.android.material.datepicker.o */
class C2630o extends RecyclerView.C0527g<C2632b> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2609h<?> f6891c;

    /* renamed from: com.google.android.material.datepicker.o$a */
    class C2631a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f6892f;

        C2631a(int i) {
            this.f6892f = i;
        }

        public void onClick(View view) {
            C2630o.this.f6891c.mo8252a(C2622j.m10299a(this.f6892f, C2630o.this.f6891c.mo8247E0().f6873h));
            C2630o.this.f6891c.mo8251a(C2609h.C2619j.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.o$b */
    public static class C2632b extends RecyclerView.C0524d0 {

        /* renamed from: y */
        final TextView f6894y;

        C2632b(TextView textView) {
            super(textView);
            this.f6894y = textView;
        }
    }

    C2630o(C2609h<?> hVar) {
        this.f6891c = hVar;
    }

    /* renamed from: f */
    private View.OnClickListener m10328f(int i) {
        return new C2631a(i);
    }

    /* renamed from: a */
    public void mo3119b(C2632b bVar, int i) {
        int e = mo8291e(i);
        String string = bVar.f6894y.getContext().getString(C1176i.mtrl_picker_navigate_to_year_description);
        bVar.f6894y.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(e)}));
        bVar.f6894y.setContentDescription(String.format(string, new Object[]{Integer.valueOf(e)}));
        C2604c D0 = this.f6891c.mo6873D0();
        Calendar instance = Calendar.getInstance();
        C2603b bVar2 = instance.get(1) == e ? D0.f6832f : D0.f6830d;
        for (Long longValue : this.f6891c.mo8248F0().mo8242p()) {
            instance.setTimeInMillis(longValue.longValue());
            if (instance.get(1) == e) {
                bVar2 = D0.f6831e;
            }
        }
        bVar2.mo8237a(bVar.f6894y);
        bVar.f6894y.setOnClickListener(m10328f(e));
    }

    /* renamed from: b */
    public int mo3114b() {
        return this.f6891c.mo2351C0().mo8231v();
    }

    /* renamed from: b */
    public C2632b m10332b(ViewGroup viewGroup, int i) {
        return new C2632b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1175h.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8290d(int i) {
        return i - this.f6891c.mo2351C0().mo8230u().f6874i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8291e(int i) {
        return this.f6891c.mo2351C0().mo8230u().f6874i + i;
    }
}
