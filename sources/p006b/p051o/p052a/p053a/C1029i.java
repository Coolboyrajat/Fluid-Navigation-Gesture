package p006b.p051o.p052a.p053a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p002c.C0314b;
import androidx.core.content.p002c.C0327g;
import androidx.core.graphics.drawable.C0328a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p021d.C0723a;
import p006b.p026g.p027d.C0781b;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: b.o.a.a.i */
public class C1029i extends C1028h {

    /* renamed from: o */
    static final PorterDuff.Mode f3616o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private C1037h f3617g;

    /* renamed from: h */
    private PorterDuffColorFilter f3618h;

    /* renamed from: i */
    private ColorFilter f3619i;

    /* renamed from: j */
    private boolean f3620j;

    /* renamed from: k */
    private boolean f3621k;

    /* renamed from: l */
    private final float[] f3622l;

    /* renamed from: m */
    private final Matrix f3623m;

    /* renamed from: n */
    private final Rect f3624n;

    /* renamed from: b.o.a.a.i$b */
    private static class C1031b extends C1035f {
        C1031b() {
        }

        C1031b(C1031b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m5307a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3651b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3650a = C0781b.m4360a(string2);
            }
            this.f3652c = C0327g.m1599b(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: a */
        public void mo5027a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0327g.m1598a(xmlPullParser, "pathData")) {
                TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C1017a.f3591d);
                m5307a(a, xmlPullParser);
                a.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo5028b() {
            return true;
        }
    }

    /* renamed from: b.o.a.a.i$c */
    private static class C1032c extends C1035f {

        /* renamed from: e */
        private int[] f3625e;

        /* renamed from: f */
        C0314b f3626f;

        /* renamed from: g */
        float f3627g = 0.0f;

        /* renamed from: h */
        C0314b f3628h;

        /* renamed from: i */
        float f3629i = 1.0f;

        /* renamed from: j */
        float f3630j = 1.0f;

        /* renamed from: k */
        float f3631k = 0.0f;

        /* renamed from: l */
        float f3632l = 1.0f;

        /* renamed from: m */
        float f3633m = 0.0f;

        /* renamed from: n */
        Paint.Cap f3634n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f3635o = Paint.Join.MITER;

        /* renamed from: p */
        float f3636p = 4.0f;

        C1032c() {
        }

        C1032c(C1032c cVar) {
            super(cVar);
            this.f3625e = cVar.f3625e;
            this.f3626f = cVar.f3626f;
            this.f3627g = cVar.f3627g;
            this.f3629i = cVar.f3629i;
            this.f3628h = cVar.f3628h;
            this.f3652c = cVar.f3652c;
            this.f3630j = cVar.f3630j;
            this.f3631k = cVar.f3631k;
            this.f3632l = cVar.f3632l;
            this.f3633m = cVar.f3633m;
            this.f3634n = cVar.f3634n;
            this.f3635o = cVar.f3635o;
            this.f3636p = cVar.f3636p;
        }

        /* renamed from: a */
        private Paint.Cap m5310a(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: a */
        private Paint.Join m5311a(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: a */
        private void m5312a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3625e = null;
            if (C0327g.m1598a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3651b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3650a = C0781b.m4360a(string2);
                }
                Resources.Theme theme2 = theme;
                this.f3628h = C0327g.m1595a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f3630j = C0327g.m1590a(typedArray, xmlPullParser, "fillAlpha", 12, this.f3630j);
                this.f3634n = m5310a(C0327g.m1599b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3634n);
                this.f3635o = m5311a(C0327g.m1599b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3635o);
                this.f3636p = C0327g.m1590a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3636p);
                this.f3626f = C0327g.m1595a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f3629i = C0327g.m1590a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3629i);
                this.f3627g = C0327g.m1590a(typedArray, xmlPullParser, "strokeWidth", 4, this.f3627g);
                this.f3632l = C0327g.m1590a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3632l);
                this.f3633m = C0327g.m1590a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3633m);
                this.f3631k = C0327g.m1590a(typedArray, xmlPullParser, "trimPathStart", 5, this.f3631k);
                this.f3652c = C0327g.m1599b(typedArray, xmlPullParser, "fillType", 13, this.f3652c);
            }
        }

        /* renamed from: a */
        public void mo5029a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C1017a.f3590c);
            m5312a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo5030a() {
            return this.f3628h.mo1964d() || this.f3626f.mo1964d();
        }

        /* renamed from: a */
        public boolean mo5031a(int[] iArr) {
            return this.f3626f.mo1961a(iArr) | this.f3628h.mo1961a(iArr);
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f3630j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f3628h.mo1959a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f3629i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f3626f.mo1959a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f3627g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f3632l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f3633m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f3631k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f3630j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f3628h.mo1960a(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f3629i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f3626f.mo1960a(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f3627g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f3632l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f3633m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f3631k = f;
        }
    }

    /* renamed from: b.o.a.a.i$d */
    private static class C1033d extends C1034e {

        /* renamed from: a */
        final Matrix f3637a = new Matrix();

        /* renamed from: b */
        final ArrayList<C1034e> f3638b = new ArrayList<>();

        /* renamed from: c */
        float f3639c = 0.0f;

        /* renamed from: d */
        private float f3640d = 0.0f;

        /* renamed from: e */
        private float f3641e = 0.0f;

        /* renamed from: f */
        private float f3642f = 1.0f;

        /* renamed from: g */
        private float f3643g = 1.0f;

        /* renamed from: h */
        private float f3644h = 0.0f;

        /* renamed from: i */
        private float f3645i = 0.0f;

        /* renamed from: j */
        final Matrix f3646j = new Matrix();

        /* renamed from: k */
        int f3647k;

        /* renamed from: l */
        private int[] f3648l;

        /* renamed from: m */
        private String f3649m = null;

        public C1033d() {
            super();
        }

        public C1033d(C1033d dVar, C0723a<String, Object> aVar) {
            super();
            C1035f fVar;
            this.f3639c = dVar.f3639c;
            this.f3640d = dVar.f3640d;
            this.f3641e = dVar.f3641e;
            this.f3642f = dVar.f3642f;
            this.f3643g = dVar.f3643g;
            this.f3644h = dVar.f3644h;
            this.f3645i = dVar.f3645i;
            this.f3648l = dVar.f3648l;
            this.f3649m = dVar.f3649m;
            this.f3647k = dVar.f3647k;
            String str = this.f3649m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3646j.set(dVar.f3646j);
            ArrayList<C1034e> arrayList = dVar.f3638b;
            for (int i = 0; i < arrayList.size(); i++) {
                C1034e eVar = arrayList.get(i);
                if (eVar instanceof C1033d) {
                    this.f3638b.add(new C1033d((C1033d) eVar, aVar));
                } else {
                    if (eVar instanceof C1032c) {
                        fVar = new C1032c((C1032c) eVar);
                    } else if (eVar instanceof C1031b) {
                        fVar = new C1031b((C1031b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3638b.add(fVar);
                    String str2 = fVar.f3651b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m5316a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3648l = null;
            this.f3639c = C0327g.m1590a(typedArray, xmlPullParser, "rotation", 5, this.f3639c);
            this.f3640d = typedArray.getFloat(1, this.f3640d);
            this.f3641e = typedArray.getFloat(2, this.f3641e);
            this.f3642f = C0327g.m1590a(typedArray, xmlPullParser, "scaleX", 3, this.f3642f);
            this.f3643g = C0327g.m1590a(typedArray, xmlPullParser, "scaleY", 4, this.f3643g);
            this.f3644h = C0327g.m1590a(typedArray, xmlPullParser, "translateX", 6, this.f3644h);
            this.f3645i = C0327g.m1590a(typedArray, xmlPullParser, "translateY", 7, this.f3645i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3649m = string;
            }
            m5317b();
        }

        /* renamed from: b */
        private void m5317b() {
            this.f3646j.reset();
            this.f3646j.postTranslate(-this.f3640d, -this.f3641e);
            this.f3646j.postScale(this.f3642f, this.f3643g);
            this.f3646j.postRotate(this.f3639c, 0.0f, 0.0f);
            this.f3646j.postTranslate(this.f3644h + this.f3640d, this.f3645i + this.f3641e);
        }

        /* renamed from: a */
        public void mo5048a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C1017a.f3589b);
            m5316a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: a */
        public boolean mo5030a() {
            for (int i = 0; i < this.f3638b.size(); i++) {
                if (this.f3638b.get(i).mo5030a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo5031a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f3638b.size(); i++) {
                z |= this.f3638b.get(i).mo5031a(iArr);
            }
            return z;
        }

        public String getGroupName() {
            return this.f3649m;
        }

        public Matrix getLocalMatrix() {
            return this.f3646j;
        }

        public float getPivotX() {
            return this.f3640d;
        }

        public float getPivotY() {
            return this.f3641e;
        }

        public float getRotation() {
            return this.f3639c;
        }

        public float getScaleX() {
            return this.f3642f;
        }

        public float getScaleY() {
            return this.f3643g;
        }

        public float getTranslateX() {
            return this.f3644h;
        }

        public float getTranslateY() {
            return this.f3645i;
        }

        public void setPivotX(float f) {
            if (f != this.f3640d) {
                this.f3640d = f;
                m5317b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f3641e) {
                this.f3641e = f;
                m5317b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f3639c) {
                this.f3639c = f;
                m5317b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f3642f) {
                this.f3642f = f;
                m5317b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f3643g) {
                this.f3643g = f;
                m5317b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f3644h) {
                this.f3644h = f;
                m5317b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f3645i) {
                this.f3645i = f;
                m5317b();
            }
        }
    }

    /* renamed from: b.o.a.a.i$e */
    private static abstract class C1034e {
        private C1034e() {
        }

        /* renamed from: a */
        public boolean mo5030a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo5031a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: b.o.a.a.i$f */
    private static abstract class C1035f extends C1034e {

        /* renamed from: a */
        protected C0781b.C0783b[] f3650a = null;

        /* renamed from: b */
        String f3651b;

        /* renamed from: c */
        int f3652c = 0;

        /* renamed from: d */
        int f3653d;

        public C1035f() {
            super();
        }

        public C1035f(C1035f fVar) {
            super();
            this.f3651b = fVar.f3651b;
            this.f3653d = fVar.f3653d;
            this.f3650a = C0781b.m4361a(fVar.f3650a);
        }

        /* renamed from: a */
        public void mo5065a(Path path) {
            path.reset();
            C0781b.C0783b[] bVarArr = this.f3650a;
            if (bVarArr != null) {
                C0781b.C0783b.m4368a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo5028b() {
            return false;
        }

        public C0781b.C0783b[] getPathData() {
            return this.f3650a;
        }

        public String getPathName() {
            return this.f3651b;
        }

        public void setPathData(C0781b.C0783b[] bVarArr) {
            if (!C0781b.m4358a(this.f3650a, bVarArr)) {
                this.f3650a = C0781b.m4361a(bVarArr);
            } else {
                C0781b.m4363b(this.f3650a, bVarArr);
            }
        }
    }

    /* renamed from: b.o.a.a.i$g */
    private static class C1036g {

        /* renamed from: q */
        private static final Matrix f3654q = new Matrix();

        /* renamed from: a */
        private final Path f3655a;

        /* renamed from: b */
        private final Path f3656b;

        /* renamed from: c */
        private final Matrix f3657c;

        /* renamed from: d */
        Paint f3658d;

        /* renamed from: e */
        Paint f3659e;

        /* renamed from: f */
        private PathMeasure f3660f;

        /* renamed from: g */
        private int f3661g;

        /* renamed from: h */
        final C1033d f3662h;

        /* renamed from: i */
        float f3663i;

        /* renamed from: j */
        float f3664j;

        /* renamed from: k */
        float f3665k;

        /* renamed from: l */
        float f3666l;

        /* renamed from: m */
        int f3667m;

        /* renamed from: n */
        String f3668n;

        /* renamed from: o */
        Boolean f3669o;

        /* renamed from: p */
        final C0723a<String, Object> f3670p;

        public C1036g() {
            this.f3657c = new Matrix();
            this.f3663i = 0.0f;
            this.f3664j = 0.0f;
            this.f3665k = 0.0f;
            this.f3666l = 0.0f;
            this.f3667m = 255;
            this.f3668n = null;
            this.f3669o = null;
            this.f3670p = new C0723a<>();
            this.f3662h = new C1033d();
            this.f3655a = new Path();
            this.f3656b = new Path();
        }

        public C1036g(C1036g gVar) {
            this.f3657c = new Matrix();
            this.f3663i = 0.0f;
            this.f3664j = 0.0f;
            this.f3665k = 0.0f;
            this.f3666l = 0.0f;
            this.f3667m = 255;
            this.f3668n = null;
            this.f3669o = null;
            this.f3670p = new C0723a<>();
            this.f3662h = new C1033d(gVar.f3662h, this.f3670p);
            this.f3655a = new Path(gVar.f3655a);
            this.f3656b = new Path(gVar.f3656b);
            this.f3663i = gVar.f3663i;
            this.f3664j = gVar.f3664j;
            this.f3665k = gVar.f3665k;
            this.f3666l = gVar.f3666l;
            this.f3661g = gVar.f3661g;
            this.f3667m = gVar.f3667m;
            this.f3668n = gVar.f3668n;
            String str = gVar.f3668n;
            if (str != null) {
                this.f3670p.put(str, this);
            }
            this.f3669o = gVar.f3669o;
        }

        /* renamed from: a */
        private static float m5325a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m5326a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m5325a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m5327a(C1033d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f3637a.set(matrix);
            dVar.f3637a.preConcat(dVar.f3646j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f3638b.size(); i3++) {
                C1034e eVar = dVar.f3638b.get(i3);
                if (eVar instanceof C1033d) {
                    m5327a((C1033d) eVar, dVar.f3637a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1035f) {
                    m5328a(dVar, (C1035f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: a */
        private void m5328a(C1033d dVar, C1035f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f3665k;
            float f2 = ((float) i2) / this.f3666l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f3637a;
            this.f3657c.set(matrix);
            this.f3657c.postScale(f, f2);
            float a = m5326a(matrix);
            if (a != 0.0f) {
                fVar.mo5065a(this.f3655a);
                Path path = this.f3655a;
                this.f3656b.reset();
                if (fVar.mo5028b()) {
                    this.f3656b.setFillType(fVar.f3652c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f3656b.addPath(path, this.f3657c);
                    canvas.clipPath(this.f3656b);
                    return;
                }
                C1032c cVar = (C1032c) fVar;
                if (!(cVar.f3631k == 0.0f && cVar.f3632l == 1.0f)) {
                    float f3 = cVar.f3631k;
                    float f4 = cVar.f3633m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f3632l + f4) % 1.0f;
                    if (this.f3660f == null) {
                        this.f3660f = new PathMeasure();
                    }
                    this.f3660f.setPath(this.f3655a, false);
                    float length = this.f3660f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f3660f.getSegment(f7, length, path, true);
                        this.f3660f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f3660f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f3656b.addPath(path, this.f3657c);
                if (cVar.f3628h.mo1965e()) {
                    C0314b bVar = cVar.f3628h;
                    if (this.f3659e == null) {
                        this.f3659e = new Paint(1);
                        this.f3659e.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.f3659e;
                    if (bVar.mo1963c()) {
                        Shader b = bVar.mo1962b();
                        b.setLocalMatrix(this.f3657c);
                        paint.setShader(b);
                        paint.setAlpha(Math.round(cVar.f3630j * 255.0f));
                    } else {
                        paint.setShader((Shader) null);
                        paint.setAlpha(255);
                        paint.setColor(C1029i.m5298a(bVar.mo1959a(), cVar.f3630j));
                    }
                    paint.setColorFilter(colorFilter);
                    this.f3656b.setFillType(cVar.f3652c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f3656b, paint);
                }
                if (cVar.f3626f.mo1965e()) {
                    C0314b bVar2 = cVar.f3626f;
                    if (this.f3658d == null) {
                        this.f3658d = new Paint(1);
                        this.f3658d.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.f3658d;
                    Paint.Join join = cVar.f3635o;
                    if (join != null) {
                        paint2.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f3634n;
                    if (cap != null) {
                        paint2.setStrokeCap(cap);
                    }
                    paint2.setStrokeMiter(cVar.f3636p);
                    if (bVar2.mo1963c()) {
                        Shader b2 = bVar2.mo1962b();
                        b2.setLocalMatrix(this.f3657c);
                        paint2.setShader(b2);
                        paint2.setAlpha(Math.round(cVar.f3629i * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1029i.m5298a(bVar2.mo1959a(), cVar.f3629i));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(cVar.f3627g * min * a);
                    canvas.drawPath(this.f3656b, paint2);
                }
            }
        }

        /* renamed from: a */
        public void mo5069a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m5327a(this.f3662h, f3654q, canvas, i, i2, colorFilter);
        }

        /* renamed from: a */
        public boolean mo5070a() {
            if (this.f3669o == null) {
                this.f3669o = Boolean.valueOf(this.f3662h.mo5030a());
            }
            return this.f3669o.booleanValue();
        }

        /* renamed from: a */
        public boolean mo5071a(int[] iArr) {
            return this.f3662h.mo5031a(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3667m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f3667m = i;
        }
    }

    /* renamed from: b.o.a.a.i$h */
    private static class C1037h extends Drawable.ConstantState {

        /* renamed from: a */
        int f3671a;

        /* renamed from: b */
        C1036g f3672b;

        /* renamed from: c */
        ColorStateList f3673c;

        /* renamed from: d */
        PorterDuff.Mode f3674d;

        /* renamed from: e */
        boolean f3675e;

        /* renamed from: f */
        Bitmap f3676f;

        /* renamed from: g */
        ColorStateList f3677g;

        /* renamed from: h */
        PorterDuff.Mode f3678h;

        /* renamed from: i */
        int f3679i;

        /* renamed from: j */
        boolean f3680j;

        /* renamed from: k */
        boolean f3681k;

        /* renamed from: l */
        Paint f3682l;

        public C1037h() {
            this.f3673c = null;
            this.f3674d = C1029i.f3616o;
            this.f3672b = new C1036g();
        }

        public C1037h(C1037h hVar) {
            this.f3673c = null;
            this.f3674d = C1029i.f3616o;
            if (hVar != null) {
                this.f3671a = hVar.f3671a;
                this.f3672b = new C1036g(hVar.f3672b);
                Paint paint = hVar.f3672b.f3659e;
                if (paint != null) {
                    this.f3672b.f3659e = new Paint(paint);
                }
                Paint paint2 = hVar.f3672b.f3658d;
                if (paint2 != null) {
                    this.f3672b.f3658d = new Paint(paint2);
                }
                this.f3673c = hVar.f3673c;
                this.f3674d = hVar.f3674d;
                this.f3675e = hVar.f3675e;
            }
        }

        /* renamed from: a */
        public Paint mo5076a(ColorFilter colorFilter) {
            if (!mo5082b() && colorFilter == null) {
                return null;
            }
            if (this.f3682l == null) {
                this.f3682l = new Paint();
                this.f3682l.setFilterBitmap(true);
            }
            this.f3682l.setAlpha(this.f3672b.getRootAlpha());
            this.f3682l.setColorFilter(colorFilter);
            return this.f3682l;
        }

        /* renamed from: a */
        public void mo5077a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3676f, (Rect) null, rect, mo5076a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo5078a() {
            return !this.f3681k && this.f3677g == this.f3673c && this.f3678h == this.f3674d && this.f3680j == this.f3675e && this.f3679i == this.f3672b.getRootAlpha();
        }

        /* renamed from: a */
        public boolean mo5079a(int i, int i2) {
            return i == this.f3676f.getWidth() && i2 == this.f3676f.getHeight();
        }

        /* renamed from: a */
        public boolean mo5080a(int[] iArr) {
            boolean a = this.f3672b.mo5071a(iArr);
            this.f3681k |= a;
            return a;
        }

        /* renamed from: b */
        public void mo5081b(int i, int i2) {
            if (this.f3676f == null || !mo5079a(i, i2)) {
                this.f3676f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f3681k = true;
            }
        }

        /* renamed from: b */
        public boolean mo5082b() {
            return this.f3672b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo5083c(int i, int i2) {
            this.f3676f.eraseColor(0);
            this.f3672b.mo5069a(new Canvas(this.f3676f), i, i2, (ColorFilter) null);
        }

        /* renamed from: c */
        public boolean mo5084c() {
            return this.f3672b.mo5070a();
        }

        /* renamed from: d */
        public void mo5085d() {
            this.f3677g = this.f3673c;
            this.f3678h = this.f3674d;
            this.f3679i = this.f3672b.getRootAlpha();
            this.f3680j = this.f3675e;
            this.f3681k = false;
        }

        public int getChangingConfigurations() {
            return this.f3671a;
        }

        public Drawable newDrawable() {
            return new C1029i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1029i(this);
        }
    }

    /* renamed from: b.o.a.a.i$i */
    private static class C1038i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f3683a;

        public C1038i(Drawable.ConstantState constantState) {
            this.f3683a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3683a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3683a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1029i iVar = new C1029i();
            iVar.f3615f = (VectorDrawable) this.f3683a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1029i iVar = new C1029i();
            iVar.f3615f = (VectorDrawable) this.f3683a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1029i iVar = new C1029i();
            iVar.f3615f = (VectorDrawable) this.f3683a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C1029i() {
        this.f3621k = true;
        this.f3622l = new float[9];
        this.f3623m = new Matrix();
        this.f3624n = new Rect();
        this.f3617g = new C1037h();
    }

    C1029i(C1037h hVar) {
        this.f3621k = true;
        this.f3622l = new float[9];
        this.f3623m = new Matrix();
        this.f3624n = new Rect();
        this.f3617g = hVar;
        this.f3618h = mo5001a(this.f3618h, hVar.f3673c, hVar.f3674d);
    }

    /* renamed from: a */
    static int m5298a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m5299a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p006b.p051o.p052a.p053a.C1029i m5300a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            b.o.a.a.i r0 = new b.o.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.p002c.C0323f.m1584a(r6, r7, r8)
            r0.f3615f = r6
            b.o.a.a.i$i r6 = new b.o.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f3615f
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            b.o.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p051o.p052a.p053a.C1029i.m5300a(android.content.res.Resources, int, android.content.res.Resources$Theme):b.o.a.a.i");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: b.o.a.a.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: b.o.a.a.i$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: b.o.a.a.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: b.o.a.a.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: b.o.a.a.i$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5301a(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            b.o.a.a.i$h r0 = r10.f3617g
            b.o.a.a.i$g r1 = r0.f3672b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            b.o.a.a.i$d r3 = r1.f3662h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            b.o.a.a.i$d r7 = (p006b.p051o.p052a.p053a.C1029i.C1033d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            b.o.a.a.i$c r3 = new b.o.a.a.i$c
            r3.<init>()
            r3.mo5029a(r11, r13, r14, r12)
            java.util.ArrayList<b.o.a.a.i$e> r6 = r7.f3638b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            b.d.a<java.lang.String, java.lang.Object> r6 = r1.f3670p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            b.o.a.a.i$b r3 = new b.o.a.a.i$b
            r3.<init>()
            r3.mo5027a(r11, r13, r14, r12)
            java.util.ArrayList<b.o.a.a.i$e> r7 = r7.f3638b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            b.d.a<java.lang.String, java.lang.Object> r7 = r1.f3670p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f3671a
            int r3 = r3.f3653d
        L_0x0081:
            r3 = r3 | r7
            r0.f3671a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            b.o.a.a.i$d r3 = new b.o.a.a.i$d
            r3.<init>()
            r3.mo5048a(r11, r13, r14, r12)
            java.util.ArrayList<b.o.a.a.i$e> r7 = r7.f3638b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            b.d.a<java.lang.String, java.lang.Object> r7 = r1.f3670p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f3671a
            int r3 = r3.f3647k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p051o.p052a.p053a.C1029i.m5301a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    private void m5302a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1037h hVar = this.f3617g;
        C1036g gVar = hVar.f3672b;
        hVar.f3674d = m5299a(C0327g.m1599b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a = C0327g.m1592a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            hVar.f3673c = a;
        }
        hVar.f3675e = C0327g.m1597a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3675e);
        gVar.f3665k = C0327g.m1590a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f3665k);
        gVar.f3666l = C0327g.m1590a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f3666l);
        if (gVar.f3665k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (gVar.f3666l > 0.0f) {
            gVar.f3663i = typedArray.getDimension(3, gVar.f3663i);
            gVar.f3664j = typedArray.getDimension(2, gVar.f3664j);
            if (gVar.f3663i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (gVar.f3664j > 0.0f) {
                gVar.setAlpha(C0327g.m1590a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f3668n = string;
                    gVar.f3670p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: a */
    private boolean m5303a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0328a.m1622e(this) == 1;
    }

    public static C1029i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1029i iVar = new C1029i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo5001a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo5002a(String str) {
        return this.f3617g.f3672b.f3670p.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5003a(boolean z) {
        this.f3621k = z;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3615f;
        if (drawable == null) {
            return false;
        }
        C0328a.m1616a(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3624n);
        if (this.f3624n.width() > 0 && this.f3624n.height() > 0) {
            ColorFilter colorFilter = this.f3619i;
            if (colorFilter == null) {
                colorFilter = this.f3618h;
            }
            canvas.getMatrix(this.f3623m);
            this.f3623m.getValues(this.f3622l);
            float abs = Math.abs(this.f3622l[0]);
            float abs2 = Math.abs(this.f3622l[4]);
            float abs3 = Math.abs(this.f3622l[1]);
            float abs4 = Math.abs(this.f3622l[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(PropertyFlags.INDEX_HASH, (int) (((float) this.f3624n.width()) * abs));
            int min2 = Math.min(PropertyFlags.INDEX_HASH, (int) (((float) this.f3624n.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f3624n;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m5303a()) {
                    canvas.translate((float) this.f3624n.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f3624n.offsetTo(0, 0);
                this.f3617g.mo5081b(min, min2);
                if (!this.f3621k) {
                    this.f3617g.mo5083c(min, min2);
                } else if (!this.f3617g.mo5078a()) {
                    this.f3617g.mo5083c(min, min2);
                    this.f3617g.mo5085d();
                }
                this.f3617g.mo5077a(canvas, colorFilter, this.f3624n);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3615f;
        return drawable != null ? C0328a.m1620c(drawable) : this.f3617g.f3672b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3617g.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3615f;
        return drawable != null ? C0328a.m1621d(drawable) : this.f3619i;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f3615f;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C1038i(drawable.getConstantState());
        }
        this.f3617g.f3671a = getChangingConfigurations();
        return this.f3617g;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3617g.f3672b.f3664j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3617g.f3672b.f3663i;
    }

    public int getOpacity() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1613a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1037h hVar = this.f3617g;
        hVar.f3672b = new C1036g();
        TypedArray a = C0327g.m1594a(resources, theme, attributeSet, C1017a.f3588a);
        m5302a(a, xmlPullParser, theme);
        a.recycle();
        hVar.f3671a = getChangingConfigurations();
        hVar.f3681k = true;
        m5301a(resources, xmlPullParser, attributeSet, theme);
        this.f3618h = mo5001a(this.f3618h, hVar.f3673c, hVar.f3674d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3615f;
        return drawable != null ? C0328a.m1623f(drawable) : this.f3617g.f3675e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f3617g.f3673c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f3617g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f3615f
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            b.o.a.a.i$h r0 = r1.f3617g
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo5084c()
            if (r0 != 0) goto L_0x0028
            b.o.a.a.i$h r0 = r1.f3617g
            android.content.res.ColorStateList r0 = r0.f3673c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p051o.p052a.p053a.C1029i.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3620j && super.mutate() == this) {
            this.f3617g = new C1037h(this.f3617g);
            this.f3620j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1037h hVar = this.f3617g;
        ColorStateList colorStateList = hVar.f3673c;
        if (!(colorStateList == null || (mode = hVar.f3674d) == null)) {
            this.f3618h = mo5001a(this.f3618h, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo5084c() || !hVar.mo5080a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3617g.f3672b.getRootAlpha() != i) {
            this.f3617g.f3672b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1615a(drawable, z);
        } else {
            this.f3617g.f3675e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f3619i = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1619b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1611a(drawable, colorStateList);
            return;
        }
        C1037h hVar = this.f3617g;
        if (hVar.f3673c != colorStateList) {
            hVar.f3673c = colorStateList;
            this.f3618h = mo5001a(this.f3618h, colorStateList, hVar.f3674d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            C0328a.m1614a(drawable, mode);
            return;
        }
        C1037h hVar = this.f3617g;
        if (hVar.f3674d != mode) {
            hVar.f3674d = mode;
            this.f3618h = mo5001a(this.f3618h, hVar.f3673c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3615f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3615f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
