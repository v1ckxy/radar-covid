package p410v.p411m0.p418i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p116io.jsonwebtoken.lang.Objects;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;

/* renamed from: v.m0.i.d */
public final class C4837d extends C4839f {

    /* renamed from: d */
    public final Method f11541d;

    /* renamed from: e */
    public final Method f11542e;

    public C4837d(Method method, Method method2) {
        if (method == null) {
            C4638h.m10271a("setProtocolMethod");
            throw null;
        } else if (method2 != null) {
            this.f11541d = method;
            this.f11542e = method2;
        } else {
            C4638h.m10271a("getProtocolMethod");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11301a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        String str2 = "failed to set SSL parameters";
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list != null) {
            try {
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                List a = C4839f.f11548c.mo11321a(list);
                Method method = this.f11541d;
                Object[] objArr = new Object[1];
                Object[] array = a.toArray(new String[0]);
                if (array != null) {
                    objArr[0] = array;
                    method.invoke(sSLParameters, objArr);
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                }
                throw new C4557i("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (IllegalAccessException e) {
                throw new AssertionError(str2, e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(str2, e2);
            }
        } else {
            C4638h.m10271a("protocols");
            throw null;
        }
    }

    /* renamed from: b */
    public String mo11303b(SSLSocket sSLSocket) {
        String str = "failed to get ALPN selected protocol";
        if (sSLSocket != null) {
            try {
                String str2 = (String) this.f11542e.invoke(sSLSocket, new Object[0]);
                if (str2 == null) {
                    return null;
                }
                if (C4638h.m10272a((Object) str2, (Object) Objects.EMPTY_STRING)) {
                    return null;
                }
                return str2;
            } catch (IllegalAccessException e) {
                throw new AssertionError(str, e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(str, e2);
            }
        } else {
            C4638h.m10271a("socket");
            throw null;
        }
    }
}
