package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.C0481i;

/* renamed from: androidx.lifecycle.x */
public class C0504x extends Fragment {

    /* renamed from: f */
    private C0505a f2076f;

    /* renamed from: androidx.lifecycle.x$a */
    interface C0505a {
        /* renamed from: a */
        void mo2721a();

        /* renamed from: b */
        void mo2722b();

        /* renamed from: c */
        void mo2723c();
    }

    /* renamed from: a */
    static C0504x m2483a(Activity activity) {
        return (C0504x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: a */
    private void m2484a(C0481i.C0482a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0494q) {
            ((C0494q) activity).mo5a().mo2707a(aVar);
        } else if (activity instanceof C0490o) {
            C0481i a = ((C0490o) activity).mo5a();
            if (a instanceof C0491p) {
                ((C0491p) a).mo2707a(aVar);
            }
        }
    }

    /* renamed from: b */
    public static void m2485b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0504x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    private void m2486b(C0505a aVar) {
        if (aVar != null) {
            aVar.mo2721a();
        }
    }

    /* renamed from: c */
    private void m2487c(C0505a aVar) {
        if (aVar != null) {
            aVar.mo2722b();
        }
    }

    /* renamed from: d */
    private void m2488d(C0505a aVar) {
        if (aVar != null) {
            aVar.mo2723c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2726a(C0505a aVar) {
        this.f2076f = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2486b(this.f2076f);
        m2484a(C0481i.C0482a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m2484a(C0481i.C0482a.ON_DESTROY);
        this.f2076f = null;
    }

    public void onPause() {
        super.onPause();
        m2484a(C0481i.C0482a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m2487c(this.f2076f);
        m2484a(C0481i.C0482a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m2488d(this.f2076f);
        m2484a(C0481i.C0482a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m2484a(C0481i.C0482a.ON_STOP);
    }
}
