package p425x.p426a.p427a;

import java.io.IOException;
import java.io.InputStream;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p469f.p471j.C5173a;

/* renamed from: x.a.a.g0 */
public class C4943g0 implements C4974p {

    /* renamed from: e */
    public C5002y f11796e;

    public C4943g0(C5002y yVar) {
        this.f11796e = yVar;
    }

    /* renamed from: c */
    public InputStream mo11580c() {
        return new C4969n0(this.f11796e);
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        try {
            return mo11570g();
        } catch (IOException e) {
            StringBuilder a = C1965a.m4756a("IOException converting stream to byte array: ");
            a.append(e.getMessage());
            throw new C4980r(a.toString(), e);
        }
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        return new C4938f0(C5173a.m11610a(mo11580c()));
    }
}
