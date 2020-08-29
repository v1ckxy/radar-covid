package p213q.p217b.p218a.p231b.p259h.p261b;

import p124p.p126b.p127k.C1061o;

/* renamed from: q.b.a.b.h.b.m9 */
public abstract class C3046m9 extends C2898a6 implements C2910b6 {

    /* renamed from: b */
    public final C3033l9 f7580b;

    /* renamed from: c */
    public boolean f7581c;

    public C3046m9(C3033l9 l9Var) {
        super(l9Var.f7537i);
        C1061o.m2524b(l9Var);
        this.f7580b = l9Var;
        l9Var.f7542n++;
    }

    /* renamed from: m */
    public final void mo8649m() {
        if (!this.f7581c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: n */
    public final void mo8650n() {
        if (!this.f7581c) {
            mo8276o();
            this.f7580b.f7543o++;
            this.f7581c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: o */
    public abstract boolean mo8276o();

    /* renamed from: p */
    public C3123t9 mo8651p() {
        return this.f7580b.mo8621k();
    }

    /* renamed from: q */
    public C2939e mo8652q() {
        return this.f7580b.mo8619d();
    }

    /* renamed from: r */
    public C2897a5 mo8653r() {
        return this.f7580b.mo8610b();
    }
}
