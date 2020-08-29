package p369s.p370a.p371a.p375c;

import java.util.Objects;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: s.a.a.c.e */
public final class C4452e extends C4452e<Runnable> implements C4450c {
    public C4452e(Runnable runnable) {
        super(Objects.requireNonNull(runnable, "value is null"));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [s.a.a.c.e, java.util.concurrent.atomic.AtomicReference] */
    /* renamed from: f */
    public final void mo10714f() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                ((Runnable) andSet).run();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [s.a.a.c.e, java.util.concurrent.atomic.AtomicReference] */
    public String toString() {
        StringBuilder a = C1965a.m4756a("RunnableDisposable(disposed=");
        a.append(get() == null);
        a.append(p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR);
        a.append(get());
        a.append(")");
        return a.toString();
    }
}
