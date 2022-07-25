package kotlinx.coroutines;

import kotlin.C3262k;
import kotlin.C3265l;
import kotlin.p197u.C3309c;
import kotlin.p205x.p207d.C3370k;

/* renamed from: kotlinx.coroutines.k0 */
public final class C3504k0 {
    /* renamed from: a */
    public static final String m12634a(Object obj) {
        C3370k.m12227b(obj, "$this$classSimpleName");
        String simpleName = obj.getClass().getSimpleName();
        C3370k.m12223a((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    /* renamed from: a */
    public static final String m12635a(C3309c<?> cVar) {
        String str;
        C3370k.m12227b(cVar, "$this$toDebugString");
        if (cVar instanceof C3521p0) {
            return cVar.toString();
        }
        try {
            C3262k.C3263a aVar = C3262k.f7982f;
            String str2 = cVar + '@' + m12636b(cVar);
            C3262k.m11974a(str2);
            str = str2;
        } catch (Throwable th) {
            C3262k.C3263a aVar2 = C3262k.f7982f;
            Object a = C3265l.m11978a(th);
            C3262k.m11974a(a);
            str = a;
        }
        Throwable b = C3262k.m11975b(str);
        String str3 = str;
        if (b != null) {
            str3 = cVar.getClass().getName() + '@' + m12636b(cVar);
        }
        return (String) str3;
    }

    /* renamed from: b */
    public static final String m12636b(Object obj) {
        C3370k.m12227b(obj, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        C3370k.m12223a((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }
}
