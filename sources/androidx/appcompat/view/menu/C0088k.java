package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p006b.p007a.p014o.C0687c;
import p006b.p026g.p028e.p029a.C0795b;
import p006b.p026g.p035k.C0841b;

/* renamed from: androidx.appcompat.view.menu.k */
public class C0088k extends C0071c implements MenuItem {

    /* renamed from: d */
    private final C0795b f486d;

    /* renamed from: e */
    private Method f487e;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    private class C0089a extends C0841b {

        /* renamed from: b */
        final ActionProvider f488b;

        C0089a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f488b = actionProvider;
        }

        /* renamed from: a */
        public void mo633a(SubMenu subMenu) {
            this.f488b.onPrepareSubMenu(C0088k.this.mo399a(subMenu));
        }

        /* renamed from: a */
        public boolean mo634a() {
            return this.f488b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo635c() {
            return this.f488b.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo636d() {
            return this.f488b.onPerformDefaultAction();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    private class C0090b extends C0089a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private C0841b.C0843b f490d;

        C0090b(C0088k kVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo637a(MenuItem menuItem) {
            return this.f488b.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo638a(C0841b.C0843b bVar) {
            this.f490d = bVar;
            this.f488b.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo639b() {
            return this.f488b.isVisible();
        }

        /* renamed from: e */
        public boolean mo640e() {
            return this.f488b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0841b.C0843b bVar = this.f490d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$c */
    static class C0091c extends FrameLayout implements C0687c {

        /* renamed from: f */
        final CollapsibleActionView f491f;

        C0091c(View view) {
            super(view.getContext());
            this.f491f = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo642a() {
            return (View) this.f491f;
        }

        /* renamed from: b */
        public void mo643b() {
            this.f491f.onActionViewExpanded();
        }

        /* renamed from: c */
        public void mo644c() {
            this.f491f.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$d */
    private class C0092d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f492a;

        C0092d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f492a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f492a.onMenuItemActionCollapse(C0088k.this.mo398a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f492a.onMenuItemActionExpand(C0088k.this.mo398a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$e */
    private class C0093e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f494a;

        C0093e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f494a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f494a.onMenuItemClick(C0088k.this.mo398a(menuItem));
        }
    }

    public C0088k(Context context, C0795b bVar) {
        super(context);
        if (bVar != null) {
            this.f486d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo578a(boolean z) {
        try {
            if (this.f487e == null) {
                this.f487e = this.f486d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f487e.invoke(this.f486d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.f486d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f486d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0841b a = this.f486d.mo327a();
        if (a instanceof C0089a) {
            return ((C0089a) a).f488b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f486d.getActionView();
        return actionView instanceof C0091c ? ((C0091c) actionView).mo642a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f486d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f486d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f486d.getContentDescription();
    }

    public int getGroupId() {
        return this.f486d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f486d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f486d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f486d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f486d.getIntent();
    }

    public int getItemId() {
        return this.f486d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f486d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f486d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f486d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f486d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo399a(this.f486d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f486d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f486d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f486d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f486d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f486d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f486d.isCheckable();
    }

    public boolean isChecked() {
        return this.f486d.isChecked();
    }

    public boolean isEnabled() {
        return this.f486d.isEnabled();
    }

    public boolean isVisible() {
        return this.f486d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0841b bVar = Build.VERSION.SDK_INT >= 16 ? new C0090b(this, this.f366a, actionProvider) : new C0089a(this.f366a, actionProvider);
        C0795b bVar2 = this.f486d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo326a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f486d.setActionView(i);
        View actionView = this.f486d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f486d.setActionView((View) new C0091c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0091c(view);
        }
        this.f486d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f486d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f486d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f486d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f486d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f486d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f486d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f486d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f486d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f486d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f486d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f486d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f486d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f486d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f486d.setOnActionExpandListener(onActionExpandListener != null ? new C0092d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f486d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0093e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f486d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f486d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f486d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f486d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f486d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f486d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f486d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f486d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f486d.setVisible(z);
    }
}
