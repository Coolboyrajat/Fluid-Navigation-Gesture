package p054c.p055a.p056a.p060q;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.color.view.ColorCircleView;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p060q.p061m.C1082b;
import p054c.p055a.p056a.p064t.C1096a;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: c.a.a.q.a */
public final class C1062a extends RecyclerView.C0527g<C1063b> {

    /* renamed from: c */
    private final int f3719c;

    /* renamed from: d */
    private final int f3720d;

    /* renamed from: e */
    private int f3721e;

    /* renamed from: f */
    private int f3722f;

    /* renamed from: g */
    private boolean f3723g;

    /* renamed from: h */
    private final C1041c f3724h;

    /* renamed from: i */
    private final int[] f3725i;

    /* renamed from: j */
    private final int[][] f3726j;

    /* renamed from: k */
    private final Integer f3727k;

    /* renamed from: l */
    private final boolean f3728l;

    /* renamed from: m */
    private final C3351c<C1041c, Integer, Unit> f3729m;

    /* renamed from: n */
    private final boolean f3730n;

    public C1062a(C1041c cVar, int[] iArr, int[][] iArr2, Integer num, boolean z, C3351c<? super C1041c, ? super Integer, Unit> cVar2, boolean z2) {
        C3370k.m12227b(cVar, "dialog");
        C3370k.m12227b(iArr, "colors");
        this.f3724h = cVar;
        this.f3725i = iArr;
        this.f3726j = iArr2;
        this.f3727k = num;
        this.f3728l = z;
        this.f3729m = cVar2;
        this.f3730n = z2;
        C1103e eVar = C1103e.f3789a;
        this.f3719c = C1103e.m5520a(eVar, C1103e.m5515a(eVar, this.f3724h.mo5117i(), (Integer) null, (Integer) 16842806, (C3349a) null, 10, (Object) null), 0.0d, 1, (Object) null) ? C1077i.icon_back_black : C1077i.icon_back_white;
        C1103e eVar2 = C1103e.f3789a;
        this.f3720d = C1103e.m5520a(eVar2, C1103e.m5515a(eVar2, this.f3724h.mo5117i(), (Integer) null, (Integer) 16842806, (C3349a) null, 10, (Object) null), 0.0d, 1, (Object) null) ? C1077i.icon_custom_black : C1077i.icon_custom_white;
        this.f3721e = -1;
        this.f3722f = -1;
        Integer num2 = this.f3727k;
        if (num2 != null) {
            mo5129e(num2.intValue());
        }
    }

    /* renamed from: g */
    private final void m5391g() {
        C3351c<C1041c, Integer, Unit> cVar;
        Integer f = mo5130f();
        boolean z = false;
        int intValue = f != null ? f.intValue() : 0;
        if (this.f3728l && C1057a.m5384a(this.f3724h)) {
            z = true;
        }
        if (!z && (cVar = this.f3729m) != null) {
            Unit a = cVar.mo6125a(this.f3724h, Integer.valueOf(intValue));
        }
        C1068g.m5440c(this.f3724h, intValue);
        C1068g.m5431a(this.f3724h, intValue);
    }

    /* renamed from: a */
    public void mo3119b(C1063b bVar, int i) {
        int i2;
        ImageView C;
        int i3;
        C3370k.m12227b(bVar, "holder");
        if (!this.f3723g || i != 0) {
            boolean z = true;
            if (!this.f3730n || this.f3723g || i != mo3114b() - 1) {
                if (this.f3723g) {
                    int[][] iArr = this.f3726j;
                    if (iArr != null) {
                        i2 = iArr[this.f3721e][i - 1];
                    } else {
                        C3370k.m12221a();
                        throw null;
                    }
                } else {
                    i2 = this.f3725i[i];
                }
                int i4 = i2;
                ColorCircleView B = bVar.mo3763B();
                if (B != null) {
                    B.setColor(i4);
                }
                ColorCircleView B2 = bVar.mo3763B();
                if (B2 != null) {
                    C1103e eVar = C1103e.f3789a;
                    View view = bVar.f2168f;
                    C3370k.m12223a((Object) view, "holder.itemView");
                    Context context = view.getContext();
                    C3370k.m12223a((Object) context, "holder.itemView.context");
                    B2.setBorder(C1103e.m5515a(eVar, context, (Integer) null, (Integer) 16842806, (C3349a) null, 10, (Object) null));
                }
                bVar.mo5131C().setImageResource(C1103e.m5520a(C1103e.f3789a, i4, 0.0d, 1, (Object) null) ? C1077i.icon_checkmark_white : C1077i.icon_checkmark_black);
                ImageView C2 = bVar.mo5131C();
                if (!this.f3723g ? i != this.f3721e : i != this.f3722f) {
                    z = false;
                }
                C1082b.m5461a(C2, z);
                return;
            }
            C = bVar.mo5131C();
            i3 = this.f3720d;
        } else {
            C = bVar.mo5131C();
            i3 = this.f3719c;
        }
        C.setImageResource(i3);
    }

    /* renamed from: b */
    public int mo3114b() {
        if (!this.f3723g) {
            return this.f3725i.length + (this.f3730n ? 1 : 0);
        }
        int[][] iArr = this.f3726j;
        if (iArr != null) {
            return iArr[this.f3721e].length + 1;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: b */
    public int mo3115b(int i) {
        if (!this.f3723g || i != 0) {
            return (!this.f3730n || this.f3723g || i != mo3114b() - 1) ? 0 : 1;
        }
        return 1;
    }

    /* renamed from: b */
    public C1063b m5396b(ViewGroup viewGroup, int i) {
        C3370k.m12227b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i == 1 ? C1080l.md_color_grid_item_go_up : C1080l.md_color_grid_item, viewGroup, false);
        C3370k.m12223a((Object) inflate, "view");
        inflate.setBackground(C1096a.m5489a(this.f3724h));
        return new C1063b(inflate, this);
    }

    /* renamed from: d */
    public final void mo5128d(int i) {
        if (this.f3723g && i == 0) {
            this.f3723g = false;
            mo3128e();
        } else if (!this.f3730n || this.f3723g || i != mo3114b() - 1) {
            C1057a.m5383a(this.f3724h, C1055m.POSITIVE, true);
            if (this.f3723g) {
                int i2 = this.f3722f;
                this.f3722f = i;
                mo3122c(i2);
                mo3122c(this.f3722f);
                m5391g();
                return;
            }
            if (i != this.f3721e) {
                this.f3722f = -1;
            }
            this.f3721e = i;
            int[][] iArr = this.f3726j;
            if (iArr != null) {
                this.f3723g = true;
                int[] iArr2 = iArr[this.f3721e];
                int length = iArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (iArr2[i3] == this.f3725i[this.f3721e]) {
                        break;
                    }
                    i3++;
                }
                this.f3722f = i3;
                int i4 = this.f3722f;
                if (i4 > -1) {
                    this.f3722f = i4 + 1;
                }
            }
            m5391g();
            mo3128e();
        } else {
            C1068g.m5437b(this.f3724h, 1);
        }
    }

    /* renamed from: e */
    public final void mo5129e(int i) {
        int[] iArr = this.f3725i;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (iArr[i2] == i) {
                break;
            }
            i2++;
        }
        this.f3721e = i2;
        int[][] iArr2 = this.f3726j;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                int[] iArr3 = this.f3726j[i3];
                int length3 = iArr3.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length3) {
                        i4 = -1;
                        break;
                    }
                    if (iArr3[i4] == i) {
                        break;
                    }
                    i4++;
                }
                this.f3722f = i4;
                this.f3723g = this.f3722f != -1;
                if (this.f3723g) {
                    this.f3722f++;
                    this.f3721e = i3;
                    break;
                }
                i3++;
            }
        }
        mo3128e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = r3.f3726j;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo5130f() {
        /*
            r3 = this;
            int r0 = r3.f3721e
            r1 = -1
            if (r0 <= r1) goto L_0x001f
            int r2 = r3.f3722f
            if (r2 <= r1) goto L_0x0018
            int[][] r1 = r3.f3726j
            if (r1 == 0) goto L_0x0018
            r0 = r1[r0]
            int r2 = r2 + -1
            r0 = r0[r2]
        L_0x0013:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0018:
            int[] r0 = r3.f3725i
            int r1 = r3.f3721e
            r0 = r0[r1]
            goto L_0x0013
        L_0x001f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p056a.p060q.C1062a.mo5130f():java.lang.Integer");
    }
}
