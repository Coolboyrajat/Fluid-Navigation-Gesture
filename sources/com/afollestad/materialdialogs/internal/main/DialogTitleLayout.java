package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1050h;
import p054c.p055a.p056a.C1051i;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

public final class DialogTitleLayout extends C1606a {

    /* renamed from: j */
    private final int f4703j;

    /* renamed from: k */
    private final int f4704k;

    /* renamed from: l */
    private final int f4705l;

    /* renamed from: m */
    private final int f4706m;

    /* renamed from: n */
    private final int f4707n;

    /* renamed from: o */
    public ImageView f4708o;

    /* renamed from: p */
    public TextView f4709p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4703j = C1103e.f3789a.mo5163a(this, C1050h.md_dialog_frame_margin_vertical);
        this.f4704k = C1103e.f3789a.mo5163a(this, C1050h.md_dialog_title_layout_margin_bottom);
        this.f4705l = C1103e.f3789a.mo5163a(this, C1050h.md_dialog_frame_margin_horizontal);
        this.f4706m = C1103e.f3789a.mo5163a(this, C1050h.md_icon_margin);
        this.f4707n = C1103e.f3789a.mo5163a(this, C1050h.md_icon_size);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogTitleLayout(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: b */
    public final boolean mo6172b() {
        ImageView imageView = this.f4708o;
        if (imageView != null) {
            if (C1107f.m5544a(imageView)) {
                TextView textView = this.f4709p;
                if (textView == null) {
                    C3370k.m12230d("titleView");
                    throw null;
                } else if (C1107f.m5544a(textView)) {
                    return true;
                }
            }
            return false;
        }
        C3370k.m12230d("iconView");
        throw null;
    }

    public final ImageView getIconView$com_afollestad_material_dialogs_core() {
        ImageView imageView = this.f4708o;
        if (imageView != null) {
            return imageView;
        }
        C3370k.m12230d("iconView");
        throw null;
    }

    public final TextView getTitleView$com_afollestad_material_dialogs_core() {
        TextView textView = this.f4709p;
        if (textView != null) {
            return textView;
        }
        C3370k.m12230d("titleView");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C3370k.m12227b(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, ((float) getMeasuredHeight()) - ((float) getDividerHeight()), (float) getMeasuredWidth(), (float) getMeasuredHeight(), mo6181a());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C1051i.md_icon_title);
        C3370k.m12223a((Object) findViewById, "findViewById(R.id.md_icon_title)");
        this.f4708o = (ImageView) findViewById;
        View findViewById2 = findViewById(C1051i.md_text_title);
        C3370k.m12223a((Object) findViewById2, "findViewById(R.id.md_text_title)");
        this.f4709p = (TextView) findViewById2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (!mo6172b()) {
            int i11 = this.f4703j;
            int measuredHeight = getMeasuredHeight() - this.f4704k;
            int i12 = measuredHeight - ((measuredHeight - i11) / 2);
            TextView textView = this.f4709p;
            if (textView != null) {
                int measuredHeight2 = textView.getMeasuredHeight() / 2;
                int i13 = i12 - measuredHeight2;
                int i14 = measuredHeight2 + i12;
                if (C1107f.m5546b(this)) {
                    i6 = getMeasuredWidth() - this.f4705l;
                    TextView textView2 = this.f4709p;
                    if (textView2 != null) {
                        i5 = i6 - textView2.getMeasuredWidth();
                    } else {
                        C3370k.m12230d("titleView");
                        throw null;
                    }
                } else {
                    i5 = this.f4705l;
                    TextView textView3 = this.f4709p;
                    if (textView3 != null) {
                        i6 = textView3.getMeasuredWidth() + i5;
                    } else {
                        C3370k.m12230d("titleView");
                        throw null;
                    }
                }
                ImageView imageView = this.f4708o;
                if (imageView != null) {
                    if (C1107f.m5547c(imageView)) {
                        ImageView imageView2 = this.f4708o;
                        if (imageView2 != null) {
                            int measuredHeight3 = imageView2.getMeasuredHeight() / 2;
                            int i15 = i12 - measuredHeight3;
                            int i16 = i12 + measuredHeight3;
                            if (C1107f.m5546b(this)) {
                                ImageView imageView3 = this.f4708o;
                                if (imageView3 != null) {
                                    int measuredWidth = i6 - imageView3.getMeasuredWidth();
                                    int i17 = measuredWidth - this.f4706m;
                                    TextView textView4 = this.f4709p;
                                    if (textView4 != null) {
                                        int measuredWidth2 = i17 - textView4.getMeasuredWidth();
                                        i7 = i6;
                                        i9 = i17;
                                        i8 = measuredWidth;
                                        i10 = measuredWidth2;
                                    } else {
                                        C3370k.m12230d("titleView");
                                        throw null;
                                    }
                                } else {
                                    C3370k.m12230d("iconView");
                                    throw null;
                                }
                            } else {
                                ImageView imageView4 = this.f4708o;
                                if (imageView4 != null) {
                                    int measuredWidth3 = imageView4.getMeasuredWidth() + i5;
                                    int i18 = this.f4706m + measuredWidth3;
                                    TextView textView5 = this.f4709p;
                                    if (textView5 != null) {
                                        int measuredWidth4 = textView5.getMeasuredWidth() + i18;
                                        i7 = measuredWidth3;
                                        i9 = measuredWidth4;
                                        int i19 = i18;
                                        i8 = i5;
                                        i10 = i19;
                                    } else {
                                        C3370k.m12230d("titleView");
                                        throw null;
                                    }
                                } else {
                                    C3370k.m12230d("iconView");
                                    throw null;
                                }
                            }
                            ImageView imageView5 = this.f4708o;
                            if (imageView5 != null) {
                                imageView5.layout(i8, i15, i7, i16);
                            } else {
                                C3370k.m12230d("iconView");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("iconView");
                            throw null;
                        }
                    }
                    TextView textView6 = this.f4709p;
                    if (textView6 != null) {
                        textView6.layout(i5, i13, i6, i14);
                    } else {
                        C3370k.m12230d("titleView");
                        throw null;
                    }
                } else {
                    C3370k.m12230d("iconView");
                    throw null;
                }
            } else {
                C3370k.m12230d("titleView");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (mo6172b()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = size - (this.f4705l * 2);
        ImageView imageView = this.f4708o;
        if (imageView != null) {
            if (C1107f.m5547c(imageView)) {
                ImageView imageView2 = this.f4708o;
                if (imageView2 != null) {
                    imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.f4707n, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4707n, 1073741824));
                    ImageView imageView3 = this.f4708o;
                    if (imageView3 != null) {
                        i4 -= imageView3.getMeasuredWidth() + this.f4706m;
                    } else {
                        C3370k.m12230d("iconView");
                        throw null;
                    }
                } else {
                    C3370k.m12230d("iconView");
                    throw null;
                }
            }
            TextView textView = this.f4709p;
            if (textView != null) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(i4, RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(0, 0));
                ImageView imageView4 = this.f4708o;
                if (imageView4 != null) {
                    if (C1107f.m5547c(imageView4)) {
                        ImageView imageView5 = this.f4708o;
                        if (imageView5 != null) {
                            i3 = imageView5.getMeasuredHeight();
                        } else {
                            C3370k.m12230d("iconView");
                            throw null;
                        }
                    }
                    TextView textView2 = this.f4709p;
                    if (textView2 != null) {
                        setMeasuredDimension(size, Math.max(i3, textView2.getMeasuredHeight()) + this.f4703j + this.f4704k);
                    } else {
                        C3370k.m12230d("titleView");
                        throw null;
                    }
                } else {
                    C3370k.m12230d("iconView");
                    throw null;
                }
            } else {
                C3370k.m12230d("titleView");
                throw null;
            }
        } else {
            C3370k.m12230d("iconView");
            throw null;
        }
    }

    public final void setIconView$com_afollestad_material_dialogs_core(ImageView imageView) {
        C3370k.m12227b(imageView, "<set-?>");
        this.f4708o = imageView;
    }

    public final void setTitleView$com_afollestad_material_dialogs_core(TextView textView) {
        C3370k.m12227b(textView, "<set-?>");
        this.f4709p = textView;
    }
}
