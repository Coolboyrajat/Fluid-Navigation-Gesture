package p190io.objectbox.internal;

import java.io.Serializable;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.relation.ToOne;

@Internal
/* renamed from: io.objectbox.internal.ToOneGetter */
public interface ToOneGetter<SOURCE> extends Serializable {
    <TARGET> ToOne<TARGET> getToOne(SOURCE source);
}
