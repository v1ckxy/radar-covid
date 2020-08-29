package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.a7 */
public final class C2899a7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f7134e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7135f;

    public C2899a7(C3018k6 k6Var, boolean z) {
        this.f7135f = k6Var;
        this.f7134e = z;
    }

    public final void run() {
        boolean b = this.f7135f.f7133a.mo8464b();
        boolean a = this.f7135f.f7133a.mo8463a();
        this.f7135f.f7133a.f7326A = Boolean.valueOf(this.f7134e);
        if (a == this.f7134e) {
            this.f7135f.f7133a.mo8285i().f7161n.mo8433a("Default data collection state already set to", Boolean.valueOf(this.f7134e));
        }
        if (this.f7135f.f7133a.mo8464b() == b || this.f7135f.f7133a.mo8464b() != this.f7135f.f7133a.mo8463a()) {
            this.f7135f.f7133a.mo8285i().f7158k.mo8434a("Default data collection is different than actual status", Boolean.valueOf(this.f7134e), Boolean.valueOf(b));
        }
        this.f7135f.mo8554B();
    }
}
