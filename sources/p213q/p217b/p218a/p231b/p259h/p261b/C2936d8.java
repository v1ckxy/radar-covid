package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.d8 */
public final class C2936d8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3047n f7251e;

    /* renamed from: f */
    public final /* synthetic */ String f7252f;

    /* renamed from: g */
    public final /* synthetic */ C2626pe f7253g;

    /* renamed from: h */
    public final /* synthetic */ C3121t7 f7254h;

    public C2936d8(C3121t7 t7Var, C3047n nVar, String str, C2626pe peVar) {
        this.f7254h = t7Var;
        this.f7251e = nVar;
        this.f7252f = str;
        this.f7253g = peVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C3117t3 t3Var = this.f7254h.f7868d;
            if (t3Var == null) {
                this.f7254h.mo8285i().f7153f.mo8432a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = t3Var.mo8513a(this.f7251e, this.f7252f);
                this.f7254h.mo8722C();
            }
        } catch (RemoteException e) {
            this.f7254h.mo8285i().f7153f.mo8433a("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f7254h.mo8287k().mo8794a(this.f7253g, bArr);
            throw th;
        }
        this.f7254h.mo8287k().mo8794a(this.f7253g, bArr);
    }
}
