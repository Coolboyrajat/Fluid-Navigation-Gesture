package kotlinx.coroutines;

import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.s */
public final class C3532s {
    /* renamed from: a */
    public static final <T> Object m12768a(Object obj) {
        if (C3262k.m11977d(obj)) {
            C3265l.m11979a(obj);
            return obj;
        }
        Throwable b = C3262k.m11975b(obj);
        if (b != null) {
            return new C3529r(b, false, 2, (C3366g) null);
        }
        C3370k.m12221a();
        throw null;
    }
}
