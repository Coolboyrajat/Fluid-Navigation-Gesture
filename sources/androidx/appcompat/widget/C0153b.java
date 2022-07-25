package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0153b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f835a;

    public C0153b(ActionBarContainer actionBarContainer) {
        this.f835a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f835a;
        if (actionBarContainer.f544m) {
            Drawable drawable = actionBarContainer.f543l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f541j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f835a;
        Drawable drawable3 = actionBarContainer2.f542k;
        if (drawable3 != null && actionBarContainer2.f545n) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f835a;
        if (actionBarContainer.f544m) {
            drawable = actionBarContainer.f543l;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f541j;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
