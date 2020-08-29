package p423w;

import java.io.OutputStream;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.r */
public final class C4907r implements C4915y {

    /* renamed from: e */
    public final OutputStream f11686e;

    /* renamed from: f */
    public final C4886b0 f11687f;

    public C4907r(OutputStream outputStream, C4886b0 b0Var) {
        if (outputStream == null) {
            C4638h.m10271a("out");
            throw null;
        } else if (b0Var != null) {
            this.f11686e = outputStream;
            this.f11687f = b0Var;
        } else {
            C4638h.m10271a("timeout");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11105a(C4892f fVar, long j) {
        if (fVar != null) {
            C0967p0.m2197a(fVar.f11661f, 0, j);
            while (j > 0) {
                this.f11687f.mo11429e();
                C4912v vVar = fVar.f11660e;
                if (vVar != null) {
                    int min = (int) Math.min(j, (long) (vVar.f11703c - vVar.f11702b));
                    this.f11686e.write(vVar.f11701a, vVar.f11702b, min);
                    int i = vVar.f11702b + min;
                    vVar.f11702b = i;
                    long j2 = (long) min;
                    j -= j2;
                    fVar.f11661f -= j2;
                    if (i == vVar.f11703c) {
                        fVar.f11660e = vVar.mo11541a();
                        C4913w.m11091a(vVar);
                    }
                } else {
                    C4638h.m10269a();
                    throw null;
                }
            }
            return;
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: b */
    public C4886b0 mo11186b() {
        return this.f11687f;
    }

    public void close() {
        this.f11686e.close();
    }

    public void flush() {
        this.f11686e.flush();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("sink(");
        a.append(this.f11686e);
        a.append(')');
        return a.toString();
    }
}
