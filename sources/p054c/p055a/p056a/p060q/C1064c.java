package p054c.p055a.p056a.p060q;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C0649a;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.a.a.q.c */
public final class C1064c extends C0649a {
    /* renamed from: a */
    public int mo3754a() {
        return 2;
    }

    /* renamed from: a */
    public Object mo2571a(ViewGroup viewGroup, int i) {
        C3370k.m12227b(viewGroup, "collection");
        View findViewById = viewGroup.findViewById(i != 0 ? i != 1 ? 0 : C1078j.colorArgbPage : C1078j.colorPresetGrid);
        C3370k.m12223a((Object) findViewById, "collection.findViewById(resId)");
        return findViewById;
    }

    /* renamed from: a */
    public void mo2574a(ViewGroup viewGroup, int i, Object obj) {
        C3370k.m12227b(viewGroup, "container");
        C3370k.m12227b(obj, "arg1");
    }

    /* renamed from: a */
    public boolean mo2575a(View view, Object obj) {
        C3370k.m12227b(view, "arg0");
        C3370k.m12227b(obj, "arg1");
        return view == ((View) obj);
    }
}
