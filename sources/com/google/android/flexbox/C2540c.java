package com.google.android.flexbox;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
public class C2540c {

    /* renamed from: a */
    int f6487a = Integer.MAX_VALUE;

    /* renamed from: b */
    int f6488b = Integer.MAX_VALUE;

    /* renamed from: c */
    int f6489c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    int f6490d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    int f6491e;

    /* renamed from: f */
    int f6492f;

    /* renamed from: g */
    int f6493g;

    /* renamed from: h */
    int f6494h;

    /* renamed from: i */
    int f6495i;

    /* renamed from: j */
    float f6496j;

    /* renamed from: k */
    float f6497k;

    /* renamed from: l */
    int f6498l;

    /* renamed from: m */
    int f6499m;

    /* renamed from: n */
    List<Integer> f6500n = new ArrayList();

    /* renamed from: o */
    int f6501o;

    /* renamed from: p */
    int f6502p;

    C2540c() {
    }

    /* renamed from: a */
    public int mo7648a() {
        return this.f6493g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7649a(View view, int i, int i2, int i3, int i4) {
        C2539b bVar = (C2539b) view.getLayoutParams();
        this.f6487a = Math.min(this.f6487a, (view.getLeft() - bVar.mo7618i()) - i);
        this.f6488b = Math.min(this.f6488b, (view.getTop() - bVar.mo7622m()) - i2);
        this.f6489c = Math.max(this.f6489c, view.getRight() + bVar.mo7606a() + i3);
        this.f6490d = Math.max(this.f6490d, view.getBottom() + bVar.mo7613g() + i4);
    }

    /* renamed from: b */
    public int mo7650b() {
        return this.f6494h;
    }

    /* renamed from: c */
    public int mo7651c() {
        return this.f6494h - this.f6495i;
    }
}
