package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C0605l;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p006b.p026g.p034j.C0833d;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.C1174g;
import p054c.p083e.p084a.p085a.C1175h;
import p054c.p083e.p084a.p085a.C1176i;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: com.google.android.material.datepicker.h */
public final class C2609h<S> extends C2629n<S> {

    /* renamed from: m0 */
    static final Object f6839m0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n0 */
    static final Object f6840n0 = "NAVIGATION_PREV_TAG";

    /* renamed from: o0 */
    static final Object f6841o0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: p0 */
    static final Object f6842p0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0 */
    private int f6843c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C2606e<S> f6844d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C2600a f6845e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C2622j f6846f0;

    /* renamed from: g0 */
    private C2619j f6847g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2604c f6848h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public RecyclerView f6849i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public RecyclerView f6850j0;

    /* renamed from: k0 */
    private View f6851k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public View f6852l0;

    /* renamed from: com.google.android.material.datepicker.h$a */
    class C2610a extends C0838a {
        C2610a(C2609h hVar) {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4587a((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    class C2611b extends LinearLayoutManager {

        /* renamed from: N */
        final /* synthetic */ int f6853N;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2611b(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f6853N = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2798a(RecyclerView.C0518a0 a0Var, int[] iArr) {
            if (this.f6853N == 0) {
                iArr[0] = C2609h.this.f6850j0.getWidth();
                iArr[1] = C2609h.this.f6850j0.getWidth();
                return;
            }
            iArr[0] = C2609h.this.f6850j0.getHeight();
            iArr[1] = C2609h.this.f6850j0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    class C2612c implements C2620k {
        C2612c() {
        }

        /* renamed from: a */
        public void mo8253a(long j) {
            if (C2609h.this.f6845e0.mo8226q().mo8235a(j)) {
                C2609h.this.f6844d0.mo8239b(j);
                Iterator it = C2609h.this.f6890b0.iterator();
                while (it.hasNext()) {
                    ((C2628m) it.next()).mo8288a(C2609h.this.f6844d0.mo8240n());
                }
                C2609h.this.f6850j0.getAdapter().mo3128e();
                if (C2609h.this.f6849i0 != null) {
                    C2609h.this.f6849i0.getAdapter().mo3128e();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    class C2613d extends RecyclerView.C0537n {

        /* renamed from: a */
        private final Calendar f6856a = Calendar.getInstance();

        /* renamed from: b */
        private final Calendar f6857b = Calendar.getInstance();

        C2613d() {
        }

        /* renamed from: a */
        public void mo3170a(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0518a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof C2630o) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C2630o oVar = (C2630o) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C0833d next : C2609h.this.f6844d0.mo8241o()) {
                    F f = next.f3245a;
                    if (!(f == null || next.f3246b == null)) {
                        this.f6856a.setTimeInMillis(((Long) f).longValue());
                        this.f6857b.setTimeInMillis(((Long) next.f3246b).longValue());
                        int d = oVar.mo8290d(this.f6856a.get(1));
                        int d2 = oVar.mo8290d(this.f6857b.get(1));
                        View e = gridLayoutManager.mo2809e(d);
                        View e2 = gridLayoutManager.mo2809e(d2);
                        int N = d / gridLayoutManager.mo2740N();
                        int N2 = d2 / gridLayoutManager.mo2740N();
                        int i = N;
                        while (i <= N2) {
                            View e3 = gridLayoutManager.mo2809e(gridLayoutManager.mo2740N() * i);
                            if (e3 != null) {
                                canvas.drawRect((float) (i == N ? e.getLeft() + (e.getWidth() / 2) : 0), (float) (e3.getTop() + C2609h.this.f6848h0.f6830d.mo8238b()), (float) (i == N2 ? e2.getLeft() + (e2.getWidth() / 2) : recyclerView.getWidth()), (float) (e3.getBottom() - C2609h.this.f6848h0.f6830d.mo8236a()), C2609h.this.f6848h0.f6834h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$e */
    class C2614e extends C0838a {
        C2614e() {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            C2609h hVar;
            int i;
            super.mo2093a(view, cVar);
            if (C2609h.this.f6852l0.getVisibility() == 0) {
                hVar = C2609h.this;
                i = C1176i.mtrl_picker_toggle_to_year_selection;
            } else {
                hVar = C2609h.this;
                i = C1176i.mtrl_picker_toggle_to_day_selection;
            }
            cVar.mo4603d((CharSequence) hVar.mo2224a(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$f */
    class C2615f extends RecyclerView.C0547t {

        /* renamed from: a */
        final /* synthetic */ C2625l f6860a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f6861b;

        C2615f(C2625l lVar, MaterialButton materialButton) {
            this.f6860a = lVar;
            this.f6861b = materialButton;
        }

        /* renamed from: a */
        public void mo3289a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f6861b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(PropertyFlags.INDEX_HASH);
                }
            }
        }

        /* renamed from: a */
        public void mo3290a(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager G0 = C2609h.this.mo8249G0();
            int G = i < 0 ? G0.mo2783G() : G0.mo2785I();
            C2622j unused = C2609h.this.f6846f0 = this.f6860a.mo8285d(G);
            this.f6861b.setText(this.f6860a.mo8286e(G));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$g */
    class C2616g implements View.OnClickListener {
        C2616g() {
        }

        public void onClick(View view) {
            C2609h.this.mo8250H0();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    class C2617h implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2625l f6864f;

        C2617h(C2625l lVar) {
            this.f6864f = lVar;
        }

        public void onClick(View view) {
            int G = C2609h.this.mo8249G0().mo2783G() + 1;
            if (G < C2609h.this.f6850j0.getAdapter().mo3114b()) {
                C2609h.this.mo8252a(this.f6864f.mo8285d(G));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$i */
    class C2618i implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2625l f6866f;

        C2618i(C2625l lVar) {
            this.f6866f = lVar;
        }

        public void onClick(View view) {
            int I = C2609h.this.mo8249G0().mo2785I() - 1;
            if (I >= 0) {
                C2609h.this.mo8252a(this.f6866f.mo8285d(I));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$j */
    enum C2619j {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.h$k */
    interface C2620k {
        /* renamed from: a */
        void mo8253a(long j);
    }

    /* renamed from: I0 */
    private RecyclerView.C0537n m10269I0() {
        return new C2613d();
    }

    /* renamed from: a */
    private void m10272a(View view, C2625l lVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C1173f.month_navigation_fragment_toggle);
        materialButton.setTag(f6842p0);
        C0890v.m4752a((View) materialButton, (C0838a) new C2614e());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C1173f.month_navigation_previous);
        materialButton2.setTag(f6840n0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C1173f.month_navigation_next);
        materialButton3.setTag(f6841o0);
        this.f6851k0 = view.findViewById(C1173f.mtrl_calendar_year_selector_frame);
        this.f6852l0 = view.findViewById(C1173f.mtrl_calendar_day_selector_frame);
        mo8251a(C2619j.DAY);
        materialButton.setText(this.f6846f0.mo8266r());
        this.f6850j0.addOnScrollListener(new C2615f(lVar, materialButton));
        materialButton.setOnClickListener(new C2616g());
        materialButton3.setOnClickListener(new C2617h(lVar));
        materialButton2.setOnClickListener(new C2618i(lVar));
    }

    /* renamed from: b */
    static int m10273b(Context context) {
        return context.getResources().getDimensionPixelSize(C1171d.mtrl_calendar_day_height);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public C2600a mo2351C0() {
        return this.f6845e0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public C2604c mo6873D0() {
        return this.f6848h0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public C2622j mo8247E0() {
        return this.f6846f0;
    }

    /* renamed from: F0 */
    public C2606e<S> mo8248F0() {
        return this.f6844d0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G0 */
    public LinearLayoutManager mo8249G0() {
        return (LinearLayoutManager) this.f6850j0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void mo8250H0() {
        C2619j jVar;
        C2619j jVar2 = this.f6847g0;
        if (jVar2 == C2619j.YEAR) {
            jVar = C2619j.DAY;
        } else if (jVar2 == C2619j.DAY) {
            jVar = C2619j.YEAR;
        } else {
            return;
        }
        mo8251a(jVar);
    }

    /* renamed from: a */
    public View mo2221a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo2194B(), this.f6843c0);
        this.f6848h0 = new C2604c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C2622j u = this.f6845e0.mo8230u();
        if (C2621i.m10298b(contextThemeWrapper)) {
            i2 = C1175h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C1175h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C1173f.mtrl_calendar_days_of_week);
        C0890v.m4752a((View) gridView, (C0838a) new C2610a(this));
        gridView.setAdapter(new C2608g());
        gridView.setNumColumns(u.f6875j);
        gridView.setEnabled(false);
        this.f6850j0 = (RecyclerView) inflate.findViewById(C1173f.mtrl_calendar_months);
        this.f6850j0.setLayoutManager(new C2611b(mo2194B(), i, false, i));
        this.f6850j0.setTag(f6839m0);
        C2625l lVar = new C2625l(contextThemeWrapper, this.f6844d0, this.f6845e0, new C2612c());
        this.f6850j0.setAdapter(lVar);
        int integer = contextThemeWrapper.getResources().getInteger(C1174g.mtrl_calendar_year_selector_span);
        this.f6849i0 = (RecyclerView) inflate.findViewById(C1173f.mtrl_calendar_year_selector_frame);
        RecyclerView recyclerView = this.f6849i0;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f6849i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f6849i0.setAdapter(new C2630o(this));
            this.f6849i0.addItemDecoration(m10269I0());
        }
        if (inflate.findViewById(C1173f.month_navigation_fragment_toggle) != null) {
            m10272a(inflate, lVar);
        }
        if (!C2621i.m10298b(contextThemeWrapper)) {
            new C0605l().mo3602a(this.f6850j0);
        }
        this.f6850j0.scrollToPosition(lVar.mo8283a(this.f6846f0));
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8251a(C2619j jVar) {
        this.f6847g0 = jVar;
        if (jVar == C2619j.YEAR) {
            this.f6849i0.getLayoutManager().mo2812k(((C2630o) this.f6849i0.getAdapter()).mo8290d(this.f6846f0.f6874i));
            this.f6851k0.setVisibility(0);
            this.f6852l0.setVisibility(8);
        } else if (jVar == C2619j.DAY) {
            this.f6851k0.setVisibility(8);
            this.f6852l0.setVisibility(0);
            mo8252a(this.f6846f0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8252a(C2622j jVar) {
        RecyclerView recyclerView;
        int i;
        C2625l lVar = (C2625l) this.f6850j0.getAdapter();
        int a = lVar.mo8283a(jVar);
        int a2 = a - lVar.mo8283a(this.f6846f0);
        boolean z = true;
        boolean z2 = Math.abs(a2) > 3;
        if (a2 <= 0) {
            z = false;
        }
        this.f6846f0 = jVar;
        if (!z2 || !z) {
            recyclerView = this.f6850j0;
            if (z2) {
                i = a + 3;
            }
            recyclerView.smoothScrollToPosition(a);
        }
        recyclerView = this.f6850j0;
        i = a - 3;
        recyclerView.scrollToPosition(i);
        recyclerView = this.f6850j0;
        recyclerView.smoothScrollToPosition(a);
    }

    /* renamed from: c */
    public void mo2256c(Bundle bundle) {
        super.mo2256c(bundle);
        if (bundle == null) {
            bundle = mo2314z();
        }
        this.f6843c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6844d0 = (C2606e) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6845e0 = (C2600a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6846f0 = (C2622j) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: e */
    public void mo2267e(Bundle bundle) {
        super.mo2267e(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f6843c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6844d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6845e0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6846f0);
    }
}
