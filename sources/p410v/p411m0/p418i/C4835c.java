package p410v.p411m0.p418i;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p392u.C4557i;
import p392u.p401r.p403c.C4638h;
import p410v.C4694c0;

/* renamed from: v.m0.i.c */
public final class C4835c extends C4839f {

    /* renamed from: d */
    public final Method f11533d;

    /* renamed from: e */
    public final Method f11534e;

    /* renamed from: f */
    public final Method f11535f;

    /* renamed from: g */
    public final Class<?> f11536g;

    /* renamed from: h */
    public final Class<?> f11537h;

    /* renamed from: v.m0.i.c$a */
    public static final class C4836a implements InvocationHandler {

        /* renamed from: a */
        public boolean f11538a;

        /* renamed from: b */
        public String f11539b;

        /* renamed from: c */
        public final List<String> f11540c;

        public C4836a(List<String> list) {
            if (list != null) {
                this.f11540c = list;
            } else {
                C4638h.m10271a("protocols");
                throw null;
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (obj == null) {
                C4638h.m10271a("proxy");
                throw null;
            } else if (method != null) {
                if (objArr == null) {
                    objArr = new Object[0];
                }
                String name = method.getName();
                Class returnType = method.getReturnType();
                if (C4638h.m10272a((Object) name, (Object) "supports") && C4638h.m10272a((Object) Boolean.TYPE, (Object) returnType)) {
                    return Boolean.valueOf(true);
                }
                if (!C4638h.m10272a((Object) name, (Object) "unsupported") || !C4638h.m10272a((Object) Void.TYPE, (Object) returnType)) {
                    if (C4638h.m10272a((Object) name, (Object) "protocols")) {
                        if (objArr.length == 0) {
                            return this.f11540c;
                        }
                    }
                    String str = "null cannot be cast to non-null type kotlin.String";
                    if ((C4638h.m10272a((Object) name, (Object) "selectProtocol") || C4638h.m10272a((Object) name, (Object) "select")) && C4638h.m10272a((Object) String.class, (Object) returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    Object obj3 = list.get(i);
                                    if (obj3 != null) {
                                        String str2 = (String) obj3;
                                        if (!this.f11540c.contains(str2)) {
                                            if (i == size) {
                                                break;
                                            }
                                            i++;
                                        } else {
                                            this.f11539b = str2;
                                            return str2;
                                        }
                                    } else {
                                        throw new C4557i(str);
                                    }
                                }
                            }
                            String str3 = (String) this.f11540c.get(0);
                            this.f11539b = str3;
                            return str3;
                        }
                        throw new C4557i("null cannot be cast to non-null type kotlin.collections.List<*>");
                    } else if ((!C4638h.m10272a((Object) name, (Object) "protocolSelected") && !C4638h.m10272a((Object) name, (Object) "selected")) || objArr.length != 1) {
                        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                    } else {
                        Object obj4 = objArr[0];
                        if (obj4 != null) {
                            this.f11539b = (String) obj4;
                            return null;
                        }
                        throw new C4557i(str);
                    }
                } else {
                    this.f11538a = true;
                    return null;
                }
            } else {
                C4638h.m10271a("method");
                throw null;
            }
        }
    }

    public C4835c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        if (method == null) {
            C4638h.m10271a("putMethod");
            throw null;
        } else if (method2 == null) {
            C4638h.m10271a("getMethod");
            throw null;
        } else if (method3 == null) {
            C4638h.m10271a("removeMethod");
            throw null;
        } else if (cls == null) {
            C4638h.m10271a("clientProviderClass");
            throw null;
        } else if (cls2 != null) {
            this.f11533d = method;
            this.f11534e = method2;
            this.f11535f = method3;
            this.f11536g = cls;
            this.f11537h = cls2;
        } else {
            C4638h.m10271a("serverProviderClass");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11318a(SSLSocket sSLSocket) {
        String str = "failed to remove ALPN";
        if (sSLSocket != null) {
            try {
                this.f11535f.invoke(null, new Object[]{sSLSocket});
            } catch (IllegalAccessException e) {
                throw new AssertionError(str, e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(str, e2);
            }
        } else {
            C4638h.m10271a("sslSocket");
            throw null;
        }
    }

    /* renamed from: b */
    public String mo11303b(SSLSocket sSLSocket) {
        String str = "failed to get ALPN selected protocol";
        String str2 = null;
        if (sSLSocket != null) {
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f11534e.invoke(null, new Object[]{sSLSocket}));
                if (invocationHandler != null) {
                    C4836a aVar = (C4836a) invocationHandler;
                    if (aVar.f11538a || aVar.f11539b != null) {
                        if (!aVar.f11538a) {
                            str2 = aVar.f11539b;
                        }
                        return str2;
                    }
                    C4839f.f11546a.mo11298a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                    return null;
                }
                throw new C4557i("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            } catch (InvocationTargetException e) {
                throw new AssertionError(str, e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(str, e2);
            }
        } else {
            C4638h.m10271a("socket");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo11301a(SSLSocket sSLSocket, String str, List<? extends C4694c0> list) {
        String str2 = "failed to set ALPN";
        if (sSLSocket == null) {
            C4638h.m10271a("sslSocket");
            throw null;
        } else if (list != null) {
            List a = C4839f.f11548c.mo11321a(list);
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C4839f.class.getClassLoader(), new Class[]{this.f11536g, this.f11537h}, new C4836a(a));
                this.f11533d.invoke(null, new Object[]{sSLSocket, newProxyInstance});
            } catch (InvocationTargetException e) {
                throw new AssertionError(str2, e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(str2, e2);
            }
        } else {
            C4638h.m10271a("protocols");
            throw null;
        }
    }
}
