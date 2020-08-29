package p410v.p411m0.p418i;

import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;
import p116io.jsonwebtoken.lang.Objects;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;

/* renamed from: v.m0.i.e */
public final class C4838e extends C4839f {

    /* renamed from: e */
    public static final boolean f11543e;

    /* renamed from: f */
    public static final C4838e f11544f = null;

    /* renamed from: d */
    public final Provider f11545d = new OpenJSSE();

    static {
        boolean z;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f11543e = z;
    }

    /* renamed from: a */
    public SSLContext mo11313a() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f11545d);
        C4638h.m10270a((Object) instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: a */
    public void mo11301a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("protocols");
            throw null;
        } else if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof org.openjsse.javax.net.ssl.SSLParameters) {
                org.openjsse.javax.net.ssl.SSLParameters sSLParameters2 = (org.openjsse.javax.net.ssl.SSLParameters) sSLParameters;
                Object[] array = C4839f.f11548c.mo11321a(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            super.mo11301a(sSLSocket, str, list);
        }
    }

    /* renamed from: b */
    public String mo11303b(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol != null && !C4638h.m10272a((Object) applicationProtocol, (Object) Objects.EMPTY_STRING)) {
                return applicationProtocol;
            }
            return null;
        } else {
            super.mo11303b(sSLSocket);
            return null;
        }
    }

    /* renamed from: b */
    public X509TrustManager mo11315b() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f11545d);
        instance.init(null);
        C4638h.m10270a((Object) instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new C4557i("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            StringBuilder a = C1965a.m4756a("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            C4638h.m10270a((Object) arrays, "java.util.Arrays.toString(this)");
            a.append(arrays);
            throw new IllegalStateException(a.toString().toString());
        }
        C4638h.m10269a();
        throw null;
    }
}
