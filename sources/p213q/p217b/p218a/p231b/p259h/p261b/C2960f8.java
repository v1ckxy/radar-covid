package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;

/* renamed from: q.b.a.b.h.b.f8 */
public final class C2960f8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3189z9 f7306e;

    /* renamed from: f */
    public final /* synthetic */ C3121t7 f7307f;

    public C2960f8(C3121t7 t7Var, C3189z9 z9Var) {
        this.f7307f = t7Var;
        this.f7306e = z9Var;
    }

    public final void run() {
        C3121t7 t7Var = this.f7307f;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            t3Var.mo8514b(this.f7306e);
            this.f7307f.mo8722C();
        } catch (RemoteException e) {
            this.f7307f.mo8285i().f7153f.mo8433a("Failed to send measurementEnabled to the service", e);
        }
    }
}
