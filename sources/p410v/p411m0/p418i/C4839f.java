package p410v.p411m0.p418i;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p213q.p214a.p215a.p216a.C1965a;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.C4690b0;
import p410v.C4694c0;
import p410v.p411m0.p421k.C4849a;
import p410v.p411m0.p421k.C4850b;
import p410v.p411m0.p421k.C4851c;
import p410v.p411m0.p421k.C4853e;
import p423w.C4892f;

/* renamed from: v.m0.i.f */
public class C4839f {

    /* renamed from: a */
    public static volatile C4839f f11546a;

    /* renamed from: b */
    public static final Logger f11547b = Logger.getLogger(C4690b0.class.getName());

    /* renamed from: c */
    public static final C4840a f11548c = new C4840a(null);

    /* renamed from: v.m0.i.f$a */
    public static final class C4840a {
        public /* synthetic */ C4840a(C4636f fVar) {
        }

        /* renamed from: a */
        public final List<String> mo11321a(List<? extends C4694c0> list) {
            if (list != null) {
                ArrayList<C4694c0> arrayList = new ArrayList<>();
                for (Object next : list) {
                    if (((C4694c0) next) != C4694c0.HTTP_1_0) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C2286e.m5158a((Iterable<? extends T>) arrayList, 10));
                for (C4694c0 c0Var : arrayList) {
                    arrayList2.add(c0Var.f10976e);
                }
                return arrayList2;
            }
            C4638h.m10271a("protocols");
            throw null;
        }

        /* renamed from: b */
        public final byte[] mo11322b(List<? extends C4694c0> list) {
            if (list != null) {
                C4892f fVar = new C4892f();
                Iterator it = ((ArrayList) mo11321a(list)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    fVar.writeByte(str.length());
                    fVar.mo11440a(str);
                }
                return fVar.mo11451e();
            }
            C4638h.m10271a("protocols");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [v.m0.i.f] */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v17, types: [v.m0.i.f] */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v9, types: [v.m0.i.d] */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26, types: [v.m0.i.e] */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v31, types: [v.m0.i.b] */
    /* JADX WARNING: type inference failed for: r0v32 */
    /* JADX WARNING: type inference failed for: r0v33, types: [v.m0.i.a] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: type inference failed for: r0v36 */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r0 != 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r0 != 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (java.lang.Integer.parseInt(r3) >= 9) goto L_0x010c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARNING: Unknown variable types count: 9 */
    static {
        /*
            v.m0.i.f$a r0 = new v.m0.i.f$a
            r1 = 0
            r0.<init>(r1)
            f11548c = r0
            v.m0.i.a$b r0 = p410v.p411m0.p418i.C4828a.f11522g
            boolean r0 = p410v.p411m0.p418i.C4828a.f11521f
            if (r0 == 0) goto L_0x0014
            v.m0.i.a r0 = new v.m0.i.a
            r0.<init>()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0115
        L_0x0019:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r2 = 0
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            p392u.p401r.p403c.C4638h.m10270a(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r4, r0)
            if (r0 == 0) goto L_0x0042
            v.m0.i.b$a r0 = p410v.p411m0.p418i.C4832b.f11530f
            boolean r0 = p410v.p411m0.p418i.C4832b.f11529e
            if (r0 == 0) goto L_0x003d
            v.m0.i.b r0 = new v.m0.i.b
            r0.<init>()
            goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            if (r0 == 0) goto L_0x0042
            goto L_0x0115
        L_0x0042:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p392u.p401r.p403c.C4638h.m10270a(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r3, r0)
            if (r0 == 0) goto L_0x0068
            v.m0.i.e r0 = p410v.p411m0.p418i.C4838e.f11544f
            boolean r0 = p410v.p411m0.p418i.C4838e.f11543e
            if (r0 == 0) goto L_0x0063
            v.m0.i.e r0 = new v.m0.i.e
            r0.<init>()
            goto L_0x0064
        L_0x0063:
            r0 = r1
        L_0x0064:
            if (r0 == 0) goto L_0x0068
            goto L_0x0115
        L_0x0068:
            r0 = 1
            java.lang.Class<javax.net.ssl.SSLParameters> r3 = javax.net.ssl.SSLParameters.class
            java.lang.String r4 = "setApplicationProtocols"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0091 }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x0091 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0091 }
            java.lang.Class<javax.net.ssl.SSLSocket> r4 = javax.net.ssl.SSLSocket.class
            java.lang.String r5 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0091 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0091 }
            v.m0.i.d r5 = new v.m0.i.d     // Catch:{ NoSuchMethodException -> 0x0091 }
            java.lang.String r6 = "setProtocolMethod"
            p392u.p401r.p403c.C4638h.m10270a(r3, r6)     // Catch:{ NoSuchMethodException -> 0x0091 }
            java.lang.String r6 = "getProtocolMethod"
            p392u.p401r.p403c.C4638h.m10270a(r4, r6)     // Catch:{ NoSuchMethodException -> 0x0091 }
            r5.<init>(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0091 }
            goto L_0x0092
        L_0x0091:
            r5 = r1
        L_0x0092:
            if (r5 == 0) goto L_0x0097
            r0 = r5
            goto L_0x0115
        L_0x0097:
            java.lang.String r3 = "java.specification.version"
            java.lang.String r4 = "unknown"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            java.lang.String r4 = "jvmVersion"
            p392u.p401r.p403c.C4638h.m10270a(r3, r4)     // Catch:{ NumberFormatException -> 0x00ad }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00ad }
            r4 = 9
            if (r3 < r4) goto L_0x00ad
            goto L_0x010c
        L_0x00ad:
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r3 = java.lang.Class.forName(r3, r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            r6[r0] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.reflect.Method r7 = r3.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.reflect.Method r8 = r3.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r4 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r0[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.reflect.Method r9 = r3.getMethod(r4, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            v.m0.i.c r0 = new v.m0.i.c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r2 = "putMethod"
            p392u.p401r.p403c.C4638h.m10270a(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r2 = "getMethod"
            p392u.p401r.p403c.C4638h.m10270a(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r2 = "removeMethod"
            p392u.p401r.p403c.C4638h.m10270a(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r2 = "clientProviderClass"
            p392u.p401r.p403c.C4638h.m10270a(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            java.lang.String r2 = "serverProviderClass"
            p392u.p401r.p403c.C4638h.m10270a(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x010c }
            r1 = r0
        L_0x010c:
            if (r1 == 0) goto L_0x0110
            r0 = r1
            goto L_0x0115
        L_0x0110:
            v.m0.i.f r0 = new v.m0.i.f
            r0.<init>()
        L_0x0115:
            f11546a = r0
            java.lang.Class<v.b0> r0 = p410v.C4690b0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f11547b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p418i.C4839f.<clinit>():void");
    }

    /* renamed from: a */
    public SSLContext mo11313a() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C4638h.m10270a((Object) instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: a */
    public void mo11318a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        }
    }

    /* renamed from: b */
    public X509TrustManager mo11315b() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    /* renamed from: b */
    public C4853e mo11304b(X509TrustManager x509TrustManager) {
        if (x509TrustManager != null) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            C4638h.m10270a((Object) acceptedIssuers, "trustManager.acceptedIssuers");
            return new C4850b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        C4638h.m10271a("trustManager");
        throw null;
    }

    /* renamed from: c */
    public void mo11316c(X509TrustManager x509TrustManager) {
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C4638h.m10270a((Object) simpleName, "javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: a */
    public C4851c mo11297a(X509TrustManager x509TrustManager) {
        if (x509TrustManager != null) {
            return new C4849a(mo11304b(x509TrustManager));
        }
        C4638h.m10271a("trustManager");
        throw null;
    }

    /* renamed from: b */
    public String mo11303b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            return null;
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }

    /* renamed from: a */
    public void mo11314a(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            C4638h.m10271a("socketFactory");
            throw null;
        }
    }

    /* renamed from: b */
    public boolean mo11305b(String str) {
        if (str != null) {
            return true;
        }
        C4638h.m10271a("hostname");
        throw null;
    }

    /* renamed from: a */
    public void mo11301a(SSLSocket sSLSocket, String str, List<C4694c0> list) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("protocols");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11300a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        if (socket == null) {
            C4638h.m10271a("socket");
            throw null;
        } else if (inetSocketAddress != null) {
            socket.connect(inetSocketAddress, i);
        } else {
            C4638h.m10271a("address");
            throw null;
        }
    }

    /* renamed from: a */
    public Object mo11296a(String str) {
        if (str == null) {
            C4638h.m10271a("closer");
            throw null;
        } else if (f11547b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public void mo11298a(int i, String str, Throwable th) {
        if (str != null) {
            f11547b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
        } else {
            C4638h.m10271a("message");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11299a(String str, Object obj) {
        if (str != null) {
            if (obj == null) {
                str = C1965a.m4751a(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            }
            mo11298a(5, str, (Throwable) obj);
            return;
        }
        C4638h.m10271a("message");
        throw null;
    }
}
