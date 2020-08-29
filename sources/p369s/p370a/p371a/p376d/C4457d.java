package p369s.p370a.p371a.p376d;

/* renamed from: s.a.a.d.d */
public final class C4457d extends IllegalStateException {
    public C4457d(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
        sb.append(th);
        super(sb.toString(), th);
    }
}
