package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.i */
public final class C2987i implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2910b6 f7401e;

    /* renamed from: f */
    public final /* synthetic */ C2963g f7402f;

    public C2987i(C2963g gVar, C2910b6 b6Var) {
        this.f7402f = gVar;
        this.f7401e = b6Var;
    }

    public final void run() {
        this.f7401e.mo8282f();
        if (C3010ja.m7022a()) {
            C3184z4 g = this.f7401e.mo8283g();
            g.mo8846n();
            C1061o.m2524b(this);
            g.mo8843a(new C2945e5<>(g, this, "Task exception on worker thread"));
            return;
        }
        boolean z = this.f7402f.f7316c != 0;
        this.f7402f.f7316c = 0;
        if (z) {
            this.f7402f.mo8457a();
        }
    }
}
