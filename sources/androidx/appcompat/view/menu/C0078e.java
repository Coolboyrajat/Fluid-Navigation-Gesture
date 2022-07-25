package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.C0097n;
import androidx.appcompat.view.menu.C0099o;
import java.util.ArrayList;
import p006b.p007a.C0660g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0078e implements C0097n, AdapterView.OnItemClickListener {

    /* renamed from: f */
    Context f406f;

    /* renamed from: g */
    LayoutInflater f407g;

    /* renamed from: h */
    C0081g f408h;

    /* renamed from: i */
    ExpandedMenuView f409i;

    /* renamed from: j */
    int f410j;

    /* renamed from: k */
    int f411k;

    /* renamed from: l */
    int f412l;

    /* renamed from: m */
    private C0097n.C0098a f413m;

    /* renamed from: n */
    C0079a f414n;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0079a extends BaseAdapter {

        /* renamed from: f */
        private int f415f = -1;

        public C0079a() {
            mo429a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo429a() {
            C0086j f = C0078e.this.f408h.mo489f();
            if (f != null) {
                ArrayList<C0086j> j = C0078e.this.f408h.mo497j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (j.get(i) == f) {
                        this.f415f = i;
                        return;
                    }
                }
            }
            this.f415f = -1;
        }

        public int getCount() {
            int size = C0078e.this.f408h.mo497j().size() - C0078e.this.f410j;
            return this.f415f < 0 ? size : size - 1;
        }

        public C0086j getItem(int i) {
            ArrayList<C0086j> j = C0078e.this.f408h.mo497j();
            int i2 = i + C0078e.this.f410j;
            int i3 = this.f415f;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return j.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0078e eVar = C0078e.this;
                view = eVar.f407g.inflate(eVar.f412l, viewGroup, false);
            }
            ((C0099o.C0100a) view).mo289a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo429a();
            super.notifyDataSetChanged();
        }
    }

    public C0078e(int i, int i2) {
        this.f412l = i;
        this.f411k = i2;
    }

    public C0078e(Context context, int i) {
        this(i, 0);
        this.f406f = context;
        this.f407g = LayoutInflater.from(this.f406f);
    }

    /* renamed from: a */
    public ListAdapter mo426a() {
        if (this.f414n == null) {
            this.f414n = new C0079a();
        }
        return this.f414n;
    }

    /* renamed from: a */
    public C0099o mo427a(ViewGroup viewGroup) {
        if (this.f409i == null) {
            this.f409i = (ExpandedMenuView) this.f407g.inflate(C0660g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f414n == null) {
                this.f414n = new C0079a();
            }
            this.f409i.setAdapter(this.f414n);
            this.f409i.setOnItemClickListener(this);
        }
        return this.f409i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.f407g == null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo386a(android.content.Context r3, androidx.appcompat.view.menu.C0081g r4) {
        /*
            r2 = this;
            int r0 = r2.f411k
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r3, r0)
            r2.f406f = r1
        L_0x000b:
            android.content.Context r3 = r2.f406f
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f407g = r3
            goto L_0x001f
        L_0x0014:
            android.content.Context r0 = r2.f406f
            if (r0 == 0) goto L_0x001f
            r2.f406f = r3
            android.view.LayoutInflater r3 = r2.f407g
            if (r3 != 0) goto L_0x001f
            goto L_0x000b
        L_0x001f:
            r2.f408h = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f414n
            if (r3 == 0) goto L_0x0028
            r3.notifyDataSetChanged()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0078e.mo386a(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    /* renamed from: a */
    public void mo388a(C0081g gVar, boolean z) {
        C0097n.C0098a aVar = this.f413m;
        if (aVar != null) {
            aVar.mo212a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo390a(C0097n.C0098a aVar) {
        this.f413m = aVar;
    }

    /* renamed from: a */
    public void mo391a(boolean z) {
        C0079a aVar = this.f414n;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo394a(C0081g gVar, C0086j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo395a(C0106s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new C0084h(sVar).mo518a((IBinder) null);
        C0097n.C0098a aVar = this.f413m;
        if (aVar == null) {
            return true;
        }
        aVar.mo213a(sVar);
        return true;
    }

    /* renamed from: b */
    public boolean mo410b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo397b(C0081g gVar, C0086j jVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f408h.mo459a((MenuItem) this.f414n.getItem(i), (C0097n) this, 0);
    }
}
