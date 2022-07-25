package kotlin.p194d0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C3261j;
import kotlin.C3268o;
import kotlin.p191a0.C3190b;
import kotlin.p191a0.C3193d;
import kotlin.p193c0.C3221d;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p206c.C3351c;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;

/* renamed from: kotlin.d0.o */
class C3251o extends C3250n {

    /* renamed from: kotlin.d0.o$a */
    static final class C3252a extends C3371l implements C3351c<CharSequence, Integer, C3261j<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ List f7977g;

        /* renamed from: h */
        final /* synthetic */ boolean f7978h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3252a(List list, boolean z) {
            super(2);
            this.f7977g = list;
            this.f7978h = z;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6125a(Object obj, Object obj2) {
            return mo9931a((CharSequence) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final C3261j<Integer, Integer> mo9931a(CharSequence charSequence, int i) {
            C3370k.m12227b(charSequence, "$receiver");
            C3261j a = C3251o.m11961b(charSequence, (Collection<String>) this.f7977g, i, this.f7978h, false);
            if (a != null) {
                return C3268o.m11989a(a.mo9936c(), Integer.valueOf(((String) a.mo9937d()).length()));
            }
            return null;
        }
    }

    /* renamed from: kotlin.d0.o$b */
    static final class C3253b extends C3371l implements C3350b<C3193d, String> {

        /* renamed from: g */
        final /* synthetic */ CharSequence f7979g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3253b(CharSequence charSequence) {
            super(1);
            this.f7979g = charSequence;
        }

        /* renamed from: a */
        public final String mo5146a(C3193d dVar) {
            C3370k.m12227b(dVar, "it");
            return C3251o.m11940a(this.f7979g, dVar);
        }
    }

    /* renamed from: a */
    public static final int m11933a(CharSequence charSequence, char c, int i, boolean z) {
        C3370k.m12227b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m11939a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ int m11934a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11933a(charSequence, c, i, z);
    }

    /* renamed from: a */
    private static final int m11935a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C3190b dVar = !z2 ? new C3193d(C3198h.m11846a(i, 0), C3198h.m11849b(i2, charSequence.length())) : C3198h.m11851c(C3198h.m11849b(i, m11962c(charSequence)), C3198h.m11846a(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = dVar.mo9897a();
            int b = dVar.mo9898b();
            int c = dVar.mo9899c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (true) {
                if (m11951a(charSequence2, 0, charSequence, a, charSequence2.length(), z)) {
                    return a;
                }
                if (a == b) {
                    return -1;
                }
                a += c;
            }
        } else {
            int a2 = dVar.mo9897a();
            int b2 = dVar.mo9898b();
            int c2 = dVar.mo9899c();
            if (c2 >= 0) {
                if (a2 > b2) {
                    return -1;
                }
            } else if (a2 < b2) {
                return -1;
            }
            while (true) {
                if (C3250n.m11930a((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), z)) {
                    return a2;
                }
                if (a2 == b2) {
                    return -1;
                }
                a2 += c2;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m11936a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m11935a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    public static final int m11937a(CharSequence charSequence, String str, int i, boolean z) {
        C3370k.m12227b(charSequence, "$this$indexOf");
        C3370k.m12227b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m11936a(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ int m11938a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11937a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final int m11939a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C3370k.m12227b(charSequence, "$this$indexOfAny");
        C3370k.m12227b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C3198h.m11846a(i, 0);
            int c = m11962c(charSequence);
            if (a > c) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (C3236b.m11899a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == c) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C3280f.m12016a(cArr), i);
        }
    }

    /* renamed from: a */
    public static final String m11940a(CharSequence charSequence, C3193d dVar) {
        C3370k.m12227b(charSequence, "$this$substring");
        C3370k.m12227b(dVar, "range");
        return charSequence.subSequence(dVar.mo9909e().intValue(), dVar.mo9908d().intValue() + 1).toString();
    }

    /* renamed from: a */
    public static final String m11941a(String str, char c, String str2) {
        C3370k.m12227b(str, "$this$substringBefore");
        C3370k.m12227b(str2, "missingDelimiterValue");
        int a = m11934a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C3370k.m12223a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* synthetic */ String m11942a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m11941a(str, c, str2);
    }

    /* renamed from: a */
    public static final String m11943a(String str, String str2, String str3) {
        C3370k.m12227b(str, "$this$substringAfter");
        C3370k.m12227b(str2, "delimiter");
        C3370k.m12227b(str3, "missingDelimiterValue");
        int a = m11938a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C3370k.m12223a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* synthetic */ String m11944a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m11943a(str, str2, str3);
    }

    /* renamed from: a */
    private static final List<String> m11945a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = m11937a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C3283i.m12064a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C3198h.m11849b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if ((z2 && arrayList.size() == i - 1) || (a = m11937a(charSequence, str, i2, z)) == -1) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                break;
            } while ((a = m11937a(charSequence, str, i2, z)) == -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    /* renamed from: a */
    public static final List<String> m11946a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C3370k.m12227b(charSequence, "$this$split");
        C3370k.m12227b(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m11945a(charSequence, str, z, i);
            }
        }
        Iterable<C3193d> b = C3228j.m11882b(m11949a(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C3285k.m12075a(b, 10));
        for (C3193d a : b) {
            arrayList.add(m11940a(charSequence, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ List m11947a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m11946a(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    private static final C3221d<C3193d> m11948a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C3238d(charSequence, i, i2, new C3252a(C3279e.m12009a(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    /* renamed from: a */
    static /* synthetic */ C3221d m11949a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m11948a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    public static final boolean m11951a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C3370k.m12227b(charSequence, "$this$regionMatchesImpl");
        C3370k.m12227b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C3236b.m11899a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m11952a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C3370k.m12227b(charSequence, "$this$contains");
        C3370k.m12227b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m11938a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m11936a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m11953a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m11952a(charSequence, charSequence2, z);
    }

    /* renamed from: b */
    public static final int m11954b(CharSequence charSequence, String str, int i, boolean z) {
        C3370k.m12227b(charSequence, "$this$lastIndexOf");
        C3370k.m12227b(str, "string");
        return (z || !(charSequence instanceof String)) ? m11935a(charSequence, (CharSequence) str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: b */
    public static /* synthetic */ int m11955b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m11962c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m11954b(charSequence, str, i, z);
    }

    /* renamed from: b */
    public static final String m11956b(String str, String str2, String str3) {
        C3370k.m12227b(str, "$this$substringBefore");
        C3370k.m12227b(str2, "delimiter");
        C3370k.m12227b(str3, "missingDelimiterValue");
        int a = m11938a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C3370k.m12223a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* synthetic */ String m11957b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m11956b(str, str2, str3);
    }

    /* renamed from: b */
    public static final C3193d m11958b(CharSequence charSequence) {
        C3370k.m12227b(charSequence, "$this$indices");
        return new C3193d(0, charSequence.length() - 1);
    }

    /* renamed from: b */
    public static final C3221d<String> m11959b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C3370k.m12227b(charSequence, "$this$splitToSequence");
        C3370k.m12227b(strArr, "delimiters");
        return C3228j.m11887d(m11949a(charSequence, strArr, 0, z, i, 2, (Object) null), new C3253b(charSequence));
    }

    /* renamed from: b */
    public static /* synthetic */ C3221d m11960b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m11959b(charSequence, strArr, z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C3261j<Integer, String> m11961b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            C3190b dVar = !z2 ? new C3193d(C3198h.m11846a(i, 0), charSequence.length()) : C3198h.m11851c(C3198h.m11849b(i, m11962c(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = dVar.mo9897a();
                int b = dVar.mo9898b();
                int c = dVar.mo9899c();
                if (c < 0 ? i2 >= b : i2 <= b) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (C3250n.m11930a(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == b) {
                                break;
                            }
                            i2 += c;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int a = dVar.mo9897a();
            int b2 = dVar.mo9898b();
            int c2 = dVar.mo9899c();
            if (c2 < 0 ? a >= b2 : a <= b2) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (m11951a((CharSequence) str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == b2) {
                            break;
                        }
                        a = i2 + c2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return C3268o.m11989a(Integer.valueOf(i2), str);
        }
        String str4 = (String) C3292r.m12098d(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int a2 = !z2 ? m11938a(charSequence2, str5, i3, false, 4, (Object) null) : m11955b(charSequence2, str5, i3, false, 4, (Object) null);
        if (a2 < 0) {
            return null;
        }
        return C3268o.m11989a(Integer.valueOf(a2), str4);
    }

    /* renamed from: c */
    public static final int m11962c(CharSequence charSequence) {
        C3370k.m12227b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: d */
    public static CharSequence m11963d(CharSequence charSequence) {
        C3370k.m12227b(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C3235a.m11898a(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
