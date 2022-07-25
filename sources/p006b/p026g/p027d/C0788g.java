package p006b.p026g.p027d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.d.g */
public class C0788g extends C0787f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4457a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3148g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3154m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo4462d(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
