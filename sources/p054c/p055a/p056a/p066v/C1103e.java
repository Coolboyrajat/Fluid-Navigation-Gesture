package p054c.p055a.p056a.p066v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.C0311a;
import kotlin.C3261j;
import kotlin.C3269p;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import p054c.p055a.p056a.C1041c;
import p054c.p055a.p056a.C1048f;

/* renamed from: c.a.a.v.e */
public final class C1103e {

    /* renamed from: a */
    public static final C1103e f3789a = new C1103e();

    /* renamed from: c.a.a.v.e$a */
    public static final class C1104a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ C3350b f3790f;

        C1104a(C3350b bVar) {
            this.f3790f = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C3370k.m12227b(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3370k.m12227b(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3370k.m12227b(charSequence, "s");
            this.f3790f.mo5146a(charSequence);
        }
    }

    /* renamed from: c.a.a.v.e$b */
    public static final class C1105b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f */
        private Integer f3791f;

        /* renamed from: g */
        final /* synthetic */ View f3792g;

        /* renamed from: h */
        final /* synthetic */ C3350b f3793h;

        C1105b(T t, C3350b bVar) {
            this.f3792g = t;
            this.f3793h = bVar;
        }

        public void onGlobalLayout() {
            Integer num = this.f3791f;
            if (num != null) {
                int measuredHeight = this.f3792g.getMeasuredHeight();
                if (num != null && num.intValue() == measuredHeight) {
                    this.f3792g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.f3792g.getMeasuredWidth() > 0 && this.f3792g.getMeasuredHeight() > 0) {
                Integer num2 = this.f3791f;
                int measuredHeight2 = this.f3792g.getMeasuredHeight();
                if (num2 == null || num2.intValue() != measuredHeight2) {
                    this.f3791f = Integer.valueOf(this.f3792g.getMeasuredHeight());
                    this.f3793h.mo5146a(this.f3792g);
                }
            }
        }
    }

    /* renamed from: c.a.a.v.e$c */
    public static final class C1106c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f */
        private Integer f3794f;

        /* renamed from: g */
        final /* synthetic */ View f3795g;

        /* renamed from: h */
        final /* synthetic */ C3350b f3796h;

        C1106c(T t, C3350b bVar) {
            this.f3795g = t;
            this.f3796h = bVar;
        }

        public void onGlobalLayout() {
            Integer num = this.f3794f;
            if (num != null) {
                int measuredWidth = this.f3795g.getMeasuredWidth();
                if (num != null && num.intValue() == measuredWidth) {
                    this.f3795g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.f3795g.getMeasuredWidth() > 0 && this.f3795g.getMeasuredHeight() > 0) {
                Integer num2 = this.f3794f;
                int measuredWidth2 = this.f3795g.getMeasuredWidth();
                if (num2 == null || num2.intValue() != measuredWidth2) {
                    this.f3794f = Integer.valueOf(this.f3795g.getMeasuredWidth());
                    this.f3796h.mo5146a(this.f3795g);
                }
            }
        }
    }

    private C1103e() {
    }

    /* renamed from: a */
    public static /* synthetic */ float m5514a(C1103e eVar, Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return eVar.mo5161a(context, i, f);
    }

    /* renamed from: a */
    public static /* synthetic */ int m5515a(C1103e eVar, Context context, Integer num, Integer num2, C3349a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            aVar = null;
        }
        return eVar.mo5162a(context, num, num2, (C3349a<Integer>) aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ Drawable m5516a(C1103e eVar, Context context, Integer num, Integer num2, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            drawable = null;
        }
        return eVar.mo5165a(context, num, num2, drawable);
    }

    /* renamed from: a */
    public static /* synthetic */ CharSequence m5517a(C1103e eVar, C1041c cVar, Integer num, Integer num2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return eVar.mo5168a(cVar, num, num2, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m5518a(C1103e eVar, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view != null ? view.getPaddingLeft() : 0;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = view != null ? view.getPaddingTop() : 0;
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = view != null ? view.getPaddingRight() : 0;
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = view != null ? view.getPaddingBottom() : 0;
        }
        eVar.mo5170a(view, i6, i7, i8, i4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m5519a(C1103e eVar, TextView textView, Context context, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num2 = null;
        }
        eVar.mo5173a(textView, context, num, num2);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m5520a(C1103e eVar, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = 0.5d;
        }
        return eVar.mo5175a(i, d);
    }

    /* renamed from: a */
    public final float mo5161a(Context context, int i, float f) {
        C3370k.m12227b(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimension(0, f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final int mo5162a(Context context, Integer num, Integer num2, C3349a<Integer> aVar) {
        C3370k.m12227b(context, "context");
        int i = 0;
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                if (color == 0 && aVar != null) {
                    return aVar.invoke().intValue();
                }
                obtainStyledAttributes.recycle();
                return color;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            if (num != null) {
                i = num.intValue();
            }
            return C0311a.m1528a(context, i);
        }
    }

    /* renamed from: a */
    public final <T extends View> int mo5163a(T t, int i) {
        C3370k.m12227b(t, "$this$dimenPx");
        Context context = t.getContext();
        C3370k.m12223a((Object) context, "context");
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public final ColorStateList mo5164a(Context context, int i, int i2) {
        int i3;
        int i4;
        C3370k.m12227b(context, "context");
        if (i2 == 0) {
            i3 = m5515a(this, context, (Integer) null, Integer.valueOf(C1048f.colorControlActivated), (C3349a) null, 10, (Object) null);
        } else {
            i3 = i2;
        }
        int[][] iArr = {new int[]{-16842912, -16842908}, new int[]{16842912}, new int[]{16842908}};
        int[] iArr2 = new int[3];
        if (i == 0) {
            i4 = m5515a(this, context, (Integer) null, Integer.valueOf(C1048f.colorControlNormal), (C3349a) null, 10, (Object) null);
        } else {
            i4 = i;
        }
        iArr2[0] = i4;
        iArr2[1] = i3;
        iArr2[2] = i3;
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: a */
    public final Drawable mo5165a(Context context, Integer num, Integer num2, Drawable drawable) {
        C3370k.m12227b(context, "context");
        if (num2 == null) {
            return num == null ? drawable : C0311a.m1534c(context, num.intValue());
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
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
    public final <R extends View> R mo5166a(ViewGroup viewGroup, Context context, int i) {
        C3370k.m12227b(viewGroup, "$this$inflate");
        C3370k.m12227b(context, "ctxt");
        R inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        if (inflate != null) {
            return inflate;
        }
        throw new C3269p("null cannot be cast to non-null type R");
    }

    /* renamed from: a */
    public final CharSequence mo5167a(Context context, Integer num, Integer num2, boolean z) {
        C3370k.m12227b(context, "context");
        int intValue = num != null ? num.intValue() : num2 != null ? num2.intValue() : 0;
        if (intValue == 0) {
            return null;
        }
        CharSequence text = context.getResources().getText(intValue);
        C3370k.m12223a((Object) text, "context.resources.getText(resourceId)");
        return z ? Html.fromHtml(text.toString()) : text;
    }

    /* renamed from: a */
    public final CharSequence mo5168a(C1041c cVar, Integer num, Integer num2, boolean z) {
        C3370k.m12227b(cVar, "materialDialog");
        return mo5167a(cVar.mo5117i(), num, num2, z);
    }

    /* renamed from: a */
    public final C3261j<Integer, Integer> mo5169a(WindowManager windowManager) {
        C3370k.m12227b(windowManager, "$this$getWidthAndHeight");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new C3261j<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    /* renamed from: a */
    public final <T extends View> void mo5170a(T t, int i, int i2, int i3, int i4) {
        if ((t == null || i != t.getPaddingLeft() || i2 != t.getPaddingTop() || i3 != t.getPaddingRight() || i4 != t.getPaddingBottom()) && t != null) {
            t.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final <T extends View> void mo5171a(T t, C3350b<? super T, Unit> bVar) {
        C3370k.m12227b(t, "$this$waitForHeight");
        C3370k.m12227b(bVar, "block");
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new C1105b(t, bVar));
        } else {
            bVar.mo5146a(t);
        }
    }

    /* renamed from: a */
    public final void mo5172a(EditText editText, C3350b<? super CharSequence, Unit> bVar) {
        C3370k.m12227b(editText, "$this$textChanged");
        C3370k.m12227b(bVar, "callback");
        editText.addTextChangedListener(new C1104a(bVar));
    }

    /* renamed from: a */
    public final void mo5173a(TextView textView, Context context, Integer num, Integer num2) {
        int a;
        int a2;
        C3370k.m12227b(context, "context");
        if (textView == null) {
            return;
        }
        if (num != null || num2 != null) {
            if (!(num == null || (a2 = m5515a(this, context, (Integer) null, num, (C3349a) null, 10, (Object) null)) == 0)) {
                textView.setTextColor(a2);
            }
            if (num2 != null && (a = m5515a(this, context, (Integer) null, num2, (C3349a) null, 10, (Object) null)) != 0) {
                textView.setHintTextColor(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo5174a(String str, Object obj, Integer num) {
        C3370k.m12227b(str, "method");
        if (num == null && obj == null) {
            throw new IllegalArgumentException(str + ": You must specify a resource ID or literal value");
        }
    }

    /* renamed from: a */
    public final boolean mo5175a(int i, double d) {
        return i != 0 && ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) >= d;
    }

    /* renamed from: a */
    public final boolean mo5176a(Context context) {
        C3370k.m12227b(context, "$this$isLandscape");
        Resources resources = context.getResources();
        C3370k.m12223a((Object) resources, "resources");
        return resources.getConfiguration().orientation == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        r3 = r8.mo5146a(java.lang.Integer.valueOf(r7[r3]));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo5177a(android.content.Context r6, int[] r7, kotlin.p205x.p206c.C3350b<? super java.lang.Integer, java.lang.Integer> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.p205x.p207d.C3370k.m12227b(r6, r0)
            java.lang.String r0 = "attrs"
            kotlin.p205x.p207d.C3370k.m12227b(r7, r0)
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7)
            int r0 = r7.length     // Catch:{ all -> 0x0062 }
            r1 = 0
            kotlin.a0.d r0 = kotlin.p191a0.C3198h.m11852d(r1, r0)     // Catch:{ all -> 0x0062 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0062 }
            r3 = 10
            int r3 = kotlin.p195s.C3285k.m12075a(r0, r3)     // Catch:{ all -> 0x0062 }
            r2.<init>(r3)     // Catch:{ all -> 0x0062 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0062 }
        L_0x0027:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x005a
            r3 = r0
            kotlin.s.v r3 = (kotlin.p195s.C3297v) r3     // Catch:{ all -> 0x0062 }
            int r3 = r3.mo9906a()     // Catch:{ all -> 0x0062 }
            int r4 = r6.getColor(r3, r1)     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x003c
            r3 = r4
            goto L_0x0052
        L_0x003c:
            if (r8 == 0) goto L_0x0051
            r3 = r7[r3]     // Catch:{ all -> 0x0062 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0062 }
            java.lang.Object r3 = r8.mo5146a(r3)     // Catch:{ all -> 0x0062 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0051
            int r3 = r3.intValue()     // Catch:{ all -> 0x0062 }
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0062 }
            r2.add(r3)     // Catch:{ all -> 0x0062 }
            goto L_0x0027
        L_0x005a:
            int[] r7 = kotlin.p195s.C3292r.m12091a(r2)     // Catch:{ all -> 0x0062 }
            r6.recycle()
            return r7
        L_0x0062:
            r7 = move-exception
            r6.recycle()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p055a.p056a.p066v.C1103e.mo5177a(android.content.Context, int[], kotlin.x.c.b):int[]");
    }

    /* renamed from: a */
    public final String[] mo5178a(Context context, Integer num) {
        C3370k.m12227b(context, "$this$getStringArray");
        if (num == null) {
            return new String[0];
        }
        String[] stringArray = context.getResources().getStringArray(num.intValue());
        C3370k.m12223a((Object) stringArray, "resources.getStringArray(res)");
        return stringArray;
    }

    /* renamed from: b */
    public final int mo5179b(Context context, int i, int i2) {
        C3370k.m12227b(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getInt(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public final <T extends View> void mo5180b(T t, C3350b<? super T, Unit> bVar) {
        C3370k.m12227b(t, "$this$waitForWidth");
        C3370k.m12227b(bVar, "block");
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new C1106c(t, bVar));
        } else {
            bVar.mo5146a(t);
        }
    }
}
