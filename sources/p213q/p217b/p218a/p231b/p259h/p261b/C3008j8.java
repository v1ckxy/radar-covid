package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.RemoteException;
import java.util.ArrayList;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.j8 */
public final class C3008j8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f7459e;

    /* renamed from: f */
    public final /* synthetic */ String f7460f;

    /* renamed from: g */
    public final /* synthetic */ C3189z9 f7461g;

    /* renamed from: h */
    public final /* synthetic */ C2626pe f7462h;

    /* renamed from: i */
    public final /* synthetic */ C3121t7 f7463i;

    public C3008j8(C3121t7 t7Var, String str, String str2, C3189z9 z9Var, C2626pe peVar) {
        this.f7463i = t7Var;
        this.f7459e = str;
        this.f7460f = str2;
        this.f7461g = z9Var;
        this.f7462h = peVar;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            C3117t3 t3Var = this.f7463i.f7868d;
            if (t3Var == null) {
                this.f7463i.mo8285i().f7153f.mo8434a("Failed to get conditional properties; not connected to service", this.f7459e, this.f7460f);
            } else {
                arrayList = C3156w9.m7413b(t3Var.mo8500a(this.f7459e, this.f7460f, this.f7461g));
                this.f7463i.mo8722C();
            }
        } catch (RemoteException e) {
            this.f7463i.mo8285i().f7153f.mo8435a("Failed to get conditional properties; remote exception", this.f7459e, this.f7460f, e);
        } catch (Throwable th) {
            this.f7463i.mo8287k().mo8792a(this.f7462h, arrayList);
            throw th;
        }
        this.f7463i.mo8287k().mo8792a(this.f7462h, arrayList);
    }
}
