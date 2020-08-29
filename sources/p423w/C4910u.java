package p423w;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p423w.p424c0.C4889a;

/* renamed from: w.u */
public final class C4910u implements C4896i {

    /* renamed from: e */
    public final C4892f f11697e;

    /* renamed from: f */
    public boolean f11698f;

    /* renamed from: g */
    public final C4882a0 f11699g;

    /* renamed from: w.u$a */
    public static final class C4911a extends InputStream {

        /* renamed from: e */
        public final /* synthetic */ C4910u f11700e;

        public C4911a(C4910u uVar) {
            this.f11700e = uVar;
        }

        public int available() {
            C4910u uVar = this.f11700e;
            if (!uVar.f11698f) {
                return (int) Math.min(uVar.f11697e.f11661f, (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f11700e.close();
        }

        public int read() {
            C4910u uVar = this.f11700e;
            if (!uVar.f11698f) {
                C4892f fVar = uVar.f11697e;
                if (fVar.f11661f == 0 && uVar.f11699g.mo11077b(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f11700e.f11697e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11700e);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                C4638h.m10271a("data");
                throw null;
            } else if (!this.f11700e.f11698f) {
                C0967p0.m2197a((long) bArr.length, (long) i, (long) i2);
                C4910u uVar = this.f11700e;
                C4892f fVar = uVar.f11697e;
                if (fVar.f11661f == 0 && uVar.f11699g.mo11077b(fVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f11700e.f11697e.read(bArr, i, i2);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public C4910u(C4882a0 a0Var) {
        if (a0Var != null) {
            this.f11699g = a0Var;
            this.f11697e = new C4892f();
            return;
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: a */
    public long mo11532a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f11698f) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long a = this.f11697e.mo11434a(b, j, j2);
                    if (a == -1) {
                        C4892f fVar = this.f11697e;
                        long j3 = fVar.f11661f;
                        if (j3 >= j2 || this.f11699g.mo11077b(fVar, (long) 8192) == -1) {
                            break;
                        }
                        j = Math.max(j, j3);
                    } else {
                        return a;
                    }
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        if (fVar != null) {
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
            } else if (!this.f11698f) {
                C4892f fVar2 = this.f11697e;
                if (fVar2.f11661f == 0 && this.f11699g.mo11077b(fVar2, (long) 8192) == -1) {
                    return -1;
                }
                return this.f11697e.mo11077b(fVar, Math.min(j, this.f11697e.f11661f));
            } else {
                throw new IllegalStateException("closed".toString());
            }
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11699g.mo11078b();
    }

    /* renamed from: c */
    public boolean mo11447c(long j) {
        C4892f fVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j).toString());
        } else if (!this.f11698f) {
            do {
                fVar = this.f11697e;
                if (fVar.f11661f >= j) {
                    return true;
                }
            } while (this.f11699g.mo11077b(fVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public void close() {
        if (!this.f11698f) {
            this.f11698f = true;
            this.f11699g.close();
            C4892f fVar = this.f11697e;
            fVar.skip(fVar.f11661f);
        }
    }

    /* renamed from: d */
    public String mo11450d() {
        return mo11454f(RecyclerView.FOREVER_NS);
    }

    /* renamed from: e */
    public byte[] mo11451e() {
        this.f11697e.mo11435a(this.f11699g);
        return this.f11697e.mo11451e();
    }

    /* renamed from: e */
    public byte[] mo11452e(long j) {
        if (mo11447c(j)) {
            return this.f11697e.mo11452e(j);
        }
        throw new EOFException();
    }

    /* renamed from: f */
    public String mo11454f(long j) {
        if (j >= 0) {
            long j2 = j == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo11532a(b, 0, j2);
            if (a != -1) {
                return this.f11697e.mo11455g(a);
            }
            if (j2 < RecyclerView.FOREVER_NS && mo11447c(j2) && this.f11697e.mo11449d(j2 - 1) == ((byte) 13) && mo11447c(1 + j2) && this.f11697e.mo11449d(j2) == b) {
                return this.f11697e.mo11455g(j2);
            }
            C4892f fVar = new C4892f();
            C4892f fVar2 = this.f11697e;
            fVar2.mo11442a(fVar, 0, Math.min((long) 32, fVar2.f11661f));
            StringBuilder a2 = C1965a.m4756a("\\n not found: limit=");
            a2.append(Math.min(this.f11697e.f11661f, j));
            a2.append(" content=");
            a2.append(C4889a.m10949d(fVar.mo11464m()));
            a2.append("…");
            throw new EOFException(a2.toString());
        }
        throw new IllegalArgumentException(C1965a.m4748a("limit < 0: ", j).toString());
    }

    public C4892f getBuffer() {
        return this.f11697e;
    }

    /* renamed from: h */
    public void mo11457h(long j) {
        if (!mo11447c(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: i */
    public boolean mo11460i() {
        if (!this.f11698f) {
            return this.f11697e.mo11460i() && this.f11699g.mo11077b(this.f11697e, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f11698f;
    }

    /* renamed from: n */
    public long mo11465n() {
        mo11457h(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo11447c(j2)) {
                break;
            }
            byte d = this.f11697e.mo11449d(j);
            if (d < ((byte) 48) || d > ((byte) 57)) {
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i != 0 || d != ((byte) 45)) {
                    if (i == 0) {
                        String format = String.format("Expected leading [0-9] or '-' character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(d)}, 1));
                        C4638h.m10270a((Object) format, "java.lang.String.format(format, *args)");
                        throw new NumberFormatException(format);
                    }
                }
            }
            j = j2;
        }
        return this.f11697e.mo11465n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo11467p() {
        /*
            r6 = this;
            r0 = 1
            r6.mo11457h(r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo11447c(r3)
            if (r3 == 0) goto L_0x0059
            w.f r3 = r6.f11697e
            long r4 = (long) r1
            byte r3 = r3.mo11449d(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x0021
            r4 = 57
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
        L_0x0021:
            r4 = 97
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x002b
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
        L_0x002b:
            r4 = 65
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x0038
            r4 = 70
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r1 = r2
            goto L_0x0007
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x0059
        L_0x003b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4[r0] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p392u.p401r.p403c.C4638h.m10270a(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0059:
            w.f r0 = r6.f11697e
            long r0 = r0.mo11467p()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423w.C4910u.mo11467p():long");
    }

    public C4896i peek() {
        return C0967p0.m2183a((C4882a0) new C4908s(this));
    }

    /* renamed from: q */
    public InputStream mo11469q() {
        return new C4911a(this);
    }

    public int read(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C4892f fVar = this.f11697e;
            if (fVar.f11661f == 0 && this.f11699g.mo11077b(fVar, (long) 8192) == -1) {
                return -1;
            }
            return this.f11697e.read(byteBuffer);
        }
        C4638h.m10271a("sink");
        throw null;
    }

    public byte readByte() {
        mo11457h(1);
        return this.f11697e.readByte();
    }

    public int readInt() {
        mo11457h(4);
        return this.f11697e.readInt();
    }

    public short readShort() {
        mo11457h(2);
        return this.f11697e.readShort();
    }

    public void skip(long j) {
        if (!this.f11698f) {
            while (j > 0) {
                C4892f fVar = this.f11697e;
                if (fVar.f11661f == 0 && this.f11699g.mo11077b(fVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f11697e.f11661f);
                this.f11697e.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("buffer(");
        a.append(this.f11699g);
        a.append(')');
        return a.toString();
    }

    /* renamed from: a */
    public long mo11436a(C4915y yVar) {
        if (yVar != null) {
            long j = 0;
            while (this.f11699g.mo11077b(this.f11697e, (long) 8192) != -1) {
                long k = this.f11697e.mo11462k();
                if (k > 0) {
                    j += k;
                    yVar.mo11105a(this.f11697e, k);
                }
            }
            C4892f fVar = this.f11697e;
            long j2 = fVar.f11661f;
            if (j2 <= 0) {
                return j;
            }
            long j3 = j + j2;
            yVar.mo11105a(fVar, j2);
            return j3;
        }
        C4638h.m10271a("sink");
        throw null;
    }

    /* renamed from: a */
    public int mo11531a() {
        mo11457h(4);
        int readInt = this.f11697e.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    /* renamed from: b */
    public C4897j mo11446b(long j) {
        if (mo11447c(j)) {
            return this.f11697e.mo11446b(j);
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public String mo11438a(Charset charset) {
        if (charset != null) {
            this.f11697e.mo11435a(this.f11699g);
            return this.f11697e.mo11438a(charset);
        }
        C4638h.m10271a("charset");
        throw null;
    }

    /* renamed from: a */
    public int mo11432a(C4905q qVar) {
        if (qVar == null) {
            C4638h.m10271a("options");
            throw null;
        } else if (!this.f11698f) {
            do {
                int a = this.f11697e.mo11433a(qVar, true);
                if (a != -2) {
                    if (a == -1) {
                        return -1;
                    }
                    this.f11697e.skip((long) qVar.f11684e[a].mo11503g());
                    return a;
                }
            } while (this.f11699g.mo11077b(this.f11697e, (long) 8192) != -1);
            return -1;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }
}
