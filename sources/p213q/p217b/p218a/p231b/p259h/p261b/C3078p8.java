package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.p8 */
public final class C3078p8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3117t3 f7780e;

    /* renamed from: f */
    public final /* synthetic */ C3067o8 f7781f;

    public C3078p8(C3067o8 o8Var, C3117t3 t3Var) {
        this.f7781f = o8Var;
        this.f7780e = t3Var;
    }

    public final void run() {
        synchronized (this.f7781f) {
            this.f7781f.f7661a = false;
            if (!this.f7781f.f7663c.mo8729y()) {
                this.f7781f.f7663c.mo8285i().f7160m.mo8432a("Connected to remote service");
                C3121t7 t7Var = this.f7781f.f7663c;
                C3117t3 t3Var = this.f7780e;
                t7Var.mo8279c();
                C1061o.m2524b(t3Var);
                t7Var.f7868d = t3Var;
                t7Var.mo8722C();
                t7Var.mo8724E();
            }
        }
    }
}
