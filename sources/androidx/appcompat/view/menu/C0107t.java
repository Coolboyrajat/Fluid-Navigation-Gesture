package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p006b.p026g.p028e.p029a.C0796c;

/* renamed from: androidx.appcompat.view.menu.t */
class C0107t extends C0101p implements SubMenu {

    /* renamed from: e */
    private final C0796c f536e;

    C0107t(Context context, C0796c cVar) {
        super(context, cVar);
        this.f536e = cVar;
    }

    public void clearHeader() {
        this.f536e.clearHeader();
    }

    public MenuItem getItem() {
        return mo398a(this.f536e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f536e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f536e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f536e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f536e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f536e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f536e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f536e.setIcon(drawable);
        return this;
    }
}
