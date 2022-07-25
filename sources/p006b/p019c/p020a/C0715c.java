package p006b.p019c.p020a;

import android.content.res.ColorStateList;

/* renamed from: b.c.a.c */
class C0715c implements C0719f {
    C0715c() {
    }

    /* renamed from: j */
    private C0720g m3880j(C0718e eVar) {
        return (C0720g) eVar.mo4033c();
    }

    /* renamed from: a */
    public float mo4015a(C0718e eVar) {
        return m3880j(eVar).mo4039b();
    }

    /* renamed from: a */
    public void mo4013a() {
    }

    /* renamed from: a */
    public void mo4016a(C0718e eVar, float f) {
        eVar.mo4029a().setElevation(f);
    }

    /* renamed from: a */
    public void mo4017a(C0718e eVar, ColorStateList colorStateList) {
        m3880j(eVar).mo4038a(colorStateList);
    }

    /* renamed from: b */
    public float mo4018b(C0718e eVar) {
        return m3880j(eVar).mo4040c();
    }

    /* renamed from: b */
    public void mo4019b(C0718e eVar, float f) {
        m3880j(eVar).mo4036a(f);
    }

    /* renamed from: c */
    public float mo4020c(C0718e eVar) {
        return mo4018b(eVar) * 2.0f;
    }

    /* renamed from: c */
    public void mo4021c(C0718e eVar, float f) {
        m3880j(eVar).mo4037a(f, eVar.mo4032b(), eVar.mo4034d());
        mo4027i(eVar);
    }

    /* renamed from: d */
    public float mo4022d(C0718e eVar) {
        return mo4018b(eVar) * 2.0f;
    }

    /* renamed from: e */
    public void mo4023e(C0718e eVar) {
        mo4021c(eVar, mo4015a(eVar));
    }

    /* renamed from: f */
    public ColorStateList mo4024f(C0718e eVar) {
        return m3880j(eVar).mo4035a();
    }

    /* renamed from: g */
    public void mo4025g(C0718e eVar) {
        mo4021c(eVar, mo4015a(eVar));
    }

    /* renamed from: h */
    public float mo4026h(C0718e eVar) {
        return eVar.mo4029a().getElevation();
    }

    /* renamed from: i */
    public void mo4027i(C0718e eVar) {
        if (!eVar.mo4032b()) {
            eVar.mo4031a(0, 0, 0, 0);
            return;
        }
        float a = mo4015a(eVar);
        float b = mo4018b(eVar);
        int ceil = (int) Math.ceil((double) C0721h.m3939a(a, b, eVar.mo4034d()));
        int ceil2 = (int) Math.ceil((double) C0721h.m3942b(a, b, eVar.mo4034d()));
        eVar.mo4031a(ceil, ceil2, ceil, ceil2);
    }
}
