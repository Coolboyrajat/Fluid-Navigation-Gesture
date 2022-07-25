package p054c.p116g.p117a.p118a;

import java.util.List;
import p190io.objectbox.android.BuildConfig;

/* renamed from: c.g.a.a.a */
public class C1428a implements C1448c {

    /* renamed from: a */
    public final List<String> f4395a;

    /* renamed from: b */
    public final int f4396b;

    public C1428a(List<String> list, List<String> list2, int i) {
        this.f4395a = list;
        this.f4396b = i;
    }

    /* renamed from: a */
    private static String m6603a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            String str = BuildConfig.FLAVOR;
            for (String append : list) {
                sb.append(str);
                sb.append(append);
                str = "\n";
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo5874a() {
        return m6603a(this.f4395a);
    }

    /* renamed from: b */
    public boolean mo5875b() {
        return this.f4396b == 0;
    }

    public String toString() {
        return mo5874a();
    }
}
