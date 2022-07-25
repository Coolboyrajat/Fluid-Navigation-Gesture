package p179e.p180a.p181a.p182a;

/* renamed from: e.a.a.a.b */
public class C2977b<T> {

    /* renamed from: a */
    private C2978a<T>[] f7732a;

    /* renamed from: b */
    private int f7733b;

    /* renamed from: c */
    private int f7734c;

    /* renamed from: d */
    private volatile int f7735d;

    /* renamed from: e.a.a.a.b$a */
    public static final class C2978a<T> {

        /* renamed from: a */
        public final long f7736a;

        /* renamed from: b */
        public T f7737b;

        /* renamed from: c */
        C2978a<T> f7738c;

        C2978a(long j, T t, C2978a<T> aVar) {
            this.f7736a = j;
            this.f7737b = t;
            this.f7738c = aVar;
        }
    }

    public C2977b() {
        this(16);
    }

    public C2977b(int i) {
        this.f7733b = i;
        this.f7734c = (i * 4) / 3;
        this.f7732a = new C2978a[i];
    }

    /* renamed from: a */
    public T mo9098a(long j) {
        for (C2978a<T> aVar = this.f7732a[((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f7733b]; aVar != null; aVar = aVar.f7738c) {
            if (aVar.f7736a == j) {
                return aVar.f7737b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public T mo9099a(long j, T t) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.f7733b;
        C2978a<T> aVar = this.f7732a[i];
        for (C2978a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f7738c) {
            if (aVar2.f7736a == j) {
                T t2 = aVar2.f7737b;
                aVar2.f7737b = t;
                return t2;
            }
        }
        this.f7732a[i] = new C2978a<>(j, t, aVar);
        this.f7735d++;
        if (this.f7735d <= this.f7734c) {
            return null;
        }
        mo9100a(this.f7733b * 2);
        return null;
    }

    /* renamed from: a */
    public void mo9100a(int i) {
        C2978a<T>[] aVarArr = new C2978a[i];
        for (C2978a<T> aVar : this.f7732a) {
            while (aVar != null) {
                long j = aVar.f7736a;
                int i2 = ((((int) (j >>> 32)) ^ ((int) j)) & Integer.MAX_VALUE) % i;
                C2978a<T> aVar2 = aVar.f7738c;
                aVar.f7738c = aVarArr[i2];
                aVarArr[i2] = aVar;
                aVar = aVar2;
            }
        }
        this.f7732a = aVarArr;
        this.f7733b = i;
        this.f7734c = (i * 4) / 3;
    }

    /* renamed from: a */
    public long[] mo9101a() {
        long[] jArr = new long[this.f7735d];
        int i = 0;
        for (C2978a<T> aVar : this.f7732a) {
            while (aVar != null) {
                jArr[i] = aVar.f7736a;
                aVar = aVar.f7738c;
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: b */
    public int mo9102b() {
        return this.f7735d;
    }
}
