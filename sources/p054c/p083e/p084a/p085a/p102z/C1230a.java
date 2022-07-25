package p054c.p083e.p084a.p085a.p102z;

import android.util.Log;

/* renamed from: c.e.a.a.z.a */
public class C1230a {

    /* renamed from: a */
    private final float f4007a;

    protected C1230a(float f) {
        this.f4007a = f;
    }

    /* renamed from: a */
    public static C1230a m5892a(C1230a aVar, float f) {
        C1230a a = aVar.mo5483a(f);
        if (!a.getClass().equals(aVar.getClass())) {
            Log.w("CornerTreatment", "CornerTreatments should override withSize() to return an instance of their class");
        }
        return a;
    }

    /* renamed from: a */
    public float mo5482a() {
        return this.f4007a;
    }

    /* renamed from: a */
    public C1230a mo5483a(float f) {
        throw null;
    }

    /* renamed from: a */
    public void mo5484a(float f, float f2, C1244i iVar) {
        throw null;
    }
}
