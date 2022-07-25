package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.p197u.C3314f;
import kotlin.p205x.p206c.C3350b;
import kotlin.p205x.p207d.C3370k;
import kotlin.p205x.p207d.C3371l;
import kotlinx.coroutines.C3429h;
import kotlinx.coroutines.C3513n0;

/* renamed from: kotlinx.coroutines.android.a */
public final class C3398a extends C3401b implements C3513n0 {
    private volatile C3398a _immediate;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f8058f;

    /* renamed from: g */
    private final String f8059g;

    /* renamed from: h */
    private final boolean f8060h;

    /* renamed from: kotlinx.coroutines.android.a$a */
    public static final class C3399a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C3398a f8061f;

        /* renamed from: g */
        final /* synthetic */ C3429h f8062g;

        public C3399a(C3398a aVar, C3429h hVar) {
            this.f8061f = aVar;
            this.f8062g = hVar;
        }

        public final void run() {
            this.f8062g.mo10147a(this.f8061f, Unit.INSTANCE);
        }
    }

    /* renamed from: kotlinx.coroutines.android.a$b */
    static final class C3400b extends C3371l implements C3350b<Throwable, Unit> {

        /* renamed from: g */
        final /* synthetic */ C3398a f8063g;

        /* renamed from: h */
        final /* synthetic */ Runnable f8064h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3400b(C3398a aVar, Runnable runnable) {
            super(1);
            this.f8063g = aVar;
            this.f8064h = runnable;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo5146a(Object obj) {
            mo10118a((Throwable) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public final void mo10118a(Throwable th) {
            this.f8063g.f8058f.removeCallbacks(this.f8064h);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3398a(Handler handler, String str) {
        this(handler, str, false);
        C3370k.m12227b(handler, "handler");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3398a(Handler handler, String str, boolean z) {
        super((C3366g) null);
        C3398a aVar = null;
        this.f8058f = handler;
        this.f8059g = str;
        this.f8060h = z;
        this._immediate = this.f8060h ? this : aVar;
        if (this._immediate == null) {
            this._immediate = new C3398a(this.f8058f, this.f8059g, true);
        }
    }

    /* renamed from: a */
    public void mo10111a(long j, C3429h<? super Unit> hVar) {
        C3370k.m12227b(hVar, "continuation");
        C3399a aVar = new C3399a(this, hVar);
        this.f8058f.postDelayed(aVar, C3198h.m11850b(j, 4611686018427387903L));
        hVar.mo10146a(new C3400b(this, aVar));
    }

    /* renamed from: a */
    public void mo10112a(C3314f fVar, Runnable runnable) {
        C3370k.m12227b(fVar, "context");
        C3370k.m12227b(runnable, "block");
        this.f8058f.post(runnable);
    }

    /* renamed from: b */
    public boolean mo10113b(C3314f fVar) {
        C3370k.m12227b(fVar, "context");
        return !this.f8060h || (C3370k.m12225a((Object) Looper.myLooper(), (Object) this.f8058f.getLooper()) ^ true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3398a) && ((C3398a) obj).f8058f == this.f8058f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8058f);
    }

    public String toString() {
        String str = this.f8059g;
        if (str == null) {
            String handler = this.f8058f.toString();
            C3370k.m12223a((Object) handler, "handler.toString()");
            return handler;
        } else if (!this.f8060h) {
            return str;
        } else {
            return this.f8059g + " [immediate]";
        }
    }
}
