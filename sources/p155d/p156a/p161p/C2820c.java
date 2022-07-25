package p155d.p156a.p161p;

/* renamed from: d.a.p.c */
public final class C2820c extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2820c(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    public C2820c(Throwable th) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th);
    }
}
