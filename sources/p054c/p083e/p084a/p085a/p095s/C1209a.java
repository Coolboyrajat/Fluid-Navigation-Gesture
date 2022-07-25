package p054c.p083e.p084a.p085a.p095s;

import android.content.Context;
import android.view.View;
import com.google.android.material.internal.C2673h;
import p006b.p026g.p027d.C0780a;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p054c.p083e.p084a.p085a.p099w.C1217b;

/* renamed from: c.e.a.a.s.a */
public class C1209a {

    /* renamed from: a */
    private final boolean f3961a;

    /* renamed from: b */
    private final int f3962b;

    /* renamed from: c */
    private final int f3963c;

    /* renamed from: d */
    private final float f3964d;

    public C1209a(Context context) {
        this.f3961a = C1217b.m5858a(context, C1169b.elevationOverlayEnabled, false);
        this.f3962b = C1207a.m5826a(context, C1169b.elevationOverlayColor, 0);
        this.f3963c = C1207a.m5826a(context, C1169b.colorSurface, 0);
        this.f3964d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private boolean m5832a(int i) {
        return C0780a.m4354c(i, 255) == this.f3963c;
    }

    /* renamed from: a */
    public float mo5438a(float f) {
        float f2 = this.f3964d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: a */
    public float mo5439a(View view) {
        return C2673h.m10592a(view);
    }

    /* renamed from: a */
    public int mo5440a(int i, float f) {
        return mo5441a(i, f, (View) null);
    }

    /* renamed from: a */
    public int mo5441a(int i, float f, View view) {
        if (view != null) {
            f += mo5439a(view);
        }
        return C1207a.m5825a(i, this.f3962b, mo5438a(f));
    }

    /* renamed from: a */
    public boolean mo5442a() {
        return this.f3961a;
    }

    /* renamed from: b */
    public int mo5443b(int i, float f) {
        return mo5444b(i, f, (View) null);
    }

    /* renamed from: b */
    public int mo5444b(int i, float f, View view) {
        if (view != null) {
            f += mo5439a(view);
        }
        return (!this.f3961a || !m5832a(i)) ? i : mo5440a(i, f);
    }
}
