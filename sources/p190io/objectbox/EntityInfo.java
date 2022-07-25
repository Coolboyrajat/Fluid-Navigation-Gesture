package p190io.objectbox;

import java.io.Serializable;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.internal.CursorFactory;
import p190io.objectbox.internal.IdGetter;

@Internal
/* renamed from: io.objectbox.EntityInfo */
public interface EntityInfo<T> extends Serializable {
    Property<T>[] getAllProperties();

    CursorFactory<T> getCursorFactory();

    String getDbName();

    Class<T> getEntityClass();

    int getEntityId();

    String getEntityName();

    IdGetter<T> getIdGetter();

    Property<T> getIdProperty();
}
