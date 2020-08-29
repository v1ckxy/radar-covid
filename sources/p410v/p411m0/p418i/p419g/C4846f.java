package p410v.p411m0.p418i.p419g;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.i.g.f */
public final class C4846f extends C4841a {

    /* renamed from: f */
    public static final C4847a f11561f = new C4847a(null);

    /* renamed from: v.m0.i.g.f$a */
    public static final class C4847a {
        public /* synthetic */ C4847a(C4636f fVar) {
        }
    }

    public C4846f(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        if (cls == null) {
            C4638h.m10271a("sslSocketClass");
            throw null;
        } else if (cls2 == null) {
            C4638h.m10271a("sslSocketFactoryClass");
            throw null;
        } else if (cls3 != null) {
            super(cls);
        } else {
            C4638h.m10271a("paramClass");
            throw null;
        }
    }
}
