package p425x.p426a.p445e.p447b.p455h;

import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p434b.C5008a;

/* renamed from: x.a.e.b.h.m */
public final class C5097m {

    /* renamed from: a */
    public final C5111v f12202a;

    /* renamed from: b */
    public final int f12203b;

    /* renamed from: c */
    public final int f12204c;

    /* renamed from: d */
    public final int f12205d;

    /* renamed from: e */
    public final int f12206e;

    /* renamed from: f */
    public final int f12207f;

    /* renamed from: g */
    public final C4967n f12208g;

    public C5097m(C4967n nVar) {
        if (nVar != null) {
            this.f12208g = nVar;
            C5008a a = C5084f.m11550a(nVar);
            String algorithmName = a.getAlgorithmName();
            int i = algorithmName.equals("SHAKE128") ? 32 : algorithmName.equals("SHAKE256") ? 64 : a.mo11659a();
            this.f12203b = i;
            this.f12204c = 16;
            int ceil = (int) Math.ceil(((double) (i * 8)) / ((double) C0967p0.m2240c(16)));
            this.f12206e = ceil;
            int floor = ((int) Math.floor((double) (C0967p0.m2240c((this.f12204c - 1) * ceil) / C0967p0.m2240c(this.f12204c)))) + 1;
            this.f12207f = floor;
            this.f12205d = this.f12206e + floor;
            C5096l b = C5096l.m11567b(a.getAlgorithmName(), this.f12203b, this.f12204c, this.f12205d);
            this.f12202a = b;
            if (b == null) {
                StringBuilder a2 = C1965a.m4756a("cannot find OID for digest algorithm: ");
                a2.append(a.getAlgorithmName());
                throw new IllegalArgumentException(a2.toString());
            }
            return;
        }
        throw new NullPointerException("treeDigest == null");
    }
}
