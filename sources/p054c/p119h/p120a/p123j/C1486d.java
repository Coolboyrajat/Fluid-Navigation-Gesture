package p054c.p119h.p120a.p123j;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p119h.p120a.C1459g;

/* renamed from: c.h.a.j.d */
public class C1486d extends C1485c {

    /* renamed from: e */
    private final C3349a<Object> f4513e;

    /* renamed from: f */
    private final C3350b<Object, Unit> f4514f;

    /* renamed from: c.h.a.j.d$a */
    static final class C1487a extends C3371l implements C3350b<Object, Boolean> {

        /* renamed from: g */
        public static final C1487a f4515g = new C1487a();

        C1487a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m6746a(Object obj) {
            return true;
        }
    }

    /* renamed from: c.h.a.j.d$b */
    static final class C1488b extends C3371l implements C3350b<String, Boolean> {

        /* renamed from: g */
        public static final C1488b f4516g = new C1488b();

        C1488b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5956a((String) obj));
        }

        /* renamed from: a */
        public final boolean mo5956a(String str) {
            C3370k.m12227b(str, "it");
            return str.length() == 0;
        }
    }

    /* renamed from: c.h.a.j.d$c */
    static final class C1489c extends C3371l implements C3350b<Integer, Boolean> {

        /* renamed from: g */
        public static final C1489c f4517g = new C1489c();

        C1489c() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5957a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        public final boolean mo5957a(int i) {
            return false;
        }
    }

    /* renamed from: c.h.a.j.d$d */
    static final class C1490d extends C3371l implements C3350b<Long, Boolean> {

        /* renamed from: g */
        public static final C1490d f4518g = new C1490d();

        C1490d() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5958a(((Number) obj).longValue()));
        }

        /* renamed from: a */
        public final boolean mo5958a(long j) {
            return false;
        }
    }

    /* renamed from: c.h.a.j.d$e */
    static final class C1491e extends C3371l implements C3350b<Float, Boolean> {

        /* renamed from: g */
        public static final C1491e f4519g = new C1491e();

        C1491e() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5959a(((Number) obj).floatValue()));
        }

        /* renamed from: a */
        public final boolean mo5959a(float f) {
            return false;
        }
    }

    /* renamed from: c.h.a.j.d$f */
    static final class C1492f extends C3371l implements C3350b<Double, Boolean> {

        /* renamed from: g */
        public static final C1492f f4520g = new C1492f();

        C1492f() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5960a(((Number) obj).doubleValue()));
        }

        /* renamed from: a */
        public final boolean mo5960a(double d) {
            return false;
        }
    }

    /* renamed from: c.h.a.j.d$g */
    static final class C1493g extends C3371l implements C3350b<Boolean, Boolean> {

        /* renamed from: g */
        public static final C1493g f4521g = new C1493g();

        C1493g() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5961a(((Boolean) obj).booleanValue()));
        }

        /* renamed from: a */
        public final boolean mo5961a(boolean z) {
            return false;
        }
    }

    /* renamed from: c.h.a.j.d$h */
    static final class C1494h extends C3371l implements C3350b<String[], Boolean> {

        /* renamed from: g */
        public static final C1494h f4522g = new C1494h();

        C1494h() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5962a((String[]) obj));
        }

        /* renamed from: a */
        public final boolean mo5962a(String[] strArr) {
            C3370k.m12227b(strArr, "it");
            return false;
        }
    }

    /* renamed from: c.h.a.j.d$i */
    static final class C1495i extends C3371l implements C3350b<ArrayList<String>, Boolean> {

        /* renamed from: g */
        public static final C1495i f4523g = new C1495i();

        C1495i() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5963a((ArrayList<String>) (ArrayList) obj));
        }

        /* renamed from: a */
        public final boolean mo5963a(ArrayList<String> arrayList) {
            C3370k.m12227b(arrayList, "it");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1486d(String str, String str2, String str3, boolean z, C3349a<? extends Object> aVar, C3350b<Object, Unit> bVar, int i) {
        super(str, str2, str3, z, (Object) null, i);
        C3370k.m12227b(str, "key");
        C3370k.m12227b(aVar, "getter");
        this.f4513e = aVar;
        this.f4514f = bVar;
    }

    /* renamed from: a */
    public void mo5950a(Object obj) {
        if (obj != null && !mo5955b(obj)) {
            try {
                C3350b<Object, Unit> bVar = this.f4514f;
                if (bVar != null) {
                    Unit a = bVar.mo5146a(obj);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo5955b(Object obj) {
        return ((Boolean) C1459g.m6668a(obj, C1487a.f4515g, C1488b.f4516g, C1489c.f4517g, C1490d.f4518g, C1491e.f4519g, C1492f.f4520g, C1493g.f4521g, C1494h.f4522g, C1495i.f4523g)).booleanValue();
    }

    /* renamed from: d */
    public Object mo5954d() {
        try {
            return this.f4513e.invoke();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
