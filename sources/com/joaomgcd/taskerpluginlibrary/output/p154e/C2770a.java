package com.joaomgcd.taskerpluginlibrary.output.p154e;

import android.content.Context;
import android.os.Bundle;
import com.joaomgcd.taskerpluginlibrary.output.C2766a;
import com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable;
import java.util.ArrayList;
import kotlin.C3269p;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.a */
public class C2770a extends C2766a {
    @Deprecated

    /* renamed from: i */
    public static final C2771a f7352i = new C2771a((C3366g) null);

    /* renamed from: f */
    private final C2776c f7353f;

    /* renamed from: g */
    private final Object f7354g;

    /* renamed from: h */
    private final ArrayList<Integer> f7355h;

    /* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.a$a */
    private static final class C2771a {
        private C2771a() {
        }

        public /* synthetic */ C2771a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo8887a(String str, ArrayList<Integer> arrayList) {
            C3370k.m12227b(str, "name");
            if (arrayList == null || arrayList.size() == 0) {
                return str;
            }
            return str + arrayList.get(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2770a(Context context, TaskerOutputVariable taskerOutputVariable, C2776c cVar, Object obj, ArrayList<Integer> arrayList) {
        this(taskerOutputVariable.name(), cVar, obj, taskerOutputVariable.minApi(), taskerOutputVariable.maxApi(), arrayList);
        C3370k.m12227b(context, "context");
        C3370k.m12227b(taskerOutputVariable, "taskerVariable");
        C3370k.m12227b(cVar, "valueGetter");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2770a(String str, C2776c cVar, Object obj, int i, int i2, ArrayList<Integer> arrayList) {
        super(f7352i.mo8887a(str, arrayList), cVar.mo8894a(), i, i2, false, 16, (C3366g) null);
        C3370k.m12227b(str, "nameNoSuffix");
        C3370k.m12227b(cVar, "valueGetter");
        this.f7353f = cVar;
        this.f7354g = obj;
        this.f7355h = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2770a(String str, C2776c cVar, Object obj, int i, int i2, ArrayList arrayList, int i3, C3366g gVar) {
        this(str, cVar, (i3 & 4) != 0 ? null : obj, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? null : arrayList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2770a(String str, String str2) {
        this(str, new C2777d(str2), (Object) null, 0, 0, (ArrayList) null, 60, (C3366g) null);
        C3370k.m12227b(str, "nameNoSuffix");
    }

    /* renamed from: a */
    private final String[] m10944a(Object obj) {
        Object[] objArr;
        if (!mo8860g()) {
            objArr = new Object[]{obj};
        } else if (obj != null) {
            objArr = (Object[]) obj;
        } else {
            throw new C3269p("null cannot be cast to non-null type kotlin.Array<*>");
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object valueOf : objArr) {
            arrayList.add(String.valueOf(valueOf));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public final void mo8882a(Bundle bundle) {
        String str;
        C3370k.m12227b(bundle, "bundle");
        Object j = mo8885j();
        if (j != null) {
            String[] a = m10944a(j);
            if (!(a.length == 0)) {
                String f = mo8859f();
                int length = a.length;
                for (int i = 0; i < length; i++) {
                    if (mo8860g()) {
                        str = f + (i + 1);
                    } else {
                        str = f;
                    }
                    bundle.putString('%' + str, a[i]);
                }
            }
        }
    }

    /* renamed from: h */
    public final ArrayList<Integer> mo8883h() {
        return this.f7355h;
    }

    /* renamed from: i */
    public final Object mo8884i() {
        return this.f7354g;
    }

    /* renamed from: j */
    public final Object mo8885j() {
        return this.f7353f.mo8893a(this.f7354g);
    }

    /* renamed from: k */
    public final C2776c mo8886k() {
        return this.f7353f;
    }
}
