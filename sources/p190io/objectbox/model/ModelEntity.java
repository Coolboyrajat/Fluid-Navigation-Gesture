package p190io.objectbox.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p054c.p083e.p103b.C1253a;
import p054c.p083e.p103b.C1257c;

/* renamed from: io.objectbox.model.ModelEntity */
public final class ModelEntity extends C1257c {
    public static void addFlags(C1253a aVar, long j) {
        aVar.mo5582a(5, (int) j, 0);
    }

    public static void addId(C1253a aVar, int i) {
        aVar.mo5597c(0, i, 0);
    }

    public static void addLastPropertyId(C1253a aVar, int i) {
        aVar.mo5597c(3, i, 0);
    }

    public static void addName(C1253a aVar, int i) {
        aVar.mo5591b(1, i, 0);
    }

    public static void addNameSecondary(C1253a aVar, int i) {
        aVar.mo5591b(6, i, 0);
    }

    public static void addProperties(C1253a aVar, int i) {
        aVar.mo5591b(2, i, 0);
    }

    public static void addRelations(C1253a aVar, int i) {
        aVar.mo5591b(4, i, 0);
    }

    public static int createPropertiesVector(C1253a aVar, int[] iArr) {
        aVar.mo5600d(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            aVar.mo5596c(iArr[length]);
        }
        return aVar.mo5588b();
    }

    public static int createRelationsVector(C1253a aVar, int[] iArr) {
        aVar.mo5600d(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            aVar.mo5596c(iArr[length]);
        }
        return aVar.mo5588b();
    }

    public static int endModelEntity(C1253a aVar) {
        return aVar.mo5575a();
    }

    public static ModelEntity getRootAsModelEntity(ByteBuffer byteBuffer) {
        return getRootAsModelEntity(byteBuffer, new ModelEntity());
    }

    public static ModelEntity getRootAsModelEntity(ByteBuffer byteBuffer, ModelEntity modelEntity) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelEntity.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelEntity(C1253a aVar) {
        aVar.mo5607i(7);
    }

    public static void startPropertiesVector(C1253a aVar, int i) {
        aVar.mo5600d(4, i, 4);
    }

    public static void startRelationsVector(C1253a aVar, int i) {
        aVar.mo5600d(4, i, 4);
    }

    public ModelEntity __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4122bb = byteBuffer;
    }

    public long flags() {
        int __offset = __offset(14);
        if (__offset != 0) {
            return ((long) this.f4122bb.getInt(__offset + this.bb_pos)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: id */
    public IdUid mo9528id() {
        return mo9529id(new IdUid());
    }

    /* renamed from: id */
    public IdUid mo9529id(IdUid idUid) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public IdUid lastPropertyId() {
        return lastPropertyId(new IdUid());
    }

    public IdUid lastPropertyId(IdUid idUid) {
        int __offset = __offset(10);
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

    public String nameSecondary() {
        int __offset = __offset(16);
        if (__offset != 0) {
            return __string(__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameSecondaryAsByteBuffer() {
        return __vector_as_bytebuffer(16, 1);
    }

    public ByteBuffer nameSecondaryInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 16, 1);
    }

    public ModelProperty properties(int i) {
        return properties(new ModelProperty(), i);
    }

    public ModelProperty properties(ModelProperty modelProperty, int i) {
        int __offset = __offset(8);
        if (__offset != 0) {
            return modelProperty.__assign(__indirect(__vector(__offset) + (i * 4)), this.f4122bb);
        }
        return null;
    }

    public int propertiesLength() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public ModelRelation relations(int i) {
        return relations(new ModelRelation(), i);
    }

    public ModelRelation relations(ModelRelation modelRelation, int i) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return modelRelation.__assign(__indirect(__vector(__offset) + (i * 4)), this.f4122bb);
        }
        return null;
    }

    public int relationsLength() {
        int __offset = __offset(12);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }
}
