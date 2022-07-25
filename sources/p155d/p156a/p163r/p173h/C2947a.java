package p155d.p156a.p163r.p173h;

import p155d.p156a.C2793k;
import p155d.p156a.p162q.C2830h;

/* renamed from: d.a.r.h.a */
public class C2947a<T> {

    /* renamed from: a */
    final int f7675a;

    /* renamed from: b */
    final Object[] f7676b;

    /* renamed from: c */
    Object[] f7677c = this.f7676b;

    /* renamed from: d */
    int f7678d;

    /* renamed from: d.a.r.h.a$a */
    public interface C2948a<T> extends C2830h<T> {
        /* renamed from: a */
        boolean mo6042a(T t);
    }

    public C2947a(int i) {
        this.f7675a = i;
        this.f7676b = new Object[(i + 1)];
    }

    /* renamed from: a */
    public void mo9050a(C2948a<? super T> aVar) {
        int i = this.f7675a;
        for (Object[] objArr = this.f7676b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.mo6042a(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9051a(T r4) {
        /*
            r3 = this;
            int r0 = r3.f7675a
            int r1 = r3.f7678d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f7677c
            r2[r0] = r1
            r3.f7677c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f7677c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f7678d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155d.p156a.p163r.p173h.C2947a.mo9051a(java.lang.Object):void");
    }

    /* renamed from: a */
    public <U> boolean mo9052a(C2793k<? super U> kVar) {
        Object[] objArr = this.f7676b;
        int i = this.f7675a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C2953e.m11398b(objArr2, kVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: b */
    public void mo9053b(T t) {
        this.f7676b[0] = t;
    }
}
