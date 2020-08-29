package p410v;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.t */
public abstract class C4861t {

    /* renamed from: a */
    public static final C4861t f11596a = new C4862a();

    /* renamed from: v.t$a */
    public static final class C4862a extends C4861t {
    }

    /* renamed from: v.t$b */
    public interface C4863b {
        /* renamed from: a */
        C4861t mo11072a(C4708f fVar);
    }

    /* renamed from: a */
    public void mo11355a(C4708f fVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (inetSocketAddress == null) {
            C4638h.m10271a("inetSocketAddress");
            throw null;
        } else if (proxy == null) {
            C4638h.m10271a("proxy");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo11357b(C4708f fVar, IOException iOException) {
        if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (iOException == null) {
            C4638h.m10271a("ioe");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11356a(C4708f fVar, C4729k kVar) {
        if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (kVar == null) {
            C4638h.m10271a("connection");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11354a(C4708f fVar, IOException iOException) {
        if (fVar == null) {
            C4638h.m10271a("call");
            throw null;
        } else if (iOException == null) {
            C4638h.m10271a("ioe");
            throw null;
        }
    }
}
