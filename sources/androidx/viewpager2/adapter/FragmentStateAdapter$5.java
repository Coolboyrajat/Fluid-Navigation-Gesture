package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0488m;
import androidx.lifecycle.C0490o;

class FragmentStateAdapter$5 implements C0488m {

    /* renamed from: f */
    final /* synthetic */ Handler f2606f;

    /* renamed from: g */
    final /* synthetic */ Runnable f2607g;

    /* renamed from: a */
    public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
        if (aVar == C0481i.C0482a.ON_DESTROY) {
            this.f2606f.removeCallbacks(this.f2607g);
            oVar.mo5a().mo2702b(this);
        }
    }
}
