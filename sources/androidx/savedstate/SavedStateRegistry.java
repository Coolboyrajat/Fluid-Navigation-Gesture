package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0479g;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0490o;
import java.util.Map;
import p006b.p015b.p016a.p018b.C0705b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C0705b<String, C0627b> f2507a = new C0705b<>();

    /* renamed from: b */
    private Bundle f2508b;

    /* renamed from: c */
    private boolean f2509c;

    /* renamed from: d */
    boolean f2510d;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0626a {
        /* renamed from: a */
        void mo3631a(C0629b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0627b {
        /* renamed from: a */
        Bundle mo3632a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo3628a(String str) {
        if (this.f2509c) {
            Bundle bundle = this.f2508b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2508b.remove(str);
            if (this.f2508b.isEmpty()) {
                this.f2508b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3629a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2508b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0705b<K, V>.d c = this.f2507a.mo3971c();
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            bundle2.putBundle((String) entry.getKey(), ((C0627b) entry.getValue()).mo3632a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3630a(C0481i iVar, Bundle bundle) {
        if (!this.f2509c) {
            if (bundle != null) {
                this.f2508b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            iVar.mo2701a(new C0479g() {
                /* renamed from: a */
                public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == C0481i.C0482a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar == C0481i.C0482a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f2510d = z;
                }
            });
            this.f2509c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
