package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0464a0;
import androidx.lifecycle.C0474c0;
import androidx.lifecycle.C0508z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.o */
class C0432o extends C0508z {

    /* renamed from: m */
    private static final C0464a0.C0466b f1899m = new C0433a();

    /* renamed from: g */
    private final HashMap<String, Fragment> f1900g = new HashMap<>();

    /* renamed from: h */
    private final HashMap<String, C0432o> f1901h = new HashMap<>();

    /* renamed from: i */
    private final HashMap<String, C0474c0> f1902i = new HashMap<>();

    /* renamed from: j */
    private final boolean f1903j;

    /* renamed from: k */
    private boolean f1904k = false;

    /* renamed from: l */
    private boolean f1905l = false;

    /* renamed from: androidx.fragment.app.o$a */
    static class C0433a implements C0464a0.C0466b {
        C0433a() {
        }

        /* renamed from: a */
        public <T extends C0508z> T mo2570a(Class<T> cls) {
            return new C0432o(true);
        }
    }

    C0432o(boolean z) {
        this.f1903j = z;
    }

    /* renamed from: a */
    static C0432o m2258a(C0474c0 c0Var) {
        return (C0432o) new C0464a0(c0Var, f1899m).mo2674a(C0432o.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Fragment mo2557a(String str) {
        return this.f1900g.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2558a(Fragment fragment) {
        if (this.f1900g.containsKey(fragment.f1738j)) {
            return false;
        }
        this.f1900g.put(fragment.f1738j, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2559b(Fragment fragment) {
        if (C0411l.f1831F) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0432o oVar = this.f1901h.get(fragment.f1738j);
        if (oVar != null) {
            oVar.mo2564f();
            this.f1901h.remove(fragment.f1738j);
        }
        C0474c0 c0Var = this.f1902i.get(fragment.f1738j);
        if (c0Var != null) {
            c0Var.mo2686a();
            this.f1902i.remove(fragment.f1738j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0432o mo2560c(Fragment fragment) {
        C0432o oVar = this.f1901h.get(fragment.f1738j);
        if (oVar != null) {
            return oVar;
        }
        C0432o oVar2 = new C0432o(this.f1903j);
        this.f1901h.put(fragment.f1738j, oVar2);
        return oVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0474c0 mo2561d(Fragment fragment) {
        C0474c0 c0Var = this.f1902i.get(fragment.f1738j);
        if (c0Var != null) {
            return c0Var;
        }
        C0474c0 c0Var2 = new C0474c0();
        this.f1902i.put(fragment.f1738j, c0Var2);
        return c0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo2562e(Fragment fragment) {
        return this.f1900g.remove(fragment.f1738j) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0432o.class != obj.getClass()) {
            return false;
        }
        C0432o oVar = (C0432o) obj;
        return this.f1900g.equals(oVar.f1900g) && this.f1901h.equals(oVar.f1901h) && this.f1902i.equals(oVar.f1902i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2564f() {
        if (C0411l.f1831F) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1904k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2565f(Fragment fragment) {
        if (!this.f1900g.containsKey(fragment.f1738j)) {
            return true;
        }
        return this.f1903j ? this.f1904k : !this.f1905l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Collection<Fragment> mo2566g() {
        return this.f1900g.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo2567h() {
        return this.f1904k;
    }

    public int hashCode() {
        return (((this.f1900g.hashCode() * 31) + this.f1901h.hashCode()) * 31) + this.f1902i.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1900g.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1901h.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1902i.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
