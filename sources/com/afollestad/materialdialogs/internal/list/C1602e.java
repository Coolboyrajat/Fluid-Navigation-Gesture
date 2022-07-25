package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0342c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1048f;
import p054c.p055a.p056a.C1052j;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p064t.C1096a;
import p054c.p055a.p056a.p066v.C1099a;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: com.afollestad.materialdialogs.internal.list.e */
public final class C1602e extends RecyclerView.C0527g<C1603f> implements C1599b<String, C3352d<? super C1041c, ? super Integer, ? super String, ? extends Unit>> {

    /* renamed from: c */
    private int f4679c;

    /* renamed from: d */
    private int[] f4680d;

    /* renamed from: e */
    private C1041c f4681e;

    /* renamed from: f */
    private List<String> f4682f;

    /* renamed from: g */
    private final boolean f4683g;

    /* renamed from: h */
    private C3352d<? super C1041c, ? super Integer, ? super String, Unit> f4684h;

    public C1602e(C1041c cVar, List<String> list, int[] iArr, int i, boolean z, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(cVar, "dialog");
        C3370k.m12227b(list, "items");
        this.f4681e = cVar;
        this.f4682f = list;
        this.f4683g = z;
        this.f4684h = dVar;
        this.f4679c = i;
        this.f4680d = iArr == null ? new int[0] : iArr;
    }

    /* renamed from: e */
    private final void m6969e(int i) {
        int i2 = this.f4679c;
        if (i != i2) {
            this.f4679c = i;
            mo3107a(i2, (Object) C1604g.f4688a);
            mo3107a(i, (Object) C1598a.f4671a);
        }
    }

    /* renamed from: a */
    public void mo6128a() {
        C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar;
        int i = this.f4679c;
        if (i > -1 && (dVar = this.f4684h) != null) {
            Unit a = dVar.mo6842a(this.f4681e, Integer.valueOf(i), this.f4682f.get(this.f4679c));
        }
    }

    /* renamed from: a */
    public void mo3119b(C1603f fVar, int i) {
        C3370k.m12227b(fVar, "holder");
        boolean z = true;
        fVar.mo6140b(!C3280f.m12021b(this.f4680d, i));
        AppCompatRadioButton B = fVar.mo3763B();
        if (this.f4679c != i) {
            z = false;
        }
        B.setChecked(z);
        fVar.mo6139C().setText(this.f4682f.get(i));
        View view = fVar.f2168f;
        C3370k.m12223a((Object) view, "holder.itemView");
        view.setBackground(C1096a.m5489a(this.f4681e));
        if (this.f4681e.mo5108b() != null) {
            fVar.mo6139C().setTypeface(this.f4681e.mo5108b());
        }
    }

    /* renamed from: a */
    public void mo3109a(C1603f fVar, int i, List<Object> list) {
        AppCompatRadioButton B;
        boolean z;
        C3370k.m12227b(fVar, "holder");
        C3370k.m12227b(list, "payloads");
        Object f = C3292r.m12102f(list);
        if (C3370k.m12225a(f, (Object) C1598a.f4671a)) {
            B = fVar.mo3763B();
            z = true;
        } else if (C3370k.m12225a(f, (Object) C1604g.f4688a)) {
            B = fVar.mo3763B();
            z = false;
        } else {
            super.mo3109a(fVar, i, list);
            return;
        }
        B.setChecked(z);
    }

    /* renamed from: a */
    public void mo6136a(List<String> list, C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar) {
        C3370k.m12227b(list, "items");
        this.f4682f = list;
        if (dVar != null) {
            this.f4684h = dVar;
        }
        mo3128e();
    }

    /* renamed from: a */
    public void mo6137a(int[] iArr) {
        C3370k.m12227b(iArr, "indices");
        this.f4680d = iArr;
        mo3128e();
    }

    /* renamed from: b */
    public int mo3114b() {
        return this.f4682f.size();
    }

    /* renamed from: b */
    public C1603f m6978b(ViewGroup viewGroup, int i) {
        C3370k.m12227b(viewGroup, "parent");
        C1603f fVar = new C1603f(C1103e.f3789a.mo5166a(viewGroup, this.f4681e.mo5117i(), C1052j.md_listitem_singlechoice), this);
        C1103e.m5519a(C1103e.f3789a, fVar.mo6139C(), this.f4681e.mo5117i(), Integer.valueOf(C1048f.md_color_content), (Integer) null, 4, (Object) null);
        int[] a = C1099a.m5504a(this.f4681e, new int[]{C1048f.md_color_widget, C1048f.md_color_widget_unchecked}, (C3350b) null, 2, (Object) null);
        C0342c.m1719a((CompoundButton) fVar.mo3763B(), C1103e.f3789a.mo5164a(this.f4681e.mo5117i(), a[1], a[0]));
        return fVar;
    }

    /* renamed from: d */
    public final void mo6138d(int i) {
        m6969e(i);
        if (!this.f4683g || !C1057a.m5384a(this.f4681e)) {
            C3352d<? super C1041c, ? super Integer, ? super String, Unit> dVar = this.f4684h;
            if (dVar != null) {
                Unit a = dVar.mo6842a(this.f4681e, Integer.valueOf(i), this.f4682f.get(i));
            }
            if (this.f4681e.mo5107a() && !C1057a.m5384a(this.f4681e)) {
                this.f4681e.dismiss();
                return;
            }
            return;
        }
        C1057a.m5383a(this.f4681e, C1055m.POSITIVE, true);
    }
}
