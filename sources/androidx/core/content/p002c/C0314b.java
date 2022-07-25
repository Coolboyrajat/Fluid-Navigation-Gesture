package androidx.core.content.p002c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.c.b */
public final class C0314b {

    /* renamed from: a */
    private final Shader f1542a;

    /* renamed from: b */
    private final ColorStateList f1543b;

    /* renamed from: c */
    private int f1544c;

    private C0314b(Shader shader, ColorStateList colorStateList, int i) {
        this.f1542a = shader;
        this.f1543b = colorStateList;
        this.f1544c = i;
    }

    /* renamed from: a */
    static C0314b m1543a(ColorStateList colorStateList) {
        return new C0314b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    private static C0314b m1544a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m1543a(C0313a.m1540a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m1545a(C0320d.m1574a(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: a */
    static C0314b m1545a(Shader shader) {
        return new C0314b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: b */
    static C0314b m1546b(int i) {
        return new C0314b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: b */
    public static C0314b m1547b(Resources resources, int i, Resources.Theme theme) {
        try {
            return m1544a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public int mo1959a() {
        return this.f1544c;
    }

    /* renamed from: a */
    public void mo1960a(int i) {
        this.f1544c = i;
    }

    /* renamed from: a */
    public boolean mo1961a(int[] iArr) {
        if (mo1964d()) {
            ColorStateList colorStateList = this.f1543b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1544c) {
                this.f1544c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Shader mo1962b() {
        return this.f1542a;
    }

    /* renamed from: c */
    public boolean mo1963c() {
        return this.f1542a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1543b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1964d() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f1542a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f1543b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p002c.C0314b.mo1964d():boolean");
    }

    /* renamed from: e */
    public boolean mo1965e() {
        return mo1963c() || this.f1544c != 0;
    }
}
