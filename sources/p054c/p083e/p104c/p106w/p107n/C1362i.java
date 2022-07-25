package p054c.p083e.p104c.p106w.p107n;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p054c.p083e.p104c.C1270d;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1290r;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p105v.C1298b;
import p054c.p083e.p104c.p105v.C1299c;
import p054c.p083e.p104c.p106w.C1303b;
import p054c.p083e.p104c.p106w.C1307c;
import p054c.p083e.p104c.p106w.C1322d;
import p054c.p083e.p104c.p106w.C1335i;
import p054c.p083e.p104c.p106w.C1337k;
import p054c.p083e.p104c.p106w.p109o.C1415b;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.n.i */
public final class C1362i implements C1296u {

    /* renamed from: f */
    private final C1307c f4248f;

    /* renamed from: g */
    private final C1270d f4249g;

    /* renamed from: h */
    private final C1322d f4250h;

    /* renamed from: i */
    private final C1352d f4251i;

    /* renamed from: j */
    private final C1415b f4252j = C1415b.m6523a();

    /* renamed from: c.e.c.w.n.i$a */
    class C1363a extends C1365c {

        /* renamed from: d */
        final /* synthetic */ Field f4253d;

        /* renamed from: e */
        final /* synthetic */ boolean f4254e;

        /* renamed from: f */
        final /* synthetic */ C1294t f4255f;

        /* renamed from: g */
        final /* synthetic */ C1271e f4256g;

        /* renamed from: h */
        final /* synthetic */ C1417a f4257h;

        /* renamed from: i */
        final /* synthetic */ boolean f4258i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1363a(C1362i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C1294t tVar, C1271e eVar, C1417a aVar, boolean z4) {
            super(str, z, z2);
            this.f4253d = field;
            this.f4254e = z3;
            this.f4255f = tVar;
            this.f4256g = eVar;
            this.f4257h = aVar;
            this.f4258i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5814a(C1418a aVar, Object obj) {
            Object a = this.f4255f.mo5644a(aVar);
            if (a != null || !this.f4258i) {
                this.f4253d.set(obj, a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5815a(C1421c cVar, Object obj) {
            (this.f4254e ? this.f4255f : new C1373m(this.f4256g, this.f4255f, this.f4257h.mo5856b())).mo5646a(cVar, this.f4253d.get(obj));
        }

        /* renamed from: a */
        public boolean mo5816a(Object obj) {
            return this.f4262b && this.f4253d.get(obj) != obj;
        }
    }

    /* renamed from: c.e.c.w.n.i$b */
    public static final class C1364b<T> extends C1294t<T> {

        /* renamed from: a */
        private final C1335i<T> f4259a;

        /* renamed from: b */
        private final Map<String, C1365c> f4260b;

        C1364b(C1335i<T> iVar, Map<String, C1365c> map) {
            this.f4259a = iVar;
            this.f4260b = map;
        }

        /* renamed from: a */
        public T mo5644a(C1418a aVar) {
            if (aVar.mo5789q() == C1420b.NULL) {
                aVar.mo5787o();
                return null;
            }
            T a = this.f4259a.mo5714a();
            try {
                aVar.mo5776b();
                while (aVar.mo5781g()) {
                    C1365c cVar = this.f4260b.get(aVar.mo5786n());
                    if (cVar != null) {
                        if (cVar.f4263c) {
                            cVar.mo5814a(aVar, (Object) a);
                        }
                    }
                    aVar.mo5790r();
                }
                aVar.mo5779e();
                return a;
            } catch (IllegalStateException e) {
                throw new C1290r((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, T t) {
            if (t == null) {
                cVar.mo5807h();
                return;
            }
            cVar.mo5800b();
            try {
                for (C1365c next : this.f4260b.values()) {
                    if (next.mo5816a(t)) {
                        cVar.mo5799a(next.f4261a);
                        next.mo5815a(cVar, (Object) t);
                    }
                }
                cVar.mo5804d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: c.e.c.w.n.i$c */
    static abstract class C1365c {

        /* renamed from: a */
        final String f4261a;

        /* renamed from: b */
        final boolean f4262b;

        /* renamed from: c */
        final boolean f4263c;

        protected C1365c(String str, boolean z, boolean z2) {
            this.f4261a = str;
            this.f4262b = z;
            this.f4263c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo5814a(C1418a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo5815a(C1421c cVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo5816a(Object obj);
    }

    public C1362i(C1307c cVar, C1270d dVar, C1322d dVar2, C1352d dVar3) {
        this.f4248f = cVar;
        this.f4249g = dVar;
        this.f4250h = dVar2;
        this.f4251i = dVar3;
    }

    /* renamed from: a */
    private C1365c m6356a(C1271e eVar, Field field, String str, C1417a<?> aVar, boolean z, boolean z2) {
        C1271e eVar2 = eVar;
        C1417a<?> aVar2 = aVar;
        boolean a = C1337k.m6284a((Type) aVar.mo5855a());
        Field field2 = field;
        C1298b bVar = (C1298b) field.getAnnotation(C1298b.class);
        C1294t<?> a2 = bVar != null ? this.f4251i.mo5774a(this.f4248f, eVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = eVar.mo5628a(aVar2);
        }
        return new C1363a(this, str, z, z2, field, z3, a2, eVar, aVar, a);
    }

    /* renamed from: a */
    private List<String> m6357a(Field field) {
        C1299c cVar = (C1299c) field.getAnnotation(C1299c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f4249g.mo5626a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, C1365c> m6358a(C1271e eVar, C1417a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.mo5856b();
        C1417a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo5813a(field, true);
                boolean a2 = mo5813a(field, z);
                if (a || a2) {
                    this.f4252j.mo5853a(field);
                    Type a3 = C1303b.m6211a(aVar2.mo5856b(), (Class<?>) cls2, field.getGenericType());
                    List<String> a4 = m6357a(field);
                    int size = a4.size();
                    C1365c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        C1365c cVar2 = cVar;
                        int i3 = i2;
                        int i4 = size;
                        List<String> list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C1365c) linkedHashMap.put(str2, m6356a(eVar, field, str2, C1417a.m6530a(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C1365c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(b + " declares multiple JSON fields named " + cVar3.f4261a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C1417a.m6530a(C1303b.m6211a(aVar2.mo5856b(), (Class<?>) cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo5855a();
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static boolean m6359a(Field field, boolean z, C1322d dVar) {
        return !dVar.mo5715a(field.getType(), z) && !dVar.mo5716a(field, z);
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
        Class<? super T> a = aVar.mo5855a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new C1364b(this.f4248f.mo5712a(aVar), m6358a(eVar, (C1417a<?>) aVar, (Class<?>) a));
    }

    /* renamed from: a */
    public boolean mo5813a(Field field, boolean z) {
        return m6359a(field, z, this.f4250h);
    }
}
