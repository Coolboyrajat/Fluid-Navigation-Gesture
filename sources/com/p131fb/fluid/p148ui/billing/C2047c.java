package com.p131fb.fluid.p148ui.billing;

import android.app.Application;
import androidx.lifecycle.C0463a;
import androidx.lifecycle.C0497t;
import com.android.billingclient.api.C1677s;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import kotlin.p205x.p207d.C3370k;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.ui.billing.c */
public final class C2047c extends C0463a {

    /* renamed from: g */
    private C3349a<Unit> f5643g;

    /* renamed from: h */
    private C1677s f5644h;

    /* renamed from: i */
    private C1677s f5645i;

    /* renamed from: j */
    private C0497t<String> f5646j;

    /* renamed from: k */
    private final Application f5647k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2047c(Application application) {
        super(application);
        C3370k.m12227b(application, "app");
        this.f5647k = application;
        C0497t<String> tVar = new C0497t<>();
        tVar.setValue(this.f5647k.getString(C3148R.string.billing_dialog_purchase, new Object[]{"?"}));
        this.f5646j = tVar;
    }

    /* renamed from: a */
    public final void mo6909a(List<? extends C1677s> list) {
        C1677s sVar;
        String str;
        T t;
        T t2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C3370k.m12225a((Object) ((C1677s) t).mo6312b(), (Object) "fluid_pro")) {
                    break;
                }
            }
            sVar = (C1677s) t;
        } else {
            sVar = null;
        }
        this.f5644h = sVar;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (C3370k.m12225a((Object) ((C1677s) next).mo6312b(), (Object) "fluid_day")) {
                    t2 = next;
                    break;
                }
            }
            t2 = (C1677s) t2;
        }
        this.f5645i = t2;
        C0497t<String> tVar = this.f5646j;
        Application application = this.f5647k;
        Object[] objArr = new Object[1];
        C1677s sVar2 = this.f5644h;
        if (sVar2 == null || (str = sVar2.mo6311a()) == null) {
            str = "?";
        }
        objArr[0] = str;
        tVar.setValue(application.getString(C3148R.string.billing_dialog_purchase, objArr));
    }

    /* renamed from: a */
    public final void mo6910a(C3349a<Unit> aVar) {
        this.f5643g = aVar;
    }

    /* renamed from: g */
    public final C0497t<String> mo6911g() {
        return this.f5646j;
    }

    /* renamed from: h */
    public final C3349a<Unit> mo6912h() {
        return this.f5643g;
    }

    /* renamed from: i */
    public final C1677s mo6913i() {
        return this.f5645i;
    }

    /* renamed from: j */
    public final C1677s mo6914j() {
        return this.f5644h;
    }
}
