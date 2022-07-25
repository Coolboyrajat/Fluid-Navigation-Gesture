package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import kotlin.C3256e;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1048f;
import p054c.p055a.p056a.C1050h;
import p054c.p055a.p056a.C1052j;
import p054c.p055a.p056a.p065u.C1098a;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

public final class DialogContentLayout extends FrameLayout {

    /* renamed from: m */
    static final /* synthetic */ C3208i[] f4714m;

    /* renamed from: f */
    private ViewGroup f4715f;

    /* renamed from: g */
    private TextView f4716g;

    /* renamed from: h */
    private boolean f4717h;

    /* renamed from: i */
    private final C3256e f4718i;

    /* renamed from: j */
    private DialogScrollView f4719j;

    /* renamed from: k */
    private DialogRecyclerView f4720k;

    /* renamed from: l */
    private View f4721l;

    /* renamed from: com.afollestad.materialdialogs.internal.message.DialogContentLayout$a */
    static final class C1607a extends C3371l implements C3349a<Integer> {

        /* renamed from: g */
        final /* synthetic */ DialogContentLayout f4722g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1607a(DialogContentLayout dialogContentLayout) {
            super(0);
            this.f4722g = dialogContentLayout;
        }

        public final int invoke() {
            return this.f4722g.getResources().getDimensionPixelSize(C1050h.md_dialog_frame_margin_horizontal);
        }
    }

    static {
        C3380u uVar = new C3380u(C3384y.m12254a(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I");
        C3384y.m12259a((C3379t) uVar);
        f4714m = new C3208i[]{uVar};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4718i = C3258g.m11969a(new C1607a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogContentLayout(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public static /* synthetic */ void m7003a(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.mo6188a(i, i2);
    }

    /* renamed from: b */
    private final void m7004b() {
        if (this.f4719j == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) C1107f.m5542a(this, C1052j.md_dialog_stub_scrollview, (ViewGroup) null, 2, (Object) null);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt != null) {
                this.f4715f = (ViewGroup) childAt;
                this.f4719j = dialogScrollView;
                addView(this.f4719j);
                return;
            }
            throw new C3269p("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m7005b(DialogContentLayout dialogContentLayout, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        dialogContentLayout.mo6192b(i, i2);
    }

    private final int getFrameHorizontalMargin() {
        C3256e eVar = this.f4718i;
        C3208i iVar = f4714m[0];
        return ((Number) eVar.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new C3269p("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo6187a(java.lang.Integer r10, android.view.View r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.f4721l
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            if (r0 == 0) goto L_0x0090
            r0 = 0
            if (r11 == 0) goto L_0x0023
            android.view.ViewParent r2 = r11.getParent()
            if (r2 == 0) goto L_0x0023
            android.view.ViewParent r2 = r11.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 != 0) goto L_0x001c
            r2 = r0
        L_0x001c:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0023
            r2.removeView(r11)
        L_0x0023:
            if (r12 == 0) goto L_0x0069
            r9.f4717h = r1
            r9.m7004b()
            if (r11 == 0) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            if (r10 == 0) goto L_0x0065
            int r10 = r10.intValue()
            android.view.ViewGroup r11 = r9.f4715f
            java.lang.Object r10 = p054c.p055a.p056a.p066v.C1107f.m5541a(r9, r10, r11)
            r11 = r10
            android.view.View r11 = (android.view.View) r11
        L_0x003c:
            r9.f4721l = r11
            android.view.ViewGroup r10 = r9.f4715f
            if (r10 == 0) goto L_0x0061
            android.view.View r11 = r9.f4721l
            if (r11 == 0) goto L_0x005c
            if (r13 == 0) goto L_0x005d
            c.a.a.v.e r1 = p054c.p055a.p056a.p066v.C1103e.f3789a
            int r3 = r9.getFrameHorizontalMargin()
            r4 = 0
            int r5 = r9.getFrameHorizontalMargin()
            r6 = 0
            r7 = 10
            r8 = 0
            r2 = r11
            p054c.p055a.p056a.p066v.C1103e.m5518a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x005d
        L_0x005c:
            r11 = r0
        L_0x005d:
            r10.addView(r11)
            goto L_0x0083
        L_0x0061:
            kotlin.p205x.p207d.C3370k.m12221a()
            throw r0
        L_0x0065:
            kotlin.p205x.p207d.C3370k.m12221a()
            throw r0
        L_0x0069:
            r9.f4717h = r13
            if (r11 == 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            if (r10 == 0) goto L_0x008c
            int r10 = r10.intValue()
            r11 = 2
            java.lang.Object r10 = p054c.p055a.p056a.p066v.C1107f.m5542a(r9, r10, r0, r11, r0)
            r11 = r10
            android.view.View r11 = (android.view.View) r11
        L_0x007c:
            r9.f4721l = r11
            android.view.View r10 = r9.f4721l
            r9.addView(r10)
        L_0x0083:
            android.view.View r10 = r9.f4721l
            if (r10 == 0) goto L_0x0088
            return r10
        L_0x0088:
            kotlin.p205x.p207d.C3370k.m12221a()
            throw r0
        L_0x008c:
            kotlin.p205x.p207d.C3370k.m12221a()
            throw r0
        L_0x0090:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Custom view already set."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.message.DialogContentLayout.mo6187a(java.lang.Integer, android.view.View, boolean, boolean):android.view.View");
    }

    /* renamed from: a */
    public final void mo6188a(int i, int i2) {
        if (i != -1) {
            C1103e.m5518a(C1103e.f3789a, getChildAt(0), 0, i, 0, 0, 13, (Object) null);
        }
        if (i2 != -1) {
            C1103e.m5518a(C1103e.f3789a, getChildAt(getChildCount() - 1), 0, 0, 0, i2, 7, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo6189a(C1041c cVar, RecyclerView.C0527g<?> gVar, RecyclerView.C0538o oVar) {
        C3370k.m12227b(cVar, "dialog");
        C3370k.m12227b(gVar, "adapter");
        if (this.f4720k == null) {
            DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) C1107f.m5542a(this, C1052j.md_dialog_stub_recyclerview, (ViewGroup) null, 2, (Object) null);
            dialogRecyclerView.mo6123a(cVar);
            if (oVar == null) {
                oVar = new LinearLayoutManager(cVar.mo5117i());
            }
            dialogRecyclerView.setLayoutManager(oVar);
            this.f4720k = dialogRecyclerView;
            addView(this.f4720k);
        }
        DialogRecyclerView dialogRecyclerView2 = this.f4720k;
        if (dialogRecyclerView2 != null) {
            dialogRecyclerView2.setAdapter(gVar);
        }
    }

    /* renamed from: a */
    public final void mo6190a(C1041c cVar, Integer num, CharSequence charSequence, Typeface typeface, C3350b<? super C1098a, Unit> bVar) {
        C3370k.m12227b(cVar, "dialog");
        m7004b();
        if (this.f4716g == null) {
            int i = C1052j.md_dialog_stub_message;
            ViewGroup viewGroup = this.f4715f;
            if (viewGroup != null) {
                TextView textView = (TextView) C1107f.m5541a(this, i, viewGroup);
                ViewGroup viewGroup2 = this.f4715f;
                if (viewGroup2 != null) {
                    viewGroup2.addView(textView);
                    this.f4716g = textView;
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            } else {
                C3370k.m12221a();
                throw null;
            }
        }
        TextView textView2 = this.f4716g;
        if (textView2 != null) {
            C1098a aVar = new C1098a(cVar, textView2);
            if (bVar != null) {
                Unit a = bVar.mo5146a(aVar);
            }
            TextView textView3 = this.f4716g;
            if (textView3 != null) {
                if (typeface != null) {
                    textView3.setTypeface(typeface);
                }
                C1103e.m5519a(C1103e.f3789a, textView3, cVar.mo5117i(), Integer.valueOf(C1048f.md_color_content), (Integer) null, 4, (Object) null);
                aVar.mo5160a(num, charSequence);
                return;
            }
            return;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: a */
    public final boolean mo6191a() {
        return getChildCount() > 1;
    }

    /* renamed from: b */
    public final void mo6192b(int i, int i2) {
        View view = this.f4719j;
        if (view == null) {
            view = this.f4720k;
        }
        if (i != -1) {
            C1103e.m5518a(C1103e.f3789a, view, 0, i, 0, 0, 13, (Object) null);
        }
        if (i2 != -1) {
            C1103e.m5518a(C1103e.f3789a, view, 0, 0, 0, i2, 7, (Object) null);
        }
    }

    public final View getCustomView() {
        return this.f4721l;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.f4720k;
    }

    public final DialogScrollView getScrollView() {
        return this.f4719j;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            C3370k.m12223a((Object) childAt, "currentChild");
            int measuredHeight = childAt.getMeasuredHeight() + i8;
            if (!C3370k.m12225a((Object) childAt, (Object) this.f4721l) || !this.f4717h) {
                i5 = getMeasuredWidth();
                i6 = 0;
            } else {
                i6 = getFrameHorizontalMargin();
                i5 = getMeasuredWidth() - getFrameHorizontalMargin();
            }
            childAt.layout(i6, i8, i5, measuredHeight);
            i7++;
            i8 = measuredHeight;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.f4719j;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, RecyclerView.UNDEFINED_DURATION));
        }
        DialogScrollView dialogScrollView2 = this.f4719j;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i3 = size2 - measuredHeight;
        int childCount = this.f4719j != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i4 = i3 / childCount;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt = getChildAt(i5);
            C3370k.m12223a((Object) childAt, "currentChild");
            int id = childAt.getId();
            DialogScrollView dialogScrollView3 = this.f4719j;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                childAt.measure((!C3370k.m12225a((Object) childAt, (Object) this.f4721l) || !this.f4717h) ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(size - (getFrameHorizontalMargin() * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(i4, RecyclerView.UNDEFINED_DURATION));
                measuredHeight += childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(View view) {
        this.f4721l = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.f4720k = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.f4719j = dialogScrollView;
    }
}
