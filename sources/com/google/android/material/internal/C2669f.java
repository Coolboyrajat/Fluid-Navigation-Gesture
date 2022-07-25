package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p054c.p083e.p084a.p085a.p099w.C1219d;
import p054c.p083e.p084a.p085a.p099w.C1223f;

/* renamed from: com.google.android.material.internal.f */
public class C2669f {

    /* renamed from: a */
    private final TextPaint f7075a = new TextPaint(1);

    /* renamed from: b */
    private final C1223f f7076b = new C2670a();

    /* renamed from: c */
    private float f7077c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f7078d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C2671b> f7079e = new WeakReference<>((Object) null);

    /* renamed from: f */
    private C1219d f7080f;

    /* renamed from: com.google.android.material.internal.f$a */
    class C2670a extends C1223f {
        C2670a() {
        }

        /* renamed from: a */
        public void mo5454a(int i) {
            boolean unused = C2669f.this.f7078d = true;
            C2671b bVar = (C2671b) C2669f.this.f7079e.get();
            if (bVar != null) {
                bVar.mo8131a();
            }
        }

        /* renamed from: a */
        public void mo5455a(Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C2669f.this.f7078d = true;
                C2671b bVar = (C2671b) C2669f.this.f7079e.get();
                if (bVar != null) {
                    bVar.mo8131a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    public interface C2671b {
        /* renamed from: a */
        void mo8131a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C2669f(C2671b bVar) {
        mo8552a(bVar);
    }

    /* renamed from: a */
    private float m10566a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7075a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public float mo8548a(String str) {
        if (!this.f7078d) {
            return this.f7077c;
        }
        this.f7077c = m10566a((CharSequence) str);
        this.f7078d = false;
        return this.f7077c;
    }

    /* renamed from: a */
    public C1219d mo8549a() {
        return this.f7080f;
    }

    /* renamed from: a */
    public void mo8550a(Context context) {
        this.f7080f.mo5462b(context, this.f7075a, this.f7076b);
    }

    /* renamed from: a */
    public void mo8551a(C1219d dVar, Context context) {
        if (this.f7080f != dVar) {
            this.f7080f = dVar;
            if (dVar != null) {
                dVar.mo5463c(context, this.f7075a, this.f7076b);
                C2671b bVar = (C2671b) this.f7079e.get();
                if (bVar != null) {
                    this.f7075a.drawableState = bVar.getState();
                }
                dVar.mo5462b(context, this.f7075a, this.f7076b);
                this.f7078d = true;
            }
            C2671b bVar2 = (C2671b) this.f7079e.get();
            if (bVar2 != null) {
                bVar2.mo8131a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: a */
    public void mo8552a(C2671b bVar) {
        this.f7079e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo8553a(boolean z) {
        this.f7078d = z;
    }

    /* renamed from: b */
    public TextPaint mo8554b() {
        return this.f7075a;
    }
}
