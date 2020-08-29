package p425x.p426a.p427a;

import java.io.IOException;

/* renamed from: x.a.a.g */
public class C4942g extends IOException {

    /* renamed from: e */
    public Throwable f11795e;

    public C4942g(String str) {
        super(str);
    }

    public C4942g(String str, Throwable th) {
        super(str);
        this.f11795e = th;
    }

    public Throwable getCause() {
        return this.f11795e;
    }
}
