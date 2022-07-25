package p054c.p055a.p056a.p060q;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import com.afollestad.materialdialogs.color.view.ObservableSeekBar;
import com.afollestad.materialdialogs.color.view.PreviewFrameView;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.p066v.C1103e;

/* renamed from: c.a.a.q.e */
public final class C1066e {

    /* renamed from: a */
    private final PreviewFrameView f3737a;

    /* renamed from: b */
    private final TextView f3738b;

    /* renamed from: c */
    private final ObservableSeekBar f3739c;

    /* renamed from: d */
    private final TextView f3740d;

    /* renamed from: e */
    private final TextView f3741e;

    /* renamed from: f */
    private final ObservableSeekBar f3742f;

    /* renamed from: g */
    private final TextView f3743g;

    /* renamed from: h */
    private final ObservableSeekBar f3744h;

    /* renamed from: i */
    private final TextView f3745i;

    /* renamed from: j */
    private final ObservableSeekBar f3746j;

    /* renamed from: k */
    private final TextView f3747k;

    /* renamed from: l */
    private final C1041c f3748l;

    public C1066e(C1041c cVar) {
        C3370k.m12227b(cVar, "dialog");
        this.f3748l = cVar;
        View a = C1067f.m5425b(this.f3748l);
        if (a != null) {
            View findViewById = a.findViewById(C1078j.preview_frame);
            C3370k.m12223a((Object) findViewById, "customPage.findViewById(R.id.preview_frame)");
            this.f3737a = (PreviewFrameView) findViewById;
            View findViewById2 = a.findViewById(C1078j.alpha_label);
            C3370k.m12223a((Object) findViewById2, "customPage.findViewById(R.id.alpha_label)");
            this.f3738b = (TextView) findViewById2;
            View findViewById3 = a.findViewById(C1078j.alpha_seeker);
            C3370k.m12223a((Object) findViewById3, "customPage.findViewById(R.id.alpha_seeker)");
            this.f3739c = (ObservableSeekBar) findViewById3;
            View findViewById4 = a.findViewById(C1078j.alpha_value);
            C3370k.m12223a((Object) findViewById4, "customPage.findViewById(R.id.alpha_value)");
            this.f3740d = (TextView) findViewById4;
            View findViewById5 = a.findViewById(C1078j.red_label);
            C3370k.m12223a((Object) findViewById5, "customPage.findViewById(R.id.red_label)");
            this.f3741e = (TextView) findViewById5;
            View findViewById6 = a.findViewById(C1078j.red_seeker);
            C3370k.m12223a((Object) findViewById6, "customPage.findViewById(R.id.red_seeker)");
            this.f3742f = (ObservableSeekBar) findViewById6;
            View findViewById7 = a.findViewById(C1078j.red_value);
            C3370k.m12223a((Object) findViewById7, "customPage.findViewById(R.id.red_value)");
            this.f3743g = (TextView) findViewById7;
            View findViewById8 = a.findViewById(C1078j.green_label);
            C3370k.m12223a((Object) findViewById8, "customPage.findViewById(R.id.green_label)");
            TextView textView = (TextView) findViewById8;
            View findViewById9 = a.findViewById(C1078j.green_seeker);
            C3370k.m12223a((Object) findViewById9, "customPage.findViewById(R.id.green_seeker)");
            this.f3744h = (ObservableSeekBar) findViewById9;
            View findViewById10 = a.findViewById(C1078j.green_value);
            C3370k.m12223a((Object) findViewById10, "customPage.findViewById(R.id.green_value)");
            this.f3745i = (TextView) findViewById10;
            View findViewById11 = a.findViewById(C1078j.blue_label);
            C3370k.m12223a((Object) findViewById11, "customPage.findViewById(R.id.blue_label)");
            TextView textView2 = (TextView) findViewById11;
            View findViewById12 = a.findViewById(C1078j.blue_seeker);
            C3370k.m12223a((Object) findViewById12, "customPage.findViewById(R.id.blue_seeker)");
            this.f3746j = (ObservableSeekBar) findViewById12;
            View findViewById13 = a.findViewById(C1078j.blue_value);
            C3370k.m12223a((Object) findViewById13, "customPage.findViewById(R.id.blue_value)");
            this.f3747k = (TextView) findViewById13;
            return;
        }
        throw new IllegalArgumentException("Page custom view is null");
    }

    /* renamed from: c */
    private final void m5409c(int i) {
        ObservableSeekBar.m6920a(this.f3746j, i, false, 2, (Object) null);
        this.f3747k.setText(String.valueOf(i));
    }

    /* renamed from: d */
    private final void m5410d(int i) {
        ObservableSeekBar.m6920a(this.f3744h, i, false, 2, (Object) null);
        this.f3745i.setText(String.valueOf(i));
    }

    /* renamed from: e */
    private final void m5411e(int i) {
        ObservableSeekBar.m6920a(this.f3742f, i, false, 2, (Object) null);
        this.f3743g.setText(String.valueOf(i));
    }

    /* renamed from: a */
    public final TextView mo5135a() {
        return this.f3738b;
    }

    /* renamed from: a */
    public final void mo5136a(int i) {
        ObservableSeekBar.m6920a(this.f3739c, i, false, 2, (Object) null);
        this.f3740d.setText(String.valueOf(i));
    }

    /* renamed from: b */
    public final ObservableSeekBar mo5137b() {
        return this.f3739c;
    }

    /* renamed from: b */
    public final void mo5138b(int i) {
        mo5136a(Color.alpha(i));
        m5411e(Color.red(i));
        m5409c(Color.blue(i));
        m5410d(Color.green(i));
        this.f3737a.setColor(i);
    }

    /* renamed from: c */
    public final TextView mo5139c() {
        return this.f3740d;
    }

    /* renamed from: d */
    public final ObservableSeekBar mo5140d() {
        return this.f3746j;
    }

    /* renamed from: e */
    public final ObservableSeekBar mo5141e() {
        return this.f3744h;
    }

    /* renamed from: f */
    public final PreviewFrameView mo5142f() {
        return this.f3737a;
    }

    /* renamed from: g */
    public final TextView mo5143g() {
        return this.f3741e;
    }

    /* renamed from: h */
    public final ObservableSeekBar mo5144h() {
        return this.f3742f;
    }

    /* renamed from: i */
    public final C1066e mo5145i() {
        C1067f.m5426b(this.f3739c, C1103e.m5515a(C1103e.f3789a, this.f3748l.mo5117i(), (Integer) null, (Integer) 16842808, (C3349a) null, 10, (Object) null));
        C1067f.m5426b(this.f3742f, -65536);
        C1067f.m5426b(this.f3744h, -16711936);
        C1067f.m5426b(this.f3746j, -16776961);
        return this;
    }
}
