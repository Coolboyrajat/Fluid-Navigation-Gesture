package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.widget.C0217r0;

public final class ExpandedMenuView extends ListView implements C0081g.C0083b, C0099o, AdapterView.OnItemClickListener {

    /* renamed from: h */
    private static final int[] f319h = {16842964, 16843049};

    /* renamed from: f */
    private C0081g f320f;

    /* renamed from: g */
    private int f321g;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0217r0 a = C0217r0.m1054a(context, attributeSet, f319h, i, 0);
        if (a.mo1545g(0)) {
            setBackgroundDrawable(a.mo1535b(0));
        }
        if (a.mo1545g(1)) {
            setDivider(a.mo1535b(1));
        }
        a.mo1531a();
    }

    /* renamed from: a */
    public void mo311a(C0081g gVar) {
        this.f320f = gVar;
    }

    /* renamed from: a */
    public boolean mo312a(C0086j jVar) {
        return this.f320f.mo458a((MenuItem) jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f321g;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo312a((C0086j) getAdapter().getItem(i));
    }
}
