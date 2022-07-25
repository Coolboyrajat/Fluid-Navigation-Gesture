package p054c.p055a.p056a.p060q.p061m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.a.q.m.b */
public final class C1082b {

    /* renamed from: c.a.a.q.m.b$a */
    public static final class C1083a implements ViewPager.C0643j {

        /* renamed from: f */
        final /* synthetic */ C3350b f3771f;

        C1083a(C3350b bVar) {
            this.f3771f = bVar;
        }

        /* renamed from: a */
        public void mo3741a(int i) {
        }

        /* renamed from: a */
        public void mo3742a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo3743b(int i) {
            this.f3771f.mo5146a(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static final void m5459a(View view) {
        C3370k.m12227b(view, "$this$clearTopMargin");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            view.setLayoutParams(marginLayoutParams);
            view.getParent().requestLayout();
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public static final void m5460a(View view, int i) {
        C3370k.m12227b(view, "$this$below");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, i);
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final <T extends View> void m5461a(T t, boolean z) {
        C3370k.m12227b(t, "$this$setVisibleOrGone");
        t.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a */
    public static final void m5462a(ViewPager viewPager, C3350b<? super Integer, Unit> bVar) {
        C3370k.m12227b(viewPager, "$this$onPageSelected");
        C3370k.m12227b(bVar, "selection");
        viewPager.mo3685a((ViewPager.C0643j) new C1083a(bVar));
    }

    /* renamed from: b */
    public static final void m5463b(View view, int i) {
        C3370k.m12227b(view, "$this$changeHeight");
        if (i == 0) {
            view.setVisibility(4);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = i;
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C3269p("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
