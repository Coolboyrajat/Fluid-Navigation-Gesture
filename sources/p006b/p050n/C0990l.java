package p006b.p050n;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.n.l */
public class C0990l {

    /* renamed from: a */
    private ViewGroup f3511a;

    /* renamed from: b */
    private Runnable f3512b;

    /* renamed from: a */
    static C0990l m5144a(View view) {
        return (C0990l) view.getTag(C0986j.transition_current_scene);
    }

    /* renamed from: a */
    static void m5145a(View view, C0990l lVar) {
        view.setTag(C0986j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo4888a() {
        Runnable runnable;
        if (m5144a(this.f3511a) == this && (runnable = this.f3512b) != null) {
            runnable.run();
        }
    }
}
