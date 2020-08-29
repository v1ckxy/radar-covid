package p425x.p426a.p445e.p447b.p455h;

import java.util.HashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p430e2.C4936a;
import p425x.p426a.p434b.C5008a;
import p425x.p426a.p434b.p435c.C5014e;
import p425x.p426a.p434b.p435c.C5016g;
import p425x.p426a.p434b.p435c.C5017h;

/* renamed from: x.a.e.b.h.f */
public class C5084f {

    /* renamed from: a */
    public static Map<String, C4967n> f12174a = new HashMap();

    /* renamed from: b */
    public static Map<C4967n, String> f12175b = new HashMap();

    static {
        String str = "SHA-256";
        f12174a.put(str, C4936a.f11778c);
        String str2 = "SHA-512";
        f12174a.put(str2, C4936a.f11780e);
        String str3 = "SHAKE128";
        f12174a.put(str3, C4936a.f11784i);
        String str4 = "SHAKE256";
        f12174a.put(str4, C4936a.f11785j);
        f12175b.put(C4936a.f11778c, str);
        f12175b.put(C4936a.f11780e, str2);
        f12175b.put(C4936a.f11784i, str3);
        f12175b.put(C4936a.f11785j, str4);
    }

    /* renamed from: a */
    public static C4967n m11549a(String str) {
        C4967n nVar = (C4967n) f12174a.get(str);
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException(C1965a.m4751a("unrecognized digest name: ", str));
    }

    /* renamed from: a */
    public static C5008a m11550a(C4967n nVar) {
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
