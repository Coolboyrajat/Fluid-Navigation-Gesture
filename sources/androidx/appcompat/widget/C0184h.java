package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0342c;

/* renamed from: androidx.appcompat.widget.h */
class C0184h {

    /* renamed from: a */
    private final CompoundButton f952a;

    /* renamed from: b */
    private ColorStateList f953b = null;

    /* renamed from: c */
    private PorterDuff.Mode f954c = null;

    /* renamed from: d */
    private boolean f955d = false;

    /* renamed from: e */
    private boolean f956e = false;

    /* renamed from: f */
    private boolean f957f;

    C0184h(CompoundButton compoundButton) {
        this.f952a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0342c.m1718a(r2.f952a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1362a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f952a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0342c.m1718a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0184h.mo1362a(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1363a() {
        Drawable a = C0342c.m1718a(this.f952a);
        if (a == null) {
            return;
        }
        if (this.f955d || this.f956e) {
            Drawable mutate = C0328a.m1626i(a).mutate();
            if (this.f955d) {
                C0328a.m1611a(mutate, this.f953b);
            }
            if (this.f956e) {
                C0328a.m1614a(mutate, this.f954c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f952a.getDrawableState());
            }
            this.f952a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1364a(ColorStateList colorStateList) {
        this.f953b = colorStateList;
        this.f955d = true;
        mo1363a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1365a(PorterDuff.Mode mode) {
        this.f954c = mode;
        this.f956e = true;
        mo1363a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1366a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f952a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p006b.p007a.C0663j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = p006b.p007a.C0663j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = p006b.p007a.C0663j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f952a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f952a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = p006b.p007a.p008k.p009a.C0664a.m3682c(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = p006b.p007a.C0663j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = p006b.p007a.C0663j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f952a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f952a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = p006b.p007a.p008k.p009a.C0664a.m3682c(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = p006b.p007a.C0663j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f952a     // Catch:{ all -> 0x0080 }
            int r0 = p006b.p007a.C0663j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0342c.m1719a((android.widget.CompoundButton) r5, (android.content.res.ColorStateList) r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = p006b.p007a.C0663j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f952a     // Catch:{ all -> 0x0080 }
            int r0 = p006b.p007a.C0663j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0249z.m1265a(r0, r1)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.C0342c.m1720a((android.widget.CompoundButton) r5, (android.graphics.PorterDuff.Mode) r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0184h.mo1366a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1367b() {
        return this.f953b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1368c() {
        return this.f954c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1369d() {
        if (this.f957f) {
            this.f957f = false;
            return;
        }
        this.f957f = true;
        mo1363a();
    }
}
