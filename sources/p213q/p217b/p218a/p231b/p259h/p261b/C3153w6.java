package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.w6 */
public final class C3153w6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7938e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7939f;

    public C3153w6(C3018k6 k6Var, AtomicReference atomicReference) {
        this.f7939f = k6Var;
        this.f7938e = atomicReference;
    }

    public final void run() {
        synchronized (this.f7938e) {
            try {
                AtomicReference atomicReference = this.f7938e;
                C3022ka kaVar = this.f7939f.f7133a.f7338g;
                C3128u3 p = this.f7939f.mo8298p();
                p.mo8373v();
                atomicReference.set(Long.valueOf(kaVar.mo8572a(p.f7882c, C3069p.f7690M)));
                this.f7938e.notify();
            } catch (Throwable th) {
                this.f7938e.notify();
                throw th;
            }
        }
    }
}
