package p006b.p022e.p023a;

import java.util.Arrays;
import p190io.objectbox.android.BuildConfig;

/* renamed from: b.e.a.i */
public class C0747i {

    /* renamed from: k */
    private static int f2933k = 1;

    /* renamed from: a */
    private String f2934a;

    /* renamed from: b */
    public int f2935b = -1;

    /* renamed from: c */
    int f2936c = -1;

    /* renamed from: d */
    public int f2937d = 0;

    /* renamed from: e */
    public float f2938e;

    /* renamed from: f */
    float[] f2939f = new float[7];

    /* renamed from: g */
    C0748a f2940g;

    /* renamed from: h */
    C0739b[] f2941h = new C0739b[8];

    /* renamed from: i */
    int f2942i = 0;

    /* renamed from: j */
    public int f2943j = 0;

    /* renamed from: b.e.a.i$a */
    public enum C0748a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0747i(C0748a aVar, String str) {
        this.f2940g = aVar;
    }

    /* renamed from: b */
    static void m4139b() {
        f2933k++;
    }

    /* renamed from: a */
    public void mo4292a() {
        this.f2934a = null;
        this.f2940g = C0748a.UNKNOWN;
        this.f2937d = 0;
        this.f2935b = -1;
        this.f2936c = -1;
        this.f2938e = 0.0f;
        this.f2942i = 0;
        this.f2943j = 0;
    }

    /* renamed from: a */
    public final void mo4293a(C0739b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f2942i;
            if (i >= i2) {
                C0739b[] bVarArr = this.f2941h;
                if (i2 >= bVarArr.length) {
                    this.f2941h = (C0739b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0739b[] bVarArr2 = this.f2941h;
                int i3 = this.f2942i;
                bVarArr2[i3] = bVar;
                this.f2942i = i3 + 1;
                return;
            } else if (this.f2941h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo4294a(C0748a aVar, String str) {
        this.f2940g = aVar;
    }

    /* renamed from: b */
    public final void mo4295b(C0739b bVar) {
        int i = this.f2942i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2941h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0739b[] bVarArr = this.f2941h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f2942i--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo4296c(C0739b bVar) {
        int i = this.f2942i;
        for (int i2 = 0; i2 < i; i2++) {
            C0739b[] bVarArr = this.f2941h;
            bVarArr[i2].f2882d.mo4232a(bVarArr[i2], bVar, false);
        }
        this.f2942i = 0;
    }

    public String toString() {
        return BuildConfig.FLAVOR + this.f2934a;
    }
}
