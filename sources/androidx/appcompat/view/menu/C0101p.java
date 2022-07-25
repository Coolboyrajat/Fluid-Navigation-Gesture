package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p006b.p026g.p028e.p029a.C0794a;

/* renamed from: androidx.appcompat.view.menu.p */
public class C0101p extends C0071c implements Menu {

    /* renamed from: d */
    private final C0794a f510d;

    public C0101p(Context context, C0794a aVar) {
        super(context);
        if (aVar != null) {
            this.f510d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo398a(this.f510d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo398a(this.f510d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo398a(this.f510d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo398a(this.f510d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f510d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo398a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo399a(this.f510d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo399a(this.f510d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo399a(this.f510d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo399a(this.f510d.addSubMenu(charSequence));
    }

    public void clear() {
        mo401b();
        this.f510d.clear();
    }

    public void close() {
        this.f510d.close();
    }

    public MenuItem findItem(int i) {
        return mo398a(this.f510d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo398a(this.f510d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f510d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f510d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f510d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f510d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo400a(i);
        this.f510d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo402b(i);
        this.f510d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f510d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f510d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f510d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f510d.setQwertyMode(z);
    }

    public int size() {
        return this.f510d.size();
    }
}
