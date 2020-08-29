package p425x.p426a.p427a;

/* renamed from: x.a.a.r */
public class C4980r extends IllegalStateException {

    /* renamed from: e */
    public Throwable f11863e;

    public C4980r(String str) {
        super(str);
    }

    public C4980r(String str, Throwable th) {
        super(str);
        this.f11863e = th;
    }

    public Throwable getCause() {
        return this.f11863e;
    }
}
