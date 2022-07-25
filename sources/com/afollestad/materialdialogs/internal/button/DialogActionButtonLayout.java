package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.main.C1606a;
import java.util.ArrayList;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1050h;
import p054c.p055a.p056a.C1051i;
import p054c.p055a.p056a.C1055m;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

public final class DialogActionButtonLayout extends C1606a {

    /* renamed from: j */
    private final int f4657j;

    /* renamed from: k */
    private final int f4658k;

    /* renamed from: l */
    private final int f4659l;

    /* renamed from: m */
    private final int f4660m;

    /* renamed from: n */
    private final int f4661n;

    /* renamed from: o */
    private boolean f4662o;

    /* renamed from: p */
    public DialogActionButton[] f4663p;

    /* renamed from: q */
    public AppCompatCheckBox f4664q;

    /* renamed from: com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout$a */
    public static final class C1592a {
        private C1592a() {
        }

        public /* synthetic */ C1592a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout$b */
    static final class C1593b implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ DialogActionButtonLayout f4665f;

        /* renamed from: g */
        final /* synthetic */ C1055m f4666g;

        C1593b(DialogActionButtonLayout dialogActionButtonLayout, C1055m mVar) {
            this.f4665f = dialogActionButtonLayout;
            this.f4666g = mVar;
        }

        public final void onClick(View view) {
            this.f4665f.getDialog().mo5106a(this.f4666g);
        }
    }

    static {
        new C1592a((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4657j = C1103e.f3789a.mo5163a(this, C1050h.md_action_button_frame_padding) - C1103e.f3789a.mo5163a(this, C1050h.md_action_button_inset_horizontal);
        this.f4658k = C1103e.f3789a.mo5163a(this, C1050h.md_action_button_frame_padding_neutral);
        this.f4659l = C1103e.f3789a.mo5163a(this, C1050h.md_action_button_frame_spec_height);
        this.f4660m = C1103e.f3789a.mo5163a(this, C1050h.md_checkbox_prompt_margin_vertical);
        this.f4661n = C1103e.f3789a.mo5163a(this, C1050h.md_checkbox_prompt_margin_horizontal);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogActionButtonLayout(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: b */
    private final int m6941b() {
        if (getVisibleButtons().length == 0) {
            return 0;
        }
        if (!this.f4662o) {
            return this.f4659l;
        }
        return this.f4659l * getVisibleButtons().length;
    }

    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f4663p;
        if (dialogActionButtonArr != null) {
            return dialogActionButtonArr;
        }
        C3370k.m12230d("actionButtons");
        throw null;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.f4664q;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox;
        }
        C3370k.m12230d("checkBoxPrompt");
        throw null;
    }

    public final boolean getStackButtons$com_afollestad_material_dialogs_core() {
        return this.f4662o;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f4663p;
        if (dialogActionButtonArr != null) {
            ArrayList arrayList = new ArrayList();
            for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
                if (C1107f.m5547c(dialogActionButton)) {
                    arrayList.add(dialogActionButton);
                }
            }
            Object[] array = arrayList.toArray(new DialogActionButton[0]);
            if (array != null) {
                return (DialogActionButton[]) array;
            }
            throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
        }
        C3370k.m12230d("actionButtons");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C3370k.m12227b(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getDividerHeight(), mo6181a());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C1051i.md_button_positive);
        C3370k.m12223a((Object) findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(C1051i.md_button_negative);
        C3370k.m12223a((Object) findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(C1051i.md_button_neutral);
        C3370k.m12223a((Object) findViewById3, "findViewById(R.id.md_button_neutral)");
        this.f4663p = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(C1051i.md_checkbox_prompt);
        C3370k.m12223a((Object) findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.f4664q = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.f4663p;
        if (dialogActionButtonArr != null) {
            int length = dialogActionButtonArr.length;
            for (int i = 0; i < length; i++) {
                dialogActionButtonArr[i].setOnClickListener(new C1593b(this, C1055m.f3715k.mo5124a(i)));
            }
            return;
        }
        C3370k.m12230d("actionButtons");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        AppCompatCheckBox appCompatCheckBox;
        if (C1594a.m6942a(this)) {
            AppCompatCheckBox appCompatCheckBox2 = this.f4664q;
            if (appCompatCheckBox2 != null) {
                if (C1107f.m5547c(appCompatCheckBox2)) {
                    if (C1107f.m5546b(this)) {
                        i7 = getMeasuredWidth() - this.f4661n;
                        i6 = this.f4660m;
                        AppCompatCheckBox appCompatCheckBox3 = this.f4664q;
                        if (appCompatCheckBox3 != null) {
                            i5 = i7 - appCompatCheckBox3.getMeasuredWidth();
                            appCompatCheckBox = this.f4664q;
                            if (appCompatCheckBox == null) {
                                C3370k.m12230d("checkBoxPrompt");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("checkBoxPrompt");
                            throw null;
                        }
                    } else {
                        i5 = this.f4661n;
                        i6 = this.f4660m;
                        AppCompatCheckBox appCompatCheckBox4 = this.f4664q;
                        if (appCompatCheckBox4 != null) {
                            i7 = appCompatCheckBox4.getMeasuredWidth() + i5;
                            appCompatCheckBox = this.f4664q;
                            if (appCompatCheckBox == null) {
                                C3370k.m12230d("checkBoxPrompt");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("checkBoxPrompt");
                            throw null;
                        }
                    }
                    int measuredHeight = appCompatCheckBox.getMeasuredHeight() + i6;
                    AppCompatCheckBox appCompatCheckBox5 = this.f4664q;
                    if (appCompatCheckBox5 != null) {
                        appCompatCheckBox5.layout(i5, i6, i7, measuredHeight);
                    } else {
                        C3370k.m12230d("checkBoxPrompt");
                        throw null;
                    }
                }
                if (this.f4662o) {
                    int i8 = this.f4657j;
                    int measuredWidth = getMeasuredWidth() - this.f4657j;
                    int measuredHeight2 = getMeasuredHeight();
                    for (DialogActionButton layout : C3280f.m12030f(getVisibleButtons())) {
                        int i9 = measuredHeight2 - this.f4659l;
                        layout.layout(i8, i9, measuredWidth, measuredHeight2);
                        measuredHeight2 = i9;
                    }
                    return;
                }
                int measuredHeight3 = getMeasuredHeight() - this.f4659l;
                int measuredHeight4 = getMeasuredHeight();
                if (C1107f.m5546b(this)) {
                    DialogActionButton[] dialogActionButtonArr = this.f4663p;
                    if (dialogActionButtonArr != null) {
                        if (C1107f.m5547c(dialogActionButtonArr[2])) {
                            DialogActionButton[] dialogActionButtonArr2 = this.f4663p;
                            if (dialogActionButtonArr2 != null) {
                                DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                                int measuredWidth2 = getMeasuredWidth() - this.f4658k;
                                dialogActionButton.layout(measuredWidth2 - dialogActionButton.getMeasuredWidth(), measuredHeight3, measuredWidth2, measuredHeight4);
                            } else {
                                C3370k.m12230d("actionButtons");
                                throw null;
                            }
                        }
                        int i10 = this.f4657j;
                        DialogActionButton[] dialogActionButtonArr3 = this.f4663p;
                        if (dialogActionButtonArr3 != null) {
                            if (C1107f.m5547c(dialogActionButtonArr3[0])) {
                                DialogActionButton[] dialogActionButtonArr4 = this.f4663p;
                                if (dialogActionButtonArr4 != null) {
                                    DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                                    int measuredWidth3 = dialogActionButton2.getMeasuredWidth() + i10;
                                    dialogActionButton2.layout(i10, measuredHeight3, measuredWidth3, measuredHeight4);
                                    i10 = measuredWidth3;
                                } else {
                                    C3370k.m12230d("actionButtons");
                                    throw null;
                                }
                            }
                            DialogActionButton[] dialogActionButtonArr5 = this.f4663p;
                            if (dialogActionButtonArr5 == null) {
                                C3370k.m12230d("actionButtons");
                                throw null;
                            } else if (C1107f.m5547c(dialogActionButtonArr5[1])) {
                                DialogActionButton[] dialogActionButtonArr6 = this.f4663p;
                                if (dialogActionButtonArr6 != null) {
                                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                                    dialogActionButton3.layout(i10, measuredHeight3, dialogActionButton3.getMeasuredWidth() + i10, measuredHeight4);
                                    return;
                                }
                                C3370k.m12230d("actionButtons");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("actionButtons");
                            throw null;
                        }
                    } else {
                        C3370k.m12230d("actionButtons");
                        throw null;
                    }
                } else {
                    DialogActionButton[] dialogActionButtonArr7 = this.f4663p;
                    if (dialogActionButtonArr7 != null) {
                        if (C1107f.m5547c(dialogActionButtonArr7[2])) {
                            DialogActionButton[] dialogActionButtonArr8 = this.f4663p;
                            if (dialogActionButtonArr8 != null) {
                                DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                                int i11 = this.f4658k;
                                dialogActionButton4.layout(i11, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i11, measuredHeight4);
                            } else {
                                C3370k.m12230d("actionButtons");
                                throw null;
                            }
                        }
                        int measuredWidth4 = getMeasuredWidth() - this.f4657j;
                        DialogActionButton[] dialogActionButtonArr9 = this.f4663p;
                        if (dialogActionButtonArr9 != null) {
                            if (C1107f.m5547c(dialogActionButtonArr9[0])) {
                                DialogActionButton[] dialogActionButtonArr10 = this.f4663p;
                                if (dialogActionButtonArr10 != null) {
                                    DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                                    int measuredWidth5 = measuredWidth4 - dialogActionButton5.getMeasuredWidth();
                                    dialogActionButton5.layout(measuredWidth5, measuredHeight3, measuredWidth4, measuredHeight4);
                                    measuredWidth4 = measuredWidth5;
                                } else {
                                    C3370k.m12230d("actionButtons");
                                    throw null;
                                }
                            }
                            DialogActionButton[] dialogActionButtonArr11 = this.f4663p;
                            if (dialogActionButtonArr11 == null) {
                                C3370k.m12230d("actionButtons");
                                throw null;
                            } else if (C1107f.m5547c(dialogActionButtonArr11[1])) {
                                DialogActionButton[] dialogActionButtonArr12 = this.f4663p;
                                if (dialogActionButtonArr12 != null) {
                                    DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                                    dialogActionButton6.layout(measuredWidth4 - dialogActionButton6.getMeasuredWidth(), measuredHeight3, measuredWidth4, measuredHeight4);
                                    return;
                                }
                                C3370k.m12230d("actionButtons");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("actionButtons");
                            throw null;
                        }
                    } else {
                        C3370k.m12230d("actionButtons");
                        throw null;
                    }
                }
            } else {
                C3370k.m12230d("checkBoxPrompt");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!C1594a.m6942a(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        AppCompatCheckBox appCompatCheckBox = this.f4664q;
        if (appCompatCheckBox != null) {
            if (C1107f.m5547c(appCompatCheckBox)) {
                int i3 = size - (this.f4661n * 2);
                AppCompatCheckBox appCompatCheckBox2 = this.f4664q;
                if (appCompatCheckBox2 != null) {
                    appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i3, RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(0, 0));
                } else {
                    C3370k.m12230d("checkBoxPrompt");
                    throw null;
                }
            }
            Context context = getDialog().getContext();
            C3370k.m12223a((Object) context, "dialog.context");
            Context i4 = getDialog().mo5117i();
            for (DialogActionButton dialogActionButton : getVisibleButtons()) {
                dialogActionButton.mo6108a(context, i4, this.f4662o);
                dialogActionButton.measure(this.f4662o ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.f4659l, 1073741824));
            }
            if ((!(getVisibleButtons().length == 0)) && !this.f4662o) {
                int i5 = 0;
                for (DialogActionButton measuredWidth : getVisibleButtons()) {
                    i5 += measuredWidth.getMeasuredWidth();
                }
                if (i5 >= size && !this.f4662o) {
                    this.f4662o = true;
                    for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                        dialogActionButton2.mo6108a(context, i4, true);
                        dialogActionButton2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4659l, 1073741824));
                    }
                }
            }
            int b = m6941b();
            AppCompatCheckBox appCompatCheckBox3 = this.f4664q;
            if (appCompatCheckBox3 != null) {
                if (C1107f.m5547c(appCompatCheckBox3)) {
                    AppCompatCheckBox appCompatCheckBox4 = this.f4664q;
                    if (appCompatCheckBox4 != null) {
                        b += appCompatCheckBox4.getMeasuredHeight() + (this.f4660m * 2);
                    } else {
                        C3370k.m12230d("checkBoxPrompt");
                        throw null;
                    }
                }
                setMeasuredDimension(size, b);
                return;
            }
            C3370k.m12230d("checkBoxPrompt");
            throw null;
        }
        C3370k.m12230d("checkBoxPrompt");
        throw null;
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        C3370k.m12227b(dialogActionButtonArr, "<set-?>");
        this.f4663p = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        C3370k.m12227b(appCompatCheckBox, "<set-?>");
        this.f4664q = appCompatCheckBox;
    }

    public final void setStackButtons$com_afollestad_material_dialogs_core(boolean z) {
        this.f4662o = z;
    }
}
