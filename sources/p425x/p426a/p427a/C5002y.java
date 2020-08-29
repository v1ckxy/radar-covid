package p425x.p426a.p427a;

import java.io.IOException;
import java.io.InputStream;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.y */
public class C5002y {

    /* renamed from: a */
    public final InputStream f11889a;

    /* renamed from: b */
    public final int f11890b;

    /* renamed from: c */
    public final byte[][] f11891c = new byte[11][];

    public C5002y(InputStream inputStream) {
        int a = C4924b2.m11132a(inputStream);
        this.f11889a = inputStream;
        this.f11890b = a;
    }

    public C5002y(InputStream inputStream, int i) {
        this.f11889a = inputStream;
        this.f11890b = i;
    }

    /* renamed from: a */
    public C4929d mo11652a() {
        C4929d dVar;
        int read = this.f11889a.read();
        if (read == -1) {
            return null;
        }
        InputStream inputStream = this.f11889a;
        boolean z = false;
        if (inputStream instanceof C4998w1) {
            C4998w1 w1Var = (C4998w1) inputStream;
            w1Var.f11885j = false;
            w1Var.mo11645a();
        }
        int a = C4955j.m11218a(this.f11889a, read);
        boolean z2 = (read & 32) != 0;
        InputStream inputStream2 = this.f11889a;
        int i = this.f11890b;
        if (a == 4 || a == 16 || a == 17 || a == 8) {
            z = true;
        }
        int a2 = C4955j.m11219a(inputStream2, i, z);
        if (a2 >= 0) {
            C4992u1 u1Var = new C4992u1(this.f11889a, a2, this.f11890b);
            if ((read & 64) != 0) {
                return new C4960k1(z2, a, u1Var.mo11637a());
            }
            if ((read & 128) != 0) {
                return new C4965m0(z2, a, new C5002y(u1Var));
            }
            if (z2) {
                if (a == 4) {
                    return new C4943g0(new C5002y(u1Var));
                }
                if (a == 8) {
                    return new C4981r0(new C5002y(u1Var));
                }
                if (a == 16) {
                    return new C4979q1(new C5002y(u1Var));
                }
                if (a == 17) {
                    return new C4985s1(new C5002y(u1Var));
                }
                throw new IOException(C1965a.m4762b("unknown tag ", a, " encountered"));
            } else if (a == 4) {
                return new C5006z0(u1Var);
            } else {
                try {
                    return C4955j.m11220a(a, u1Var, this.f11891c);
                } catch (IllegalArgumentException e) {
                    throw new C4942g("corrupted stream detected", e);
                }
            }
        } else if (z2) {
            C5002y yVar = new C5002y(new C4998w1(this.f11889a, this.f11890b), this.f11890b);
            if ((read & 64) != 0) {
                return new C4930d0(a, yVar);
            }
            if ((read & 128) != 0) {
                return new C4965m0(true, a, yVar);
            }
            if (a == 4) {
                dVar = new C4943g0(yVar);
            } else if (a == 8) {
                dVar = new C4981r0(yVar);
            } else if (a == 16) {
                dVar = new C4953i0(yVar);
            } else if (a == 17) {
                dVar = new C4959k0(yVar);
            } else {
                StringBuilder a3 = C1965a.m4756a("unknown BER object encountered: 0x");
                a3.append(Integer.toHexString(a));
                throw new C4942g(a3.toString());
            }
            return dVar;
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    /* renamed from: b */
    public C4933e mo11654b() {
        C4929d a = mo11652a();
        if (a == null) {
            return new C4933e(0);
        }
        C4933e eVar = new C4933e(10);
        do {
            eVar.mo11573a((C4929d) a instanceof C4995v1 ? ((C4995v1) a).mo11570g() : a.mo11569f());
            a = mo11652a();
        } while (a != null);
        return eVar;
    }

    /* renamed from: a */
    public C4983s mo11653a(boolean z, int i) {
        if (!z) {
            return new C4989t1(false, i, new C5003y0(((C4992u1) this.f11889a).mo11637a()));
        }
        C4933e b = mo11654b();
        if (this.f11889a instanceof C4998w1) {
            return b.f11772b == 1 ? new C4962l0(true, i, b.mo11572a(0)) : new C4962l0(false, i, C4934e0.m11158a(b));
        }
        return b.f11772b == 1 ? new C4989t1(true, i, b.mo11572a(0)) : new C4989t1(false, i, C4970n1.m11275a(b));
    }
}
