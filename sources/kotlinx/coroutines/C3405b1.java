package kotlinx.coroutines;

import kotlinx.coroutines.internal.C3487u;

/* renamed from: kotlinx.coroutines.b1 */
public final class C3405b1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C3487u f8066a = new C3487u("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C3487u f8067b = new C3487u("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m12306a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
