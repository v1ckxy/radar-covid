package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.v7 */
public final class C3143v7 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ boolean f7923e;

    /* renamed from: f */
    public final /* synthetic */ C3112s9 f7924f;

    /* renamed from: g */
    public final /* synthetic */ C3189z9 f7925g;

    /* renamed from: h */
    public final /* synthetic */ C3121t7 f7926h;

    public C3143v7(C3121t7 t7Var, boolean z, C3112s9 s9Var, C3189z9 z9Var) {
        this.f7926h = t7Var;
        this.f7923e = z;
        this.f7924f = s9Var;
        this.f7925g = z9Var;
    }

    public final void run() {
        C3121t7 t7Var = this.f7926h;
        C3117t3 t3Var = t7Var.f7868d;
        if (t3Var == null) {
            t7Var.mo8285i().f7153f.mo8432a("Discarding data. Failed to set user property");
            return;
        }
        t7Var.mo8728a(t3Var, this.f7923e ? null : this.f7924f, this.f7925g);
        this.f7926h.mo8722C();
    }
}
