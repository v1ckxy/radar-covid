package p410v.p411m0.p418i;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.Conscrypt.Version;
import org.conscrypt.ConscryptHostnameVerifier;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;

/* renamed from: v.m0.i.b */
public final class C4832b extends C4839f {

    /* renamed from: e */
    public static final boolean f11529e;

    /* renamed from: f */
    public static final C4833a f11530f = new C4833a(null);

    /* renamed from: d */
    public final Provider f11531d;

    /* renamed from: v.m0.i.b$a */
    public static final class C4833a {
        public /* synthetic */ C4833a(C4636f fVar) {
        }

        /* renamed from: a */
        public final boolean mo11317a(int i, int i2, int i3) {
            Version version = Conscrypt.version();
            boolean z = true;
            if (version.major() != i) {
                if (version.major() <= i) {
                    z = false;
                }
                return z;
            } else if (version.minor() != i2) {
                if (version.minor() <= i2) {
                    z = false;
                }
                return z;
            } else {
                if (version.patch() < i3) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* renamed from: v.m0.i.b$b */
    public static final class C4834b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C4834b f11532a = new C4834b();
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version");
            if (Conscrypt.isAvailable() && f11530f.mo11317a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        }
        f11529e = z;
    }

    public C4832b() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        C4638h.m10270a((Object) build, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.f11531d = build;
    }

    /* renamed from: a */
    public SSLContext mo11313a() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f11531d);
        C4638h.m10270a((Object) instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: a */
    public void mo11314a(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            C4638h.m10271a("socketFactory");
            throw null;
        } else if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: b */
    public String mo11303b(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        } else {
            super.mo11303b(sSLSocket);
            return null;
        }
    }

    /* renamed from: b */
    public X509TrustManager mo11315b() {
        X509TrustManager defaultX509TrustManager = Conscrypt.getDefaultX509TrustManager();
        C4638h.m10270a((Object) defaultX509TrustManager, "Conscrypt.getDefaultX509TrustManager()");
        return defaultX509TrustManager;
    }

    /* renamed from: c */
    public void mo11316c(X509TrustManager x509TrustManager) {
        if (Conscrypt.isConscrypt(x509TrustManager)) {
            Conscrypt.setHostnameVerifier(x509TrustManager, C4834b.f11532a);
        }
    }

    /* renamed from: a */
    public void mo11301a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("protocols");
            throw null;
        } else if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Object[] array = C4839f.f11548c.mo11321a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
        } else {
            super.mo11301a(sSLSocket, str, list);
        }
    }
}
