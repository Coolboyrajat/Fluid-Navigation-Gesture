package androidx.core.content.p002c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p006b.p026g.C0779c;
import p006b.p026g.p032h.C0799a;

/* renamed from: androidx.core.content.c.c */
public class C0315c {

    /* renamed from: androidx.core.content.c.c$a */
    public interface C0316a {
    }

    /* renamed from: androidx.core.content.c.c$b */
    public static final class C0317b implements C0316a {

        /* renamed from: a */
        private final C0318c[] f1545a;

        public C0317b(C0318c[] cVarArr) {
            this.f1545a = cVarArr;
        }

        /* renamed from: a */
        public C0318c[] mo1966a() {
            return this.f1545a;
        }
    }

    /* renamed from: androidx.core.content.c.c$c */
    public static final class C0318c {

        /* renamed from: a */
        private final String f1546a;

        /* renamed from: b */
        private int f1547b;

        /* renamed from: c */
        private boolean f1548c;

        /* renamed from: d */
        private String f1549d;

        /* renamed from: e */
        private int f1550e;

        /* renamed from: f */
        private int f1551f;

        public C0318c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1546a = str;
            this.f1547b = i;
            this.f1548c = z;
            this.f1549d = str2;
            this.f1550e = i2;
            this.f1551f = i3;
        }

        /* renamed from: a */
        public String mo1967a() {
            return this.f1546a;
        }

        /* renamed from: b */
        public int mo1968b() {
            return this.f1551f;
        }

        /* renamed from: c */
        public int mo1969c() {
            return this.f1550e;
        }

        /* renamed from: d */
        public String mo1970d() {
            return this.f1549d;
        }

        /* renamed from: e */
        public int mo1971e() {
            return this.f1547b;
        }

        /* renamed from: f */
        public boolean mo1972f() {
            return this.f1548c;
        }
    }

    /* renamed from: androidx.core.content.c.c$d */
    public static final class C0319d implements C0316a {

        /* renamed from: a */
        private final C0799a f1552a;

        /* renamed from: b */
        private final int f1553b;

        /* renamed from: c */
        private final int f1554c;

        public C0319d(C0799a aVar, int i, int i2) {
            this.f1552a = aVar;
            this.f1554c = i;
            this.f1553b = i2;
        }

        /* renamed from: a */
        public int mo1973a() {
            return this.f1554c;
        }

        /* renamed from: b */
        public C0799a mo1974b() {
            return this.f1552a;
        }

        /* renamed from: c */
        public int mo1975c() {
            return this.f1553b;
        }
    }

    /* renamed from: a */
    private static int m1555a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static androidx.core.content.p002c.C0315c.C0316a m1556a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.c.c$a r3 = m1560b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p002c.C0315c.m1556a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.c.c$a");
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1557a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1555a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1558a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1558a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1558a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m1559a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: b */
    private static C0316a m1560b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1561c(xmlPullParser, resources);
        }
        m1559a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0316a m1561c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0779c.FontFamily);
        String string = obtainAttributes.getString(C0779c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0779c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0779c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0779c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0779c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0779c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1562d(xmlPullParser, resources));
                    } else {
                        m1559a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0317b((C0318c[]) arrayList.toArray(new C0318c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1559a(xmlPullParser);
        }
        return new C0319d(new C0799a(string, string2, string3, m1557a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0318c m1562d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0779c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0779c.FontFamilyFont_fontWeight) ? C0779c.FontFamilyFont_fontWeight : C0779c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0779c.FontFamilyFont_fontStyle) ? C0779c.FontFamilyFont_fontStyle : C0779c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C0779c.FontFamilyFont_ttcIndex) ? C0779c.FontFamilyFont_ttcIndex : C0779c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0779c.FontFamilyFont_fontVariationSettings) ? C0779c.FontFamilyFont_fontVariationSettings : C0779c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0779c.FontFamilyFont_font) ? C0779c.FontFamilyFont_font : C0779c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1559a(xmlPullParser);
        }
        return new C0318c(string2, i, z, string, i3, resourceId);
    }
}
