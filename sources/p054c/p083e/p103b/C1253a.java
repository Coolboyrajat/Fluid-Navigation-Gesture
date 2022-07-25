package p054c.p083e.p103b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import p190io.objectbox.model.PropertyFlags;

/* renamed from: c.e.b.a */
public class C1253a {

    /* renamed from: p */
    static final Charset f4105p = Charset.forName("UTF-8");

    /* renamed from: a */
    ByteBuffer f4106a;

    /* renamed from: b */
    int f4107b;

    /* renamed from: c */
    int f4108c;

    /* renamed from: d */
    int[] f4109d;

    /* renamed from: e */
    int f4110e;

    /* renamed from: f */
    boolean f4111f;

    /* renamed from: g */
    boolean f4112g;

    /* renamed from: h */
    int f4113h;

    /* renamed from: i */
    int[] f4114i;

    /* renamed from: j */
    int f4115j;

    /* renamed from: k */
    int f4116k;

    /* renamed from: l */
    boolean f4117l;

    /* renamed from: m */
    CharsetEncoder f4118m;

    /* renamed from: n */
    ByteBuffer f4119n;

    /* renamed from: o */
    C1254a f4120o;

    /* renamed from: c.e.b.a$a */
    public interface C1254a {
        /* renamed from: a */
        ByteBuffer mo5608a(int i);
    }

    /* renamed from: c.e.b.a$b */
    public static final class C1255b implements C1254a {
        /* renamed from: a */
        public ByteBuffer mo5608a(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public C1253a() {
        this(PropertyFlags.VIRTUAL);
    }

    public C1253a(int i) {
        this(i, new C1255b());
    }

    public C1253a(int i, C1254a aVar) {
        this.f4108c = 1;
        this.f4109d = null;
        this.f4110e = 0;
        this.f4111f = false;
        this.f4112g = false;
        this.f4114i = new int[16];
        this.f4115j = 0;
        this.f4116k = 0;
        this.f4117l = false;
        this.f4118m = f4105p.newEncoder();
        i = i <= 0 ? 1 : i;
        this.f4107b = i;
        this.f4120o = aVar;
        this.f4106a = aVar.mo5608a(i);
    }

    /* renamed from: a */
    static ByteBuffer m6074a(ByteBuffer byteBuffer, C1254a aVar) {
        int capacity = byteBuffer.capacity();
        if ((-1073741824 & capacity) == 0) {
            int i = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer a = aVar.mo5608a(i);
            a.position(i - capacity);
            a.put(byteBuffer);
            return a;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    /* renamed from: a */
    public int mo5575a() {
        int i;
        if (this.f4109d == null || !this.f4111f) {
            throw new AssertionError("FlatBuffers: endObject called without startObject");
        }
        mo5590b(0);
        int e = mo5601e();
        int i2 = this.f4110e - 1;
        while (i2 >= 0 && this.f4109d[i2] == 0) {
            i2--;
        }
        int i3 = i2 + 1;
        while (i2 >= 0) {
            int[] iArr = this.f4109d;
            mo5587a((short) (iArr[i2] != 0 ? e - iArr[i2] : 0));
            i2--;
        }
        mo5587a((short) (e - this.f4113h));
        mo5587a((short) ((i3 + 2) * 2));
        int i4 = 0;
        loop2:
        while (true) {
            if (i4 >= this.f4115j) {
                i = 0;
                break;
            }
            int capacity = this.f4106a.capacity() - this.f4114i[i4];
            int i5 = this.f4107b;
            short s = this.f4106a.getShort(capacity);
            if (s == this.f4106a.getShort(i5)) {
                int i6 = 2;
                while (i6 < s) {
                    if (this.f4106a.getShort(capacity + i6) == this.f4106a.getShort(i5 + i6)) {
                        i6 += 2;
                    }
                }
                i = this.f4114i[i4];
                break loop2;
            }
            i4++;
        }
        if (i != 0) {
            this.f4107b = this.f4106a.capacity() - e;
            this.f4106a.putInt(this.f4107b, i - e);
        } else {
            int i7 = this.f4115j;
            int[] iArr2 = this.f4114i;
            if (i7 == iArr2.length) {
                this.f4114i = Arrays.copyOf(iArr2, i7 * 2);
            }
            int[] iArr3 = this.f4114i;
            int i8 = this.f4115j;
            this.f4115j = i8 + 1;
            iArr3[i8] = mo5601e();
            ByteBuffer byteBuffer = this.f4106a;
            byteBuffer.putInt(byteBuffer.capacity() - e, mo5601e() - e);
        }
        this.f4111f = false;
        return e;
    }

    /* renamed from: a */
    public int mo5576a(CharSequence charSequence) {
        int length = (int) (((float) charSequence.length()) * this.f4118m.maxBytesPerChar());
        ByteBuffer byteBuffer = this.f4119n;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            this.f4119n = ByteBuffer.allocate(Math.max(PropertyFlags.ID_SELF_ASSIGNABLE, length));
        }
        this.f4119n.clear();
        CoderResult encode = this.f4118m.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), this.f4119n, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new Error(e);
            }
        }
        this.f4119n.flip();
        return mo5577a(this.f4119n);
    }

    /* renamed from: a */
    public int mo5577a(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        mo5579a((byte) 0);
        mo5600d(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f4106a;
        int i = this.f4107b - remaining;
        this.f4107b = i;
        byteBuffer2.position(i);
        this.f4106a.put(byteBuffer);
        return mo5588b();
    }

    /* renamed from: a */
    public int mo5578a(int[] iArr) {
        mo5598d();
        mo5600d(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            mo5596c(iArr[length]);
        }
        return mo5588b();
    }

    /* renamed from: a */
    public void mo5579a(byte b) {
        mo5581a(1, 0);
        mo5589b(b);
    }

    /* renamed from: a */
    public void mo5580a(int i) {
        if (i != mo5601e()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    /* renamed from: a */
    public void mo5581a(int i, int i2) {
        if (i > this.f4108c) {
            this.f4108c = i;
        }
        int i3 = ((~((this.f4106a.capacity() - this.f4107b) + i2)) + 1) & (i - 1);
        while (this.f4107b < i3 + i + i2) {
            int capacity = this.f4106a.capacity();
            this.f4106a = m6074a(this.f4106a, this.f4120o);
            this.f4107b += this.f4106a.capacity() - capacity;
        }
        mo5603f(i3);
    }

    /* renamed from: a */
    public void mo5582a(int i, int i2, int i3) {
        if (this.f4117l || i2 != i3) {
            mo5590b(i2);
            mo5606h(i);
        }
    }

    /* renamed from: a */
    public void mo5583a(int i, long j, long j2) {
        if (this.f4117l || j != j2) {
            mo5586a(j);
            mo5606h(i);
        }
    }

    /* renamed from: a */
    public void mo5584a(int i, short s, int i2) {
        if (this.f4117l || s != i2) {
            mo5587a(s);
            mo5606h(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5585a(int i, boolean z) {
        mo5581a(this.f4108c, (z ? 4 : 0) + 4);
        mo5596c(i);
        if (z) {
            mo5590b(this.f4106a.capacity() - this.f4107b);
        }
        this.f4106a.position(this.f4107b);
        this.f4112g = true;
    }

    /* renamed from: a */
    public void mo5586a(long j) {
        mo5581a(8, 0);
        mo5592b(j);
    }

    /* renamed from: a */
    public void mo5587a(short s) {
        mo5581a(2, 0);
        mo5593b(s);
    }

    /* renamed from: b */
    public int mo5588b() {
        if (this.f4111f) {
            this.f4111f = false;
            mo5605g(this.f4116k);
            return mo5601e();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    /* renamed from: b */
    public void mo5589b(byte b) {
        ByteBuffer byteBuffer = this.f4106a;
        int i = this.f4107b - 1;
        this.f4107b = i;
        byteBuffer.put(i, b);
    }

    /* renamed from: b */
    public void mo5590b(int i) {
        mo5581a(4, 0);
        mo5605g(i);
    }

    /* renamed from: b */
    public void mo5591b(int i, int i2, int i3) {
        if (this.f4117l || i2 != i3) {
            mo5596c(i2);
            mo5606h(i);
        }
    }

    /* renamed from: b */
    public void mo5592b(long j) {
        ByteBuffer byteBuffer = this.f4106a;
        int i = this.f4107b - 8;
        this.f4107b = i;
        byteBuffer.putLong(i, j);
    }

    /* renamed from: b */
    public void mo5593b(short s) {
        ByteBuffer byteBuffer = this.f4106a;
        int i = this.f4107b - 2;
        this.f4107b = i;
        byteBuffer.putShort(i, s);
    }

    /* renamed from: b */
    public byte[] mo5594b(int i, int i2) {
        mo5595c();
        byte[] bArr = new byte[i2];
        this.f4106a.position(i);
        this.f4106a.get(bArr);
        return bArr;
    }

    /* renamed from: c */
    public void mo5595c() {
        if (!this.f4112g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    /* renamed from: c */
    public void mo5596c(int i) {
        mo5581a(4, 0);
        mo5605g((mo5601e() - i) + 4);
    }

    /* renamed from: c */
    public void mo5597c(int i, int i2, int i3) {
        if (i2 != i3) {
            mo5580a(i2);
            mo5606h(i);
        }
    }

    /* renamed from: d */
    public void mo5598d() {
        if (this.f4111f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    /* renamed from: d */
    public void mo5599d(int i) {
        mo5585a(i, false);
    }

    /* renamed from: d */
    public void mo5600d(int i, int i2, int i3) {
        mo5598d();
        this.f4116k = i2;
        int i4 = i * i2;
        mo5581a(4, i4);
        mo5581a(i3, i4);
        this.f4111f = true;
    }

    /* renamed from: e */
    public int mo5601e() {
        return this.f4106a.capacity() - this.f4107b;
    }

    /* renamed from: e */
    public void mo5602e(int i) {
        mo5585a(i, true);
    }

    /* renamed from: f */
    public void mo5603f(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f4106a;
            int i3 = this.f4107b - 1;
            this.f4107b = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    /* renamed from: f */
    public byte[] mo5604f() {
        return mo5594b(this.f4107b, this.f4106a.capacity() - this.f4107b);
    }

    /* renamed from: g */
    public void mo5605g(int i) {
        ByteBuffer byteBuffer = this.f4106a;
        int i2 = this.f4107b - 4;
        this.f4107b = i2;
        byteBuffer.putInt(i2, i);
    }

    /* renamed from: h */
    public void mo5606h(int i) {
        this.f4109d[i] = mo5601e();
    }

    /* renamed from: i */
    public void mo5607i(int i) {
        mo5598d();
        int[] iArr = this.f4109d;
        if (iArr == null || iArr.length < i) {
            this.f4109d = new int[i];
        }
        this.f4110e = i;
        Arrays.fill(this.f4109d, 0, this.f4110e, 0);
        this.f4111f = true;
        this.f4113h = mo5601e();
    }
}
