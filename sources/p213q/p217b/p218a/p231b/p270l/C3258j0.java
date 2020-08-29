package p213q.p217b.p218a.p231b.p270l;

import java.util.concurrent.Callable;

/* renamed from: q.b.a.b.l.j0 */
public final class C3258j0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3250f0 f8129e;

    /* renamed from: f */
    public final /* synthetic */ Callable f8130f;

    public C3258j0(C3250f0 f0Var, Callable callable) {
        this.f8129e = f0Var;
        this.f8130f = callable;
    }

    public final void run() {
        try {
            this.f8129e.mo8930a(this.f8130f.call());
        } catch (Exception e) {
            this.f8129e.mo8929a(e);
        }
    }
}
