package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0154b0;

public class FitWindowsFrameLayout extends FrameLayout implements C0154b0 {

    /* renamed from: f */
    private C0154b0.C0155a f634f;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0154b0.C0155a aVar = this.f634f;
        if (aVar != null) {
            aVar.mo206a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0154b0.C0155a aVar) {
        this.f634f = aVar;
    }
}
