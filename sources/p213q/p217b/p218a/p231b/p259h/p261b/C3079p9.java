package p213q.p217b.p218a.p231b.p259h.p261b;

import java.util.concurrent.Callable;

/* renamed from: q.b.a.b.h.b.p9 */
public final class C3079p9 implements Callable<String> {

    /* renamed from: e */
    public final /* synthetic */ C3189z9 f7782e;

    /* renamed from: f */
    public final /* synthetic */ C3033l9 f7783f;

    public C3079p9(C3033l9 l9Var, C3189z9 z9Var) {
        this.f7783f = l9Var;
        this.f7782e = z9Var;
    }

    public final /* synthetic */ Object call() {
        C2920c4 b = this.f7783f.mo8611b(this.f7782e);
        if (b != null) {
            return b.mo8348h();
        }
        this.f7783f.mo8285i().f7156i.mo8432a("App info was null when attempting to get app instance id");
        return null;
    }
}
