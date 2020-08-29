package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: q.b.a.b.h.b.e8 */
public final class C2948e8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ Bundle f7285e;

    /* renamed from: f */
    public final /* synthetic */ C3189z9 f7286f;

    /* renamed from: g */
    public final /* synthetic */ C3121t7 f7287g;

    public C2948e8(C3121t7 t7Var, Bundle bundle, C3189z9 z9Var) {
        this.f7287g = t7Var;
        this.f7285e = bundle;
        this.f7286f = z9Var;
    }

    public final void run() {
        C3121t7 t7Var = this.f7287g;
        C3117t3 t3Var = t7Var.f7868d;
        String str = "Failed to send default event parameters to service";
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a(str);
            return;
        }
        try {
            t3Var.mo8504a(this.f7285e, this.f7286f);
        } catch (RemoteException e) {
            this.f7287g.mo8285i().f7153f.mo8433a(str, e);
        }
    }
}
