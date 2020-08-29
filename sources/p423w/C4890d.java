package p423w;

import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.d */
public final class C4890d implements C4882a0 {

    /* renamed from: e */
    public final /* synthetic */ C4883b f11657e;

    /* renamed from: f */
    public final /* synthetic */ C4882a0 f11658f;

    public C4890d(C4883b bVar, C4882a0 a0Var) {
        this.f11657e = bVar;
        this.f11658f = a0Var;
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        if (fVar != null) {
            this.f11657e.mo11417f();
            try {
                long b = this.f11658f.mo11077b(fVar, j);
                this.f11657e.mo11416a(true);
                return b;
            } catch (IOException e) {
                throw this.f11657e.mo11415a(e);
            } catch (Throwable th) {
                this.f11657e.mo11416a(false);
                throw th;
            }
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }

    public void close() {
        this.f11657e.mo11417f();
        try {
            this.f11658f.close();
            this.f11657e.mo11416a(true);
        } catch (IOException e) {
            throw this.f11657e.mo11415a(e);
        } catch (Throwable th) {
            this.f11657e.mo11416a(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("AsyncTimeout.source(");
        a.append(this.f11658f);
        a.append(')');
        return a.toString();
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11657e;
    }
}
