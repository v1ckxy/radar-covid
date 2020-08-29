package p425x.p426a.p427a;

import java.io.IOException;

/* renamed from: x.a.a.m0 */
public class C4965m0 implements C4918a0 {

    /* renamed from: e */
    public boolean f11845e;

    /* renamed from: f */
    public int f11846f;

    /* renamed from: g */
    public C5002y f11847g;

    public C4965m0(boolean z, int i, C5002y yVar) {
        this.f11845e = z;
        this.f11846f = i;
        this.f11847g = yVar;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        try {
            return mo11570g();
        } catch (IOException e) {
            throw new C4980r(e.getMessage());
        }
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        return this.f11847g.mo11653a(this.f11845e, this.f11846f);
    }
}
