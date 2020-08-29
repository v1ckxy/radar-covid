package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.q6 */
public final class C3087q6 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C2958f6 f7796e;

    /* renamed from: f */
    public final /* synthetic */ C3018k6 f7797f;

    public C3087q6(C3018k6 k6Var, C2958f6 f6Var) {
        this.f7797f = k6Var;
        this.f7796e = f6Var;
    }

    public final void run() {
        C3018k6 k6Var = this.f7797f;
        C2958f6 f6Var = this.f7796e;
        k6Var.mo8279c();
        k6Var.mo8277a();
        k6Var.mo8373v();
        if (f6Var != null) {
            C2958f6 f6Var2 = k6Var.f7486d;
            if (f6Var != f6Var2) {
                C1061o.m2534b(f6Var2 == null, (Object) "EventInterceptor already set.");
            }
        }
        k6Var.f7486d = f6Var;
    }
}
