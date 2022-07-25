package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.c0 */
public class C0474c0 {

    /* renamed from: a */
    private final HashMap<String, C0508z> f2040a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0508z mo2685a(String str) {
        return this.f2040a.get(str);
    }

    /* renamed from: a */
    public final void mo2686a() {
        for (C0508z a : this.f2040a.values()) {
            a.mo2738a();
        }
        this.f2040a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2687a(String str, C0508z zVar) {
        C0508z put = this.f2040a.put(str, zVar);
        if (put != null) {
            put.mo2564f();
        }
    }
}
