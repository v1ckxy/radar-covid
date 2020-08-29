package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.z6 */
public final class C3186z6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f8010e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f8011f;

    public C3186z6(C3018k6 k6Var, AtomicReference atomicReference) {
        this.f8011f = k6Var;
        this.f8010e = atomicReference;
    }

    public final void run() {
        synchronized (this.f8010e) {
            try {
                AtomicReference atomicReference = this.f8010e;
                C3022ka kaVar = this.f8011f.f7133a.f7338g;
                C3128u3 p = this.f8011f.mo8298p();
                p.mo8373v();
                atomicReference.set(Integer.valueOf(kaVar.mo8576b(p.f7882c, C3069p.f7692N)));
                this.f8010e.notify();
            } catch (Throwable th) {
                this.f8010e.notify();
                throw th;
            }
        }
    }
}
