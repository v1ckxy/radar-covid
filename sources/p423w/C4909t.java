package p423w;

import java.nio.ByteBuffer;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.t */
public final class C4909t implements C4895h {

    /* renamed from: e */
    public final C4892f f11694e;

    /* renamed from: f */
    public boolean f11695f;

    /* renamed from: g */
    public final C4915y f11696g;

    public C4909t(C4915y yVar) {
        if (yVar != null) {
            this.f11696g = yVar;
            this.f11694e = new C4892f();
            return;
        }
        C4638h.m10271a("sink");
        throw null;
    }

    /* renamed from: a */
    public C4895h mo11439a(long j) {
        if (!this.f11695f) {
            this.f11694e.mo11439a(j);
            return mo11463l();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C4895h mo11443a(C4897j jVar) {
        if (jVar == null) {
            C4638h.m10271a("byteString");
            throw null;
        } else if (!this.f11695f) {
            this.f11694e.mo11443a(jVar);
            mo11463l();
            return this;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: b */
    public C4886b0 mo11186b() {
        return this.f11696g.mo11186b();
    }

    public void close() {
        if (!this.f11695f) {
            Throwable th = null;
            try {
                if (this.f11694e.f11661f > 0) {
                    this.f11696g.mo11105a(this.f11694e, this.f11694e.f11661f);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f11696g.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f11695f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        if (!this.f11695f) {
            C4892f fVar = this.f11694e;
            long j = fVar.f11661f;
            if (j > 0) {
                this.f11696g.mo11105a(fVar, j);
            }
            this.f11696g.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C4892f getBuffer() {
        return this.f11694e;
    }

    /* renamed from: i */
    public C4895h mo11459i(long j) {
        if (!this.f11695f) {
            this.f11694e.mo11459i(j);
            mo11463l();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f11695f;
    }

    /* renamed from: l */
    public C4895h mo11463l() {
        if (!this.f11695f) {
            long k = this.f11694e.mo11462k();
            if (k > 0) {
                this.f11696g.mo11105a(this.f11694e, k);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("buffer(");
        a.append(this.f11696g);
        a.append(')');
        return a.toString();
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (!this.f11695f) {
            int write = this.f11694e.write(byteBuffer);
            mo11463l();
            return write;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public C4895h writeByte(int i) {
        if (!this.f11695f) {
            this.f11694e.writeByte(i);
            mo11463l();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C4895h writeInt(int i) {
        if (!this.f11695f) {
            this.f11694e.writeInt(i);
            return mo11463l();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C4895h writeShort(int i) {
        if (!this.f11695f) {
            this.f11694e.writeShort(i);
            mo11463l();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public void mo11105a(C4892f fVar, long j) {
        if (fVar == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (!this.f11695f) {
            this.f11694e.mo11105a(fVar, j);
            mo11463l();
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public C4895h write(byte[] bArr) {
        if (bArr == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (!this.f11695f) {
            this.f11694e.write(bArr);
            mo11463l();
            return this;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public long mo11435a(C4882a0 a0Var) {
        if (a0Var != null) {
            long j = 0;
            while (true) {
                long b = a0Var.mo11077b(this.f11694e, (long) 8192);
                if (b == -1) {
                    return j;
                }
                j += b;
                mo11463l();
            }
        } else {
            C4638h.m10271a("source");
            throw null;
        }
    }

    public C4895h write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C4638h.m10271a("source");
            throw null;
        } else if (!this.f11695f) {
            this.f11694e.write(bArr, i, i2);
            mo11463l();
            return this;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public C4895h mo11440a(String str) {
        if (str == null) {
            C4638h.m10271a("string");
            throw null;
        } else if (!this.f11695f) {
            this.f11694e.mo11440a(str);
            return mo11463l();
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
