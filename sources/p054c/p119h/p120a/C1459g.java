package p054c.p119h.p120a;

import java.util.ArrayList;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;

/* renamed from: c.h.a.g */
public final class C1459g {
    /* renamed from: a */
    public static final <TResult> TResult m6668a(Object obj, C3350b<Object, ? extends TResult> bVar, C3350b<? super String, ? extends TResult> bVar2, C3350b<? super Integer, ? extends TResult> bVar3, C3350b<? super Long, ? extends TResult> bVar4, C3350b<? super Float, ? extends TResult> bVar5, C3350b<? super Double, ? extends TResult> bVar6, C3350b<? super Boolean, ? extends TResult> bVar7, C3350b<? super String[], ? extends TResult> bVar8, C3350b<? super ArrayList<String>, ? extends TResult> bVar9) {
        C3370k.m12227b(bVar, "forNull");
        C3370k.m12227b(bVar2, "forString");
        C3370k.m12227b(bVar3, "forInt");
        C3370k.m12227b(bVar4, "forLong");
        C3370k.m12227b(bVar5, "forFloat");
        C3370k.m12227b(bVar6, "forDouble");
        C3370k.m12227b(bVar7, "forBoolean");
        C3370k.m12227b(bVar8, "forStringArray");
        C3370k.m12227b(bVar9, "forStringArrayList");
        if (obj == null) {
            return bVar.mo5146a(obj);
        }
        if (obj instanceof String) {
            return bVar2.mo5146a(obj);
        }
        if (obj instanceof Integer) {
            return bVar3.mo5146a(obj);
        }
        if (obj instanceof Long) {
            return bVar4.mo5146a(obj);
        }
        if (obj instanceof Float) {
            return bVar5.mo5146a(obj);
        }
        if (obj instanceof Double) {
            return bVar6.mo5146a(obj);
        }
        if (obj instanceof Boolean) {
            return bVar7.mo5146a(obj);
        }
        if (obj instanceof Object[]) {
            return bVar8.mo5146a((String[]) obj);
        }
        if (obj instanceof ArrayList) {
            return bVar9.mo5146a((ArrayList) obj);
        }
        throw new RuntimeException("Tasker doesn't support inputs of type " + obj.getClass());
    }
}
