package p190io.objectbox.query;

import p190io.objectbox.relation.RelationInfo;

/* renamed from: io.objectbox.query.EagerRelation */
class EagerRelation {
    public final int limit;
    public final RelationInfo relationInfo;

    EagerRelation(int i, RelationInfo relationInfo2) {
        this.limit = i;
        this.relationInfo = relationInfo2;
    }
}
