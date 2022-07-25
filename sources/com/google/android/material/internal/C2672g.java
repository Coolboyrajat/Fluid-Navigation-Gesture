package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0217r0;
import p006b.p007a.p014o.C0688d;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.C1178k;

/* renamed from: com.google.android.material.internal.g */
public final class C2672g {

    /* renamed from: a */
    private static final int[] f7082a = {C1169b.colorPrimary};

    /* renamed from: b */
    private static final int[] f7083b = {C1169b.colorPrimaryVariant};

    /* renamed from: c */
    private static final int[] f7084c = {16842752, C1169b.theme};

    /* renamed from: d */
    private static final int[] f7085d = {C1169b.materialThemeOverlay};

    /* renamed from: a */
    private static int m10579a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7084c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: a */
    public static void m10580a(Context context) {
        m10583a(context, f7082a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static void m10581a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C1178k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1169b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m10586b(context);
            }
        }
        m10580a(context);
    }

    /* renamed from: a */
    private static void m10582a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1178k.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C1178k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        boolean b = (iArr2 == null || iArr2.length == 0) ? obtainStyledAttributes.getResourceId(C1178k.ThemeEnforcement_android_textAppearance, -1) != -1 : m10587b(context, attributeSet, iArr, i, i2, iArr2);
        obtainStyledAttributes.recycle();
        if (!b) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    private static void m10583a(Context context, int[] iArr, String str) {
        if (!m10584a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: a */
    private static boolean m10584a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: b */
    public static Context m10585b(Context context, AttributeSet attributeSet, int i, int i2) {
        int c = m10588c(context, attributeSet, i, i2);
        if (c == 0) {
            return context;
        }
        if ((context instanceof C0688d) && ((C0688d) context).mo3897a() == c) {
            return context;
        }
        C0688d dVar = new C0688d(context, c);
        int a = m10579a((Context) dVar, attributeSet);
        return a != 0 ? new C0688d((Context) dVar, a) : dVar;
    }

    /* renamed from: b */
    public static void m10586b(Context context) {
        m10583a(context, f7083b, "Theme.MaterialComponents");
    }

    /* renamed from: b */
    private static boolean m10587b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    private static int m10588c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7085d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static TypedArray m10589c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10581a(context, attributeSet, i, i2);
        m10582a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0217r0 m10590d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m10581a(context, attributeSet, i, i2);
        m10582a(context, attributeSet, iArr, i, i2, iArr2);
        return C0217r0.m1054a(context, attributeSet, iArr, i, i2);
    }
}
