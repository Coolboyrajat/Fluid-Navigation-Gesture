package p006b.p026g.p035k;

import android.os.Build;
import android.view.ViewGroup;
import p006b.p026g.C0778b;

/* renamed from: b.g.k.x */
public final class C0900x {
    /* renamed from: a */
    public static boolean m4844a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0778b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0890v.m4797u(viewGroup) == null) ? false : true;
    }
}
