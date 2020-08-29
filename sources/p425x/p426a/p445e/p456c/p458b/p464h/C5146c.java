package p425x.p426a.p445e.p456c.p458b.p464h;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import p116io.jsonwebtoken.lang.Strings;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p437c.p438a.p442c.C5023b;

/* renamed from: x.a.e.c.b.h.c */
public class C5146c extends KeyFactorySpi implements C5023b {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return new C5144a(C4946b.m11184a(C4983s.m11325a(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder a = C1965a.m4756a("Unsupported key specification: ");
            a.append(keySpec.getClass());
            a.append(Strings.CURRENT_PATH);
            throw new InvalidKeySpecException(a.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return new C5145b(C4951b.m11202a(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown key specification: ");
            sb.append(keySpec);
            sb.append(Strings.CURRENT_PATH);
            throw new InvalidKeySpecException(sb.toString());
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        boolean z = key instanceof C5144a;
        String str = Strings.CURRENT_PATH;
        if (z) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof C5145b)) {
            StringBuilder a = C1965a.m4756a("Unsupported key type: ");
            a.append(key.getClass());
            a.append(str);
            throw new InvalidKeySpecException(a.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown key specification: ");
        sb.append(cls);
        sb.append(str);
        throw new InvalidKeySpecException(sb.toString());
    }

    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C5144a) || (key instanceof C5145b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
