package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.c9 */
public final class C2925c9 implements Runnable {

    /* renamed from: e */
    public long f7220e;

    /* renamed from: f */
    public long f7221f;

    /* renamed from: g */
    public final /* synthetic */ C2937d9 f7222g;

    public C2925c9(C2937d9 d9Var, long j, long j2) {
        this.f7222g = d9Var;
        this.f7220e = j;
        this.f7221f = j2;
    }

    public final void run() {
        C3184z4 g = this.f7222g.f7256b.mo8283g();
        C2961f9 f9Var = new C2961f9(this);
        g.mo8846n();
        C1061o.m2524b(f9Var);
        g.mo8843a(new C2945e5<>(g, f9Var, "Task exception on worker thread"));
    }
}
