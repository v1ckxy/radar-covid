package p425x.p426a.p445e.p447b.p454g;

import java.util.HashMap;
import java.util.Map;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4967n;
import p425x.p426a.p427a.p430e2.C4936a;
import p425x.p426a.p427a.p433h2.C4950a;
import p425x.p426a.p434b.C5008a;
import p425x.p426a.p434b.p435c.C5014e;
import p425x.p426a.p434b.p435c.C5016g;
import p425x.p426a.p434b.p435c.C5017h;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p446a.C5034h;

/* renamed from: x.a.e.b.g.b */
public class C5078b {

    /* renamed from: a */
    public static final C4950a f12139a = new C4950a(C5031e.f12002q);

    /* renamed from: b */
    public static final C4950a f12140b = new C4950a(C5031e.f12003r);

    /* renamed from: c */
    public static final C4950a f12141c = new C4950a(C4936a.f11783h);

    /* renamed from: d */
    public static final C4950a f12142d = new C4950a(C4936a.f11782g);

    /* renamed from: e */
    public static final C4950a f12143e = new C4950a(C4936a.f11778c);

    /* renamed from: f */
    public static final C4950a f12144f = new C4950a(C4936a.f11780e);

    /* renamed from: g */
    public static final C4950a f12145g = new C4950a(C4936a.f11784i);

    /* renamed from: h */
    public static final C4950a f12146h = new C4950a(C4936a.f11785j);

    /* renamed from: i */
    public static final Map f12147i;

    static {
        HashMap hashMap = new HashMap();
        f12147i = hashMap;
        hashMap.put(C5031e.f12002q, Integer.valueOf(5));
        f12147i.put(C5031e.f12003r, Integer.valueOf(6));
    }

    /* renamed from: a */
    public static String m11533a(C5034h hVar) {
        C4950a aVar = hVar.f12019f;
        if (aVar.f11831e.mo11626b(f12141c.f11831e)) {
            return "SHA3-256";
        }
        if (aVar.f11831e.mo11626b(f12142d.f11831e)) {
            return "SHA-512/256";
        }
        StringBuilder a = C1965a.m4756a("unknown tree digest: ");
        a.append(aVar.f11831e);
        throw new IllegalArgumentException(a.toString());
    }

    /* renamed from: a */
    public static C4950a m11534a(int i) {
        if (i == 5) {
            return f12139a;
        }
        if (i == 6) {
            return f12140b;
        }
        throw new IllegalArgumentException(C1965a.m4761b("unknown security category: ", i));
    }

    /* renamed from: a */
    public static C4950a m11535a(String str) {
        if (str.equals("SHA3-256")) {
            return f12141c;
        }
        if (str.equals("SHA-512/256")) {
            return f12142d;
        }
        throw new IllegalArgumentException(C1965a.m4751a("unknown tree digest: ", str));
    }

    /* renamed from: a */
    public static C5008a m11536a(C4967n nVar) {
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

    /* renamed from: b */
    public static C4950a m11537b(String str) {
        if (str.equals("SHA-256")) {
            return f12143e;
        }
        if (str.equals("SHA-512")) {
            return f12144f;
        }
        if (str.equals("SHAKE128")) {
            return f12145g;
        }
        if (str.equals("SHAKE256")) {
            return f12146h;
        }
        throw new IllegalArgumentException(C1965a.m4751a("unknown tree digest: ", str));
    }
}
