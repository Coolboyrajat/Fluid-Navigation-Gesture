package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0099o;
import androidx.core.graphics.drawable.C0328a;
import p006b.p007a.C0661h;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p028e.p029a.C0795b;
import p006b.p026g.p035k.C0841b;
import p190io.objectbox.android.BuildConfig;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: androidx.appcompat.view.menu.j */
public final class C0086j implements C0795b {

    /* renamed from: A */
    private View f454A;

    /* renamed from: B */
    private C0841b f455B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f456C;

    /* renamed from: D */
    private boolean f457D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f458E;

    /* renamed from: a */
    private final int f459a;

    /* renamed from: b */
    private final int f460b;

    /* renamed from: c */
    private final int f461c;

    /* renamed from: d */
    private final int f462d;

    /* renamed from: e */
    private CharSequence f463e;

    /* renamed from: f */
    private CharSequence f464f;

    /* renamed from: g */
    private Intent f465g;

    /* renamed from: h */
    private char f466h;

    /* renamed from: i */
    private int f467i = PropertyFlags.INDEX_HASH64;

    /* renamed from: j */
    private char f468j;

    /* renamed from: k */
    private int f469k = PropertyFlags.INDEX_HASH64;

    /* renamed from: l */
    private Drawable f470l;

    /* renamed from: m */
    private int f471m = 0;

    /* renamed from: n */
    C0081g f472n;

    /* renamed from: o */
    private C0106s f473o;

    /* renamed from: p */
    private Runnable f474p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f475q;

    /* renamed from: r */
    private CharSequence f476r;

    /* renamed from: s */
    private CharSequence f477s;

    /* renamed from: t */
    private ColorStateList f478t = null;

    /* renamed from: u */
    private PorterDuff.Mode f479u = null;

    /* renamed from: v */
    private boolean f480v = false;

    /* renamed from: w */
    private boolean f481w = false;

    /* renamed from: x */
    private boolean f482x = false;

    /* renamed from: y */
    private int f483y = 16;

    /* renamed from: z */
    private int f484z = 0;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    class C0087a implements C0841b.C0843b {
        C0087a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0086j jVar = C0086j.this;
            jVar.f472n.mo486d(jVar);
        }
    }

    C0086j(C0081g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f472n = gVar;
        this.f459a = i2;
        this.f460b = i;
        this.f461c = i3;
        this.f462d = i4;
        this.f463e = charSequence;
        this.f484z = i5;
    }

    /* renamed from: a */
    private Drawable m479a(Drawable drawable) {
        if (drawable != null && this.f482x && (this.f480v || this.f481w)) {
            drawable = C0328a.m1626i(drawable).mutate();
            if (this.f480v) {
                C0328a.m1611a(drawable, this.f478t);
            }
            if (this.f481w) {
                C0328a.m1614a(drawable, this.f479u);
            }
            this.f482x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m480a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public C0795b mo326a(C0841b bVar) {
        C0841b bVar2 = this.f455B;
        if (bVar2 != null) {
            bVar2.mo4562f();
        }
        this.f454A = null;
        this.f455B = bVar;
        this.f472n.mo475b(true);
        C0841b bVar3 = this.f455B;
        if (bVar3 != null) {
            bVar3.mo638a((C0841b.C0843b) new C0087a());
        }
        return this;
    }

    /* renamed from: a */
    public C0841b mo327a() {
        return this.f455B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo522a(C0099o.C0100a aVar) {
        return (aVar == null || !aVar.mo290a()) ? getTitle() : getTitleCondensed();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo523a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f458E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo524a(C0106s sVar) {
        this.f473o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public void mo525a(boolean z) {
        this.f457D = z;
        this.f472n.mo475b(false);
    }

    /* renamed from: b */
    public void mo526b() {
        this.f472n.mo479c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo527b(boolean z) {
        int i = this.f483y;
        this.f483y = (z ? 2 : 0) | (i & -3);
        if (i != this.f483y) {
            this.f472n.mo475b(false);
        }
    }

    /* renamed from: c */
    public int mo528c() {
        return this.f462d;
    }

    /* renamed from: c */
    public void mo529c(boolean z) {
        this.f483y = (z ? 4 : 0) | (this.f483y & -5);
    }

    public boolean collapseActionView() {
        if ((this.f484z & 8) == 0) {
            return false;
        }
        if (this.f454A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f456C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f472n.mo461a(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo530d() {
        return this.f472n.mo503p() ? this.f468j : this.f466h;
    }

    /* renamed from: d */
    public void mo531d(boolean z) {
        this.f483y = z ? this.f483y | 32 : this.f483y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo532e() {
        int i;
        char d = mo530d();
        if (d == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f472n.mo487e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f472n.mo487e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0661h.abc_prepend_shortcut_label));
        }
        int i2 = this.f472n.mo503p() ? this.f469k : this.f467i;
        m480a(sb, i2, 65536, resources.getString(C0661h.abc_menu_meta_shortcut_label));
        m480a(sb, i2, PropertyFlags.INDEX_HASH64, resources.getString(C0661h.abc_menu_ctrl_shortcut_label));
        m480a(sb, i2, 2, resources.getString(C0661h.abc_menu_alt_shortcut_label));
        m480a(sb, i2, 1, resources.getString(C0661h.abc_menu_shift_shortcut_label));
        m480a(sb, i2, 4, resources.getString(C0661h.abc_menu_sym_shortcut_label));
        m480a(sb, i2, 8, resources.getString(C0661h.abc_menu_function_shortcut_label));
        if (d == 8) {
            i = C0661h.abc_menu_delete_shortcut_label;
        } else if (d == 10) {
            i = C0661h.abc_menu_enter_shortcut_label;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            i = C0661h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo533e(boolean z) {
        int i = this.f483y;
        this.f483y = (z ? 0 : 8) | (i & -9);
        return i != this.f483y;
    }

    public boolean expandActionView() {
        if (!mo534f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f456C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f472n.mo476b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo534f() {
        C0841b bVar;
        if ((this.f484z & 8) == 0) {
            return false;
        }
        if (this.f454A == null && (bVar = this.f455B) != null) {
            this.f454A = bVar.mo637a((MenuItem) this);
        }
        return this.f454A != null;
    }

    /* renamed from: g */
    public boolean mo535g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f475q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0081g gVar = this.f472n;
        if (gVar.mo460a(gVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f474p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f465g != null) {
            try {
                this.f472n.mo487e().startActivity(this.f465g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0841b bVar = this.f455B;
        return bVar != null && bVar.mo636d();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f454A;
        if (view != null) {
            return view;
        }
        C0841b bVar = this.f455B;
        if (bVar == null) {
            return null;
        }
        this.f454A = bVar.mo637a((MenuItem) this);
        return this.f454A;
    }

    public int getAlphabeticModifiers() {
        return this.f469k;
    }

    public char getAlphabeticShortcut() {
        return this.f468j;
    }

    public CharSequence getContentDescription() {
        return this.f476r;
    }

    public int getGroupId() {
        return this.f460b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f470l;
        if (drawable != null) {
            return m479a(drawable);
        }
        if (this.f471m == 0) {
            return null;
        }
        Drawable c = C0664a.m3682c(this.f472n.mo487e(), this.f471m);
        this.f471m = 0;
        this.f470l = c;
        return m479a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f478t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f479u;
    }

    public Intent getIntent() {
        return this.f465g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f459a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f458E;
    }

    public int getNumericModifiers() {
        return this.f467i;
    }

    public char getNumericShortcut() {
        return this.f466h;
    }

    public int getOrder() {
        return this.f461c;
    }

    public SubMenu getSubMenu() {
        return this.f473o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f463e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f464f;
        if (charSequence == null) {
            charSequence = this.f463e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f477s;
    }

    /* renamed from: h */
    public boolean mo548h() {
        return (this.f483y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f473o != null;
    }

    /* renamed from: i */
    public boolean mo550i() {
        return (this.f483y & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f457D;
    }

    public boolean isCheckable() {
        return (this.f483y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f483y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f483y & 16) != 0;
    }

    public boolean isVisible() {
        C0841b bVar = this.f455B;
        return (bVar == null || !bVar.mo640e()) ? (this.f483y & 8) == 0 : (this.f483y & 8) == 0 && this.f455B.mo639b();
    }

    /* renamed from: j */
    public boolean mo555j() {
        return (this.f484z & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo556k() {
        return (this.f484z & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo557l() {
        return this.f472n.mo498k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo558m() {
        return this.f472n.mo506q() && mo530d() != 0;
    }

    /* renamed from: n */
    public boolean mo559n() {
        return (this.f484z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public C0795b setActionView(int i) {
        Context e = this.f472n.mo487e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public C0795b setActionView(View view) {
        int i;
        this.f454A = view;
        this.f455B = null;
        if (view != null && view.getId() == -1 && (i = this.f459a) > 0) {
            view.setId(i);
        }
        this.f472n.mo479c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f468j == c) {
            return this;
        }
        this.f468j = Character.toLowerCase(c);
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f468j == c && this.f469k == i) {
            return this;
        }
        this.f468j = Character.toLowerCase(c);
        this.f469k = KeyEvent.normalizeMetaState(i);
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f483y;
        this.f483y = z | (i & true) ? 1 : 0;
        if (i != this.f483y) {
            this.f472n.mo475b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f483y & 4) != 0) {
            this.f472n.mo452a((MenuItem) this);
        } else {
            mo527b(z);
        }
        return this;
    }

    public C0795b setContentDescription(CharSequence charSequence) {
        this.f476r = charSequence;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f483y = z ? this.f483y | 16 : this.f483y & -17;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f470l = null;
        this.f471m = i;
        this.f482x = true;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f471m = 0;
        this.f470l = drawable;
        this.f482x = true;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f478t = colorStateList;
        this.f480v = true;
        this.f482x = true;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f479u = mode;
        this.f481w = true;
        this.f482x = true;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f465g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f466h == c) {
            return this;
        }
        this.f466h = c;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f466h == c && this.f467i == i) {
            return this;
        }
        this.f466h = c;
        this.f467i = KeyEvent.normalizeMetaState(i);
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f456C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f475q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f466h = c;
        this.f468j = Character.toLowerCase(c2);
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f466h = c;
        this.f467i = KeyEvent.normalizeMetaState(i);
        this.f468j = Character.toLowerCase(c2);
        this.f469k = KeyEvent.normalizeMetaState(i2);
        this.f472n.mo475b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f484z = i;
            this.f472n.mo479c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public C0795b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f472n.mo487e().getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f463e = charSequence;
        this.f472n.mo475b(false);
        C0106s sVar = this.f473o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f464f = charSequence;
        this.f472n.mo475b(false);
        return this;
    }

    public C0795b setTooltipText(CharSequence charSequence) {
        this.f477s = charSequence;
        this.f472n.mo475b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo533e(z)) {
            this.f472n.mo486d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f463e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
