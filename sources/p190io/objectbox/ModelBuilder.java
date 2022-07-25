package p190io.objectbox;

import java.util.ArrayList;
import java.util.List;
import p054c.p083e.p103b.C1253a;
import p190io.objectbox.annotation.apihint.Internal;
import p190io.objectbox.model.IdUid;
import p190io.objectbox.model.Model;
import p190io.objectbox.model.ModelEntity;
import p190io.objectbox.model.ModelProperty;
import p190io.objectbox.model.ModelRelation;

@Internal
/* renamed from: io.objectbox.ModelBuilder */
public class ModelBuilder {
    private static final int MODEL_VERSION = 2;
    final List<Integer> entityOffsets = new ArrayList();
    final C1253a fbb = new C1253a();
    Integer lastEntityId;
    Long lastEntityUid;
    Integer lastIndexId;
    Long lastIndexUid;
    Integer lastRelationId;
    Long lastRelationUid;
    long version = 1;

    /* renamed from: io.objectbox.ModelBuilder$EntityBuilder */
    public class EntityBuilder {
        boolean finished;
        Integer flags;

        /* renamed from: id */
        Integer f7907id;
        Integer lastPropertyId;
        Long lastPropertyUid;
        final String name;
        PropertyBuilder propertyBuilder;
        final List<Integer> propertyOffsets = new ArrayList();
        final List<Integer> relationOffsets = new ArrayList();
        Long uid;

        EntityBuilder(String str) {
            this.name = str;
        }

        private void checkNotFinished() {
            if (this.finished) {
                throw new IllegalStateException("Already finished");
            }
        }

        /* access modifiers changed from: package-private */
        public void checkFinishProperty() {
            PropertyBuilder propertyBuilder2 = this.propertyBuilder;
            if (propertyBuilder2 != null) {
                this.propertyOffsets.add(Integer.valueOf(propertyBuilder2.finish()));
                this.propertyBuilder = null;
            }
        }

        public ModelBuilder entityDone() {
            checkNotFinished();
            checkFinishProperty();
            this.finished = true;
            int a = ModelBuilder.this.fbb.mo5576a((CharSequence) this.name);
            int createVector = ModelBuilder.this.createVector(this.propertyOffsets);
            int createVector2 = this.relationOffsets.isEmpty() ? 0 : ModelBuilder.this.createVector(this.relationOffsets);
            ModelEntity.startModelEntity(ModelBuilder.this.fbb);
            ModelEntity.addName(ModelBuilder.this.fbb, a);
            ModelEntity.addProperties(ModelBuilder.this.fbb, createVector);
            if (createVector2 != 0) {
                ModelEntity.addRelations(ModelBuilder.this.fbb, createVector2);
            }
            Integer num = this.f7907id;
            if (!(num == null || this.uid == null)) {
                ModelEntity.addId(ModelBuilder.this.fbb, IdUid.createIdUid(ModelBuilder.this.fbb, (long) num.intValue(), this.uid.longValue()));
            }
            Integer num2 = this.lastPropertyId;
            if (num2 != null) {
                ModelEntity.addLastPropertyId(ModelBuilder.this.fbb, IdUid.createIdUid(ModelBuilder.this.fbb, (long) num2.intValue(), this.lastPropertyUid.longValue()));
            }
            Integer num3 = this.flags;
            if (num3 != null) {
                ModelEntity.addFlags(ModelBuilder.this.fbb, (long) num3.intValue());
            }
            ModelBuilder modelBuilder = ModelBuilder.this;
            modelBuilder.entityOffsets.add(Integer.valueOf(ModelEntity.endModelEntity(modelBuilder.fbb)));
            return ModelBuilder.this;
        }

        public EntityBuilder flags(int i) {
            this.flags = Integer.valueOf(i);
            return this;
        }

        /* renamed from: id */
        public EntityBuilder mo9406id(int i, long j) {
            checkNotFinished();
            this.f7907id = Integer.valueOf(i);
            this.uid = Long.valueOf(j);
            return this;
        }

        public EntityBuilder lastPropertyId(int i, long j) {
            checkNotFinished();
            this.lastPropertyId = Integer.valueOf(i);
            this.lastPropertyUid = Long.valueOf(j);
            return this;
        }

        public PropertyBuilder property(String str, int i) {
            return property(str, (String) null, i);
        }

        public PropertyBuilder property(String str, String str2, int i) {
            return property(str, str2, (String) null, i);
        }

        public PropertyBuilder property(String str, String str2, String str3, int i) {
            checkNotFinished();
            checkFinishProperty();
            this.propertyBuilder = new PropertyBuilder(str, str2, str3, i);
            return this.propertyBuilder;
        }

        public EntityBuilder relation(String str, int i, long j, int i2, long j2) {
            checkNotFinished();
            checkFinishProperty();
            int a = ModelBuilder.this.fbb.mo5576a((CharSequence) str);
            ModelRelation.startModelRelation(ModelBuilder.this.fbb);
            ModelRelation.addName(ModelBuilder.this.fbb, a);
            ModelRelation.addId(ModelBuilder.this.fbb, IdUid.createIdUid(ModelBuilder.this.fbb, (long) i, j));
            ModelRelation.addTargetEntityId(ModelBuilder.this.fbb, IdUid.createIdUid(ModelBuilder.this.fbb, (long) i2, j2));
            this.relationOffsets.add(Integer.valueOf(ModelRelation.endModelRelation(ModelBuilder.this.fbb)));
            return this;
        }
    }

    /* renamed from: io.objectbox.ModelBuilder$PropertyBuilder */
    public class PropertyBuilder {
        boolean finished;
        private int flags;

        /* renamed from: id */
        private int f7908id;
        private int indexId;
        private int indexMaxValueLength;
        private long indexUid;
        private final int propertyNameOffset;
        private int secondaryNameOffset;
        private final int targetEntityOffset;
        private final int type;
        private long uid;
        private final int virtualTargetOffset;

        PropertyBuilder(String str, String str2, String str3, int i) {
            this.type = i;
            this.propertyNameOffset = ModelBuilder.this.fbb.mo5576a((CharSequence) str);
            int i2 = 0;
            this.targetEntityOffset = str2 != null ? ModelBuilder.this.fbb.mo5576a((CharSequence) str2) : 0;
            this.virtualTargetOffset = str3 != null ? ModelBuilder.this.fbb.mo5576a((CharSequence) str3) : i2;
        }

        private void checkNotFinished() {
            if (this.finished) {
                throw new IllegalStateException("Already finished");
            }
        }

        public int finish() {
            checkNotFinished();
            this.finished = true;
            ModelProperty.startModelProperty(ModelBuilder.this.fbb);
            ModelProperty.addName(ModelBuilder.this.fbb, this.propertyNameOffset);
            int i = this.targetEntityOffset;
            if (i != 0) {
                ModelProperty.addTargetEntity(ModelBuilder.this.fbb, i);
            }
            int i2 = this.virtualTargetOffset;
            if (i2 != 0) {
                ModelProperty.addVirtualTarget(ModelBuilder.this.fbb, i2);
            }
            int i3 = this.secondaryNameOffset;
            if (i3 != 0) {
                ModelProperty.addNameSecondary(ModelBuilder.this.fbb, i3);
            }
            int i4 = this.f7908id;
            if (i4 != 0) {
                ModelProperty.addId(ModelBuilder.this.fbb, IdUid.createIdUid(ModelBuilder.this.fbb, (long) i4, this.uid));
            }
            int i5 = this.indexId;
            if (i5 != 0) {
                ModelProperty.addIndexId(ModelBuilder.this.fbb, IdUid.createIdUid(ModelBuilder.this.fbb, (long) i5, this.indexUid));
            }
            int i6 = this.indexMaxValueLength;
            if (i6 > 0) {
                ModelProperty.addMaxIndexValueLength(ModelBuilder.this.fbb, (long) i6);
            }
            ModelProperty.addType(ModelBuilder.this.fbb, this.type);
            int i7 = this.flags;
            if (i7 != 0) {
                ModelProperty.addFlags(ModelBuilder.this.fbb, (long) i7);
            }
            return ModelProperty.endModelProperty(ModelBuilder.this.fbb);
        }

        public PropertyBuilder flags(int i) {
            checkNotFinished();
            this.flags = i;
            return this;
        }

        /* renamed from: id */
        public PropertyBuilder mo9414id(int i, long j) {
            checkNotFinished();
            this.f7908id = i;
            this.uid = j;
            return this;
        }

        public PropertyBuilder indexId(int i, long j) {
            checkNotFinished();
            this.indexId = i;
            this.indexUid = j;
            return this;
        }

        public PropertyBuilder indexMaxValueLength(int i) {
            checkNotFinished();
            this.indexMaxValueLength = i;
            return this;
        }

        public PropertyBuilder secondaryName(String str) {
            checkNotFinished();
            this.secondaryNameOffset = ModelBuilder.this.fbb.mo5576a((CharSequence) str);
            return this;
        }
    }

    public byte[] build() {
        int a = this.fbb.mo5576a((CharSequence) "default");
        int createVector = createVector(this.entityOffsets);
        Model.startModel(this.fbb);
        Model.addName(this.fbb, a);
        Model.addModelVersion(this.fbb, 2);
        Model.addVersion(this.fbb, 1);
        Model.addEntities(this.fbb, createVector);
        Integer num = this.lastEntityId;
        if (num != null) {
            Model.addLastEntityId(this.fbb, IdUid.createIdUid(this.fbb, (long) num.intValue(), this.lastEntityUid.longValue()));
        }
        Integer num2 = this.lastIndexId;
        if (num2 != null) {
            Model.addLastIndexId(this.fbb, IdUid.createIdUid(this.fbb, (long) num2.intValue(), this.lastIndexUid.longValue()));
        }
        Integer num3 = this.lastRelationId;
        if (num3 != null) {
            Model.addLastRelationId(this.fbb, IdUid.createIdUid(this.fbb, (long) num3.intValue(), this.lastRelationUid.longValue()));
        }
        this.fbb.mo5599d(Model.endModel(this.fbb));
        return this.fbb.mo5604f();
    }

    /* access modifiers changed from: package-private */
    public int createVector(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).intValue();
        }
        return this.fbb.mo5578a(iArr);
    }

    public EntityBuilder entity(String str) {
        return new EntityBuilder(str);
    }

    public ModelBuilder lastEntityId(int i, long j) {
        this.lastEntityId = Integer.valueOf(i);
        this.lastEntityUid = Long.valueOf(j);
        return this;
    }

    public ModelBuilder lastIndexId(int i, long j) {
        this.lastIndexId = Integer.valueOf(i);
        this.lastIndexUid = Long.valueOf(j);
        return this;
    }

    public ModelBuilder lastRelationId(int i, long j) {
        this.lastRelationId = Integer.valueOf(i);
        this.lastRelationUid = Long.valueOf(j);
        return this;
    }

    public ModelBuilder version(long j) {
        this.version = j;
        return this;
    }
}
