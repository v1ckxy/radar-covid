package p410v.p411m0.p421k;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.k.b */
public final class C4850b implements C4853e {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f11564a;

    public C4850b(X509Certificate... x509CertificateArr) {
        if (x509CertificateArr != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (X509Certificate x509Certificate : x509CertificateArr) {
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                C4638h.m10270a((Object) subjectX500Principal, "caCert.subjectX500Principal");
                Object obj = linkedHashMap.get(subjectX500Principal);
                if (obj == null) {
                    obj = new LinkedHashSet();
                    linkedHashMap.put(subjectX500Principal, obj);
                }
                ((Set) obj).add(x509Certificate);
            }
            this.f11564a = linkedHashMap;
            return;
        }
        C4638h.m10271a("caCerts");
        throw null;
    }

    /* renamed from: a */
    public X509Certificate mo11309a(X509Certificate x509Certificate) {
        boolean z;
        Object obj = null;
        if (x509Certificate != null) {
            Set set = (Set) this.f11564a.get(x509Certificate.getIssuerX500Principal());
            if (set == null) {
                return null;
            }
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    z = true;
                    continue;
                } catch (Exception unused) {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        C4638h.m10271a("cert");
        throw null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4850b) && C4638h.m10272a((Object) ((C4850b) obj).f11564a, (Object) this.f11564a));
    }

    public int hashCode() {
        return this.f11564a.hashCode();
    }
}
