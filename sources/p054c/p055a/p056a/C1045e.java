package p054c.p055a.p056a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import kotlin.C3261j;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.p057n.C1057a;
import p054c.p055a.p056a.p066v.C1103e;
import p054c.p055a.p056a.p066v.C1107f;

/* renamed from: c.a.a.e */
public final class C1045e implements C1039a {

    /* renamed from: a */
    public static final C1045e f3707a = new C1045e();

    /* renamed from: c.a.a.e$a */
    static final class C1046a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ DialogActionButton f3708f;

        C1046a(DialogActionButton dialogActionButton) {
            this.f3708f = dialogActionButton;
        }

        public final void run() {
            this.f3708f.requestFocus();
        }
    }

    /* renamed from: c.a.a.e$b */
    static final class C1047b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ DialogActionButton f3709f;

        C1047b(DialogActionButton dialogActionButton) {
            this.f3709f = dialogActionButton;
        }

        public final void run() {
            this.f3709f.requestFocus();
        }
    }

    private C1045e() {
    }

    /* renamed from: a */
    public int mo5094a(boolean z) {
        return z ? C1053k.MD_Dark : C1053k.MD_Light;
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: a */
    public ViewGroup mo5095a(Context context, Window window, LayoutInflater layoutInflater, C1041c cVar) {
        C3370k.m12227b(context, "creatingContext");
        C3370k.m12227b(window, "dialogWindow");
        C3370k.m12227b(layoutInflater, "layoutInflater");
        C3370k.m12227b(cVar, "dialog");
        View inflate = layoutInflater.inflate(C1052j.md_dialog_base, (ViewGroup) null, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C3269p("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public DialogLayout mo5096a(ViewGroup viewGroup) {
        C3370k.m12227b(viewGroup, "root");
        return (DialogLayout) viewGroup;
    }

    /* renamed from: a */
    public void mo5097a(Context context, Window window, DialogLayout dialogLayout, Integer num) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(window, "window");
        C3370k.m12227b(dialogLayout, "view");
        if (num == null || num.intValue() != 0) {
            window.setSoftInputMode(16);
            WindowManager windowManager = window.getWindowManager();
            if (windowManager != null) {
                Resources resources = context.getResources();
                C3261j<Integer, Integer> a = C1103e.f3789a.mo5169a(windowManager);
                int intValue = a.mo9934a().intValue();
                dialogLayout.setMaxHeight(a.mo9935b().intValue() - (resources.getDimensionPixelSize(C1050h.md_dialog_vertical_margin) * 2));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = Math.min(num != null ? num.intValue() : resources.getDimensionPixelSize(C1050h.md_dialog_max_width), intValue - (resources.getDimensionPixelSize(C1050h.md_dialog_horizontal_margin) * 2));
                window.setAttributes(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public void mo5098a(C1041c cVar) {
        C3370k.m12227b(cVar, "dialog");
    }

    /* renamed from: a */
    public void mo5099a(DialogLayout dialogLayout, int i, float f) {
        C3370k.m12227b(dialogLayout, "view");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        dialogLayout.setBackground(gradientDrawable);
    }

    /* renamed from: b */
    public void mo5100b(C1041c cVar) {
        C3370k.m12227b(cVar, "dialog");
        DialogActionButton a = C1057a.m5382a(cVar, C1055m.NEGATIVE);
        if (C1107f.m5547c(a)) {
            a.post(new C1046a(a));
            return;
        }
        DialogActionButton a2 = C1057a.m5382a(cVar, C1055m.POSITIVE);
        if (C1107f.m5547c(a2)) {
            a2.post(new C1047b(a2));
        }
    }

    public boolean onDismiss() {
        return false;
    }
}
