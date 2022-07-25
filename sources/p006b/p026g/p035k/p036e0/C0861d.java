package p006b.p026g.p035k.p036e0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.g.k.e0.d */
public class C0861d {

    /* renamed from: a */
    private final Object f3304a;

    /* renamed from: b.g.k.e0.d$a */
    static class C0862a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0861d f3305a;

        C0862a(C0861d dVar) {
            this.f3305a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0857c a = this.f3305a.mo4641a(i);
            if (a == null) {
                return null;
            }
            return a.mo4637u();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0857c> a = this.f3305a.mo4643a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a.get(i2).mo4637u());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3305a.mo4644a(i, i2, bundle);
        }
    }

    /* renamed from: b.g.k.e0.d$b */
    static class C0863b extends C0862a {
        C0863b(C0861d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0857c b = this.f3305a.mo4645b(i);
            if (b == null) {
                return null;
            }
            return b.mo4637u();
        }
    }

    public C0861d() {
        int i = Build.VERSION.SDK_INT;
        this.f3304a = i >= 19 ? new C0863b(this) : i >= 16 ? new C0862a(this) : null;
    }

    public C0861d(Object obj) {
        this.f3304a = obj;
    }

    /* renamed from: a */
    public C0857c mo4641a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo4642a() {
        return this.f3304a;
    }

    /* renamed from: a */
    public List<C0857c> mo4643a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo4644a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0857c mo4645b(int i) {
        return null;
    }
}
