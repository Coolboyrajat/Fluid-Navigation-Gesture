package p006b.p022e.p023a.p024j;

import java.util.Arrays;

/* renamed from: b.e.a.j.j */
public class C0765j extends C0758f {

    /* renamed from: k0 */
    protected C0758f[] f3105k0 = new C0758f[4];

    /* renamed from: l0 */
    protected int f3106l0 = 0;

    /* renamed from: J */
    public void mo4421J() {
        this.f3106l0 = 0;
    }

    /* renamed from: b */
    public void mo4425b(C0758f fVar) {
        int i = this.f3106l0 + 1;
        C0758f[] fVarArr = this.f3105k0;
        if (i > fVarArr.length) {
            this.f3105k0 = (C0758f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        C0758f[] fVarArr2 = this.f3105k0;
        int i2 = this.f3106l0;
        fVarArr2[i2] = fVar;
        this.f3106l0 = i2 + 1;
    }
}
