package p006b.p007a.p014o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p006b.p007a.C0654a;
import p006b.p007a.C0655b;
import p006b.p007a.C0657d;
import p006b.p007a.C0663j;

/* renamed from: b.a.o.a */
public class C0684a {

    /* renamed from: a */
    private Context f2684a;

    private C0684a(Context context) {
        this.f2684a = context;
    }

    /* renamed from: a */
    public static C0684a m3766a(Context context) {
        return new C0684a(context);
    }

    /* renamed from: a */
    public boolean mo3887a() {
        return this.f2684a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int mo3888b() {
        return this.f2684a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo3889c() {
        Configuration configuration = this.f2684a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: d */
    public int mo3890d() {
        return this.f2684a.getResources().getDimensionPixelSize(C0657d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo3891e() {
        TypedArray obtainStyledAttributes = this.f2684a.obtainStyledAttributes((AttributeSet) null, C0663j.ActionBar, C0654a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0663j.ActionBar_height, 0);
        Resources resources = this.f2684a.getResources();
        if (!mo3892f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0657d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo3892f() {
        return this.f2684a.getResources().getBoolean(C0655b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo3893g() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f2684a).hasPermanentMenuKey();
    }
}
