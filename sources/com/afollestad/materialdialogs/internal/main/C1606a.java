package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1048f;
import p054c.p055a.p056a.C1050h;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: com.afollestad.materialdialogs.internal.main.a */
public abstract class C1606a extends ViewGroup {

    /* renamed from: f */
    private final Paint f4710f;

    /* renamed from: g */
    private final int f4711g;

    /* renamed from: h */
    public C1041c f4712h;

    /* renamed from: i */
    private boolean f4713i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1606a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4710f = new Paint();
        this.f4711g = C1103e.f3789a.mo5163a(this, C1050h.md_divider_height);
        setWillNotDraw(false);
        this.f4710f.setStyle(Paint.Style.STROKE);
        this.f4710f.setStrokeWidth(context.getResources().getDimension(C1050h.md_divider_height));
        this.f4710f.setAntiAlias(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1606a(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final int getDividerColor() {
        C1103e eVar = C1103e.f3789a;
        C1041c cVar = this.f4712h;
        if (cVar != null) {
            Context context = cVar.getContext();
            C3370k.m12223a((Object) context, "dialog.context");
            return C1103e.m5515a(eVar, context, (Integer) null, Integer.valueOf(C1048f.md_divider_color), (C3349a) null, 10, (Object) null);
        }
        C3370k.m12230d("dialog");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Paint mo6181a() {
        this.f4710f.setColor(getDividerColor());
        return this.f4710f;
    }

    public final C1041c getDialog() {
        C1041c cVar = this.f4712h;
        if (cVar != null) {
            return cVar;
        }
        C3370k.m12230d("dialog");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final int getDividerHeight() {
        return this.f4711g;
    }

    public final boolean getDrawDivider() {
        return this.f4713i;
    }

    public final void setDialog(C1041c cVar) {
        C3370k.m12227b(cVar, "<set-?>");
        this.f4712h = cVar;
    }

    public final void setDrawDivider(boolean z) {
        this.f4713i = z;
        invalidate();
    }
}
