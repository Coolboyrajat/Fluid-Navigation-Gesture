package p006b.p050n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p006b.p050n.C0944a;
import p006b.p050n.C0992m;

/* renamed from: b.n.i0 */
public abstract class C0982i0 extends C0992m {

    /* renamed from: P */
    private static final String[] f3492P = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: O */
    private int f3493O = 3;

    /* renamed from: b.n.i0$a */
    class C0983a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1012w f3494a;

        /* renamed from: b */
        final /* synthetic */ View f3495b;

        C0983a(C0982i0 i0Var, C1012w wVar, View view) {
            this.f3494a = wVar;
            this.f3495b = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3494a.mo4944b(this.f3495b);
        }
    }

    /* renamed from: b.n.i0$b */
    private static class C0984b extends AnimatorListenerAdapter implements C0992m.C0998f, C0944a.C0945a {

        /* renamed from: a */
        private final View f3496a;

        /* renamed from: b */
        private final int f3497b;

        /* renamed from: c */
        private final ViewGroup f3498c;

        /* renamed from: d */
        private final boolean f3499d;

        /* renamed from: e */
        private boolean f3500e;

        /* renamed from: f */
        boolean f3501f = false;

        C0984b(View view, int i, boolean z) {
            this.f3496a = view;
            this.f3497b = i;
            this.f3498c = (ViewGroup) view.getParent();
            this.f3499d = z;
            m5138a(true);
        }

        /* renamed from: a */
        private void m5137a() {
            if (!this.f3501f) {
                C0966d0.m5065a(this.f3496a, this.f3497b);
                ViewGroup viewGroup = this.f3498c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m5138a(false);
        }

        /* renamed from: a */
        private void m5138a(boolean z) {
            ViewGroup viewGroup;
            if (this.f3499d && this.f3500e != z && (viewGroup = this.f3498c) != null) {
                this.f3500e = z;
                C1013x.m5262a(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo4844a(C0992m mVar) {
            m5138a(false);
        }

        /* renamed from: b */
        public void mo4845b(C0992m mVar) {
            m5138a(true);
        }

        /* renamed from: c */
        public void mo4861c(C0992m mVar) {
        }

        /* renamed from: d */
        public void mo4846d(C0992m mVar) {
            m5137a();
            mVar.mo4906b((C0992m.C0998f) this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f3501f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m5137a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f3501f) {
                C0966d0.m5065a(this.f3496a, this.f3497b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f3501f) {
                C0966d0.m5065a(this.f3496a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: b.n.i0$c */
    private static class C0985c {

        /* renamed from: a */
        boolean f3502a;

        /* renamed from: b */
        boolean f3503b;

        /* renamed from: c */
        int f3504c;

        /* renamed from: d */
        int f3505d;

        /* renamed from: e */
        ViewGroup f3506e;

        /* renamed from: f */
        ViewGroup f3507f;

        C0985c() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.f3506e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f3504c == 0) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p006b.p050n.C0982i0.C0985c m5125b(p006b.p050n.C1008s r8, p006b.p050n.C1008s r9) {
        /*
            r7 = this;
            b.n.i0$c r0 = new b.n.i0$c
            r0.<init>()
            r1 = 0
            r0.f3502a = r1
            r0.f3503b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3573a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3573a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f3504c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f3573a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3506e = r6
            goto L_0x0037
        L_0x0033:
            r0.f3504c = r4
            r0.f3506e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f3573a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3573a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f3505d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f3573a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3507f = r2
            goto L_0x005e
        L_0x005a:
            r0.f3505d = r4
            r0.f3507f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f3504c
            int r9 = r0.f3505d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f3506e
            android.view.ViewGroup r9 = r0.f3507f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f3504c
            int r9 = r0.f3505d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f3507f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f3506e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f3505d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f3503b = r2
        L_0x008e:
            r0.f3502a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f3504c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f3503b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p050n.C0982i0.m5125b(b.n.s, b.n.s):b.n.i0$c");
    }

    /* renamed from: d */
    private void m5126d(C1008s sVar) {
        sVar.f3573a.put("android:visibility:visibility", Integer.valueOf(sVar.f3574b.getVisibility()));
        sVar.f3573a.put("android:visibility:parent", sVar.f3574b.getParent());
        int[] iArr = new int[2];
        sVar.f3574b.getLocationOnScreen(iArr);
        sVar.f3573a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public abstract Animator mo4849a(ViewGroup viewGroup, View view, C1008s sVar, C1008s sVar2);

    /* renamed from: a */
    public Animator mo4873a(ViewGroup viewGroup, C1008s sVar, int i, C1008s sVar2, int i2) {
        if ((this.f3493O & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f3574b.getParent();
            if (m5125b(mo4893a(view, false), mo4907b(view, false)).f3502a) {
                return null;
            }
        }
        return mo4849a(viewGroup, sVar2.f3574b, sVar, sVar2);
    }

    /* renamed from: a */
    public Animator mo4813a(ViewGroup viewGroup, C1008s sVar, C1008s sVar2) {
        C0985c b = m5125b(sVar, sVar2);
        if (!b.f3502a) {
            return null;
        }
        if (b.f3506e == null && b.f3507f == null) {
            return null;
        }
        if (b.f3503b) {
            return mo4873a(viewGroup, sVar, b.f3504c, sVar2, b.f3505d);
        }
        return mo4876b(viewGroup, sVar, b.f3504c, sVar2, b.f3505d);
    }

    /* renamed from: a */
    public void mo4874a(int i) {
        if ((i & -4) == 0) {
            this.f3493O = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public void mo4814a(C1008s sVar) {
        m5126d(sVar);
    }

    /* renamed from: a */
    public boolean mo4875a(C1008s sVar, C1008s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f3573a.containsKey("android:visibility:visibility") != sVar.f3573a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0985c b = m5125b(sVar, sVar2);
        if (b.f3502a) {
            return b.f3504c == 0 || b.f3505d == 0;
        }
        return false;
    }

    /* renamed from: b */
    public abstract Animator mo4850b(ViewGroup viewGroup, View view, C1008s sVar, C1008s sVar2);

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo4876b(android.view.ViewGroup r7, p006b.p050n.C1008s r8, int r9, p006b.p050n.C1008s r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f3493O
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f3574b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f3574b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0026
        L_0x0024:
            r9 = r1
            goto L_0x007f
        L_0x0026:
            boolean r2 = r6.f3516A
            if (r2 == 0) goto L_0x002b
            goto L_0x0043
        L_0x002b:
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
        L_0x0031:
            android.view.View r9 = p006b.p050n.C1007r.m5251a(r7, r9, r2)
            goto L_0x0039
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r9 = r2
        L_0x0039:
            r2 = r1
            goto L_0x007f
        L_0x003b:
            if (r9 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            goto L_0x0039
        L_0x0044:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x007d
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            b.n.s r4 = r6.mo4907b((android.view.View) r2, (boolean) r3)
            b.n.s r5 = r6.mo4893a((android.view.View) r2, (boolean) r3)
            b.n.i0$c r4 = r6.m5125b(r4, r5)
            boolean r4 = r4.f3502a
            if (r4 != 0) goto L_0x0063
            goto L_0x0031
        L_0x0063:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x007b
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x007b
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x007b
            boolean r2 = r6.f3516A
            if (r2 == 0) goto L_0x007b
            goto L_0x0039
        L_0x007b:
            r9 = r1
            goto L_0x0039
        L_0x007d:
            r9 = r1
            r2 = r9
        L_0x007f:
            r4 = 0
            if (r9 == 0) goto L_0x00c7
            if (r8 == 0) goto L_0x00c7
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f3573a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            b.n.w r11 = p006b.p050n.C1013x.m5261a(r7)
            r11.mo4943a(r9)
            android.animation.Animator r7 = r6.mo4850b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00be
            r11.mo4944b(r9)
            goto L_0x00c6
        L_0x00be:
            b.n.i0$a r8 = new b.n.i0$a
            r8.<init>(r6, r11, r9)
            r7.addListener(r8)
        L_0x00c6:
            return r7
        L_0x00c7:
            if (r2 == 0) goto L_0x00e9
            int r9 = r2.getVisibility()
            p006b.p050n.C0966d0.m5065a((android.view.View) r2, (int) r4)
            android.animation.Animator r7 = r6.mo4850b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00e5
            b.n.i0$b r8 = new b.n.i0$b
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            p006b.p050n.C0944a.m5015a(r7, r8)
            r6.mo4892a((p006b.p050n.C0992m.C0998f) r8)
            goto L_0x00e8
        L_0x00e5:
            p006b.p050n.C0966d0.m5065a((android.view.View) r2, (int) r9)
        L_0x00e8:
            return r7
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p050n.C0982i0.mo4876b(android.view.ViewGroup, b.n.s, int, b.n.s, int):android.animation.Animator");
    }

    /* renamed from: c */
    public void mo4815c(C1008s sVar) {
        m5126d(sVar);
    }

    /* renamed from: m */
    public String[] mo4816m() {
        return f3492P;
    }
}
