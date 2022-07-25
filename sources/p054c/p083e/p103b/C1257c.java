package p054c.p083e.p103b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: c.e.b.c */
public class C1257c {
    private static final ThreadLocal<CharBuffer> CHAR_BUFFER = new ThreadLocal<>();
    public static final ThreadLocal<Charset> UTF8_CHARSET = new C1259b();
    private static final ThreadLocal<CharsetDecoder> UTF8_DECODER = new C1258a();

    /* renamed from: bb */
    protected ByteBuffer f4122bb;
    protected int bb_pos;

    /* renamed from: c.e.b.c$a */
    static class C1258a extends ThreadLocal<CharsetDecoder> {
        C1258a() {
        }

        /* access modifiers changed from: protected */
        public CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    }

    /* renamed from: c.e.b.c$b */
    static class C1259b extends ThreadLocal<Charset> {
        C1259b() {
        }

        /* access modifiers changed from: protected */
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    }

    /* renamed from: c.e.b.c$c */
    class C1260c implements Comparator<Integer> {

        /* renamed from: f */
        final /* synthetic */ ByteBuffer f4123f;

        C1260c(ByteBuffer byteBuffer) {
            this.f4123f = byteBuffer;
        }

        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            return C1257c.this.keysCompare(num, num2, this.f4123f);
        }
    }

    protected static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    protected static int __indirect(int i, ByteBuffer byteBuffer) {
        return i + byteBuffer.getInt(i);
    }

    protected static int __offset(int i, int i2, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    protected static int compareStrings(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = i + byteBuffer.getInt(i);
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    protected static int compareStrings(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = i + byteBuffer.getInt(i);
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    /* access modifiers changed from: protected */
    public int __indirect(int i) {
        return i + this.f4122bb.getInt(i);
    }

    /* access modifiers changed from: protected */
    public int __offset(int i) {
        int i2 = this.bb_pos;
        int i3 = i2 - this.f4122bb.getInt(i2);
        if (i < this.f4122bb.getShort(i3)) {
            return this.f4122bb.getShort(i3 + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public String __string(int i) {
        CharsetDecoder charsetDecoder = UTF8_DECODER.get();
        charsetDecoder.reset();
        int i2 = i + this.f4122bb.getInt(i);
        ByteBuffer order = this.f4122bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = order.getInt(i2);
        int i4 = i2 + 4;
        order.position(i4);
        order.limit(i4 + i3);
        int maxCharsPerByte = (int) (((float) i3) * charsetDecoder.maxCharsPerByte());
        CharBuffer charBuffer = CHAR_BUFFER.get();
        if (charBuffer == null || charBuffer.capacity() < maxCharsPerByte) {
            charBuffer = CharBuffer.allocate(maxCharsPerByte);
            CHAR_BUFFER.set(charBuffer);
        }
        charBuffer.clear();
        try {
            CoderResult decode = charsetDecoder.decode(order, charBuffer, true);
            if (!decode.isUnderflow()) {
                decode.throwException();
            }
            return charBuffer.flip().toString();
        } catch (CharacterCodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public C1257c __union(C1257c cVar, int i) {
        int i2 = i + this.bb_pos;
        cVar.bb_pos = i2 + this.f4122bb.getInt(i2);
        cVar.f4122bb = this.f4122bb;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public int __vector(int i) {
        int i2 = i + this.bb_pos;
        return i2 + this.f4122bb.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    public ByteBuffer __vector_as_bytebuffer(int i, int i2) {
        int __offset = __offset(i);
        if (__offset == 0) {
            return null;
        }
        ByteBuffer order = this.f4122bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int __vector = __vector(__offset);
        order.position(__vector);
        order.limit(__vector + (__vector_len(__offset) * i2));
        return order;
    }

    /* access modifiers changed from: protected */
    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i, int i2) {
        int __offset = __offset(i);
        if (__offset == 0) {
            return null;
        }
        int __vector = __vector(__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(__offset) * i2) + __vector);
        byteBuffer.position(__vector);
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public int __vector_len(int i) {
        int i2 = i + this.bb_pos;
        return this.f4122bb.getInt(i2 + this.f4122bb.getInt(i2));
    }

    public ByteBuffer getByteBuffer() {
        return this.f4122bb;
    }

    /* access modifiers changed from: protected */
    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void sortTables(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new C1260c(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }
}
