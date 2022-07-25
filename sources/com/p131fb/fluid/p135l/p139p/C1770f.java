package com.p131fb.fluid.p135l.p139p;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.os.Vibrator;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.fragment.app.C0401d;
import com.p131fb.fluid.App;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.l.p.f */
public final class C1770f {
    /* renamed from: a */
    public static final int m7461a(Context context, int i) {
        C3370k.m12227b(context, "$this$getAttrColor");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: a */
    public static final App m7462a(Service service) {
        C3370k.m12227b(service, "$this$appFluid");
        Application application = service.getApplication();
        if (application != null) {
            return (App) application;
        }
        throw new C3269p("null cannot be cast to non-null type com.fb.fluid.App");
    }

    /* renamed from: a */
    public static final App m7463a(C0401d dVar) {
        C3370k.m12227b(dVar, "$this$appFluid");
        Application application = dVar.getApplication();
        if (application != null) {
            return (App) application;
        }
        throw new C3269p("null cannot be cast to non-null type com.fb.fluid.App");
    }

    /* renamed from: a */
    public static final void m7464a(Context context, int i, int i2) {
        C3370k.m12227b(context, "$this$toast");
        Toast.makeText(context, context.getString(i), i2).show();
    }

    /* renamed from: a */
    public static /* synthetic */ void m7465a(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        m7464a(context, i, i2);
    }

    /* renamed from: a */
    public static final void m7466a(Context context, String str, int i) {
        C3370k.m12227b(context, "$this$toast");
        C3370k.m12227b(str, "str");
        Toast.makeText(context, str, i).show();
    }

    /* renamed from: a */
    public static /* synthetic */ void m7467a(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        m7466a(context, str, i);
    }

    /* renamed from: a */
    public static final boolean m7468a(Context context) {
        C3370k.m12227b(context, "$this$showsNavigationBar");
        int identifier = context.getResources().getIdentifier("config_showNavigationBar", "bool", "android");
        return identifier > 0 && context.getResources().getBoolean(identifier);
    }

    /* renamed from: b */
    public static final int m7469b(Context context, int i) {
        C3370k.m12227b(context, "$this$getAttrSize");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.data;
        Resources resources = context.getResources();
        C3370k.m12223a((Object) resources, "resources");
        return TypedValue.complexToDimensionPixelSize(i2, resources.getDisplayMetrics());
    }

    /* renamed from: b */
    public static final boolean m7470b(Context context) {
        C3370k.m12227b(context, "$this$supportsVibrator");
        try {
            Object systemService = context.getSystemService("vibrator");
            if (systemService != null) {
                return ((Vibrator) systemService).hasVibrator();
            }
            throw new C3269p("null cannot be cast to non-null type android.os.Vibrator");
        } catch (Exception unused) {
            return false;
        }
    }
}
