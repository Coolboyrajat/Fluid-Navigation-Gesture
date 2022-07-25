package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0352l;
import p006b.p026g.p035k.C0889u;

public class AppCompatImageView extends ImageView implements C0889u, C0352l {

    /* renamed from: f */
    private final C0170e f613f;

    /* renamed from: g */
    private final C0206m f614g;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C0211o0.m1039b(context), attributeSet, i);
        this.f613f = new C0170e(this);
        this.f613f.mo1292a(attributeSet, i);
        this.f614g = new C0206m(this);
        this.f614g.mo1500a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0170e eVar = this.f613f;
        if (eVar != null) {
            eVar.mo1287a();
        }
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1496a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0170e eVar = this.f613f;
        if (eVar != null) {
            return eVar.mo1293b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0170e eVar = this.f613f;
        if (eVar != null) {
            return eVar.mo1295c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0206m mVar = this.f614g;
        if (mVar != null) {
            return mVar.mo1501b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0206m mVar = this.f614g;
        if (mVar != null) {
            return mVar.mo1502c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f614g.mo1503d() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170e eVar = this.f613f;
        if (eVar != null) {
            eVar.mo1291a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0170e eVar = this.f613f;
        if (eVar != null) {
            eVar.mo1288a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1496a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1496a();
        }
    }

    public void setImageResource(int i) {
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1497a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1496a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170e eVar = this.f613f;
        if (eVar != null) {
            eVar.mo1294b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170e eVar = this.f613f;
        if (eVar != null) {
            eVar.mo1290a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1498a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0206m mVar = this.f614g;
        if (mVar != null) {
            mVar.mo1499a(mode);
        }
    }
}
