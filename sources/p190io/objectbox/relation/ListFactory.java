package p190io.objectbox.relation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p190io.objectbox.annotation.apihint.Experimental;

@Experimental
/* renamed from: io.objectbox.relation.ListFactory */
public interface ListFactory extends Serializable {

    /* renamed from: io.objectbox.relation.ListFactory$ArrayListFactory */
    public static class ArrayListFactory implements ListFactory {
        private static final long serialVersionUID = 8247662514375611729L;

        public <T> List<T> createList() {
            return new ArrayList();
        }
    }

    /* renamed from: io.objectbox.relation.ListFactory$CopyOnWriteArrayListFactory */
    public static class CopyOnWriteArrayListFactory implements ListFactory {
        private static final long serialVersionUID = 1888039726372206411L;

        public <T> List<T> createList() {
            return new CopyOnWriteArrayList();
        }
    }

    <T> List<T> createList();
}
