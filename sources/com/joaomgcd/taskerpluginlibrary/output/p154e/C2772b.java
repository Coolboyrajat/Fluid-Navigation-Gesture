package com.joaomgcd.taskerpluginlibrary.output.p154e;

import android.content.Context;
import android.os.Bundle;
import com.joaomgcd.taskerpluginlibrary.output.C2767b;
import com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C3269p;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p119h.p120a.p122i.C1472a;
import p054c.p119h.p120a.p124k.C1514d;

/* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.b */
public final class C2772b extends C2767b<C2770a> {

    /* renamed from: f */
    public static final C2773a f7356f = new C2773a((C3366g) null);

    /* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.b$a */
    public static final class C2773a {

        /* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.b$a$a */
        private static final class C2774a {

            /* renamed from: a */
            private final String f7357a;

            /* renamed from: b */
            private final Integer f7358b;

            public C2774a(String str, Integer num) {
                C3370k.m12227b(str, "name");
                this.f7357a = str;
                this.f7358b = num;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2774a)) {
                    return false;
                }
                C2774a aVar = (C2774a) obj;
                return C3370k.m12225a((Object) this.f7357a, (Object) aVar.f7357a) && C3370k.m12225a((Object) this.f7358b, (Object) aVar.f7358b);
            }

            public int hashCode() {
                String str = this.f7357a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f7358b;
                if (num != null) {
                    i = num.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return "NameAndIndex(name=" + this.f7357a + ", index=" + this.f7358b + ")";
            }
        }

        /* renamed from: com.joaomgcd.taskerpluginlibrary.output.e.b$a$b */
        static final class C2775b extends C3371l implements C3350b<C2770a, String> {

            /* renamed from: g */
            final /* synthetic */ C2770a f7359g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2775b(C2770a aVar) {
                super(1);
                this.f7359g = aVar;
            }

            /* renamed from: a */
            public final String mo5146a(C2770a aVar) {
                C3370k.m12227b(aVar, "output");
                return String.valueOf(this.f7359g.mo8886k().mo8893a(aVar.mo8884i()));
            }
        }

        private C2773a() {
        }

        public /* synthetic */ C2773a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo8888a(Context context, Object obj, C2772b bVar, C1514d dVar, C3350b<? super C2770a, Boolean> bVar2) {
            C2772b bVar3 = bVar;
            C1514d dVar2 = dVar;
            C3370k.m12227b(context, "context");
            Bundle bundle = new Bundle();
            C2772b bVar4 = new C2772b();
            if (bVar3 != null) {
                bVar4.addAll(bVar3);
            }
            if (obj != null) {
                C2767b.m10928a(bVar4, context, obj.getClass(), obj, bVar2, false, (ArrayList) null, 48, (Object) null);
            }
            if (dVar2 != null) {
                dVar2.mo5998a((C2767b<?>) bVar4);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : bVar4) {
                C2770a aVar = (C2770a) next;
                C2774a aVar2 = new C2774a(aVar.mo8857d(), (aVar.mo8883h() == null || aVar.mo8883h().size() == 0) ? null : aVar.mo8883h().get(0));
                Object obj2 = linkedHashMap.get(aVar2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(aVar2, obj2);
                }
                ((List) obj2).add(next);
            }
            ArrayList<C2770a> arrayList = new ArrayList<>(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                C2770a aVar3 = (C2770a) ((List) entry.getValue()).get(0);
                if (((List) entry.getValue()).size() != 1) {
                    aVar3 = new C2770a(aVar3.mo8857d(), C3292r.m12086a((Iterable) entry.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C2775b(aVar3), 30, (Object) null));
                }
                arrayList.add(aVar3);
            }
            for (C2770a a : arrayList) {
                a.mo8882a(bundle);
            }
            return bundle;
        }
    }

    /* renamed from: a */
    public C2772b m10952a(Context context, TaskerOutputVariable taskerOutputVariable, Method method, Object obj, boolean z, boolean z2, ArrayList<Integer> arrayList) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(taskerOutputVariable, "taskerVariable");
        C3370k.m12227b(method, "method");
        C2772b bVar = new C2772b();
        if (!z) {
            bVar.add(new C2770a(context, taskerOutputVariable, new C2778e(method), obj, arrayList));
            return bVar;
        } else if (obj != null) {
            Object[] objArr = (Object[]) obj;
            int i = 0;
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                i++;
                bVar.add(new C2770a(context, taskerOutputVariable, new C2778e(method), obj2, C1472a.m6705a(arrayList, Integer.valueOf(i))));
            }
            return bVar;
        } else {
            throw new C3269p("null cannot be cast to non-null type kotlin.Array<*>");
        }
    }
}
