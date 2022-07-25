package kotlinx.coroutines.internal;

import kotlin.p197u.C3309c;
import kotlin.p197u.C3314f;
import kotlin.p197u.p199i.p200a.C3331e;
import kotlin.p205x.p207d.C3370k;
import kotlinx.coroutines.C3393a;
import kotlinx.coroutines.C3529r;
import kotlinx.coroutines.C3555y1;

/* renamed from: kotlinx.coroutines.internal.r */
public class C3484r<T> extends C3393a<T> implements C3331e {

    /* renamed from: i */
    public final C3309c<T> f8196i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3484r(C3314f fVar, C3309c<? super T> cVar) {
        super(fVar, true);
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(cVar, "uCont");
        this.f8196i = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10254a(Object obj, int i) {
        if (obj instanceof C3529r) {
            Throwable th = ((C3529r) obj).f8245a;
            if (i != 4) {
                th = C3486t.m12571a(th, (C3309c<?>) this.f8196i);
            }
            C3555y1.m12828a(this.f8196i, th, i);
            return;
        }
        C3555y1.m12830b(this.f8196i, obj, i);
    }

    /* renamed from: c */
    public final C3331e mo10046c() {
        return (C3331e) this.f8196i;
    }

    /* renamed from: g */
    public final StackTraceElement mo10048g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo10255l() {
        return true;
    }

    /* renamed from: p */
    public int mo10103p() {
        return 2;
    }
}
