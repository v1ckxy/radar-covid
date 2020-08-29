package p213q.p217b.p218a.p231b.p259h.p261b;

import android.os.Bundle;

/* renamed from: q.b.a.b.h.b.f9 */
public final /* synthetic */ class C2961f9 implements Runnable {

    /* renamed from: e */
    public final C2925c9 f7308e;

    public C2961f9(C2925c9 c9Var) {
        this.f7308e = c9Var;
    }

    public final void run() {
        C2925c9 c9Var = this.f7308e;
        C2937d9 d9Var = c9Var.f7222g;
        long j = c9Var.f7220e;
        long j2 = c9Var.f7221f;
        d9Var.f7256b.mo8279c();
        d9Var.f7256b.mo8285i().f7160m.mo8432a("Application going to the background");
        boolean z = true;
        if (d9Var.f7256b.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
            d9Var.f7256b.mo8288l().f7640w.mo8696a(true);
        }
        Bundle bundle = new Bundle();
        if (!d9Var.f7256b.f7133a.f7338g.mo8587r().booleanValue()) {
            d9Var.f7256b.f7969e.f7290c.mo8459b();
            if (d9Var.f7256b.f7133a.f7338g.mo8574a(C3069p.f7749s0)) {
                C2949e9 e9Var = d9Var.f7256b.f7969e;
                long j3 = j2 - e9Var.f7289b;
                e9Var.f7289b = j2;
                bundle.putLong("_et", j3);
                C3066o7.m7152a(d9Var.f7256b.mo8300r().mo8671a(true), bundle, true);
            } else {
                z = false;
            }
            d9Var.f7256b.mo8824a(false, z, j2);
        }
        d9Var.f7256b.mo8297o().mo8558a("auto", "_ab", j, bundle);
    }
}
