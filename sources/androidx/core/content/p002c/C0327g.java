package androidx.core.content.p002c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.c.g */
public class C0327g {
    /* renamed from: a */
    public static float m1590a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m1598a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m1591a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1598a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static ColorStateList m1592a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m1598a(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C0313a.m1538a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m1593a(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* renamed from: a */
    private static ColorStateList m1593a(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: a */
    public static TypedArray m1594a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static C0314b m1595a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m1598a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0314b.m1546b(typedValue.data);
            }
            C0314b b = C0314b.m1547b(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (b != null) {
                return b;
            }
        }
        return C0314b.m1546b(i2);
    }

    /* renamed from: a */
    public static String m1596a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1598a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static boolean m1597a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m1598a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m1598a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: b */
    public static int m1599b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1598a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static TypedValue m1600b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1598a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: c */
    public static int m1601c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m1598a(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }
}
