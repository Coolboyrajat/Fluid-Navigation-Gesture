package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0347h;
import p006b.p007a.C0663j;

/* renamed from: androidx.appcompat.widget.o */
class C0210o extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1043b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1044a;

    public C0210o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1036a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1036a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0217r0 a = C0217r0.m1054a(context, attributeSet, C0663j.PopupWindow, i, i2);
        if (a.mo1545g(C0663j.PopupWindow_overlapAnchor)) {
            m1037a(a.mo1532a(C0663j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo1535b(C0663j.PopupWindow_android_popupBackground));
        a.mo1531a();
    }

    /* renamed from: a */
    private void m1037a(boolean z) {
        if (f1043b) {
            this.f1044a = z;
        } else {
            C0347h.m1733a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1043b && this.f1044a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1043b && this.f1044a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1043b && this.f1044a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
