package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0311a;
import androidx.core.graphics.drawable.C0328a;
import p006b.p026g.p028e.p029a.C0795b;
import p006b.p026g.p035k.C0841b;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0069a implements C0795b {

    /* renamed from: a */
    private final int f339a;

    /* renamed from: b */
    private final int f340b;

    /* renamed from: c */
    private final int f341c;

    /* renamed from: d */
    private CharSequence f342d;

    /* renamed from: e */
    private CharSequence f343e;

    /* renamed from: f */
    private Intent f344f;

    /* renamed from: g */
    private char f345g;

    /* renamed from: h */
    private int f346h = PropertyFlags.INDEX_HASH64;

    /* renamed from: i */
    private char f347i;

    /* renamed from: j */
    private int f348j = PropertyFlags.INDEX_HASH64;

    /* renamed from: k */
    private Drawable f349k;

    /* renamed from: l */
    private Context f350l;

    /* renamed from: m */
    private CharSequence f351m;

    /* renamed from: n */
    private CharSequence f352n;

    /* renamed from: o */
    private ColorStateList f353o = null;

    /* renamed from: p */
    private PorterDuff.Mode f354p = null;

    /* renamed from: q */
    private boolean f355q = false;

    /* renamed from: r */
    private boolean f356r = false;

    /* renamed from: s */
    private int f357s = 16;

    public C0069a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f350l = context;
        this.f339a = i2;
        this.f340b = i;
        this.f341c = i4;
        this.f342d = charSequence;
    }

    /* renamed from: b */
    private void m351b() {
        if (this.f349k == null) {
            return;
        }
        if (this.f355q || this.f356r) {
            this.f349k = C0328a.m1626i(this.f349k);
            this.f349k = this.f349k.mutate();
            if (this.f355q) {
                C0328a.m1611a(this.f349k, this.f353o);
            }
            if (this.f356r) {
                C0328a.m1614a(this.f349k, this.f354p);
            }
        }
    }

    /* renamed from: a */
    public C0795b mo326a(C0841b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0841b mo327a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f348j;
    }

    public char getAlphabeticShortcut() {
        return this.f347i;
    }

    public CharSequence getContentDescription() {
        return this.f351m;
    }

    public int getGroupId() {
        return this.f340b;
    }

    public Drawable getIcon() {
        return this.f349k;
    }

    public ColorStateList getIconTintList() {
        return this.f353o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f354p;
    }

    public Intent getIntent() {
        return this.f344f;
    }

    public int getItemId() {
        return this.f339a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f346h;
    }

    public char getNumericShortcut() {
        return this.f345g;
    }

    public int getOrder() {
        return this.f341c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f342d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f343e;
        return charSequence != null ? charSequence : this.f342d;
    }

    public CharSequence getTooltipText() {
        return this.f352n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f357s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f357s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f357s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f357s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public C0795b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public C0795b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f347i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f347i = Character.toLowerCase(c);
        this.f348j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f357s = z | (this.f357s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f357s = (z ? 2 : 0) | (this.f357s & -3);
        return this;
    }

    public C0795b setContentDescription(CharSequence charSequence) {
        this.f351m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f357s = (z ? 16 : 0) | (this.f357s & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f349k = C0311a.m1534c(this.f350l, i);
        m351b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f349k = drawable;
        m351b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f353o = colorStateList;
        this.f355q = true;
        m351b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f354p = mode;
        this.f356r = true;
        m351b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f344f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f345g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f345g = c;
        this.f346h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f345g = c;
        this.f347i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f345g = c;
        this.f346h = KeyEvent.normalizeMetaState(i);
        this.f347i = Character.toLowerCase(c2);
        this.f348j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public C0795b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f342d = this.f350l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f342d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f343e = charSequence;
        return this;
    }

    public C0795b setTooltipText(CharSequence charSequence) {
        this.f352n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f357s & 8;
        if (z) {
            i = 0;
        }
        this.f357s = i2 | i;
        return this;
    }
}
