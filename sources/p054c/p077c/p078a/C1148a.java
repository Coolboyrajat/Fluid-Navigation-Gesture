package p054c.p077c.p078a;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;

/* renamed from: c.c.a.a */
abstract class C1148a {

    @TargetApi(16)
    /* renamed from: c.c.a.a$a */
    private static class C1149a extends C1162i {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Choreographer f3857b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Choreographer.FrameCallback f3858c = new C1150a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f3859d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f3860e;

        /* renamed from: c.c.a.a$a$a */
        class C1150a implements Choreographer.FrameCallback {
            C1150a() {
            }

            public void doFrame(long j) {
                if (C1149a.this.f3859d && C1149a.this.f3894a != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C1149a aVar = C1149a.this;
                    aVar.f3894a.mo5264b((double) (uptimeMillis - aVar.f3860e));
                    long unused = C1149a.this.f3860e = uptimeMillis;
                    C1149a.this.f3857b.postFrameCallback(C1149a.this.f3858c);
                }
            }
        }

        public C1149a(Choreographer choreographer) {
            this.f3857b = choreographer;
        }

        /* renamed from: c */
        public static C1149a m5670c() {
            return new C1149a(Choreographer.getInstance());
        }

        /* renamed from: a */
        public void mo5256a() {
            if (!this.f3859d) {
                this.f3859d = true;
                this.f3860e = SystemClock.uptimeMillis();
                this.f3857b.removeFrameCallback(this.f3858c);
                this.f3857b.postFrameCallback(this.f3858c);
            }
        }

        /* renamed from: b */
        public void mo5257b() {
            this.f3859d = false;
            this.f3857b.removeFrameCallback(this.f3858c);
        }
    }

    /* renamed from: c.c.a.a$b */
    private static class C1151b extends C1162i {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Handler f3862b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Runnable f3863c = new C1152a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f3864d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f3865e;

        /* renamed from: c.c.a.a$b$a */
        class C1152a implements Runnable {
            C1152a() {
            }

            public void run() {
                if (C1151b.this.f3864d && C1151b.this.f3894a != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C1151b bVar = C1151b.this;
                    bVar.f3894a.mo5264b((double) (uptimeMillis - bVar.f3865e));
                    long unused = C1151b.this.f3865e = uptimeMillis;
                    C1151b.this.f3862b.post(C1151b.this.f3863c);
                }
            }
        }

        public C1151b(Handler handler) {
            this.f3862b = handler;
        }

        /* renamed from: c */
        public static C1162i m5677c() {
            return new C1151b(new Handler());
        }

        /* renamed from: a */
        public void mo5256a() {
            if (!this.f3864d) {
                this.f3864d = true;
                this.f3865e = SystemClock.uptimeMillis();
                this.f3862b.removeCallbacks(this.f3863c);
                this.f3862b.post(this.f3863c);
            }
        }

        /* renamed from: b */
        public void mo5257b() {
            this.f3864d = false;
            this.f3862b.removeCallbacks(this.f3863c);
        }
    }

    /* renamed from: a */
    public static C1162i m5665a() {
        return Build.VERSION.SDK_INT >= 16 ? C1149a.m5670c() : C1151b.m5677c();
    }
}
