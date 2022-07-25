package com.p131fb.fluid.p135l.p141r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.p131fb.fluid.p135l.p139p.C1776l;
import java.util.List;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: com.fb.fluid.l.r.a */
public final class C1793a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5094a = f5094a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f5095b = f5095b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f5096c = f5096c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f5097d = f5097d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f5098e = f5098e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f5099f = f5099f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f5100g = f5100g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f5101h = f5101h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f5102i = f5102i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String f5103j = f5103j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String f5104k = f5104k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f5105l = f5105l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f5106m = f5106m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f5107n = f5107n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f5108o = f5108o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final ComponentName f5109p = new ComponentName(f5097d, "com.google.android.apps.gsa.queryentry.QueryEntryActivity");

    /* renamed from: q */
    public static final C1794a f5110q = new C1794a((C3366g) null);

    /* renamed from: com.fb.fluid.l.r.a$a */
    public static final class C1794a {
        private C1794a() {
        }

        public /* synthetic */ C1794a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final ComponentName mo6566a() {
            return C1793a.f5109p;
        }

        /* renamed from: a */
        public final List<ResolveInfo> mo6567a(Context context) {
            C3370k.m12227b(context, "context");
            try {
                return context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 0);
            } catch (Exception e) {
                C1776l.m7478a("u.gha.e " + e.getMessage(), (String) null, 1, (Object) null);
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo6568a(String str, Context context) {
            C3370k.m12227b(str, "pkgName");
            C3370k.m12227b(context, "context");
            try {
                context.getPackageManager().getPackageInfo(str, PropertyFlags.ID_SELF_ASSIGNABLE);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        /* renamed from: b */
        public final String mo6569b() {
            return C1793a.f5106m;
        }

        /* renamed from: c */
        public final String mo6570c() {
            return C1793a.f5098e;
        }

        /* renamed from: d */
        public final String mo6571d() {
            return C1793a.f5096c;
        }

        /* renamed from: e */
        public final String mo6572e() {
            return C1793a.f5095b;
        }

        /* renamed from: f */
        public final String mo6573f() {
            return C1793a.f5097d;
        }

        /* renamed from: g */
        public final String mo6574g() {
            return C1793a.f5100g;
        }

        /* renamed from: h */
        public final String mo6575h() {
            return C1793a.f5099f;
        }

        /* renamed from: i */
        public final String mo6576i() {
            return C1793a.f5094a;
        }

        /* renamed from: j */
        public final String mo6577j() {
            return C1793a.f5107n;
        }

        /* renamed from: k */
        public final String mo6578k() {
            return C1793a.f5108o;
        }

        /* renamed from: l */
        public final String mo6579l() {
            return C1793a.f5104k;
        }

        /* renamed from: m */
        public final String mo6580m() {
            return C1793a.f5101h;
        }

        /* renamed from: n */
        public final String mo6581n() {
            return C1793a.f5103j;
        }

        /* renamed from: o */
        public final String mo6582o() {
            return C1793a.f5102i;
        }

        /* renamed from: p */
        public final String mo6583p() {
            return C1793a.f5105l;
        }
    }
}
