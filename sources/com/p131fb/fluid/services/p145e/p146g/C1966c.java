package com.p131fb.fluid.services.p145e.p146g;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.p205x.p206c.C3349a;
import p190io.objectbox.android.C3148R;

/* renamed from: com.fb.fluid.services.e.g.c */
public interface C1966c {

    /* renamed from: a */
    public static final C1967a f5466a = C1967a.f5467a;

    /* renamed from: com.fb.fluid.services.e.g.c$a */
    public static final class C1967a {

        /* renamed from: a */
        static final /* synthetic */ C1967a f5467a = new C1967a();

        private C1967a() {
        }

        /* renamed from: a */
        public final int mo6816a(int i) {
            if (i == 1) {
                return C3148R.string.anim_fluid;
            }
            if (i == 2) {
                return C3148R.string.anim_bubble;
            }
            if (i == 3) {
                return C3148R.string.anim_none;
            }
            if (i == 4) {
                return C3148R.string.anim_teardrop;
            }
            if (i != 5) {
                return 0;
            }
            return C3148R.string.anim_plain_icon;
        }

        /* renamed from: b */
        public final C1966c mo6817b(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new C1970e() : new C1978g() : new C1983h() : new C1970e() : new C1961b() : new C1973f();
        }
    }

    /* renamed from: com.fb.fluid.services.e.g.c$b */
    public static final class C1968b {
        /* renamed from: a */
        public static int m8058a(C1966c cVar) {
            int i = cVar.mo6788a().x;
            return i == -1 ? cVar.getWidth() : i;
        }

        /* renamed from: b */
        public static int m8059b(C1966c cVar) {
            int i = cVar.mo6788a().y;
            return i == -1 ? cVar.getHeight() : i;
        }
    }

    /* renamed from: a */
    Point mo6788a();

    /* renamed from: a */
    void mo6789a(float f);

    /* renamed from: a */
    void mo6790a(int i);

    /* renamed from: a */
    void mo6791a(Canvas canvas);

    /* renamed from: a */
    void mo6792a(WeakReference<Drawable> weakReference);

    /* renamed from: a */
    void mo6793a(C3349a<Unit> aVar);

    /* renamed from: a */
    void mo6794a(boolean z);

    /* renamed from: b */
    int mo6795b();

    /* renamed from: b */
    void mo6796b(int i);

    /* renamed from: b */
    void mo6797b(C3349a<Unit> aVar);

    /* renamed from: c */
    void mo6799c();

    /* renamed from: c */
    void mo6800c(int i);

    /* renamed from: d */
    void mo6801d();

    /* renamed from: d */
    void mo6802d(int i);

    void dismiss();

    /* renamed from: e */
    void mo6804e(int i);

    /* renamed from: e */
    boolean mo6805e();

    /* renamed from: f */
    PointF mo6806f();

    int getHeight();

    int getWidth();
}
