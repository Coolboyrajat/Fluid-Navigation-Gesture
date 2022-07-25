package p054c.p112f.p113a.p114a;

import android.os.Looper;
import kotlin.p205x.p207d.C3370k;
import p155d.p156a.C2793k;
import p155d.p156a.p160o.C2811c;

/* renamed from: c.f.a.a.a */
public final class C1423a {
    /* renamed from: a */
    public static final boolean m6598a(C2793k<?> kVar) {
        C3370k.m12227b(kVar, "observer");
        if (!(!C3370k.m12225a((Object) Looper.myLooper(), (Object) Looper.getMainLooper()))) {
            return true;
        }
        kVar.mo6031a(C2811c.m11073b());
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        Thread currentThread = Thread.currentThread();
        C3370k.m12223a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        kVar.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
