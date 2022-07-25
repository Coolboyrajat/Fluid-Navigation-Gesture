package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0097n;
import p006b.p026g.p035k.C0851d;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.view.menu.m */
public class C0095m implements C0085i {

    /* renamed from: a */
    private final Context f497a;

    /* renamed from: b */
    private final C0081g f498b;

    /* renamed from: c */
    private final boolean f499c;

    /* renamed from: d */
    private final int f500d;

    /* renamed from: e */
    private final int f501e;

    /* renamed from: f */
    private View f502f;

    /* renamed from: g */
    private int f503g;

    /* renamed from: h */
    private boolean f504h;

    /* renamed from: i */
    private C0097n.C0098a f505i;

    /* renamed from: j */
    private C0094l f506j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f507k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f508l;

    /* renamed from: androidx.appcompat.view.menu.m$a */
    class C0096a implements PopupWindow.OnDismissListener {
        C0096a() {
        }

        public void onDismiss() {
            C0095m.this.mo660d();
        }
    }

    public C0095m(Context context, C0081g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public C0095m(Context context, C0081g gVar, View view, boolean z, int i, int i2) {
        this.f503g = 8388611;
        this.f508l = new C0096a();
        this.f497a = context;
        this.f498b = gVar;
        this.f502f = view;
        this.f499c = z;
        this.f500d = i;
        this.f501e = i2;
    }

    /* renamed from: a */
    private void m533a(int i, int i2, boolean z, boolean z2) {
        C0094l b = mo658b();
        b.mo412c(z2);
        if (z) {
            if ((C0851d.m4580a(this.f503g, C0890v.m4791o(this.f502f)) & 7) == 5) {
                i -= this.f502f.getWidth();
            }
            b.mo408b(i);
            b.mo411c(i2);
            int i3 = (int) ((this.f497a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo648a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo403a();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0094l m534g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f497a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f497a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p006b.p007a.C0657d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f497a
            android.view.View r3 = r14.f502f
            int r4 = r14.f500d
            int r5 = r14.f501e
            boolean r6 = r14.f499c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.r r0 = new androidx.appcompat.view.menu.r
            android.content.Context r8 = r14.f497a
            androidx.appcompat.view.menu.g r9 = r14.f498b
            android.view.View r10 = r14.f502f
            int r11 = r14.f500d
            int r12 = r14.f501e
            boolean r13 = r14.f499c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f498b
            r0.mo407a((androidx.appcompat.view.menu.C0081g) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f508l
            r0.mo406a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f502f
            r0.mo405a((android.view.View) r1)
            androidx.appcompat.view.menu.n$a r1 = r14.f505i
            r0.mo390a((androidx.appcompat.view.menu.C0097n.C0098a) r1)
            boolean r1 = r14.f504h
            r0.mo409b((boolean) r1)
            int r1 = r14.f503g
            r0.mo404a((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0095m.m534g():androidx.appcompat.view.menu.l");
    }

    /* renamed from: a */
    public void mo651a() {
        if (mo659c()) {
            this.f506j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo652a(int i) {
        this.f503g = i;
    }

    /* renamed from: a */
    public void mo653a(View view) {
        this.f502f = view;
    }

    /* renamed from: a */
    public void mo654a(PopupWindow.OnDismissListener onDismissListener) {
        this.f507k = onDismissListener;
    }

    /* renamed from: a */
    public void mo655a(C0097n.C0098a aVar) {
        this.f505i = aVar;
        C0094l lVar = this.f506j;
        if (lVar != null) {
            lVar.mo390a(aVar);
        }
    }

    /* renamed from: a */
    public void mo656a(boolean z) {
        this.f504h = z;
        C0094l lVar = this.f506j;
        if (lVar != null) {
            lVar.mo409b(z);
        }
    }

    /* renamed from: a */
    public boolean mo657a(int i, int i2) {
        if (mo659c()) {
            return true;
        }
        if (this.f502f == null) {
            return false;
        }
        m533a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0094l mo658b() {
        if (this.f506j == null) {
            this.f506j = m534g();
        }
        return this.f506j;
    }

    /* renamed from: c */
    public boolean mo659c() {
        C0094l lVar = this.f506j;
        return lVar != null && lVar.mo413c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo660d() {
        this.f506j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f507k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo661e() {
        if (!mo662f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo662f() {
        if (mo659c()) {
            return true;
        }
        if (this.f502f == null) {
            return false;
        }
        m533a(0, 0, false, false);
        return true;
    }
}
