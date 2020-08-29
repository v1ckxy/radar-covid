package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;

/* renamed from: q.b.a.b.h.b.x7 */
public final class C3165x7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3189z9 f7965e;

    /* renamed from: f */
    public final /* synthetic */ C3121t7 f7966f;

    public C3165x7(C3121t7 t7Var, C3189z9 z9Var) {
        this.f7966f = t7Var;
        this.f7965e = z9Var;
    }

    public final void run() {
        C3121t7 t7Var = this.f7966f;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            t3Var.mo8516d(this.f7965e);
        } catch (RemoteException e) {
            this.f7966f.mo8285i().f7153f.mo8433a("Failed to reset data on the service: remote exception", e);
        }
        this.f7966f.mo8722C();
    }
}
