package p410v.p411m0.p413d;

import java.io.IOException;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.d.k */
public final class C4765k extends RuntimeException {

    /* renamed from: e */
    public IOException f11265e;

    /* renamed from: f */
    public final IOException f11266f;

    public C4765k(IOException iOException) {
        if (iOException != null) {
            super(iOException);
            this.f11266f = iOException;
            this.f11265e = iOException;
            return;
        }
        C4638h.m10271a("firstConnectException");
        throw null;
    }
}
