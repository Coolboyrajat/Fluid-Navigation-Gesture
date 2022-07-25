package p190io.objectbox.internal;

import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.internal.CallWithHandle */
public interface CallWithHandle<RESULT> {
    RESULT call(long j);
}
