package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.C0081g;
import androidx.appcompat.view.menu.C0099o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0164c0;
import androidx.appcompat.widget.C0234t0;
import p006b.p007a.C0663j;

public class ActionMenuItemView extends AppCompatTextView implements C0099o.C0100a, View.OnClickListener, ActionMenuView.C0114a {

    /* renamed from: j */
    C0086j f307j;

    /* renamed from: k */
    private CharSequence f308k;

    /* renamed from: l */
    private Drawable f309l;

    /* renamed from: m */
    C0081g.C0083b f310m;

    /* renamed from: n */
    private C0164c0 f311n;

    /* renamed from: o */
    C0068b f312o;

    /* renamed from: p */
    private boolean f313p;

    /* renamed from: q */
    private boolean f314q;

    /* renamed from: r */
    private int f315r;

    /* renamed from: s */
    private int f316s;

    /* renamed from: t */
    private int f317t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0067a extends C0164c0 {
        public C0067a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0102q mo308a() {
            C0068b bVar = ActionMenuItemView.this.f312o;
            if (bVar != null) {
                return bVar.mo310a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = mo308a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo309b() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.g$b r1 = r0.f310m
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.j r0 = r0.f307j
                boolean r0 = r1.mo312a(r0)
                if (r0 == 0) goto L_0x001c
                androidx.appcompat.view.menu.q r0 = r3.mo308a()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo413c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.C0067a.mo309b():boolean");
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0068b {
        /* renamed from: a */
        public abstract C0102q mo310a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f313p = m331e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663j.ActionMenuItemView, i, 0);
        this.f315r = obtainStyledAttributes.getDimensionPixelSize(C0663j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f317t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f316s = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m331e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m332f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f308k);
        if (this.f309l != null && (!this.f307j.mo559n() || (!this.f313p && !this.f314q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f308k : null);
        CharSequence contentDescription = this.f307j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f307j.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f307j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f307j.getTitle();
            }
            C0234t0.m1151a(this, charSequence);
            return;
        }
        C0234t0.m1151a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo289a(C0086j jVar, int i) {
        this.f307j = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo522a((C0099o.C0100a) this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f311n == null) {
            this.f311n = new C0067a();
        }
    }

    /* renamed from: a */
    public boolean mo290a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo291b() {
        return mo293d();
    }

    /* renamed from: c */
    public boolean mo292c() {
        return mo293d() && this.f307j.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo293d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0086j getItemData() {
        return this.f307j;
    }

    public void onClick(View view) {
        C0081g.C0083b bVar = this.f310m;
        if (bVar != null) {
            bVar.mo312a(this.f307j);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f313p = m331e();
        m332f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean d = mo293d();
        if (d && (i3 = this.f316s) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f315r) : this.f315r;
        if (mode != 1073741824 && this.f315r > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f309l != null) {
            super.setPadding((getMeasuredWidth() - this.f309l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0164c0 c0Var;
        if (!this.f307j.hasSubMenu() || (c0Var = this.f311n) == null || !c0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f314q != z) {
            this.f314q = z;
            C0086j jVar = this.f307j;
            if (jVar != null) {
                jVar.mo526b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f309l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f317t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f317t;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m332f();
    }

    public void setItemInvoker(C0081g.C0083b bVar) {
        this.f310m = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f316s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0068b bVar) {
        this.f312o = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f308k = charSequence;
        m332f();
    }
}
