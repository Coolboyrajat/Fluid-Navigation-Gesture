package p054c.p055a.p067b.p070h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Unit;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p006b.p026g.p035k.C0890v;
import p054c.p055a.p067b.C1109b;

/* renamed from: c.a.b.h.e */
public final class C1134e {

    /* renamed from: c.a.b.h.e$a */
    public static final class C1135a implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ C3350b f3835f;

        C1135a(C3350b bVar) {
            this.f3835f = bVar;
        }

        public void onViewAttachedToWindow(View view) {
            C3370k.m12227b(view, "v");
            this.f3835f.mo5146a(view);
        }

        public void onViewDetachedFromWindow(View view) {
            C3370k.m12227b(view, "v");
        }
    }

    /* renamed from: c.a.b.h.e$b */
    public static final class C1136b implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ C3350b f3836f;

        C1136b(C3350b bVar) {
            this.f3836f = bVar;
        }

        public void onViewAttachedToWindow(View view) {
            C3370k.m12227b(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            C3370k.m12227b(view, "v");
            this.f3836f.mo5146a(view);
        }
    }

    /* renamed from: a */
    public static final Drawable m5619a(Context context, Integer num, Drawable drawable) {
        C3370k.m12227b(context, "$this$resolveDrawable");
        if (num == null) {
            return drawable;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num.intValue()});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 == null && drawable != null) {
                drawable2 = drawable;
            }
            return drawable2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m5620a(Context context, Integer num, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        return m5619a(context, num, drawable);
    }

    /* renamed from: a */
    public static final void m5621a(View view, C3350b<? super View, Unit> bVar) {
        C3370k.m12227b(bVar, "block");
        if (view != null) {
            view.addOnAttachStateChangeListener(new C1135a(bVar));
        }
        if (m5622a(view) && view != null) {
            bVar.mo5146a(view);
        }
    }

    /* renamed from: a */
    public static final boolean m5622a(View view) {
        if (view == null) {
            return false;
        }
        return C0890v.m4731B(view);
    }

    /* renamed from: b */
    public static final void m5623b(View view) {
        if (view != null && view.getBackground() == null && view.getContext() != null) {
            Context context = view.getContext();
            C3370k.m12223a((Object) context, "context");
            view.setBackground(m5620a(context, Integer.valueOf(C1109b.selectableItemBackground), (Drawable) null, 2, (Object) null));
        }
    }

    /* renamed from: b */
    public static final void m5624b(View view, C3350b<? super View, Unit> bVar) {
        C3370k.m12227b(bVar, "block");
        if (view != null) {
            view.addOnAttachStateChangeListener(new C1136b(bVar));
        }
        if (!m5622a(view) && view != null) {
            bVar.mo5146a(view);
        }
    }
}
