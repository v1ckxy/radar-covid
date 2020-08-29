package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.l6 */
public final class C3030l6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7515e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7516f;

    public C3030l6(C3018k6 k6Var, AtomicReference atomicReference) {
        this.f7516f = k6Var;
        this.f7515e = atomicReference;
    }

    public final void run() {
        synchronized (this.f7515e) {
            try {
                AtomicReference atomicReference = this.f7515e;
                C3022ka kaVar = this.f7516f.f7133a.f7338g;
                C3128u3 p = this.f7516f.mo8298p();
                p.mo8373v();
                String str = p.f7882c;
                if (kaVar != null) {
                    atomicReference.set(Boolean.valueOf(kaVar.mo8578c(str, C3069p.f7686K)));
                    this.f7515e.notify();
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                this.f7515e.notify();
                throw th;
            }
        }
    }
}
