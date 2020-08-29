package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;

/* renamed from: q.b.a.b.h.b.c8 */
public final class C2924c8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3189z9 f7218e;

    /* renamed from: f */
    public final /* synthetic */ C3121t7 f7219f;

    public C2924c8(C3121t7 t7Var, C3189z9 z9Var) {
        this.f7219f = t7Var;
        this.f7218e = z9Var;
    }

    public final void run() {
        C3121t7 t7Var = this.f7219f;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            t3Var.mo8512a(this.f7218e);
            this.f7219f.mo8301s().mo8820z();
            this.f7219f.mo8728a(t3Var, null, this.f7218e);
            this.f7219f.mo8722C();
        } catch (RemoteException e) {
            this.f7219f.mo8285i().f7153f.mo8433a("Failed to send app launch to the service", e);
        }
    }
}
