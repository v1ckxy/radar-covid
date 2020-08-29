package p213q.p217b.p218a.p231b.p259h.p261b;

/* renamed from: q.b.a.b.h.b.z5 */
public abstract class C3185z5 extends C2898a6 {

    /* renamed from: b */
    public boolean f8009b;

    public C3185z5(C2969g5 g5Var) {
        super(g5Var);
        this.f7133a.f7329D++;
    }

    /* renamed from: m */
    public void mo8666m() {
    }

    /* renamed from: n */
    public final void mo8846n() {
        if (!mo8849r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: o */
    public final void mo8847o() {
        if (this.f8009b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo8306q()) {
            this.f7133a.f7330E.incrementAndGet();
            this.f8009b = true;
        }
    }

    /* renamed from: p */
    public final void mo8848p() {
        if (!this.f8009b) {
            mo8666m();
            this.f7133a.f7330E.incrementAndGet();
            this.f8009b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: q */
    public abstract boolean mo8306q();

    /* renamed from: r */
    public final boolean mo8849r() {
        return this.f8009b;
    }
}
