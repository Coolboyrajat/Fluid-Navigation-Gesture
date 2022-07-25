package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
public class C0259e extends View {
    public C0259e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0250a aVar = (ConstraintLayout.C0250a) getLayoutParams();
        aVar.f1220a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0250a aVar = (ConstraintLayout.C0250a) getLayoutParams();
        aVar.f1222b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0250a aVar = (ConstraintLayout.C0250a) getLayoutParams();
        aVar.f1224c = f;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i) {
    }
}
