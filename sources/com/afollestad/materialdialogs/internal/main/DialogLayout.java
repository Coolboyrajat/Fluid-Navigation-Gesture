package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.button.C1594a;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1040b;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1050h;
import p054c.p055a.p056a.C1051i;
import p054c.p055a.p056a.p066v.C1101c;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

public final class DialogLayout extends FrameLayout {

    /* renamed from: f */
    private int f4689f;

    /* renamed from: g */
    private boolean f4690g;

    /* renamed from: h */
    private Paint f4691h;

    /* renamed from: i */
    private final int f4692i = C1103e.f3789a.mo5163a(this, C1050h.md_dialog_frame_margin_vertical);

    /* renamed from: j */
    private final int f4693j = C1103e.f3789a.mo5163a(this, C1050h.md_dialog_frame_margin_vertical_less);

    /* renamed from: k */
    public C1041c f4694k;

    /* renamed from: l */
    public DialogTitleLayout f4695l;

    /* renamed from: m */
    public DialogContentLayout f4696m;

    /* renamed from: n */
    private DialogActionButtonLayout f4697n;

    /* renamed from: o */
    private C1040b f4698o = C1040b.WRAP_CONTENT;

    /* renamed from: p */
    private boolean f4699p = true;

    /* renamed from: q */
    private int f4700q = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
    }

    /* renamed from: a */
    private final Paint m6984a(int i, float f) {
        if (this.f4691h == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(C1101c.m5510a(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f4691h = paint;
        }
        Paint paint2 = this.f4691h;
        if (paint2 != null) {
            paint2.setColor(i);
            setAlpha(f);
            return paint2;
        }
        C3370k.m12221a();
        throw null;
    }

    /* renamed from: a */
    static /* synthetic */ Paint m6985a(DialogLayout dialogLayout, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        return dialogLayout.m6984a(i, f);
    }

    /* renamed from: a */
    private final void m6986a(Canvas canvas, int i, float f, float f2) {
        m6987a(canvas, i, 0.0f, (float) getMeasuredWidth(), f, f2);
    }

    /* renamed from: a */
    private final void m6987a(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        canvas.drawLine(f, f3, f2, f4, m6985a(this, i, 0.0f, 2, (Object) null));
    }

    /* renamed from: a */
    private final void m6988a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5) {
        canvas.drawRect(f2, f4, f3, f5, m6984a(i, f));
    }

    /* renamed from: a */
    static /* synthetic */ void m6989a(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = (float) dialogLayout.getMeasuredHeight();
        }
        if ((i2 & 4) != 0) {
            f2 = f;
        }
        dialogLayout.m6986a(canvas, i, f, f2);
    }

    /* renamed from: b */
    private final void m6990b(Canvas canvas, int i, float f, float f2) {
        m6987a(canvas, i, f, f2, 0.0f, (float) getMeasuredHeight());
    }

    /* renamed from: b */
    static /* synthetic */ void m6991b(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = f;
        }
        dialogLayout.m6990b(canvas, i, f, f2);
    }

    /* renamed from: a */
    public final void mo6142a(C1041c cVar) {
        C3370k.m12227b(cVar, "dialog");
        DialogTitleLayout dialogTitleLayout = this.f4695l;
        if (dialogTitleLayout != null) {
            dialogTitleLayout.setDialog(cVar);
            DialogActionButtonLayout dialogActionButtonLayout = this.f4697n;
            if (dialogActionButtonLayout != null) {
                dialogActionButtonLayout.setDialog(cVar);
                return;
            }
            return;
        }
        C3370k.m12230d("titleLayout");
        throw null;
    }

    /* renamed from: a */
    public final void mo6143a(DialogActionButtonLayout dialogActionButtonLayout) {
        C3370k.m12227b(dialogActionButtonLayout, "buttonsLayout");
        this.f4697n = dialogActionButtonLayout;
        this.f4699p = false;
    }

    /* renamed from: a */
    public final void mo6144a(boolean z, boolean z2) {
        DialogTitleLayout dialogTitleLayout = this.f4695l;
        if (dialogTitleLayout != null) {
            dialogTitleLayout.setDrawDivider(z);
            DialogActionButtonLayout dialogActionButtonLayout = this.f4697n;
            if (dialogActionButtonLayout != null) {
                dialogActionButtonLayout.setDrawDivider(z2);
                return;
            }
            return;
        }
        C3370k.m12230d("titleLayout");
        throw null;
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.f4697n;
    }

    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.f4696m;
        if (dialogContentLayout != null) {
            return dialogContentLayout;
        }
        C3370k.m12230d("contentLayout");
        throw null;
    }

    public final boolean getDebugMode() {
        return this.f4690g;
    }

    public final C1041c getDialog() {
        C1041c cVar = this.f4694k;
        if (cVar != null) {
            return cVar;
        }
        C3370k.m12230d("dialog");
        throw null;
    }

    public final int getFrameMarginVertical$com_afollestad_material_dialogs_core() {
        return this.f4692i;
    }

    public final int getFrameMarginVerticalLess$com_afollestad_material_dialogs_core() {
        return this.f4693j;
    }

    public final C1040b getLayoutMode() {
        return this.f4698o;
    }

    public final int getMaxHeight() {
        return this.f4689f;
    }

    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.f4695l;
        if (dialogTitleLayout != null) {
            return dialogTitleLayout;
        }
        C3370k.m12230d("titleLayout");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            this.f4700q = C1103e.f3789a.mo5169a((WindowManager) systemService).mo9935b().intValue();
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Object obj;
        int i;
        float f;
        float f2;
        int i2;
        Canvas canvas2;
        DialogLayout dialogLayout;
        C3370k.m12227b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f4690g) {
            Canvas canvas3 = canvas;
            m6991b(this, canvas3, -16776961, C1101c.m5510a(this, 24), 0.0f, 4, (Object) null);
            m6989a(this, canvas3, -16776961, C1101c.m5510a(this, 24), 0.0f, 4, (Object) null);
            m6991b(this, canvas, -16776961, ((float) getMeasuredWidth()) - C1101c.m5510a(this, 24), 0.0f, 4, (Object) null);
            DialogTitleLayout dialogTitleLayout = this.f4695l;
            if (dialogTitleLayout != null) {
                if (C1107f.m5547c(dialogTitleLayout)) {
                    DialogTitleLayout dialogTitleLayout2 = this.f4695l;
                    if (dialogTitleLayout2 != null) {
                        m6989a(this, canvas, -65536, (float) dialogTitleLayout2.getBottom(), 0.0f, 4, (Object) null);
                    } else {
                        C3370k.m12230d("titleLayout");
                        throw null;
                    }
                }
                DialogContentLayout dialogContentLayout = this.f4696m;
                if (dialogContentLayout != null) {
                    if (C1107f.m5547c(dialogContentLayout)) {
                        DialogContentLayout dialogContentLayout2 = this.f4696m;
                        if (dialogContentLayout2 != null) {
                            m6989a(this, canvas, -256, (float) dialogContentLayout2.getTop(), 0.0f, 4, (Object) null);
                        } else {
                            C3370k.m12230d("contentLayout");
                            throw null;
                        }
                    }
                    if (C1594a.m6942a(this.f4697n)) {
                        m6991b(this, canvas, -16711681, C1107f.m5546b(this) ? C1101c.m5510a(this, 8) : ((float) getMeasuredWidth()) - C1101c.m5510a(this, 8), 0.0f, 4, (Object) null);
                        DialogActionButtonLayout dialogActionButtonLayout = this.f4697n;
                        if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons$com_afollestad_material_dialogs_core()) {
                            DialogActionButtonLayout dialogActionButtonLayout2 = this.f4697n;
                            if (dialogActionButtonLayout2 == null) {
                                return;
                            }
                            if (dialogActionButtonLayout2 != null) {
                                DialogActionButton[] visibleButtons = dialogActionButtonLayout2.getVisibleButtons();
                                int length = visibleButtons.length;
                                int i3 = 0;
                                while (i3 < length) {
                                    DialogActionButton dialogActionButton = visibleButtons[i3];
                                    DialogActionButtonLayout dialogActionButtonLayout3 = this.f4697n;
                                    if (dialogActionButtonLayout3 != null) {
                                        float top = ((float) dialogActionButtonLayout3.getTop()) + ((float) dialogActionButton.getTop()) + C1101c.m5510a(this, 8);
                                        DialogActionButtonLayout dialogActionButtonLayout4 = this.f4697n;
                                        if (dialogActionButtonLayout4 != null) {
                                            m6988a(canvas, -16711681, 0.4f, ((float) dialogActionButton.getLeft()) + C1101c.m5510a(this, 4), ((float) dialogActionButton.getRight()) - C1101c.m5510a(this, 4), top, ((float) dialogActionButtonLayout4.getBottom()) - C1101c.m5510a(this, 8));
                                            i3++;
                                        } else {
                                            C3370k.m12221a();
                                            throw null;
                                        }
                                    } else {
                                        C3370k.m12221a();
                                        throw null;
                                    }
                                }
                                DialogActionButtonLayout dialogActionButtonLayout5 = this.f4697n;
                                if (dialogActionButtonLayout5 != null) {
                                    f = 0.0f;
                                    i = 4;
                                    obj = null;
                                    m6989a(this, canvas, -65281, (float) dialogActionButtonLayout5.getTop(), 0.0f, 4, (Object) null);
                                    float measuredHeight = ((float) getMeasuredHeight()) - (C1101c.m5510a(this, 52) - C1101c.m5510a(this, 8));
                                    float measuredHeight2 = ((float) getMeasuredHeight()) - C1101c.m5510a(this, 8);
                                    canvas2 = canvas;
                                    m6989a(this, canvas2, -65536, measuredHeight, 0.0f, 4, (Object) null);
                                    m6989a(this, canvas2, -65536, measuredHeight2, 0.0f, 4, (Object) null);
                                    i2 = -16776961;
                                    f2 = measuredHeight - C1101c.m5510a(this, 8);
                                    dialogLayout = this;
                                } else {
                                    C3370k.m12221a();
                                    throw null;
                                }
                            } else {
                                C3370k.m12221a();
                                throw null;
                            }
                        } else {
                            DialogActionButtonLayout dialogActionButtonLayout6 = this.f4697n;
                            if (dialogActionButtonLayout6 != null) {
                                float top2 = ((float) dialogActionButtonLayout6.getTop()) + C1101c.m5510a(this, 8);
                                DialogActionButtonLayout dialogActionButtonLayout7 = this.f4697n;
                                if (dialogActionButtonLayout7 != null) {
                                    float f3 = top2;
                                    for (DialogActionButton left : dialogActionButtonLayout7.getVisibleButtons()) {
                                        float a = f3 + C1101c.m5510a(this, 36);
                                        m6988a(canvas, -16711681, 0.4f, (float) left.getLeft(), ((float) getMeasuredWidth()) - C1101c.m5510a(this, 8), f3, a);
                                        f3 = a + C1101c.m5510a(this, 16);
                                    }
                                    DialogActionButtonLayout dialogActionButtonLayout8 = this.f4697n;
                                    if (dialogActionButtonLayout8 != null) {
                                        m6989a(this, canvas, -16776961, (float) dialogActionButtonLayout8.getTop(), 0.0f, 4, (Object) null);
                                        DialogActionButtonLayout dialogActionButtonLayout9 = this.f4697n;
                                        if (dialogActionButtonLayout9 != null) {
                                            float top3 = ((float) dialogActionButtonLayout9.getTop()) + C1101c.m5510a(this, 8);
                                            float measuredHeight3 = ((float) getMeasuredHeight()) - C1101c.m5510a(this, 8);
                                            i2 = -65536;
                                            f = 0.0f;
                                            i = 4;
                                            obj = null;
                                            dialogLayout = this;
                                            canvas2 = canvas;
                                            m6989a(dialogLayout, canvas2, -65536, top3, 0.0f, 4, (Object) null);
                                            f2 = measuredHeight3;
                                        } else {
                                            C3370k.m12221a();
                                            throw null;
                                        }
                                    } else {
                                        C3370k.m12221a();
                                        throw null;
                                    }
                                } else {
                                    C3370k.m12221a();
                                    throw null;
                                }
                            } else {
                                C3370k.m12221a();
                                throw null;
                            }
                        }
                        m6989a(dialogLayout, canvas2, i2, f2, f, i, obj);
                        return;
                    }
                    return;
                }
                C3370k.m12230d("contentLayout");
                throw null;
            }
            C3370k.m12230d("titleLayout");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C1051i.md_title_layout);
        C3370k.m12223a((Object) findViewById, "findViewById(R.id.md_title_layout)");
        this.f4695l = (DialogTitleLayout) findViewById;
        View findViewById2 = findViewById(C1051i.md_content_layout);
        C3370k.m12223a((Object) findViewById2, "findViewById(R.id.md_content_layout)");
        this.f4696m = (DialogContentLayout) findViewById2;
        this.f4697n = (DialogActionButtonLayout) findViewById(C1051i.md_button_layout);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.f4695l;
        if (dialogTitleLayout != null) {
            int measuredHeight = dialogTitleLayout.getMeasuredHeight();
            DialogTitleLayout dialogTitleLayout2 = this.f4695l;
            if (dialogTitleLayout2 != null) {
                dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight);
                if (this.f4699p) {
                    int measuredHeight2 = getMeasuredHeight();
                    DialogActionButtonLayout dialogActionButtonLayout = this.f4697n;
                    i5 = measuredHeight2 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
                    if (C1594a.m6942a(this.f4697n)) {
                        int measuredWidth2 = getMeasuredWidth();
                        int measuredHeight3 = getMeasuredHeight();
                        DialogActionButtonLayout dialogActionButtonLayout2 = this.f4697n;
                        if (dialogActionButtonLayout2 != null) {
                            dialogActionButtonLayout2.layout(0, i5, measuredWidth2, measuredHeight3);
                        } else {
                            C3370k.m12221a();
                            throw null;
                        }
                    }
                } else {
                    i5 = getMeasuredHeight();
                }
                int measuredWidth3 = getMeasuredWidth();
                DialogContentLayout dialogContentLayout = this.f4696m;
                if (dialogContentLayout != null) {
                    dialogContentLayout.layout(0, measuredHeight, measuredWidth3, i5);
                } else {
                    C3370k.m12230d("contentLayout");
                    throw null;
                }
            } else {
                C3370k.m12230d("titleLayout");
                throw null;
            }
        } else {
            C3370k.m12230d("titleLayout");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f4689f;
        if (1 <= i4 && size2 > i4) {
            size2 = i4;
        }
        DialogTitleLayout dialogTitleLayout = this.f4695l;
        if (dialogTitleLayout != null) {
            int i5 = 0;
            dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (C1594a.m6942a(this.f4697n)) {
                DialogActionButtonLayout dialogActionButtonLayout = this.f4697n;
                if (dialogActionButtonLayout != null) {
                    dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } else {
                    C3370k.m12221a();
                    throw null;
                }
            }
            DialogTitleLayout dialogTitleLayout2 = this.f4695l;
            if (dialogTitleLayout2 != null) {
                int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.f4697n;
                int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
                DialogContentLayout dialogContentLayout = this.f4696m;
                if (dialogContentLayout != null) {
                    dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, RecyclerView.UNDEFINED_DURATION));
                    if (this.f4698o == C1040b.WRAP_CONTENT) {
                        DialogTitleLayout dialogTitleLayout3 = this.f4695l;
                        if (dialogTitleLayout3 != null) {
                            int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
                            DialogContentLayout dialogContentLayout2 = this.f4696m;
                            if (dialogContentLayout2 != null) {
                                int measuredHeight4 = measuredHeight3 + dialogContentLayout2.getMeasuredHeight();
                                DialogActionButtonLayout dialogActionButtonLayout3 = this.f4697n;
                                if (dialogActionButtonLayout3 != null) {
                                    i5 = dialogActionButtonLayout3.getMeasuredHeight();
                                }
                                i3 = measuredHeight4 + i5;
                            } else {
                                C3370k.m12230d("contentLayout");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("titleLayout");
                            throw null;
                        }
                    } else {
                        i3 = this.f4700q;
                    }
                    setMeasuredDimension(size, i3);
                    return;
                }
                C3370k.m12230d("contentLayout");
                throw null;
            }
            C3370k.m12230d("titleLayout");
            throw null;
        }
        C3370k.m12230d("titleLayout");
        throw null;
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.f4697n = dialogActionButtonLayout;
    }

    public final void setContentLayout(DialogContentLayout dialogContentLayout) {
        C3370k.m12227b(dialogContentLayout, "<set-?>");
        this.f4696m = dialogContentLayout;
    }

    public final void setDebugMode(boolean z) {
        this.f4690g = z;
        setWillNotDraw(!z);
    }

    public final void setDialog(C1041c cVar) {
        C3370k.m12227b(cVar, "<set-?>");
        this.f4694k = cVar;
    }

    public final void setLayoutMode(C1040b bVar) {
        C3370k.m12227b(bVar, "<set-?>");
        this.f4698o = bVar;
    }

    public final void setMaxHeight(int i) {
        this.f4689f = i;
    }

    public final void setTitleLayout(DialogTitleLayout dialogTitleLayout) {
        C3370k.m12227b(dialogTitleLayout, "<set-?>");
        this.f4695l = dialogTitleLayout;
    }
}
