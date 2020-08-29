package p423w;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: w.n */
public final class C4902n implements C4882a0 {

    /* renamed from: e */
    public byte f11672e;

    /* renamed from: f */
    public final C4910u f11673f;

    /* renamed from: g */
    public final Inflater f11674g;

    /* renamed from: h */
    public final C4903o f11675h;

    /* renamed from: i */
    public final CRC32 f11676i;

    public C4902n(C4882a0 a0Var) {
        if (a0Var != null) {
            this.f11673f = new C4910u(a0Var);
            Inflater inflater = new Inflater(true);
            this.f11674g = inflater;
            this.f11675h = new C4903o(this.f11673f, inflater);
            this.f11676i = new CRC32();
            return;
        }
        C4638h.m10271a("source");
        throw null;
    }

    /* renamed from: a */
    public final void mo11514a(String str, int i, int i2) {
        if (i2 != i) {
            Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i)};
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(objArr, 3));
            C4638h.m10270a((Object) format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: a */
    public final void mo11515a(C4892f fVar, long j, long j2) {
        C4912v vVar = fVar.f11660e;
        if (vVar != null) {
            do {
                int i = vVar.f11703c;
                int i2 = vVar.f11702b;
                if (j >= ((long) (i - i2))) {
                    j -= (long) (i - i2);
                    vVar = vVar.f11706f;
                } else {
                    while (j2 > 0) {
                        int i3 = (int) (((long) vVar.f11702b) + j);
                        int min = (int) Math.min((long) (vVar.f11703c - i3), j2);
                        this.f11676i.update(vVar.f11701a, i3, min);
                        j2 -= (long) min;
                        vVar = vVar.f11706f;
                        if (vVar != null) {
                            j = 0;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    }
                    return;
                }
            } while (vVar != null);
            C4638h.m10269a();
            throw null;
        }
        C4638h.m10269a();
        throw null;
    }

    /* renamed from: b */
    public long mo11077b(C4892f fVar, long j) {
        long j2;
        C4892f fVar2 = fVar;
        long j3 = j;
        if (fVar2 != null) {
            int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
            boolean z = false;
            if (!(i >= 0)) {
                throw new IllegalArgumentException(C1965a.m4748a("byteCount < 0: ", j3).toString());
            } else if (i == 0) {
                return 0;
            } else {
                if (this.f11672e == 0) {
                    this.f11673f.mo11457h(10);
                    byte d = this.f11673f.f11697e.mo11449d(3);
                    boolean z2 = ((d >> 1) & 1) == 1;
                    if (z2) {
                        mo11515a(this.f11673f.f11697e, 0, 10);
                    }
                    C4910u uVar = this.f11673f;
                    uVar.mo11457h(2);
                    mo11514a("ID1ID2", 8075, (int) uVar.f11697e.readShort());
                    this.f11673f.skip(8);
                    if (((d >> 2) & 1) == 1) {
                        this.f11673f.mo11457h(2);
                        if (z2) {
                            mo11515a(this.f11673f.f11697e, 0, 2);
                        }
                        long o = (long) this.f11673f.f11697e.mo11466o();
                        this.f11673f.mo11457h(o);
                        if (z2) {
                            j2 = o;
                            mo11515a(this.f11673f.f11697e, 0, o);
                        } else {
                            j2 = o;
                        }
                        this.f11673f.skip(j2);
                    }
                    if (((d >> 3) & 1) == 1) {
                        long a = this.f11673f.mo11532a(0, 0, RecyclerView.FOREVER_NS);
                        if (a != -1) {
                            if (z2) {
                                mo11515a(this.f11673f.f11697e, 0, a + 1);
                            }
                            this.f11673f.skip(a + 1);
                        } else {
                            throw new EOFException();
                        }
                    }
                    if (((d >> 4) & 1) == 1) {
                        z = true;
                    }
                    if (z) {
                        long a2 = this.f11673f.mo11532a(0, 0, RecyclerView.FOREVER_NS);
                        if (a2 != -1) {
                            if (z2) {
                                mo11515a(this.f11673f.f11697e, 0, a2 + 1);
                            }
                            this.f11673f.skip(a2 + 1);
                        } else {
                            throw new EOFException();
                        }
                    }
                    if (z2) {
                        C4910u uVar2 = this.f11673f;
                        uVar2.mo11457h(2);
                        mo11514a("FHCRC", (int) uVar2.f11697e.mo11466o(), (int) (short) ((int) this.f11676i.getValue()));
                        this.f11676i.reset();
                    }
                    this.f11672e = 1;
                }
                if (this.f11672e == 1) {
                    long j4 = fVar2.f11661f;
                    long b = this.f11675h.mo11077b(fVar2, j3);
                    if (b != -1) {
                        mo11515a(fVar, j4, b);
                        return b;
                    }
                    this.f11672e = 2;
                }
                if (this.f11672e == 2) {
                    mo11514a("CRC", this.f11673f.mo11531a(), (int) this.f11676i.getValue());
                    mo11514a("ISIZE", this.f11673f.mo11531a(), (int) this.f11674g.getBytesWritten());
                    this.f11672e = 3;
                    if (!this.f11673f.mo11460i()) {
                        throw new IOException("gzip finished without exhausting source");
                    }
                }
                return -1;
            }
        } else {
            C4638h.m10271a("sink");
            throw null;
        }
    }

    /* renamed from: b */
    public C4886b0 mo11078b() {
        return this.f11673f.mo11078b();
    }

    public void close() {
        this.f11675h.close();
    }
}
