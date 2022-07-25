package p006b.p050n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p006b.p026g.p035k.C0890v;

/* renamed from: b.n.a0 */
class C0946a0 implements C0962c0 {

    /* renamed from: a */
    protected C0947a f3421a;

    /* renamed from: b.n.a0$a */
    static class C0947a extends ViewGroup {

        /* renamed from: f */
        ViewGroup f3422f;

        /* renamed from: g */
        View f3423g;

        /* renamed from: h */
        ArrayList<Drawable> f3424h = null;

        /* renamed from: i */
        C0946a0 f3425i;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C0947a(Context context, ViewGroup viewGroup, View view, C0946a0 a0Var) {
            super(context);
            this.f3422f = viewGroup;
            this.f3423g = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f3425i = a0Var;
        }

        /* renamed from: a */
        private void m5021a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f3422f.getLocationOnScreen(iArr2);
            this.f3423g.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo4802a(Drawable drawable) {
            if (this.f3424h == null) {
                this.f3424h = new ArrayList<>();
            }
            if (!this.f3424h.contains(drawable)) {
                this.f3424h.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: a */
        public void mo4803a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f3422f || viewGroup.getParent() == null || !C0890v.m4731B(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f3422f.getLocationOnScreen(iArr2);
                    C0890v.m4775d(view, iArr[0] - iArr2[0]);
                    C0890v.m4777e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f3424h;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4804a() {
            /*
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f3424h
                if (r0 == 0) goto L_0x0010
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p050n.C0946a0.C0947a.mo4804a():boolean");
        }

        /* renamed from: b */
        public void mo4805b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f3424h;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
            }
        }

        /* renamed from: b */
        public void mo4806b(View view) {
            super.removeView(view);
            if (mo4804a()) {
                this.f3422f.removeView(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f3422f.getLocationOnScreen(iArr);
            this.f3423g.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f3423g.getWidth(), this.f3423g.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f3424h;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f3424h.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f3422f == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f3422f instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m5021a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f3424h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f3424h
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p050n.C0946a0.C0947a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C0946a0(Context context, ViewGroup viewGroup, View view) {
        this.f3421a = new C0947a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C0946a0 m5017c(View view) {
        ViewGroup d = m5018d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C0947a) {
                return ((C0947a) childAt).f3425i;
            }
        }
        return new C1010u(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m5018d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4800a(Drawable drawable) {
        this.f3421a.mo4802a(drawable);
    }

    /* renamed from: b */
    public void mo4801b(Drawable drawable) {
        this.f3421a.mo4805b(drawable);
    }
}
