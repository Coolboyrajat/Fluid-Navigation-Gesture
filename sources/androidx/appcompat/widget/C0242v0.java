package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p006b.p007a.C0657d;
import p006b.p007a.C0659f;
import p006b.p007a.C0660g;
import p006b.p007a.C0662i;

/* renamed from: androidx.appcompat.widget.v0 */
class C0242v0 {

    /* renamed from: a */
    private final Context f1163a;

    /* renamed from: b */
    private final View f1164b;

    /* renamed from: c */
    private final TextView f1165c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1166d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1167e = new Rect();

    /* renamed from: f */
    private final int[] f1168f = new int[2];

    /* renamed from: g */
    private final int[] f1169g = new int[2];

    C0242v0(Context context) {
        this.f1163a = context;
        this.f1164b = LayoutInflater.from(this.f1163a).inflate(C0660g.abc_tooltip, (ViewGroup) null);
        this.f1165c = (TextView) this.f1164b.findViewById(C0659f.message);
        this.f1166d.setTitle(C0242v0.class.getSimpleName());
        this.f1166d.packageName = this.f1163a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1166d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0662i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m1222a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m1223a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1163a.getResources().getDimensionPixelOffset(C0657d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1163a.getResources().getDimensionPixelOffset(C0657d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1163a.getResources().getDimensionPixelOffset(z ? C0657d.tooltip_y_offset_touch : C0657d.tooltip_y_offset_non_touch);
        View a = m1222a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1167e);
        Rect rect = this.f1167e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1163a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1167e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1169g);
        view.getLocationOnScreen(this.f1168f);
        int[] iArr = this.f1168f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1169g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1164b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1164b.getMeasuredHeight();
        int[] iArr3 = this.f1168f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f1167e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1696a() {
        if (mo1698b()) {
            ((WindowManager) this.f1163a.getSystemService("window")).removeView(this.f1164b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1697a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1698b()) {
            mo1696a();
        }
        this.f1165c.setText(charSequence);
        m1223a(view, i, i2, z, this.f1166d);
        ((WindowManager) this.f1163a.getSystemService("window")).addView(this.f1164b, this.f1166d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo1698b() {
        return this.f1164b.getParent() != null;
    }
}
