package p054c.p083e.p104c;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p054c.p083e.p104c.p106w.C1307c;
import p054c.p083e.p104c.p106w.C1322d;
import p054c.p083e.p104c.p106w.C1337k;
import p054c.p083e.p104c.p106w.C1338l;
import p054c.p083e.p104c.p106w.p107n.C1346a;
import p054c.p083e.p104c.p106w.p107n.C1348b;
import p054c.p083e.p104c.p106w.p107n.C1350c;
import p054c.p083e.p104c.p106w.p107n.C1352d;
import p054c.p083e.p104c.p106w.p107n.C1357g;
import p054c.p083e.p104c.p106w.p107n.C1359h;
import p054c.p083e.p104c.p106w.p107n.C1362i;
import p054c.p083e.p104c.p106w.p107n.C1366j;
import p054c.p083e.p104c.p106w.p107n.C1368k;
import p054c.p083e.p104c.p106w.p107n.C1374n;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1420b;
import p054c.p083e.p104c.p111y.C1421c;
import p054c.p083e.p104c.p111y.C1422d;

/* renamed from: c.e.c.e */
public final class C1271e {

    /* renamed from: k */
    private static final C1417a<?> f4132k = C1417a.m6529a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C1417a<?>, C1277f<?>>> f4133a;

    /* renamed from: b */
    private final Map<C1417a<?>, C1294t<?>> f4134b;

    /* renamed from: c */
    private final C1307c f4135c;

    /* renamed from: d */
    private final C1352d f4136d;

    /* renamed from: e */
    final List<C1296u> f4137e;

    /* renamed from: f */
    final boolean f4138f;

    /* renamed from: g */
    final boolean f4139g;

    /* renamed from: h */
    final boolean f4140h;

    /* renamed from: i */
    final boolean f4141i;

    /* renamed from: j */
    final boolean f4142j;

    /* renamed from: c.e.c.e$a */
    class C1272a extends C1294t<Number> {
        C1272a(C1271e eVar) {
        }

        /* renamed from: a */
        public Double m6147a(C1418a aVar) {
            if (aVar.mo5789q() != C1420b.NULL) {
                return Double.valueOf(aVar.mo5783k());
            }
            aVar.mo5787o();
            return null;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, Number number) {
            if (number == null) {
                cVar.mo5807h();
                return;
            }
            C1271e.m6126a(number.doubleValue());
            cVar.mo5798a(number);
        }
    }

    /* renamed from: c.e.c.e$b */
    class C1273b extends C1294t<Number> {
        C1273b(C1271e eVar) {
        }

        /* renamed from: a */
        public Float m6151a(C1418a aVar) {
            if (aVar.mo5789q() != C1420b.NULL) {
                return Float.valueOf((float) aVar.mo5783k());
            }
            aVar.mo5787o();
            return null;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, Number number) {
            if (number == null) {
                cVar.mo5807h();
                return;
            }
            C1271e.m6126a((double) number.floatValue());
            cVar.mo5798a(number);
        }
    }

    /* renamed from: c.e.c.e$c */
    static class C1274c extends C1294t<Number> {
        C1274c() {
        }

        /* renamed from: a */
        public Number m6155a(C1418a aVar) {
            if (aVar.mo5789q() != C1420b.NULL) {
                return Long.valueOf(aVar.mo5785m());
            }
            aVar.mo5787o();
            return null;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, Number number) {
            if (number == null) {
                cVar.mo5807h();
            } else {
                cVar.mo5802c(number.toString());
            }
        }
    }

    /* renamed from: c.e.c.e$d */
    static class C1275d extends C1294t<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C1294t f4143a;

        C1275d(C1294t tVar) {
            this.f4143a = tVar;
        }

        /* renamed from: a */
        public AtomicLong m6159a(C1418a aVar) {
            return new AtomicLong(((Number) this.f4143a.mo5644a(aVar)).longValue());
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, AtomicLong atomicLong) {
            this.f4143a.mo5646a(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: c.e.c.e$e */
    static class C1276e extends C1294t<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C1294t f4144a;

        C1276e(C1294t tVar) {
            this.f4144a = tVar;
        }

        /* renamed from: a */
        public AtomicLongArray m6163a(C1418a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo5775a();
            while (aVar.mo5781g()) {
                arrayList.add(Long.valueOf(((Number) this.f4144a.mo5644a(aVar)).longValue()));
            }
            aVar.mo5778d();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, AtomicLongArray atomicLongArray) {
            cVar.mo5795a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f4144a.mo5646a(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo5801c();
        }
    }

    /* renamed from: c.e.c.e$f */
    static class C1277f<T> extends C1294t<T> {

        /* renamed from: a */
        private C1294t<T> f4145a;

        C1277f() {
        }

        /* renamed from: a */
        public T mo5644a(C1418a aVar) {
            C1294t<T> tVar = this.f4145a;
            if (tVar != null) {
                return tVar.mo5644a(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo5651a(C1294t<T> tVar) {
            if (this.f4145a == null) {
                this.f4145a = tVar;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, T t) {
            C1294t<T> tVar = this.f4145a;
            if (tVar != null) {
                tVar.mo5646a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C1271e() {
        this(C1322d.f4173l, C1263c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C1291s.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C1271e(C1322d dVar, C1270d dVar2, Map<Type, C1278f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C1291s sVar, String str, int i, int i2, List<C1296u> list, List<C1296u> list2, List<C1296u> list3) {
        C1322d dVar3 = dVar;
        boolean z8 = z7;
        this.f4133a = new ThreadLocal<>();
        this.f4134b = new ConcurrentHashMap();
        Map<Type, C1278f<?>> map2 = map;
        this.f4135c = new C1307c(map);
        this.f4138f = z;
        this.f4139g = z3;
        this.f4140h = z4;
        this.f4141i = z5;
        this.f4142j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1374n.f4302Y);
        arrayList.add(C1359h.f4245b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C1374n.f4281D);
        arrayList.add(C1374n.f4316m);
        arrayList.add(C1374n.f4310g);
        arrayList.add(C1374n.f4312i);
        arrayList.add(C1374n.f4314k);
        C1294t<Number> a = m6123a(sVar);
        arrayList.add(C1374n.m6387a(Long.TYPE, Long.class, a));
        arrayList.add(C1374n.m6387a(Double.TYPE, Double.class, m6125a(z8)));
        arrayList.add(C1374n.m6387a(Float.TYPE, Float.class, m6129b(z8)));
        arrayList.add(C1374n.f4327x);
        arrayList.add(C1374n.f4318o);
        arrayList.add(C1374n.f4320q);
        arrayList.add(C1374n.m6386a(AtomicLong.class, m6124a(a)));
        arrayList.add(C1374n.m6386a(AtomicLongArray.class, m6128b(a)));
        arrayList.add(C1374n.f4322s);
        arrayList.add(C1374n.f4329z);
        arrayList.add(C1374n.f4283F);
        arrayList.add(C1374n.f4285H);
        arrayList.add(C1374n.m6386a(BigDecimal.class, C1374n.f4279B));
        arrayList.add(C1374n.m6386a(BigInteger.class, C1374n.f4280C));
        arrayList.add(C1374n.f4287J);
        arrayList.add(C1374n.f4289L);
        arrayList.add(C1374n.f4293P);
        arrayList.add(C1374n.f4295R);
        arrayList.add(C1374n.f4300W);
        arrayList.add(C1374n.f4291N);
        arrayList.add(C1374n.f4307d);
        arrayList.add(C1350c.f4226b);
        arrayList.add(C1374n.f4298U);
        arrayList.add(C1368k.f4266b);
        arrayList.add(C1366j.f4264b);
        arrayList.add(C1374n.f4296S);
        arrayList.add(C1346a.f4220c);
        arrayList.add(C1374n.f4305b);
        arrayList.add(new C1348b(this.f4135c));
        boolean z9 = z2;
        arrayList.add(new C1357g(this.f4135c, z2));
        this.f4136d = new C1352d(this.f4135c);
        arrayList.add(this.f4136d);
        arrayList.add(C1374n.f4303Z);
        C1270d dVar4 = dVar2;
        arrayList.add(new C1362i(this.f4135c, dVar2, dVar, this.f4136d));
        this.f4137e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C1294t<Number> m6123a(C1291s sVar) {
        return sVar == C1291s.DEFAULT ? C1374n.f4323t : new C1274c();
    }

    /* renamed from: a */
    private static C1294t<AtomicLong> m6124a(C1294t<Number> tVar) {
        return new C1275d(tVar).mo5687a();
    }

    /* renamed from: a */
    private C1294t<Number> m6125a(boolean z) {
        return z ? C1374n.f4325v : new C1272a(this);
    }

    /* renamed from: a */
    static void m6126a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: a */
    private static void m6127a(Object obj, C1418a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo5789q() != C1420b.END_DOCUMENT) {
                    throw new C1283k("JSON document was not fully consumed.");
                }
            } catch (C1422d e) {
                throw new C1290r((Throwable) e);
            } catch (IOException e2) {
                throw new C1283k((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C1294t<AtomicLongArray> m6128b(C1294t<Number> tVar) {
        return new C1276e(tVar).mo5687a();
    }

    /* renamed from: b */
    private C1294t<Number> m6129b(boolean z) {
        return z ? C1374n.f4324u : new C1273b(this);
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5627a(C1296u uVar, C1417a<T> aVar) {
        if (!this.f4137e.contains(uVar)) {
            uVar = this.f4136d;
        }
        boolean z = false;
        for (C1296u next : this.f4137e) {
            if (z) {
                C1294t<T> a = next.mo5688a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (next == uVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5628a(C1417a<T> aVar) {
        C1294t<T> tVar = this.f4134b.get(aVar == null ? f4132k : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map map = this.f4133a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f4133a.set(map);
            z = true;
        }
        C1277f fVar = (C1277f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C1277f fVar2 = new C1277f();
            map.put(aVar, fVar2);
            for (C1296u a : this.f4137e) {
                C1294t<T> a2 = a.mo5688a(this, aVar);
                if (a2 != null) {
                    fVar2.mo5651a(a2);
                    this.f4134b.put(aVar, a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f4133a.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5629a(Class<T> cls) {
        return mo5628a(C1417a.m6529a(cls));
    }

    /* renamed from: a */
    public C1418a mo5630a(Reader reader) {
        C1418a aVar = new C1418a(reader);
        aVar.mo5860a(this.f4142j);
        return aVar;
    }

    /* renamed from: a */
    public C1421c mo5631a(Writer writer) {
        if (this.f4139g) {
            writer.write(")]}'\n");
        }
        C1421c cVar = new C1421c(writer);
        if (this.f4141i) {
            cVar.mo5865b("  ");
        }
        cVar.mo5867c(this.f4138f);
        return cVar;
    }

    /* renamed from: a */
    public <T> T mo5632a(C1418a aVar, Type type) {
        boolean h = aVar.mo5862h();
        aVar.mo5860a(true);
        try {
            aVar.mo5789q();
            T a = mo5628a(C1417a.m6530a(type)).mo5644a(aVar);
            aVar.mo5860a(h);
            return a;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo5860a(h);
                return null;
            }
            throw new C1290r((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C1290r((Throwable) e2);
        } catch (IOException e3) {
            throw new C1290r((Throwable) e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            aVar.mo5860a(h);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo5633a(Reader reader, Type type) {
        C1418a a = mo5630a(reader);
        T a2 = mo5632a(a, type);
        m6127a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    public <T> T mo5634a(String str, Class<T> cls) {
        return C1337k.m6282a(cls).cast(mo5635a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo5635a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo5633a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public String mo5636a(C1282j jVar) {
        StringWriter stringWriter = new StringWriter();
        mo5640a(jVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public String mo5637a(Object obj) {
        return obj == null ? mo5636a((C1282j) C1284l.f4147a) : mo5638a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo5638a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo5642a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo5639a(C1282j jVar, C1421c cVar) {
        boolean g = cVar.mo5870g();
        cVar.mo5866b(true);
        boolean f = cVar.mo5869f();
        cVar.mo5864a(this.f4140h);
        boolean e = cVar.mo5868e();
        cVar.mo5867c(this.f4138f);
        try {
            C1338l.m6287a(jVar, cVar);
            cVar.mo5866b(g);
            cVar.mo5864a(f);
            cVar.mo5867c(e);
        } catch (IOException e2) {
            throw new C1283k((Throwable) e2);
        } catch (AssertionError e3) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
        } catch (Throwable th) {
            cVar.mo5866b(g);
            cVar.mo5864a(f);
            cVar.mo5867c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo5640a(C1282j jVar, Appendable appendable) {
        try {
            mo5639a(jVar, mo5631a(C1338l.m6286a(appendable)));
        } catch (IOException e) {
            throw new C1283k((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo5641a(Object obj, Type type, C1421c cVar) {
        C1294t<?> a = mo5628a(C1417a.m6530a(type));
        boolean g = cVar.mo5870g();
        cVar.mo5866b(true);
        boolean f = cVar.mo5869f();
        cVar.mo5864a(this.f4140h);
        boolean e = cVar.mo5868e();
        cVar.mo5867c(this.f4138f);
        try {
            a.mo5646a(cVar, obj);
            cVar.mo5866b(g);
            cVar.mo5864a(f);
            cVar.mo5867c(e);
        } catch (IOException e2) {
            throw new C1283k((Throwable) e2);
        } catch (AssertionError e3) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e3.getMessage(), e3);
        } catch (Throwable th) {
            cVar.mo5866b(g);
            cVar.mo5864a(f);
            cVar.mo5867c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo5642a(Object obj, Type type, Appendable appendable) {
        try {
            mo5641a(obj, type, mo5631a(C1338l.m6286a(appendable)));
        } catch (IOException e) {
            throw new C1283k((Throwable) e);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f4138f + ",factories:" + this.f4137e + ",instanceCreators:" + this.f4135c + "}";
    }
}
