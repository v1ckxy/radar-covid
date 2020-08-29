package p423w;

import p392u.p401r.p403c.C4638h;

/* renamed from: w.k */
public abstract class C4899k implements C4915y {

    /* renamed from: e */
    public final C4915y f11669e;

    public C4899k(C4915y yVar) {
        if (yVar != null) {
            this.f11669e = yVar;
        } else {
            C4638h.m10271a("delegate");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11105a(C4892f fVar, long j) {
        if (fVar != null) {
            this.f11669e.mo11105a(fVar, j);
        } else {
            C4638h.m10271a("source");
            throw null;
        }
    }

    /* renamed from: b */
    public C4886b0 mo11186b() {
        return this.f11669e.mo11186b();
    }

    public void close() {
        this.f11669e.close();
    }

    public void flush() {
        this.f11669e.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f11669e);
        sb.append(')');
        return sb.toString();
    }
}
