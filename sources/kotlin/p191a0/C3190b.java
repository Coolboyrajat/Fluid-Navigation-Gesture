package kotlin.p191a0;

import kotlin.p195s.C3297v;
import kotlin.p201v.C3343c;
import kotlin.p205x.p207d.p208c0.C3362a;

/* renamed from: kotlin.a0.b */
public class C3190b implements Iterable<Integer>, C3362a {

    /* renamed from: i */
    public static final C3191a f7933i = new C3191a((C3366g) null);

    /* renamed from: f */
    private final int f7934f;

    /* renamed from: g */
    private final int f7935g;

    /* renamed from: h */
    private final int f7936h;

    /* renamed from: kotlin.a0.b$a */
    public static final class C3191a {
        private C3191a() {
        }

        public /* synthetic */ C3191a(C3366g gVar) {
            this();
        }

        /* renamed from: a */
        public final C3190b mo9905a(int i, int i2, int i3) {
            return new C3190b(i, i2, i3);
        }
    }

    public C3190b(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f7934f = i;
            this.f7935g = C3343c.m12183b(i, i2, i3);
            this.f7936h = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo9897a() {
        return this.f7934f;
    }

    /* renamed from: b */
    public final int mo9898b() {
        return this.f7935g;
    }

    /* renamed from: c */
    public final int mo9899c() {
        return this.f7936h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3190b) {
            if (!isEmpty() || !((C3190b) obj).isEmpty()) {
                C3190b bVar = (C3190b) obj;
                if (!(this.f7934f == bVar.f7934f && this.f7935g == bVar.f7935g && this.f7936h == bVar.f7936h)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7934f * 31) + this.f7935g) * 31) + this.f7936h;
    }

    public boolean isEmpty() {
        if (this.f7936h > 0) {
            if (this.f7934f > this.f7935g) {
                return true;
            }
        } else if (this.f7934f < this.f7935g) {
            return true;
        }
        return false;
    }

    public C3297v iterator() {
        return new C3192c(this.f7934f, this.f7935g, this.f7936h);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f7936h > 0) {
            sb = new StringBuilder();
            sb.append(this.f7934f);
            sb.append("..");
            sb.append(this.f7935g);
            sb.append(" step ");
            i = this.f7936h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f7934f);
            sb.append(" downTo ");
            sb.append(this.f7935g);
            sb.append(" step ");
            i = -this.f7936h;
        }
        sb.append(i);
        return sb.toString();
    }
}
