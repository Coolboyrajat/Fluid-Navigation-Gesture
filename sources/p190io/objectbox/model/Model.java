package p190io.objectbox.model;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p054c.p083e.p103b.C1253a;
import p054c.p083e.p103b.C1257c;

/* renamed from: io.objectbox.model.Model */
public final class Model extends C1257c {
    public static void addEntities(C1253a aVar, int i) {
        aVar.mo5591b(3, i, 0);
    }

    public static void addLastEntityId(C1253a aVar, int i) {
        aVar.mo5597c(4, i, 0);
    }

    public static void addLastIndexId(C1253a aVar, int i) {
        aVar.mo5597c(5, i, 0);
    }

    public static void addLastRelationId(C1253a aVar, int i) {
        aVar.mo5597c(7, i, 0);
    }

    public static void addLastSequenceId(C1253a aVar, int i) {
        aVar.mo5597c(6, i, 0);
    }

    public static void addModelVersion(C1253a aVar, long j) {
        aVar.mo5582a(0, (int) j, 0);
    }

    public static void addName(C1253a aVar, int i) {
        aVar.mo5591b(1, i, 0);
    }

    public static void addVersion(C1253a aVar, long j) {
        aVar.mo5583a(2, j, 0);
    }

    public static int createEntitiesVector(C1253a aVar, int[] iArr) {
        aVar.mo5600d(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            aVar.mo5596c(iArr[length]);
        }
        return aVar.mo5588b();
    }

    public static int endModel(C1253a aVar) {
        return aVar.mo5575a();
    }

    public static void finishModelBuffer(C1253a aVar, int i) {
        aVar.mo5599d(i);
    }

    public static void finishSizePrefixedModelBuffer(C1253a aVar, int i) {
        aVar.mo5602e(i);
    }

    public static Model getRootAsModel(ByteBuffer byteBuffer) {
        return getRootAsModel(byteBuffer, new Model());
    }

    public static Model getRootAsModel(ByteBuffer byteBuffer, Model model) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return model.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startEntitiesVector(C1253a aVar, int i) {
        aVar.mo5600d(4, i, 4);
    }

    public static void startModel(C1253a aVar) {
        aVar.mo5607i(8);
    }

    public Model __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4122bb = byteBuffer;
    }

    public ModelEntity entities(int i) {
        return entities(new ModelEntity(), i);
    }

    public ModelEntity entities(ModelEntity modelEntity, int i) {
        int __offset = __offset(10);
        if (__offset != 0) {
            return modelEntity.__assign(__indirect(__vector(__offset) + (i * 4)), this.f4122bb);
        }
        return null;
    }

    public int entitiesLength() {
        int __offset = __offset(10);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public IdUid lastEntityId() {
        return lastEntityId(new IdUid());
    }

    public IdUid lastEntityId(IdUid idUid) {
        int __offset = __offset(12);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public IdUid lastIndexId() {
        return lastIndexId(new IdUid());
    }

    public IdUid lastIndexId(IdUid idUid) {
        int __offset = __offset(14);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public IdUid lastRelationId() {
        return lastRelationId(new IdUid());
    }

    public IdUid lastRelationId(IdUid idUid) {
        int __offset = __offset(18);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public IdUid lastSequenceId() {
        return lastSequenceId(new IdUid());
    }

    public IdUid lastSequenceId(IdUid idUid) {
        int __offset = __offset(16);
        if (__offset != 0) {
            return idUid.__assign(__offset + this.bb_pos, this.f4122bb);
        }
        return null;
    }

    public long modelVersion() {
        int __offset = __offset(4);
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

    public long version() {
        int __offset = __offset(8);
        if (__offset != 0) {
            return this.f4122bb.getLong(__offset + this.bb_pos);
        }
        return 0;
    }
}
