package p425x.p426a.p445e.p447b.p448a;

import java.util.HashMap;
import java.util.Map;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p430e2.C4936a;
import p425x.p426a.p434b.C5008a;
import p425x.p426a.p434b.p435c.C5014e;
import p425x.p426a.p434b.p435c.C5016g;
import p425x.p426a.p434b.p435c.C5017h;

/* renamed from: x.a.e.b.a.b */
public class C5042b {

    /* renamed from: a */
    public static Map<String, C4967n> f12048a = new HashMap();

    /* renamed from: b */
    public static Map<C4967n, String> f12049b = new HashMap();

    static {
        String str = "SHA-256";
        f12048a.put(str, C4936a.f11778c);
        String str2 = "SHA-512";
        f12048a.put(str2, C4936a.f11780e);
        String str3 = "SHAKE128";
        f12048a.put(str3, C4936a.f11784i);
        String str4 = "SHAKE256";
        f12048a.put(str4, C4936a.f11785j);
        f12049b.put(C4936a.f11778c, str);
        f12049b.put(C4936a.f11780e, str2);
        f12049b.put(C4936a.f11784i, str3);
        f12049b.put(C4936a.f11785j, str4);
    }

    /* renamed from: a */
    public static C5008a m11504a(C4967n nVar) {
        if (nVar.mo11626b(C4936a.f11778c)) {
            return new C5014e();
        }
        if (nVar.mo11626b(C4936a.f11780e)) {
            return new C5016g();
        }
        if (nVar.mo11626b(C4936a.f11784i)) {
            return new C5017h(128);
        }
        if (nVar.mo11626b(C4936a.f11785j)) {
            return new C5017h(256);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unrecognized digest OID: ");
        sb.append(nVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
