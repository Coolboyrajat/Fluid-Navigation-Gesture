package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p006b.p007a.C0654a;

/* renamed from: androidx.appcompat.app.c */
public class C0031c extends C0056h implements DialogInterface {

    /* renamed from: h */
    final AlertController f142h = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.c$a */
    public static class C0032a {

        /* renamed from: a */
        private final AlertController.C0017f f143a;

        /* renamed from: b */
        private final int f144b;

        public C0032a(Context context) {
            this(context, C0031c.m82a(context, 0));
        }

        public C0032a(Context context, int i) {
            this.f143a = new AlertController.C0017f(new ContextThemeWrapper(context, C0031c.m82a(context, i)));
            this.f144b = i;
        }

        /* renamed from: a */
        public C0032a mo100a(DialogInterface.OnKeyListener onKeyListener) {
            this.f143a.f118u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0032a mo101a(Drawable drawable) {
            this.f143a.f101d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0032a mo102a(View view) {
            this.f143a.f104g = view;
            return this;
        }

        /* renamed from: a */
        public C0032a mo103a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0017f fVar = this.f143a;
            fVar.f120w = listAdapter;
            fVar.f121x = onClickListener;
            fVar.f91I = i;
            fVar.f90H = true;
            return this;
        }

        /* renamed from: a */
        public C0032a mo104a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0017f fVar = this.f143a;
            fVar.f120w = listAdapter;
            fVar.f121x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0032a mo105a(CharSequence charSequence) {
            this.f143a.f103f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0031c mo106a() {
            C0031c cVar = new C0031c(this.f143a.f98a, this.f144b);
            this.f143a.mo47a(cVar.f142h);
            cVar.setCancelable(this.f143a.f115r);
            if (this.f143a.f115r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f143a.f116s);
            cVar.setOnDismissListener(this.f143a.f117t);
            DialogInterface.OnKeyListener onKeyListener = this.f143a.f118u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        /* renamed from: b */
        public Context mo107b() {
            return this.f143a.f98a;
        }
    }

    protected C0031c(Context context, int i) {
        super(context, m82a(context, i));
    }

    /* renamed from: a */
    static int m82a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0654a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public ListView mo95b() {
        return this.f142h.mo27a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f142h.mo34b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f142h.mo33a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f142h.mo38b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f142h.mo37b(charSequence);
    }
}
