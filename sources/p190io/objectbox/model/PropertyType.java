package p190io.objectbox.model;

/* renamed from: io.objectbox.model.PropertyType */
public final class PropertyType {
    public static final short Bool = 1;
    public static final short BoolVector = 22;
    public static final short Byte = 2;
    public static final short ByteVector = 23;
    public static final short Char = 4;
    public static final short CharVector = 25;
    public static final short Date = 10;
    public static final short DateVector = 31;
    public static final short Double = 8;
    public static final short DoubleVector = 29;
    public static final short Float = 7;
    public static final short FloatVector = 28;
    public static final short Int = 5;
    public static final short IntVector = 26;
    public static final short Long = 6;
    public static final short LongVector = 27;
    public static final short Relation = 11;
    public static final short Reserved1 = 12;
    public static final short Reserved10 = 21;
    public static final short Reserved2 = 13;
    public static final short Reserved3 = 14;
    public static final short Reserved4 = 15;
    public static final short Reserved5 = 16;
    public static final short Reserved6 = 17;
    public static final short Reserved7 = 18;
    public static final short Reserved8 = 19;
    public static final short Reserved9 = 20;
    public static final short Short = 3;
    public static final short ShortVector = 24;
    public static final short String = 9;
    public static final short StringVector = 30;
    public static final short Unknown = 0;
    public static final String[] names = {"Unknown", "Bool", "Byte", "Short", "Char", "Int", "Long", "Float", "Double", "String", "Date", "Relation", "Reserved1", "Reserved2", "Reserved3", "Reserved4", "Reserved5", "Reserved6", "Reserved7", "Reserved8", "Reserved9", "Reserved10", "BoolVector", "ByteVector", "ShortVector", "CharVector", "IntVector", "LongVector", "FloatVector", "DoubleVector", "StringVector", "DateVector"};

    private PropertyType() {
    }

    public static String name(int i) {
        return names[i];
    }
}
