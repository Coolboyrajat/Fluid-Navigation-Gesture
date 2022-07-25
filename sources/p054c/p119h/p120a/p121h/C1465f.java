package p054c.p119h.p120a.p121h;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.joaomgcd.taskerpluginlibrary.output.C2767b;
import com.joaomgcd.taskerpluginlibrary.output.C2768c;
import com.joaomgcd.taskerpluginlibrary.output.C2769d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C3256e;
import kotlin.C3269p;
import kotlin.p192b0.C3208i;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlin.p205x.p207d.C3379t;
import kotlin.p205x.p207d.C3380u;
import kotlin.p205x.p207d.C3384y;
import net.dinglisch.android.tasker.C3559a;
import p054c.p119h.p120a.C1454c;
import p054c.p119h.p120a.C1455d;
import p054c.p119h.p120a.C1458f;
import p054c.p119h.p120a.p122i.C1472a;
import p054c.p119h.p120a.p122i.C1482b;
import p054c.p119h.p120a.p123j.C1483a;
import p054c.p119h.p120a.p123j.C1485c;
import p054c.p119h.p120a.p123j.C1499f;
import p054c.p119h.p120a.p124k.C1514d;
import p054c.p119h.p120a.p124k.C1522k;

/* renamed from: c.h.a.h.f */
public abstract class C1465f<TInput, TOutput, TActionRunner extends C1522k<TInput, TOutput>> {

    /* renamed from: i */
    static final /* synthetic */ C3208i[] f4474i;

    /* renamed from: a */
    private final int f4475a = 60;

    /* renamed from: b */
    private final TInput f4476b;

    /* renamed from: c */
    private final C3256e f4477c = C3258g.m11969a(new C1467b(this));

    /* renamed from: d */
    private final C3256e f4478d = C3258g.m11969a(new C1469d(this));

    /* renamed from: e */
    private final Intent f4479e = this.f4482h.getIntent();

    /* renamed from: f */
    private final HashMap<String, C3350b<Object, String>> f4480f;

    /* renamed from: g */
    private final boolean f4481g;

    /* renamed from: h */
    private final C1464e<TInput> f4482h;

    /* renamed from: c.h.a.h.f$a */
    static final class C1466a extends C3371l implements C3350b<C2768c, Boolean> {

        /* renamed from: g */
        final /* synthetic */ C1465f f4483g;

        /* renamed from: h */
        final /* synthetic */ C1483a f4484h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1466a(C1465f fVar, C2769d dVar, C1483a aVar) {
            super(1);
            this.f4483g = fVar;
            this.f4484h = aVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5934a((C2768c) obj));
        }

        /* renamed from: a */
        public final boolean mo5934a(C2768c cVar) {
            C3370k.m12227b(cVar, "it");
            return this.f4483g.m6676m().shouldAddOutput(this.f4483g.mo5924c().mo5912a(), this.f4484h, cVar);
        }
    }

    /* renamed from: c.h.a.h.f$b */
    static final class C1467b extends C3371l implements C3349a<Context> {

        /* renamed from: g */
        final /* synthetic */ C1465f f4485g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1467b(C1465f fVar) {
            super(0);
            this.f4485g = fVar;
        }

        public final Context invoke() {
            return this.f4485g.mo5924c().mo5912a();
        }
    }

    /* renamed from: c.h.a.h.f$c */
    static final class C1468c extends C3371l implements C3350b<C1485c, String> {

        /* renamed from: g */
        public static final C1468c f4486g = new C1468c();

        C1468c() {
            super(1);
        }

        /* renamed from: a */
        public final String mo5146a(C1485c cVar) {
            C3370k.m12227b(cVar, "it");
            return cVar.mo5952b();
        }
    }

    /* renamed from: c.h.a.h.f$d */
    static final class C1469d extends C3371l implements C3349a<TActionRunner> {

        /* renamed from: g */
        final /* synthetic */ C1465f f4487g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1469d(C1465f fVar) {
            super(0);
            this.f4487g = fVar;
        }

        public final TActionRunner invoke() {
            return (C1522k) this.f4487g.mo5930i().newInstance();
        }
    }

    static {
        Class<C1465f> cls = C1465f.class;
        C3380u uVar = new C3380u(C3384y.m12254a((Class) cls), "context", "getContext()Landroid/content/Context;");
        C3384y.m12259a((C3379t) uVar);
        C3380u uVar2 = new C3380u(C3384y.m12254a((Class) cls), "runner", "getRunner()Lcom/joaomgcd/taskerpluginlibrary/runner/TaskerPluginRunner;");
        C3384y.m12259a((C3379t) uVar2);
        f4474i = new C3208i[]{uVar, uVar2};
    }

    public C1465f(C1464e<TInput> eVar) {
        C3370k.m12227b(eVar, "config");
        this.f4482h = eVar;
        Intent intent = this.f4479e;
        Bundle bundle = null;
        new C1463d(intent != null ? intent.getExtras() : null);
        Intent intent2 = this.f4479e;
        C3370k.m12223a((Object) C3559a.m12846a(intent2 != null ? intent2.getExtras() : bundle), "TaskerPlugin.getRelevant…ist(taskerIntent?.extras)");
        Intent intent3 = this.f4479e;
        if (intent3 != null) {
            intent3.getStringExtra("com.twofortyfouram.locale.intent.extra.BREADCRUMB");
        }
        this.f4480f = new HashMap<>();
        this.f4481g = true;
    }

    /* renamed from: a */
    private final Intent m6672a(String str, C2769d dVar, C1483a<TInput> aVar) {
        String str2 = str;
        C2769d dVar2 = dVar;
        Intent intent = new Intent();
        Bundle a = C1472a.m6701a(intent);
        C1472a.m6707a(a, true);
        C1472a.m6711b(a, mo5930i().getName());
        C1472a.m6706a(a, mo5927f().getName());
        List<C1485c> a2 = m6674b(aVar).mo5965a(a);
        ArrayList arrayList = new ArrayList();
        for (T next : a2) {
            if (((C1485c) next).mo5954d() instanceof String) {
                arrayList.add(next);
            }
        }
        a.putString("net.dinglisch.android.tasker.extras.VARIABLE_REPLACE_KEYS", C3292r.m12086a(arrayList, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C1468c.f4486g, 30, (Object) null));
        if (str2 != null) {
            intent.putExtra("com.twofortyfouram.locale.intent.extra.BLURB", str2);
        }
        String string = mo5925d().getString(C1454c.error_code);
        C3370k.m12223a((Object) string, "context.getString(R.string.error_code)");
        String string2 = mo5925d().getString(C1454c.error_code_description);
        C3370k.m12223a((Object) string2, "context.getString(R.string.error_code_description)");
        dVar2.add(new C2768c("err", string, string2, false, 0, 0, 56, (C3366g) null));
        String string3 = mo5925d().getString(C1454c.error_message);
        C3370k.m12223a((Object) string3, "context.getString(R.string.error_message)");
        String string4 = mo5925d().getString(C1454c.error_message_description);
        C3370k.m12223a((Object) string4, "context.getString(R.stri…rror_message_description)");
        dVar2.add(new C2768c("errmsg", string3, string4, false, 0, 0, 56, (C3366g) null));
        ArrayList arrayList2 = new ArrayList(C3285k.m12075a(dVar2, 10));
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2768c) it.next()).toString());
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            C3559a.m12843a(intent, (String[]) array);
            C3559a.C3564e.m12856a(intent, mo5931j() * 1000);
            return intent;
        }
        throw new C3269p("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    private final C1499f m6674b(C1483a<TInput> aVar) {
        return C1499f.f4528f.mo5976a(this.f4482h.mo5912a(), (C1483a<?>) aVar);
    }

    /* renamed from: c */
    private final String m6675c(C1483a<TInput> aVar) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        if (mo5923b()) {
            for (C1485c cVar : m6674b(aVar)) {
                if (!cVar.mo5951a()) {
                    C3350b bVar = mo5928g().get(cVar.mo5952b());
                    if (bVar == null || (obj = (String) bVar.mo5146a(cVar.mo5954d())) == null) {
                        obj = cVar.mo5954d();
                    }
                    C1482b.m6734a(sb, cVar.mo5953c(), obj);
                }
            }
        }
        mo5921a(aVar, sb);
        String sb2 = sb.toString();
        C3370k.m12223a((Object) sb2, "StringBuilder().apply {\n…t, this)\n    }.toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final TActionRunner m6676m() {
        C3256e eVar = this.f4478d;
        C3208i iVar = f4474i[1];
        return (C1522k) eVar.getValue();
    }

    /* renamed from: a */
    public final C1455d mo5918a() {
        C1483a<TInput> b = this.f4482h.mo5914b();
        mo5922a(b.mo5944a());
        C1455d a = mo5919a(b);
        if (!a.mo5910a()) {
            return a;
        }
        C2769d dVar = new C2769d();
        mo5920a(b, dVar);
        C1514d renames$taskerpluginlibrary_release = m6676m().getRenames$taskerpluginlibrary_release(this.f4482h.mo5912a(), b);
        if (renames$taskerpluginlibrary_release != null) {
            renames$taskerpluginlibrary_release.mo5998a((C2767b<?>) dVar);
        }
        this.f4482h.setResult(-1, m6672a(m6675c(b), dVar, b));
        this.f4482h.finish();
        return a;
    }

    /* renamed from: a */
    public C1455d mo5919a(C1483a<TInput> aVar) {
        C3370k.m12227b(aVar, "input");
        return new C1458f();
    }

    /* renamed from: a */
    public void mo5920a(C1483a<TInput> aVar, C2769d dVar) {
        C3370k.m12227b(aVar, "input");
        C3370k.m12227b(dVar, "output");
        Class h = mo5929h();
        if (h != null) {
            C2767b.m10928a(dVar, this.f4482h.mo5912a(), h, (Object) null, new C1466a(this, dVar, aVar), false, (ArrayList) null, 52, (Object) null);
        }
    }

    /* renamed from: a */
    public void mo5921a(C1483a<TInput> aVar, StringBuilder sb) {
        C3370k.m12227b(aVar, "input");
        C3370k.m12227b(sb, "blurbBuilder");
    }

    /* renamed from: a */
    public void mo5922a(C1499f fVar) {
        C3370k.m12227b(fVar, "input");
    }

    /* renamed from: b */
    public boolean mo5923b() {
        return this.f4481g;
    }

    /* renamed from: c */
    public final C1464e<TInput> mo5924c() {
        return this.f4482h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Context mo5925d() {
        C3256e eVar = this.f4477c;
        C3208i iVar = f4474i[0];
        return (Context) eVar.getValue();
    }

    /* renamed from: e */
    public TInput mo5926e() {
        return this.f4476b;
    }

    /* renamed from: f */
    public abstract Class<TInput> mo5927f();

    /* renamed from: g */
    public HashMap<String, C3350b<Object, String>> mo5928g() {
        return this.f4480f;
    }

    /* renamed from: h */
    public abstract Class<TOutput> mo5929h();

    /* renamed from: i */
    public abstract Class<TActionRunner> mo5930i();

    /* renamed from: j */
    public int mo5931j() {
        return this.f4475a;
    }

    /* renamed from: k */
    public final C1455d mo5932k() {
        return mo5918a();
    }

    /* renamed from: l */
    public final void mo5933l() {
        C1464e<TInput> eVar = this.f4482h;
        eVar.mo5913a(C1472a.m6702a(this.f4479e, eVar.mo5912a(), mo5927f(), mo5926e()));
    }
}
