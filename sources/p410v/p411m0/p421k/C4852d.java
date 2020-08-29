package p410v.p411m0.p421k;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p392u.C4557i;
import p392u.p393n.C4570i;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.k.d */
public final class C4852d implements HostnameVerifier {

    /* renamed from: a */
    public static final C4852d f11565a = new C4852d();

    /* renamed from: a */
    public final List<String> mo11335a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C4570i.f10779e;
            }
            ArrayList arrayList = new ArrayList();
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        if (!(!C4638h.m10272a(list.get(0), (Object) Integer.valueOf(i)))) {
                            Object obj = list.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C4570i.f10779e;
        }
    }

    public boolean verify(String str, SSLSession sSLSession) {
        if (str == null) {
            C4638h.m10271a("host");
            throw null;
        } else if (sSLSession != null) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                if (certificate != null) {
                    return mo11336a(str, (X509Certificate) certificate);
                }
                throw new C4557i("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        } else {
            C4638h.m10271a("session");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0129 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11336a(java.lang.String r13, java.security.cert.X509Certificate r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0131
            if (r14 == 0) goto L_0x012b
            boolean r0 = p410v.p411m0.C4737b.m10467a(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0036
            r0 = 7
            java.util.List r14 = r12.mo11335a(r14, r0)
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001e
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x001e
            goto L_0x012a
        L_0x001e:
            java.util.Iterator r14 = r14.iterator()
        L_0x0022:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r14.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = p392u.p409w.C4681g.m10322a(r13, r0, r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x0129
        L_0x0036:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "Locale.US"
            p392u.p401r.p403c.C4638h.m10270a(r0, r3)
            java.lang.String r13 = r13.toLowerCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            p392u.p401r.p403c.C4638h.m10270a(r13, r0)
            r4 = 2
            java.util.List r14 = r12.mo11335a(r14, r4)
            boolean r5 = r14 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0057
            boolean r5 = r14.isEmpty()
            if (r5 == 0) goto L_0x0057
            goto L_0x012a
        L_0x0057:
            java.util.Iterator r14 = r14.iterator()
        L_0x005b:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x012a
            java.lang.Object r5 = r14.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r13.length()
            if (r6 != 0) goto L_0x006f
            r6 = r2
            goto L_0x0070
        L_0x006f:
            r6 = r1
        L_0x0070:
            if (r6 != 0) goto L_0x0126
            java.lang.String r6 = "."
            boolean r7 = p392u.p409w.C4681g.m10327b(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x0126
            java.lang.String r7 = ".."
            boolean r8 = p392u.p409w.C4681g.m10323a(r13, r7, r1, r4)
            if (r8 == 0) goto L_0x0084
            goto L_0x0126
        L_0x0084:
            if (r5 == 0) goto L_0x008f
            int r8 = r5.length()
            if (r8 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r8 = r1
            goto L_0x0090
        L_0x008f:
            r8 = r2
        L_0x0090:
            if (r8 != 0) goto L_0x0126
            boolean r8 = p392u.p409w.C4681g.m10327b(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x0126
            boolean r7 = p392u.p409w.C4681g.m10323a(r5, r7, r1, r4)
            if (r7 == 0) goto L_0x00a0
            goto L_0x0126
        L_0x00a0:
            boolean r7 = p392u.p409w.C4681g.m10323a(r13, r6, r1, r4)
            if (r7 != 0) goto L_0x00ab
            java.lang.String r7 = p213q.p214a.p215a.p216a.C1965a.m4751a(r13, r6)
            goto L_0x00ac
        L_0x00ab:
            r7 = r13
        L_0x00ac:
            boolean r8 = p392u.p409w.C4681g.m10323a(r5, r6, r1, r4)
            if (r8 != 0) goto L_0x00b6
            java.lang.String r5 = p213q.p214a.p215a.p216a.C1965a.m4751a(r5, r6)
        L_0x00b6:
            java.util.Locale r6 = java.util.Locale.US
            p392u.p401r.p403c.C4638h.m10270a(r6, r3)
            if (r5 == 0) goto L_0x011e
            java.lang.String r5 = r5.toLowerCase(r6)
            p392u.p401r.p403c.C4638h.m10270a(r5, r0)
            java.lang.String r6 = "*"
            boolean r6 = p392u.p409w.C4681g.m10318a(r5, r6, r1, r4)
            if (r6 != 0) goto L_0x00d1
            boolean r5 = p392u.p401r.p403c.C4638h.m10272a(r7, r5)
            goto L_0x0127
        L_0x00d1:
            java.lang.String r6 = "*."
            boolean r8 = p392u.p409w.C4681g.m10327b(r5, r6, r1, r4)
            if (r8 == 0) goto L_0x0126
            r8 = 42
            r9 = 4
            int r8 = p392u.p409w.C4681g.m10302a(r5, r8, r2, r1, r9)
            r10 = -1
            if (r8 == r10) goto L_0x00e4
            goto L_0x0126
        L_0x00e4:
            int r8 = r7.length()
            int r11 = r5.length()
            if (r8 >= r11) goto L_0x00ef
            goto L_0x0126
        L_0x00ef:
            boolean r6 = p392u.p401r.p403c.C4638h.m10272a(r6, r5)
            if (r6 == 0) goto L_0x00f6
            goto L_0x0126
        L_0x00f6:
            java.lang.String r5 = r5.substring(r2)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            p392u.p401r.p403c.C4638h.m10270a(r5, r6)
            boolean r6 = p392u.p409w.C4681g.m10323a(r7, r5, r1, r4)
            if (r6 != 0) goto L_0x0106
            goto L_0x0126
        L_0x0106:
            int r6 = r7.length()
            int r5 = r5.length()
            int r6 = r6 - r5
            if (r6 <= 0) goto L_0x011c
            r5 = 46
            int r6 = r6 + -1
            int r5 = p392u.p409w.C4681g.m10324b(r7, r5, r6, r1, r9)
            if (r5 == r10) goto L_0x011c
            goto L_0x0126
        L_0x011c:
            r5 = r2
            goto L_0x0127
        L_0x011e:
            u.i r13 = new u.i
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r14)
            throw r13
        L_0x0126:
            r5 = r1
        L_0x0127:
            if (r5 == 0) goto L_0x005b
        L_0x0129:
            r1 = r2
        L_0x012a:
            return r1
        L_0x012b:
            java.lang.String r13 = "certificate"
            p392u.p401r.p403c.C4638h.m10271a(r13)
            throw r0
        L_0x0131:
            java.lang.String r13 = "host"
            p392u.p401r.p403c.C4638h.m10271a(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p421k.C4852d.mo11336a(java.lang.String, java.security.cert.X509Certificate):boolean");
    }
}
