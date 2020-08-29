package p410v;

import java.io.IOException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.c0 */
public enum C4694c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: m */
    public static final C4695a f10975m = null;

    /* renamed from: e */
    public final String f10976e;

    /* renamed from: v.c0$a */
    public static final class C4695a {
        public /* synthetic */ C4695a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4694c0 mo10983a(String str) {
            if (str == null) {
                C4638h.m10271a("protocol");
                throw null;
            } else if (C4638h.m10272a((Object) str, (Object) C4694c0.HTTP_1_0.f10976e)) {
                return C4694c0.HTTP_1_0;
            } else {
                if (C4638h.m10272a((Object) str, (Object) C4694c0.HTTP_1_1.f10976e)) {
                    return C4694c0.HTTP_1_1;
                }
                if (C4638h.m10272a((Object) str, (Object) C4694c0.H2_PRIOR_KNOWLEDGE.f10976e)) {
                    return C4694c0.H2_PRIOR_KNOWLEDGE;
                }
                if (C4638h.m10272a((Object) str, (Object) C4694c0.HTTP_2.f10976e)) {
                    return C4694c0.HTTP_2;
                }
                if (C4638h.m10272a((Object) str, (Object) C4694c0.SPDY_3.f10976e)) {
                    return C4694c0.SPDY_3;
                }
                if (C4638h.m10272a((Object) str, (Object) C4694c0.QUIC.f10976e)) {
                    return C4694c0.QUIC;
                }
                throw new IOException(C1965a.m4751a("Unexpected protocol: ", str));
            }
        }
    }

    /* access modifiers changed from: public */
    static {
        f10975m = new C4695a(null);
    }

    /* access modifiers changed from: public */
    C4694c0(String str) {
        this.f10976e = str;
    }

    public String toString() {
        return this.f10976e;
    }
}
