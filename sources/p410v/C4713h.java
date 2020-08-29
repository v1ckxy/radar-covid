package p410v;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p393n.C4568g;
import p392u.p393n.C4570i;
import p392u.p401r.p402b.C4607a;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p392u.p401r.p403c.C4645o;
import p392u.p401r.p403c.p404p.C4646a;
import p392u.p409w.C4681g;
import p410v.p411m0.p421k.C4851c;
import p423w.C4897j;
import p423w.C4897j.C4898a;

/* renamed from: v.h */
public final class C4713h {

    /* renamed from: c */
    public static final C4713h f11043c = new C4713h(C4568g.m10221c(new ArrayList()), null);

    /* renamed from: d */
    public static final C4714a f11044d = new C4714a(null);

    /* renamed from: a */
    public final Set<C4715b> f11045a;

    /* renamed from: b */
    public final C4851c f11046b;

    /* renamed from: v.h$a */
    public static final class C4714a {
        public /* synthetic */ C4714a(C4636f fVar) {
        }

        /* renamed from: a */
        public final String mo11025a(Certificate certificate) {
            if (certificate == null) {
                C4638h.m10271a("certificate");
                throw null;
            } else if (certificate instanceof X509Certificate) {
                StringBuilder a = C1965a.m4756a("sha256/");
                a.append(mo11026a((X509Certificate) certificate).mo11502f());
                return a.toString();
            } else {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
        }

        /* renamed from: a */
        public final C4897j mo11026a(X509Certificate x509Certificate) {
            if (x509Certificate != null) {
                C4898a aVar = C4897j.f11665i;
                PublicKey publicKey = x509Certificate.getPublicKey();
                C4638h.m10270a((Object) publicKey, "publicKey");
                byte[] encoded = publicKey.getEncoded();
                C4638h.m10270a((Object) encoded, "publicKey.encoded");
                return C4898a.m11029a(aVar, encoded, 0, 0, 3).mo11496a("SHA-256");
            }
            C4638h.m10271a("$this$toSha256ByteString");
            throw null;
        }
    }

    /* renamed from: v.h$b */
    public static final class C4715b {

        /* renamed from: a */
        public final String f11047a;

        /* renamed from: b */
        public final String f11048b;

        /* renamed from: c */
        public final String f11049c;

        /* renamed from: d */
        public final C4897j f11050d;

        public C4715b(String str, String str2, String str3, C4897j jVar) {
            if (str == null) {
                C4638h.m10271a("pattern");
                throw null;
            } else if (str2 == null) {
                C4638h.m10271a("canonicalHostname");
                throw null;
            } else if (str3 == null) {
                C4638h.m10271a("hashAlgorithm");
                throw null;
            } else if (jVar != null) {
                this.f11047a = str;
                this.f11048b = str2;
                this.f11049c = str3;
                this.f11050d = jVar;
            } else {
                C4638h.m10271a("hash");
                throw null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.f11050d, (java.lang.Object) r3.f11050d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof p410v.C4713h.C4715b
                if (r0 == 0) goto L_0x0031
                v.h$b r3 = (p410v.C4713h.C4715b) r3
                java.lang.String r0 = r2.f11047a
                java.lang.String r1 = r3.f11047a
                boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f11048b
                java.lang.String r1 = r3.f11048b
                boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.lang.String r0 = r2.f11049c
                java.lang.String r1 = r3.f11049c
                boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
                if (r0 == 0) goto L_0x0031
                w.j r0 = r2.f11050d
                w.j r3 = r3.f11050d
                boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.C4713h.C4715b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f11047a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f11048b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f11049c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C4897j jVar = this.f11050d;
            if (jVar != null) {
                i = jVar.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11049c);
            sb.append(this.f11050d.mo11502f());
            return sb.toString();
        }
    }

    public C4713h(Set<C4715b> set, C4851c cVar) {
        if (set != null) {
            this.f11045a = set;
            this.f11046b = cVar;
            return;
        }
        C4638h.m10271a("pins");
        throw null;
    }

    /* renamed from: a */
    public final void mo11022a(String str, C4607a<? extends List<? extends X509Certificate>> aVar) {
        C4715b bVar;
        if (str == null) {
            C4638h.m10271a("hostname");
            throw null;
        } else if (aVar != null) {
            List<C4715b> list = C4570i.f10779e;
            Iterator it = this.f11045a.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    C4715b bVar2 = (C4715b) it.next();
                    if (C4681g.m10327b(bVar2.f11047a, "*.", false, 2)) {
                        int a = C4681g.m10302a((CharSequence) str, '.', 0, false, 6);
                        if ((str.length() - a) - 1 == bVar2.f11048b.length() && C4681g.m10321a(str, bVar2.f11048b, a + 1, false, 4)) {
                            z = true;
                        }
                    } else {
                        z = C4638h.m10272a((Object) str, (Object) bVar2.f11048b);
                    }
                    if (z) {
                        if (list.isEmpty()) {
                            list = new ArrayList<>();
                        }
                        if (!(list instanceof C4646a)) {
                            list.add(bVar2);
                        } else {
                            C4645o.m10279a((Object) list, "kotlin.collections.MutableList");
                            throw null;
                        }
                    }
                } else if (!list.isEmpty()) {
                    List<X509Certificate> list2 = (List) aVar.mo3123c();
                    loop1:
                    for (X509Certificate x509Certificate : list2) {
                        Iterator it2 = list.iterator();
                        C4897j jVar = null;
                        C4897j jVar2 = null;
                        while (true) {
                            if (it2.hasNext()) {
                                bVar = (C4715b) it2.next();
                                String str2 = bVar.f11049c;
                                int hashCode = str2.hashCode();
                                if (hashCode == 109397962) {
                                    if (!str2.equals("sha1/")) {
                                        break loop1;
                                    }
                                    if (jVar == null) {
                                        if (x509Certificate != null) {
                                            C4898a aVar2 = C4897j.f11665i;
                                            PublicKey publicKey = x509Certificate.getPublicKey();
                                            C4638h.m10270a((Object) publicKey, "publicKey");
                                            byte[] encoded = publicKey.getEncoded();
                                            C4638h.m10270a((Object) encoded, "publicKey.encoded");
                                            jVar = C4898a.m11029a(aVar2, encoded, 0, 0, 3).mo11496a("SHA-1");
                                        } else {
                                            C4638h.m10271a("$this$toSha1ByteString");
                                            throw null;
                                        }
                                    }
                                    if (C4638h.m10272a((Object) bVar.f11050d, (Object) jVar)) {
                                        return;
                                    }
                                } else if (hashCode != 2052263656 || !str2.equals("sha256/")) {
                                    break loop1;
                                } else {
                                    if (jVar2 == null) {
                                        jVar2 = f11044d.mo11026a(x509Certificate);
                                    }
                                    if (C4638h.m10272a((Object) bVar.f11050d, (Object) jVar2)) {
                                        return;
                                    }
                                }
                            }
                        }
                        StringBuilder a2 = C1965a.m4756a("unsupported hashAlgorithm: ");
                        a2.append(bVar.f11049c);
                        throw new AssertionError(a2.toString());
                    }
                    StringBuilder b = C1965a.m4763b("Certificate pinning failure!", "\n  Peer certificate chain:");
                    Iterator it3 = list2.iterator();
                    while (true) {
                        String str3 = "\n    ";
                        if (it3.hasNext()) {
                            X509Certificate x509Certificate2 = (X509Certificate) it3.next();
                            if (x509Certificate2 != null) {
                                b.append(str3);
                                b.append(f11044d.mo11025a((Certificate) x509Certificate2));
                                b.append(": ");
                                Principal subjectDN = x509Certificate2.getSubjectDN();
                                C4638h.m10270a((Object) subjectDN, "x509Certificate.subjectDN");
                                b.append(subjectDN.getName());
                            } else {
                                throw new C4557i("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                        } else {
                            b.append("\n  Pinned certificates for ");
                            b.append(str);
                            b.append(":");
                            for (C4715b bVar3 : list) {
                                b.append(str3);
                                b.append(bVar3);
                            }
                            String sb = b.toString();
                            C4638h.m10270a((Object) sb, "StringBuilder().apply(builderAction).toString()");
                            throw new SSLPeerUnverifiedException(sb);
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            C4638h.m10271a("cleanedPeerCertificatesFn");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4713h) {
            C4713h hVar = (C4713h) obj;
            if (C4638h.m10272a((Object) hVar.f11045a, (Object) this.f11045a) && C4638h.m10272a((Object) hVar.f11046b, (Object) this.f11046b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f11045a.hashCode() + 1517) * 41;
        C4851c cVar = this.f11046b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
