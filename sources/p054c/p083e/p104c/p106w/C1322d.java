package p054c.p083e.p104c.p106w;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p054c.p083e.p104c.C1261a;
import p054c.p083e.p104c.C1262b;
import p054c.p083e.p104c.C1271e;
import p054c.p083e.p104c.C1294t;
import p054c.p083e.p104c.C1296u;
import p054c.p083e.p104c.p105v.C1297a;
import p054c.p083e.p104c.p105v.C1300d;
import p054c.p083e.p104c.p105v.C1301e;
import p054c.p083e.p104c.p110x.C1417a;
import p054c.p083e.p104c.p111y.C1418a;
import p054c.p083e.p104c.p111y.C1421c;

/* renamed from: c.e.c.w.d */
public final class C1322d implements C1296u, Cloneable {

    /* renamed from: l */
    public static final C1322d f4173l = new C1322d();

    /* renamed from: f */
    private double f4174f = -1.0d;

    /* renamed from: g */
    private int f4175g = 136;

    /* renamed from: h */
    private boolean f4176h = true;

    /* renamed from: i */
    private boolean f4177i;

    /* renamed from: j */
    private List<C1261a> f4178j = Collections.emptyList();

    /* renamed from: k */
    private List<C1261a> f4179k = Collections.emptyList();

    /* renamed from: c.e.c.w.d$a */
    class C1323a extends C1294t<T> {

        /* renamed from: a */
        private C1294t<T> f4180a;

        /* renamed from: b */
        final /* synthetic */ boolean f4181b;

        /* renamed from: c */
        final /* synthetic */ boolean f4182c;

        /* renamed from: d */
        final /* synthetic */ C1271e f4183d;

        /* renamed from: e */
        final /* synthetic */ C1417a f4184e;

        C1323a(boolean z, boolean z2, C1271e eVar, C1417a aVar) {
            this.f4181b = z;
            this.f4182c = z2;
            this.f4183d = eVar;
            this.f4184e = aVar;
        }

        /* renamed from: b */
        private C1294t<T> m6254b() {
            C1294t<T> tVar = this.f4180a;
            if (tVar != null) {
                return tVar;
            }
            C1294t<T> a = this.f4183d.mo5627a((C1296u) C1322d.this, this.f4184e);
            this.f4180a = a;
            return a;
        }

        /* renamed from: a */
        public T mo5644a(C1418a aVar) {
            if (!this.f4181b) {
                return m6254b().mo5644a(aVar);
            }
            aVar.mo5790r();
            return null;
        }

        /* renamed from: a */
        public void mo5646a(C1421c cVar, T t) {
            if (this.f4182c) {
                cVar.mo5807h();
            } else {
                m6254b().mo5646a(cVar, t);
            }
        }
    }

    /* renamed from: a */
    private boolean m6243a(C1300d dVar) {
        return dVar == null || dVar.value() <= this.f4174f;
    }

    /* renamed from: a */
    private boolean m6244a(C1300d dVar, C1301e eVar) {
        return m6243a(dVar) && m6245a(eVar);
    }

    /* renamed from: a */
    private boolean m6245a(C1301e eVar) {
        return eVar == null || eVar.value() > this.f4174f;
    }

    /* renamed from: a */
    private boolean m6246a(Class<?> cls) {
        if (this.f4174f == -1.0d || m6244a((C1300d) cls.getAnnotation(C1300d.class), (C1301e) cls.getAnnotation(C1301e.class))) {
            return (!this.f4176h && m6249c(cls)) || m6247b(cls);
        }
        return true;
    }

    /* renamed from: b */
    private boolean m6247b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: b */
    private boolean m6248b(Class<?> cls, boolean z) {
        for (C1261a a : z ? this.f4178j : this.f4179k) {
            if (a.mo5625a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m6249c(Class<?> cls) {
        return cls.isMemberClass() && !m6250d(cls);
    }

    /* renamed from: d */
    private boolean m6250d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> C1294t<T> mo5688a(C1271e eVar, C1417a<T> aVar) {
        Class<? super T> a = aVar.mo5855a();
        boolean a2 = m6246a((Class<?>) a);
        boolean z = a2 || m6248b(a, true);
        boolean z2 = a2 || m6248b(a, false);
        if (z || z2) {
            return new C1323a(z2, z, eVar, aVar);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo5715a(Class<?> cls, boolean z) {
        return m6246a(cls) || m6248b(cls, z);
    }

    /* renamed from: a */
    public boolean mo5716a(Field field, boolean z) {
        C1297a aVar;
        if ((this.f4175g & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4174f != -1.0d && !m6244a((C1300d) field.getAnnotation(C1300d.class), (C1301e) field.getAnnotation(C1301e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f4177i && ((aVar = (C1297a) field.getAnnotation(C1297a.class)) == null || (!z ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f4176h && m6249c(field.getType())) || m6247b(field.getType())) {
            return true;
        }
        List<C1261a> list = z ? this.f4178j : this.f4179k;
        if (list.isEmpty()) {
            return false;
        }
        C1262b bVar = new C1262b(field);
        for (C1261a a : list) {
            if (a.mo5624a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public C1322d clone() {
        try {
            return (C1322d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
