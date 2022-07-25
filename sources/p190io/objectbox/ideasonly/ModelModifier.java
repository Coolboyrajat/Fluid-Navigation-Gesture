package p190io.objectbox.ideasonly;

/* renamed from: io.objectbox.ideasonly.ModelModifier */
public class ModelModifier {

    /* renamed from: io.objectbox.ideasonly.ModelModifier$EntityModifier */
    public class EntityModifier {
        final String name;
        final String schemaName;

        EntityModifier(String str, String str2) {
            this.schemaName = str;
            this.name = str2;
        }

        public PropertyModifier property(String str) {
            return new PropertyModifier(this, str);
        }

        public void remove() {
        }

        public void renameTo(String str) {
        }
    }

    /* renamed from: io.objectbox.ideasonly.ModelModifier$PropertyModifier */
    public class PropertyModifier {
        final EntityModifier entityModifier;
        final String name;

        PropertyModifier(EntityModifier entityModifier2, String str) {
            this.entityModifier = entityModifier2;
            this.name = str;
        }

        public void remove() {
        }

        public void renameTo(String str) {
        }
    }

    public EntityModifier entity(String str) {
        return new EntityModifier("default", str);
    }
}
