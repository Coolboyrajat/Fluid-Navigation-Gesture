package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.view.menu.l */
abstract class C0094l implements C0102q, C0097n, AdapterView.OnItemClickListener {

    /* renamed from: f */
    private Rect f496f;

    C0094l() {
    }

    /* renamed from: a */
    protected static int m516a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0080f m517a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0080f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0080f) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m518b(C0081g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo404a(int i);

    /* renamed from: a */
    public void mo386a(Context context, C0081g gVar) {
    }

    /* renamed from: a */
    public void mo648a(Rect rect) {
        this.f496f = rect;
    }

    /* renamed from: a */
    public abstract void mo405a(View view);

    /* renamed from: a */
    public abstract void mo406a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo407a(C0081g gVar);

    /* renamed from: a */
    public boolean mo394a(C0081g gVar, C0086j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo408b(int i);

    /* renamed from: b */
    public abstract void mo409b(boolean z);

    /* renamed from: b */
    public boolean mo397b(C0081g gVar, C0086j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo411c(int i);

    /* renamed from: c */
    public abstract void mo412c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo414d() {
        return true;
    }

    /* renamed from: e */
    public Rect mo649e() {
        return this.f496f;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m517a(listAdapter).f417f.mo459a((MenuItem) listAdapter.getItem(i), (C0097n) this, mo414d() ? 0 : 4);
    }
}
