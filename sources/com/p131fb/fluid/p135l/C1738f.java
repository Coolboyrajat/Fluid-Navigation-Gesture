package com.p131fb.fluid.p135l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import com.p131fb.fluid.p135l.p139p.C1776l;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.p205x.p207d.C3370k;

@SuppressLint({"PrivateApi"})
/* renamed from: com.fb.fluid.l.f */
public final class C1738f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f5042a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Class<?> f5043b;

    /* renamed from: c */
    public static final C1739a f5044c = new C1739a((C3366g) null);

    /* renamed from: com.fb.fluid.l.f$a */
    public static final class C1739a {
        private C1739a() {
        }

        public /* synthetic */ C1739a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo6481a(Context context, int i) {
            C3370k.m12227b(context, "context");
            int identifier = context.getResources().getIdentifier((i == 0 || i == 2) ? "navigation_bar_height" : "navigation_bar_width", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        }

        /* renamed from: a */
        public final List<Integer> mo6482a(int i, int i2, int i3) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0});
                    } else if (i2 == 0) {
                        return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, Integer.valueOf(i)});
                    } else if (i2 == 1) {
                        return C3284j.m12070b((T[]) new Integer[]{Integer.valueOf(i), 0, 0, 0});
                    } else if (i2 == 2) {
                        return C3284j.m12070b((T[]) new Integer[]{0, Integer.valueOf(i), 0, 0});
                    } else if (i2 != 3) {
                        return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0});
                    } else {
                        return C3284j.m12070b((T[]) new Integer[]{0, 0, Integer.valueOf(i), 0});
                    }
                } else if (i2 != 2) {
                    return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, Integer.valueOf(i)});
                } else {
                    return C3284j.m12070b((T[]) new Integer[]{0, Integer.valueOf(i), 0, 0});
                }
            } else if (i2 == 0) {
                return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, Integer.valueOf(i)});
            } else if (i2 == 1) {
                return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, Integer.valueOf(i)});
            } else if (i2 == 2) {
                return C3284j.m12070b((T[]) new Integer[]{0, 0, Integer.valueOf(i), 0});
            } else if (i2 != 3) {
                return C3284j.m12070b((T[]) new Integer[]{0, 0, 0, 0});
            } else {
                return C3284j.m12070b((T[]) new Integer[]{0, Integer.valueOf(i), 0, 0});
            }
        }

        /* renamed from: a */
        public final boolean mo6483a(int i, int i2, int i3, int i4, int i5) {
            try {
                Method declaredMethod = C1738f.f5043b.getDeclaredMethod("setOverscan", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                C3370k.m12223a((Object) declaredMethod, "iWindowManagerClass.getD…teger.TYPE, Integer.TYPE)");
                declaredMethod.invoke(C1738f.f5042a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
                return true;
            } catch (Exception e) {
                C1776l.m7478a("IWindowManager.e: " + e + " - " + e.getMessage(), (String) null, 1, (Object) null);
                return false;
            }
        }
    }

    static {
        Class<?> cls = Class.forName("android.view.IWindowManager$Stub");
        C3370k.m12223a((Object) cls, "Class.forName(\"android.view.IWindowManager\\$Stub\")");
        Object invoke = Class.forName("android.os.ServiceManager").getMethod("checkService", new Class[]{String.class}).invoke((Object) null, new Object[]{"window"});
        f5042a = cls.getMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{invoke});
        Class<?> cls2 = Class.forName("android.view.IWindowManager");
        C3370k.m12223a((Object) cls2, "Class.forName(\"android.view.IWindowManager\")");
        f5043b = cls2;
    }
}
