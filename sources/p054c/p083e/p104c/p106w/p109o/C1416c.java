package p054c.p083e.p104c.p106w.p109o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p054c.p083e.p104c.C1283k;

/* renamed from: c.e.c.w.o.c */
final class C1416c extends C1415b {

    /* renamed from: d */
    private static Class f4348d;

    /* renamed from: b */
    private final Object f4349b = m6526c();

    /* renamed from: c */
    private final Field f4350c = m6525b();

    C1416c() {
    }

    /* renamed from: b */
    private static Field m6525b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Object m6526c() {
        try {
            f4348d = Class.forName("sun.misc.Unsafe");
            Field declaredField = f4348d.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo5853a(AccessibleObject accessibleObject) {
        if (!mo5854b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C1283k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5854b(AccessibleObject accessibleObject) {
        if (!(this.f4349b == null || this.f4350c == null)) {
            try {
                long longValue = ((Long) f4348d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f4349b, new Object[]{this.f4350c})).longValue();
                f4348d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f4349b, new Object[]{accessibleObject, Long.valueOf(longValue), true});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
