package p179e.p184b.p185a;

import java.lang.reflect.Type;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.BuildConfig;

/* renamed from: e.b.a.b0 */
final class C2988b0 extends C2997f0 {

    /* renamed from: a */
    public static final C2988b0 f7751a = new C2988b0();

    private C2988b0() {
    }

    /* renamed from: a */
    public String mo9109a(Class<?> cls, boolean z) {
        C3370k.m12227b(cls, "cls");
        if (cls.isArray()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Array<");
            Class<?> componentType = cls.getComponentType();
            C3370k.m12223a((Object) componentType, "cls.componentType");
            sb.append(C2997f0.m11513a(this, componentType, false, 2, (Object) null));
            sb.append(">");
            return sb.toString();
        }
        String a = C2993d0.m11498c(cls);
        if (a != null) {
            return a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2993d0.m11499c((Type) cls));
        sb2.append(!z ? C2993d0.m11500d(cls) : BuildConfig.FLAVOR);
        return sb2.toString();
    }
}
