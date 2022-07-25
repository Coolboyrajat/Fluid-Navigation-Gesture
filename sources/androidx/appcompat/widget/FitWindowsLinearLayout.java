package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0154b0;

public class FitWindowsLinearLayout extends LinearLayout implements C0154b0 {

    /* renamed from: f */
    private C0154b0.C0155a f635f;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0154b0.C0155a aVar = this.f635f;
        if (aVar != null) {
            aVar.mo206a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0154b0.C0155a aVar) {
        this.f635f = aVar;
    }
}
