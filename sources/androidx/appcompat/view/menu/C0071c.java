package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p006b.p021d.C0723a;
import p006b.p026g.p028e.p029a.C0795b;
import p006b.p026g.p028e.p029a.C0796c;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0071c {

    /* renamed from: a */
    final Context f366a;

    /* renamed from: b */
    private Map<C0795b, MenuItem> f367b;

    /* renamed from: c */
    private Map<C0796c, SubMenu> f368c;

    C0071c(Context context) {
        this.f366a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo398a(MenuItem menuItem) {
        if (!(menuItem instanceof C0795b)) {
            return menuItem;
        }
        C0795b bVar = (C0795b) menuItem;
        if (this.f367b == null) {
            this.f367b = new C0723a();
        }
        MenuItem menuItem2 = this.f367b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0088k kVar = new C0088k(this.f366a, bVar);
        this.f367b.put(bVar, kVar);
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo399a(SubMenu subMenu) {
        if (!(subMenu instanceof C0796c)) {
            return subMenu;
        }
        C0796c cVar = (C0796c) subMenu;
        if (this.f368c == null) {
            this.f368c = new C0723a();
        }
        SubMenu subMenu2 = this.f368c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0107t tVar = new C0107t(this.f366a, cVar);
        this.f368c.put(cVar, tVar);
        return tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo400a(int i) {
        Map<C0795b, MenuItem> map = this.f367b;
        if (map != null) {
            Iterator<C0795b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo401b() {
        Map<C0795b, MenuItem> map = this.f367b;
        if (map != null) {
            map.clear();
        }
        Map<C0796c, SubMenu> map2 = this.f368c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo402b(int i) {
        Map<C0795b, MenuItem> map = this.f367b;
        if (map != null) {
            Iterator<C0795b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
