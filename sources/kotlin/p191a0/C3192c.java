package kotlin.p191a0;

import java.util.NoSuchElementException;
import kotlin.p195s.C3297v;

/* renamed from: kotlin.a0.c */
public final class C3192c extends C3297v {

    /* renamed from: f */
    private final int f7937f;

    /* renamed from: g */
    private boolean f7938g;

    /* renamed from: h */
    private int f7939h;

    /* renamed from: i */
    private final int f7940i;

    public C3192c(int i, int i2, int i3) {
        this.f7940i = i3;
        this.f7937f = i2;
        boolean z = true;
        if (this.f7940i <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f7938g = z;
        this.f7939h = !this.f7938g ? this.f7937f : i;
    }

    /* renamed from: a */
    public int mo9906a() {
        int i = this.f7939h;
        if (i != this.f7937f) {
            this.f7939h = this.f7940i + i;
        } else if (this.f7938g) {
            this.f7938g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f7938g;
    }
}
