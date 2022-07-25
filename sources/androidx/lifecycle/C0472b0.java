package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.C0401d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0464a0;

/* renamed from: androidx.lifecycle.b0 */
public class C0472b0 {
    /* renamed from: a */
    private static Activity m2415a(Fragment fragment) {
        C0401d u = fragment.mo2304u();
        if (u != null) {
            return u;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: a */
    private static Application m2416a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: a */
    public static C0464a0 m2417a(Fragment fragment, C0464a0.C0466b bVar) {
        Application a = m2416a(m2415a(fragment));
        if (bVar == null) {
            bVar = C0464a0.C0465a.m2401a(a);
        }
        return new C0464a0(fragment.mo8h(), bVar);
    }

    /* renamed from: a */
    public static C0464a0 m2418a(C0401d dVar) {
        return m2419a(dVar, (C0464a0.C0466b) null);
    }

    /* renamed from: a */
    public static C0464a0 m2419a(C0401d dVar, C0464a0.C0466b bVar) {
        Application a = m2416a((Activity) dVar);
        if (bVar == null) {
            bVar = C0464a0.C0465a.m2401a(a);
        }
        return new C0464a0(dVar.mo8h(), bVar);
    }

    /* renamed from: b */
    public static C0464a0 m2420b(Fragment fragment) {
        return m2417a(fragment, (C0464a0.C0466b) null);
    }
}
