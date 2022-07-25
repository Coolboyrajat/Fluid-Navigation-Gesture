package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.i */
public class C2678i extends ImageButton {

    /* renamed from: f */
    private int f7092f;

    /* renamed from: a */
    public final void mo8559a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f7092f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7092f;
    }

    public void setVisibility(int i) {
        mo8559a(i, true);
    }
}
