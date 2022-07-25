package p054c.p083e.p084a.p085a.p102z;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2673h;

/* renamed from: c.e.a.a.z.e */
public class C1236e {
    /* renamed from: a */
    static C1230a m5956a() {
        return new C1237f(0.0f);
    }

    /* renamed from: a */
    static C1230a m5957a(int i, int i2) {
        return i != 0 ? i != 1 ? m5956a() : new C1231b((float) i2) : new C1237f((float) i2);
    }

    /* renamed from: a */
    public static void m5958a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C1233d) {
            m5960a(view, (C1233d) background);
        }
    }

    /* renamed from: a */
    public static void m5959a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1233d) {
            ((C1233d) background).mo5486a(f);
        }
    }

    /* renamed from: a */
    public static void m5960a(View view, C1233d dVar) {
        if (dVar.mo5520m()) {
            dVar.mo5501c(C2673h.m10592a(view));
        }
    }

    /* renamed from: b */
    static C1232c m5961b() {
        return new C1232c();
    }
}
