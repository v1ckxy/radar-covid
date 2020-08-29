package p369s.p370a.p371a.p376d;

/* renamed from: s.a.a.d.b */
public final class C4455b extends RuntimeException {
    public C4455b(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(th);
        String sb2 = sb.toString();
        if (th == null) {
            th = new NullPointerException();
        }
        super(sb2, th);
    }
}
