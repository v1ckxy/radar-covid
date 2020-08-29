package p213q.p217b.p218a.p231b.p259h.p261b;

import p213q.p217b.p218a.p231b.p239d.p246q.C2284c;

/* renamed from: q.b.a.b.h.b.a9 */
public final class C2901a9 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ long f7140e;

    /* renamed from: f */
    public final /* synthetic */ C3166x8 f7141f;

    public C2901a9(C3166x8 x8Var, long j) {
        this.f7141f = x8Var;
        this.f7140e = j;
    }

    public final void run() {
        C3166x8 x8Var = this.f7141f;
        long j = this.f7140e;
        x8Var.mo8279c();
        x8Var.mo8825y();
        x8Var.mo8285i().f7161n.mo8433a("Activity resumed, time", Long.valueOf(j));
        if (x8Var.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
            if (x8Var.f7133a.f7338g.mo8587r().booleanValue() || x8Var.mo8288l().f7640w.mo8697a()) {
                C2949e9 e9Var = x8Var.f7969e;
                e9Var.f7291d.mo8279c();
                e9Var.f7290c.mo8459b();
                e9Var.f7288a = j;
                e9Var.f7289b = j;
            }
            x8Var.f7970f.mo8388a();
        } else {
            x8Var.f7970f.mo8388a();
            if (x8Var.f7133a.f7338g.mo8587r().booleanValue()) {
                C2949e9 e9Var2 = x8Var.f7969e;
                e9Var2.f7291d.mo8279c();
                e9Var2.f7290c.mo8459b();
                e9Var2.f7288a = j;
                e9Var2.f7289b = j;
            }
        }
        C2973g9 g9Var = x8Var.f7968d;
        g9Var.f7362a.mo8279c();
        if (g9Var.f7362a.f7133a.mo8464b()) {
            if (!g9Var.f7362a.f7133a.f7338g.mo8574a(C3069p.f7673D0)) {
                g9Var.f7362a.mo8288l().f7640w.mo8696a(false);
            }
            if (((C2284c) g9Var.f7362a.f7133a.f7345n) != null) {
                g9Var.mo8489a(System.currentTimeMillis(), false);
                return;
            }
            throw null;
        }
    }
}
