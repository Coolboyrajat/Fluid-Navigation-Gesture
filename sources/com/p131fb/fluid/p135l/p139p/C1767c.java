package com.p131fb.fluid.p135l.p139p;

import android.graphics.Color;

/* renamed from: com.fb.fluid.l.p.c */
public final class C1767c {
    /* renamed from: a */
    public static final int m7444a(int i, float f) {
        return Color.argb(C3388c.m12269a(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public static final int m7445a(int i, int i2) {
        return Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    public static final boolean m7446a(int i) {
        return ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) > ((double) 0.5f);
    }

    /* renamed from: b */
    public static final int m7447b(int i, float f) {
        return Color.argb((int) (((float) 255) * f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
