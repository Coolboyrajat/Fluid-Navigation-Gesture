package p190io.objectbox.internal;

import p190io.objectbox.BoxStore;
import p190io.objectbox.Cursor;
import p190io.objectbox.Transaction;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.internal.CursorFactory */
public interface CursorFactory<T> {
    Cursor<T> createCursor(Transaction transaction, long j, BoxStore boxStore);
}
