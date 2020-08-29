package p410v.p411m0.p418i.p419g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;
import p410v.p411m0.p418i.C4828a;
import p410v.p411m0.p418i.C4828a.C4830b;
import p410v.p411m0.p418i.C4839f;

/* renamed from: v.m0.i.g.a */
public class C4841a implements C4845e {

    /* renamed from: a */
    public final Method f11549a;

    /* renamed from: b */
    public final Method f11550b;

    /* renamed from: c */
    public final Method f11551c;

    /* renamed from: d */
    public final Method f11552d;

    /* renamed from: e */
    public final Class<? super SSLSocket> f11553e;

    public C4841a(Class<? super SSLSocket> cls) {
        if (cls != null) {
            this.f11553e = cls;
            Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
            C4638h.m10270a((Object) declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
            this.f11549a = declaredMethod;
            this.f11550b = this.f11553e.getMethod("setHostname", new Class[]{String.class});
            this.f11551c = this.f11553e.getMethod("getAlpnSelectedProtocol", new Class[0]);
            this.f11552d = this.f11553e.getMethod("setAlpnProtocols", new Class[]{byte[].class});
            return;
        }
        C4638h.m10271a("sslSocketClass");
        throw null;
    }

    /* renamed from: a */
    public void mo11324a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list == null) {
            C4638h.m10271a("protocols");
            throw null;
        } else if (mo11326b(sSLSocket)) {
            if (str != null) {
                try {
                    this.f11549a.invoke(sSLSocket, new Object[]{Boolean.valueOf(true)});
                    this.f11550b.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    throw new AssertionError(e2);
                }
            }
            this.f11552d.invoke(sSLSocket, new Object[]{C4839f.f11548c.mo11322b(list)});
        }
    }

    /* renamed from: b */
    public boolean mo11326b(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            return this.f11553e.isInstance(sSLSocket);
        }
        C4638h.m10271a("sslSocket");
        throw null;
    }

    /* renamed from: a */
    public String mo11323a(SSLSocket sSLSocket) {
        String str = null;
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (!mo11326b(sSLSocket)) {
            return null;
        } else {
            try {
                byte[] bArr = (byte[]) this.f11551c.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    C4638h.m10270a((Object) charset, "StandardCharsets.UTF_8");
                    str = new String(bArr, charset);
                }
                return str;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo11325a() {
        C4830b bVar = C4828a.f11522g;
        return C4828a.f11521f;
    }
}
