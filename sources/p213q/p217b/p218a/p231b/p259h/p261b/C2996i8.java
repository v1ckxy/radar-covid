package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: q.b.a.b.h.b.i8 */
public final class C2996i8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f7409e;

    /* renamed from: f */
    public final /* synthetic */ boolean f7410f;

    /* renamed from: g */
    public final /* synthetic */ C3047n f7411g;

    /* renamed from: h */
    public final /* synthetic */ C3189z9 f7412h;

    /* renamed from: i */
    public final /* synthetic */ String f7413i;

    /* renamed from: j */
    public final /* synthetic */ C3121t7 f7414j;

    public C2996i8(C3121t7 t7Var, boolean z, boolean z2, C3047n nVar, C3189z9 z9Var, String str) {
        this.f7414j = t7Var;
        this.f7409e = z;
        this.f7410f = z2;
        this.f7411g = nVar;
        this.f7412h = z9Var;
        this.f7413i = str;
    }

    public final void run() {
        C3121t7 t7Var = this.f7414j;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f7409e) {
            t7Var.mo8728a(t3Var, this.f7410f ? null : this.f7411g, this.f7412h);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7413i)) {
                    t3Var.mo8510a(this.f7411g, this.f7412h);
                } else {
                    t3Var.mo8509a(this.f7411g, this.f7413i, this.f7414j.mo8285i().mo8313y());
                }
            } catch (RemoteException e) {
                this.f7414j.mo8285i().f7153f.mo8433a("Failed to send event to the service", e);
            }
        }
        this.f7414j.mo8722C();
    }
}
