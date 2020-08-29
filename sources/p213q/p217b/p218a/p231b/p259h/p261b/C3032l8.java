package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;
import android.os.RemoteException;
import p213q.p217b.p218a.p231b.p251g.p256e.C2626pe;

/* renamed from: q.b.a.b.h.b.l8 */
public final class C3032l8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ String f7522e;

    /* renamed from: f */
    public final /* synthetic */ String f7523f;

    /* renamed from: g */
    public final /* synthetic */ boolean f7524g;

    /* renamed from: h */
    public final /* synthetic */ C3189z9 f7525h;

    /* renamed from: i */
    public final /* synthetic */ C2626pe f7526i;

    /* renamed from: j */
    public final /* synthetic */ C3121t7 f7527j;

    public C3032l8(C3121t7 t7Var, String str, String str2, boolean z, C3189z9 z9Var, C2626pe peVar) {
        this.f7527j = t7Var;
        this.f7522e = str;
        this.f7523f = str2;
        this.f7524g = z;
        this.f7525h = z9Var;
        this.f7526i = peVar;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C3117t3 t3Var = this.f7527j.f7868d;
            if (t3Var == null) {
                this.f7527j.mo8285i().f7153f.mo8434a("Failed to get user properties; not connected to service", this.f7522e, this.f7523f);
            } else {
                bundle = C3156w9.m7403a(t3Var.mo8501a(this.f7522e, this.f7523f, this.f7524g, this.f7525h));
                this.f7527j.mo8722C();
            }
        } catch (RemoteException e) {
            this.f7527j.mo8285i().f7153f.mo8434a("Failed to get user properties; remote exception", this.f7522e, e);
        } catch (Throwable th) {
            this.f7527j.mo8287k().mo8790a(this.f7526i, bundle);
            throw th;
        }
        this.f7527j.mo8287k().mo8790a(this.f7526i, bundle);
    }
}
