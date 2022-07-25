package p054c.p083e.p084a.p085a.p099w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p002c.C0323f;
import p054c.p083e.p084a.p085a.C1178k;

/* renamed from: c.e.a.a.w.d */
public class C1219d {

    /* renamed from: a */
    public final float f3972a;

    /* renamed from: b */
    public final ColorStateList f3973b;

    /* renamed from: c */
    public final int f3974c;

    /* renamed from: d */
    public final int f3975d;

    /* renamed from: e */
    public final String f3976e;

    /* renamed from: f */
    public final ColorStateList f3977f;

    /* renamed from: g */
    public final float f3978g;

    /* renamed from: h */
    public final float f3979h;

    /* renamed from: i */
    public final float f3980i;

    /* renamed from: j */
    private final int f3981j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f3982k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Typeface f3983l;

    /* renamed from: c.e.a.a.w.d$a */
    class C1220a extends C0323f.C0324a {

        /* renamed from: a */
        final /* synthetic */ C1223f f3984a;

        C1220a(C1223f fVar) {
            this.f3984a = fVar;
        }

        /* renamed from: a */
        public void mo1671a(int i) {
            boolean unused = C1219d.this.f3982k = true;
            this.f3984a.mo5454a(i);
        }

        /* renamed from: a */
        public void mo1672a(Typeface typeface) {
            C1219d dVar = C1219d.this;
            Typeface unused = dVar.f3983l = Typeface.create(typeface, dVar.f3974c);
            boolean unused2 = C1219d.this.f3982k = true;
            this.f3984a.mo5455a(C1219d.this.f3983l, false);
        }
    }

    /* renamed from: c.e.a.a.w.d$b */
    class C1221b extends C1223f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f3986a;

        /* renamed from: b */
        final /* synthetic */ C1223f f3987b;

        C1221b(TextPaint textPaint, C1223f fVar) {
            this.f3986a = textPaint;
            this.f3987b = fVar;
        }

        /* renamed from: a */
        public void mo5454a(int i) {
            this.f3987b.mo5454a(i);
        }

        /* renamed from: a */
        public void mo5455a(Typeface typeface, boolean z) {
            C1219d.this.mo5461a(this.f3986a, typeface);
            this.f3987b.mo5455a(typeface, z);
        }
    }

    public C1219d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1178k.TextAppearance);
        this.f3972a = obtainStyledAttributes.getDimension(C1178k.TextAppearance_android_textSize, 0.0f);
        this.f3973b = C1218c.m5861a(context, obtainStyledAttributes, C1178k.TextAppearance_android_textColor);
        C1218c.m5861a(context, obtainStyledAttributes, C1178k.TextAppearance_android_textColorHint);
        C1218c.m5861a(context, obtainStyledAttributes, C1178k.TextAppearance_android_textColorLink);
        this.f3974c = obtainStyledAttributes.getInt(C1178k.TextAppearance_android_textStyle, 0);
        this.f3975d = obtainStyledAttributes.getInt(C1178k.TextAppearance_android_typeface, 1);
        int a = C1218c.m5860a(obtainStyledAttributes, C1178k.TextAppearance_fontFamily, C1178k.TextAppearance_android_fontFamily);
        this.f3981j = obtainStyledAttributes.getResourceId(a, 0);
        this.f3976e = obtainStyledAttributes.getString(a);
        obtainStyledAttributes.getBoolean(C1178k.TextAppearance_textAllCaps, false);
        this.f3977f = C1218c.m5861a(context, obtainStyledAttributes, C1178k.TextAppearance_android_shadowColor);
        this.f3978g = obtainStyledAttributes.getFloat(C1178k.TextAppearance_android_shadowDx, 0.0f);
        this.f3979h = obtainStyledAttributes.getFloat(C1178k.TextAppearance_android_shadowDy, 0.0f);
        this.f3980i = obtainStyledAttributes.getFloat(C1178k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m5868b() {
        String str;
        if (this.f3983l == null && (str = this.f3976e) != null) {
            this.f3983l = Typeface.create(str, this.f3974c);
        }
        if (this.f3983l == null) {
            int i = this.f3975d;
            this.f3983l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f3983l = Typeface.create(this.f3983l, this.f3974c);
        }
    }

    /* renamed from: a */
    public Typeface mo5457a() {
        m5868b();
        return this.f3983l;
    }

    /* renamed from: a */
    public Typeface mo5458a(Context context) {
        if (this.f3982k) {
            return this.f3983l;
        }
        if (!context.isRestricted()) {
            try {
                this.f3983l = C0323f.m1580a(context, this.f3981j);
                if (this.f3983l != null) {
                    this.f3983l = Typeface.create(this.f3983l, this.f3974c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f3976e, e);
            }
        }
        m5868b();
        this.f3982k = true;
        return this.f3983l;
    }

    /* renamed from: a */
    public void mo5459a(Context context, TextPaint textPaint, C1223f fVar) {
        mo5461a(textPaint, mo5457a());
        mo5460a(context, (C1223f) new C1221b(textPaint, fVar));
    }

    /* renamed from: a */
    public void mo5460a(Context context, C1223f fVar) {
        if (C1222e.m5880a()) {
            mo5458a(context);
        } else {
            m5868b();
        }
        if (this.f3981j == 0) {
            this.f3982k = true;
        }
        if (this.f3982k) {
            fVar.mo5455a(this.f3983l, true);
            return;
        }
        try {
            C0323f.m1585a(context, this.f3981j, new C1220a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f3982k = true;
            fVar.mo5454a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f3976e, e);
            this.f3982k = true;
            fVar.mo5454a(-3);
        }
    }

    /* renamed from: a */
    public void mo5461a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3974c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3972a);
    }

    /* renamed from: b */
    public void mo5462b(Context context, TextPaint textPaint, C1223f fVar) {
        mo5463c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f3973b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f3980i;
        float f2 = this.f3978g;
        float f3 = this.f3979h;
        ColorStateList colorStateList2 = this.f3977f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: c */
    public void mo5463c(Context context, TextPaint textPaint, C1223f fVar) {
        if (C1222e.m5880a()) {
            mo5461a(textPaint, mo5458a(context));
        } else {
            mo5459a(context, textPaint, fVar);
        }
    }
}
