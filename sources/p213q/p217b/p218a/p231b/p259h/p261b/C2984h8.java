package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: q.b.a.b.h.b.h8 */
public final class C2984h8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f7388e;

    /* renamed from: f */
    public final /* synthetic */ boolean f7389f;

    /* renamed from: g */
    public final /* synthetic */ C2998ia f7390g;

    /* renamed from: h */
    public final /* synthetic */ C3189z9 f7391h;

    /* renamed from: i */
    public final /* synthetic */ C2998ia f7392i;

    /* renamed from: j */
    public final /* synthetic */ C3121t7 f7393j;

    public C2984h8(C3121t7 t7Var, boolean z, boolean z2, C2998ia iaVar, C3189z9 z9Var, C2998ia iaVar2) {
        this.f7393j = t7Var;
        this.f7388e = z;
        this.f7389f = z2;
        this.f7390g = iaVar;
        this.f7391h = z9Var;
        this.f7392i = iaVar2;
    }

    public final void run() {
        C3121t7 t7Var = this.f7393j;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f7388e) {
            t7Var.mo8728a(t3Var, this.f7389f ? null : this.f7390g, this.f7391h);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7392i.f7418e)) {
                    t3Var.mo8508a(this.f7390g, this.f7391h);
                } else {
                    t3Var.mo8507a(this.f7390g);
                }
            } catch (RemoteException e) {
                this.f7393j.mo8285i().f7153f.mo8433a("Failed to send conditional user property to the service", e);
            }
        }
        this.f7393j.mo8722C();
    }
}
