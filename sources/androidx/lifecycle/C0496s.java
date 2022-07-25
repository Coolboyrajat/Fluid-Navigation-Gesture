package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.s */
public class C0496s {

    /* renamed from: a */
    private Map<String, Integer> f2063a = new HashMap();

    /* renamed from: a */
    public boolean mo2711a(String str, int i) {
        Integer num = this.f2063a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.f2063a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
