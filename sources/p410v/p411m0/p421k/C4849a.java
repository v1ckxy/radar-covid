package p410v.p411m0.p421k;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;

/* renamed from: v.m0.k.a */
public final class C4849a extends C4851c {

    /* renamed from: a */
    public final C4853e f11563a;

    public C4849a(C4853e eVar) {
        if (eVar != null) {
            this.f11563a = eVar;
        } else {
            C4638h.m10271a("trustRootIndex");
            throw null;
        }
    }

    /* renamed from: a */
    public List<Certificate> mo11306a(List<? extends Certificate> list, String str) {
        if (list == null) {
            C4638h.m10271a("chain");
            throw null;
        } else if (str != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list);
            ArrayList arrayList = new ArrayList();
            Object removeFirst = arrayDeque.removeFirst();
            C4638h.m10270a(removeFirst, "queue.removeFirst()");
            arrayList.add(removeFirst);
            int i = 0;
            boolean z = false;
            while (i < 9) {
                Object obj = arrayList.get(arrayList.size() - 1);
                String str2 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
                if (obj != null) {
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    X509Certificate a = this.f11563a.mo11309a(x509Certificate);
                    if (a != null) {
                        if (arrayList.size() > 1 || (!C4638h.m10272a((Object) x509Certificate, (Object) a))) {
                            arrayList.add(a);
                        }
                        if (mo11330a(a, a)) {
                            return arrayList;
                        }
                        z = true;
                    } else {
                        Iterator it = arrayDeque.iterator();
                        C4638h.m10270a((Object) it, "queue.iterator()");
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next != null) {
                                X509Certificate x509Certificate2 = (X509Certificate) next;
                                if (mo11330a(x509Certificate, x509Certificate2)) {
                                    it.remove();
                                    arrayList.add(x509Certificate2);
                                }
                            } else {
                                throw new C4557i(str2);
                            }
                        }
                        if (z) {
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to find a trusted cert that signed ");
                        sb.append(x509Certificate);
                        throw new SSLPeerUnverifiedException(sb.toString());
                    }
                    i++;
                } else {
                    throw new C4557i(str2);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate chain too long: ");
            sb2.append(arrayList);
            throw new SSLPeerUnverifiedException(sb2.toString());
        } else {
            C4638h.m10271a("hostname");
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo11330a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        boolean z = true;
        if (!C4638h.m10272a((Object) x509Certificate.getIssuerDN(), (Object) x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
        } catch (GeneralSecurityException unused) {
            z = false;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C4849a) && C4638h.m10272a((Object) ((C4849a) obj).f11563a, (Object) this.f11563a);
    }

    public int hashCode() {
        return this.f11563a.hashCode();
    }
}
