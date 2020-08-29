package p410v.p411m0.p418i.p419g;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4694c0;
import p410v.p411m0.p418i.C4839f;
import p410v.p411m0.p418i.C4839f.C4840a;

/* renamed from: v.m0.i.g.d */
public final class C4844d implements C4845e {

    /* renamed from: a */
    public boolean f11558a;

    /* renamed from: b */
    public C4845e f11559b;

    /* renamed from: c */
    public final String f11560c;

    public C4844d(String str) {
        if (str != null) {
            this.f11560c = str;
        } else {
            C4638h.m10271a("socketPackage");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11324a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list != null) {
            C4845e c = mo11327c(sSLSocket);
            if (c != null) {
                c.mo11324a(sSLSocket, str, list);
            }
        } else {
            C4638h.m10271a("protocols");
            throw null;
        }
    }

    /* renamed from: a */
    public boolean mo11325a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo11326b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            String name = sSLSocket.getClass().getName();
            C4638h.m10270a((Object) name, "sslSocket.javaClass.name");
            return C4681g.m10327b(name, this.f11560c, false, 2);
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }

    /* renamed from: c */
    public final synchronized C4845e mo11327c(SSLSocket sSLSocket) {
        if (!this.f11558a) {
            try {
                Class cls = sSLSocket.getClass();
                while (true) {
                    String name = cls.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f11560c);
                    sb.append(".OpenSSLSocketImpl");
                    if (!(!C4638h.m10272a((Object) name, (Object) sb.toString()))) {
                        break;
                    }
                    cls = cls.getSuperclass();
                    C4638h.m10270a((Object) cls, "possibleClass.superclass");
                }
                this.f11559b = new C4841a(cls);
            } catch (Exception e) {
                C4840a aVar = C4839f.f11548c;
                C4839f fVar = C4839f.f11546a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to initialize DeferredSocketAdapter ");
                sb2.append(this.f11560c);
                fVar.mo11298a(5, sb2.toString(), (Throwable) e);
            }
            this.f11558a = true;
        }
        return this.f11559b;
    }

    /* renamed from: a */
    public String mo11323a(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            C4845e c = mo11327c(sSLSocket);
            if (c != null) {
                return c.mo11323a(sSLSocket);
            }
            return null;
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }
}
