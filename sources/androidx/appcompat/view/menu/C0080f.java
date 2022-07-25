package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0099o;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0080f extends BaseAdapter {

    /* renamed from: f */
    C0081g f417f;

    /* renamed from: g */
    private int f418g = -1;

    /* renamed from: h */
    private boolean f419h;

    /* renamed from: i */
    private final boolean f420i;

    /* renamed from: j */
    private final LayoutInflater f421j;

    /* renamed from: k */
    private final int f422k;

    public C0080f(C0081g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f420i = z;
        this.f421j = layoutInflater;
        this.f417f = gVar;
        this.f422k = i;
        mo435a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo435a() {
        C0086j f = this.f417f.mo489f();
        if (f != null) {
            ArrayList<C0086j> j = this.f417f.mo497j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.f418g = i;
                    return;
                }
            }
        }
        this.f418g = -1;
    }

    /* renamed from: a */
    public void mo436a(boolean z) {
        this.f419h = z;
    }

    /* renamed from: b */
    public C0081g mo437b() {
        return this.f417f;
    }

    public int getCount() {
        ArrayList<C0086j> j = this.f420i ? this.f417f.mo497j() : this.f417f.mo501n();
        int i = this.f418g;
        int size = j.size();
        return i < 0 ? size : size - 1;
    }

    public C0086j getItem(int i) {
        ArrayList<C0086j> j = this.f420i ? this.f417f.mo497j() : this.f417f.mo501n();
        int i2 = this.f418g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f421j.inflate(this.f422k, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f417f.mo502o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0099o.C0100a aVar = (C0099o.C0100a) view;
        if (this.f419h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo289a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo435a();
        super.notifyDataSetChanged();
    }
}
