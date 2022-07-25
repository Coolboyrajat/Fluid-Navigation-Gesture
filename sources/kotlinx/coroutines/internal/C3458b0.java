package kotlinx.coroutines.internal;

import kotlin.p197u.C3314f;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.internal.b0 */
final class C3458b0 {

    /* renamed from: a */
    private Object[] f8160a;

    /* renamed from: b */
    private int f8161b;

    /* renamed from: c */
    private final C3314f f8162c;

    public C3458b0(C3314f fVar, int i) {
        C3370k.m12227b(fVar, "context");
        this.f8162c = fVar;
        this.f8160a = new Object[i];
    }

    /* renamed from: a */
    public final C3314f mo10212a() {
        return this.f8162c;
    }

    /* renamed from: a */
    public final void mo10213a(Object obj) {
        Object[] objArr = this.f8160a;
        int i = this.f8161b;
        this.f8161b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: b */
    public final void mo10214b() {
        this.f8161b = 0;
    }

    /* renamed from: c */
    public final Object mo10215c() {
        Object[] objArr = this.f8160a;
        int i = this.f8161b;
        this.f8161b = i + 1;
        return objArr[i];
    }
}
