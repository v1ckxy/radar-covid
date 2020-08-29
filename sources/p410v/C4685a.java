package p410v;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.p401r.p403c.C4638h;
import p392u.p409w.C4681g;
import p410v.C4873x.C4874a;
import p410v.C4873x.C4876b;
import p410v.p411m0.C4737b;

/* renamed from: v.a */
public final class C4685a {

    /* renamed from: a */
    public final C4873x f10881a;

    /* renamed from: b */
    public final List<C4694c0> f10882b;

    /* renamed from: c */
    public final List<C4734m> f10883c;

    /* renamed from: d */
    public final C4860s f10884d;

    /* renamed from: e */
    public final SocketFactory f10885e;

    /* renamed from: f */
    public final SSLSocketFactory f10886f;

    /* renamed from: g */
    public final HostnameVerifier f10887g;

    /* renamed from: h */
    public final C4713h f10888h;

    /* renamed from: i */
    public final C4693c f10889i;

    /* renamed from: j */
    public final Proxy f10890j;

    /* renamed from: k */
    public final ProxySelector f10891k;

    public C4685a(String str, int i, C4860s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4713h hVar, C4693c cVar, Proxy proxy, List<? extends C4694c0> list, List<C4734m> list2, ProxySelector proxySelector) {
        int i2 = i;
        C4860s sVar2 = sVar;
        SocketFactory socketFactory2 = socketFactory;
        C4693c cVar2 = cVar;
        ProxySelector proxySelector2 = proxySelector;
        if (str == null) {
            C4638h.m10271a("uriHost");
            throw null;
        } else if (sVar2 == null) {
            C4638h.m10271a("dns");
            throw null;
        } else if (socketFactory2 == null) {
            C4638h.m10271a("socketFactory");
            throw null;
        } else if (cVar2 == null) {
            C4638h.m10271a("proxyAuthenticator");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("protocols");
            throw null;
        } else if (list2 == null) {
            C4638h.m10271a("connectionSpecs");
            throw null;
        } else if (proxySelector2 != null) {
            this.f10884d = sVar2;
            this.f10885e = socketFactory2;
            this.f10886f = sSLSocketFactory;
            this.f10887g = hostnameVerifier;
            this.f10888h = hVar;
            this.f10889i = cVar2;
            this.f10890j = proxy;
            this.f10891k = proxySelector2;
            C4874a aVar = new C4874a();
            String str2 = "https";
            String str3 = "http";
            String str4 = this.f10886f != null ? str2 : str3;
            boolean z = true;
            if (C4681g.m10322a(str4, str3, true)) {
                str2 = str3;
            } else if (!C4681g.m10322a(str4, str2, true)) {
                throw new IllegalArgumentException(C1965a.m4751a("unexpected scheme: ", str4));
            }
            aVar.f11627a = str2;
            String e = C0967p0.m2251e(C4876b.m10891a(C4873x.f11615l, str, 0, 0, false, 7));
            if (e != null) {
                aVar.f11630d = e;
                if (1 > i2 || 65535 < i2) {
                    z = false;
                }
                if (z) {
                    aVar.f11631e = i2;
                    this.f10881a = aVar.mo11402a();
                    this.f10882b = C4737b.m10474b(list);
                    this.f10883c = C4737b.m10474b(list2);
                    return;
                }
                throw new IllegalArgumentException(C1965a.m4761b("unexpected port: ", i).toString());
            }
            throw new IllegalArgumentException(C1965a.m4751a("unexpected host: ", str));
        } else {
            C4638h.m10271a("proxySelector");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo10966a(C4685a aVar) {
        if (aVar != null) {
            return C4638h.m10272a((Object) this.f10884d, (Object) aVar.f10884d) && C4638h.m10272a((Object) this.f10889i, (Object) aVar.f10889i) && C4638h.m10272a((Object) this.f10882b, (Object) aVar.f10882b) && C4638h.m10272a((Object) this.f10883c, (Object) aVar.f10883c) && C4638h.m10272a((Object) this.f10891k, (Object) aVar.f10891k) && C4638h.m10272a((Object) this.f10890j, (Object) aVar.f10890j) && C4638h.m10272a((Object) this.f10886f, (Object) aVar.f10886f) && C4638h.m10272a((Object) this.f10887g, (Object) aVar.f10887g) && C4638h.m10272a((Object) this.f10888h, (Object) aVar.f10888h) && this.f10881a.f11621f == aVar.f10881a.f11621f;
        }
        C4638h.m10271a("that");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4685a) {
            C4685a aVar = (C4685a) obj;
            if (C4638h.m10272a((Object) this.f10881a, (Object) aVar.f10881a) && mo10966a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f10888h) + ((Objects.hashCode(this.f10887g) + ((Objects.hashCode(this.f10886f) + ((Objects.hashCode(this.f10890j) + ((this.f10891k.hashCode() + ((this.f10883c.hashCode() + ((this.f10882b.hashCode() + ((this.f10889i.hashCode() + ((this.f10884d.hashCode() + ((this.f10881a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder a = C1965a.m4756a("Address{");
        a.append(this.f10881a.f11620e);
        a.append(':');
        a.append(this.f10881a.f11621f);
        a.append(p116io.jsonwebtoken.lang.Objects.ARRAY_ELEMENT_SEPARATOR);
        if (this.f10890j != null) {
            sb = C1965a.m4756a("proxy=");
            obj = this.f10890j;
        } else {
            sb = C1965a.m4756a("proxySelector=");
            obj = this.f10891k;
        }
        sb.append(obj);
        a.append(sb.toString());
        a.append(p116io.jsonwebtoken.lang.Objects.ARRAY_END);
        return a.toString();
    }
}
