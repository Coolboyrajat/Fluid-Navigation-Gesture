package com.p131fb.fluid.utils.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.p131fb.fluid.p135l.p139p.C1776l;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.utils.preferences.d */
public abstract class C2518d {

    /* renamed from: a */
    private final SharedPreferences f6387a;

    public C2518d(Context context, String str) {
        C3370k.m12227b(context, "context");
        C3370k.m12227b(str, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        C3370k.m12223a((Object) sharedPreferences, "context.getSharedPreferences(fileName, 0)");
        this.f6387a = sharedPreferences;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2518d(Context context, String str, int i, C3366g gVar) {
        this(context, (i & 2) != 0 ? "com.fb.fluid.shared" : str);
    }

    /* renamed from: a */
    public final int mo7456a(String str, int i) {
        C3370k.m12227b(str, "key");
        return this.f6387a.getInt(str, i);
    }

    /* renamed from: a */
    public final long mo7457a(String str, long j) {
        C3370k.m12227b(str, "key");
        try {
            return this.f6387a.getLong(str, j);
        } catch (Exception e) {
            C1776l.m7478a("getLong.e: " + str + " -- " + e.getMessage(), (String) null, 1, (Object) null);
            return -1;
        }
    }

    /* renamed from: a */
    public final SharedPreferences mo7458a() {
        return this.f6387a;
    }

    /* renamed from: a */
    public final String mo7459a(String str, String str2) {
        C3370k.m12227b(str, "key");
        C3370k.m12227b(str2, "defVal");
        return this.f6387a.getString(str, str2);
    }

    /* renamed from: a */
    public final boolean mo7460a(String str, boolean z) {
        C3370k.m12227b(str, "key");
        return this.f6387a.getBoolean(str, z);
    }

    /* renamed from: b */
    public final void mo7461b(String str, int i) {
        C3370k.m12227b(str, "key");
        this.f6387a.edit().putInt(str, i).apply();
    }

    /* renamed from: b */
    public final void mo7462b(String str, long j) {
        C3370k.m12227b(str, "key");
        this.f6387a.edit().putLong(str, j).apply();
    }

    /* renamed from: b */
    public final void mo7463b(String str, String str2) {
        C3370k.m12227b(str, "key");
        C3370k.m12227b(str2, "value");
        this.f6387a.edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    public final void mo7464b(String str, boolean z) {
        C3370k.m12227b(str, "key");
        this.f6387a.edit().putBoolean(str, z).apply();
    }
}
