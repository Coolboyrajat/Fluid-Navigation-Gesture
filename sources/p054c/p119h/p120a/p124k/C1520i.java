package p054c.p119h.p120a.p124k;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;
import net.dinglisch.android.tasker.C3559a;

/* renamed from: c.h.a.k.i */
public final class C1520i extends C1516e<Unit> {

    /* renamed from: a */
    private final int f4556a;

    /* renamed from: b */
    private final String f4557b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1520i(int i, String str) {
        super(false, (C3366g) null);
        C3370k.m12227b(str, "message");
        this.f4556a = i;
        this.f4557b = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1520i(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "t"
            kotlin.p205x.p207d.C3370k.m12227b(r3, r0)
            int r0 = r3.hashCode()
            java.lang.String r1 = r3.getMessage()
            if (r1 == 0) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = r3.toString()
        L_0x0014:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p054c.p119h.p120a.p124k.C1520i.<init>(java.lang.Throwable):void");
    }

    /* renamed from: a */
    public boolean mo6008a(C1506a aVar) {
        C3370k.m12227b(aVar, "args");
        Context a = aVar.mo5980a();
        Intent d = aVar.mo5983d();
        Bundle bundle = new Bundle();
        bundle.putString("%err", String.valueOf(this.f4556a));
        bundle.putString("%errmsg", this.f4557b);
        return C3559a.C3564e.m12857a(a, d, 2, bundle);
    }
}
