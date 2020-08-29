package p369s.p370a.p371a.p378f.p388h;

import java.util.concurrent.atomic.AtomicReference;
import p213q.p214a.p215a.p216a.C1965a;
import p369s.p370a.p371a.p376d.C4453a;

/* renamed from: s.a.a.f.h.b */
public final class C4535b {

    /* renamed from: a */
    public static final Throwable f10750a = new C4536a();

    /* renamed from: s.a.a.f.h.b$a */
    public static final class C4536a extends Throwable {
        public C4536a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static NullPointerException m10203a(String str) {
        return new NullPointerException(C1965a.m4751a(str, " Null values are generally not allowed in 3.x operators and sources."));
    }

    /* renamed from: a */
    public static RuntimeException m10204a(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }

    /* renamed from: a */
    public static Throwable m10205a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f10750a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static boolean m10206a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f10750a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C4453a(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }
}
