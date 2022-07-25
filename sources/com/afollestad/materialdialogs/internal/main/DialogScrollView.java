package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p055a.p056a.p066v.C1103e;

public final class DialogScrollView extends ScrollView {

    /* renamed from: f */
    private DialogLayout f4701f;

    /* renamed from: com.afollestad.materialdialogs.internal.main.DialogScrollView$a */
    static final class C1605a extends C3371l implements C3350b<DialogScrollView, Unit> {

        /* renamed from: g */
        public static final C1605a f4702g = new C1605a();

        C1605a() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6171a((DialogScrollView) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6171a(DialogScrollView dialogScrollView) {
            C3370k.m12227b(dialogScrollView, "$receiver");
            dialogScrollView.mo6166a();
            dialogScrollView.m6996b();
        }
    }

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogScrollView(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m6996b() {
        setOverScrollMode((getChildCount() == 0 || getMeasuredHeight() == 0 || !m6997c()) ? 2 : 1);
    }

    /* renamed from: c */
    private final boolean m6997c() {
        View childAt = getChildAt(0);
        C3370k.m12223a((Object) childAt, "getChildAt(0)");
        return childAt.getMeasuredHeight() > getHeight();
    }

    /* renamed from: a */
    public final void mo6166a() {
        boolean z = false;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || !m6997c()) {
            DialogLayout dialogLayout = this.f4701f;
            if (dialogLayout != null) {
                dialogLayout.mo6144a(false, false);
                return;
            }
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        C3370k.m12223a((Object) childAt, "view");
        int bottom = childAt.getBottom() - (getMeasuredHeight() + getScrollY());
        DialogLayout dialogLayout2 = this.f4701f;
        if (dialogLayout2 != null) {
            boolean z2 = getScrollY() > 0;
            if (bottom > 0) {
                z = true;
            }
            dialogLayout2.mo6144a(z2, z);
        }
    }

    public final DialogLayout getRootView() {
        return this.f4701f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1103e.f3789a.mo5180b(this, C1605a.f4702g);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mo6166a();
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.f4701f = dialogLayout;
    }
}
