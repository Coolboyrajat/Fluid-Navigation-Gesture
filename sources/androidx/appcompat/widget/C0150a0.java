package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.widget.C0345f;
import java.lang.reflect.Field;
import p006b.p007a.C0654a;
import p006b.p007a.p010l.p011a.C0678c;
import p006b.p026g.p035k.C0902z;

/* renamed from: androidx.appcompat.widget.a0 */
class C0150a0 extends ListView {

    /* renamed from: f */
    private final Rect f819f = new Rect();

    /* renamed from: g */
    private int f820g = 0;

    /* renamed from: h */
    private int f821h = 0;

    /* renamed from: i */
    private int f822i = 0;

    /* renamed from: j */
    private int f823j = 0;

    /* renamed from: k */
    private int f824k;

    /* renamed from: l */
    private Field f825l;

    /* renamed from: m */
    private C0151a f826m;

    /* renamed from: n */
    private boolean f827n;

    /* renamed from: o */
    private boolean f828o;

    /* renamed from: p */
    private boolean f829p;

    /* renamed from: q */
    private C0902z f830q;

    /* renamed from: r */
    private C0345f f831r;

    /* renamed from: s */
    C0152b f832s;

    /* renamed from: androidx.appcompat.widget.a0$a */
    private static class C0151a extends C0678c {

        /* renamed from: g */
        private boolean f833g = true;

        C0151a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1205a(boolean z) {
            this.f833g = z;
        }

        public void draw(Canvas canvas) {
            if (this.f833g) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f833g) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f833g) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f833g) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f833g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$b */
    private class C0152b implements Runnable {
        C0152b() {
        }

        /* renamed from: a */
        public void mo1211a() {
            C0150a0 a0Var = C0150a0.this;
            a0Var.f832s = null;
            a0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1212b() {
            C0150a0.this.post(this);
        }

        public void run() {
            C0150a0 a0Var = C0150a0.this;
            a0Var.f832s = null;
            a0Var.drawableStateChanged();
        }
    }

    C0150a0(Context context, boolean z) {
        super(context, (AttributeSet) null, C0654a.dropDownListViewStyle);
        this.f828o = z;
        setCacheColorHint(0);
        try {
            this.f825l = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f825l.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m781a() {
        this.f829p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f824k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0902z zVar = this.f830q;
        if (zVar != null) {
            zVar.mo4699a();
            this.f830q = null;
        }
    }

    /* renamed from: a */
    private void m782a(int i, View view) {
        Rect rect = this.f819f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f820g;
        rect.top -= this.f821h;
        rect.right += this.f822i;
        rect.bottom += this.f823j;
        try {
            boolean z = this.f825l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f825l.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m783a(int i, View view, float f, float f2) {
        m787b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0328a.m1609a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m784a(Canvas canvas) {
        Drawable selector;
        if (!this.f819f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f819f);
            selector.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m785a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m786a(View view, int i, float f, float f2) {
        View childAt;
        this.f829p = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f824k;
        if (!(i2 == -1 || (childAt = getChildAt(i2 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f824k = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m783a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m787b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m782a(i, view);
        if (z2) {
            Rect rect = this.f819f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0328a.m1609a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m788b() {
        return this.f829p;
    }

    /* renamed from: c */
    private void m789c() {
        Drawable selector = getSelector();
        if (selector != null && m788b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0151a aVar = this.f826m;
        if (aVar != null) {
            aVar.mo1205a(z);
        }
    }

    /* renamed from: a */
    public int mo1192a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1193a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m786a((android.view.View) r3, (int) r5, (float) r4, (float) r9)
            if (r0 != r2) goto L_0x000e
            r7.m785a((android.view.View) r3, (int) r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m781a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f831r
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f831r = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f831r
            r9.mo2101a((boolean) r2)
            androidx.core.widget.f r9 = r7.f831r
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f831r
            if (r8 == 0) goto L_0x006c
            r8.mo2101a((boolean) r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0150a0.mo1193a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m784a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f832s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m789c();
        }
    }

    public boolean hasFocus() {
        return this.f828o || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f828o || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f828o || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f828o && this.f827n) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f832s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f832s == null) {
            this.f832s = new C0152b();
            this.f832s.mo1212b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m789c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f824k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0152b bVar = this.f832s;
        if (bVar != null) {
            bVar.mo1211a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f827n = z;
    }

    public void setSelector(Drawable drawable) {
        this.f826m = drawable != null ? new C0151a(drawable) : null;
        super.setSelector(this.f826m);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f820g = rect.left;
        this.f821h = rect.top;
        this.f822i = rect.right;
        this.f823j = rect.bottom;
    }
}
