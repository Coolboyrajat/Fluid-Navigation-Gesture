package p190io.objectbox.internal;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import p190io.objectbox.annotation.apihint.Internal;

@Internal
/* renamed from: io.objectbox.internal.ReflectionCache */
public class ReflectionCache {
    private static final ReflectionCache instance = new ReflectionCache();
    private final Map<Class, Map<String, Field>> fields = new HashMap();

    public static ReflectionCache getInstance() {
        return instance;
    }

    public synchronized Field getField(Class cls, String str) {
        Field field;
        Map map = this.fields.get(cls);
        if (map == null) {
            map = new HashMap();
            this.fields.put(cls, map);
        }
        field = (Field) map.get(str);
        if (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                map.put(str, field);
            } catch (NoSuchFieldException e) {
                throw new IllegalStateException(e);
            }
        }
        return field;
    }
}
