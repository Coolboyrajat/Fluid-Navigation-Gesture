package com.afollestad.materialdialogs.color.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p006b.p026g.p035k.C0890v;
import p054c.p055a.p056a.p060q.C1077i;
import p054c.p055a.p056a.p060q.C1078j;
import p054c.p055a.p056a.p060q.C1080l;
import p054c.p055a.p056a.p060q.p061m.C1081a;
import p054c.p055a.p056a.p066v.C1103e;

public final class PreviewFrameView extends FrameLayout {

    /* renamed from: f */
    private View f4639f;

    /* renamed from: g */
    private TextView f4640g;

    /* renamed from: h */
    private ObservableEditText f4641h;

    /* renamed from: i */
    private boolean f4642i;

    /* renamed from: j */
    private C3350b<? super Integer, Boolean> f4643j;

    /* renamed from: k */
    private Integer f4644k;

    /* renamed from: com.afollestad.materialdialogs.color.view.PreviewFrameView$a */
    public static final class C1584a {
        private C1584a() {
        }

        public /* synthetic */ C1584a(C3366g gVar) {
            this();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.view.PreviewFrameView$b */
    static final class C1585b extends C3371l implements C3350b<String, Unit> {

        /* renamed from: g */
        final /* synthetic */ PreviewFrameView f4645g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1585b(PreviewFrameView previewFrameView) {
            super(1);
            this.f4645g = previewFrameView;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo6101a((String) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo6101a(String str) {
            Integer a;
            C3370k.m12227b(str, "it");
            if (str.length() >= 4 && (a = C1081a.m5457a(str)) != null) {
                int intValue = a.intValue();
                if (this.f4645g.getOnHexChanged().mo5146a(Integer.valueOf(intValue)).booleanValue()) {
                    this.f4645g.setColor(intValue);
                }
            }
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.view.PreviewFrameView$c */
    static final class C1586c extends C3371l implements C3350b<Integer, Boolean> {

        /* renamed from: g */
        public static final C1586c f4646g = new C1586c();

        C1586c() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo6102a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        public final boolean mo6102a(int i) {
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.color.view.PreviewFrameView$d */
    static final class C1587d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ PreviewFrameView f4647f;

        C1587d(PreviewFrameView previewFrameView) {
            this.f4647f = previewFrameView;
        }

        public final void run() {
            PreviewFrameView.m6927a(this.f4647f).setSelection(PreviewFrameView.m6927a(this.f4647f).getTextLength());
        }
    }

    static {
        new C1584a((C3366g) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4642i = true;
        this.f4643j = C1586c.f4646g;
        setBackgroundResource(C1077i.transparent_rect_repeat);
        LayoutInflater.from(context).inflate(C1080l.md_color_chooser_preview_frame, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreviewFrameView(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    private final int m6926a(int i) {
        return (!C1103e.m5520a(C1103e.f3789a, i, 0.0d, 1, (Object) null) || Color.alpha(i) < 50) ? -16777216 : -1;
    }

    /* renamed from: a */
    public static final /* synthetic */ ObservableEditText m6927a(PreviewFrameView previewFrameView) {
        ObservableEditText observableEditText = previewFrameView.f4641h;
        if (observableEditText != null) {
            return observableEditText;
        }
        C3370k.m12230d("hexValueView");
        throw null;
    }

    public final Integer getColor() {
        return this.f4644k;
    }

    public final C3350b<Integer, Boolean> getOnHexChanged() {
        return this.f4643j;
    }

    public final boolean getSupportCustomAlpha() {
        return this.f4642i;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C1078j.argbView);
        C3370k.m12223a((Object) findViewById, "findViewById(R.id.argbView)");
        this.f4639f = findViewById;
        View findViewById2 = findViewById(C1078j.hexPrefixView);
        C3370k.m12223a((Object) findViewById2, "findViewById(R.id.hexPrefixView)");
        this.f4640g = (TextView) findViewById2;
        View findViewById3 = findViewById(C1078j.hexValueView);
        C3370k.m12223a((Object) findViewById3, "findViewById(R.id.hexValueView)");
        this.f4641h = (ObservableEditText) findViewById3;
        ObservableEditText observableEditText = this.f4641h;
        if (observableEditText != null) {
            observableEditText.mo6079a((C3350b<? super String, Unit>) new C1585b(this));
        } else {
            C3370k.m12230d("hexValueView");
            throw null;
        }
    }

    public final void setColor(int i) {
        Integer num = this.f4644k;
        if (num == null || num.intValue() != i) {
            this.f4644k = Integer.valueOf(i);
            View view = this.f4639f;
            if (view != null) {
                view.setBackground(new ColorDrawable(i));
                ObservableEditText observableEditText = this.f4641h;
                if (observableEditText != null) {
                    observableEditText.mo6078a((CharSequence) C1081a.m5458a(i, this.f4642i));
                    ObservableEditText observableEditText2 = this.f4641h;
                    if (observableEditText2 != null) {
                        observableEditText2.post(new C1587d(this));
                        int a = m6926a(i);
                        TextView textView = this.f4640g;
                        if (textView != null) {
                            textView.setTextColor(a);
                            ObservableEditText observableEditText3 = this.f4641h;
                            if (observableEditText3 != null) {
                                observableEditText3.setTextColor(a);
                                ObservableEditText observableEditText4 = this.f4641h;
                                if (observableEditText4 != null) {
                                    C0890v.m4748a((View) observableEditText4, ColorStateList.valueOf(a));
                                } else {
                                    C3370k.m12230d("hexValueView");
                                    throw null;
                                }
                            } else {
                                C3370k.m12230d("hexValueView");
                                throw null;
                            }
                        } else {
                            C3370k.m12230d("hexPrefixView");
                            throw null;
                        }
                    } else {
                        C3370k.m12230d("hexValueView");
                        throw null;
                    }
                } else {
                    C3370k.m12230d("hexValueView");
                    throw null;
                }
            } else {
                C3370k.m12230d("argbView");
                throw null;
            }
        }
    }

    public final void setOnHexChanged(C3350b<? super Integer, Boolean> bVar) {
        C3370k.m12227b(bVar, "<set-?>");
        this.f4643j = bVar;
    }

    public final void setSupportCustomAlpha(boolean z) {
        this.f4642i = z;
    }
}
