package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0328a;
import androidx.core.graphics.drawable.C0329b;
import com.google.android.material.internal.C2669f;
import com.google.android.material.internal.C2672g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p006b.p007a.p008k.p009a.C0664a;
import p006b.p026g.p027d.C0780a;
import p006b.p026g.p033i.C0814a;
import p054c.p083e.p084a.p085a.C1178k;
import p054c.p083e.p084a.p085a.p087l.C1186h;
import p054c.p083e.p084a.p085a.p088m.C1190a;
import p054c.p083e.p084a.p085a.p094r.C1208a;
import p054c.p083e.p084a.p085a.p099w.C1218c;
import p054c.p083e.p084a.p085a.p099w.C1219d;
import p054c.p083e.p084a.p085a.p100x.C1227b;
import p054c.p083e.p084a.p085a.p102z.C1233d;
import p190io.objectbox.android.BuildConfig;

/* renamed from: com.google.android.material.chip.a */
public class C2597a extends C1233d implements C0329b, Drawable.Callback, C2669f.C2671b {

    /* renamed from: I0 */
    private static final int[] f6752I0 = {16842910};

    /* renamed from: J0 */
    private static final ShapeDrawable f6753J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    private ColorStateList f6754A;

    /* renamed from: A0 */
    private int[] f6755A0;

    /* renamed from: B */
    private ColorStateList f6756B;

    /* renamed from: B0 */
    private boolean f6757B0;

    /* renamed from: C */
    private float f6758C;

    /* renamed from: C0 */
    private ColorStateList f6759C0;

    /* renamed from: D */
    private float f6760D;

    /* renamed from: D0 */
    private WeakReference<C2598a> f6761D0 = new WeakReference<>((Object) null);

    /* renamed from: E */
    private ColorStateList f6762E;

    /* renamed from: E0 */
    private TextUtils.TruncateAt f6763E0;

    /* renamed from: F */
    private float f6764F;

    /* renamed from: F0 */
    private boolean f6765F0;

    /* renamed from: G */
    private ColorStateList f6766G;

    /* renamed from: G0 */
    private int f6767G0;

    /* renamed from: H */
    private CharSequence f6768H;

    /* renamed from: H0 */
    private boolean f6769H0;

    /* renamed from: I */
    private boolean f6770I;

    /* renamed from: J */
    private Drawable f6771J;

    /* renamed from: K */
    private ColorStateList f6772K;

    /* renamed from: L */
    private float f6773L;

    /* renamed from: M */
    private boolean f6774M;

    /* renamed from: N */
    private Drawable f6775N;

    /* renamed from: O */
    private Drawable f6776O;

    /* renamed from: P */
    private ColorStateList f6777P;

    /* renamed from: Q */
    private float f6778Q;

    /* renamed from: R */
    private CharSequence f6779R;

    /* renamed from: S */
    private boolean f6780S;

    /* renamed from: T */
    private boolean f6781T;

    /* renamed from: U */
    private Drawable f6782U;

    /* renamed from: V */
    private C1186h f6783V;

    /* renamed from: W */
    private C1186h f6784W;

    /* renamed from: X */
    private float f6785X;

    /* renamed from: Y */
    private float f6786Y;

    /* renamed from: Z */
    private float f6787Z;

    /* renamed from: a0 */
    private float f6788a0;

    /* renamed from: b0 */
    private float f6789b0;

    /* renamed from: c0 */
    private float f6790c0;

    /* renamed from: d0 */
    private float f6791d0;

    /* renamed from: e0 */
    private float f6792e0;

    /* renamed from: f0 */
    private final Context f6793f0;

    /* renamed from: g0 */
    private final Paint f6794g0 = new Paint(1);

    /* renamed from: h0 */
    private final Paint f6795h0;

    /* renamed from: i0 */
    private final Paint.FontMetrics f6796i0 = new Paint.FontMetrics();

    /* renamed from: j0 */
    private final RectF f6797j0 = new RectF();

    /* renamed from: k0 */
    private final PointF f6798k0 = new PointF();

    /* renamed from: l0 */
    private final Path f6799l0 = new Path();

    /* renamed from: m0 */
    private final C2669f f6800m0;

    /* renamed from: n0 */
    private int f6801n0;

    /* renamed from: o0 */
    private int f6802o0;

    /* renamed from: p0 */
    private int f6803p0;

    /* renamed from: q0 */
    private int f6804q0;

    /* renamed from: r0 */
    private int f6805r0;

    /* renamed from: s0 */
    private int f6806s0;

    /* renamed from: t0 */
    private boolean f6807t0;

    /* renamed from: u0 */
    private int f6808u0;

    /* renamed from: v0 */
    private int f6809v0 = 255;

    /* renamed from: w0 */
    private ColorFilter f6810w0;

    /* renamed from: x0 */
    private PorterDuffColorFilter f6811x0;

    /* renamed from: y0 */
    private ColorStateList f6812y0;

    /* renamed from: z0 */
    private PorterDuff.Mode f6813z0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C2598a {
        /* renamed from: a */
        void mo7932a();
    }

    private C2597a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo5491a(context);
        this.f6793f0 = context;
        this.f6800m0 = new C2669f(this);
        this.f6768H = BuildConfig.FLAVOR;
        this.f6800m0.mo8554b().density = context.getResources().getDisplayMetrics().density;
        this.f6795h0 = null;
        Paint paint = this.f6795h0;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(f6752I0);
        mo8140a(f6752I0);
        this.f6765F0 = true;
        if (C1227b.f3993a) {
            f6753J0.setTint(-1);
        }
    }

    /* renamed from: X */
    private float m10111X() {
        this.f6800m0.mo8554b().getFontMetrics(this.f6796i0);
        Paint.FontMetrics fontMetrics = this.f6796i0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: Y */
    private boolean m10112Y() {
        return this.f6781T && this.f6782U != null && this.f6780S;
    }

    /* renamed from: Z */
    private ColorFilter m10113Z() {
        ColorFilter colorFilter = this.f6810w0;
        return colorFilter != null ? colorFilter : this.f6811x0;
    }

    /* renamed from: a */
    public static C2597a m10114a(Context context, AttributeSet attributeSet, int i, int i2) {
        C2597a aVar = new C2597a(context, attributeSet, i, i2);
        aVar.m10117a(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: a */
    private void m10115a(Canvas canvas, Rect rect) {
        if (m10120a0()) {
            m10116a(rect, this.f6797j0);
            RectF rectF = this.f6797j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f6782U.setBounds(0, 0, (int) this.f6797j0.width(), (int) this.f6797j0.height());
            this.f6782U.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: a */
    private void m10116a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10124b0() || m10120a0()) {
            float f = this.f6785X + this.f6786Y;
            if (C0328a.m1622e(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f6773L;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f6773L;
            }
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f6773L;
            rectF.top = exactCenterY - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* renamed from: a */
    private void m10117a(AttributeSet attributeSet, int i, int i2) {
        TextUtils.TruncateAt truncateAt;
        TypedArray c = C2672g.m10589c(this.f6793f0, attributeSet, C1178k.Chip, i, i2, new int[0]);
        this.f6769H0 = c.hasValue(C1178k.Chip_shapeAppearance);
        m10141i(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_chipSurfaceColor));
        mo8146c(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_chipBackgroundColor));
        mo8167h(c.getDimension(C1178k.Chip_chipMinHeight, 0.0f));
        if (c.hasValue(C1178k.Chip_chipCornerRadius)) {
            mo8152e(c.getDimension(C1178k.Chip_chipCornerRadius, 0.0f));
        }
        mo8154e(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_chipStrokeColor));
        mo8172j(c.getDimension(C1178k.Chip_chipStrokeWidth, 0.0f));
        mo8162g(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_rippleColor));
        mo8143b(c.getText(C1178k.Chip_android_text));
        mo8136a(C1218c.m5864c(this.f6793f0, c, C1178k.Chip_android_textAppearance));
        int i3 = c.getInt(C1178k.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i3 != 2) {
            if (i3 == 3) {
                truncateAt = TextUtils.TruncateAt.END;
            }
            mo8148c(c.getBoolean(C1178k.Chip_chipIconVisible, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
                mo8148c(c.getBoolean(C1178k.Chip_chipIconEnabled, false));
            }
            mo8141b(C1218c.m5863b(this.f6793f0, c, C1178k.Chip_chipIcon));
            mo8150d(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_chipIconTint));
            mo8160g(c.getDimension(C1178k.Chip_chipIconSize, 0.0f));
            mo8151d(c.getBoolean(C1178k.Chip_closeIconVisible, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
                mo8151d(c.getBoolean(C1178k.Chip_closeIconEnabled, false));
            }
            mo8147c(C1218c.m5863b(this.f6793f0, c, C1178k.Chip_closeIcon));
            mo8158f(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_closeIconTint));
            mo8176l(c.getDimension(C1178k.Chip_closeIconSize, 0.0f));
            mo8139a(c.getBoolean(C1178k.Chip_android_checkable, false));
            mo8144b(c.getBoolean(C1178k.Chip_checkedIconVisible, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
                mo8144b(c.getBoolean(C1178k.Chip_checkedIconEnabled, false));
            }
            mo8133a(C1218c.m5863b(this.f6793f0, c, C1178k.Chip_checkedIcon));
            mo8142b(C1186h.m5747a(this.f6793f0, c, C1178k.Chip_showMotionSpec));
            mo8135a(C1186h.m5747a(this.f6793f0, c, C1178k.Chip_hideMotionSpec));
            mo8169i(c.getDimension(C1178k.Chip_chipStartPadding, 0.0f));
            mo8184o(c.getDimension(C1178k.Chip_iconStartPadding, 0.0f));
            mo8181n(c.getDimension(C1178k.Chip_iconEndPadding, 0.0f));
            mo8192q(c.getDimension(C1178k.Chip_textStartPadding, 0.0f));
            mo8189p(c.getDimension(C1178k.Chip_textEndPadding, 0.0f));
            mo8178m(c.getDimension(C1178k.Chip_closeIconStartPadding, 0.0f));
            mo8174k(c.getDimension(C1178k.Chip_closeIconEndPadding, 0.0f));
            mo8156f(c.getDimension(C1178k.Chip_chipEndPadding, 0.0f));
            mo8212y(c.getDimensionPixelSize(C1178k.Chip_android_maxWidth, Integer.MAX_VALUE));
            c.recycle();
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        mo8134a(truncateAt);
        mo8148c(c.getBoolean(C1178k.Chip_chipIconVisible, false));
        mo8148c(c.getBoolean(C1178k.Chip_chipIconEnabled, false));
        mo8141b(C1218c.m5863b(this.f6793f0, c, C1178k.Chip_chipIcon));
        mo8150d(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_chipIconTint));
        mo8160g(c.getDimension(C1178k.Chip_chipIconSize, 0.0f));
        mo8151d(c.getBoolean(C1178k.Chip_closeIconVisible, false));
        mo8151d(c.getBoolean(C1178k.Chip_closeIconEnabled, false));
        mo8147c(C1218c.m5863b(this.f6793f0, c, C1178k.Chip_closeIcon));
        mo8158f(C1218c.m5861a(this.f6793f0, c, C1178k.Chip_closeIconTint));
        mo8176l(c.getDimension(C1178k.Chip_closeIconSize, 0.0f));
        mo8139a(c.getBoolean(C1178k.Chip_android_checkable, false));
        mo8144b(c.getBoolean(C1178k.Chip_checkedIconVisible, false));
        mo8144b(c.getBoolean(C1178k.Chip_checkedIconEnabled, false));
        mo8133a(C1218c.m5863b(this.f6793f0, c, C1178k.Chip_checkedIcon));
        mo8142b(C1186h.m5747a(this.f6793f0, c, C1178k.Chip_showMotionSpec));
        mo8135a(C1186h.m5747a(this.f6793f0, c, C1178k.Chip_hideMotionSpec));
        mo8169i(c.getDimension(C1178k.Chip_chipStartPadding, 0.0f));
        mo8184o(c.getDimension(C1178k.Chip_iconStartPadding, 0.0f));
        mo8181n(c.getDimension(C1178k.Chip_iconEndPadding, 0.0f));
        mo8192q(c.getDimension(C1178k.Chip_textStartPadding, 0.0f));
        mo8189p(c.getDimension(C1178k.Chip_textEndPadding, 0.0f));
        mo8178m(c.getDimension(C1178k.Chip_closeIconStartPadding, 0.0f));
        mo8174k(c.getDimension(C1178k.Chip_closeIconEndPadding, 0.0f));
        mo8156f(c.getDimension(C1178k.Chip_chipEndPadding, 0.0f));
        mo8212y(c.getDimensionPixelSize(C1178k.Chip_android_maxWidth, Integer.MAX_VALUE));
        c.recycle();
    }

    /* renamed from: a */
    private static boolean m10118a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m10119a(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f6754A
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f6801n0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f6801n0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f6801n0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f6756B
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f6802o0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f6802o0
            if (r5 == r3) goto L_0x002c
            r6.f6802o0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p054c.p083e.p084a.p085a.p093q.C1207a.m5824a((int) r1, (int) r3)
            int r3 = r6.f6803p0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo5502d()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004f
            r6.f6803p0 = r1
            int r0 = r6.f6803p0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r6.mo5492a((android.content.res.ColorStateList) r0)
            r0 = 1
        L_0x004f:
            android.content.res.ColorStateList r1 = r6.f6762E
            if (r1 == 0) goto L_0x005a
            int r3 = r6.f6804q0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            int r3 = r6.f6804q0
            if (r3 == r1) goto L_0x0062
            r6.f6804q0 = r1
            r0 = 1
        L_0x0062:
            android.content.res.ColorStateList r1 = r6.f6759C0
            if (r1 == 0) goto L_0x0075
            boolean r1 = p054c.p083e.p084a.p085a.p100x.C1227b.m5884a((int[]) r7)
            if (r1 == 0) goto L_0x0075
            android.content.res.ColorStateList r1 = r6.f6759C0
            int r3 = r6.f6805r0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            int r3 = r6.f6805r0
            if (r3 == r1) goto L_0x0081
            r6.f6805r0 = r1
            boolean r1 = r6.f6757B0
            if (r1 == 0) goto L_0x0081
            r0 = 1
        L_0x0081:
            com.google.android.material.internal.f r1 = r6.f6800m0
            c.e.a.a.w.d r1 = r1.mo8549a()
            if (r1 == 0) goto L_0x00a2
            com.google.android.material.internal.f r1 = r6.f6800m0
            c.e.a.a.w.d r1 = r1.mo8549a()
            android.content.res.ColorStateList r1 = r1.f3973b
            if (r1 == 0) goto L_0x00a2
            com.google.android.material.internal.f r1 = r6.f6800m0
            c.e.a.a.w.d r1 = r1.mo8549a()
            android.content.res.ColorStateList r1 = r1.f3973b
            int r3 = r6.f6806s0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            int r3 = r6.f6806s0
            if (r3 == r1) goto L_0x00aa
            r6.f6806s0 = r1
            r0 = 1
        L_0x00aa:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m10118a((int[]) r1, (int) r3)
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r6.f6780S
            if (r1 == 0) goto L_0x00bd
            r1 = 1
            goto L_0x00be
        L_0x00bd:
            r1 = 0
        L_0x00be:
            boolean r3 = r6.f6807t0
            if (r3 == r1) goto L_0x00d8
            android.graphics.drawable.Drawable r3 = r6.f6782U
            if (r3 == 0) goto L_0x00d8
            float r0 = r6.mo8180n()
            r6.f6807t0 = r1
            float r1 = r6.mo8180n()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            r0 = 1
            r1 = 1
            goto L_0x00d9
        L_0x00d7:
            r0 = 1
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            android.content.res.ColorStateList r3 = r6.f6812y0
            if (r3 == 0) goto L_0x00e4
            int r5 = r6.f6808u0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            int r5 = r6.f6808u0
            if (r5 == r3) goto L_0x00f6
            r6.f6808u0 = r3
            android.content.res.ColorStateList r0 = r6.f6812y0
            android.graphics.PorterDuff$Mode r3 = r6.f6813z0
            android.graphics.PorterDuffColorFilter r0 = p054c.p083e.p084a.p085a.p094r.C1208a.m5831a(r6, r0, r3)
            r6.f6811x0 = r0
            r0 = 1
        L_0x00f6:
            android.graphics.drawable.Drawable r3 = r6.f6771J
            boolean r3 = m10134e((android.graphics.drawable.Drawable) r3)
            if (r3 == 0) goto L_0x0105
            android.graphics.drawable.Drawable r3 = r6.f6771J
            boolean r3 = r3.setState(r7)
            r0 = r0 | r3
        L_0x0105:
            android.graphics.drawable.Drawable r3 = r6.f6782U
            boolean r3 = m10134e((android.graphics.drawable.Drawable) r3)
            if (r3 == 0) goto L_0x0114
            android.graphics.drawable.Drawable r3 = r6.f6782U
            boolean r3 = r3.setState(r7)
            r0 = r0 | r3
        L_0x0114:
            android.graphics.drawable.Drawable r3 = r6.f6775N
            boolean r3 = m10134e((android.graphics.drawable.Drawable) r3)
            if (r3 == 0) goto L_0x0131
            int r3 = r7.length
            int r4 = r8.length
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r4 = r7.length
            java.lang.System.arraycopy(r7, r2, r3, r2, r4)
            int r7 = r7.length
            int r4 = r8.length
            java.lang.System.arraycopy(r8, r2, r3, r7, r4)
            android.graphics.drawable.Drawable r7 = r6.f6775N
            boolean r7 = r7.setState(r3)
            r0 = r0 | r7
        L_0x0131:
            boolean r7 = p054c.p083e.p084a.p085a.p100x.C1227b.f3993a
            if (r7 == 0) goto L_0x0144
            android.graphics.drawable.Drawable r7 = r6.f6776O
            boolean r7 = m10134e((android.graphics.drawable.Drawable) r7)
            if (r7 == 0) goto L_0x0144
            android.graphics.drawable.Drawable r7 = r6.f6776O
            boolean r7 = r7.setState(r8)
            r0 = r0 | r7
        L_0x0144:
            if (r0 == 0) goto L_0x0149
            r6.invalidateSelf()
        L_0x0149:
            if (r1 == 0) goto L_0x014e
            r6.mo8128V()
        L_0x014e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2597a.m10119a(int[], int[]):boolean");
    }

    /* renamed from: a0 */
    private boolean m10120a0() {
        return this.f6781T && this.f6782U != null && this.f6807t0;
    }

    /* renamed from: b */
    private void m10121b(Canvas canvas, Rect rect) {
        if (!this.f6769H0) {
            this.f6794g0.setColor(this.f6802o0);
            this.f6794g0.setStyle(Paint.Style.FILL);
            this.f6794g0.setColorFilter(m10113Z());
            this.f6797j0.set(rect);
            canvas.drawRoundRect(this.f6797j0, mo8194r(), mo8194r(), this.f6794g0);
        }
    }

    /* renamed from: b */
    private void m10122b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m10127c0()) {
            float f = this.f6792e0 + this.f6791d0 + this.f6778Q + this.f6790c0 + this.f6789b0;
            if (C0328a.m1622e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f3973b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m10123b(p054c.p083e.p084a.p085a.p099w.C1219d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f3973b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C2597a.m10123b(c.e.a.a.w.d):boolean");
    }

    /* renamed from: b0 */
    private boolean m10124b0() {
        return this.f6770I && this.f6771J != null;
    }

    /* renamed from: c */
    private void m10125c(Canvas canvas, Rect rect) {
        if (m10124b0()) {
            m10116a(rect, this.f6797j0);
            RectF rectF = this.f6797j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f6771J.setBounds(0, 0, (int) this.f6797j0.width(), (int) this.f6797j0.height());
            this.f6771J.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: c */
    private void m10126c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10127c0()) {
            float f = this.f6792e0 + this.f6791d0;
            if (C0328a.m1622e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f6778Q;
            } else {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f6778Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f6778Q;
            rectF.top = exactCenterY - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* renamed from: c0 */
    private boolean m10127c0() {
        return this.f6774M && this.f6775N != null;
    }

    /* renamed from: d */
    private void m10128d(Canvas canvas, Rect rect) {
        if (this.f6764F > 0.0f && !this.f6769H0) {
            this.f6794g0.setColor(this.f6804q0);
            this.f6794g0.setStyle(Paint.Style.STROKE);
            if (!this.f6769H0) {
                this.f6794g0.setColorFilter(m10113Z());
            }
            RectF rectF = this.f6797j0;
            float f = this.f6764F;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f6760D - (this.f6764F / 2.0f);
            canvas.drawRoundRect(this.f6797j0, f2, f2, this.f6794g0);
        }
    }

    /* renamed from: d */
    private void m10129d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m10127c0()) {
            float f = this.f6792e0 + this.f6791d0 + this.f6778Q + this.f6790c0 + this.f6789b0;
            if (C0328a.m1622e(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: d */
    private void m10130d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0328a.m1617a(drawable, C0328a.m1622e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f6775N) {
                if (drawable.isStateful()) {
                    drawable.setState(mo8112F());
                }
                C0328a.m1611a(drawable, this.f6777P);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f6771J;
            if (drawable == drawable2) {
                C0328a.m1611a(drawable2, this.f6772K);
            }
        }
    }

    /* renamed from: d0 */
    private void m10131d0() {
        this.f6759C0 = this.f6757B0 ? C1227b.m5883a(this.f6766G) : null;
    }

    /* renamed from: e */
    private void m10132e(Canvas canvas, Rect rect) {
        if (!this.f6769H0) {
            this.f6794g0.setColor(this.f6801n0);
            this.f6794g0.setStyle(Paint.Style.FILL);
            this.f6797j0.set(rect);
            canvas.drawRoundRect(this.f6797j0, mo8194r(), mo8194r(), this.f6794g0);
        }
    }

    /* renamed from: e */
    private void m10133e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f6768H != null) {
            float n = this.f6785X + mo8180n() + this.f6788a0;
            float o = this.f6792e0 + mo8183o() + this.f6789b0;
            if (C0328a.m1622e(this) == 0) {
                rectF.left = ((float) rect.left) + n;
                rectF.right = ((float) rect.right) - o;
            } else {
                rectF.left = ((float) rect.left) + o;
                rectF.right = ((float) rect.right) - n;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: e */
    private static boolean m10134e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @TargetApi(21)
    /* renamed from: e0 */
    private void m10135e0() {
        this.f6776O = new RippleDrawable(C1227b.m5883a(mo8118L()), this.f6775N, f6753J0);
    }

    /* renamed from: f */
    private void m10136f(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m10127c0()) {
            m10126c(rect, this.f6797j0);
            RectF rectF = this.f6797j0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f6775N.setBounds(0, 0, (int) this.f6797j0.width(), (int) this.f6797j0.height());
            if (C1227b.f3993a) {
                this.f6776O.setBounds(this.f6775N.getBounds());
                this.f6776O.jumpToCurrentState();
                drawable = this.f6776O;
            } else {
                drawable = this.f6775N;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: f */
    private void m10137f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: g */
    private void m10138g(Canvas canvas, Rect rect) {
        this.f6794g0.setColor(this.f6805r0);
        this.f6794g0.setStyle(Paint.Style.FILL);
        this.f6797j0.set(rect);
        if (!this.f6769H0) {
            canvas.drawRoundRect(this.f6797j0, mo8194r(), mo8194r(), this.f6794g0);
            return;
        }
        mo5495a(rect, this.f6799l0);
        super.mo5493a(canvas, this.f6794g0, this.f6799l0, mo5496b());
    }

    /* renamed from: h */
    private void m10139h(Canvas canvas, Rect rect) {
        Paint paint = this.f6795h0;
        if (paint != null) {
            paint.setColor(C0780a.m4354c(-16777216, 127));
            canvas.drawRect(rect, this.f6795h0);
            if (m10124b0() || m10120a0()) {
                m10116a(rect, this.f6797j0);
                canvas.drawRect(this.f6797j0, this.f6795h0);
            }
            if (this.f6768H != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f6795h0);
            }
            if (m10127c0()) {
                m10126c(rect, this.f6797j0);
                canvas.drawRect(this.f6797j0, this.f6795h0);
            }
            this.f6795h0.setColor(C0780a.m4354c(-65536, 127));
            m10122b(rect, this.f6797j0);
            canvas.drawRect(this.f6797j0, this.f6795h0);
            this.f6795h0.setColor(C0780a.m4354c(-16711936, 127));
            m10129d(rect, this.f6797j0);
            canvas.drawRect(this.f6797j0, this.f6795h0);
        }
    }

    /* renamed from: h */
    private static boolean m10140h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: i */
    private void m10141i(ColorStateList colorStateList) {
        if (this.f6754A != colorStateList) {
            this.f6754A = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: i */
    private void m10142i(Canvas canvas, Rect rect) {
        if (this.f6768H != null) {
            Paint.Align a = mo8130a(rect, this.f6798k0);
            m10133e(rect, this.f6797j0);
            if (this.f6800m0.mo8549a() != null) {
                this.f6800m0.mo8554b().drawableState = getState();
                this.f6800m0.mo8550a(this.f6793f0);
            }
            this.f6800m0.mo8554b().setTextAlign(a);
            int i = 0;
            boolean z = Math.round(this.f6800m0.mo8548a(mo8120N().toString())) > Math.round(this.f6797j0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f6797j0);
            }
            CharSequence charSequence = this.f6768H;
            if (z && this.f6763E0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f6800m0.mo8554b(), this.f6797j0.width(), this.f6763E0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f6798k0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f6800m0.mo8554b());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: A */
    public Drawable mo8103A() {
        Drawable drawable = this.f6775N;
        if (drawable != null) {
            return C0328a.m1625h(drawable);
        }
        return null;
    }

    /* renamed from: A */
    public void mo8104A(int i) {
        mo8142b(C1186h.m5746a(this.f6793f0, i));
    }

    /* renamed from: B */
    public CharSequence mo8105B() {
        return this.f6779R;
    }

    /* renamed from: B */
    public void mo8106B(int i) {
        mo8136a(new C1219d(this.f6793f0, i));
    }

    /* renamed from: C */
    public float mo8107C() {
        return this.f6791d0;
    }

    /* renamed from: C */
    public void mo8108C(int i) {
        mo8189p(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: D */
    public float mo8109D() {
        return this.f6778Q;
    }

    /* renamed from: D */
    public void mo8110D(int i) {
        mo8192q(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: E */
    public float mo8111E() {
        return this.f6790c0;
    }

    /* renamed from: F */
    public int[] mo8112F() {
        return this.f6755A0;
    }

    /* renamed from: G */
    public ColorStateList mo8113G() {
        return this.f6777P;
    }

    /* renamed from: H */
    public TextUtils.TruncateAt mo8114H() {
        return this.f6763E0;
    }

    /* renamed from: I */
    public C1186h mo8115I() {
        return this.f6784W;
    }

    /* renamed from: J */
    public float mo8116J() {
        return this.f6787Z;
    }

    /* renamed from: K */
    public float mo8117K() {
        return this.f6786Y;
    }

    /* renamed from: L */
    public ColorStateList mo8118L() {
        return this.f6766G;
    }

    /* renamed from: M */
    public C1186h mo8119M() {
        return this.f6783V;
    }

    /* renamed from: N */
    public CharSequence mo8120N() {
        return this.f6768H;
    }

    /* renamed from: O */
    public C1219d mo8121O() {
        return this.f6800m0.mo8549a();
    }

    /* renamed from: P */
    public float mo8122P() {
        return this.f6789b0;
    }

    /* renamed from: Q */
    public float mo8123Q() {
        return this.f6788a0;
    }

    /* renamed from: R */
    public boolean mo8124R() {
        return this.f6757B0;
    }

    /* renamed from: S */
    public boolean mo8125S() {
        return this.f6780S;
    }

    /* renamed from: T */
    public boolean mo8126T() {
        return m10134e(this.f6775N);
    }

    /* renamed from: U */
    public boolean mo8127U() {
        return this.f6774M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo8128V() {
        C2598a aVar = (C2598a) this.f6761D0.get();
        if (aVar != null) {
            aVar.mo7932a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo8129W() {
        return this.f6765F0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Paint.Align mo8130a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f6768H != null) {
            float n = this.f6785X + mo8180n() + this.f6788a0;
            if (C0328a.m1622e(this) == 0) {
                pointF.x = ((float) rect.left) + n;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - n;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m10111X();
        }
        return align;
    }

    /* renamed from: a */
    public void mo8131a() {
        mo8128V();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8132a(RectF rectF) {
        m10129d(getBounds(), rectF);
    }

    /* renamed from: a */
    public void mo8133a(Drawable drawable) {
        if (this.f6782U != drawable) {
            float n = mo8180n();
            this.f6782U = drawable;
            float n2 = mo8180n();
            m10137f(this.f6782U);
            m10130d(this.f6782U);
            invalidateSelf();
            if (n != n2) {
                mo8128V();
            }
        }
    }

    /* renamed from: a */
    public void mo8134a(TextUtils.TruncateAt truncateAt) {
        this.f6763E0 = truncateAt;
    }

    /* renamed from: a */
    public void mo8135a(C1186h hVar) {
        this.f6784W = hVar;
    }

    /* renamed from: a */
    public void mo8136a(C1219d dVar) {
        this.f6800m0.mo8551a(dVar, this.f6793f0);
    }

    /* renamed from: a */
    public void mo8137a(C2598a aVar) {
        this.f6761D0 = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public void mo8138a(CharSequence charSequence) {
        if (this.f6779R != charSequence) {
            this.f6779R = C0814a.m4478b().mo4502a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo8139a(boolean z) {
        if (this.f6780S != z) {
            this.f6780S = z;
            float n = mo8180n();
            if (!z && this.f6807t0) {
                this.f6807t0 = false;
            }
            float n2 = mo8180n();
            invalidateSelf();
            if (n != n2) {
                mo8128V();
            }
        }
    }

    /* renamed from: a */
    public boolean mo8140a(int[] iArr) {
        if (Arrays.equals(this.f6755A0, iArr)) {
            return false;
        }
        this.f6755A0 = iArr;
        if (m10127c0()) {
            return m10119a(getState(), iArr);
        }
        return false;
    }

    /* renamed from: b */
    public void mo8141b(Drawable drawable) {
        Drawable t = mo8200t();
        if (t != drawable) {
            float n = mo8180n();
            this.f6771J = drawable != null ? C0328a.m1626i(drawable).mutate() : null;
            float n2 = mo8180n();
            m10137f(t);
            if (m10124b0()) {
                m10130d(this.f6771J);
            }
            invalidateSelf();
            if (n != n2) {
                mo8128V();
            }
        }
    }

    /* renamed from: b */
    public void mo8142b(C1186h hVar) {
        this.f6783V = hVar;
    }

    /* renamed from: b */
    public void mo8143b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (!TextUtils.equals(this.f6768H, charSequence)) {
            this.f6768H = charSequence;
            this.f6800m0.mo8553a(true);
            invalidateSelf();
            mo8128V();
        }
    }

    /* renamed from: b */
    public void mo8144b(boolean z) {
        if (this.f6781T != z) {
            boolean a0 = m10120a0();
            this.f6781T = z;
            boolean a02 = m10120a0();
            if (a0 != a02) {
                if (a02) {
                    m10130d(this.f6782U);
                } else {
                    m10137f(this.f6782U);
                }
                invalidateSelf();
                mo8128V();
            }
        }
    }

    /* renamed from: c */
    public void mo8145c(int i) {
        mo8139a(this.f6793f0.getResources().getBoolean(i));
    }

    /* renamed from: c */
    public void mo8146c(ColorStateList colorStateList) {
        if (this.f6756B != colorStateList) {
            this.f6756B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public void mo8147c(Drawable drawable) {
        Drawable A = mo8103A();
        if (A != drawable) {
            float o = mo8183o();
            this.f6775N = drawable != null ? C0328a.m1626i(drawable).mutate() : null;
            if (C1227b.f3993a) {
                m10135e0();
            }
            float o2 = mo8183o();
            m10137f(A);
            if (m10127c0()) {
                m10130d(this.f6775N);
            }
            invalidateSelf();
            if (o != o2) {
                mo8128V();
            }
        }
    }

    /* renamed from: c */
    public void mo8148c(boolean z) {
        if (this.f6770I != z) {
            boolean b0 = m10124b0();
            this.f6770I = z;
            boolean b02 = m10124b0();
            if (b0 != b02) {
                if (b02) {
                    m10130d(this.f6771J);
                } else {
                    m10137f(this.f6771J);
                }
                invalidateSelf();
                mo8128V();
            }
        }
    }

    /* renamed from: d */
    public void mo8149d(int i) {
        mo8133a(C0664a.m3682c(this.f6793f0, i));
    }

    /* renamed from: d */
    public void mo8150d(ColorStateList colorStateList) {
        if (this.f6772K != colorStateList) {
            this.f6772K = colorStateList;
            if (m10124b0()) {
                C0328a.m1611a(this.f6771J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo8151d(boolean z) {
        if (this.f6774M != z) {
            boolean c0 = m10127c0();
            this.f6774M = z;
            boolean c02 = m10127c0();
            if (c0 != c02) {
                if (c02) {
                    m10130d(this.f6775N);
                } else {
                    m10137f(this.f6775N);
                }
                invalidateSelf();
                mo8128V();
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f6809v0;
            if (i2 < 255) {
                i = C1190a.m5765a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m10132e(canvas, bounds);
            m10121b(canvas, bounds);
            if (this.f6769H0) {
                super.draw(canvas);
            }
            m10128d(canvas, bounds);
            m10138g(canvas, bounds);
            m10125c(canvas, bounds);
            m10115a(canvas, bounds);
            if (this.f6765F0) {
                m10142i(canvas, bounds);
            }
            m10136f(canvas, bounds);
            m10139h(canvas, bounds);
            if (this.f6809v0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    @Deprecated
    /* renamed from: e */
    public void mo8152e(float f) {
        if (this.f6760D != f) {
            this.f6760D = f;
            setShapeAppearanceModel(mo5514i().mo5533b(f));
        }
    }

    /* renamed from: e */
    public void mo8153e(int i) {
        mo8144b(this.f6793f0.getResources().getBoolean(i));
    }

    /* renamed from: e */
    public void mo8154e(ColorStateList colorStateList) {
        if (this.f6762E != colorStateList) {
            this.f6762E = colorStateList;
            if (this.f6769H0) {
                mo5499b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8155e(boolean z) {
        this.f6765F0 = z;
    }

    /* renamed from: f */
    public void mo8156f(float f) {
        if (this.f6792e0 != f) {
            this.f6792e0 = f;
            invalidateSelf();
            mo8128V();
        }
    }

    /* renamed from: f */
    public void mo8157f(int i) {
        mo8146c(C0664a.m3681b(this.f6793f0, i));
    }

    /* renamed from: f */
    public void mo8158f(ColorStateList colorStateList) {
        if (this.f6777P != colorStateList) {
            this.f6777P = colorStateList;
            if (m10127c0()) {
                C0328a.m1611a(this.f6775N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: f */
    public void mo8159f(boolean z) {
        if (this.f6757B0 != z) {
            this.f6757B0 = z;
            m10131d0();
            onStateChange(getState());
        }
    }

    /* renamed from: g */
    public void mo8160g(float f) {
        if (this.f6773L != f) {
            float n = mo8180n();
            this.f6773L = f;
            float n2 = mo8180n();
            invalidateSelf();
            if (n != n2) {
                mo8128V();
            }
        }
    }

    @Deprecated
    /* renamed from: g */
    public void mo8161g(int i) {
        mo8152e(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: g */
    public void mo8162g(ColorStateList colorStateList) {
        if (this.f6766G != colorStateList) {
            this.f6766G = colorStateList;
            m10131d0();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f6809v0;
    }

    public ColorFilter getColorFilter() {
        return this.f6810w0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f6758C;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f6785X + mo8180n() + this.f6788a0 + this.f6800m0.mo8548a(mo8120N().toString()) + this.f6789b0 + mo8183o() + this.f6792e0), this.f6767G0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f6769H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f6760D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f6760D);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h */
    public void mo8167h(float f) {
        if (this.f6758C != f) {
            this.f6758C = f;
            invalidateSelf();
            mo8128V();
        }
    }

    /* renamed from: h */
    public void mo8168h(int i) {
        mo8156f(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: i */
    public void mo8169i(float f) {
        if (this.f6785X != f) {
            this.f6785X = f;
            invalidateSelf();
            mo8128V();
        }
    }

    /* renamed from: i */
    public void mo8170i(int i) {
        mo8141b(C0664a.m3682c(this.f6793f0, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m10140h(this.f6754A) || m10140h(this.f6756B) || m10140h(this.f6762E) || (this.f6757B0 && m10140h(this.f6759C0)) || m10123b(this.f6800m0.mo8549a()) || m10112Y() || m10134e(this.f6771J) || m10134e(this.f6782U) || m10140h(this.f6812y0);
    }

    /* renamed from: j */
    public void mo8172j(float f) {
        if (this.f6764F != f) {
            this.f6764F = f;
            this.f6794g0.setStrokeWidth(f);
            if (this.f6769H0) {
                super.mo5503d(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: j */
    public void mo8173j(int i) {
        mo8160g(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: k */
    public void mo8174k(float f) {
        if (this.f6791d0 != f) {
            this.f6791d0 = f;
            invalidateSelf();
            if (m10127c0()) {
                mo8128V();
            }
        }
    }

    /* renamed from: k */
    public void mo8175k(int i) {
        mo8150d(C0664a.m3681b(this.f6793f0, i));
    }

    /* renamed from: l */
    public void mo8176l(float f) {
        if (this.f6778Q != f) {
            this.f6778Q = f;
            invalidateSelf();
            if (m10127c0()) {
                mo8128V();
            }
        }
    }

    /* renamed from: l */
    public void mo8177l(int i) {
        mo8148c(this.f6793f0.getResources().getBoolean(i));
    }

    /* renamed from: m */
    public void mo8178m(float f) {
        if (this.f6790c0 != f) {
            this.f6790c0 = f;
            invalidateSelf();
            if (m10127c0()) {
                mo8128V();
            }
        }
    }

    /* renamed from: m */
    public void mo8179m(int i) {
        mo8167h(this.f6793f0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo8180n() {
        if (m10124b0() || m10120a0()) {
            return this.f6786Y + this.f6773L + this.f6787Z;
        }
        return 0.0f;
    }

    /* renamed from: n */
    public void mo8181n(float f) {
        if (this.f6787Z != f) {
            float n = mo8180n();
            this.f6787Z = f;
            float n2 = mo8180n();
            invalidateSelf();
            if (n != n2) {
                mo8128V();
            }
        }
    }

    /* renamed from: n */
    public void mo8182n(int i) {
        mo8169i(this.f6793f0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public float mo8183o() {
        if (m10127c0()) {
            return this.f6790c0 + this.f6778Q + this.f6791d0;
        }
        return 0.0f;
    }

    /* renamed from: o */
    public void mo8184o(float f) {
        if (this.f6786Y != f) {
            float n = mo8180n();
            this.f6786Y = f;
            float n2 = mo8180n();
            invalidateSelf();
            if (n != n2) {
                mo8128V();
            }
        }
    }

    /* renamed from: o */
    public void mo8185o(int i) {
        mo8154e(C0664a.m3681b(this.f6793f0, i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m10124b0()) {
            onLayoutDirectionChanged |= C0328a.m1617a(this.f6771J, i);
        }
        if (m10120a0()) {
            onLayoutDirectionChanged |= C0328a.m1617a(this.f6782U, i);
        }
        if (m10127c0()) {
            onLayoutDirectionChanged |= C0328a.m1617a(this.f6775N, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m10124b0()) {
            onLevelChange |= this.f6771J.setLevel(i);
        }
        if (m10120a0()) {
            onLevelChange |= this.f6782U.setLevel(i);
        }
        if (m10127c0()) {
            onLevelChange |= this.f6775N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f6769H0) {
            super.onStateChange(iArr);
        }
        return m10119a(iArr, mo8112F());
    }

    /* renamed from: p */
    public Drawable mo8188p() {
        return this.f6782U;
    }

    /* renamed from: p */
    public void mo8189p(float f) {
        if (this.f6789b0 != f) {
            this.f6789b0 = f;
            invalidateSelf();
            mo8128V();
        }
    }

    /* renamed from: p */
    public void mo8190p(int i) {
        mo8172j(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: q */
    public ColorStateList mo8191q() {
        return this.f6756B;
    }

    /* renamed from: q */
    public void mo8192q(float f) {
        if (this.f6788a0 != f) {
            this.f6788a0 = f;
            invalidateSelf();
            mo8128V();
        }
    }

    /* renamed from: q */
    public void mo8193q(int i) {
        mo8174k(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: r */
    public float mo8194r() {
        return this.f6769H0 ? mo5514i().mo5538g().mo5482a() : this.f6760D;
    }

    /* renamed from: r */
    public void mo8195r(int i) {
        mo8147c(C0664a.m3682c(this.f6793f0, i));
    }

    /* renamed from: s */
    public float mo8196s() {
        return this.f6792e0;
    }

    /* renamed from: s */
    public void mo8197s(int i) {
        mo8176l(this.f6793f0.getResources().getDimension(i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f6809v0 != i) {
            this.f6809v0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f6810w0 != colorFilter) {
            this.f6810w0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f6812y0 != colorStateList) {
            this.f6812y0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f6813z0 != mode) {
            this.f6813z0 = mode;
            this.f6811x0 = C1208a.m5831a(this, this.f6812y0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m10124b0()) {
            visible |= this.f6771J.setVisible(z, z2);
        }
        if (m10120a0()) {
            visible |= this.f6782U.setVisible(z, z2);
        }
        if (m10127c0()) {
            visible |= this.f6775N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public Drawable mo8200t() {
        Drawable drawable = this.f6771J;
        if (drawable != null) {
            return C0328a.m1625h(drawable);
        }
        return null;
    }

    /* renamed from: t */
    public void mo8201t(int i) {
        mo8178m(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: u */
    public float mo8202u() {
        return this.f6773L;
    }

    /* renamed from: u */
    public void mo8203u(int i) {
        mo8158f(C0664a.m3681b(this.f6793f0, i));
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public ColorStateList mo8205v() {
        return this.f6772K;
    }

    /* renamed from: v */
    public void mo8206v(int i) {
        mo8135a(C1186h.m5746a(this.f6793f0, i));
    }

    /* renamed from: w */
    public float mo8207w() {
        return this.f6758C;
    }

    /* renamed from: w */
    public void mo8208w(int i) {
        mo8181n(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: x */
    public float mo8209x() {
        return this.f6785X;
    }

    /* renamed from: x */
    public void mo8210x(int i) {
        mo8184o(this.f6793f0.getResources().getDimension(i));
    }

    /* renamed from: y */
    public ColorStateList mo8211y() {
        return this.f6762E;
    }

    /* renamed from: y */
    public void mo8212y(int i) {
        this.f6767G0 = i;
    }

    /* renamed from: z */
    public float mo8213z() {
        return this.f6764F;
    }

    /* renamed from: z */
    public void mo8214z(int i) {
        mo8162g(C0664a.m3681b(this.f6793f0, i));
    }
}
