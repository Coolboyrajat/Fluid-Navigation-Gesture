package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0081g;

/* renamed from: androidx.appcompat.view.menu.s */
public class C0106s extends C0081g implements SubMenu {

    /* renamed from: B */
    private C0081g f534B;

    /* renamed from: C */
    private C0086j f535C;

    public C0106s(Context context, C0081g gVar, C0086j jVar) {
        super(context);
        this.f534B = gVar;
        this.f535C = jVar;
    }

    /* renamed from: a */
    public void mo453a(C0081g.C0082a aVar) {
        this.f534B.mo453a(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo460a(C0081g gVar, MenuItem menuItem) {
        return super.mo460a(gVar, menuItem) || this.f534B.mo460a(gVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo461a(C0086j jVar) {
        return this.f534B.mo461a(jVar);
    }

    /* renamed from: b */
    public boolean mo476b(C0086j jVar) {
        return this.f534B.mo476b(jVar);
    }

    /* renamed from: d */
    public String mo485d() {
        C0086j jVar = this.f535C;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo485d() + ":" + itemId;
    }

    public MenuItem getItem() {
        return this.f535C;
    }

    /* renamed from: m */
    public C0081g mo500m() {
        return this.f534B.mo500m();
    }

    /* renamed from: o */
    public boolean mo502o() {
        return this.f534B.mo502o();
    }

    /* renamed from: p */
    public boolean mo503p() {
        return this.f534B.mo503p();
    }

    /* renamed from: q */
    public boolean mo506q() {
        return this.f534B.mo506q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f534B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo484d(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo446a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo488e(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo448a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo447a(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f535C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f535C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f534B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo701t() {
        return this.f534B;
    }
}
