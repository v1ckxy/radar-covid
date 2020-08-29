package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.y7 */
public final class C3176y7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3189z9 f7987e;

    /* renamed from: f */
    public final /* synthetic */ C2626pe f7988f;

    /* renamed from: g */
    public final /* synthetic */ C3121t7 f7989g;

    public C3176y7(C3121t7 t7Var, C3189z9 z9Var, C2626pe peVar) {
        this.f7989g = t7Var;
        this.f7987e = z9Var;
        this.f7988f = peVar;
    }

    public final void run() {
        String str = "Failed to get app instance id";
        String str2 = null;
        try {
            C3117t3 t3Var = this.f7989g.f7868d;
            if (t3Var == null) {
                this.f7989g.mo8285i().f7153f.mo8432a(str);
            } else {
                str2 = t3Var.mo8515c(this.f7987e);
                if (str2 != null) {
                    this.f7989g.mo8297o().f7489g.set(str2);
                    this.f7989g.mo8288l().f7629l.mo8750a(str2);
                }
                this.f7989g.mo8722C();
            }
        } catch (RemoteException e) {
            this.f7989g.mo8285i().f7153f.mo8433a(str, e);
        } catch (Throwable th) {
            this.f7989g.mo8287k().mo8791a(this.f7988f, (String) null);
            throw th;
        }
        this.f7989g.mo8287k().mo8791a(this.f7988f, str2);
    }
}
