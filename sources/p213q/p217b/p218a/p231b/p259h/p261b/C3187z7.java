package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q.b.a.b.h.b.z7 */
public final class C3187z7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f8012e;

    /* renamed from: f */
    public final /* synthetic */ C3189z9 f8013f;

    /* renamed from: g */
    public final /* synthetic */ C3121t7 f8014g;

    public C3187z7(C3121t7 t7Var, AtomicReference atomicReference, C3189z9 z9Var) {
        this.f8014g = t7Var;
        this.f8012e = atomicReference;
        this.f8013f = z9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f8012e) {
            try {
                C3117t3 t3Var = this.f8014g.f7868d;
                if (t3Var == null) {
                    this.f8014g.mo8285i().f7153f.mo8432a("Failed to get app instance id");
                    this.f8012e.notify();
                    return;
                }
                this.f8012e.set(t3Var.mo8515c(this.f8013f));
                String str = (String) this.f8012e.get();
                if (str != null) {
                    this.f8014g.mo8297o().f7489g.set(str);
                    this.f8014g.mo8288l().f7629l.mo8750a(str);
                }
                this.f8014g.mo8722C();
                atomicReference = this.f8012e;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f8014g.mo8285i().f7153f.mo8433a("Failed to get app instance id", e);
                    atomicReference = this.f8012e;
                } catch (Throwable th) {
                    this.f8012e.notify();
                    throw th;
                }
            }
        }
    }
}
