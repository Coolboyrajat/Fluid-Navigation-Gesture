package com.p131fb.fluid.p148ui.p149g.p151b;

import android.graphics.Rect;
import android.view.View;
import com.p131fb.fluid.p148ui.p149g.p152c.C2492z;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p067b.C1108a;

/* renamed from: com.fb.fluid.ui.g.b.m */
final class C2259m extends C3371l implements C3350b<C1108a<? extends Rect, C2492z>, Unit> {

    /* renamed from: g */
    public static final C2259m f5941g = new C2259m();

    /* renamed from: com.fb.fluid.ui.g.b.m$a */
    static final /* synthetic */ class C2260a extends C3368i implements C3350b<View, C2492z> {

        /* renamed from: j */
        public static final C2260a f5942j = new C2260a();

        C2260a() {
            super(1);
        }

        /* renamed from: a */
        public final C2492z mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2492z(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2492z.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: com.fb.fluid.ui.g.b.m$b */
    static final class C2261b extends C3371l implements C3352d<C2492z, Integer, Rect, Unit> {

        /* renamed from: g */
        public static final C2261b f5943g = new C2261b();

        C2261b() {
            super(3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7116a((C2492z) obj, ((Number) obj2).intValue(), (Rect) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7116a(C2492z zVar, int i, Rect rect) {
            C3370k.m12227b(zVar, "$receiver");
            C3370k.m12227b(rect, "item");
            zVar.mo3763B().setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    C2259m() {
        super(1);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
        mo7114a((C1108a<Rect, C2492z>) (C1108a) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo7114a(C1108a<Rect, C2492z> aVar) {
        C3370k.m12227b(aVar, "$receiver");
        aVar.mo5186a(C2260a.f5942j, C2261b.f5943g);
    }
}
