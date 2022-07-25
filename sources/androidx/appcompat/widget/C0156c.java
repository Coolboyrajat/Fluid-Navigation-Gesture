package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0070b;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0086j;
import androidx.appcompat.view.menu.C0095m;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.view.menu.C0099o;
import androidx.appcompat.view.menu.C0102q;
import androidx.appcompat.view.menu.C0106s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0328a;
import java.util.ArrayList;
import p006b.p007a.C0654a;
import p006b.p007a.C0660g;
import p006b.p007a.p014o.C0684a;
import p006b.p026g.p035k.C0841b;

/* renamed from: androidx.appcompat.widget.c */
class C0156c extends C0070b implements C0841b.C0842a {

    /* renamed from: A */
    private final SparseBooleanArray f836A = new SparseBooleanArray();

    /* renamed from: B */
    C0162e f837B;

    /* renamed from: C */
    C0157a f838C;

    /* renamed from: D */
    C0159c f839D;

    /* renamed from: E */
    private C0158b f840E;

    /* renamed from: F */
    final C0163f f841F = new C0163f();

    /* renamed from: G */
    int f842G;

    /* renamed from: n */
    C0160d f843n;

    /* renamed from: o */
    private Drawable f844o;

    /* renamed from: p */
    private boolean f845p;

    /* renamed from: q */
    private boolean f846q;

    /* renamed from: r */
    private boolean f847r;

    /* renamed from: s */
    private int f848s;

    /* renamed from: t */
    private int f849t;

    /* renamed from: u */
    private int f850u;

    /* renamed from: v */
    private boolean f851v;

    /* renamed from: w */
    private boolean f852w;

    /* renamed from: x */
    private boolean f853x;

    /* renamed from: y */
    private boolean f854y;

    /* renamed from: z */
    private int f855z;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class C0157a extends C0095m {
        public C0157a(Context context, C0106s sVar, View view) {
            super(context, sVar, view, false, C0654a.actionOverflowMenuStyle);
            if (!((C0086j) sVar.getItem()).mo548h()) {
                View view2 = C0156c.this.f843n;
                mo653a(view2 == null ? (View) C0156c.this.f365m : view2);
            }
            mo655a((C0097n.C0098a) C0156c.this.f841F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo660d() {
            C0156c cVar = C0156c.this;
            cVar.f838C = null;
            cVar.f842G = 0;
            super.mo660d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class C0158b extends ActionMenuItemView.C0068b {
        C0158b() {
        }

        /* renamed from: a */
        public C0102q mo310a() {
            C0157a aVar = C0156c.this.f838C;
            if (aVar != null) {
                return aVar.mo658b();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    private class C0159c implements Runnable {

        /* renamed from: f */
        private C0162e f858f;

        public C0159c(C0162e eVar) {
            this.f858f = eVar;
        }

        public void run() {
            if (C0156c.this.f360h != null) {
                C0156c.this.f360h.mo450a();
            }
            View view = (View) C0156c.this.f365m;
            if (!(view == null || view.getWindowToken() == null || !this.f858f.mo662f())) {
                C0156c.this.f837B = this.f858f;
            }
            C0156c.this.f839D = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class C0160d extends AppCompatImageView implements ActionMenuView.C0114a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class C0161a extends C0164c0 {
            C0161a(View view, C0156c cVar) {
                super(view);
            }

            /* renamed from: a */
            public C0102q mo308a() {
                C0162e eVar = C0156c.this.f837B;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo658b();
            }

            /* renamed from: b */
            public boolean mo309b() {
                C0156c.this.mo1230i();
                return true;
            }

            /* renamed from: c */
            public boolean mo1234c() {
                C0156c cVar = C0156c.this;
                if (cVar.f839D != null) {
                    return false;
                }
                cVar.mo1226e();
                return true;
            }
        }

        public C0160d(Context context) {
            super(context, (AttributeSet) null, C0654a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0234t0.m1151a(this, getContentDescription());
            setOnTouchListener(new C0161a(this, C0156c.this));
        }

        /* renamed from: b */
        public boolean mo291b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo292c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0156c.this.mo1230i();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0328a.m1610a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class C0162e extends C0095m {
        public C0162e(Context context, C0081g gVar, View view, boolean z) {
            super(context, gVar, view, z, C0654a.actionOverflowMenuStyle);
            mo652a(8388613);
            mo655a((C0097n.C0098a) C0156c.this.f841F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo660d() {
            if (C0156c.this.f360h != null) {
                C0156c.this.f360h.close();
            }
            C0156c.this.f837B = null;
            super.mo660d();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class C0163f implements C0097n.C0098a {
        C0163f() {
        }

        /* renamed from: a */
        public void mo212a(C0081g gVar, boolean z) {
            if (gVar instanceof C0106s) {
                gVar.mo500m().mo457a(false);
            }
            C0097n.C0098a a = C0156c.this.mo383a();
            if (a != null) {
                a.mo212a(gVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo213a(C0081g gVar) {
            if (gVar == null) {
                return false;
            }
            C0156c.this.f842G = ((C0106s) gVar).getItem().getItemId();
            C0097n.C0098a a = C0156c.this.mo383a();
            if (a != null) {
                return a.mo213a(gVar);
            }
            return false;
        }
    }

    public C0156c(Context context) {
        super(context, C0660g.abc_action_menu_layout, C0660g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m796a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f365m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0099o.C0100a) && ((C0099o.C0100a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View mo382a(C0086j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo534f()) {
            actionView = super.mo382a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo386a(Context context, C0081g gVar) {
        super.mo386a(context, gVar);
        Resources resources = context.getResources();
        C0684a a = C0684a.m3766a(context);
        if (!this.f847r) {
            this.f846q = a.mo3893g();
        }
        if (!this.f853x) {
            this.f848s = a.mo3888b();
        }
        if (!this.f851v) {
            this.f850u = a.mo3889c();
        }
        int i = this.f848s;
        if (this.f846q) {
            if (this.f843n == null) {
                this.f843n = new C0160d(this.f358f);
                if (this.f845p) {
                    this.f843n.setImageDrawable(this.f844o);
                    this.f844o = null;
                    this.f845p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f843n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f843n.getMeasuredWidth();
        } else {
            this.f843n = null;
        }
        this.f849t = i;
        this.f855z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: a */
    public void mo1219a(Configuration configuration) {
        if (!this.f851v) {
            this.f850u = C0684a.m3766a(this.f359g).mo3889c();
        }
        C0081g gVar = this.f360h;
        if (gVar != null) {
            gVar.mo475b(true);
        }
    }

    /* renamed from: a */
    public void mo1220a(Drawable drawable) {
        C0160d dVar = this.f843n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f845p = true;
        this.f844o = drawable;
    }

    /* renamed from: a */
    public void mo388a(C0081g gVar, boolean z) {
        mo1224c();
        super.mo388a(gVar, z);
    }

    /* renamed from: a */
    public void mo389a(C0086j jVar, C0099o.C0100a aVar) {
        aVar.mo289a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f365m);
        if (this.f840E == null) {
            this.f840E = new C0158b();
        }
        actionMenuItemView.setPopupCallback(this.f840E);
    }

    /* renamed from: a */
    public void mo1221a(ActionMenuView actionMenuView) {
        this.f365m = actionMenuView;
        actionMenuView.mo311a(this.f360h);
    }

    /* renamed from: a */
    public void mo391a(boolean z) {
        C0099o oVar;
        super.mo391a(z);
        ((View) this.f365m).requestLayout();
        C0081g gVar = this.f360h;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0086j> c = gVar.mo478c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C0841b a = c.get(i).mo327a();
                if (a != null) {
                    a.mo4561a((C0841b.C0842a) this);
                }
            }
        }
        C0081g gVar2 = this.f360h;
        ArrayList<C0086j> j = gVar2 != null ? gVar2.mo497j() : null;
        if (this.f846q && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0160d dVar = this.f843n;
        if (z2) {
            if (dVar == null) {
                this.f843n = new C0160d(this.f358f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f843n.getParent();
            if (viewGroup != this.f365m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f843n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f365m;
                actionMenuView.addView(this.f843n, actionMenuView.mo814e());
            }
        } else if (dVar != null && dVar.getParent() == (oVar = this.f365m)) {
            ((ViewGroup) oVar).removeView(this.f843n);
        }
        ((ActionMenuView) this.f365m).setOverflowReserved(this.f846q);
    }

    /* renamed from: a */
    public boolean mo392a(int i, C0086j jVar) {
        return jVar.mo548h();
    }

    /* renamed from: a */
    public boolean mo393a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f843n) {
            return false;
        }
        return super.mo393a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo395a(C0106s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        C0106s sVar2 = sVar;
        while (sVar2.mo701t() != this.f360h) {
            sVar2 = (C0106s) sVar2.mo701t();
        }
        View a = m796a(sVar2.getItem());
        if (a == null) {
            return false;
        }
        sVar.getItem().getItemId();
        int size = sVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f838C = new C0157a(this.f359g, sVar, a);
        this.f838C.mo656a(z);
        this.f838C.mo661e();
        super.mo395a(sVar);
        return true;
    }

    /* renamed from: b */
    public C0099o mo396b(ViewGroup viewGroup) {
        C0099o oVar = this.f365m;
        C0099o b = super.mo396b(viewGroup);
        if (oVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: b */
    public void mo1222b(boolean z) {
        this.f854y = z;
    }

    /* renamed from: b */
    public boolean mo410b() {
        int i;
        ArrayList<C0086j> arrayList;
        int i2;
        int i3;
        int i4;
        C0156c cVar = this;
        C0081g gVar = cVar.f360h;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo501n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = cVar.f850u;
        int i7 = cVar.f849t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f365m;
        int i8 = i6;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0086j jVar = arrayList.get(i11);
            if (jVar.mo556k()) {
                i9++;
            } else if (jVar.mo555j()) {
                i10++;
            } else {
                z = true;
            }
            if (cVar.f854y && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (cVar.f846q && (z || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.f836A;
        sparseBooleanArray.clear();
        if (cVar.f852w) {
            int i13 = cVar.f855z;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0086j jVar2 = arrayList.get(i15);
            if (jVar2.mo556k()) {
                View a = cVar.mo382a(jVar2, view, viewGroup);
                if (cVar.f852w) {
                    i2 -= ActionMenuView.m630a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.mo531d(true);
                i16 = measuredWidth;
                i4 = i;
            } else if (jVar2.mo555j()) {
                int groupId2 = jVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i14 > 0 && (!cVar.f852w || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a2 = cVar.mo382a(jVar2, (View) null, viewGroup);
                    if (cVar.f852w) {
                        int a3 = ActionMenuView.m630a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        z4 = a3 == 0 ? false : z4;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z3 = z4 & (!cVar.f852w ? i14 + i16 > 0 : i14 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0086j jVar3 = arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo548h()) {
                                i12++;
                            }
                            jVar3.mo531d(false);
                        }
                        i17++;
                    }
                }
                if (z3) {
                    i12--;
                }
                jVar2.mo531d(z3);
            } else {
                i4 = i;
                jVar2.mo531d(false);
                i15++;
                i = i4;
                view = null;
                i5 = 0;
                cVar = this;
            }
            i15++;
            i = i4;
            view = null;
            i5 = 0;
            cVar = this;
        }
        return true;
    }

    /* renamed from: c */
    public void mo1223c(boolean z) {
        this.f846q = z;
        this.f847r = true;
    }

    /* renamed from: c */
    public boolean mo1224c() {
        return mo1226e() | mo1227f();
    }

    /* renamed from: d */
    public Drawable mo1225d() {
        C0160d dVar = this.f843n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f845p) {
            return this.f844o;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo1226e() {
        C0099o oVar;
        C0159c cVar = this.f839D;
        if (cVar == null || (oVar = this.f365m) == null) {
            C0162e eVar = this.f837B;
            if (eVar == null) {
                return false;
            }
            eVar.mo651a();
            return true;
        }
        ((View) oVar).removeCallbacks(cVar);
        this.f839D = null;
        return true;
    }

    /* renamed from: f */
    public boolean mo1227f() {
        C0157a aVar = this.f838C;
        if (aVar == null) {
            return false;
        }
        aVar.mo651a();
        return true;
    }

    /* renamed from: g */
    public boolean mo1228g() {
        return this.f839D != null || mo1229h();
    }

    /* renamed from: h */
    public boolean mo1229h() {
        C0162e eVar = this.f837B;
        return eVar != null && eVar.mo659c();
    }

    /* renamed from: i */
    public boolean mo1230i() {
        C0081g gVar;
        if (!this.f846q || mo1229h() || (gVar = this.f360h) == null || this.f365m == null || this.f839D != null || gVar.mo497j().isEmpty()) {
            return false;
        }
        this.f839D = new C0159c(new C0162e(this.f359g, this.f360h, this.f843n, true));
        ((View) this.f365m).post(this.f839D);
        super.mo395a((C0106s) null);
        return true;
    }
}
