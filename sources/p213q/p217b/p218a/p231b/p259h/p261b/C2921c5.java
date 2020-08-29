package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.c5 */
public abstract class C2921c5 extends C2906b2 {

    /* renamed from: b */
    public boolean f7210b;

    public C2921c5(C2969g5 g5Var) {
        super(g5Var);
        this.f7133a.f7329D++;
    }

    /* renamed from: u */
    public void mo8372u() {
    }

    /* renamed from: v */
    public final void mo8373v() {
        if (!this.f7210b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: w */
    public final void mo8374w() {
        if (this.f7210b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo8375x()) {
            this.f7133a.f7330E.incrementAndGet();
            this.f7210b = true;
        }
    }

    /* renamed from: x */
    public abstract boolean mo8375x();
}
