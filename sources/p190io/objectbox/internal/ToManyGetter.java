package p190io.objectbox.internal;

import java.io.Serializable;
import java.util.List;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.internal.ToManyGetter */
public interface ToManyGetter<SOURCE> extends Serializable {
    <TARGET> List<TARGET> getToMany(SOURCE source);
}
