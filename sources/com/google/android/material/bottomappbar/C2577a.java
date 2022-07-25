package com.google.android.material.bottomappbar;

import p054c.p083e.p084a.p085a.p102z.C1232c;
import p054c.p083e.p084a.p085a.p102z.C1244i;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C2577a extends C1232c implements Cloneable {

    /* renamed from: f */
    private float f6629f;

    /* renamed from: g */
    private float f6630g;

    /* renamed from: h */
    private float f6631h;

    /* renamed from: i */
    private float f6632i;

    /* renamed from: j */
    private float f6633j;

    public C2577a(float f, float f2, float f3) {
        this.f6630g = f;
        this.f6629f = f2;
        this.f6632i = f3;
        if (f3 >= 0.0f) {
            this.f6633j = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo7825a() {
        return this.f6632i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7826a(float f) {
        this.f6632i = f;
    }

    /* renamed from: a */
    public void mo5485a(float f, float f2, float f3, C1244i iVar) {
        float f4 = f;
        C1244i iVar2 = iVar;
        float f5 = this.f6631h;
        if (f5 == 0.0f) {
            iVar2.mo5563a(f4, 0.0f);
            return;
        }
        float f6 = ((this.f6630g * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f6629f;
        float f8 = f2 + this.f6633j;
        float f9 = (this.f6632i * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            iVar2.mo5563a(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        iVar2.mo5563a(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        iVar.mo5565a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        iVar.mo5565a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        iVar.mo5565a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        iVar2.mo5563a(f4, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo7827b() {
        return this.f6630g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7828b(float f) {
        this.f6630g = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo7829c() {
        return this.f6629f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7830c(float f) {
        this.f6629f = f;
    }

    /* renamed from: d */
    public float mo7831d() {
        return this.f6631h;
    }

    /* renamed from: d */
    public void mo7832d(float f) {
        this.f6631h = f;
    }

    /* renamed from: e */
    public float mo7833e() {
        return this.f6633j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7834e(float f) {
        this.f6633j = f;
    }
}
