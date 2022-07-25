package com.p131fb.fluid.p148ui.p149g.p152c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.p148ui.views.PreferenceView;
import kotlin.Unit;
import kotlin.p192b0.C3204e;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3352d;
import kotlin.p205x.p207d.C3368i;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3384y;
import p054c.p055a.p067b.C1108a;
import p054c.p055a.p067b.C1114e;
import p054c.p055a.p067b.p068f.C1116a;
import p054c.p055a.p067b.p071i.C1139b;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.g.c.y */
public final class C2487y {

    /* renamed from: com.fb.fluid.ui.g.c.y$a */
    static final /* synthetic */ class C2488a extends C3368i implements C3350b<View, C2485w> {

        /* renamed from: j */
        public static final C2488a f6278j = new C2488a();

        C2488a() {
            super(1);
        }

        /* renamed from: a */
        public final C2485w mo5146a(View view) {
            C3370k.m12227b(view, "p1");
            return new C2485w(view);
        }

        /* renamed from: b */
        public final String mo6062b() {
            return "<init>";
        }

        /* renamed from: h */
        public final C3204e mo6063h() {
            return C3384y.m12254a(C2485w.class);
        }

        /* renamed from: j */
        public final String mo6064j() {
            return "<init>(Landroid/view/View;)V";
        }
    }

    /* renamed from: com.fb.fluid.ui.g.c.y$b */
    static final class C2489b extends C3371l implements C3352d<C2485w, Integer, C2486x<Object>, Unit> {

        /* renamed from: g */
        final /* synthetic */ C1139b f6279g;

        /* renamed from: com.fb.fluid.ui.g.c.y$b$a */
        public static final class C2490a implements SeekBar.OnSeekBarChangeListener {

            /* renamed from: a */
            final /* synthetic */ C2489b f6280a;

            /* renamed from: b */
            final /* synthetic */ C2486x f6281b;

            /* renamed from: c */
            final /* synthetic */ C3350b f6282c;

            C2490a(C2489b bVar, C2485w wVar, C2486x xVar, boolean z, C3350b bVar2) {
                this.f6280a = bVar;
                this.f6281b = xVar;
                this.f6282c = bVar2;
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C3370k.m12227b(seekBar, "it");
                Object obj = this.f6281b.mo7354p().get(i);
                C3352d n = this.f6281b.mo7352n();
                if (n != null) {
                    Unit unit = (Unit) n.mo6842a(this.f6281b, true, obj);
                }
                C2472t.m9230a((C2472t) this.f6281b, obj, (C1116a) this.f6280a.f6279g.mo5236d(), false, 4, (Object) null);
                this.f6282c.mo5146a(String.valueOf(obj));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                C3370k.m12227b(seekBar, "it");
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                C3370k.m12227b(seekBar, "it");
                Object obj = this.f6281b.mo7354p().get(seekBar.getProgress());
                C3352d n = this.f6281b.mo7352n();
                if (n != null) {
                    Unit unit = (Unit) n.mo6842a(this.f6281b, false, obj);
                }
                this.f6282c.mo5146a(String.valueOf(obj));
            }
        }

        /* renamed from: com.fb.fluid.ui.g.c.y$b$b */
        static final class C2491b extends C3371l implements C3350b<String, Unit> {

            /* renamed from: g */
            final /* synthetic */ C2485w f6283g;

            /* renamed from: h */
            final /* synthetic */ boolean f6284h;

            /* renamed from: i */
            final /* synthetic */ C2486x f6285i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2491b(C2485w wVar, boolean z, C2486x xVar) {
                super(1);
                this.f6283g = wVar;
                this.f6284h = z;
                this.f6285i = xVar;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
                mo7360a((String) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo7360a(String str) {
                C3370k.m12227b(str, "valueStr");
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f6283g.mo7348C().mo7402b(C1718g.widget_end_description);
                appCompatTextView.setAlpha(this.f6284h ? 1.0f : 0.5f);
                if (!this.f6285i.mo7353o()) {
                    C2486x xVar = this.f6285i;
                    Context context = appCompatTextView.getContext();
                    C3370k.m12223a((Object) context, "context");
                    str = xVar.mo7326a(context);
                }
                appCompatTextView.setText(str);
                CharSequence text = appCompatTextView.getText();
                int i = 0;
                if (text == null || text.length() == 0) {
                    i = 8;
                }
                appCompatTextView.setVisibility(i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2489b(C1139b bVar) {
            super(3);
            this.f6279g = bVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6842a(Object obj, Object obj2, Object obj3) {
            mo7356a((C2485w) obj, ((Number) obj2).intValue(), (C2486x<Object>) (C2486x) obj3);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo7356a(C2485w wVar, int i, C2486x<Object> xVar) {
            Drawable drawable;
            C2485w wVar2 = wVar;
            C2486x<Object> xVar2 = xVar;
            C3370k.m12227b(wVar, "$receiver");
            C3370k.m12227b(xVar2, "item");
            C2479v.m9276a(wVar, (C3350b) null, i, xVar, 1, (Object) null);
            PreferenceView.m9367a(wVar.mo7348C(), (String) null, 0, false, 7, (Object) null);
            boolean k = xVar.mo7342k();
            C2491b bVar = new C2491b(wVar, k, xVar2);
            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) wVar.mo7348C().mo7402b(C1718g.widget_slider);
            if (Build.VERSION.SDK_INT >= 24) {
                if (xVar.mo7351m()) {
                    View view = wVar2.f2168f;
                    C3370k.m12223a((Object) view, "itemView");
                    Resources resources = view.getResources();
                    View view2 = wVar2.f2168f;
                    C3370k.m12223a((Object) view2, "itemView");
                    Context context = view2.getContext();
                    C3370k.m12223a((Object) context, "itemView.context");
                    drawable = resources.getDrawable(C3148R.C3149drawable.material_seekbar_tick_mark, context.getTheme());
                } else {
                    drawable = null;
                }
                appCompatSeekBar.setTickMark(drawable);
            }
            appCompatSeekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            appCompatSeekBar.setAlpha(k ? 1.0f : 0.5f);
            appCompatSeekBar.setEnabled(k);
            appCompatSeekBar.setVisibility(0);
            appCompatSeekBar.setMax(xVar.mo7354p().size() - 1);
            appCompatSeekBar.setProgress(Math.max(C3292r.m12082a(xVar.mo7354p(), xVar.mo7333c()), 0));
            appCompatSeekBar.setOnSeekBarChangeListener(new C2490a(this, wVar, xVar, k, bVar));
            bVar.mo5146a(String.valueOf(xVar.mo7333c()));
        }
    }

    /* renamed from: a */
    public static final C1108a<C2486x<Object>, C2485w> m9300a(C1114e eVar) {
        C3370k.m12227b(eVar, "$this$withSliderPreferenceItem");
        String name = C2486x.class.getName();
        C3370k.m12223a((Object) name, "SliderPreferenceItem::class.java.name");
        C1139b bVar = new C1139b(eVar, name);
        bVar.mo5186a(C2488a.f6278j, new C2489b(bVar));
        eVar.mo5192a(bVar.mo5238f(), C3148R.layout.item_preference_slider, bVar);
        return bVar;
    }
}
