package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.C0026a;
import androidx.appcompat.widget.C0168d0;
import p006b.p007a.C0654a;
import p006b.p007a.p014o.C0684a;

/* renamed from: androidx.appcompat.widget.k0 */
public class C0198k0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: f */
    Runnable f989f;

    /* renamed from: g */
    private C0201c f990g;

    /* renamed from: h */
    C0168d0 f991h;

    /* renamed from: i */
    private Spinner f992i;

    /* renamed from: j */
    private boolean f993j;

    /* renamed from: k */
    int f994k;

    /* renamed from: l */
    int f995l;

    /* renamed from: m */
    private int f996m;

    /* renamed from: n */
    private int f997n;

    /* renamed from: androidx.appcompat.widget.k0$a */
    class C0199a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f998f;

        C0199a(View view) {
            this.f998f = view;
        }

        public void run() {
            C0198k0.this.smoothScrollTo(this.f998f.getLeft() - ((C0198k0.this.getWidth() - this.f998f.getWidth()) / 2), 0);
            C0198k0.this.f989f = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$b */
    private class C0200b extends BaseAdapter {
        C0200b() {
        }

        public int getCount() {
            return C0198k0.this.f991h.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0202d) C0198k0.this.f991h.getChildAt(i)).mo1467a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0198k0.this.mo1450a((C0026a.C0029c) getItem(i), true);
            }
            ((C0202d) view).mo1468a((C0026a.C0029c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$c */
    private class C0201c implements View.OnClickListener {
        C0201c() {
        }

        public void onClick(View view) {
            ((C0202d) view).mo1467a().mo94e();
            int childCount = C0198k0.this.f991h.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0198k0.this.f991h.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k0$d */
    private class C0202d extends LinearLayout {

        /* renamed from: f */
        private final int[] f1002f = {16842964};

        /* renamed from: g */
        private C0026a.C0029c f1003g;

        /* renamed from: h */
        private TextView f1004h;

        /* renamed from: i */
        private ImageView f1005i;

        /* renamed from: j */
        private View f1006j;

        public C0202d(Context context, C0026a.C0029c cVar, boolean z) {
            super(context, (AttributeSet) null, C0654a.actionBarTabStyle);
            this.f1003g = cVar;
            C0217r0 a = C0217r0.m1054a(context, (AttributeSet) null, this.f1002f, C0654a.actionBarTabStyle, 0);
            if (a.mo1545g(0)) {
                setBackgroundDrawable(a.mo1535b(0));
            }
            a.mo1531a();
            if (z) {
                setGravity(8388627);
            }
            mo1469b();
        }

        /* renamed from: a */
        public C0026a.C0029c mo1467a() {
            return this.f1003g;
        }

        /* renamed from: a */
        public void mo1468a(C0026a.C0029c cVar) {
            this.f1003g = cVar;
            mo1469b();
        }

        /* renamed from: b */
        public void mo1469b() {
            C0026a.C0029c cVar = this.f1003g;
            View b = cVar.mo91b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1006j = b;
                TextView textView = this.f1004h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1005i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1005i.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1006j;
            if (view != null) {
                removeView(view);
                this.f1006j = null;
            }
            Drawable c = cVar.mo92c();
            CharSequence d = cVar.mo93d();
            if (c != null) {
                if (this.f1005i == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1005i = appCompatImageView;
                }
                this.f1005i.setImageDrawable(c);
                this.f1005i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1005i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1005i.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1004h == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C0654a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1004h = appCompatTextView;
                }
                this.f1004h.setText(d);
                this.f1004h.setVisibility(0);
            } else {
                TextView textView2 = this.f1004h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1004h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1005i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo90a());
            }
            if (!z) {
                charSequence = cVar.mo90a();
            }
            C0234t0.m1151a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0198k0.this.f994k > 0 && getMeasuredWidth() > (i3 = C0198k0.this.f994k)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m989a() {
        C0218s sVar = new C0218s(getContext(), (AttributeSet) null, C0654a.actionDropDownStyle);
        sVar.setLayoutParams(new C0168d0.C0169a(-2, -1));
        sVar.setOnItemSelectedListener(this);
        return sVar;
    }

    /* renamed from: b */
    private boolean m990b() {
        Spinner spinner = this.f992i;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m991c() {
        if (!m990b()) {
            if (this.f992i == null) {
                this.f992i = m989a();
            }
            removeView(this.f991h);
            addView(this.f992i, new ViewGroup.LayoutParams(-2, -1));
            if (this.f992i.getAdapter() == null) {
                this.f992i.setAdapter(new C0200b());
            }
            Runnable runnable = this.f989f;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f989f = null;
            }
            this.f992i.setSelection(this.f997n);
        }
    }

    /* renamed from: d */
    private boolean m992d() {
        if (!m990b()) {
            return false;
        }
        removeView(this.f992i);
        addView(this.f991h, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f992i.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0202d mo1450a(C0026a.C0029c cVar, boolean z) {
        C0202d dVar = new C0202d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f996m));
        } else {
            dVar.setFocusable(true);
            if (this.f990g == null) {
                this.f990g = new C0201c();
            }
            dVar.setOnClickListener(this.f990g);
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo1451a(int i) {
        View childAt = this.f991h.getChildAt(i);
        Runnable runnable = this.f989f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f989f = new C0199a(childAt);
        post(this.f989f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f989f;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0684a a = C0684a.m3766a(getContext());
        setContentHeight(a.mo3891e());
        this.f995l = a.mo3890d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f989f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0202d) view).mo1467a().mo94e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f991h.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f994k = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f994k = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f994k, this.f995l);
        }
        this.f994k = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f996m, 1073741824);
        if (z2 || !this.f993j) {
            z = false;
        }
        if (z) {
            this.f991h.measure(0, makeMeasureSpec);
            if (this.f991h.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m991c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f997n);
                    return;
                }
            }
        }
        m992d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f993j = z;
    }

    public void setContentHeight(int i) {
        this.f996m = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f997n = i;
        int childCount = this.f991h.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f991h.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo1451a(i);
            }
            i2++;
        }
        Spinner spinner = this.f992i;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
