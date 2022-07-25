package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3429h;
import kotlinx.coroutines.C3513n0;
import kotlinx.coroutines.C3537t1;
import p190io.objectbox.android.BuildConfig;

/* renamed from: kotlinx.coroutines.internal.o */
final class C3481o extends C3537t1 implements C3513n0 {

    /* renamed from: f */
    private final Throwable f8193f;

    /* renamed from: g */
    private final String f8194g;

    public C3481o(Throwable th, String str) {
        this.f8193f = th;
        this.f8194g = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3481o(Throwable th, String str, int i, C3366g gVar) {
        this(th, (i & 2) != 0 ? null : str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m12555h() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f8193f
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f8194g
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f8193f
            r1.<init>(r0, r2)
            throw r1
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3481o.m12555h():java.lang.Void");
    }

    /* renamed from: a */
    public Void mo10111a(long j, C3429h<? super Unit> hVar) {
        C3370k.m12227b(hVar, "continuation");
        m12555h();
        throw null;
    }

    /* renamed from: a */
    public Void mo10112a(C3314f fVar, Runnable runnable) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        m12555h();
        throw null;
    }

    /* renamed from: b */
    public boolean mo10113b(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        m12555h();
        throw null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Main[missing");
        if (this.f8193f != null) {
            str = ", cause=" + this.f8193f;
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
