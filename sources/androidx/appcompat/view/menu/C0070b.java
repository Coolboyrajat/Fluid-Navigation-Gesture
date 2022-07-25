package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.view.menu.C0099o;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0070b implements C0097n {

    /* renamed from: f */
    protected Context f358f;

    /* renamed from: g */
    protected Context f359g;

    /* renamed from: h */
    protected C0081g f360h;

    /* renamed from: i */
    protected LayoutInflater f361i;

    /* renamed from: j */
    private C0097n.C0098a f362j;

    /* renamed from: k */
    private int f363k;

    /* renamed from: l */
    private int f364l;

    /* renamed from: m */
    protected C0099o f365m;

    public C0070b(Context context, int i, int i2) {
        this.f358f = context;
        this.f361i = LayoutInflater.from(context);
        this.f363k = i;
        this.f364l = i2;
    }

    /* renamed from: a */
    public View mo382a(C0086j jVar, View view, ViewGroup viewGroup) {
        C0099o.C0100a a = view instanceof C0099o.C0100a ? (C0099o.C0100a) view : mo384a(viewGroup);
        mo389a(jVar, a);
        return (View) a;
    }

    /* renamed from: a */
    public C0097n.C0098a mo383a() {
        return this.f362j;
    }

    /* renamed from: a */
    public C0099o.C0100a mo384a(ViewGroup viewGroup) {
        return (C0099o.C0100a) this.f361i.inflate(this.f364l, viewGroup, false);
    }

    /* renamed from: a */
    public void mo385a(int i) {
    }

    /* renamed from: a */
    public void mo386a(Context context, C0081g gVar) {
        this.f359g = context;
        LayoutInflater.from(this.f359g);
        this.f360h = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo387a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f365m).addView(view, i);
    }

    /* renamed from: a */
    public void mo388a(C0081g gVar, boolean z) {
        C0097n.C0098a aVar = this.f362j;
        if (aVar != null) {
            aVar.mo212a(gVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo389a(C0086j jVar, C0099o.C0100a aVar);

    /* renamed from: a */
    public void mo390a(C0097n.C0098a aVar) {
        this.f362j = aVar;
    }

    /* renamed from: a */
    public void mo391a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f365m;
        if (viewGroup != null) {
            C0081g gVar = this.f360h;
            int i = 0;
            if (gVar != null) {
                gVar.mo472b();
                ArrayList<C0086j> n = this.f360h.mo501n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0086j jVar = n.get(i3);
                    if (mo392a(i2, jVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0086j itemData = childAt instanceof C0099o.C0100a ? ((C0099o.C0100a) childAt).getItemData() : null;
                        View a = mo382a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo387a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo393a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo392a(int i, C0086j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo393a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo394a(C0081g gVar, C0086j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo395a(C0106s sVar) {
        C0097n.C0098a aVar = this.f362j;
        if (aVar != null) {
            return aVar.mo213a(sVar);
        }
        return false;
    }

    /* renamed from: b */
    public C0099o mo396b(ViewGroup viewGroup) {
        if (this.f365m == null) {
            this.f365m = (C0099o) this.f361i.inflate(this.f363k, viewGroup, false);
            this.f365m.mo311a(this.f360h);
            mo391a(true);
        }
        return this.f365m;
    }

    /* renamed from: b */
    public boolean mo397b(C0081g gVar, C0086j jVar) {
        return false;
    }
}
