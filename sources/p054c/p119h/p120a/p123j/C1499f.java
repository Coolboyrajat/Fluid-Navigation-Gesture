package p054c.p119h.p120a.p123j;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.C3261j;
import kotlin.Unit;
import kotlin.p205x.p207d.C3370k;
import p054c.p119h.p120a.p122i.C1472a;

/* renamed from: c.h.a.j.f */
public final class C1499f extends ArrayList<C1485c> {

    /* renamed from: f */
    public static final C1500a f4528f = new C1500a((C3366g) null);

    /* renamed from: c.h.a.j.f$a */
    public static final class C1500a {
        private C1500a() {
        }

        public /* synthetic */ C1500a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1499f mo5976a(Context context, C1483a<?> aVar) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(aVar, "input");
            C1499f a = mo5977a(context, (Object) aVar.mo5945b());
            a.addAll(aVar.mo5944a());
            return a;
        }

        /* renamed from: a */
        public final C1499f mo5977a(Context context, Object obj) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(obj, "input");
            C1499f fVar = new C1499f();
            C1499f.m6766a(fVar, context, obj, (String) null, 4, (Object) null);
            return fVar;
        }

        /* renamed from: a */
        public final C1499f mo5978a(Context context, Object obj, Bundle bundle) {
            C3370k.m12227b(context, "context");
            C3370k.m12227b(obj, "input");
            C3370k.m12227b(bundle, "bundle");
            C1499f<C1485c> a = mo5977a(context, obj);
            for (C1485c cVar : a) {
                cVar.mo5950a(bundle.get(cVar.mo5952b()));
            }
            Set<String> keySet = bundle.keySet();
            C3370k.m12223a((Object) keySet, "bundle.keySet()");
            for (String str : keySet) {
                Object obj2 = bundle.get(str);
                if (obj2 != null) {
                    C3370k.m12223a((Object) str, "key");
                    a.add(new C1485c(str, (String) null, (String) null, true, obj2, 0, 32, (C3366g) null));
                }
            }
            return a;
        }
    }

    /* renamed from: a */
    private final String m6765a(Context context, int i) {
        if (i == -1) {
            return null;
        }
        return context.getString(i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6766a(C1499f fVar, Context context, Object obj, String str, int i, Object obj2) {
        if ((i & 4) != 0) {
            str = null;
        }
        fVar.mo5966a(context, obj, str);
    }

    /* renamed from: a */
    public /* bridge */ int mo5964a() {
        return super.size();
    }

    /* renamed from: a */
    public final List<C1485c> mo5965a(Bundle bundle) {
        C3370k.m12227b(bundle, "bundle");
        ArrayList arrayList = new ArrayList();
        for (Object next : this) {
            C1485c cVar = (C1485c) next;
            if (C1472a.m6709a(bundle, cVar.mo5952b(), cVar.mo5954d())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo5966a(Context context, Object obj, String str) {
        String key;
        String str2;
        Context context2 = context;
        Object obj2 = obj;
        String str3 = str;
        C3370k.m12227b(context2, "context");
        C3370k.m12227b(obj2, "taskerPluginInput");
        Class<?> cls = obj.getClass();
        if (!C3370k.m12225a((Object) cls, (Object) Unit.class)) {
            if (cls.isAnnotationPresent(C1502h.class) || cls.isAnnotationPresent(C1501g.class)) {
                Field[] declaredFields = cls.getDeclaredFields();
                C3370k.m12223a((Object) declaredFields, "fields");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(C1484b.class)) {
                        arrayList.add(field);
                    } else {
                        arrayList2.add(field);
                    }
                }
                C3261j jVar = new C3261j(arrayList, arrayList2);
                List<Field> list = (List) jVar.mo9934a();
                List list2 = (List) jVar.mo9935b();
                ArrayList arrayList3 = new ArrayList(C3285k.m12075a(list, 10));
                for (Field field2 : list) {
                    C1484b bVar = (C1484b) field2.getAnnotation(C1484b.class);
                    String key2 = bVar.key();
                    if (str3 != null) {
                        str2 = str3 + '.' + key2;
                    } else {
                        str2 = key2;
                    }
                    String a = m6765a(context2, bVar.labelResId());
                    if (a == null) {
                        a = str2;
                    }
                    String a2 = m6765a(context2, bVar.descriptionResId());
                    boolean ignoreInStringBlurb = bVar.ignoreInStringBlurb();
                    C3370k.m12223a((Object) field2, "method");
                    C1496e eVar = r2;
                    C1496e eVar2 = new C1496e(str2, a, a2, ignoreInStringBlurb, obj, field2, 0, 64, (C3366g) null);
                    arrayList3.add(eVar);
                    str3 = str;
                }
                addAll(arrayList3);
                ArrayList<Field> arrayList4 = new ArrayList<>();
                for (Object next : list2) {
                    Field field3 = (Field) next;
                    C3370k.m12223a((Object) field3, "it");
                    if (field3.getType().isAnnotationPresent(C1501g.class)) {
                        arrayList4.add(next);
                    }
                }
                for (Field field4 : arrayList4) {
                    C3370k.m12223a((Object) field4, "method");
                    C1501g gVar = (C1501g) field4.getType().getAnnotation(C1501g.class);
                    field4.setAccessible(true);
                    Object obj3 = field4.get(obj2);
                    if (obj3 != null) {
                        String key3 = gVar.key();
                        C1501g gVar2 = (C1501g) field4.getAnnotation(C1501g.class);
                        if (!(gVar2 == null || (key = gVar2.key()) == null)) {
                            key3 = key3 + '.' + key;
                        }
                        mo5966a(context2, obj3, key3);
                    }
                }
                return;
            }
            throw new RuntimeException("Input types must be annotated by either TaskerInputRoot or TaskerInputObject. " + cls + " has none.");
        }
    }

    /* renamed from: a */
    public /* bridge */ boolean mo5967a(C1485c cVar) {
        return super.contains(cVar);
    }

    /* renamed from: b */
    public /* bridge */ int mo5968b(C1485c cVar) {
        return super.indexOf(cVar);
    }

    /* renamed from: c */
    public /* bridge */ int mo5969c(C1485c cVar) {
        return super.lastIndexOf(cVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1485c) {
            return mo5967a((C1485c) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean mo5971d(C1485c cVar) {
        return super.remove(cVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1485c) {
            return mo5968b((C1485c) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1485c) {
            return mo5969c((C1485c) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C1485c) {
            return mo5971d((C1485c) obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return mo5964a();
    }
}
