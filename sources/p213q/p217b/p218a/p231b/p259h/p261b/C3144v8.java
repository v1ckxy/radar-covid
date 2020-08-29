package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.ArrayList;

/* renamed from: q.b.a.b.h.b.v8 */
public final class C3144v8 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3033l9 f7927e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f7928f;

    public C3144v8(C3033l9 l9Var, Runnable runnable) {
        this.f7927e = l9Var;
        this.f7928f = runnable;
    }

    public final void run() {
        this.f7927e.mo8625o();
        C3033l9 l9Var = this.f7927e;
        Runnable runnable = this.f7928f;
        l9Var.mo8628r();
        if (l9Var.f7541m == null) {
            l9Var.f7541m = new ArrayList();
        }
        l9Var.f7541m.add(runnable);
        this.f7927e.mo8624n();
    }
}
