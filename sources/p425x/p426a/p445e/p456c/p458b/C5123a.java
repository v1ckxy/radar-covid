package p425x.p426a.p445e.p456c.p458b;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p437c.p438a.p439a.C5019a;
import p425x.p426a.p437c.p438a.p442c.C5022a;

/* renamed from: x.a.e.c.b.a */
public class C5123a extends Provider implements C5019a {

    /* renamed from: e */
    public static final String[] f12287e = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: x.a.e.c.b.a$a */
    public class C5124a implements PrivilegedAction {
        public C5124a() {
        }

        public Object run() {
            Class cls;
            C5123a aVar = C5123a.this;
            if (aVar != null) {
                String[] strArr = C5123a.f12287e;
                for (int i = 0; i != strArr.length; i++) {
                    Class<C5123a> cls2 = C5123a.class;
                    String str = "org.bouncycastle.pqc.jcajce.provider.";
                    String a = C1965a.m4754a(C1965a.m4756a(str), strArr[i], "$Mappings");
                    try {
                        ClassLoader classLoader = cls2.getClassLoader();
                        cls = classLoader != null ? classLoader.loadClass(a) : (Class) AccessController.doPrivileged(new C5125b(a));
                    } catch (ClassNotFoundException unused) {
                        cls = null;
                    }
                    if (cls != null) {
                        try {
                            ((C5022a) cls.newInstance()).mo11697a(aVar);
                        } catch (Exception e) {
                            StringBuilder b = C1965a.m4763b("cannot create instance of ", str);
                            b.append(strArr[i]);
                            b.append("$Mappings : ");
                            b.append(e);
                            throw new InternalError(b.toString());
                        }
                    }
                }
                return null;
            }
            throw null;
        }
    }

    static {
        new HashMap();
    }

    public C5123a() {
        super("BCPQC", 1.65d, "BouncyCastle Post-Quantum Security Provider v1.65");
        AccessController.doPrivileged(new C5124a());
    }
}
