package p190io.objectbox.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p054c.p083e.p103b.C1253a;
import p054c.p083e.p103b.C1257c;

/* renamed from: io.objectbox.model.ModelProperty */
public final class ModelProperty extends C1257c {
    public static void addFlags(C1253a aVar, long j) {
        aVar.mo5582a(3, (int) j, 0);
    }

    public static void addId(C1253a aVar, int i) {
        aVar.mo5597c(0, i, 0);
    }

    public static void addIndexId(C1253a aVar, int i) {
        aVar.mo5597c(4, i, 0);
    }

    public static void addMaxIndexValueLength(C1253a aVar, long j) {
        aVar.mo5582a(8, (int) j, 0);
    }

    public static void addName(C1253a aVar, int i) {
        aVar.mo5591b(1, i, 0);
    }

    public static void addNameSecondary(C1253a aVar, int i) {
        aVar.mo5591b(7, i, 0);
    }

    public static void addTargetEntity(C1253a aVar, int i) {
        aVar.mo5591b(5, i, 0);
    }

    public static void addType(C1253a aVar, int i) {
        aVar.mo5584a(2, (short) i, 0);
    }

    public static void addVirtualTarget(C1253a aVar, int i) {
        aVar.mo5591b(6, i, 0);
    }

    public static int endModelProperty(C1253a aVar) {
        return aVar.mo5575a();
    }

    public static ModelProperty getRootAsModelProperty(ByteBuffer byteBuffer) {
        return getRootAsModelProperty(byteBuffer, new ModelProperty());
    }

    public static ModelProperty getRootAsModelProperty(ByteBuffer byteBuffer, ModelProperty modelProperty) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelProperty.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelProperty(C1253a aVar) {
        aVar.mo5607i(9);
    }

    public ModelProperty __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4122bb = byteBuffer;
    }

    public long flags() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return ((long) this.f4122bb.getInt(__offset + this.bb_pos)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: id */
    public IdUid mo9547id() {
        return mo9548id(new IdUid());
    }

    /* renamed from: id */
    public IdUid mo9548id(IdUid idUid) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public IdUid indexId() {
        return indexId(new IdUid());
    }

    public IdUid indexId(IdUid idUid) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public long maxIndexValueLength() {
        int __offset = __offset(20);
        if (__offset != 0) {
            return ((long) this.f4122bb.getInt(__offset + this.bb_pos)) & 4294967295L;
        }
        return 0;
    }

    public String name() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public String nameSecondary() {
        int __offset = __offset(18);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameSecondaryAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public ByteBuffer nameSecondaryInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public String targetEntity() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer targetEntityAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public ByteBuffer targetEntityInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public int type() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f4122bb.getShort(__offset + this.bb_pos) & 65535;
        }
        return 0;
    }

    public String virtualTarget() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer virtualTargetAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer virtualTargetInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }
}
