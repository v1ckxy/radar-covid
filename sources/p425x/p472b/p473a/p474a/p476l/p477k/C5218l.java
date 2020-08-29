package p425x.p472b.p473a.p474a.p476l.p477k;

import java.util.Date;
import p410v.C4720i0;
import p410v.C4870w;
import p410v.C4877y;
import p410v.C4877y.C4878a;
import p410v.p411m0.p414e.C4773c;
import p425x.p472b.p473a.p474a.p476l.p479m.C5229g;

/* renamed from: x.b.a.a.l.k.l */
public class C5218l implements C4877y {
    /* renamed from: a */
    public C4720i0 mo11074a(C4878a aVar) {
        C4720i0 a = aVar.mo11170a(aVar.mo11176g());
        C4720i0 i0Var = a.f11067m;
        if (i0Var == null) {
            return a;
        }
        String a2 = i0Var.f11065k.mo11366a("Date");
        Date a3 = a2 != null ? C4773c.m10573a(a2) : null;
        if (a3 == null) {
            return a;
        }
        String a4 = C4720i0.m10406a(i0Var, "Age", null, 2);
        if (Math.abs(i0Var.f11071q - (a3.getTime() + (a4 != null ? Long.parseLong(a4) * 1000 : 0))) <= 600000) {
            return a;
        }
        StringBuilder sb = new StringBuilder(1111);
        sb.append(i0Var.toString());
        String str = "\n";
        sb.append(str);
        C4870w wVar = i0Var.f11065k;
        int size = wVar.size();
        for (int i = 0; i < size; i++) {
            sb.append(wVar.mo11369e(i));
            sb.append(": ");
            sb.append(wVar.mo11371f(i));
            sb.append(str);
        }
        C5229g.m11665b("TimingVerification", sb.toString());
        throw new C5215i();
    }
}
