package p425x.p426a.p445e.p456c.p458b.p460d;

import java.security.PrivateKey;
import p425x.p426a.p445e.p447b.p449b.C5059e;

/* renamed from: x.a.e.c.b.d.c */
public class C5131c implements PrivateKey {

    /* renamed from: e */
    public C5059e f12295e;

    public C5131c(C5059e eVar) {
        this.f12295e = eVar;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C5131c)) {
            return false;
        }
        C5131c cVar = (C5131c) obj;
        C5059e eVar = this.f12295e;
        int i = eVar.f12112a;
        C5059e eVar2 = cVar.f12295e;
        if (i == eVar2.f12112a && eVar.f12113b == eVar2.f12113b && eVar.f12114c.equals(eVar2.f12114c) && this.f12295e.f12115d.equals(cVar.f12295e.f12115d) && this.f12295e.f12116e.equals(cVar.f12295e.f12116e) && this.f12295e.f12117f.equals(cVar.f12295e.f12117f) && this.f12295e.f12118g.equals(cVar.f12295e.f12118g)) {
            z = true;
        }
        return z;
    }

    public String getAlgorithm() {
        return "McEliece";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r9 = this;
            x.a.e.a.c r8 = new x.a.e.a.c
            x.a.e.b.b.e r0 = r9.f12295e
            int r1 = r0.f12112a
            int r2 = r0.f12113b
            x.a.e.d.a.b r3 = r0.f12114c
            x.a.e.d.a.e r4 = r0.f12115d
            x.a.e.d.a.d r5 = r0.f12117f
            x.a.e.d.a.d r6 = r0.f12118g
            x.a.e.d.a.a r7 = r0.f12116e
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            x.a.a.h2.a r1 = new x.a.a.h2.a     // Catch:{ IOException -> 0x0027 }
            x.a.a.n r2 = p425x.p426a.p445e.p446a.C5031e.f11988c     // Catch:{ IOException -> 0x0027 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0027 }
            x.a.a.g2.b r2 = new x.a.a.g2.b     // Catch:{ IOException -> 0x0027 }
            r2.<init>(r1, r8, r0, r0)     // Catch:{ IOException -> 0x0027 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p425x.p426a.p445e.p456c.p458b.p460d.C5131c.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        C5059e eVar = this.f12295e;
        return this.f12295e.f12116e.hashCode() + ((this.f12295e.f12118g.hashCode() + ((this.f12295e.f12117f.hashCode() + ((eVar.f12115d.hashCode() + (((((eVar.f12113b * 37) + eVar.f12112a) * 37) + eVar.f12114c.f12343b) * 37)) * 37)) * 37)) * 37);
    }
}
