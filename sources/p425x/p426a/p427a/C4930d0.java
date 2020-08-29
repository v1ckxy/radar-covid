package p425x.p426a.p427a;

import java.io.IOException;

/* renamed from: x.a.a.d0 */
public class C4930d0 implements C4929d, C4995v1 {

    /* renamed from: e */
    public final int f11765e;

    /* renamed from: f */
    public final C5002y f11766f;

    public C4930d0(int i, C5002y yVar) {
        this.f11765e = i;
        this.f11766f = yVar;
    }

    /* renamed from: f */
    public C4983s mo11569f() {
        try {
            return mo11570g();
        } catch (IOException e) {
            throw new C4980r(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public C4983s mo11570g() {
        return new C4926c0(this.f11765e, this.f11766f.mo11654b());
    }
}
