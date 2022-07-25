package com.p131fb.fluid.utils.preferences;

import android.content.SharedPreferences;
import kotlin.p205x.p207d.C3370k;

/* renamed from: com.fb.fluid.utils.preferences.g */
public final class C2526g {
    /* renamed from: a */
    public static final void m9416a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, C2518d dVar) {
        C3370k.m12227b(onSharedPreferenceChangeListener, "$this$start");
        C3370k.m12227b(dVar, "prefs");
        dVar.mo7458a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: b */
    public static final void m9417b(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, C2518d dVar) {
        C3370k.m12227b(onSharedPreferenceChangeListener, "$this$stop");
        C3370k.m12227b(dVar, "prefs");
        dVar.mo7458a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
