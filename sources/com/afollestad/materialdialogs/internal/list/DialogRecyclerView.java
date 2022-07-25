package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p066v.C1100b;
import p054c.p055a.p056a.p066v.C1103e;

public final class DialogRecyclerView extends RecyclerView {

    /* renamed from: f */
    private C3351c<? super Boolean, ? super Boolean, Unit> f4667f;

    /* renamed from: g */
    private final C1597c f4668g;

    /* renamed from: com.afollestad.materialdialogs.internal.list.DialogRecyclerView$a */
    static final /* synthetic */ class C1595a extends C3368i implements C3351c<Boolean, Boolean, Unit> {
        C1595a(C1041c cVar) {
            super(2, cVar);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            mo6126a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6126a(boolean z, boolean z2) {
            C1100b.m5508a((C1041c) this.f8030g, z, z2);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "invalidateDividers";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12255a(C1100b.class, "com.afollestad.material-dialogs.core");
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "invalidateDividers(Lcom/afollestad/materialdialogs/MaterialDialog;ZZ)V";
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.list.DialogRecyclerView$b */
    static final class C1596b extends C3371l implements C3350b<DialogRecyclerView, Unit> {

        /* renamed from: g */
        public static final C1596b f4669g = new C1596b();

        C1596b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6127a((DialogRecyclerView) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6127a(DialogRecyclerView dialogRecyclerView) {
            C3370k.m12227b(dialogRecyclerView, "$receiver");
            dialogRecyclerView.mo6122a();
            dialogRecyclerView.m6944b();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.list.DialogRecyclerView$c */
    public static final class C1597c extends RecyclerView.C0547t {

        /* renamed from: a */
        final /* synthetic */ DialogRecyclerView f4670a;

        C1597c(DialogRecyclerView dialogRecyclerView) {
            this.f4670a = dialogRecyclerView;
        }

        /* renamed from: a */
        public void mo3290a(RecyclerView recyclerView, int i, int i2) {
            C3370k.m12227b(recyclerView, "recyclerView");
            super.mo3290a(recyclerView, i, i2);
            this.f4670a.mo6122a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4668g = new C1597c(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogRecyclerView(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m6944b() {
        int i = 2;
        if (!(getChildCount() == 0 || getMeasuredHeight() == 0 || m6947e())) {
            i = 1;
        }
        setOverScrollMode(i);
    }

    /* renamed from: c */
    private final boolean m6945c() {
        RecyclerView.C0527g adapter = getAdapter();
        if (adapter != null) {
            C3370k.m12223a((Object) adapter, "adapter!!");
            int b = adapter.mo3114b() - 1;
            RecyclerView.C0538o layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).mo2784H() == b;
            }
            if (!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).mo2784H() != b) {
                return false;
            }
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: d */
    private final boolean m6946d() {
        RecyclerView.C0538o layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).mo2782F() == 0;
        }
        if (!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).mo2782F() != 0) {
            return false;
        }
    }

    /* renamed from: e */
    private final boolean m6947e() {
        return m6945c() && m6946d();
    }

    /* renamed from: a */
    public final void mo6122a() {
        C3351c<? super Boolean, ? super Boolean, Unit> cVar;
        if (getChildCount() != 0 && getMeasuredHeight() != 0 && (cVar = this.f4667f) != null) {
            Unit a = cVar.mo6125a(Boolean.valueOf(!m6946d()), Boolean.valueOf(!m6945c()));
        }
    }

    /* renamed from: a */
    public final void mo6123a(C1041c cVar) {
        C3370k.m12227b(cVar, "dialog");
        this.f4667f = new C1595a(cVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1103e.f3789a.mo5180b(this, C1596b.f4669g);
        addOnScrollListener(this.f4668g);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeOnScrollListener(this.f4668g);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        mo6122a();
    }
}
