package com.afollestad.materialdialogs.color.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3382w;
import p054c.p055a.p056a.p066v.C1103e;

public final class WrapContentViewPager extends ViewPager {

    /* renamed from: com.afollestad.materialdialogs.color.view.WrapContentViewPager$a */
    static final class C1588a extends C3371l implements C3350b<View, Unit> {

        /* renamed from: g */
        final /* synthetic */ int f4651g;

        /* renamed from: h */
        final /* synthetic */ C3382w f4652h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1588a(int i, C3382w wVar) {
            super(1);
            this.f4651g = i;
            this.f4652h = wVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6106a((View) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6106a(View view) {
            C3370k.m12227b(view, "child");
            view.measure(this.f4651g, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            C3382w wVar = this.f4652h;
            if (measuredHeight > wVar.f8048f) {
                wVar.f8048f = measuredHeight;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WrapContentViewPager(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    private final void m6936a(C3350b<? super View, Unit> bVar) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C3370k.m12223a((Object) childAt, "child");
            bVar.mo5146a(childAt);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C3382w wVar = new C3382w();
        wVar.f8048f = 0;
        m6936a(new C1588a(i, wVar));
        int size = View.MeasureSpec.getSize(i2);
        if (wVar.f8048f > size) {
            wVar.f8048f = size;
        }
        C1103e eVar = C1103e.f3789a;
        int i3 = wVar.f8048f;
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
