package p213q.p217b.p218a.p231b.p259h.p261b;

import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.z8 */
public final class C3188z8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ long f8015e;

    /* renamed from: f */
    public final /* synthetic */ C3166x8 f8016f;

    public C3188z8(C3166x8 x8Var, long j) {
        this.f8016f = x8Var;
        this.f8015e = j;
    }

    public final void run() {
        C3166x8 x8Var = this.f8016f;
        long j = this.f8015e;
        x8Var.mo8279c();
        x8Var.mo8825y();
        x8Var.mo8285i().f7161n.mo8433a("Activity paused, time", Long.valueOf(j));
        C2937d9 d9Var = x8Var.f7970f;
        if (d9Var.f7256b.f7133a.f7338g.mo8574a(C3069p.f7743p0)) {
            if (((C2284c) d9Var.f7256b.f7133a.f7345n) != null) {
                C2925c9 c9Var = new C2925c9(d9Var, System.currentTimeMillis(), j);
                d9Var.f7255a = c9Var;
                d9Var.f7256b.f7967c.postDelayed(c9Var, 2000);
            } else {
                throw null;
            }
        }
        if (x8Var.f7133a.f7338g.mo8587r().booleanValue()) {
            x8Var.f7969e.f7290c.mo8459b();
        }
        C2973g9 g9Var = x8Var.f7968d;
        if (!g9Var.f7362a.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
            g9Var.f7362a.mo8288l().f7640w.mo8696a(true);
        }
    }
}
