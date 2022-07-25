package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C2541d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements C2538a {

    /* renamed from: f */
    private int f6404f;

    /* renamed from: g */
    private int f6405g;

    /* renamed from: h */
    private int f6406h;

    /* renamed from: i */
    private int f6407i;

    /* renamed from: j */
    private int f6408j;

    /* renamed from: k */
    private int f6409k;

    /* renamed from: l */
    private Drawable f6410l;

    /* renamed from: m */
    private Drawable f6411m;

    /* renamed from: n */
    private int f6412n;

    /* renamed from: o */
    private int f6413o;

    /* renamed from: p */
    private int f6414p;

    /* renamed from: q */
    private int f6415q;

    /* renamed from: r */
    private int[] f6416r;

    /* renamed from: s */
    private SparseIntArray f6417s;

    /* renamed from: t */
    private C2541d f6418t;

    /* renamed from: u */
    private List<C2540c> f6419u;

    /* renamed from: v */
    private C2541d.C2543b f6420v;

    /* renamed from: com.google.android.flexbox.FlexboxLayout$a */
    public static class C2529a extends ViewGroup.MarginLayoutParams implements C2539b {
        public static final Parcelable.Creator<C2529a> CREATOR = new C2530a();

        /* renamed from: f */
        private int f6421f = 1;

        /* renamed from: g */
        private float f6422g = 0.0f;

        /* renamed from: h */
        private float f6423h = 1.0f;

        /* renamed from: i */
        private int f6424i = -1;

        /* renamed from: j */
        private float f6425j = -1.0f;

        /* renamed from: k */
        private int f6426k;

        /* renamed from: l */
        private int f6427l;

        /* renamed from: m */
        private int f6428m = 16777215;

        /* renamed from: n */
        private int f6429n = 16777215;

        /* renamed from: o */
        private boolean f6430o;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a */
        static class C2530a implements Parcelable.Creator<C2529a> {
            C2530a() {
            }

            public C2529a createFromParcel(Parcel parcel) {
                return new C2529a(parcel);
            }

            public C2529a[] newArray(int i) {
                return new C2529a[i];
            }
        }

        public C2529a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2545e.FlexboxLayout_Layout);
            this.f6421f = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_Layout_layout_order, 1);
            this.f6422g = obtainStyledAttributes.getFloat(C2545e.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f6423h = obtainStyledAttributes.getFloat(C2545e.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f6424i = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f6425j = obtainStyledAttributes.getFraction(C2545e.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f6426k = obtainStyledAttributes.getDimensionPixelSize(C2545e.FlexboxLayout_Layout_layout_minWidth, 0);
            this.f6427l = obtainStyledAttributes.getDimensionPixelSize(C2545e.FlexboxLayout_Layout_layout_minHeight, 0);
            this.f6428m = obtainStyledAttributes.getDimensionPixelSize(C2545e.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f6429n = obtainStyledAttributes.getDimensionPixelSize(C2545e.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f6430o = obtainStyledAttributes.getBoolean(C2545e.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected C2529a(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f6421f = parcel.readInt();
            this.f6422g = parcel.readFloat();
            this.f6423h = parcel.readFloat();
            this.f6424i = parcel.readInt();
            this.f6425j = parcel.readFloat();
            this.f6426k = parcel.readInt();
            this.f6427l = parcel.readInt();
            this.f6428m = parcel.readInt();
            this.f6429n = parcel.readInt();
            this.f6430o = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public C2529a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2529a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2529a(C2529a aVar) {
            super(aVar);
            this.f6421f = aVar.f6421f;
            this.f6422g = aVar.f6422g;
            this.f6423h = aVar.f6423h;
            this.f6424i = aVar.f6424i;
            this.f6425j = aVar.f6425j;
            this.f6426k = aVar.f6426k;
            this.f6427l = aVar.f6427l;
            this.f6428m = aVar.f6428m;
            this.f6429n = aVar.f6429n;
            this.f6430o = aVar.f6430o;
        }

        /* renamed from: a */
        public int mo7606a() {
            return this.rightMargin;
        }

        /* renamed from: b */
        public int mo7607b() {
            return this.f6427l;
        }

        /* renamed from: c */
        public int mo7608c() {
            return this.f6426k;
        }

        /* renamed from: d */
        public boolean mo7609d() {
            return this.f6430o;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public float mo7611e() {
            return this.f6422g;
        }

        /* renamed from: f */
        public int mo7612f() {
            return this.f6429n;
        }

        /* renamed from: g */
        public int mo7613g() {
            return this.bottomMargin;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return this.f6421f;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: h */
        public float mo7617h() {
            return this.f6425j;
        }

        /* renamed from: i */
        public int mo7618i() {
            return this.leftMargin;
        }

        /* renamed from: j */
        public int mo7619j() {
            return this.f6424i;
        }

        /* renamed from: k */
        public float mo7620k() {
            return this.f6423h;
        }

        /* renamed from: l */
        public int mo7621l() {
            return this.f6428m;
        }

        /* renamed from: m */
        public int mo7622m() {
            return this.topMargin;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6421f);
            parcel.writeFloat(this.f6422g);
            parcel.writeFloat(this.f6423h);
            parcel.writeInt(this.f6424i);
            parcel.writeFloat(this.f6425j);
            parcel.writeInt(this.f6426k);
            parcel.writeInt(this.f6427l);
            parcel.writeInt(this.f6428m);
            parcel.writeInt(this.f6429n);
            parcel.writeByte(this.f6430o ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6409k = -1;
        this.f6418t = new C2541d(this);
        this.f6419u = new ArrayList();
        this.f6420v = new C2541d.C2543b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2545e.FlexboxLayout, i, 0);
        this.f6404f = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_flexDirection, 0);
        this.f6405g = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_flexWrap, 0);
        this.f6406h = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_justifyContent, 0);
        this.f6407i = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_alignItems, 4);
        this.f6408j = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_alignContent, 5);
        this.f6409k = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C2545e.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C2545e.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C2545e.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f6413o = i2;
            this.f6412n = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f6413o = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C2545e.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f6412n = i4;
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r1 < r4) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9491a(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            int r2 = android.view.View.MeasureSpec.getMode(r11)
            int r3 = android.view.View.MeasureSpec.getSize(r11)
            if (r9 == 0) goto L_0x0046
            r4 = 1
            if (r9 == r4) goto L_0x0046
            r4 = 2
            if (r9 == r4) goto L_0x0033
            r4 = 3
            if (r9 != r4) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid flex direction: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0033:
            int r9 = r8.getLargestMainSize()
            int r4 = r8.getSumOfCrossSize()
            int r5 = r8.getPaddingLeft()
            int r4 = r4 + r5
            int r5 = r8.getPaddingRight()
            int r4 = r4 + r5
            goto L_0x0058
        L_0x0046:
            int r9 = r8.getSumOfCrossSize()
            int r4 = r8.getPaddingTop()
            int r9 = r9 + r4
            int r4 = r8.getPaddingBottom()
            int r9 = r9 + r4
            int r4 = r8.getLargestMainSize()
        L_0x0058:
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r7) goto L_0x008b
            if (r0 == 0) goto L_0x0086
            if (r0 != r6) goto L_0x006f
            if (r1 >= r4) goto L_0x006a
        L_0x0066:
            int r12 = android.view.View.combineMeasuredStates(r12, r5)
        L_0x006a:
            int r10 = android.view.View.resolveSizeAndState(r1, r10, r12)
            goto L_0x0090
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown width mode is set: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0086:
            int r10 = android.view.View.resolveSizeAndState(r4, r10, r12)
            goto L_0x0090
        L_0x008b:
            if (r1 >= r4) goto L_0x008e
            goto L_0x0066
        L_0x008e:
            r1 = r4
            goto L_0x006a
        L_0x0090:
            r0 = 256(0x100, float:3.59E-43)
            if (r2 == r7) goto L_0x00bf
            if (r2 == 0) goto L_0x00ba
            if (r2 != r6) goto L_0x00a3
            if (r3 >= r9) goto L_0x009e
            int r12 = android.view.View.combineMeasuredStates(r12, r0)
        L_0x009e:
            int r9 = android.view.View.resolveSizeAndState(r3, r11, r12)
            goto L_0x00c7
        L_0x00a3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown height mode is set: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00ba:
            int r9 = android.view.View.resolveSizeAndState(r9, r11, r12)
            goto L_0x00c7
        L_0x00bf:
            if (r3 >= r9) goto L_0x00ba
            int r12 = android.view.View.combineMeasuredStates(r12, r0)
            r9 = r3
            goto L_0x00ba
        L_0x00c7:
            r8.setMeasuredDimension(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m9491a(int, int, int, int):void");
    }

    /* renamed from: a */
    private void m9492a(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f6410l;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f6414p + i2);
            this.f6410l.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m9493a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f6419u.size();
        for (int i = 0; i < size; i++) {
            C2540c cVar = this.f6419u.get(i);
            for (int i2 = 0; i2 < cVar.f6494h; i2++) {
                int i3 = cVar.f6501o + i2;
                View c = mo7571c(i3);
                if (!(c == null || c.getVisibility() == 8)) {
                    C2529a aVar = (C2529a) c.getLayoutParams();
                    if (m9500b(i3, i2)) {
                        m9498b(canvas, z ? c.getRight() + aVar.rightMargin : (c.getLeft() - aVar.leftMargin) - this.f6415q, cVar.f6488b, cVar.f6493g);
                    }
                    if (i2 == cVar.f6494h - 1 && (this.f6413o & 4) > 0) {
                        m9498b(canvas, z ? (c.getLeft() - aVar.leftMargin) - this.f6415q : c.getRight() + aVar.rightMargin, cVar.f6488b, cVar.f6493g);
                    }
                }
            }
            if (m9504e(i)) {
                m9492a(canvas, paddingLeft, z2 ? cVar.f6490d : cVar.f6488b - this.f6414p, max);
            }
            if (m9505f(i) && (this.f6412n & 4) > 0) {
                m9492a(canvas, paddingLeft, z2 ? cVar.f6488b - this.f6414p : cVar.f6490d, max);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9494a(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<com.google.android.flexbox.c> r6 = r0.f6419u
            int r6 = r6.size()
            r8 = r5
            r5 = r3
            r3 = 0
        L_0x0020:
            if (r3 >= r6) goto L_0x0208
            java.util.List<com.google.android.flexbox.c> r9 = r0.f6419u
            java.lang.Object r9 = r9.get(r3)
            com.google.android.flexbox.c r9 = (com.google.android.flexbox.C2540c) r9
            boolean r10 = r0.m9504e(r3)
            if (r10 == 0) goto L_0x0034
            int r10 = r0.f6414p
            int r5 = r5 - r10
            int r8 = r8 + r10
        L_0x0034:
            int r10 = r0.f6406h
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c9
            if (r10 == r13) goto L_0x00c1
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ae
            r7 = 3
            if (r10 == r7) goto L_0x0096
            if (r10 == r15) goto L_0x007c
            r7 = 5
            if (r10 != r7) goto L_0x0063
            int r7 = r9.mo7651c()
            if (r7 == 0) goto L_0x005b
            int r10 = r9.f6491e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r7 = r10 / r7
            goto L_0x005c
        L_0x005b:
            r7 = 0
        L_0x005c:
            float r10 = (float) r1
            float r10 = r10 + r7
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r7
            goto L_0x00ce
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f6406h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007c:
            int r7 = r9.mo7651c()
            if (r7 == 0) goto L_0x008b
            int r10 = r9.f6491e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r7 = r10 / r7
            goto L_0x008c
        L_0x008b:
            r7 = 0
        L_0x008c:
            float r10 = (float) r1
            float r12 = r7 / r12
            float r10 = r10 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00ce
        L_0x0096:
            float r10 = (float) r1
            int r7 = r9.mo7651c()
            if (r7 == r13) goto L_0x00a1
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a3
        L_0x00a1:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            int r12 = r9.f6491e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r7 = r12 / r7
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00ce
        L_0x00ae:
            float r7 = (float) r1
            int r10 = r9.f6491e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
            r10 = r7
            goto L_0x00cd
        L_0x00c1:
            int r7 = r9.f6491e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            goto L_0x00cc
        L_0x00c9:
            float r10 = (float) r1
            int r7 = r4 - r2
        L_0x00cc:
            float r12 = (float) r7
        L_0x00cd:
            r7 = 0
        L_0x00ce:
            float r7 = java.lang.Math.max(r7, r11)
            r14 = 0
        L_0x00d3:
            int r11 = r9.f6494h
            if (r14 >= r11) goto L_0x01fc
            int r11 = r9.f6501o
            int r11 = r11 + r14
            android.view.View r17 = r0.mo7571c(r11)
            if (r17 == 0) goto L_0x01ea
            int r15 = r17.getVisibility()
            r13 = 8
            if (r15 != r13) goto L_0x00ea
            goto L_0x01ea
        L_0x00ea:
            android.view.ViewGroup$LayoutParams r13 = r17.getLayoutParams()
            r15 = r13
            com.google.android.flexbox.FlexboxLayout$a r15 = (com.google.android.flexbox.FlexboxLayout.C2529a) r15
            int r13 = r15.leftMargin
            float r13 = (float) r13
            float r10 = r10 + r13
            int r13 = r15.rightMargin
            float r13 = (float) r13
            float r12 = r12 - r13
            boolean r11 = r0.m9500b(r11, r14)
            if (r11 == 0) goto L_0x010b
            int r11 = r0.f6415q
            float r13 = (float) r11
            float r10 = r10 + r13
            float r12 = r12 - r13
            r18 = r10
            r20 = r11
            r19 = r12
            goto L_0x0111
        L_0x010b:
            r18 = r10
            r19 = r12
            r20 = 0
        L_0x0111:
            int r10 = r9.f6494h
            r13 = 1
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0124
            int r10 = r0.f6413o
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0126
            int r10 = r0.f6415q
            r21 = r10
            goto L_0x0128
        L_0x0124:
            r16 = 4
        L_0x0126:
            r21 = 0
        L_0x0128:
            int r10 = r0.f6405g
            r12 = 2
            if (r10 != r12) goto L_0x0181
            if (r29 == 0) goto L_0x015a
            com.google.android.flexbox.d r10 = r0.f6418t
            int r11 = java.lang.Math.round(r19)
            int r22 = r17.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r17.getMeasuredHeight()
            int r23 = r5 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r17
            r25 = 2
            r12 = r9
            r26 = 1
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = 4
            r15 = r24
            goto L_0x017e
        L_0x015a:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            com.google.android.flexbox.d r10 = r0.f6418t
            int r13 = java.lang.Math.round(r18)
            int r11 = r17.getMeasuredHeight()
            int r14 = r5 - r11
            int r11 = java.lang.Math.round(r18)
            int r12 = r17.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r17
            r12 = r9
        L_0x017e:
            r16 = r5
            goto L_0x01b7
        L_0x0181:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            com.google.android.flexbox.d r10 = r0.f6418t
            if (r29 == 0) goto L_0x019f
            int r11 = java.lang.Math.round(r19)
            int r12 = r17.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            goto L_0x01ad
        L_0x019f:
            int r13 = java.lang.Math.round(r18)
            int r11 = java.lang.Math.round(r18)
            int r12 = r17.getMeasuredWidth()
            int r15 = r11 + r12
        L_0x01ad:
            int r11 = r17.getMeasuredHeight()
            int r16 = r8 + r11
            r11 = r17
            r12 = r9
            r14 = r8
        L_0x01b7:
            r10.mo7657a((android.view.View) r11, (com.google.android.flexbox.C2540c) r12, (int) r13, (int) r14, (int) r15, (int) r16)
            int r10 = r17.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r18 = r18 + r10
            int r10 = r17.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r17
            if (r29 == 0) goto L_0x01de
            r12 = r21
            r14 = r20
            goto L_0x01e2
        L_0x01de:
            r12 = r20
            r14 = r21
        L_0x01e2:
            r10.mo7649a(r11, r12, r13, r14, r15)
            r10 = r18
            r12 = r19
            goto L_0x01f4
        L_0x01ea:
            r23 = r1
            r22 = r14
            r25 = 2
            r26 = 1
            r27 = 4
        L_0x01f4:
            int r14 = r22 + 1
            r1 = r23
            r13 = 1
            r15 = 4
            goto L_0x00d3
        L_0x01fc:
            r23 = r1
            int r1 = r9.f6493g
            int r8 = r8 + r1
            int r5 = r5 - r1
            int r3 = r3 + 1
            r1 = r23
            goto L_0x0020
        L_0x0208:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m9494a(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9495a(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.c> r3 = r0.f6419u
            int r3 = r3.size()
            r8 = r5
            r5 = r4
            r4 = 0
        L_0x0020:
            if (r4 >= r3) goto L_0x0203
            java.util.List<com.google.android.flexbox.c> r9 = r0.f6419u
            java.lang.Object r9 = r9.get(r4)
            com.google.android.flexbox.c r9 = (com.google.android.flexbox.C2540c) r9
            boolean r10 = r0.m9504e(r4)
            if (r10 == 0) goto L_0x0034
            int r10 = r0.f6415q
            int r5 = r5 + r10
            int r8 = r8 - r10
        L_0x0034:
            int r10 = r0.f6406h
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c9
            if (r10 == r14) goto L_0x00c1
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00af
            r12 = 3
            if (r10 == r12) goto L_0x0096
            if (r10 == r15) goto L_0x007c
            r12 = 5
            if (r10 != r12) goto L_0x0063
            int r10 = r9.mo7651c()
            if (r10 == 0) goto L_0x005b
            int r12 = r9.f6491e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r10 = r12 / r10
            goto L_0x005c
        L_0x005b:
            r10 = 0
        L_0x005c:
            float r12 = (float) r1
            float r12 = r12 + r10
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r10
            goto L_0x00ce
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f6406h
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007c:
            int r10 = r9.mo7651c()
            if (r10 == 0) goto L_0x008b
            int r12 = r9.f6491e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r10 = r12 / r10
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            float r12 = (float) r1
            float r13 = r10 / r13
            float r12 = r12 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00ce
        L_0x0096:
            float r12 = (float) r1
            int r7 = r9.mo7651c()
            if (r7 == r14) goto L_0x00a1
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a3
        L_0x00a1:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            int r10 = r9.f6491e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r7 = r10 / r7
            int r10 = r6 - r2
            float r13 = (float) r10
            r10 = r7
            goto L_0x00ce
        L_0x00af:
            float r7 = (float) r1
            int r10 = r9.f6491e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r12 = r12 + r7
            int r7 = r6 - r2
            float r7 = (float) r7
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r7 - r10
            goto L_0x00cd
        L_0x00c1:
            int r7 = r9.f6491e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r12 = (float) r10
            int r7 = r7 - r1
            goto L_0x00cc
        L_0x00c9:
            float r12 = (float) r1
            int r7 = r6 - r2
        L_0x00cc:
            float r13 = (float) r7
        L_0x00cd:
            r10 = 0
        L_0x00ce:
            float r7 = java.lang.Math.max(r10, r11)
            r10 = r13
            r13 = 0
        L_0x00d4:
            int r11 = r9.f6494h
            if (r13 >= r11) goto L_0x01fb
            int r11 = r9.f6501o
            int r11 = r11 + r13
            android.view.View r18 = r0.mo7571c(r11)
            if (r18 == 0) goto L_0x01ef
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00eb
            goto L_0x01ef
        L_0x00eb:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$a r15 = (com.google.android.flexbox.FlexboxLayout.C2529a) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r12 = r12 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r10 = r10 - r14
            boolean r11 = r0.m9500b(r11, r13)
            if (r11 == 0) goto L_0x010c
            int r11 = r0.f6414p
            float r14 = (float) r11
            float r12 = r12 + r14
            float r10 = r10 - r14
            r20 = r10
            r21 = r11
            r19 = r12
            goto L_0x0112
        L_0x010c:
            r20 = r10
            r19 = r12
            r21 = 0
        L_0x0112:
            int r10 = r9.f6494h
            r14 = 1
            int r10 = r10 - r14
            if (r13 != r10) goto L_0x0125
            int r10 = r0.f6412n
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0127
            int r10 = r0.f6414p
            r22 = r10
            goto L_0x0129
        L_0x0125:
            r16 = 4
        L_0x0127:
            r22 = 0
        L_0x0129:
            if (r30 == 0) goto L_0x0180
            if (r31 == 0) goto L_0x015b
            com.google.android.flexbox.d r10 = r0.f6418t
            r17 = 1
            int r11 = r18.getMeasuredWidth()
            int r23 = r8 - r11
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r24 = r11 - r12
            int r25 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r26 = r13
            r13 = r17
            r27 = 1
            r14 = r23
            r28 = r15
            r23 = 4
            r15 = r24
            r16 = r8
            r17 = r25
            goto L_0x01ba
        L_0x015b:
            r26 = r13
            r28 = r15
            r23 = 4
            r27 = 1
            com.google.android.flexbox.d r10 = r0.f6418t
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r8 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r8
            goto L_0x01ba
        L_0x0180:
            r26 = r13
            r28 = r15
            r23 = 4
            r27 = 1
            com.google.android.flexbox.d r10 = r0.f6418t
            r13 = 0
            if (r31 == 0) goto L_0x01a2
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r5 + r11
            int r17 = java.lang.Math.round(r20)
            goto L_0x01b6
        L_0x01a2:
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r5 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
        L_0x01b6:
            r11 = r18
            r12 = r9
            r14 = r5
        L_0x01ba:
            r10.mo7658a((android.view.View) r11, (com.google.android.flexbox.C2540c) r12, (boolean) r13, (int) r14, (int) r15, (int) r16, (int) r17)
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r28
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            if (r31 == 0) goto L_0x01e3
            r13 = r22
            r15 = r21
            goto L_0x01e7
        L_0x01e3:
            r13 = r21
            r15 = r22
        L_0x01e7:
            r10.mo7649a(r11, r12, r13, r14, r15)
            r12 = r19
            r10 = r20
            goto L_0x01f5
        L_0x01ef:
            r26 = r13
            r23 = 4
            r27 = 1
        L_0x01f5:
            int r13 = r26 + 1
            r14 = 1
            r15 = 4
            goto L_0x00d4
        L_0x01fb:
            int r7 = r9.f6493g
            int r5 = r5 + r7
            int r8 = r8 - r7
            int r4 = r4 + 1
            goto L_0x0020
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m9495a(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: a */
    private boolean m9496a(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View c = mo7571c(i - i3);
            if (c != null && c.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m9497b() {
        setWillNotDraw(this.f6410l == null && this.f6411m == null);
    }

    /* renamed from: b */
    private void m9498b(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f6411m;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f6415q + i, i3 + i2);
            this.f6411m.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m9499b(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f6419u.size();
        for (int i = 0; i < size; i++) {
            C2540c cVar = this.f6419u.get(i);
            for (int i2 = 0; i2 < cVar.f6494h; i2++) {
                int i3 = cVar.f6501o + i2;
                View c = mo7571c(i3);
                if (!(c == null || c.getVisibility() == 8)) {
                    C2529a aVar = (C2529a) c.getLayoutParams();
                    if (m9500b(i3, i2)) {
                        m9492a(canvas, cVar.f6487a, z2 ? c.getBottom() + aVar.bottomMargin : (c.getTop() - aVar.topMargin) - this.f6414p, cVar.f6493g);
                    }
                    if (i2 == cVar.f6494h - 1 && (this.f6412n & 4) > 0) {
                        m9492a(canvas, cVar.f6487a, z2 ? (c.getTop() - aVar.topMargin) - this.f6414p : c.getBottom() + aVar.bottomMargin, cVar.f6493g);
                    }
                }
            }
            if (m9504e(i)) {
                m9498b(canvas, z ? cVar.f6489c : cVar.f6487a - this.f6415q, paddingTop, max);
            }
            if (m9505f(i) && (this.f6413o & 4) > 0) {
                m9498b(canvas, z ? cVar.f6487a - this.f6415q : cVar.f6489c, paddingTop, max);
            }
        }
    }

    /* renamed from: b */
    private boolean m9500b(int i, int i2) {
        return m9496a(i, i2) ? mo7567a() ? (this.f6413o & 1) != 0 : (this.f6412n & 1) != 0 : mo7567a() ? (this.f6413o & 2) != 0 : (this.f6412n & 2) != 0;
    }

    /* renamed from: c */
    private void m9501c(int i, int i2) {
        int i3;
        this.f6419u.clear();
        this.f6420v.mo7676a();
        this.f6418t.mo7659a(this.f6420v, i, i2);
        this.f6419u = this.f6420v.f6508a;
        this.f6418t.mo7655a(i, i2);
        if (this.f6407i == 3) {
            for (C2540c next : this.f6419u) {
                int i4 = RecyclerView.UNDEFINED_DURATION;
                for (int i5 = 0; i5 < next.f6494h; i5++) {
                    View c = mo7571c(next.f6501o + i5);
                    if (!(c == null || c.getVisibility() == 8)) {
                        C2529a aVar = (C2529a) c.getLayoutParams();
                        if (this.f6405g != 2) {
                            i3 = c.getMeasuredHeight() + Math.max(next.f6498l - c.getBaseline(), aVar.topMargin) + aVar.bottomMargin;
                        } else {
                            i3 = c.getMeasuredHeight() + aVar.topMargin + Math.max((next.f6498l - c.getMeasuredHeight()) + c.getBaseline(), aVar.bottomMargin);
                        }
                        i4 = Math.max(i4, i3);
                    }
                }
                next.f6493g = i4;
            }
        }
        this.f6418t.mo7656a(i, i2, getPaddingTop() + getPaddingBottom());
        this.f6418t.mo7653a();
        m9491a(this.f6404f, i, i2, this.f6420v.f6509b);
    }

    /* renamed from: d */
    private void m9502d(int i, int i2) {
        this.f6419u.clear();
        this.f6420v.mo7676a();
        this.f6418t.mo7669b(this.f6420v, i, i2);
        this.f6419u = this.f6420v.f6508a;
        this.f6418t.mo7655a(i, i2);
        this.f6418t.mo7656a(i, i2, getPaddingLeft() + getPaddingRight());
        this.f6418t.mo7653a();
        m9491a(this.f6404f, i, i2, this.f6420v.f6509b);
    }

    /* renamed from: d */
    private boolean m9503d(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f6419u.get(i2).mo7651c() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private boolean m9504e(int i) {
        if (i < 0 || i >= this.f6419u.size()) {
            return false;
        }
        return m9503d(i) ? mo7567a() ? (this.f6412n & 1) != 0 : (this.f6413o & 1) != 0 : mo7567a() ? (this.f6412n & 2) != 0 : (this.f6413o & 2) != 0;
    }

    /* renamed from: f */
    private boolean m9505f(int i) {
        if (i < 0 || i >= this.f6419u.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f6419u.size(); i2++) {
            if (this.f6419u.get(i2).mo7651c() > 0) {
                return false;
            }
        }
        return mo7567a() ? (this.f6412n & 4) != 0 : (this.f6413o & 4) != 0;
    }

    /* renamed from: a */
    public int mo7560a(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: a */
    public int mo7561a(View view) {
        return 0;
    }

    /* renamed from: a */
    public int mo7562a(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo7567a()) {
            if (m9500b(i, i2)) {
                i4 = 0 + this.f6415q;
            }
            if ((this.f6413o & 4) <= 0) {
                return i4;
            }
            i3 = this.f6415q;
        } else {
            if (m9500b(i, i2)) {
                i4 = 0 + this.f6414p;
            }
            if ((this.f6412n & 4) <= 0) {
                return i4;
            }
            i3 = this.f6414p;
        }
        return i4 + i3;
    }

    /* renamed from: a */
    public View mo7563a(int i) {
        return getChildAt(i);
    }

    /* renamed from: a */
    public void mo7564a(int i, View view) {
    }

    /* renamed from: a */
    public void mo7565a(View view, int i, int i2, C2540c cVar) {
        int i3;
        int i4;
        if (m9500b(i, i2)) {
            if (mo7567a()) {
                i4 = cVar.f6491e;
                i3 = this.f6415q;
            } else {
                i4 = cVar.f6491e;
                i3 = this.f6414p;
            }
            cVar.f6491e = i4 + i3;
            cVar.f6492f += i3;
        }
    }

    /* renamed from: a */
    public void mo7566a(C2540c cVar) {
        int i;
        int i2;
        if (mo7567a()) {
            if ((this.f6413o & 4) > 0) {
                i2 = cVar.f6491e;
                i = this.f6415q;
            } else {
                return;
            }
        } else if ((this.f6412n & 4) > 0) {
            i2 = cVar.f6491e;
            i = this.f6414p;
        } else {
            return;
        }
        cVar.f6491e = i2 + i;
        cVar.f6492f += i;
    }

    /* renamed from: a */
    public boolean mo7567a() {
        int i = this.f6404f;
        return i == 0 || i == 1;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f6417s == null) {
            this.f6417s = new SparseIntArray(getChildCount());
        }
        this.f6416r = this.f6418t.mo7664a(view, i, layoutParams, this.f6417s);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public int mo7569b(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: b */
    public View mo7570b(int i) {
        return mo7571c(i);
    }

    /* renamed from: c */
    public View mo7571c(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f6416r;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2529a;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2529a ? new C2529a((C2529a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2529a((ViewGroup.MarginLayoutParams) layoutParams) : new C2529a(layoutParams);
    }

    public C2529a generateLayoutParams(AttributeSet attributeSet) {
        return new C2529a(getContext(), attributeSet);
    }

    public int getAlignContent() {
        return this.f6408j;
    }

    public int getAlignItems() {
        return this.f6407i;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f6410l;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f6411m;
    }

    public int getFlexDirection() {
        return this.f6404f;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C2540c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f6419u.size());
        for (C2540c next : this.f6419u) {
            if (next.mo7651c() != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<C2540c> getFlexLinesInternal() {
        return this.f6419u;
    }

    public int getFlexWrap() {
        return this.f6405g;
    }

    public int getJustifyContent() {
        return this.f6406h;
    }

    public int getLargestMainSize() {
        int i = RecyclerView.UNDEFINED_DURATION;
        for (C2540c cVar : this.f6419u) {
            i = Math.max(i, cVar.f6491e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f6409k;
    }

    public int getShowDividerHorizontal() {
        return this.f6412n;
    }

    public int getShowDividerVertical() {
        return this.f6413o;
    }

    public int getSumOfCrossSize() {
        int size = this.f6419u.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2540c cVar = this.f6419u.get(i2);
            if (m9504e(i2)) {
                i += mo7567a() ? this.f6414p : this.f6415q;
            }
            if (m9505f(i2)) {
                i += mo7567a() ? this.f6414p : this.f6415q;
            }
            i += cVar.f6493g;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        if (r6.f6405g == 2) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        if (r6.f6405g == 2) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f6411m
            if (r0 != 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r6.f6410l
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r6.f6412n
            if (r0 != 0) goto L_0x0012
            int r0 = r6.f6413o
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            int r0 = p006b.p026g.p035k.C0890v.m4791o(r6)
            int r1 = r6.f6404f
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r4) goto L_0x0040
            if (r1 == r2) goto L_0x0032
            r5 = 3
            if (r1 == r5) goto L_0x0025
            goto L_0x0057
        L_0x0025:
            if (r0 != r4) goto L_0x0028
            r3 = 1
        L_0x0028:
            int r0 = r6.f6405g
            if (r0 != r2) goto L_0x002e
            r3 = r3 ^ 1
        L_0x002e:
            r6.m9499b((android.graphics.Canvas) r7, (boolean) r3, (boolean) r4)
            goto L_0x0057
        L_0x0032:
            if (r0 != r4) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            int r0 = r6.f6405g
            if (r0 != r2) goto L_0x003c
            r4 = r4 ^ 1
        L_0x003c:
            r6.m9499b((android.graphics.Canvas) r7, (boolean) r4, (boolean) r3)
            goto L_0x0057
        L_0x0040:
            if (r0 == r4) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            int r1 = r6.f6405g
            if (r1 != r2) goto L_0x0054
            goto L_0x0053
        L_0x004a:
            if (r0 != r4) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            int r1 = r6.f6405g
            if (r1 != r2) goto L_0x0054
        L_0x0053:
            r3 = 1
        L_0x0054:
            r6.m9493a((android.graphics.Canvas) r7, (boolean) r0, (boolean) r3)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r0 != 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r0 == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            int r0 = p006b.p026g.p035k.C0890v.m4791o(r7)
            int r1 = r7.f6404f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0052
            if (r1 == r3) goto L_0x004f
            r4 = 2
            if (r1 == r4) goto L_0x0039
            r5 = 3
            if (r1 != r5) goto L_0x0020
            if (r0 != r3) goto L_0x0015
            r2 = 1
        L_0x0015:
            int r0 = r7.f6405g
            if (r0 != r4) goto L_0x001d
            r0 = r2 ^ 1
            r1 = r0
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = 1
            goto L_0x0046
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid flex direction is set: "
            r1.append(r2)
            int r2 = r7.f6404f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0039:
            if (r0 != r3) goto L_0x003c
            r2 = 1
        L_0x003c:
            int r0 = r7.f6405g
            if (r0 != r4) goto L_0x0044
            r0 = r2 ^ 1
            r1 = r0
            goto L_0x0045
        L_0x0044:
            r1 = r2
        L_0x0045:
            r2 = 0
        L_0x0046:
            r0 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.m9495a(r1, r2, r3, r4, r5, r6)
            goto L_0x005f
        L_0x004f:
            if (r0 == r3) goto L_0x0056
            goto L_0x0054
        L_0x0052:
            if (r0 != r3) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.m9494a(r1, r2, r3, r4, r5)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f6417s == null) {
            this.f6417s = new SparseIntArray(getChildCount());
        }
        if (this.f6418t.mo7671b(this.f6417s)) {
            this.f6416r = this.f6418t.mo7663a(this.f6417s);
        }
        int i3 = this.f6404f;
        if (i3 == 0 || i3 == 1) {
            m9501c(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            m9502d(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f6404f);
        }
    }

    public void setAlignContent(int i) {
        if (this.f6408j != i) {
            this.f6408j = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f6407i != i) {
            this.f6407i = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f6410l) {
            this.f6410l = drawable;
            this.f6414p = drawable != null ? drawable.getIntrinsicHeight() : 0;
            m9497b();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f6411m) {
            this.f6411m = drawable;
            this.f6415q = drawable != null ? drawable.getIntrinsicWidth() : 0;
            m9497b();
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f6404f != i) {
            this.f6404f = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<C2540c> list) {
        this.f6419u = list;
    }

    public void setFlexWrap(int i) {
        if (this.f6405g != i) {
            this.f6405g = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f6406h != i) {
            this.f6406h = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f6409k != i) {
            this.f6409k = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f6412n) {
            this.f6412n = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f6413o) {
            this.f6413o = i;
            requestLayout();
        }
    }
}
