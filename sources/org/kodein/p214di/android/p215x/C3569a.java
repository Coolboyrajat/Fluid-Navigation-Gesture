package org.kodein.p214di.android.p215x;

import android.content.Context;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import p179e.p184b.p185a.p186k0.C3014a;
import p179e.p184b.p185a.p186k0.C3018c;

/* renamed from: org.kodein.di.android.x.a */
public final class C3569a {

    /* renamed from: org.kodein.di.android.x.a$a */
    static final class C3570a extends C3371l implements C3349a<C0401d> {

        /* renamed from: g */
        final /* synthetic */ Fragment f8284g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3570a(Fragment fragment) {
            super(0);
            this.f8284g = fragment;
        }

        public final C0401d invoke() {
            C0401d x0 = this.f8284g.mo2311x0();
            C3370k.m12223a((Object) x0, "requireActivity()");
            return x0;
        }
    }

    /* renamed from: a */
    public static final C3018c<Object> m12867a(Fragment fragment) {
        C3370k.m12227b(fragment, "$this$closestKodein");
        return m12868b(fragment);
    }

    /* renamed from: b */
    public static final C3018c<Object> m12868b(Fragment fragment) {
        C3370k.m12227b(fragment, "$this$kodein");
        return C3014a.m11541a((C3349a<? extends Context>) new C3570a(fragment));
    }
}
