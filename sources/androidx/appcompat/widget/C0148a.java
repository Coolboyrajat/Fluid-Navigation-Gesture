package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p007a.C0654a;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0840a0;
import p006b.p026g.p035k.C0890v;
import p006b.p026g.p035k.C0902z;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0148a extends ViewGroup {

    /* renamed from: f */
    protected final C0149a f808f;

    /* renamed from: g */
    protected final Context f809g;

    /* renamed from: h */
    protected ActionMenuView f810h;

    /* renamed from: i */
    protected C0156c f811i;

    /* renamed from: j */
    protected int f812j;

    /* renamed from: k */
    protected C0902z f813k;

    /* renamed from: l */
    private boolean f814l;

    /* renamed from: m */
    private boolean f815m;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0149a implements C0840a0 {

        /* renamed from: a */
        private boolean f816a = false;

        /* renamed from: b */
        int f817b;

        protected C0149a() {
        }

        /* renamed from: a */
        public C0149a mo1190a(C0902z zVar, int i) {
            C0148a.this.f813k = zVar;
            this.f817b = i;
            return this;
        }

        /* renamed from: a */
        public void mo210a(View view) {
            if (!this.f816a) {
                C0148a aVar = C0148a.this;
                aVar.f813k = null;
                C0148a.super.setVisibility(this.f817b);
            }
        }

        /* renamed from: b */
        public void mo211b(View view) {
            C0148a.super.setVisibility(0);
            this.f816a = false;
        }

        /* renamed from: c */
        public void mo1191c(View view) {
            this.f816a = true;
        }
    }

    C0148a(Context context) {
        this(context, (AttributeSet) null);
    }

    C0148a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0148a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f808f = new C0149a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0654a.actionBarPopupTheme, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.f809g = context;
        } else {
            this.f809g = new ContextThemeWrapper(context, i2);
        }
    }

    /* renamed from: a */
    protected static int m771a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1184a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1185a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0902z mo1186a(int i, long j) {
        C0902z zVar = this.f813k;
        if (zVar != null) {
            zVar.mo4699a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0902z a = C0890v.m4742a(this);
            a.mo4694a(1.0f);
            a.mo4695a(j);
            C0149a aVar = this.f808f;
            aVar.mo1190a(a, i);
            a.mo4697a((C0840a0) aVar);
            return a;
        }
        C0902z a2 = C0890v.m4742a(this);
        a2.mo4694a(0.0f);
        a2.mo4695a(j);
        C0149a aVar2 = this.f808f;
        aVar2.mo1190a(a2, i);
        a2.mo4697a((C0840a0) aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f813k != null ? this.f808f.f817b : getVisibility();
    }

    public int getContentHeight() {
        return this.f812j;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0663j.ActionBar, C0654a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0663j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0156c cVar = this.f811i;
        if (cVar != null) {
            cVar.mo1219a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f815m = false;
        }
        if (!this.f815m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f815m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f815m = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f814l = false;
        }
        if (!this.f814l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f814l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f814l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0902z zVar = this.f813k;
            if (zVar != null) {
                zVar.mo4699a();
            }
            super.setVisibility(i);
        }
    }
}
