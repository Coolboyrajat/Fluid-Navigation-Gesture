package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1048f;
import p054c.p055a.p056a.C1052j;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p064t.C1096a;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: com.afollestad.materialdialogs.internal.list.c */
public final class C1600c extends RecyclerView.C0527g<C1601d> implements C1599b<String, C3352d<? super C1041c, ? super Integer, ? super String, ? extends Unit>> {

    /* renamed from: c */
    private int[] f4672c;

    /* renamed from: d */
    private C1041c f4673d;

    /* renamed from: e */
    private List<String> f4674e;

    /* renamed from: f */
    private boolean f4675f;

    /* renamed from: g */
    private C3352d<? super C1041c, ? super Integer, ? super String, Unit> f4676g;

    public C1600c(C1041c cVar, List<String> list, int[] iArr, boolean z, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(cVar, "dialog");
        C3370k.m12227b(list, "items");
        this.f4673d = cVar;
        this.f4674e = list;
        this.f4675f = z;
        this.f4676g = dVar;
        this.f4672c = iArr == null ? new int[0] : iArr;
    }

    /* renamed from: a */
    public void mo6128a() {
        Object obj = this.f4673d.mo5111d().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar = this.f4676g;
            if (dVar != null) {
                Unit a = dVar.mo6842a(this.f4673d, num, this.f4674e.get(num.intValue()));
            }
            this.f4673d.mo5111d().remove("activated_index");
        }
    }

    /* renamed from: a */
    public void mo3119b(C1601d dVar, int i) {
        C3370k.m12227b(dVar, "holder");
        View view = dVar.f2168f;
        C3370k.m12223a((Object) view, "holder.itemView");
        boolean z = true;
        view.setEnabled(!C3280f.m12021b(this.f4672c, i));
        dVar.mo3763B().setText(this.f4674e.get(i));
        View view2 = dVar.f2168f;
        C3370k.m12223a((Object) view2, "holder.itemView");
        view2.setBackground(C1096a.m5489a(this.f4673d));
        Object obj = this.f4673d.mo5111d().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        View view3 = dVar.f2168f;
        C3370k.m12223a((Object) view3, "holder.itemView");
        if (num == null || num.intValue() != i) {
            z = false;
        }
        view3.setActivated(z);
        if (this.f4673d.mo5108b() != null) {
            dVar.mo3763B().setTypeface(this.f4673d.mo5108b());
        }
    }

    /* renamed from: a */
    public void mo6130a(List<String> list, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(list, "items");
        this.f4674e = list;
        if (dVar != null) {
            this.f4676g = dVar;
        }
        mo3128e();
    }

    /* renamed from: a */
    public void mo6131a(int[] iArr) {
        C3370k.m12227b(iArr, "indices");
        this.f4672c = iArr;
        mo3128e();
    }

    /* renamed from: b */
    public int mo3114b() {
        return this.f4674e.size();
    }

    /* renamed from: b */
    public C1601d m6965b(ViewGroup viewGroup, int i) {
        C3370k.m12227b(viewGroup, "parent");
        C1601d dVar = new C1601d(C1103e.f3789a.mo5166a(viewGroup, this.f4673d.mo5117i(), C1052j.md_listitem), this);
        C1103e.m5519a(C1103e.f3789a, dVar.mo3763B(), this.f4673d.mo5117i(), Integer.valueOf(C1048f.md_color_content), (Integer) null, 4, (Object) null);
        return dVar;
    }

    /* renamed from: d */
    public final void mo6132d(int i) {
        if (!this.f4675f || !C1057a.m5385b(this.f4673d, C1055m.POSITIVE)) {
            C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar = this.f4676g;
            if (dVar != null) {
                Unit a = dVar.mo6842a(this.f4673d, Integer.valueOf(i), this.f4674e.get(i));
            }
            if (this.f4673d.mo5107a() && !C1057a.m5384a(this.f4673d)) {
                this.f4673d.dismiss();
                return;
            }
            return;
        }
        Object obj = this.f4673d.mo5111d().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        this.f4673d.mo5111d().put("activated_index", Integer.valueOf(i));
        if (num != null) {
            mo3122c(num.intValue());
        }
        mo3122c(i);
    }
}
