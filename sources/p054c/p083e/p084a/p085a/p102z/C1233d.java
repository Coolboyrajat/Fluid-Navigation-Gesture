package p054c.p083e.p084a.p085a.p102z;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0329b;
import p006b.p026g.p034j.C0832c;
import p054c.p083e.p084a.p085a.C1169b;
import p054c.p083e.p084a.p085a.p093q.C1207a;
import p054c.p083e.p084a.p085a.p095s.C1209a;
import p054c.p083e.p084a.p085a.p101y.C1228a;
import p054c.p083e.p084a.p085a.p102z.C1241h;
import p054c.p083e.p084a.p085a.p102z.C1244i;

/* renamed from: c.e.a.a.z.d */
public class C1233d extends Drawable implements C0329b, C1252j {

    /* renamed from: z */
    private static final Paint f4008z = new Paint(1);

    /* renamed from: f */
    private C1235b f4009f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1244i.C1251g[] f4010g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1244i.C1251g[] f4011h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f4012i;

    /* renamed from: j */
    private final Matrix f4013j;

    /* renamed from: k */
    private final Path f4014k;

    /* renamed from: l */
    private final Path f4015l;

    /* renamed from: m */
    private final RectF f4016m;

    /* renamed from: n */
    private final RectF f4017n;

    /* renamed from: o */
    private final Region f4018o;

    /* renamed from: p */
    private final Region f4019p;

    /* renamed from: q */
    private C1238g f4020q;

    /* renamed from: r */
    private final Paint f4021r;

    /* renamed from: s */
    private final Paint f4022s;

    /* renamed from: t */
    private final C1228a f4023t;

    /* renamed from: u */
    private final C1241h.C1242a f4024u;

    /* renamed from: v */
    private final C1241h f4025v;

    /* renamed from: w */
    private PorterDuffColorFilter f4026w;

    /* renamed from: x */
    private PorterDuffColorFilter f4027x;

    /* renamed from: y */
    private Rect f4028y;

    /* renamed from: c.e.a.a.z.d$a */
    class C1234a implements C1241h.C1242a {
        C1234a() {
        }

        /* renamed from: a */
        public void mo5526a(C1244i iVar, Matrix matrix, int i) {
            C1233d.this.f4011h[i] = iVar.mo5562a(matrix);
        }

        /* renamed from: b */
        public void mo5527b(C1244i iVar, Matrix matrix, int i) {
            C1233d.this.f4010g[i] = iVar.mo5562a(matrix);
        }
    }

    /* renamed from: c.e.a.a.z.d$b */
    static final class C1235b extends Drawable.ConstantState {

        /* renamed from: a */
        public C1238g f4030a;

        /* renamed from: b */
        public C1209a f4031b;

        /* renamed from: c */
        public ColorFilter f4032c;

        /* renamed from: d */
        public ColorStateList f4033d = null;

        /* renamed from: e */
        public ColorStateList f4034e = null;

        /* renamed from: f */
        public ColorStateList f4035f = null;

        /* renamed from: g */
        public ColorStateList f4036g = null;

        /* renamed from: h */
        public PorterDuff.Mode f4037h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f4038i = null;

        /* renamed from: j */
        public float f4039j = 1.0f;

        /* renamed from: k */
        public float f4040k = 1.0f;

        /* renamed from: l */
        public float f4041l;

        /* renamed from: m */
        public int f4042m = 255;

        /* renamed from: n */
        public float f4043n = 0.0f;

        /* renamed from: o */
        public float f4044o = 0.0f;

        /* renamed from: p */
        public float f4045p = 0.0f;

        /* renamed from: q */
        public int f4046q = 0;

        /* renamed from: r */
        public int f4047r = 0;

        /* renamed from: s */
        public int f4048s = 0;

        /* renamed from: t */
        public int f4049t = 0;

        /* renamed from: u */
        public boolean f4050u = false;

        /* renamed from: v */
        public Paint.Style f4051v = Paint.Style.FILL_AND_STROKE;

        public C1235b(C1235b bVar) {
            this.f4030a = bVar.f4030a;
            this.f4031b = bVar.f4031b;
            this.f4041l = bVar.f4041l;
            this.f4032c = bVar.f4032c;
            this.f4033d = bVar.f4033d;
            this.f4034e = bVar.f4034e;
            this.f4037h = bVar.f4037h;
            this.f4036g = bVar.f4036g;
            this.f4042m = bVar.f4042m;
            this.f4039j = bVar.f4039j;
            this.f4048s = bVar.f4048s;
            this.f4046q = bVar.f4046q;
            this.f4050u = bVar.f4050u;
            this.f4040k = bVar.f4040k;
            this.f4043n = bVar.f4043n;
            this.f4044o = bVar.f4044o;
            this.f4045p = bVar.f4045p;
            this.f4047r = bVar.f4047r;
            this.f4049t = bVar.f4049t;
            this.f4035f = bVar.f4035f;
            this.f4051v = bVar.f4051v;
            Rect rect = bVar.f4038i;
            if (rect != null) {
                this.f4038i = new Rect(rect);
            }
        }

        public C1235b(C1238g gVar, C1209a aVar) {
            this.f4030a = gVar;
            this.f4031b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C1233d dVar = new C1233d(this, (C1234a) null);
            boolean unused = dVar.f4012i = true;
            return dVar;
        }
    }

    public C1233d() {
        this(new C1238g());
    }

    public C1233d(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1238g.m5967a(context, attributeSet, i, i2).mo5547a());
    }

    private C1233d(C1235b bVar) {
        this.f4010g = new C1244i.C1251g[4];
        this.f4011h = new C1244i.C1251g[4];
        this.f4013j = new Matrix();
        this.f4014k = new Path();
        this.f4015l = new Path();
        this.f4016m = new RectF();
        this.f4017n = new RectF();
        this.f4018o = new Region();
        this.f4019p = new Region();
        this.f4021r = new Paint(1);
        this.f4022s = new Paint(1);
        this.f4023t = new C1228a();
        this.f4025v = new C1241h();
        this.f4009f = bVar;
        this.f4022s.setStyle(Paint.Style.STROKE);
        this.f4021r.setStyle(Paint.Style.FILL);
        f4008z.setColor(-1);
        f4008z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo8205v();
        mo8140a(getState());
        this.f4024u = new C1234a();
    }

    /* synthetic */ C1233d(C1235b bVar, C1234a aVar) {
        this(bVar);
    }

    public C1233d(C1238g gVar) {
        this(new C1235b(gVar, (C1209a) null));
    }

    /* renamed from: a */
    private static int m5900a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m5901a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m5903a(paint, z) : m5902a(colorStateList, mode, z);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m5902a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo8145c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter m5903a(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.mo8145c((int) r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p084a.p085a.p102z.C1233d.m5903a(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: a */
    public static C1233d m5904a(Context context, float f) {
        int a = C1207a.m5827a(context, C1169b.colorSurface, C1233d.class.getSimpleName());
        C1233d dVar = new C1233d();
        dVar.mo5491a(context);
        dVar.mo5492a(ColorStateList.valueOf(a));
        dVar.mo5486a(f);
        return dVar;
    }

    /* renamed from: a */
    private void m5905a(Canvas canvas) {
        if (this.f4009f.f4048s != 0) {
            canvas.drawPath(this.f4014k, this.f4023t.mo5475a());
        }
        for (int i = 0; i < 4; i++) {
            this.f4010g[i].mo5574a(this.f4023t, this.f4009f.f4047r, canvas);
            this.f4011h[i].mo5574a(this.f4023t, this.f4009f.f4047r, canvas);
        }
        int f = mo5506f();
        int g = mo5507g();
        canvas.translate((float) (-f), (float) (-g));
        canvas.drawPath(this.f4014k, f4008z);
        canvas.translate((float) f, (float) g);
    }

    /* renamed from: a */
    private void m5906a(Canvas canvas, Paint paint, Path path, C1238g gVar, RectF rectF) {
        if (gVar.mo5540i()) {
            float a = gVar.mo5539h().mo5482a();
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: a */
    private void m5907a(RectF rectF, Path path) {
        m5912b(rectF, path);
        if (this.f4009f.f4039j != 1.0f) {
            this.f4013j.reset();
            Matrix matrix = this.f4013j;
            float f = this.f4009f.f4039j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4013j);
        }
    }

    /* renamed from: a */
    private boolean mo8140a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4009f.f4033d == null || (color2 = this.f4021r.getColor()) == (colorForState2 = this.f4009f.f4033d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f4021r.setColor(colorForState2);
            z = true;
        }
        if (this.f4009f.f4034e == null || (color = this.f4022s.getColor()) == (colorForState = this.f4009f.f4034e.getColorForState(iArr, color))) {
            return z;
        }
        this.f4022s.setColor(colorForState);
        return true;
    }

    /* renamed from: b */
    private void m5911b(Canvas canvas) {
        m5906a(canvas, this.f4021r, this.f4014k, this.f4009f.f4030a, mo5496b());
    }

    /* renamed from: b */
    private void m5912b(RectF rectF, Path path) {
        C1241h hVar = this.f4025v;
        C1235b bVar = this.f4009f;
        C1238g gVar = bVar.f4030a;
        float f = bVar.f4040k;
        hVar.mo5560a(gVar, f, rectF, this.f4024u, path);
    }

    /* renamed from: c */
    private int mo8145c(int i) {
        float l = mo5519l() + mo5505e();
        C1209a aVar = this.f4009f.f4031b;
        return aVar != null ? aVar.mo5443b(i, l) : i;
    }

    /* renamed from: c */
    private void m5915c(Canvas canvas) {
        m5906a(canvas, this.f4022s, this.f4015l, this.f4020q, mo8183o());
    }

    /* renamed from: d */
    private void m5916d(Canvas canvas) {
        int f = mo5506f();
        int g = mo5507g();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f4009f.f4047r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(f, g);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) f, (float) g);
    }

    /* renamed from: n */
    private void mo8180n() {
        this.f4020q = mo5514i().mo5531a(-mo8188p());
        this.f4025v.mo5559a(this.f4020q, this.f4009f.f4040k, mo8183o(), this.f4015l);
    }

    /* renamed from: o */
    private RectF mo8183o() {
        RectF b = mo5496b();
        float p = mo8188p();
        this.f4017n.set(b.left + p, b.top + p, b.right - p, b.bottom - p);
        return this.f4017n;
    }

    /* renamed from: p */
    private float mo8188p() {
        if (mo8196s()) {
            return this.f4022s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: q */
    private boolean mo8191q() {
        C1235b bVar = this.f4009f;
        int i = bVar.f4046q;
        return i != 1 && bVar.f4047r > 0 && (i == 2 || mo8202u());
    }

    /* renamed from: r */
    private boolean mo8194r() {
        Paint.Style style = this.f4009f.f4051v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: s */
    private boolean mo8196s() {
        Paint.Style style = this.f4009f.f4051v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4022s.getStrokeWidth() > 0.0f;
    }

    /* renamed from: t */
    private void mo8200t() {
        super.invalidateSelf();
    }

    /* renamed from: u */
    private boolean mo8202u() {
        return Build.VERSION.SDK_INT < 21 || (!this.f4009f.f4030a.mo5540i() && !this.f4014k.isConvex());
    }

    /* renamed from: v */
    private boolean mo8205v() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4026w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4027x;
        C1235b bVar = this.f4009f;
        this.f4026w = m5901a(bVar.f4036g, bVar.f4037h, this.f4021r, true);
        C1235b bVar2 = this.f4009f;
        this.f4027x = m5901a(bVar2.f4035f, bVar2.f4037h, this.f4022s, false);
        C1235b bVar3 = this.f4009f;
        if (bVar3.f4050u) {
            this.f4023t.mo5476a(bVar3.f4036g.getColorForState(getState(), 0));
        }
        return !C0832c.m4525a(porterDuffColorFilter, this.f4026w) || !C0832c.m4525a(porterDuffColorFilter2, this.f4027x);
    }

    /* renamed from: w */
    private void mo8207w() {
        float l = mo5519l();
        this.f4009f.f4047r = (int) Math.ceil((double) (0.75f * l));
        this.f4009f.f4048s = (int) Math.ceil((double) (l * 0.25f));
        mo8205v();
        mo8200t();
    }

    /* renamed from: a */
    public void mo5486a(float f) {
        C1235b bVar = this.f4009f;
        if (bVar.f4044o != f) {
            bVar.f4044o = f;
            mo8207w();
        }
    }

    /* renamed from: a */
    public void mo5487a(float f, int i) {
        mo5503d(f);
        mo5499b(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public void mo5488a(float f, ColorStateList colorStateList) {
        mo5503d(f);
        mo5499b(colorStateList);
    }

    /* renamed from: a */
    public void mo5489a(int i) {
        C1235b bVar = this.f4009f;
        if (bVar.f4049t != i) {
            bVar.f4049t = i;
            mo8200t();
        }
    }

    /* renamed from: a */
    public void mo5490a(int i, int i2, int i3, int i4) {
        C1235b bVar = this.f4009f;
        if (bVar.f4038i == null) {
            bVar.f4038i = new Rect();
        }
        this.f4009f.f4038i.set(i, i2, i3, i4);
        this.f4028y = this.f4009f.f4038i;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo5491a(Context context) {
        this.f4009f.f4031b = new C1209a(context);
        mo8207w();
    }

    /* renamed from: a */
    public void mo5492a(ColorStateList colorStateList) {
        C1235b bVar = this.f4009f;
        if (bVar.f4033d != colorStateList) {
            bVar.f4033d = colorStateList;
            onStateChange(getState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5493a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m5906a(canvas, paint, path, this.f4009f.f4030a, rectF);
    }

    /* renamed from: a */
    public void mo5494a(Paint.Style style) {
        this.f4009f.f4051v = style;
        mo8200t();
    }

    @Deprecated
    /* renamed from: a */
    public void mo5495a(Rect rect, Path path) {
        m5912b(new RectF(rect), path);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RectF mo5496b() {
        Rect bounds = getBounds();
        this.f4016m.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f4016m;
    }

    /* renamed from: b */
    public void mo5497b(float f) {
        C1235b bVar = this.f4009f;
        if (bVar.f4040k != f) {
            bVar.f4040k = f;
            this.f4012i = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo5498b(int i) {
        C1235b bVar = this.f4009f;
        if (bVar.f4046q != i) {
            bVar.f4046q = i;
            mo8200t();
        }
    }

    /* renamed from: b */
    public void mo5499b(ColorStateList colorStateList) {
        C1235b bVar = this.f4009f;
        if (bVar.f4034e != colorStateList) {
            bVar.f4034e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    public float mo5500c() {
        return this.f4009f.f4044o;
    }

    /* renamed from: c */
    public void mo5501c(float f) {
        C1235b bVar = this.f4009f;
        if (bVar.f4043n != f) {
            bVar.f4043n = f;
            mo8207w();
        }
    }

    /* renamed from: d */
    public ColorStateList mo5502d() {
        return this.f4009f.f4033d;
    }

    /* renamed from: d */
    public void mo5503d(float f) {
        this.f4009f.f4041l = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f4021r.setColorFilter(this.f4026w);
        int alpha = this.f4021r.getAlpha();
        this.f4021r.setAlpha(m5900a(alpha, this.f4009f.f4042m));
        this.f4022s.setColorFilter(this.f4027x);
        this.f4022s.setStrokeWidth(this.f4009f.f4041l);
        int alpha2 = this.f4022s.getAlpha();
        this.f4022s.setAlpha(m5900a(alpha2, this.f4009f.f4042m));
        if (this.f4012i) {
            mo8180n();
            m5907a(mo5496b(), this.f4014k);
            this.f4012i = false;
        }
        if (mo8191q()) {
            canvas.save();
            m5916d(canvas);
            Bitmap createBitmap = Bitmap.createBitmap(getBounds().width() + (this.f4009f.f4047r * 2), getBounds().height() + (this.f4009f.f4047r * 2), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) (getBounds().left - this.f4009f.f4047r);
            float f2 = (float) (getBounds().top - this.f4009f.f4047r);
            canvas2.translate(-f, -f2);
            m5905a(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (mo8194r()) {
            m5911b(canvas);
        }
        if (mo8196s()) {
            m5915c(canvas);
        }
        this.f4021r.setAlpha(alpha);
        this.f4022s.setAlpha(alpha2);
    }

    /* renamed from: e */
    public float mo5505e() {
        return this.f4009f.f4043n;
    }

    /* renamed from: f */
    public int mo5506f() {
        C1235b bVar = this.f4009f;
        return (int) (((double) bVar.f4048s) * Math.sin(Math.toRadians((double) bVar.f4049t)));
    }

    /* renamed from: g */
    public int mo5507g() {
        C1235b bVar = this.f4009f;
        return (int) (((double) bVar.f4048s) * Math.cos(Math.toRadians((double) bVar.f4049t)));
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4009f;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        C1235b bVar = this.f4009f;
        if (bVar.f4046q != 2) {
            if (bVar.f4030a.mo5540i()) {
                outline.setRoundRect(getBounds(), this.f4009f.f4030a.mo5538g().mo5482a());
                return;
            }
            m5907a(mo5496b(), this.f4014k);
            if (this.f4014k.isConvex()) {
                outline.setConvexPath(this.f4014k);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4028y;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f4018o.set(getBounds());
        m5907a(mo5496b(), this.f4014k);
        this.f4019p.setPath(this.f4014k, this.f4018o);
        this.f4018o.op(this.f4019p, Region.Op.DIFFERENCE);
        return this.f4018o;
    }

    /* renamed from: h */
    public int mo5513h() {
        return this.f4009f.f4047r;
    }

    /* renamed from: i */
    public C1238g mo5514i() {
        return this.f4009f.f4030a;
    }

    public void invalidateSelf() {
        this.f4012i = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f4009f.f4034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f4009f.f4033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4009f.f4036g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f4009f.f4035f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            c.e.a.a.z.d$b r0 = r1.f4009f
            android.content.res.ColorStateList r0 = r0.f4036g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            c.e.a.a.z.d$b r0 = r1.f4009f
            android.content.res.ColorStateList r0 = r0.f4035f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            c.e.a.a.z.d$b r0 = r1.f4009f
            android.content.res.ColorStateList r0 = r0.f4034e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            c.e.a.a.z.d$b r0 = r1.f4009f
            android.content.res.ColorStateList r0 = r0.f4033d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p083e.p084a.p085a.p102z.C1233d.isStateful():boolean");
    }

    /* renamed from: j */
    public ColorStateList mo5517j() {
        return this.f4009f.f4036g;
    }

    /* renamed from: k */
    public float mo5518k() {
        return this.f4009f.f4045p;
    }

    /* renamed from: l */
    public float mo5519l() {
        return mo5500c() + mo5518k();
    }

    /* renamed from: m */
    public boolean mo5520m() {
        C1209a aVar = this.f4009f.f4031b;
        return aVar != null && aVar.mo5442a();
    }

    public Drawable mutate() {
        this.f4009f = new C1235b(this.f4009f);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4012i = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = mo8140a(iArr) || mo8205v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void setAlpha(int i) {
        C1235b bVar = this.f4009f;
        if (bVar.f4042m != i) {
            bVar.f4042m = i;
            mo8200t();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4009f.f4032c = colorFilter;
        mo8200t();
    }

    public void setShapeAppearanceModel(C1238g gVar) {
        this.f4009f.f4030a = gVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4009f.f4036g = colorStateList;
        mo8205v();
        mo8200t();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1235b bVar = this.f4009f;
        if (bVar.f4037h != mode) {
            bVar.f4037h = mode;
            mo8205v();
            mo8200t();
        }
    }
}
