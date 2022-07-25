package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p006b.p007a.C0654a;

/* renamed from: androidx.appcompat.widget.q */
public class C0214q extends RatingBar {

    /* renamed from: f */
    private final C0212p f1056f;

    public C0214q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0654a.ratingBarStyle);
    }

    public C0214q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1056f = new C0212p(this);
        this.f1056f.mo1520a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f1056f.mo1519a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
