package com.p131fb.fluid.p148ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0033d;
import androidx.fragment.app.C0411l;
import androidx.fragment.app.C0434p;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.p131fb.fluid.C1718g;
import com.p131fb.fluid.p148ui.p149g.p151b.C2394v;
import com.p131fb.fluid.p148ui.views.InkPageIndicator;
import java.util.HashMap;
import kotlin.p205x.p207d.C3370k;
import p054c.p079d.p080a.p081a.p082a.C1165a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.ActivityIntro */
public final class ActivityIntro extends C0033d {

    /* renamed from: A */
    public static final C1989a f5556A = new C1989a((C3366g) null);

    /* renamed from: x */
    private C1990b f5557x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int[] f5558y;

    /* renamed from: z */
    private HashMap f5559z;

    /* renamed from: com.fb.fluid.ui.ActivityIntro$a */
    public static final class C1989a {
        private C1989a() {
        }

        public /* synthetic */ C1989a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo6839a(Activity activity) {
            C3370k.m12227b(activity, "parent");
            activity.startActivity(new Intent(activity, ActivityIntro.class));
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivityIntro$b */
    public final class C1990b extends C0434p {

        /* renamed from: f */
        final /* synthetic */ ActivityIntro f5560f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1990b(ActivityIntro activityIntro, C0411l lVar) {
            super(lVar, 1);
            C3370k.m12227b(lVar, "fm");
            this.f5560f = activityIntro;
        }

        /* renamed from: a */
        public int mo3754a() {
            int[] a = this.f5560f.f5558y;
            if (a != null) {
                return a.length;
            }
            return 0;
        }

        /* renamed from: b */
        public Fragment mo2577b(int i) {
            int[] a = this.f5560f.f5558y;
            int i2 = a != null ? a[i] : 0;
            if (i2 == 4) {
                return new Fragment();
            }
            C2394v vVar = new C2394v();
            Bundle bundle = new Bundle();
            bundle.putInt("page", i2);
            vVar.mo2290m(bundle);
            return vVar;
        }
    }

    /* renamed from: com.fb.fluid.ui.ActivityIntro$c */
    public static final class C1991c implements ViewPager.C0643j {

        /* renamed from: f */
        final /* synthetic */ ActivityIntro f5561f;

        C1991c(ActivityIntro activityIntro) {
            this.f5561f = activityIntro;
        }

        /* renamed from: a */
        public void mo3741a(int i) {
        }

        /* renamed from: a */
        public void mo3742a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo3743b(int i) {
            int[] a = this.f5561f.f5558y;
            if (i >= (a != null ? a.length : 1) - 1) {
                this.f5561f.finish();
            }
        }
    }

    /* renamed from: d */
    public View mo6838d(int i) {
        if (this.f5559z == null) {
            this.f5559z = new HashMap();
        }
        View view = (View) this.f5559z.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f5559z.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C3148R.layout.activity_intro);
        this.f5558y = new int[]{0, 1, 2, 4};
        C0411l k = mo2364k();
        C3370k.m12223a((Object) k, "supportFragmentManager");
        this.f5557x = new C1990b(this, k);
        ((ViewPager) mo6838d(C1718g.container)).mo3685a((ViewPager.C0643j) new C1991c(this));
        ViewPager viewPager = (ViewPager) mo6838d(C1718g.container);
        C3370k.m12223a((Object) viewPager, "container");
        viewPager.setPageMargin(C1165a.m5734a(16));
        ViewPager viewPager2 = (ViewPager) mo6838d(C1718g.container);
        C3370k.m12223a((Object) viewPager2, "container");
        viewPager2.setAdapter(this.f5557x);
        ((InkPageIndicator) mo6838d(C1718g.page_indicator)).setViewPager((ViewPager) mo6838d(C1718g.container));
    }
}
