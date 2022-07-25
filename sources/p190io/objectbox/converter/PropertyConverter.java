package p190io.objectbox.converter;

/* renamed from: io.objectbox.converter.PropertyConverter */
public interface PropertyConverter<P, D> {
    D convertToDatabaseValue(P p);

    P convertToEntityProperty(D d);
}
