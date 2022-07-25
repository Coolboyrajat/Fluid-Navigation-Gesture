package p006b.p050n;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.n.s */
public class C1008s {

    /* renamed from: a */
    public final Map<String, Object> f3573a = new HashMap();

    /* renamed from: b */
    public View f3574b;

    /* renamed from: c */
    final ArrayList<C0992m> f3575c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C1008s)) {
            return false;
        }
        C1008s sVar = (C1008s) obj;
        return this.f3574b == sVar.f3574b && this.f3573a.equals(sVar.f3573a);
    }

    public int hashCode() {
        return (this.f3574b.hashCode() * 31) + this.f3573a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3574b + "\n") + "    values:";
        for (String next : this.f3573a.keySet()) {
            str = str + "    " + next + ": " + this.f3573a.get(next) + "\n";
        }
        return str;
    }
}
