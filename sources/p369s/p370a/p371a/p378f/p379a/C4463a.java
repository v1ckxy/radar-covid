package p369s.p370a.p371a.p378f.p379a;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p369s.p370a.p371a.p375c.C4450c;
import p369s.p370a.p371a.p376d.C4456c;

/* renamed from: s.a.a.f.a.a */
public enum C4463a implements C4450c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m10049a(AtomicReference<C4450c> atomicReference) {
        C4450c cVar = (C4450c) atomicReference.get();
        C4463a aVar = DISPOSED;
        if (cVar != aVar) {
            C4450c cVar2 = (C4450c) atomicReference.getAndSet(aVar);
            if (cVar2 != aVar) {
                if (cVar2 != null) {
                    cVar2.mo10714f();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m10050a(AtomicReference<C4450c> atomicReference, C4450c cVar) {
        C4450c cVar2;
        do {
            cVar2 = (C4450c) atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar != null) {
                    cVar.mo10714f();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    /* renamed from: a */
    public static boolean m10051a(C4450c cVar, C4450c cVar2) {
        if (cVar2 == null) {
            C2286e.m5298b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.mo10714f();
            C2286e.m5298b((Throwable) new C4456c("Disposable already set!"));
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m10052b(AtomicReference<C4450c> atomicReference, C4450c cVar) {
        Objects.requireNonNull(cVar, "d is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.mo10714f();
        if (atomicReference.get() != DISPOSED) {
            C2286e.m5298b((Throwable) new C4456c("Disposable already set!"));
        }
        return false;
    }

    /* renamed from: f */
    public void mo10714f() {
    }
}
