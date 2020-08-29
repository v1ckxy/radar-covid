package p423w;

import java.io.IOException;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.c */
public final class C4888c implements C4915y {

    /* renamed from: e */
    public final /* synthetic */ C4883b f11653e;

    /* renamed from: f */
    public final /* synthetic */ C4915y f11654f;

    public C4888c(C4883b bVar, C4915y yVar) {
        this.f11653e = bVar;
        this.f11654f = yVar;
    }

    /* renamed from: a */
    public void mo11105a(C4892f fVar, long j) {
        if (fVar != null) {
            C0967p0.m2197a(fVar.f11661f, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C4912v vVar = fVar.f11660e;
                    if (vVar != null) {
                        while (true) {
                            if (j2 >= ((long) 65536)) {
                                break;
                            }
                            j2 += (long) (vVar.f11703c - vVar.f11702b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            vVar = vVar.f11706f;
                            if (vVar == null) {
                                C4638h.m10269a();
                                throw null;
                            }
                        }
                        this.f11653e.mo11417f();
                        try {
                            this.f11654f.mo11105a(fVar, j2);
                            j -= j2;
                            this.f11653e.mo11416a(true);
                        } catch (IOException e) {
                            throw this.f11653e.mo11415a(e);
                        } catch (Throwable th) {
                            this.f11653e.mo11416a(false);
                            throw th;
                        }
                    } else {
                        C4638h.m10269a();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        } else {
            C4638h.m10271a("source");
            throw null;
        }
    }

    /* renamed from: b */
    public C4886b0 mo11186b() {
        return this.f11653e;
    }

    public void close() {
        this.f11653e.mo11417f();
        try {
            this.f11654f.close();
            this.f11653e.mo11416a(true);
        } catch (IOException e) {
            throw this.f11653e.mo11415a(e);
        } catch (Throwable th) {
            this.f11653e.mo11416a(false);
            throw th;
        }
    }

    public void flush() {
        this.f11653e.mo11417f();
        try {
            this.f11654f.flush();
            this.f11653e.mo11416a(true);
        } catch (IOException e) {
            throw this.f11653e.mo11415a(e);
        } catch (Throwable th) {
            this.f11653e.mo11416a(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("AsyncTimeout.sink(");
        a.append(this.f11654f);
        a.append(')');
        return a.toString();
    }
}
