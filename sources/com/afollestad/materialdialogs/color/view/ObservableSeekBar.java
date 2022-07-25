package com.afollestad.materialdialogs.color.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

public final class ObservableSeekBar extends AppCompatSeekBar {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3350b<? super Integer, Unit> f4634g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f4635h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f4636i;

    /* renamed from: j */
    private final C1583a f4637j;

    /* renamed from: com.afollestad.materialdialogs.color.view.ObservableSeekBar$a */
    public static final class C1583a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ ObservableSeekBar f4638a;

        C1583a(ObservableSeekBar observableSeekBar) {
            this.f4638a = observableSeekBar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C3350b a;
            C3370k.m12227b(seekBar, "seekBar");
            if ((!this.f4638a.f4636i || z) && (a = this.f4638a.f4634g) != null) {
                Unit unit = (Unit) a.mo5146a(Integer.valueOf(i));
            }
            this.f4638a.f4635h = false;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3370k.m12227b(context, "context");
        this.f4637j = new C1583a(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableSeekBar(Context context, AttributeSet attributeSet, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6920a(ObservableSeekBar observableSeekBar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        observableSeekBar.mo6087a(i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6922a(ObservableSeekBar observableSeekBar, boolean z, C3350b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        observableSeekBar.mo6088a(z, (C3350b<? super Integer, Unit>) bVar);
    }

    /* renamed from: a */
    public final void mo6087a(int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            setProgress(i, z);
        } else {
            setProgress(i);
        }
    }

    /* renamed from: a */
    public final void mo6088a(boolean z, C3350b<? super Integer, Unit> bVar) {
        this.f4636i = z;
        this.f4634g = bVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnSeekBarChangeListener(this.f4637j);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        super.onDetachedFromWindow();
    }
}
