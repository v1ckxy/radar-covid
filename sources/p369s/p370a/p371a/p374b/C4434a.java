package p369s.p370a.p371a.p374b;

import java.util.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;

/* renamed from: s.a.a.b.a */
public abstract class C4434a implements C4438e {
    /* renamed from: a */
    public final void mo3713a(C4436c cVar) {
        Objects.requireNonNull(cVar, "observer is null");
        try {
            Objects.requireNonNull(cVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo10716b(cVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C2286e.m5312c(th);
            C2286e.m5298b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public abstract void mo10716b(C4436c cVar);
}
