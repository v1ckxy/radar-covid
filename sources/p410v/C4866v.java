package p410v;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4551d;
import p392u.C4556h;
import p392u.p393n.C4570i;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4634d;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4639i;
import p392u.p401r.p403c.C4641k;
import p392u.p401r.p403c.C4643m;
import p392u.p407u.C4661e;
import p410v.p411m0.C4737b;

/* renamed from: v.v */
public final class C4866v {

    /* renamed from: e */
    public static final /* synthetic */ C4661e[] f11603e;

    /* renamed from: f */
    public static final C4867a f11604f = new C4867a(null);

    /* renamed from: a */
    public final C4551d f11605a;

    /* renamed from: b */
    public final C4732l0 f11606b;

    /* renamed from: c */
    public final C4722j f11607c;

    /* renamed from: d */
    public final List<Certificate> f11608d;

    /* renamed from: v.v$a */
    public static final class C4867a {

        /* renamed from: v.v$a$a */
        public static final class C4868a extends C4639i implements C4607a<List<? extends Certificate>> {

            /* renamed from: f */
            public final /* synthetic */ List f11609f;

            public C4868a(List list) {
                this.f11609f = list;
                super(0);
            }

            /* renamed from: c */
            public Object mo3123c() {
                return this.f11609f;
            }
        }

        /* renamed from: v.v$a$b */
        public static final class C4869b extends C4639i implements C4607a<List<? extends Certificate>> {

            /* renamed from: f */
            public final /* synthetic */ List f11610f;

            public C4869b(List list) {
                this.f11610f = list;
                super(0);
            }

            /* renamed from: c */
            public Object mo3123c() {
                return this.f11610f;
            }
        }

        public /* synthetic */ C4867a(C4636f fVar) {
        }

        /* renamed from: a */
        public final C4866v mo11364a(SSLSession sSLSession) {
            List list;
            List list2;
            if (sSLSession != null) {
                String cipherSuite = sSLSession.getCipherSuite();
                if (cipherSuite == null) {
                    throw new IllegalStateException("cipherSuite == null".toString());
                } else if (!C4638h.m10272a((Object) "SSL_NULL_WITH_NULL_NULL", (Object) cipherSuite)) {
                    C4722j a = C4722j.f11104t.mo11046a(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    } else if (!C4638h.m10272a((Object) "NONE", (Object) protocol)) {
                        C4732l0 a2 = C4732l0.f11125l.mo11059a(protocol);
                        try {
                            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                            if (peerCertificates != null) {
                                list = C4737b.m10458a((T[]) (Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length));
                            } else {
                                list = C4570i.f10779e;
                            }
                        } catch (SSLPeerUnverifiedException unused) {
                            list = C4570i.f10779e;
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            list2 = C4737b.m10458a((T[]) (Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
                        } else {
                            list2 = C4570i.f10779e;
                        }
                        return new C4866v(a2, a, list2, new C4869b(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
                }
            } else {
                C4638h.m10271a("$this$handshake");
                throw null;
            }
        }

        /* renamed from: a */
        public final C4866v mo11365a(C4732l0 l0Var, C4722j jVar, List<? extends Certificate> list, List<? extends Certificate> list2) {
            if (l0Var == null) {
                C4638h.m10271a("tlsVersion");
                throw null;
            } else if (jVar == null) {
                C4638h.m10271a("cipherSuite");
                throw null;
            } else if (list == null) {
                C4638h.m10271a("peerCertificates");
                throw null;
            } else if (list2 != null) {
                return new C4866v(l0Var, jVar, C4737b.m10474b(list2), new C4868a(C4737b.m10474b(list)));
            } else {
                C4638h.m10271a("localCertificates");
                throw null;
            }
        }
    }

    static {
        C4661e[] eVarArr = new C4661e[1];
        Class<C4866v> cls = C4866v.class;
        if (C4643m.f10834a != null) {
            C4641k kVar = new C4641k(new C4634d(cls), "peerCertificates", "peerCertificates()Ljava/util/List;");
            if (C4643m.f10834a != null) {
                eVarArr[0] = kVar;
                f11603e = eVarArr;
                return;
            }
            throw null;
        }
        throw null;
    }

    public C4866v(C4732l0 l0Var, C4722j jVar, List<? extends Certificate> list, C4607a<? extends List<? extends Certificate>> aVar) {
        if (l0Var == null) {
            C4638h.m10271a("tlsVersion");
            throw null;
        } else if (jVar == null) {
            C4638h.m10271a("cipherSuite");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("localCertificates");
            throw null;
        } else if (aVar != null) {
            this.f11606b = l0Var;
            this.f11607c = jVar;
            this.f11608d = list;
            this.f11605a = new C4556h(aVar, null, 2);
        } else {
            C4638h.m10271a("peerCertificatesFn");
            throw null;
        }
    }

    /* renamed from: a */
    public final String mo11359a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C4638h.m10270a((Object) type, "type");
        return type;
    }

    /* renamed from: a */
    public final List<Certificate> mo11360a() {
        C4551d dVar = this.f11605a;
        C4661e eVar = f11603e[0];
        return (List) dVar.getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4866v) {
            C4866v vVar = (C4866v) obj;
            if (vVar.f11606b == this.f11606b && C4638h.m10272a((Object) vVar.f11607c, (Object) this.f11607c) && C4638h.m10272a((Object) vVar.mo11360a(), (Object) mo11360a()) && C4638h.m10272a((Object) vVar.f11608d, (Object) this.f11608d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f11608d.hashCode() + ((mo11360a().hashCode() + ((this.f11607c.hashCode() + ((this.f11606b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder b = C1965a.m4763b("Handshake{", "tlsVersion=");
        b.append(this.f11606b);
        b.append(' ');
        b.append("cipherSuite=");
        b.append(this.f11607c);
        b.append(' ');
        b.append("peerCertificates=");
        List<Certificate> a = mo11360a();
        ArrayList arrayList = new ArrayList(C2286e.m5158a((Iterable<? extends T>) a, 10));
        for (Certificate a2 : a) {
            arrayList.add(mo11359a(a2));
        }
        b.append(arrayList);
        b.append(' ');
        b.append("localCertificates=");
        List<Certificate> list = this.f11608d;
        ArrayList arrayList2 = new ArrayList(C2286e.m5158a((Iterable<? extends T>) list, 10));
        for (Certificate a3 : list) {
            arrayList2.add(mo11359a(a3));
        }
        b.append(arrayList2);
        b.append('}');
        return b.toString();
    }
}
