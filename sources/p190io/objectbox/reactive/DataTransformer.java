package p190io.objectbox.reactive;

/* renamed from: io.objectbox.reactive.DataTransformer */
public interface DataTransformer<FROM, TO> {
    TO transform(FROM from);
}
