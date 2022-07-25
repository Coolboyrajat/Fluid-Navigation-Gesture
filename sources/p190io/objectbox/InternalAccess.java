package p190io.objectbox;

import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.InternalAccess */
public class InternalAccess {
    public static <T> void commitWriter(Box<T> box, Cursor<T> cursor) {
        box.commitWriter(cursor);
    }

    public static void enableCreationStackTracking() {
        Transaction.TRACK_CREATION_STACK = true;
        Cursor.TRACK_CREATION_STACK = true;
    }

    public static <T> Cursor<T> getActiveTxCursor(Box<T> box) {
        return box.getActiveTxCursor();
    }

    public static <T> long getActiveTxCursorHandle(Box<T> box) {
        return box.getActiveTxCursor().internalHandle();
    }

    public static long getHandle(Cursor cursor) {
        return cursor.internalHandle();
    }

    public static long getHandle(Transaction transaction) {
        return transaction.internalHandle();
    }

    public static <T> Cursor<T> getReader(Box<T> box) {
        return box.getReader();
    }

    public static <T> Cursor<T> getWriter(Box<T> box) {
        return box.getWriter();
    }

    public static <T> void releaseReader(Box<T> box, Cursor<T> cursor) {
        box.releaseReader(cursor);
    }

    public static <T> void releaseWriter(Box<T> box, Cursor<T> cursor) {
        box.releaseWriter(cursor);
    }
}
