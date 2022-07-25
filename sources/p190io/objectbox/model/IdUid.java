package p190io.objectbox.model;

import java.nio.ByteBuffer;
import p054c.p083e.p103b.C1253a;
import p054c.p083e.p103b.C1256b;

/* renamed from: io.objectbox.model.IdUid */
public final class IdUid extends C1256b {
    public static int createIdUid(C1253a aVar, long j, long j2) {
        aVar.mo5581a(8, 16);
        aVar.mo5592b(j2);
        aVar.mo5603f(4);
        aVar.mo5605g((int) j);
        return aVar.mo5601e();
    }

    public IdUid __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        this.bb_pos = i;
        this.f4121bb = byteBuffer;
    }

    /* renamed from: id */
    public long mo9505id() {
        return ((long) this.f4121bb.getInt(this.bb_pos + 0)) & 4294967295L;
    }

    public long uid() {
        return this.f4121bb.getLong(this.bb_pos + 8);
    }
}
