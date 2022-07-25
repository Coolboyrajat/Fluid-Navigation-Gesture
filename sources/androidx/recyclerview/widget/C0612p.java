package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.p036e0.C0857c;

/* renamed from: androidx.recyclerview.widget.p */
public class C0612p extends C0838a {

    /* renamed from: d */
    final RecyclerView f2483d;

    /* renamed from: e */
    final C0838a f2484e = new C0613a(this);

    /* renamed from: androidx.recyclerview.widget.p$a */
    public static class C0613a extends C0838a {

        /* renamed from: d */
        final C0612p f2485d;

        public C0613a(C0612p pVar) {
            this.f2485d = pVar;
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            if (!this.f2485d.mo3583c() && this.f2485d.f2483d.getLayoutManager() != null) {
                this.f2485d.f2483d.getLayoutManager().mo3183a(view, cVar);
            }
        }

        /* renamed from: a */
        public boolean mo2094a(View view, int i, Bundle bundle) {
            if (super.mo2094a(view, i, bundle)) {
                return true;
            }
            if (this.f2485d.mo3583c() || this.f2485d.f2483d.getLayoutManager() == null) {
                return false;
            }
            return this.f2485d.f2483d.getLayoutManager().mo3197a(view, i, bundle);
        }
    }

    public C0612p(RecyclerView recyclerView) {
        this.f2483d = recyclerView;
    }

    /* renamed from: a */
    public void mo2093a(View view, C0857c cVar) {
        super.mo2093a(view, cVar);
        if (!mo3583c() && this.f2483d.getLayoutManager() != null) {
            this.f2483d.getLayoutManager().mo3193a(cVar);
        }
    }

    /* renamed from: a */
    public boolean mo2094a(View view, int i, Bundle bundle) {
        if (super.mo2094a(view, i, bundle)) {
            return true;
        }
        if (mo3583c() || this.f2483d.getLayoutManager() == null) {
            return false;
        }
        return this.f2483d.getLayoutManager().mo3195a(i, bundle);
    }

    /* renamed from: b */
    public C0838a mo3582b() {
        return this.f2484e;
    }

    /* renamed from: b */
    public void mo2095b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2095b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo3583c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo2797a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3583c() {
        return this.f2483d.hasPendingAdapterUpdates();
    }
}
