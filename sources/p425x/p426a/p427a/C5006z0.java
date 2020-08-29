package p425x.p426a.p427a;

import java.io.IOException;
import java.io.InputStream;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: x.a.a.z0 */
public class C5006z0 implements C4974p {

    /* renamed from: e */
    public C4992u1 f11896e;

    public C5006z0(C4992u1 u1Var) {
        this.f11896e = u1Var;
    }

    /* renamed from: c */
    public InputStream mo11580c() {
        return this.f11896e;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        try {
            return new C5003y0(this.f11896e.mo11637a());
        } catch (IOException e) {
            StringBuilder a = C1965a.m4756a("IOException converting stream to byte array: ");
            a.append(e.getMessage());
            throw new C4980r(a.toString(), e);
        }
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        return new C5003y0(this.f11896e.mo11637a());
    }
}
