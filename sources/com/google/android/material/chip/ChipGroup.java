package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.C2664c;
import com.google.android.material.internal.C2672g;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1177j;
import p054c.p083e.p084a.p085a.C1178k;

public class ChipGroup extends C2664c {

    /* renamed from: i */
    private int f6741i;

    /* renamed from: j */
    private int f6742j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6743k;

    /* renamed from: l */
    private C2595d f6744l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C2593b f6745m;

    /* renamed from: n */
    private C2596e f6746n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f6747o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f6748p;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C2593b implements CompoundButton.OnCheckedChangeListener {
        private C2593b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f6748p) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.f6747o == -1 || ChipGroup.this.f6747o == id || !ChipGroup.this.f6743k)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.m10100a(chipGroup.f6747o, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.f6747o == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C2594c extends ViewGroup.MarginLayoutParams {
        public C2594c(int i, int i2) {
            super(i, i2);
        }

        public C2594c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2594c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C2595d {
        /* renamed from: a */
        void mo8100a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C2596e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ViewGroup.OnHierarchyChangeListener f6750f;

        private C2596e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f6745m);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6750f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6750f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1169b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6745m = new C2593b();
        this.f6746n = new C2596e();
        this.f6747o = -1;
        this.f6748p = false;
        TypedArray c = C2672g.m10589c(context, attributeSet, C1178k.ChipGroup, i, C1177j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = c.getDimensionPixelOffset(C1178k.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(c.getDimensionPixelOffset(C1178k.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(c.getDimensionPixelOffset(C1178k.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(c.getBoolean(C1178k.ChipGroup_singleLine, false));
        setSingleSelection(c.getBoolean(C1178k.ChipGroup_singleSelection, false));
        int resourceId = c.getResourceId(C1178k.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f6747o = resourceId;
        }
        c.recycle();
        super.setOnHierarchyChangeListener(this.f6746n);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10100a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f6748p = true;
            ((Chip) findViewById).setChecked(z);
            this.f6748p = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f6747o = i;
        C2595d dVar = this.f6744l;
        if (dVar != null && this.f6743k) {
            dVar.mo8100a(this, i);
        }
    }

    /* renamed from: a */
    public boolean mo8071a() {
        return super.mo8071a();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f6747o;
                if (i2 != -1 && this.f6743k) {
                    m10100a(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo8073b() {
        this.f6748p = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f6748p = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2594c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2594c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2594c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C2594c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f6743k) {
            return this.f6747o;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f6741i;
    }

    public int getChipSpacingVertical() {
        return this.f6742j;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f6747o;
        if (i != -1) {
            m10100a(i, true);
            setCheckedId(this.f6747o);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f6741i != i) {
            this.f6741i = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f6742j != i) {
            this.f6742j = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C2595d dVar) {
        this.f6744l = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f6746n.f6750f = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f6743k != z) {
            this.f6743k = z;
            mo8073b();
        }
    }
}
