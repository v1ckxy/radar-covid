package p423w;

import p392u.p401r.p403c.C4638h;

/* renamed from: w.l */
public abstract class C4900l implements C4882a0 {

    /* renamed from: e */
    public final C4882a0 f11670e;

    public C4900l(C4882a0 a0Var) {
        if (a0Var != null) {
            this.f11670e = a0Var;
        } else {
            C4638h.m10271a("delegate");
            throw null;
        }
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        if (fVar != null) {
            return this.f11670e.mo11077b(fVar, j);
        }
        C4638h.m10271a("sink");
        throw null;
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11670e.mo11078b();
    }

    public void close() {
        this.f11670e.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f11670e);
        sb.append(')');
        return sb.toString();
    }
}
