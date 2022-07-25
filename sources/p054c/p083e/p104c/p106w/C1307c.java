package p054c.p083e.p104c.p106w;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p054c.p083e.p104c.C1278f;
import p054c.p083e.p104c.C1283k;
import p054c.p083e.p104c.p106w.p109o.C1415b;
import p054c.p083e.p104c.p110x.C1417a;

/* renamed from: c.e.c.w.c */
public final class C1307c {

    /* renamed from: a */
    private final Map<Type, C1278f<?>> f4162a;

    /* renamed from: b */
    private final C1415b f4163b = C1415b.m6523a();

    /* renamed from: c.e.c.w.c$a */
    class C1308a implements C1335i<T> {
        C1308a(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: c.e.c.w.c$b */
    class C1309b implements C1335i<T> {
        C1309b(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new TreeMap();
        }
    }

    /* renamed from: c.e.c.w.c$c */
    class C1310c implements C1335i<T> {
        C1310c(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: c.e.c.w.c$d */
    class C1311d implements C1335i<T> {
        C1311d(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new C1327h();
        }
    }

    /* renamed from: c.e.c.w.c$e */
    class C1312e implements C1335i<T> {

        /* renamed from: a */
        private final C1341m f4164a = C1341m.m6288a();

        /* renamed from: b */
        final /* synthetic */ Class f4165b;

        /* renamed from: c */
        final /* synthetic */ Type f4166c;

        C1312e(C1307c cVar, Class cls, Type type) {
            this.f4165b = cls;
            this.f4166c = type;
        }

        /* renamed from: a */
        public T mo5714a() {
            try {
                return this.f4164a.mo5771a(this.f4165b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f4166c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: c.e.c.w.c$f */
    class C1313f implements C1335i<T> {

        /* renamed from: a */
        final /* synthetic */ C1278f f4167a;

        /* renamed from: b */
        final /* synthetic */ Type f4168b;

        C1313f(C1307c cVar, C1278f fVar, Type type) {
            this.f4167a = fVar;
            this.f4168b = type;
        }

        /* renamed from: a */
        public T mo5714a() {
            return this.f4167a.mo5652a(this.f4168b);
        }
    }

    /* renamed from: c.e.c.w.c$g */
    class C1314g implements C1335i<T> {

        /* renamed from: a */
        final /* synthetic */ C1278f f4169a;

        /* renamed from: b */
        final /* synthetic */ Type f4170b;

        C1314g(C1307c cVar, C1278f fVar, Type type) {
            this.f4169a = fVar;
            this.f4170b = type;
        }

        /* renamed from: a */
        public T mo5714a() {
            return this.f4169a.mo5652a(this.f4170b);
        }
    }

    /* renamed from: c.e.c.w.c$h */
    class C1315h implements C1335i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f4171a;

        C1315h(C1307c cVar, Constructor constructor) {
            this.f4171a = constructor;
        }

        /* renamed from: a */
        public T mo5714a() {
            try {
                return this.f4171a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f4171a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f4171a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: c.e.c.w.c$i */
    class C1316i implements C1335i<T> {
        C1316i(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new TreeSet();
        }
    }

    /* renamed from: c.e.c.w.c$j */
    class C1317j implements C1335i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f4172a;

        C1317j(C1307c cVar, Type type) {
            this.f4172a = type;
        }

        /* renamed from: a */
        public T mo5714a() {
            Type type = this.f4172a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C1283k("Invalid EnumSet type: " + this.f4172a.toString());
            }
            throw new C1283k("Invalid EnumSet type: " + this.f4172a.toString());
        }
    }

    /* renamed from: c.e.c.w.c$k */
    class C1318k implements C1335i<T> {
        C1318k(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: c.e.c.w.c$l */
    class C1319l implements C1335i<T> {
        C1319l(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: c.e.c.w.c$m */
    class C1320m implements C1335i<T> {
        C1320m(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new ArrayList();
        }
    }

    /* renamed from: c.e.c.w.c$n */
    class C1321n implements C1335i<T> {
        C1321n(C1307c cVar) {
        }

        /* renamed from: a */
        public T mo5714a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C1307c(Map<Type, C1278f<?>> map) {
        this.f4162a = map;
    }

    /* renamed from: a */
    private <T> C1335i<T> m6225a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f4163b.mo5853a(declaredConstructor);
            }
            return new C1315h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C1335i<T> m6226a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C1316i(this) : EnumSet.class.isAssignableFrom(cls) ? new C1317j(this, type) : Set.class.isAssignableFrom(cls) ? new C1318k(this) : Queue.class.isAssignableFrom(cls) ? new C1319l(this) : new C1320m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C1321n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new C1308a(this) : SortedMap.class.isAssignableFrom(cls) ? new C1309b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C1417a.m6530a(((ParameterizedType) type).getActualTypeArguments()[0]).mo5855a())) ? new C1311d(this) : new C1310c(this);
        }
        return null;
    }

    /* renamed from: b */
    private <T> C1335i<T> m6227b(Type type, Class<? super T> cls) {
        return new C1312e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C1335i<T> mo5712a(C1417a<T> aVar) {
        Type b = aVar.mo5856b();
        Class<? super T> a = aVar.mo5855a();
        C1278f fVar = this.f4162a.get(b);
        if (fVar != null) {
            return new C1313f(this, fVar, b);
        }
        C1278f fVar2 = this.f4162a.get(a);
        if (fVar2 != null) {
            return new C1314g(this, fVar2, b);
        }
        C1335i<T> a2 = m6225a(a);
        if (a2 != null) {
            return a2;
        }
        C1335i<T> a3 = m6226a(b, a);
        return a3 != null ? a3 : m6227b(b, a);
    }

    public String toString() {
        return this.f4162a.toString();
    }
}
