package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p054c.p083e.p084a.p085a.p100x.C1227b;
import p054c.p083e.p084a.p085a.p101y.C1229b;

/* renamed from: com.google.android.material.floatingactionbutton.c */
class C2655c extends C2643b {
    C2655c(FloatingActionButton floatingActionButton, C1229b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: a */
    private Animator m10476a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f6972z, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f6972z, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C2643b.f6934G);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8408a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f6972z.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C2643b.f6935H, m10476a(f, f3));
            stateListAnimator.addState(C2643b.f6936I, m10476a(f, f2));
            stateListAnimator.addState(C2643b.f6937J, m10476a(f, f2));
            stateListAnimator.addState(C2643b.f6938K, m10476a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f6972z, "elevation", new float[]{f}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f6972z;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f6972z, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C2643b.f6934G);
            stateListAnimator.addState(C2643b.f6939L, animatorSet);
            stateListAnimator.addState(C2643b.f6940M, m10476a(0.0f, 0.0f));
            this.f6972z.setStateListAnimator(stateListAnimator);
        }
        if (mo8446s()) {
            mo8450w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8412a(Rect rect) {
        if (this.f6941A.mo5481a()) {
            super.mo8412a(rect);
            return;
        }
        int sizeDimension = !mo8447t() ? (this.f6958l - this.f6972z.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8418a(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f6972z.isEnabled()) {
                this.f6972z.setElevation(this.f6955i);
                if (this.f6972z.isPressed()) {
                    floatingActionButton = this.f6972z;
                    f = this.f6957k;
                } else if (this.f6972z.isFocused() || this.f6972z.isHovered()) {
                    floatingActionButton = this.f6972z;
                    f = this.f6956j;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f6972z.setElevation(0.0f);
            floatingActionButton = this.f6972z;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* renamed from: b */
    public float mo8419b() {
        return this.f6972z.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8422b(ColorStateList colorStateList) {
        Drawable drawable = this.f6949c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C1227b.m5883a(colorStateList));
        } else {
            super.mo8422b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8438k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8440m() {
        mo8450w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo8445r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo8446s() {
        return this.f6941A.mo5481a() || !mo8447t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo8448u() {
    }
}
