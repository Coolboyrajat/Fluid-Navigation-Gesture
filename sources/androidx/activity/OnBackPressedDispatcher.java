package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0481i;
import androidx.lifecycle.C0488m;
import androidx.lifecycle.C0490o;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f15a;

    /* renamed from: b */
    final ArrayDeque<C0010b> f16b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0488m, C0009a {

        /* renamed from: f */
        private final C0481i f17f;

        /* renamed from: g */
        private final C0010b f18g;

        /* renamed from: h */
        private C0009a f19h;

        LifecycleOnBackPressedCancellable(C0481i iVar, C0010b bVar) {
            this.f17f = iVar;
            this.f18g = bVar;
            iVar.mo2701a(this);
        }

        /* renamed from: a */
        public void mo14a(C0490o oVar, C0481i.C0482a aVar) {
            if (aVar == C0481i.C0482a.ON_START) {
                this.f19h = OnBackPressedDispatcher.this.mo16a(this.f18g);
            } else if (aVar == C0481i.C0482a.ON_STOP) {
                C0009a aVar2 = this.f19h;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0481i.C0482a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f17f.mo2702b(this);
            this.f18g.mo23b(this);
            C0009a aVar = this.f19h;
            if (aVar != null) {
                aVar.cancel();
                this.f19h = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0008a implements C0009a {

        /* renamed from: f */
        private final C0010b f21f;

        C0008a(C0010b bVar) {
            this.f21f = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f16b.remove(this.f21f);
            this.f21f.mo23b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f15a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0009a mo16a(C0010b bVar) {
        this.f16b.add(bVar);
        C0008a aVar = new C0008a(bVar);
        bVar.mo21a((C0009a) aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo17a() {
        Iterator<C0010b> descendingIterator = this.f16b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0010b next = descendingIterator.next();
            if (next.mo24b()) {
                next.mo20a();
                return;
            }
        }
        Runnable runnable = this.f15a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo18a(C0490o oVar, C0010b bVar) {
        C0481i a = oVar.mo5a();
        if (a.mo2700a() != C0481i.C0483b.DESTROYED) {
            bVar.mo21a((C0009a) new LifecycleOnBackPressedCancellable(a, bVar));
        }
    }
}
