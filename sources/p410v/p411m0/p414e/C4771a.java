package p410v.p411m0.p414e;

import java.util.List;
import p119o.p120a.C0967p0;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4706e0;
import p410v.C4706e0.C4707a;
import p410v.C4716h0;
import p410v.C4720i0;
import p410v.C4720i0.C4721a;
import p410v.C4725j0;
import p410v.C4854n;
import p410v.C4858p;
import p410v.C4870w.C4871a;
import p410v.C4877y;
import p410v.C4877y.C4878a;
import p410v.C4879z;
import p410v.p411m0.C4737b;
import p423w.C4882a0;
import p423w.C4902n;

/* renamed from: v.m0.e.a */
public final class C4771a implements C4877y {

    /* renamed from: a */
    public final C4858p f11294a;

    public C4771a(C4858p pVar) {
        if (pVar != null) {
            this.f11294a = pVar;
        } else {
            C4638h.m10271a("cookieJar");
            throw null;
        }
    }

    /* renamed from: a */
    public C4720i0 mo11074a(C4878a aVar) {
        boolean z;
        C4878a aVar2 = aVar;
        if (aVar2 != null) {
            C4706e0 g = aVar.mo11176g();
            if (g != null) {
                C4707a aVar3 = new C4707a(g);
                C4716h0 h0Var = g.f11032e;
                String str = "Content-Type";
                String str2 = "Content-Length";
                if (h0Var != null) {
                    C4879z b = h0Var.mo10973b();
                    if (b != null) {
                        aVar3.mo11017a(str, b.f11638a);
                    }
                    long a = h0Var.mo10970a();
                    String str3 = "Transfer-Encoding";
                    if (a != -1) {
                        aVar3.mo11017a(str2, String.valueOf(a));
                        aVar3.mo11016a(str3);
                    } else {
                        aVar3.mo11017a(str3, "chunked");
                        aVar3.mo11016a(str2);
                    }
                }
                String str4 = "Host";
                int i = 0;
                if (g.mo11012a(str4) == null) {
                    aVar3.mo11017a(str4, C4737b.m10456a(g.f11029b, false));
                }
                String str5 = "Connection";
                if (g.mo11012a(str5) == null) {
                    aVar3.mo11017a(str5, "Keep-Alive");
                }
                String str6 = "Accept-Encoding";
                String str7 = "gzip";
                if (g.mo11012a(str6) == null && g.mo11012a("Range") == null) {
                    aVar3.mo11017a(str6, str7);
                    z = true;
                } else {
                    z = false;
                }
                List a2 = this.f11294a.mo11344a(g.f11029b);
                if (!a2.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object next : a2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C4854n nVar = (C4854n) next;
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(nVar.f11571a);
                            sb.append('=');
                            sb.append(nVar.f11572b);
                            i = i2;
                        } else {
                            C2286e.m5338f();
                            throw null;
                        }
                    }
                    String sb2 = sb.toString();
                    C4638h.m10270a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
                    aVar3.mo11017a("Cookie", sb2);
                }
                String str8 = "User-Agent";
                if (g.mo11012a(str8) == null) {
                    aVar3.mo11017a(str8, "okhttp/4.2.1");
                }
                C4720i0 a3 = aVar2.mo11170a(aVar3.mo11021a());
                C4776e.m10582a(this.f11294a, g.f11029b, a3.f11065k);
                C4721a aVar4 = new C4721a(a3);
                aVar4.f11073a = g;
                if (z) {
                    String str9 = "Content-Encoding";
                    if (C4681g.m10322a(str7, C4720i0.m10406a(a3, str9, null, 2), true) && C4776e.m10583a(a3)) {
                        C4725j0 j0Var = a3.f11066l;
                        if (j0Var != null) {
                            C4902n nVar2 = new C4902n(j0Var.mo10991h());
                            C4871a c = a3.f11065k.mo11368c();
                            c.mo11381c(str9);
                            c.mo11381c(str2);
                            aVar4.mo11041a(c.mo11378a());
                            aVar4.f11079g = new C4779h(C4720i0.m10406a(a3, str, null, 2), -1, C0967p0.m2183a((C4882a0) nVar2));
                        }
                    }
                }
                return aVar4.mo11042a();
            }
            throw null;
        }
        C4638h.m10271a("chain");
        throw null;
    }
}
