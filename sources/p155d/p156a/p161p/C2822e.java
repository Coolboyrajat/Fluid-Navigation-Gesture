package p155d.p156a.p161p;

/* renamed from: d.a.p.e */
public final class C2822e extends IllegalStateException {
    public C2822e(Throwable th) {
        super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
    }
}
