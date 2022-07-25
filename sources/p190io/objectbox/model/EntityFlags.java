package p190io.objectbox.model;

/* renamed from: io.objectbox.model.EntityFlags */
public final class EntityFlags {
    public static final int USE_NO_ARG_CONSTRUCTOR = 1;
    public static final String[] names = {"USE_NO_ARG_CONSTRUCTOR"};

    private EntityFlags() {
    }

    public static String name(int i) {
        return names[i - 1];
    }
}
