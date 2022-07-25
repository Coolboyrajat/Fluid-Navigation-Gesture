package p190io.objectbox.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p054c.p083e.p103b.C1253a;
import p054c.p083e.p103b.C1257c;

/* renamed from: io.objectbox.model.ModelRelation */
public final class ModelRelation extends C1257c {
    public static void addId(C1253a aVar, int i) {
        aVar.mo5597c(0, i, 0);
    }

    public static void addName(C1253a aVar, int i) {
        aVar.mo5591b(1, i, 0);
    }

    public static void addTargetEntityId(C1253a aVar, int i) {
        aVar.mo5597c(2, i, 0);
    }

    public static int endModelRelation(C1253a aVar) {
        return aVar.mo5575a();
    }

    public static ModelRelation getRootAsModelRelation(ByteBuffer byteBuffer) {
        return getRootAsModelRelation(byteBuffer, new ModelRelation());
    }

    public static ModelRelation getRootAsModelRelation(ByteBuffer byteBuffer, ModelRelation modelRelation) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelRelation.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelRelation(C1253a aVar) {
        aVar.mo5607i(3);
    }

    public ModelRelation __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4122bb = byteBuffer;
    }

    /* renamed from: id */
    public IdUid mo9567id() {
        return mo9568id(new IdUid());
    }

    /* renamed from: id */
    public IdUid mo9568id(IdUid idUid) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
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

    public IdUid targetEntityId() {
        return targetEntityId(new IdUid());
    }

    public IdUid targetEntityId(IdUid idUid) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }
}
