package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C0330c;

/* renamed from: androidx.appcompat.widget.p */
class C0212p {

    /* renamed from: c */
    private static final int[] f1049c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1050a;

    /* renamed from: b */
    private Bitmap f1051b;

    C0212p(ProgressBar progressBar) {
        this.f1050a = progressBar;
    }

    /* renamed from: a */
    private Drawable mo1524a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1041a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m1041a(Drawable drawable, boolean z) {
        if (drawable instanceof C0330c) {
            C0330c cVar = (C0330c) drawable;
            Drawable a = cVar.mo1988a();
            if (a == null) {
                return drawable;
            }
            cVar.mo1989a(m1041a(a, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1041a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1051b == null) {
                this.f1051b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo1525b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }

    /* renamed from: b */
    private Shape mo1525b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo1519a() {
        return this.f1051b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1520a(AttributeSet attributeSet, int i) {
        C0217r0 a = C0217r0.m1054a(this.f1050a.getContext(), attributeSet, f1049c, i, 0);
        Drawable c = a.mo1537c(0);
        if (c != null) {
            this.f1050a.setIndeterminateDrawable(mo1524a(c));
        }
        Drawable c2 = a.mo1537c(1);
        if (c2 != null) {
            this.f1050a.setProgressDrawable(m1041a(c2, false));
        }
        a.mo1531a();
    }
}
