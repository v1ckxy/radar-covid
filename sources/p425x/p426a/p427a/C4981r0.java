package p425x.p426a.p427a;

import java.io.IOException;

/* renamed from: x.a.a.r0 */
public class C4981r0 implements C4929d, C4995v1 {

    /* renamed from: e */
    public C5002y f11864e;

    public C4981r0(C5002y yVar) {
        this.f11864e = yVar;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        String str = "unable to get DER object";
        try {
            return mo11570g();
        } catch (IOException e) {
            throw new C4980r(str, e);
        } catch (IllegalArgumentException e2) {
            throw new C4980r(str, e2);
        }
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        try {
            return new C4966m1(this.f11864e.mo11654b());
        } catch (IllegalArgumentException e) {
            throw new C4942g(e.getMessage(), e);
        }
    }
}
