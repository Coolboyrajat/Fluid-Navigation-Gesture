package p006b.p039i.p041b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p006b.p021d.C0737h;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0901y;
import p006b.p026g.p035k.p036e0.C0857c;
import p006b.p026g.p035k.p036e0.C0861d;
import p006b.p026g.p035k.p036e0.C0864e;
import p006b.p039i.p041b.C0919b;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.i.b.a */
public abstract class C0915a extends C0838a {

    /* renamed from: n */
    private static final Rect f3363n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o */
    private static final C0919b.C0920a<C0857c> f3364o = new C0916a();

    /* renamed from: p */
    private static final C0919b.C0921b<C0737h<C0857c>, C0857c> f3365p = new C0917b();

    /* renamed from: d */
    private final Rect f3366d = new Rect();

    /* renamed from: e */
    private final Rect f3367e = new Rect();

    /* renamed from: f */
    private final Rect f3368f = new Rect();

    /* renamed from: g */
    private final int[] f3369g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f3370h;

    /* renamed from: i */
    private final View f3371i;

    /* renamed from: j */
    private C0918c f3372j;

    /* renamed from: k */
    int f3373k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l */
    int f3374l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m */
    private int f3375m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: b.i.b.a$a */
    static class C0916a implements C0919b.C0920a<C0857c> {
        C0916a() {
        }

        /* renamed from: a */
        public void mo4748a(C0857c cVar, Rect rect) {
            cVar.mo4581a(rect);
        }
    }

    /* renamed from: b.i.b.a$b */
    static class C0917b implements C0919b.C0921b<C0737h<C0857c>, C0857c> {
        C0917b() {
        }

        /* renamed from: a */
        public int mo4750a(C0737h<C0857c> hVar) {
            return hVar.mo4217b();
        }

        /* renamed from: a */
        public C0857c mo4752a(C0737h<C0857c> hVar, int i) {
            return hVar.mo4224e(i);
        }
    }

    /* renamed from: b.i.b.a$c */
    private class C0918c extends C0861d {
        C0918c() {
        }

        /* renamed from: a */
        public C0857c mo4641a(int i) {
            return C0857c.m4601a(C0915a.this.mo4743b(i));
        }

        /* renamed from: a */
        public boolean mo4644a(int i, int i2, Bundle bundle) {
            return C0915a.this.mo4744b(i, i2, bundle);
        }

        /* renamed from: b */
        public C0857c mo4645b(int i) {
            int i2 = i == 2 ? C0915a.this.f3373k : C0915a.this.f3374l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo4641a(i2);
        }
    }

    public C0915a(View view) {
        if (view != null) {
            this.f3371i = view;
            this.f3370h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0890v.m4789m(view) == 0) {
                C0890v.m4783h(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: a */
    private static Rect m4883a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: a */
    private void m4884a(int i, Rect rect) {
        mo4743b(i).mo4581a(rect);
    }

    /* renamed from: a */
    private boolean m4885a(int i, Bundle bundle) {
        return C0890v.m4761a(this.f3371i, i, bundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4886a(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f3371i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f3371i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p039i.p041b.C0915a.m4886a(android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    private AccessibilityEvent m4887b(int i, int i2) {
        return i != -1 ? m4889c(i, i2) : m4893e(i2);
    }

    /* renamed from: b */
    private boolean m4888b(int i, Rect rect) {
        Object obj;
        C0737h<C0857c> f = m4895f();
        int i2 = this.f3374l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        C0857c a = i2 == Integer.MIN_VALUE ? null : f.mo4214a(i2);
        if (i == 1 || i == 2) {
            obj = C0919b.m4931a(f, f3365p, f3364o, a, i, C0890v.m4791o(this.f3371i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f3374l;
            if (i4 != Integer.MIN_VALUE) {
                m4884a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m4883a(this.f3371i, i, rect2);
            }
            obj = C0919b.m4932a(f, f3365p, f3364o, a, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C0857c cVar = (C0857c) obj;
        if (cVar != null) {
            i3 = f.mo4220c(f.mo4213a(cVar));
        }
        return mo4746c(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m4889c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0857c b = mo4743b(i);
        obtain.getText().add(b.mo4612g());
        obtain.setContentDescription(b.mo4601d());
        obtain.setScrollable(b.mo4632q());
        obtain.setPassword(b.mo4631p());
        obtain.setEnabled(b.mo4625l());
        obtain.setChecked(b.mo4621j());
        mo4730a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo4596c());
            C0864e.m4682a(obtain, this.f3371i, i);
            obtain.setPackageName(this.f3371i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: c */
    private boolean m4890c(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo4739a(i, i2, bundle) : m4892d(i) : m4898h(i) : mo4737a(i) : mo4746c(i);
    }

    /* renamed from: d */
    private boolean m4891d() {
        int i = this.f3374l;
        return i != Integer.MIN_VALUE && mo4739a(i, 16, (Bundle) null);
    }

    /* renamed from: d */
    private boolean m4892d(int i) {
        if (this.f3373k != i) {
            return false;
        }
        this.f3373k = RecyclerView.UNDEFINED_DURATION;
        this.f3371i.invalidate();
        mo4738a(i, 65536);
        return true;
    }

    /* renamed from: e */
    private AccessibilityEvent m4893e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f3371i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: e */
    private C0857c m4894e() {
        C0857c d = C0857c.m4609d(this.f3371i);
        C0890v.m4755a(this.f3371i, d);
        ArrayList arrayList = new ArrayList();
        mo4735a((List<Integer>) arrayList);
        if (d.mo4590b() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d.mo4583a(this.f3371i, ((Integer) arrayList.get(i)).intValue());
            }
            return d;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: f */
    private C0737h<C0857c> m4895f() {
        ArrayList arrayList = new ArrayList();
        mo4735a((List<Integer>) arrayList);
        C0737h<C0857c> hVar = new C0737h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo4221c(i, m4896f(i));
        }
        return hVar;
    }

    /* renamed from: f */
    private C0857c m4896f(int i) {
        C0857c x = C0857c.m4614x();
        x.mo4614g(true);
        x.mo4616h(true);
        x.mo4585a((CharSequence) "android.view.View");
        x.mo4597c(f3363n);
        x.mo4602d(f3363n);
        x.mo4582a(this.f3371i);
        mo4731a(i, x);
        if (x.mo4612g() == null && x.mo4601d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        x.mo4581a(this.f3367e);
        if (!this.f3367e.equals(f3363n)) {
            int a = x.mo4579a();
            if ((a & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((a & PropertyFlags.ID_SELF_ASSIGNABLE) == 0) {
                x.mo4606e((CharSequence) this.f3371i.getContext().getPackageName());
                x.mo4598c(this.f3371i, i);
                if (this.f3373k == i) {
                    x.mo4588a(true);
                    x.mo4580a((int) PropertyFlags.ID_SELF_ASSIGNABLE);
                } else {
                    x.mo4588a(false);
                    x.mo4580a(64);
                }
                boolean z = this.f3374l == i;
                if (z) {
                    x.mo4580a(2);
                } else if (x.mo4627m()) {
                    x.mo4580a(1);
                }
                x.mo4618i(z);
                this.f3371i.getLocationOnScreen(this.f3369g);
                x.mo4591b(this.f3366d);
                if (this.f3366d.equals(f3363n)) {
                    x.mo4581a(this.f3366d);
                    if (x.f3292b != -1) {
                        C0857c x2 = C0857c.m4614x();
                        for (int i2 = x.f3292b; i2 != -1; i2 = x2.f3292b) {
                            x2.mo4592b(this.f3371i, -1);
                            x2.mo4597c(f3363n);
                            mo4731a(i2, x2);
                            x2.mo4581a(this.f3367e);
                            Rect rect = this.f3366d;
                            Rect rect2 = this.f3367e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        x2.mo4635t();
                    }
                    this.f3366d.offset(this.f3369g[0] - this.f3371i.getScrollX(), this.f3369g[1] - this.f3371i.getScrollY());
                }
                if (this.f3371i.getLocalVisibleRect(this.f3368f)) {
                    this.f3368f.offset(this.f3369g[0] - this.f3371i.getScrollX(), this.f3369g[1] - this.f3371i.getScrollY());
                    if (this.f3366d.intersect(this.f3368f)) {
                        x.mo4602d(this.f3366d);
                        if (m4886a(this.f3366d)) {
                            x.mo4628n(true);
                        }
                    }
                }
                return x;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: g */
    private static int m4897g(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: h */
    private boolean m4898h(int i) {
        int i2;
        if (!this.f3370h.isEnabled() || !this.f3370h.isTouchExplorationEnabled() || (i2 = this.f3373k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m4892d(i2);
        }
        this.f3373k = i;
        this.f3371i.invalidate();
        mo4738a(i, 32768);
        return true;
    }

    /* renamed from: i */
    private void m4899i(int i) {
        int i2 = this.f3375m;
        if (i2 != i) {
            this.f3375m = i;
            mo4738a(i, (int) PropertyFlags.ID_SELF_ASSIGNABLE);
            mo4738a(i2, (int) PropertyFlags.INDEX_PARTIAL_SKIP_NULL);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4729a(float f, float f2);

    /* renamed from: a */
    public C0861d mo4546a(View view) {
        if (this.f3372j == null) {
            this.f3372j = new C0918c();
        }
        return this.f3372j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4730a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4731a(int i, C0857c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4732a(int i, boolean z) {
    }

    /* renamed from: a */
    public void mo2093a(View view, C0857c cVar) {
        super.mo2093a(view, cVar);
        mo4734a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4733a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4734a(C0857c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4735a(List<Integer> list);

    /* renamed from: a */
    public final void mo4736a(boolean z, int i, Rect rect) {
        int i2 = this.f3374l;
        if (i2 != Integer.MIN_VALUE) {
            mo4737a(i2);
        }
        if (z) {
            m4888b(i, rect);
        }
    }

    /* renamed from: a */
    public final boolean mo4737a(int i) {
        if (this.f3374l != i) {
            return false;
        }
        this.f3374l = RecyclerView.UNDEFINED_DURATION;
        mo4732a(i, false);
        mo4738a(i, 8);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4738a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f3370h.isEnabled() || (parent = this.f3371i.getParent()) == null) {
            return false;
        }
        return C0901y.m4851a(parent, this.f3371i, m4887b(i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo4739a(int i, int i2, Bundle bundle);

    /* renamed from: a */
    public final boolean mo4740a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g = m4897g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m4888b(g, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m4891d();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m4888b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m4888b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo4741a(MotionEvent motionEvent) {
        if (!this.f3370h.isEnabled() || !this.f3370h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a = mo4729a(motionEvent.getX(), motionEvent.getY());
            m4899i(a);
            return a != Integer.MIN_VALUE;
        } else if (action != 10 || this.f3375m == Integer.MIN_VALUE) {
            return false;
        } else {
            m4899i(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    /* renamed from: b */
    public final int mo4742b() {
        return this.f3373k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0857c mo4743b(int i) {
        return i == -1 ? m4894e() : m4896f(i);
    }

    /* renamed from: b */
    public void mo2095b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2095b(view, accessibilityEvent);
        mo4733a(accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4744b(int i, int i2, Bundle bundle) {
        return i != -1 ? m4890c(i, i2, bundle) : m4885a(i2, bundle);
    }

    /* renamed from: c */
    public final int mo4745c() {
        return this.f3374l;
    }

    /* renamed from: c */
    public final boolean mo4746c(int i) {
        int i2;
        if ((!this.f3371i.isFocused() && !this.f3371i.requestFocus()) || (i2 = this.f3374l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo4737a(i2);
        }
        this.f3374l = i;
        mo4732a(i, true);
        mo4738a(i, 8);
        return true;
    }
}
