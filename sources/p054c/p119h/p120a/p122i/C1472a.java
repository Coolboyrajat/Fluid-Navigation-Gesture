package p054c.p119h.p120a.p122i;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p054c.p119h.p120a.C1459g;
import p054c.p119h.p120a.p123j.C1483a;
import p054c.p119h.p120a.p123j.C1503i;

/* renamed from: c.h.a.i.a */
public final class C1472a {

    /* renamed from: c.h.a.i.a$a */
    static final class C1473a extends C3371l implements C3350b<Object, Boolean> {

        /* renamed from: g */
        public static final C1473a f4490g = new C1473a();

        C1473a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m6715a(Object obj) {
            return false;
        }
    }

    /* renamed from: c.h.a.i.a$b */
    static final class C1474b extends C3371l implements C3350b<String, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4491g;

        /* renamed from: h */
        final /* synthetic */ String f4492h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1474b(Bundle bundle, String str) {
            super(1);
            this.f4491g = bundle;
            this.f4492h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5936a((String) obj));
        }

        /* renamed from: a */
        public final boolean mo5936a(String str) {
            C3370k.m12227b(str, "it");
            this.f4491g.putString(this.f4492h, str);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$c */
    static final class C1475c extends C3371l implements C3350b<Integer, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4493g;

        /* renamed from: h */
        final /* synthetic */ String f4494h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1475c(Bundle bundle, String str) {
            super(1);
            this.f4493g = bundle;
            this.f4494h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5937a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        public final boolean mo5937a(int i) {
            this.f4493g.putInt(this.f4494h, i);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$d */
    static final class C1476d extends C3371l implements C3350b<Long, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4495g;

        /* renamed from: h */
        final /* synthetic */ String f4496h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1476d(Bundle bundle, String str) {
            super(1);
            this.f4495g = bundle;
            this.f4496h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5938a(((Number) obj).longValue()));
        }

        /* renamed from: a */
        public final boolean mo5938a(long j) {
            this.f4495g.putLong(this.f4496h, j);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$e */
    static final class C1477e extends C3371l implements C3350b<Float, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4497g;

        /* renamed from: h */
        final /* synthetic */ String f4498h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1477e(Bundle bundle, String str) {
            super(1);
            this.f4497g = bundle;
            this.f4498h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5939a(((Number) obj).floatValue()));
        }

        /* renamed from: a */
        public final boolean mo5939a(float f) {
            this.f4497g.putFloat(this.f4498h, f);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$f */
    static final class C1478f extends C3371l implements C3350b<Double, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4499g;

        /* renamed from: h */
        final /* synthetic */ String f4500h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1478f(Bundle bundle, String str) {
            super(1);
            this.f4499g = bundle;
            this.f4500h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5940a(((Number) obj).doubleValue()));
        }

        /* renamed from: a */
        public final boolean mo5940a(double d) {
            this.f4499g.putDouble(this.f4500h, d);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$g */
    static final class C1479g extends C3371l implements C3350b<Boolean, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4501g;

        /* renamed from: h */
        final /* synthetic */ String f4502h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1479g(Bundle bundle, String str) {
            super(1);
            this.f4501g = bundle;
            this.f4502h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5941a(((Boolean) obj).booleanValue()));
        }

        /* renamed from: a */
        public final boolean mo5941a(boolean z) {
            this.f4501g.putBoolean(this.f4502h, z);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$h */
    static final class C1480h extends C3371l implements C3350b<String[], Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4503g;

        /* renamed from: h */
        final /* synthetic */ String f4504h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1480h(Bundle bundle, String str) {
            super(1);
            this.f4503g = bundle;
            this.f4504h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5942a((String[]) obj));
        }

        /* renamed from: a */
        public final boolean mo5942a(String[] strArr) {
            C3370k.m12227b(strArr, "it");
            this.f4503g.putStringArray(this.f4504h, strArr);
            return true;
        }
    }

    /* renamed from: c.h.a.i.a$i */
    static final class C1481i extends C3371l implements C3350b<ArrayList<String>, Boolean> {

        /* renamed from: g */
        final /* synthetic */ Bundle f4505g;

        /* renamed from: h */
        final /* synthetic */ String f4506h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1481i(Bundle bundle, String str) {
            super(1);
            this.f4505g = bundle;
            this.f4506h = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            return Boolean.valueOf(mo5943a((ArrayList<String>) (ArrayList) obj));
        }

        /* renamed from: a */
        public final boolean mo5943a(ArrayList<String> arrayList) {
            C3370k.m12227b(arrayList, "it");
            this.f4505g.putStringArrayList(this.f4506h, arrayList);
            return true;
        }
    }

    /* renamed from: a */
    public static final int m6699a(Context context) {
        C3370k.m12227b(context, "receiver$0");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? applicationInfo.targetSdkVersion : Build.VERSION.SDK_INT;
    }

    @TargetApi(26)
    /* renamed from: a */
    public static final ComponentName m6700a(Context context, Intent intent) {
        String str;
        ComponentName componentName;
        C3370k.m12227b(context, "receiver$0");
        C3370k.m12227b(intent, "intent");
        if (m6712b(context)) {
            componentName = context.startForegroundService(intent);
            str = "startForegroundService(intent)";
        } else {
            componentName = context.startService(intent);
            str = "startService(intent)";
        }
        C3370k.m12223a((Object) componentName, str);
        return componentName;
    }

    /* renamed from: a */
    public static final Bundle m6701a(Intent intent) {
        C3370k.m12227b(intent, "receiver$0");
        Bundle bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
        if (bundleExtra != null) {
            return bundleExtra;
        }
        Bundle bundle = new Bundle();
        intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
        return bundle;
    }

    /* renamed from: a */
    public static final <TInput> C1483a<TInput> m6702a(Intent intent, Context context, Class<TInput> cls, TInput tinput) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(cls, "inputClass");
        return C1503i.m6777a(context, intent, cls, tinput);
    }

    /* renamed from: a */
    public static /* synthetic */ C1483a m6703a(Intent intent, Context context, Class cls, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return m6702a(intent, context, cls, obj);
    }

    /* renamed from: a */
    public static final String m6704a(Bundle bundle) {
        C3370k.m12227b(bundle, "receiver$0");
        return bundle.getString("net.dinglisch.android.tasker.extras.ACTION_INPUT_CLASS", (String) null);
    }

    /* renamed from: a */
    public static final <T> ArrayList<T> m6705a(ArrayList<T> arrayList, T t) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: a */
    public static final void m6706a(Bundle bundle, String str) {
        C3370k.m12227b(bundle, "receiver$0");
        bundle.putString("net.dinglisch.android.tasker.extras.ACTION_INPUT_CLASS", str);
    }

    /* renamed from: a */
    public static final void m6707a(Bundle bundle, boolean z) {
        C3370k.m12227b(bundle, "receiver$0");
        bundle.putBoolean("net.dinglisch.android.tasker.extras.EXTRA_WAS_CONFIGURED_BEFORE", z);
    }

    /* renamed from: a */
    public static final boolean m6708a(int i) {
        return i >= 26 && Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: a */
    public static final boolean m6709a(Bundle bundle, String str, Object obj) {
        C3370k.m12227b(bundle, "receiver$0");
        C3370k.m12227b(str, "key");
        return ((Boolean) C1459g.m6668a(obj, C1473a.f4490g, new C1474b(bundle, str), new C1475c(bundle, str), new C1476d(bundle, str), new C1477e(bundle, str), new C1478f(bundle, str), new C1479g(bundle, str), new C1480h(bundle, str), new C1481i(bundle, str))).booleanValue();
    }

    /* renamed from: b */
    public static final String m6710b(Bundle bundle) {
        C3370k.m12227b(bundle, "receiver$0");
        return bundle.getString("net.dinglisch.android.tasker.extras.ACTION_RUNNER_CLASS", (String) null);
    }

    /* renamed from: b */
    public static final void m6711b(Bundle bundle, String str) {
        C3370k.m12227b(bundle, "receiver$0");
        bundle.putString("net.dinglisch.android.tasker.extras.ACTION_RUNNER_CLASS", str);
    }

    /* renamed from: b */
    public static final boolean m6712b(Context context) {
        C3370k.m12227b(context, "receiver$0");
        return m6708a(m6699a(context));
    }

    /* renamed from: c */
    public static final boolean m6713c(Bundle bundle) {
        C3370k.m12227b(bundle, "receiver$0");
        return bundle.getBoolean("net.dinglisch.android.tasker.extras.EXTRA_WAS_CONFIGURED_BEFORE", false);
    }
}
