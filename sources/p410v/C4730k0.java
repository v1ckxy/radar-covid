package p410v;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.k0 */
public final class C4730k0 {

    /* renamed from: a */
    public final C4685a f11115a;

    /* renamed from: b */
    public final Proxy f11116b;

    /* renamed from: c */
    public final InetSocketAddress f11117c;

    public C4730k0(C4685a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            C4638h.m10271a("address");
            throw null;
        } else if (proxy == null) {
            C4638h.m10271a("proxy");
            throw null;
        } else if (inetSocketAddress != null) {
            this.f11115a = aVar;
            this.f11116b = proxy;
            this.f11117c = inetSocketAddress;
        } else {
            C4638h.m10271a("socketAddress");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo11055a() {
        return this.f11115a.f10886f != null && this.f11116b.type() == Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4730k0) {
            C4730k0 k0Var = (C4730k0) obj;
            if (C4638h.m10272a((Object) k0Var.f11115a, (Object) this.f11115a) && C4638h.m10272a((Object) k0Var.f11116b, (Object) this.f11116b) && C4638h.m10272a((Object) k0Var.f11117c, (Object) this.f11117c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f11117c.hashCode() + ((this.f11116b.hashCode() + ((this.f11115a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("Route{");
        a.append(this.f11117c);
        a.append('}');
        return a.toString();
    }
}
