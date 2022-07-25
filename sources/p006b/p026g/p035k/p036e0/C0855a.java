package p006b.p026g.p035k.p036e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: b.g.k.e0.a */
public final class C0855a extends ClickableSpan {

    /* renamed from: f */
    private final int f3287f;

    /* renamed from: g */
    private final C0857c f3288g;

    /* renamed from: h */
    private final int f3289h;

    public C0855a(int i, C0857c cVar, int i2) {
        this.f3287f = i;
        this.f3288g = cVar;
        this.f3289h = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3287f);
        this.f3288g.mo4589a(this.f3289h, bundle);
    }
}
