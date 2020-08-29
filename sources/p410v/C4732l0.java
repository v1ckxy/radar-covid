package p410v;

import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.l0 */
public enum C4732l0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: l */
    public static final C4733a f11125l = null;

    /* renamed from: e */
    public final String f11126e;

    /* renamed from: v.l0$a */
    public static final class C4733a {
        public /* synthetic */ C4733a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4732l0 mo11059a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 79201641) {
                    if (hashCode != 79923350) {
                        switch (hashCode) {
                            case -503070503:
                                if (str.equals("TLSv1.1")) {
                                    return C4732l0.TLS_1_1;
                                }
                                break;
                            case -503070502:
                                if (str.equals("TLSv1.2")) {
                                    return C4732l0.TLS_1_2;
                                }
                                break;
                            case -503070501:
                                if (str.equals("TLSv1.3")) {
                                    return C4732l0.TLS_1_3;
                                }
                                break;
                        }
                    } else if (str.equals("TLSv1")) {
                        return C4732l0.TLS_1_0;
                    }
                } else if (str.equals("SSLv3")) {
                    return C4732l0.SSL_3_0;
                }
                throw new IllegalArgumentException(C1965a.m4751a("Unexpected TLS version: ", str));
            }
            C4638h.m10271a("javaName");
            throw null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f11125l = new C4733a(null);
    }

    /* access modifiers changed from: public */
    C4732l0(String str) {
        this.f11126e = str;
    }
}
