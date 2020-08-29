package p410v.p411m0.p418i;

import android.os.Build.VERSION;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;
import p410v.p411m0.p418i.C4832b.C4833a;
import p410v.p411m0.p418i.p419g.C4842b;
import p410v.p411m0.p418i.p419g.C4843c;
import p410v.p411m0.p418i.p419g.C4844d;
import p410v.p411m0.p418i.p419g.C4845e;
import p410v.p411m0.p418i.p419g.C4846f;
import p410v.p411m0.p418i.p419g.C4846f.C4847a;
import p410v.p411m0.p421k.C4849a;
import p410v.p411m0.p421k.C4851c;
import p410v.p411m0.p421k.C4853e;

/* renamed from: v.m0.i.a */
public final class C4828a extends C4839f {

    /* renamed from: f */
    public static final boolean f11521f;

    /* renamed from: g */
    public static final C4830b f11522g = new C4830b(null);

    /* renamed from: d */
    public final List<C4845e> f11523d;

    /* renamed from: e */
    public final C4842b f11524e;

    /* renamed from: v.m0.i.a$a */
    public static final class C4829a extends C4851c {

        /* renamed from: a */
        public final Object f11525a;

        /* renamed from: b */
        public final Method f11526b;

        public C4829a(Object obj, Method method) {
            if (obj == null) {
                C4638h.m10271a("x509TrustManagerExtensions");
                throw null;
            } else if (method != null) {
                this.f11525a = obj;
                this.f11526b = method;
            } else {
                C4638h.m10271a("checkServerTrusted");
                throw null;
            }
        }

        /* renamed from: a */
        public List<Certificate> mo11306a(List<? extends Certificate> list, String str) {
            if (list == null) {
                C4638h.m10271a("chain");
                throw null;
            } else if (str != null) {
                try {
                    Object[] array = list.toArray(new X509Certificate[0]);
                    if (array != null) {
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) array;
                        Object invoke = this.f11526b.invoke(this.f11525a, new Object[]{x509CertificateArr, "RSA", str});
                        if (invoke != null) {
                            return (List) invoke;
                        }
                        throw new C4557i("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
                    }
                    throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
                } catch (InvocationTargetException e) {
                    SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                    sSLPeerUnverifiedException.initCause(e);
                    throw sSLPeerUnverifiedException;
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            } else {
                C4638h.m10271a("hostname");
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C4829a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: v.m0.i.a$b */
    public static final class C4830b {
        public /* synthetic */ C4830b(C4636f fVar) {
        }
    }

    /* renamed from: v.m0.i.a$c */
    public static final class C4831c implements C4853e {

        /* renamed from: a */
        public final X509TrustManager f11527a;

        /* renamed from: b */
        public final Method f11528b;

        public C4831c(X509TrustManager x509TrustManager, Method method) {
            if (x509TrustManager == null) {
                C4638h.m10271a("trustManager");
                throw null;
            } else if (method != null) {
                this.f11527a = x509TrustManager;
                this.f11528b = method;
            } else {
                C4638h.m10271a("findByIssuerAndSignatureMethod");
                throw null;
            }
        }

        /* renamed from: a */
        public X509Certificate mo11309a(X509Certificate x509Certificate) {
            if (x509Certificate != null) {
                try {
                    Object invoke = this.f11528b.invoke(this.f11527a, new Object[]{x509Certificate});
                    if (invoke != null) {
                        return ((TrustAnchor) invoke).getTrustedCert();
                    }
                    throw new C4557i("null cannot be cast to non-null type java.security.cert.TrustAnchor");
                } catch (IllegalAccessException e) {
                    throw new AssertionError("unable to get issues and signature", e);
                } catch (InvocationTargetException unused) {
                    return null;
                }
            } else {
                C4638h.m10271a("cert");
                throw null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p392u.p401r.p403c.C4638h.m10272a((java.lang.Object) r2.f11528b, (java.lang.Object) r3.f11528b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p410v.p411m0.p418i.C4828a.C4831c
                if (r0 == 0) goto L_0x001d
                v.m0.i.a$c r3 = (p410v.p411m0.p418i.C4828a.C4831c) r3
                javax.net.ssl.X509TrustManager r0 = r2.f11527a
                javax.net.ssl.X509TrustManager r1 = r3.f11527a
                boolean r0 = p392u.p401r.p403c.C4638h.m10272a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.reflect.Method r0 = r2.f11528b
                java.lang.reflect.Method r3 = r3.f11528b
                boolean r3 = p392u.p401r.p403c.C4638h.m10272a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p418i.C4828a.C4831c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f11527a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f11528b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder a = C1965a.m4756a("CustomTrustRootIndex(trustManager=");
            a.append(this.f11527a);
            a.append(", findByIssuerAndSignatureMethod=");
            a.append(this.f11528b);
            a.append(")");
            return a.toString();
        }
    }

    static {
        boolean z = true;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (1 != 0) {
                f11521f = z;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected Android API level 21+ but was ");
            sb.append(VERSION.SDK_INT);
            throw new IllegalStateException(sb.toString().toString());
        } catch (ClassNotFoundException unused) {
            z = false;
        }
    }

    public C4828a() {
        C4845e eVar;
        Method method;
        Method method2;
        C4845e[] eVarArr = new C4845e[3];
        C4847a aVar = C4846f.f11561f;
        String str = "com.android.org.conscrypt";
        Method method3 = null;
        try {
            Class cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".OpenSSLSocketFactoryImpl");
            Class cls2 = Class.forName(sb.toString());
            Class cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            C4638h.m10270a((Object) cls3, "paramsClass");
            eVar = new C4846f(cls, cls2, cls3);
        } catch (Exception e) {
            C0967p0.m2194a(5, "unable to load android socket classes", (Throwable) e);
            eVar = null;
        }
        eVarArr[0] = eVar;
        C4833a aVar2 = C4832b.f11530f;
        eVarArr[1] = C4832b.f11529e ? C4843c.f11557a : null;
        eVarArr[2] = new C4844d("com.google.android.gms.org.conscrypt");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C4845e eVar2 = eVarArr[i];
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C4845e) next).mo11325a()) {
                arrayList2.add(next);
            }
        }
        this.f11523d = arrayList2;
        try {
            Class cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method = cls4.getMethod("open", new Class[]{String.class});
            method2 = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f11524e = new C4842b(method3, method, method2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|(3:10|15|16)(2:11|12)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r3 = ((java.lang.Boolean) r8).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        throw new p392u.C4557i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        super.mo11305b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r8 = r8.getMethod(r1, new java.lang.Class[0]).invoke(r9, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r8 != null) goto L_0x0035;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11302a(java.lang.String r7, java.lang.Class<?> r8, java.lang.Object r9) {
        /*
            r6 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            java.lang.String r1 = "isCleartextTrafficPermitted"
            r2 = 0
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0027 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5     // Catch:{ NoSuchMethodException -> 0x0027 }
            java.lang.reflect.Method r4 = r8.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0027 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0027 }
            r5[r2] = r7     // Catch:{ NoSuchMethodException -> 0x0027 }
            java.lang.Object r4 = r4.invoke(r9, r5)     // Catch:{ NoSuchMethodException -> 0x0027 }
            if (r4 == 0) goto L_0x0021
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ NoSuchMethodException -> 0x0027 }
            boolean r7 = r4.booleanValue()     // Catch:{ NoSuchMethodException -> 0x0027 }
            goto L_0x0046
        L_0x0021:
            u.i r4 = new u.i     // Catch:{ NoSuchMethodException -> 0x0027 }
            r4.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0027 }
            throw r4     // Catch:{ NoSuchMethodException -> 0x0027 }
        L_0x0027:
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0042 }
            java.lang.reflect.Method r8 = r8.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0042 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0042 }
            java.lang.Object r8 = r8.invoke(r9, r1)     // Catch:{ NoSuchMethodException -> 0x0042 }
            if (r8 == 0) goto L_0x003c
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ NoSuchMethodException -> 0x0042 }
            boolean r3 = r8.booleanValue()     // Catch:{ NoSuchMethodException -> 0x0042 }
            goto L_0x0045
        L_0x003c:
            u.i r8 = new u.i     // Catch:{ NoSuchMethodException -> 0x0042 }
            r8.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0042 }
            throw r8     // Catch:{ NoSuchMethodException -> 0x0042 }
        L_0x0042:
            super.mo11305b(r7)
        L_0x0045:
            r7 = r3
        L_0x0046:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p410v.p411m0.p418i.C4828a.mo11302a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public C4853e mo11304b(X509TrustManager x509TrustManager) {
        if (x509TrustManager != null) {
            try {
                Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
                C4638h.m10270a((Object) declaredMethod, "method");
                declaredMethod.setAccessible(true);
                return new C4831c(x509TrustManager, declaredMethod);
            } catch (NoSuchMethodException unused) {
                return super.mo11304b(x509TrustManager);
            }
        } else {
            C4638h.m10271a("trustManager");
            throw null;
        }
    }

    /* renamed from: a */
    public C4851c mo11297a(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        String str = "checkServerTrusted";
        if (x509TrustManager != null) {
            try {
                Class cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
                Object newInstance = cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager});
                Method method = cls2.getMethod(str, new Class[]{X509Certificate[].class, cls, cls});
                C4638h.m10270a(newInstance, "extensions");
                C4638h.m10270a((Object) method, str);
                return new C4829a(newInstance, method);
            } catch (Exception unused) {
                return new C4849a(mo11304b(x509TrustManager));
            }
        } else {
            C4638h.m10271a("trustManager");
            throw null;
        }
    }

    /* renamed from: b */
    public String mo11303b(SSLSocket sSLSocket) {
        Object obj;
        if (sSLSocket != null) {
            Iterator it = this.f11523d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C4845e) obj).mo11326b(sSLSocket)) {
                    break;
                }
            }
            C4845e eVar = (C4845e) obj;
            if (eVar != null) {
                return eVar.mo11323a(sSLSocket);
            }
            return null;
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }

    /* renamed from: b */
    public boolean mo11305b(String str) {
        String str2 = "unable to determine cleartext support";
        if (str != null) {
            try {
                Class cls = Class.forName("android.security.NetworkSecurityPolicy");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                C4638h.m10270a((Object) cls, "networkPolicyClass");
                C4638h.m10270a(invoke, "networkSecurityPolicy");
                return mo11302a(str, cls, invoke);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                super.mo11305b(str);
                return true;
            } catch (IllegalAccessException e) {
                throw new AssertionError(str2, e);
            } catch (IllegalArgumentException e2) {
                throw new AssertionError(str2, e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(str2, e3);
            }
        } else {
            C4638h.m10271a("hostname");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11301a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        Object obj = null;
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list != null) {
            Iterator it = this.f11523d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C4845e) next).mo11326b(sSLSocket)) {
                    obj = next;
                    break;
                }
            }
            C4845e eVar = (C4845e) obj;
            if (eVar != null) {
                eVar.mo11324a(sSLSocket, str, list);
            }
        } else {
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
            try {
                socket.connect(inetSocketAddress, i);
            } catch (ClassCastException e) {
                if (VERSION.SDK_INT == 26) {
                    throw new IOException("Exception in connect", e);
                }
                throw e;
            }
        } else {
            C4638h.m10271a("address");
            throw null;
        }
    }

    /* renamed from: a */
    public Object mo11296a(String str) {
        if (str != null) {
            C4842b bVar = this.f11524e;
            Method method = bVar.f11554a;
            if (method == null) {
                return null;
            }
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = bVar.f11555b;
                if (method2 != null) {
                    method2.invoke(invoke, new Object[]{str});
                    return invoke;
                }
                C4638h.m10269a();
                throw null;
            } catch (Exception unused) {
                return null;
            }
        } else {
            C4638h.m10271a("closer");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11298a(int i, String str, Throwable th) {
        if (str != null) {
            C0967p0.m2194a(i, str, th);
        } else {
            C4638h.m10271a("message");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11299a(String str, Object obj) {
        if (str != null) {
            C4842b bVar = this.f11524e;
            if (bVar != null) {
                boolean z = false;
                if (obj != null) {
                    try {
                        Method method = bVar.f11556c;
                        if (method != null) {
                            method.invoke(obj, new Object[0]);
                            z = true;
                        } else {
                            C4638h.m10269a();
                            throw null;
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!z) {
                    mo11298a(5, str, (Throwable) null);
                    return;
                }
                return;
            }
            throw null;
        }
        C4638h.m10271a("message");
        throw null;
    }
}
