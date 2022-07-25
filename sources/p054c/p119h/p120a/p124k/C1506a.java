package p054c.p119h.p120a.p124k;

import android.content.Context;
import android.content.Intent;
import com.joaomgcd.taskerpluginlibrary.output.p154e.C2770a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.h.a.k.a */
public final class C1506a {

    /* renamed from: a */
    private final Context f4533a;

    /* renamed from: b */
    private final Intent f4534b;

    /* renamed from: c */
    private final C1514d f4535c;

    /* renamed from: d */
    private final C3350b<C2770a, Boolean> f4536d;

    public C1506a(Context context, Intent intent, C1514d dVar, C3350b<? super C2770a, Boolean> bVar) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(intent, "taskerIntent");
        this.f4533a = context;
        this.f4534b = intent;
        this.f4535c = dVar;
        this.f4536d = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1506a(Context context, Intent intent, C1514d dVar, C3350b bVar, int i, C3366g gVar) {
        this(context, intent, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }

    /* renamed from: a */
    public final Context mo5980a() {
        return this.f4533a;
    }

    /* renamed from: b */
    public final C3350b<C2770a, Boolean> mo5981b() {
        return this.f4536d;
    }

    /* renamed from: c */
    public final C1514d mo5982c() {
        return this.f4535c;
    }

    /* renamed from: d */
    public final Intent mo5983d() {
        return this.f4534b;
    }
}
