package p369s.p370a.p371a.p374b;

import java.util.Objects;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p378f.p383e.p385b.C4490b;

/* renamed from: s.a.a.b.g */
public abstract class C4440g<T> implements C4443j<T> {
    /* renamed from: a */
    public static <T> C4440g<T> m10018a(C4442i<T> iVar) {
        Objects.requireNonNull(iVar, "source is null");
        return new C4490b(iVar);
    }

    /* renamed from: a */
    public final void mo10720a(C4444k<? super T> kVar) {
        Objects.requireNonNull(kVar, "observer is null");
        try {
            Objects.requireNonNull(kVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo10721b(kVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C2286e.m5312c(th);
            C2286e.m5298b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public abstract void mo10721b(C4444k<? super T> kVar);
}
