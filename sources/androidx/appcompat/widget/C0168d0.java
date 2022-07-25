package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p006b.p007a.C0663j;
import p006b.p026g.p035k.C0851d;
import p006b.p026g.p035k.C0890v;

/* renamed from: androidx.appcompat.widget.d0 */
public class C0168d0 extends ViewGroup {

    /* renamed from: f */
    private boolean f878f;

    /* renamed from: g */
    private int f879g;

    /* renamed from: h */
    private int f880h;

    /* renamed from: i */
    private int f881i;

    /* renamed from: j */
    private int f882j;

    /* renamed from: k */
    private int f883k;

    /* renamed from: l */
    private float f884l;

    /* renamed from: m */
    private boolean f885m;

    /* renamed from: n */
    private int[] f886n;

    /* renamed from: o */
    private int[] f887o;

    /* renamed from: p */
    private Drawable f888p;

    /* renamed from: q */
    private int f889q;

    /* renamed from: r */
    private int f890r;

    /* renamed from: s */
    private int f891s;

    /* renamed from: t */
    private int f892t;

    /* renamed from: androidx.appcompat.widget.d0$a */
    public static class C0169a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f893a;

        /* renamed from: b */
        public int f894b;

        public C0169a(int i, int i2) {
            super(i, i2);
            this.f894b = -1;
            this.f893a = 0.0f;
        }

        public C0169a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f894b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0663j.LinearLayoutCompat_Layout);
            this.f893a = obtainStyledAttributes.getFloat(C0663j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f894b = obtainStyledAttributes.getInt(C0663j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0169a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f894b = -1;
        }
    }

    public C0168d0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0168d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0168d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f878f = true;
        this.f879g = -1;
        this.f880h = 0;
        this.f882j = 8388659;
        C0217r0 a = C0217r0.m1054a(context, attributeSet, C0663j.LinearLayoutCompat, i, 0);
        int d = a.mo1538d(C0663j.LinearLayoutCompat_android_orientation, -1);
        if (d >= 0) {
            setOrientation(d);
        }
        int d2 = a.mo1538d(C0663j.LinearLayoutCompat_android_gravity, -1);
        if (d2 >= 0) {
            setGravity(d2);
        }
        boolean a2 = a.mo1532a(C0663j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f884l = a.mo1533b(C0663j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f879g = a.mo1538d(C0663j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f885m = a.mo1532a(C0663j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo1535b(C0663j.LinearLayoutCompat_divider));
        this.f891s = a.mo1538d(C0663j.LinearLayoutCompat_showDividers, 0);
        this.f892t = a.mo1536c(C0663j.LinearLayoutCompat_dividerPadding, 0);
        a.mo1531a();
    }

    /* renamed from: a */
    private void m845a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m846c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo1249a(i3);
            if (a.getVisibility() != 8) {
                C0169a aVar = (C0169a) a.getLayoutParams();
                if (aVar.height == -1) {
                    int i4 = aVar.width;
                    aVar.width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    aVar.width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m847d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo1249a(i3);
            if (a.getVisibility() != 8) {
                C0169a aVar = (C0169a) a.getLayoutParams();
                if (aVar.width == -1) {
                    int i4 = aVar.height;
                    aVar.height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    aVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1247a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1248a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo1249a(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a6, code lost:
        if (r8 > 0) goto L_0x03b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b1, code lost:
        if (r8 < 0) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b3, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b4, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r4), r2);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r2 = r23;
        r4 = r24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1250a(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f883k = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f886n
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f887o
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f886n = r0
            int[] r0 = new int[r14]
            r7.f887o = r0
        L_0x0026:
            int[] r15 = r7.f886n
            int[] r6 = r7.f887o
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f878f
            boolean r3 = r7.f885m
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 1
            r28 = 0
        L_0x0061:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x01fc
            android.view.View r6 = r7.mo1249a((int) r1)
            if (r6 != 0) goto L_0x007c
            int r5 = r7.f883k
            int r6 = r7.mo1261c(r1)
            int r5 = r5 + r6
            r7.f883k = r5
        L_0x0076:
            r33 = r3
            r37 = r4
            goto L_0x01ec
        L_0x007c:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0088
            int r5 = r7.mo1248a((android.view.View) r6, (int) r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x0088:
            boolean r5 = r7.mo1260b((int) r1)
            if (r5 == 0) goto L_0x0095
            int r5 = r7.f883k
            int r10 = r7.f889q
            int r5 = r5 + r10
            r7.f883k = r5
        L_0x0095:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.d0$a r10 = (androidx.appcompat.widget.C0168d0.C0169a) r10
            float r5 = r10.f893a
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00e7
            int r0 = r10.width
            if (r0 != 0) goto L_0x00e7
            float r0 = r10.f893a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e7
            int r0 = r7.f883k
            if (r19 == 0) goto L_0x00b7
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            goto L_0x00c1
        L_0x00b7:
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
        L_0x00c1:
            r7.f883k = r0
            if (r4 == 0) goto L_0x00d8
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r31 = -2
            goto L_0x0161
        L_0x00d8:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r31 = -2
            goto L_0x0163
        L_0x00e7:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00f6
            float r0 = r10.f893a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00f9
        L_0x00f6:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f9:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0102
            int r0 = r7.f883k
            r30 = r0
            goto L_0x0104
        L_0x0102:
            r30 = 0
        L_0x0104:
            r34 = 0
            r0 = r38
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r39
            r37 = r4
            r4 = r30
            r9 = -1
            r30 = -2
            r5 = r40
            r30 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            r6 = r34
            r0.mo1254a(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x012d
            r10.width = r0
        L_0x012d:
            int r0 = r30.getMeasuredWidth()
            if (r19 == 0) goto L_0x0144
            int r1 = r7.f883k
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.mo1255b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            goto L_0x0159
        L_0x0144:
            r3 = r30
            int r1 = r7.f883k
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo1255b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0159:
            r7.f883k = r1
            if (r33 == 0) goto L_0x0161
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0161:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0163:
            if (r13 == r1) goto L_0x016e
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x016e
            r0 = 1
            r28 = 1
            goto L_0x016f
        L_0x016e:
            r0 = 0
        L_0x016f:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01ae
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01ae
            int r9 = r10.f894b
            if (r9 >= 0) goto L_0x0192
            int r9 = r7.f882j
        L_0x0192:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
        L_0x01ae:
            r1 = r21
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01bd
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01bd
            r6 = 1
            goto L_0x01be
        L_0x01bd:
            r6 = 0
        L_0x01be:
            float r9 = r10.f893a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01cf
            if (r0 == 0) goto L_0x01c7
            goto L_0x01c8
        L_0x01c7:
            r2 = r4
        L_0x01c8:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01dc
        L_0x01cf:
            r10 = r23
            if (r0 == 0) goto L_0x01d4
            r4 = r2
        L_0x01d4:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r4)
            r23 = r10
        L_0x01dc:
            r10 = r35
            int r0 = r7.mo1248a((android.view.View) r3, (int) r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r32
        L_0x01ec:
            int r1 = r1 + 1
            r9 = r40
            r6 = r29
            r3 = r33
            r4 = r37
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x01fc:
            r33 = r3
            r37 = r4
            r1 = r21
            r2 = r22
            r10 = r23
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            int r3 = r7.f883k
            if (r3 <= 0) goto L_0x021d
            boolean r3 = r7.mo1260b((int) r11)
            if (r3 == 0) goto L_0x021d
            int r3 = r7.f883k
            int r4 = r7.f889q
            int r3 = r3 + r4
            r7.f883k = r3
        L_0x021d:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x0233
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x0233
            r3 = r15[r17]
            if (r3 != r4) goto L_0x0233
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0230
            goto L_0x0233
        L_0x0230:
            r23 = r6
            goto L_0x0264
        L_0x0233:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r23 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r1 = java.lang.Math.max(r1, r3)
        L_0x0264:
            if (r33 == 0) goto L_0x02c5
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x026c
            if (r12 != 0) goto L_0x02c5
        L_0x026c:
            r3 = 0
            r7.f883k = r3
            r3 = 0
        L_0x0270:
            if (r3 >= r11) goto L_0x02c5
            android.view.View r4 = r7.mo1249a((int) r3)
            if (r4 != 0) goto L_0x0282
            int r4 = r7.f883k
            int r5 = r7.mo1261c(r3)
            int r4 = r4 + r5
            r7.f883k = r4
            goto L_0x028f
        L_0x0282:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0292
            int r4 = r7.mo1248a((android.view.View) r4, (int) r3)
            int r3 = r3 + r4
        L_0x028f:
            r22 = r1
            goto L_0x02c0
        L_0x0292:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.d0$a r5 = (androidx.appcompat.widget.C0168d0.C0169a) r5
            int r6 = r7.f883k
            if (r19 == 0) goto L_0x02ab
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo1255b((android.view.View) r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f883k = r6
            goto L_0x028f
        L_0x02ab:
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo1255b((android.view.View) r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f883k = r1
        L_0x02c0:
            int r3 = r3 + 1
            r1 = r22
            goto L_0x0270
        L_0x02c5:
            r22 = r1
            int r1 = r7.f883k
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f883k = r1
            int r1 = r7.f883k
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f883k
            int r3 = r3 - r4
            if (r24 != 0) goto L_0x0338
            if (r3 == 0) goto L_0x02f4
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f4
            goto L_0x0338
        L_0x02f4:
            int r0 = java.lang.Math.max(r2, r10)
            if (r33 == 0) goto L_0x0330
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0330
            r2 = 0
        L_0x02ff:
            if (r2 >= r11) goto L_0x0330
            android.view.View r3 = r7.mo1249a((int) r2)
            if (r3 == 0) goto L_0x032d
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0310
            goto L_0x032d
        L_0x0310:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.d0$a r5 = (androidx.appcompat.widget.C0168d0.C0169a) r5
            float r5 = r5.f893a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x032d
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x032d:
            int r2 = r2 + 1
            goto L_0x02ff
        L_0x0330:
            r3 = r40
            r26 = r11
            r2 = r22
            goto L_0x04cf
        L_0x0338:
            float r5 = r7.f884l
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x033f
            r0 = r5
        L_0x033f:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f883k = r6
            r10 = r2
            r9 = r23
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0359:
            if (r0 >= r11) goto L_0x0476
            android.view.View r14 = r7.mo1249a((int) r0)
            if (r14 == 0) goto L_0x0465
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x036b
            goto L_0x0465
        L_0x036b:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.d0$a r5 = (androidx.appcompat.widget.C0168d0.C0169a) r5
            float r4 = r5.f893a
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03cb
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r4 = r4 + r23
            r23 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r24 = r3
            r26 = r11
            r11 = -1
            r3 = r40
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03a9
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03a6
            goto L_0x03ab
        L_0x03a6:
            if (r8 <= 0) goto L_0x03b3
            goto L_0x03b4
        L_0x03a9:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03ab:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03b4
        L_0x03b3:
            r8 = 0
        L_0x03b4:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r23
            r4 = r24
            goto L_0x03d1
        L_0x03cb:
            r4 = r3
            r26 = r11
            r11 = -1
            r3 = r40
        L_0x03d1:
            int r8 = r7.f883k
            if (r19 == 0) goto L_0x03ee
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo1255b((android.view.View) r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f883k = r8
            r23 = r2
            goto L_0x0406
        L_0x03ee:
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.mo1255b((android.view.View) r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f883k = r2
        L_0x0406:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x0411
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x0411
            r2 = 1
            goto L_0x0412
        L_0x0411:
            r2 = 0
        L_0x0412:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x0423
            goto L_0x0424
        L_0x0423:
            r8 = r11
        L_0x0424:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x0431
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x0432
            r8 = 1
            goto L_0x0433
        L_0x0431:
            r10 = -1
        L_0x0432:
            r8 = 0
        L_0x0433:
            if (r37 == 0) goto L_0x045d
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x045d
            int r5 = r5.f894b
            if (r5 >= 0) goto L_0x0441
            int r5 = r7.f882j
        L_0x0441:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x045f
        L_0x045d:
            r24 = 4
        L_0x045f:
            r10 = r2
            r27 = r8
            r2 = r23
            goto L_0x046c
        L_0x0465:
            r4 = r3
            r26 = r11
            r24 = 4
            r3 = r40
        L_0x046c:
            int r0 = r0 + 1
            r8 = r39
            r3 = r4
            r11 = r26
            r5 = -1
            goto L_0x0359
        L_0x0476:
            r3 = r40
            r26 = r11
            int r0 = r7.f883k
            int r2 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f883k = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x049d
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x049d
            r0 = r15[r17]
            if (r0 != r2) goto L_0x049d
            r0 = r15[r16]
            if (r0 == r2) goto L_0x049b
            goto L_0x049d
        L_0x049b:
            r0 = r6
            goto L_0x04cb
        L_0x049d:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04cb:
            r2 = r0
            r23 = r9
            r0 = r10
        L_0x04cf:
            if (r27 != 0) goto L_0x04d6
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04d6
            goto L_0x04d7
        L_0x04d6:
            r0 = r2
        L_0x04d7:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r23 & r2
            r1 = r1 | r2
            int r2 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x0500
            r0 = r39
            r1 = r26
            r7.m846c(r1, r0)
        L_0x0500:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0168d0.mo1250a(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1251a(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0246x0.m1240a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f882j
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f878f
            int[] r13 = r6.f886n
            int[] r14 = r6.f887o
            int r1 = p006b.p026g.p035k.C0890v.m4791o(r24)
            int r1 = p006b.p026g.p035k.C0851d.m4580a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f883k
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f883k
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0140
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo1249a((int) r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo1261c(r2)
            int r1 = r1 + r0
            goto L_0x012a
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0128
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.d0$a r4 = (androidx.appcompat.widget.C0168d0.C0169a) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r3 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r3 = -1
        L_0x00a3:
            int r10 = r4.f894b
            if (r10 >= 0) goto L_0x00a8
            r10 = r11
        L_0x00a8:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00e4
            r11 = 48
            if (r10 == r11) goto L_0x00d4
            r11 = 80
            if (r10 == r11) goto L_0x00bd
            r3 = r7
            r11 = -1
        L_0x00ba:
            r21 = 1
            goto L_0x00f2
        L_0x00bd:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00d2
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
        L_0x00d2:
            r3 = r10
            goto L_0x00ba
        L_0x00d4:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            r21 = 1
            if (r3 == r11) goto L_0x00e2
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
        L_0x00e2:
            r3 = r10
            goto L_0x00f2
        L_0x00e4:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f2:
            boolean r10 = r6.mo1260b((int) r2)
            if (r10 == 0) goto L_0x00fb
            int r10 = r6.f889q
            int r1 = r1 + r10
        L_0x00fb:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo1247a((android.view.View) r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m845a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo1255b((android.view.View) r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo1248a((android.view.View) r0, (int) r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0134
        L_0x0128:
            r18 = r3
        L_0x012a:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0134:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0168d0.mo1251a(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1252a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0246x0.m1240a(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View a2 = mo1249a(i4);
            if (!(a2 == null || a2.getVisibility() == 8 || !mo1260b(i4))) {
                C0169a aVar = (C0169a) a2.getLayoutParams();
                mo1259b(canvas, a ? a2.getRight() + aVar.rightMargin : (a2.getLeft() - aVar.leftMargin) - this.f889q);
            }
        }
        if (mo1260b(virtualChildCount)) {
            View a3 = mo1249a(virtualChildCount - 1);
            if (a3 != null) {
                C0169a aVar2 = (C0169a) a3.getLayoutParams();
                if (a) {
                    i3 = a3.getLeft();
                    i2 = aVar2.leftMargin;
                } else {
                    i = a3.getRight() + aVar2.rightMargin;
                    mo1259b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo1259b(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f889q;
            mo1259b(canvas, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1253a(Canvas canvas, int i) {
        this.f888p.setBounds(getPaddingLeft() + this.f892t, i, (getWidth() - getPaddingRight()) - this.f892t, this.f890r + i);
        this.f888p.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1254a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1255b(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02db, code lost:
        if (r15 > 0) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e6, code lost:
        if (r15 < 0) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e8, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e9, code lost:
        r13.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0331  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1256b(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f883k = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f879g
            boolean r15 = r7.f885m
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x019d
            android.view.View r4 = r7.mo1249a((int) r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f883k
            int r10 = r7.mo1261c(r6)
            int r4 = r4 + r10
            r7.f883k = r4
            r23 = r11
            r4 = r22
        L_0x0043:
            r22 = r13
            goto L_0x0191
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005b
            int r1 = r7.mo1248a((android.view.View) r4, (int) r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            goto L_0x0043
        L_0x005b:
            boolean r1 = r7.mo1260b((int) r6)
            if (r1 == 0) goto L_0x0068
            int r1 = r7.f883k
            int r10 = r7.f890r
            int r1 = r1 + r10
            r7.f883k = r1
        L_0x0068:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.d0$a r10 = (androidx.appcompat.widget.C0168d0.C0169a) r10
            float r1 = r10.f893a
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            float r0 = r10.f893a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.f883k
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f883k = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r8 = r24
            r30 = r26
            r18 = 1
            r11 = r6
            r32 = r22
            r22 = r13
            r13 = r32
            goto L_0x0118
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b7
            float r0 = r10.f893a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b9
        L_0x00b7:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b9:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            int r0 = r7.f883k
            r28 = r0
            goto L_0x00c6
        L_0x00c4:
            r28 = 0
        L_0x00c6:
            r0 = r33
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r4
            r23 = r11
            r11 = 1073741824(0x40000000, float:2.0)
            r32 = r22
            r22 = r13
            r13 = r32
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r28
            r0.mo1254a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f5
            r10.height = r0
        L_0x00f5:
            int r0 = r24.getMeasuredHeight()
            int r1 = r7.f883k
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r24
            int r4 = r7.mo1255b((android.view.View) r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f883k = r1
            if (r15 == 0) goto L_0x0117
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0118
        L_0x0117:
            r0 = r9
        L_0x0118:
            if (r14 < 0) goto L_0x0122
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0122
            int r1 = r7.f883k
            r7.f880h = r1
        L_0x0122:
            if (r11 >= r14) goto L_0x0133
            float r1 = r10.f893a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012b
            goto L_0x0133
        L_0x012b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0140
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0140
            r1 = 1
            r20 = 1
            goto L_0x0141
        L_0x0140:
            r1 = 0
        L_0x0141:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r30
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0162
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0162
            r8 = 1
            goto L_0x0163
        L_0x0162:
            r8 = 0
        L_0x0163:
            float r9 = r10.f893a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0175
            if (r1 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r4
        L_0x016d:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r31
            goto L_0x017f
        L_0x0175:
            if (r1 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
        L_0x017f:
            int r2 = r7.mo1248a((android.view.View) r3, (int) r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x0191:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r22
            r11 = r23
            goto L_0x002a
        L_0x019d:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r5 = r2
            r32 = r22
            r22 = r13
            r13 = r32
            int r2 = r7.f883k
            if (r2 <= 0) goto L_0x01bd
            r2 = r23
            boolean r3 = r7.mo1260b((int) r2)
            if (r3 == 0) goto L_0x01bf
            int r3 = r7.f883k
            int r4 = r7.f890r
            int r3 = r3 + r4
            r7.f883k = r3
            goto L_0x01bf
        L_0x01bd:
            r2 = r23
        L_0x01bf:
            r3 = r22
            if (r15 == 0) goto L_0x020d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c9
            if (r3 != 0) goto L_0x020d
        L_0x01c9:
            r4 = 0
            r7.f883k = r4
            r4 = 0
        L_0x01cd:
            if (r4 >= r2) goto L_0x020d
            android.view.View r6 = r7.mo1249a((int) r4)
            if (r6 != 0) goto L_0x01df
            int r6 = r7.f883k
            int r11 = r7.mo1261c(r4)
            int r6 = r6 + r11
        L_0x01dc:
            r7.f883k = r6
            goto L_0x0208
        L_0x01df:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01eb
            int r6 = r7.mo1248a((android.view.View) r6, (int) r4)
            int r4 = r4 + r6
            goto L_0x0208
        L_0x01eb:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.d0$a r11 = (androidx.appcompat.widget.C0168d0.C0169a) r11
            int r14 = r7.f883k
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo1255b((android.view.View) r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            goto L_0x01dc
        L_0x0208:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01cd
        L_0x020d:
            int r4 = r7.f883k
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f883k = r4
            int r4 = r7.f883k
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f883k
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x027e
            if (r9 == 0) goto L_0x023d
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x023d
            goto L_0x027e
        L_0x023d:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x0279
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x0279
            r1 = 0
        L_0x0248:
            if (r1 >= r2) goto L_0x0279
            android.view.View r3 = r7.mo1249a((int) r1)
            if (r3 == 0) goto L_0x0276
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x0259
            goto L_0x0276
        L_0x0259:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.d0$a r9 = (androidx.appcompat.widget.C0168d0.C0169a) r9
            float r9 = r9.f893a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0276
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0276:
            int r1 = r1 + 1
            goto L_0x0248
        L_0x0279:
            r11 = r34
            r1 = r8
            goto L_0x0368
        L_0x027e:
            float r10 = r7.f884l
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0285
            r0 = r10
        L_0x0285:
            r10 = 0
            r7.f883k = r10
            r11 = r0
            r0 = 0
            r32 = r8
            r8 = r1
            r1 = r32
        L_0x028f:
            if (r0 >= r2) goto L_0x0357
            android.view.View r13 = r7.mo1249a((int) r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02a3
            r21 = r11
            r11 = r34
            goto L_0x0350
        L_0x02a3:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.d0$a r14 = (androidx.appcompat.widget.C0168d0.C0169a) r14
            float r10 = r14.f893a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x02fb
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r34
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02de
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02db
            goto L_0x02e0
        L_0x02db:
            if (r15 <= 0) goto L_0x02e8
            goto L_0x02e9
        L_0x02de:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02e0:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02e9
        L_0x02e8:
            r15 = 0
        L_0x02e9:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            goto L_0x0302
        L_0x02fb:
            r10 = r11
            r11 = r34
            r18 = r9
            r21 = r10
        L_0x0302:
            int r9 = r14.leftMargin
            int r10 = r14.rightMargin
            int r9 = r9 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r9
            int r5 = java.lang.Math.max(r5, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x031d
            int r15 = r14.width
            r23 = r1
            r1 = -1
            if (r15 != r1) goto L_0x0320
            r15 = 1
            goto L_0x0321
        L_0x031d:
            r23 = r1
            r1 = -1
        L_0x0320:
            r15 = 0
        L_0x0321:
            if (r15 == 0) goto L_0x0324
            goto L_0x0325
        L_0x0324:
            r9 = r10
        L_0x0325:
            int r8 = java.lang.Math.max(r8, r9)
            if (r19 == 0) goto L_0x0331
            int r9 = r14.width
            if (r9 != r1) goto L_0x0331
            r9 = 1
            goto L_0x0332
        L_0x0331:
            r9 = 0
        L_0x0332:
            int r10 = r7.f883k
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo1255b((android.view.View) r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f883k = r1
            r19 = r9
            r9 = r18
            r1 = r23
        L_0x0350:
            int r0 = r0 + 1
            r11 = r21
            r10 = 0
            goto L_0x028f
        L_0x0357:
            r11 = r34
            int r0 = r7.f883k
            int r3 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f883k = r0
            r0 = r8
        L_0x0368:
            if (r19 != 0) goto L_0x036f
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x036f
            goto L_0x0370
        L_0x036f:
            r0 = r5
        L_0x0370:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x038e
            r7.m847d(r2, r6)
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0168d0.mo1256b(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1257b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f882j;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f883k : getPaddingTop() + (((i4 - i2) - this.f883k) / 2);
        int i11 = 0;
        while (i11 < virtualChildCount) {
            View a = mo1249a(i11);
            if (a == null) {
                paddingTop += mo1261c(i11);
            } else if (a.getVisibility() != 8) {
                int measuredWidth = a.getMeasuredWidth();
                int measuredHeight = a.getMeasuredHeight();
                C0169a aVar = (C0169a) a.getLayoutParams();
                int i12 = aVar.f894b;
                if (i12 < 0) {
                    i12 = i10;
                }
                int a2 = C0851d.m4580a(i12, C0890v.m4791o(this)) & 7;
                if (a2 == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + aVar.leftMargin;
                    i6 = i5 - aVar.rightMargin;
                } else if (a2 != 5) {
                    i6 = aVar.leftMargin + paddingLeft;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = i5 - aVar.rightMargin;
                }
                int i13 = i6;
                if (mo1260b(i11)) {
                    paddingTop += this.f890r;
                }
                int i14 = paddingTop + aVar.topMargin;
                m845a(a, i13, i14 + mo1247a(a), measuredWidth, measuredHeight);
                i11 += mo1248a(a, i11);
                paddingTop = i14 + measuredHeight + aVar.bottomMargin + mo1255b(a);
            }
            i11++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1258b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View a = mo1249a(i);
            if (!(a == null || a.getVisibility() == 8 || !mo1260b(i))) {
                mo1253a(canvas, (a.getTop() - ((C0169a) a.getLayoutParams()).topMargin) - this.f890r);
            }
        }
        if (mo1260b(virtualChildCount)) {
            View a2 = mo1249a(virtualChildCount - 1);
            mo1253a(canvas, a2 == null ? (getHeight() - getPaddingBottom()) - this.f890r : a2.getBottom() + ((C0169a) a2.getLayoutParams()).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1259b(Canvas canvas, int i) {
        this.f888p.setBounds(i, getPaddingTop() + this.f892t, this.f889q + i, (getHeight() - getPaddingBottom()) - this.f892t);
        this.f888p.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1260b(int i) {
        if (i == 0) {
            return (this.f891s & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f891s & 4) != 0;
        }
        if ((this.f891s & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo1261c(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0169a;
    }

    /* access modifiers changed from: protected */
    public C0169a generateDefaultLayoutParams() {
        int i = this.f881i;
        if (i == 0) {
            return new C0169a(-2, -2);
        }
        if (i == 1) {
            return new C0169a(-1, -2);
        }
        return null;
    }

    public C0169a generateLayoutParams(AttributeSet attributeSet) {
        return new C0169a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0169a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0169a(layoutParams);
    }

    public int getBaseline() {
        int i;
        if (this.f879g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f879g;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f880h;
                if (this.f881i == 1 && (i = this.f882j & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f883k) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f883k;
                    }
                }
                return i3 + ((C0169a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f879g == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f879g;
    }

    public Drawable getDividerDrawable() {
        return this.f888p;
    }

    public int getDividerPadding() {
        return this.f892t;
    }

    public int getDividerWidth() {
        return this.f889q;
    }

    public int getGravity() {
        return this.f882j;
    }

    public int getOrientation() {
        return this.f881i;
    }

    public int getShowDividers() {
        return this.f891s;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f884l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f888p != null) {
            if (this.f881i == 1) {
                mo1258b(canvas);
            } else {
                mo1252a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f881i == 1) {
            mo1257b(i, i2, i3, i4);
        } else {
            mo1251a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f881i == 1) {
            mo1256b(i, i2);
        } else {
            mo1250a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f878f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f879g = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f888p) {
            this.f888p = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f889q = drawable.getIntrinsicWidth();
                this.f890r = drawable.getIntrinsicHeight();
            } else {
                this.f889q = 0;
                this.f890r = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f892t = i;
    }

    public void setGravity(int i) {
        if (this.f882j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f882j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f882j;
        if ((8388615 & i3) != i2) {
            this.f882j = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f885m = z;
    }

    public void setOrientation(int i) {
        if (this.f881i != i) {
            this.f881i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f891s) {
            requestLayout();
        }
        this.f891s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f882j;
        if ((i3 & 112) != i2) {
            this.f882j = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f884l = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
