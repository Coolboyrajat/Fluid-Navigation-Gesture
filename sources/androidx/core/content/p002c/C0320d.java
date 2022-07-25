package androidx.core.content.p002c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p026g.C0779c;

/* renamed from: androidx.core.content.c.d */
final class C0320d {

    /* renamed from: androidx.core.content.c.d$a */
    static final class C0321a {

        /* renamed from: a */
        final int[] f1555a;

        /* renamed from: b */
        final float[] f1556b;

        C0321a(int i, int i2) {
            this.f1555a = new int[]{i, i2};
            this.f1556b = new float[]{0.0f, 1.0f};
        }

        C0321a(int i, int i2, int i3) {
            this.f1555a = new int[]{i, i2, i3};
            this.f1556b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0321a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1555a = new int[size];
            this.f1556b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1555a[i] = list.get(i).intValue();
                this.f1556b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static Shader.TileMode m1573a(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* renamed from: a */
    static Shader m1574a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray a = C0327g.m1594a(resources, theme2, attributeSet, C0779c.GradientColor);
            float a2 = C0327g.m1590a(a, xmlPullParser2, "startX", C0779c.GradientColor_android_startX, 0.0f);
            float a3 = C0327g.m1590a(a, xmlPullParser2, "startY", C0779c.GradientColor_android_startY, 0.0f);
            float a4 = C0327g.m1590a(a, xmlPullParser2, "endX", C0779c.GradientColor_android_endX, 0.0f);
            float a5 = C0327g.m1590a(a, xmlPullParser2, "endY", C0779c.GradientColor_android_endY, 0.0f);
            float a6 = C0327g.m1590a(a, xmlPullParser2, "centerX", C0779c.GradientColor_android_centerX, 0.0f);
            float a7 = C0327g.m1590a(a, xmlPullParser2, "centerY", C0779c.GradientColor_android_centerY, 0.0f);
            int b = C0327g.m1599b(a, xmlPullParser2, "type", C0779c.GradientColor_android_type, 0);
            int a8 = C0327g.m1591a(a, xmlPullParser2, "startColor", C0779c.GradientColor_android_startColor, 0);
            boolean a9 = C0327g.m1598a(xmlPullParser2, "centerColor");
            int a10 = C0327g.m1591a(a, xmlPullParser2, "centerColor", C0779c.GradientColor_android_centerColor, 0);
            int a11 = C0327g.m1591a(a, xmlPullParser2, "endColor", C0779c.GradientColor_android_endColor, 0);
            int b2 = C0327g.m1599b(a, xmlPullParser2, "tileMode", C0779c.GradientColor_android_tileMode, 0);
            float f = a6;
            float a12 = C0327g.m1590a(a, xmlPullParser2, "gradientRadius", C0779c.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            C0321a a13 = m1575a(m1576b(resources, xmlPullParser, attributeSet, theme), a8, a11, a9, a10);
            if (b == 1) {
                float f2 = f;
                if (a12 > 0.0f) {
                    int[] iArr = a13.f1555a;
                    return new RadialGradient(f2, a7, a12, iArr, a13.f1556b, m1573a(b2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (b != 2) {
                return new LinearGradient(a2, a3, a4, a5, a13.f1555a, a13.f1556b, m1573a(b2));
            } else {
                return new SweepGradient(f, a7, a13.f1555a, a13.f1556b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* renamed from: a */
    private static C0321a m1575a(C0321a aVar, int i, int i2, boolean z, int i3) {
        C0321a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new C0321a(i, i2);
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.p002c.C0320d.C0321a m1576b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p006b.p026g.C0779c.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.p002c.C0327g.m1594a((android.content.res.Resources) r8, (android.content.res.Resources.Theme) r11, (android.util.AttributeSet) r10, (int[]) r3)
            int r5 = p006b.p026g.C0779c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p006b.p026g.C0779c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = p006b.p026g.C0779c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p006b.p026g.C0779c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            androidx.core.content.c.d$a r8 = new androidx.core.content.c.d$a
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p002c.C0320d.m1576b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.c.d$a");
    }
}
