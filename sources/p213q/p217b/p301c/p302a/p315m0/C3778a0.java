package p213q.p217b.p301c.p302a.p315m0;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p213q.p217b.p218a.p231b.p239d.p246q.C2286e;
import p213q.p217b.p301c.p302a.p315m0.C3780b0;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3781a;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3782b;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3783c;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3784d;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3785e;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3786f;
import p213q.p217b.p301c.p302a.p315m0.C3780b0.C3787g;

/* renamed from: q.b.c.a.m0.a0 */
public final class C3778a0<T_WRAPPER extends C3780b0<T_ENGINE>, T_ENGINE> {

    /* renamed from: d */
    public static final Logger f9321d = Logger.getLogger(C3778a0.class.getName());

    /* renamed from: e */
    public static final List<Provider> f9322e;

    /* renamed from: f */
    public static final C3778a0<C3781a, Cipher> f9323f = new C3778a0<>(new C3781a());

    /* renamed from: g */
    public static final C3778a0<C3785e, Mac> f9324g = new C3778a0<>(new C3785e());

    /* renamed from: h */
    public static final C3778a0<C3787g, Signature> f9325h = new C3778a0<>(new C3787g());

    /* renamed from: i */
    public static final C3778a0<C3786f, MessageDigest> f9326i = new C3778a0<>(new C3786f());

    /* renamed from: j */
    public static final C3778a0<C3784d, KeyPairGenerator> f9327j = new C3778a0<>(new C3784d());

    /* renamed from: k */
    public static final C3778a0<C3783c, KeyFactory> f9328k = new C3778a0<>(new C3783c());

    /* renamed from: a */
    public T_WRAPPER f9329a;

    /* renamed from: b */
    public List<Provider> f9330b = f9322e;

    /* renamed from: c */
    public boolean f9331c = true;

    static {
        if (C2286e.m5325d()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f9321d.info(String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f9322e = arrayList;
        } else {
            f9322e = new ArrayList();
        }
        new C3778a0(new C3782b());
    }

    public C3778a0(T_WRAPPER t_wrapper) {
        this.f9329a = t_wrapper;
    }

    /* renamed from: a */
    public T_ENGINE mo10023a(String str) {
        Throwable th = null;
        for (Provider a : this.f9330b) {
            try {
                return this.f9329a.mo10024a(str, a);
            } catch (Exception e) {
                if (th == null) {
                    th = e;
                }
            }
        }
        if (this.f9331c) {
            return this.f9329a.mo10024a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", th);
    }
}
