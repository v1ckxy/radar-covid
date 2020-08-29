package p423w;

import java.io.IOException;
import java.io.InputStream;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.p */
public final class C4904p implements C4882a0 {

    /* renamed from: e */
    public final InputStream f11681e;

    /* renamed from: f */
    public final C4886b0 f11682f;

    public C4904p(InputStream inputStream, C4886b0 b0Var) {
        if (inputStream == null) {
            C4638h.m10271a("input");
            throw null;
        } else if (b0Var != null) {
            this.f11681e = inputStream;
            this.f11682f = b0Var;
        } else {
            C4638h.m10271a("timeout");
            throw null;
        }
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        if (fVar != null) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            if (i >= 0) {
                try {
                    this.f11682f.mo11429e();
                    C4912v a = fVar.mo11444a(1);
                    int read = this.f11681e.read(a.f11701a, a.f11703c, (int) Math.min(j, (long) (8192 - a.f11703c)));
                    if (read == -1) {
                        return -1;
                    }
                    a.f11703c += read;
                    long j2 = (long) read;
                    fVar.f11661f += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C0967p0.m2208a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            } else {
                throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
            }
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11682f;
    }

    public void close() {
        this.f11681e.close();
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("source(");
        a.append(this.f11681e);
        a.append(')');
        return a.toString();
    }
}
