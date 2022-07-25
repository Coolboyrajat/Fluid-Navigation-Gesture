package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0086j;
import androidx.appcompat.view.menu.C0099o;
import androidx.appcompat.widget.C0168d0;
import androidx.appcompat.widget.C0234t0;
import androidx.core.content.p002c.C0323f;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0348i;
import p006b.p007a.C0654a;
import p006b.p026g.p035k.C0838a;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.p036e0.C0857c;
import p054c.p083e.p084a.p085a.C1171d;
import p054c.p083e.p084a.p085a.C1172e;
import p054c.p083e.p084a.p085a.C1173f;
import p054c.p083e.p084a.p085a.C1175h;
import p190io.objectbox.model.PropertyFlags;

public class NavigationMenuItemView extends C2665d implements C0099o.C0100a {

    /* renamed from: K */
    private static final int[] f6995K = {16842912};

    /* renamed from: A */
    private int f6996A;

    /* renamed from: B */
    private boolean f6997B;

    /* renamed from: C */
    boolean f6998C;

    /* renamed from: D */
    private final CheckedTextView f6999D;

    /* renamed from: E */
    private FrameLayout f7000E;

    /* renamed from: F */
    private C0086j f7001F;

    /* renamed from: G */
    private ColorStateList f7002G;

    /* renamed from: H */
    private boolean f7003H;

    /* renamed from: I */
    private Drawable f7004I;

    /* renamed from: J */
    private final C0838a f7005J;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C2660a extends C0838a {
        C2660a() {
        }

        /* renamed from: a */
        public void mo2093a(View view, C0857c cVar) {
            super.mo2093a(view, cVar);
            cVar.mo4595b(NavigationMenuItemView.this.f6998C);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7005J = new C2660a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1175h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1171d.design_navigation_icon_size));
        this.f6999D = (CheckedTextView) findViewById(C1173f.design_menu_item_text);
        this.f6999D.setDuplicateParentStateEnabled(true);
        C0890v.m4752a((View) this.f6999D, this.f7005J);
    }

    /* renamed from: d */
    private void m10500d() {
        int i;
        C0168d0.C0169a aVar;
        if (m10502f()) {
            this.f6999D.setVisibility(8);
            FrameLayout frameLayout = this.f7000E;
            if (frameLayout != null) {
                aVar = (C0168d0.C0169a) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.f6999D.setVisibility(0);
            FrameLayout frameLayout2 = this.f7000E;
            if (frameLayout2 != null) {
                aVar = (C0168d0.C0169a) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        aVar.width = i;
        this.f7000E.setLayoutParams(aVar);
    }

    /* renamed from: e */
    private StateListDrawable m10501e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0654a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f6995K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: f */
    private boolean m10502f() {
        return this.f7001F.getTitle() == null && this.f7001F.getIcon() == null && this.f7001F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7000E == null) {
                this.f7000E = (FrameLayout) ((ViewStub) findViewById(C1173f.design_menu_item_action_area_stub)).inflate();
            }
            this.f7000E.removeAllViews();
            this.f7000E.addView(view);
        }
    }

    /* renamed from: a */
    public void mo289a(C0086j jVar, int i) {
        this.f7001F = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0890v.m4751a((View) this, (Drawable) m10501e());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0234t0.m1151a(this, jVar.getTooltipText());
        m10500d();
    }

    /* renamed from: a */
    public boolean mo290a() {
        return false;
    }

    public C0086j getItemData() {
        return this.f7001F;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0086j jVar = this.f7001F;
        if (jVar != null && jVar.isCheckable() && this.f7001F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f6995K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f6998C != z) {
            this.f6998C = z;
            this.f7005J.mo4547a((View) this.f6999D, (int) PropertyFlags.INDEX_HASH);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f6999D.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7003H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0328a.m1626i(drawable).mutate();
                C0328a.m1611a(drawable, this.f7002G);
            }
            int i = this.f6996A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f6997B) {
            if (this.f7004I == null) {
                this.f7004I = C0323f.m1584a(getResources(), C1172e.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f7004I;
                if (drawable2 != null) {
                    int i2 = this.f6996A;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f7004I;
        }
        C0348i.m1739a(this.f6999D, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f6999D.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f6996A = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f7002G = colorStateList;
        this.f7003H = this.f7002G != null;
        C0086j jVar = this.f7001F;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f6999D.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f6997B = z;
    }

    public void setTextAppearance(int i) {
        C0348i.m1748d(this.f6999D, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6999D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6999D.setText(charSequence);
    }
}
