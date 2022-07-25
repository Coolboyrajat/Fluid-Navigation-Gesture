package p006b.p026g.p035k;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p006b.p026g.C0778b;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p026g.p035k.p036e0.C0861d;

/* renamed from: b.g.k.a */
public class C0838a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f3250c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f3251a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f3252b;

    /* renamed from: b.g.k.a$a */
    static final class C0839a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0838a f3253a;

        C0839a(C0838a aVar) {
            this.f3253a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3253a.mo4548a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0861d a = this.f3253a.mo4546a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo4642a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3253a.mo2095b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0857c a = C0857c.m4600a(accessibilityNodeInfo);
            a.mo4622k(C0890v.m4735F(view));
            a.mo4620j(C0890v.m4730A(view));
            a.mo4610f(C0890v.m4776e(view));
            this.f3253a.mo2093a(view, a);
            a.mo4586a(accessibilityNodeInfo.getText(), view);
            List<C0857c.C0858a> b = C0838a.m4539b(view);
            for (int i = 0; i < b.size(); i++) {
                a.mo4584a(b.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3253a.mo4550c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3253a.mo4549a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3253a.mo2094a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f3253a.mo4547a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3253a.mo4551d(view, accessibilityEvent);
        }
    }

    public C0838a() {
        this(f3250c);
    }

    public C0838a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3251a = accessibilityDelegate;
        this.f3252b = new C0839a(this);
    }

    /* renamed from: a */
    private boolean m4537a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C0778b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m4538a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    private boolean m4538a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] h = C0857c.m4611h(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (h != null && i < h.length) {
                if (clickableSpan.equals(h[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: b */
    static List<C0857c.C0858a> m4539b(View view) {
        List<C0857c.C0858a> list = (List) view.getTag(C0778b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View.AccessibilityDelegate mo4545a() {
        return this.f3252b;
    }

    /* renamed from: a */
    public C0861d mo4546a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f3251a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0861d(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public void mo4547a(View view, int i) {
        this.f3251a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo2093a(View view, C0857c cVar) {
        this.f3251a.onInitializeAccessibilityNodeInfo(view, cVar.mo4637u());
    }

    /* renamed from: a */
    public boolean mo2094a(View view, int i, Bundle bundle) {
        List<C0857c.C0858a> b = m4539b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b.size()) {
                break;
            }
            C0857c.C0858a aVar = b.get(i2);
            if (aVar.mo4638a() == i) {
                z = aVar.mo4640a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f3251a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C0778b.accessibility_action_clickable_span) ? z : m4537a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: a */
    public boolean mo4548a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3251a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo4549a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3251a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo2095b(View view, AccessibilityEvent accessibilityEvent) {
        this.f3251a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo4550c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3251a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo4551d(View view, AccessibilityEvent accessibilityEvent) {
        this.f3251a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
