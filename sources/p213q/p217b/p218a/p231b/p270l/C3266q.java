package p213q.p217b.p218a.p231b.p270l;

/* renamed from: q.b.a.b.l.q */
public final class C3266q implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ C3255i f8149e;

    /* renamed from: f */
    public final /* synthetic */ C3264o f8150f;

    public C3266q(C3264o oVar, C3255i iVar) {
        this.f8150f = oVar;
        this.f8149e = iVar;
    }

    public final void run() {
        if (((C3250f0) this.f8149e).f8123d) {
            this.f8150f.f8145c.mo8937e();
            return;
        }
        try {
            this.f8150f.f8145c.mo8930a(this.f8150f.f8144b.mo8913a(this.f8149e));
        } catch (C3251g e) {
            if (e.getCause() instanceof Exception) {
                this.f8150f.f8145c.mo8929a((Exception) e.getCause());
            } else {
                this.f8150f.f8145c.mo8929a((Exception) e);
            }
        } catch (Exception e2) {
            this.f8150f.f8145c.mo8929a(e2);
        }
    }
}
