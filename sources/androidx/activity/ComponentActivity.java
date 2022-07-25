package androidx.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0289e;
import androidx.lifecycle.C0474c0;
import androidx.lifecycle.C0476d0;
import androidx.lifecycle.C0480h;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0488m;
import androidx.lifecycle.C0490o;
import androidx.lifecycle.C0491p;
import androidx.lifecycle.C0504x;
import androidx.savedstate.C0628a;
import androidx.savedstate.C0629b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0289e implements C0490o, C0476d0, C0480h, C0629b, C0011c {

    /* renamed from: g */
    private final C0491p f1g = new C0491p(this);

    /* renamed from: h */
    private final C0628a f2h = C0628a.m3541a((C0629b) this);

    /* renamed from: i */
    private C0474c0 f3i;

    /* renamed from: j */
    private final OnBackPressedDispatcher f4j = new OnBackPressedDispatcher(new C0006a());

    /* renamed from: k */
    private int f5k;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0006a implements Runnable {
        C0006a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0007b {

        /* renamed from: a */
        C0474c0 f9a;

        C0007b() {
        }
    }

    public ComponentActivity() {
        if (mo5a() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                mo5a().mo2701a(new C0488m() {
                    /* renamed from: a */
                    public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
                        if (aVar == C0481i.C0482a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo5a().mo2701a(new C0488m() {
                /* renamed from: a */
                public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
                    if (aVar == C0481i.C0482a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo8h().mo2686a();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                mo5a().mo2701a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: a */
    public C0481i mo5a() {
        return this.f1g;
    }

    /* renamed from: f */
    public final OnBackPressedDispatcher mo6f() {
        return this.f4j;
    }

    /* renamed from: g */
    public final SavedStateRegistry mo7g() {
        return this.f2h.mo3633a();
    }

    /* renamed from: h */
    public C0474c0 mo8h() {
        if (getApplication() != null) {
            if (this.f3i == null) {
                C0007b bVar = (C0007b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f3i = bVar.f9a;
                }
                if (this.f3i == null) {
                    this.f3i = new C0474c0();
                }
            }
            return this.f3i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    /* renamed from: j */
    public Object mo9j() {
        return null;
    }

    public void onBackPressed() {
        this.f4j.mo17a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2h.mo3634a(bundle);
        C0504x.m2485b((Activity) this);
        int i = this.f5k;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0007b bVar;
        Object j = mo9j();
        C0474c0 c0Var = this.f3i;
        if (c0Var == null && (bVar = (C0007b) getLastNonConfigurationInstance()) != null) {
            c0Var = bVar.f9a;
        }
        if (c0Var == null && j == null) {
            return null;
        }
        C0007b bVar2 = new C0007b();
        bVar2.f9a = c0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0481i a = mo5a();
        if (a instanceof C0491p) {
            ((C0491p) a).mo2709b(C0481i.C0483b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f2h.mo3635b(bundle);
    }
}
