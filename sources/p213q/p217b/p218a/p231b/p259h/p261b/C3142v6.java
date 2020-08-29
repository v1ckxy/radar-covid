package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.v6 */
public final class C3142v6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f7921e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7922f;

    public C3142v6(C3018k6 k6Var, AtomicReference atomicReference) {
        this.f7922f = k6Var;
        this.f7921e = atomicReference;
    }

    public final void run() {
        synchronized (this.f7921e) {
            try {
                AtomicReference atomicReference = this.f7921e;
                C3022ka kaVar = this.f7922f.f7133a.f7338g;
                C3128u3 p = this.f7922f.mo8298p();
                p.mo8373v();
                String str = p.f7882c;
                String str2 = null;
                if (kaVar != null) {
                    C3095r3<String> r3Var = C3069p.f7688L;
                    if (str != null) {
                        str2 = kaVar.f7501c.mo8263a(str, r3Var.f7811a);
                    }
                    atomicReference.set((String) r3Var.mo8702a(str2));
                    this.f7921e.notify();
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                this.f7921e.notify();
                throw th;
            }
        }
    }
}
