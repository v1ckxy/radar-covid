package p425x.p426a.p445e.p456c.p458b.p460d;

import java.io.IOException;
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
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p437c.p438a.p442c.C5023b;
import p425x.p426a.p445e.p446a.C5029c;
import p425x.p426a.p445e.p446a.C5030d;
import p425x.p426a.p445e.p446a.C5031e;
import p425x.p426a.p445e.p447b.p449b.C5059e;
import p425x.p426a.p445e.p447b.p449b.C5060f;
import p425x.p426a.p445e.p467d.p468a.C5155a;
import p425x.p426a.p445e.p467d.p468a.C5156b;
import p425x.p426a.p445e.p467d.p468a.C5158d;
import p425x.p426a.p445e.p467d.p468a.C5159e;

/* renamed from: x.a.e.c.b.d.f */
public class C5134f extends KeyFactorySpi implements C5023b {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                C4946b a = C4946b.m11184a(C4983s.m11325a(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C5031e.f11988c.mo11626b(a.f11820f.f11831e)) {
                        C4929d h = a.mo11582h();
                        C5029c cVar = h instanceof C5029c ? (C5029c) h : h != null ? new C5029c(C4986t.m11342a((Object) h)) : null;
                        C5059e eVar = new C5059e(cVar.f11976e, cVar.f11977f, new C5156b(cVar.f11978g), new C5159e(new C5156b(cVar.f11978g), cVar.f11979h), new C5158d(cVar.f11981j), new C5158d(cVar.f11982k), new C5155a(cVar.f11980i));
                        return new C5131c(eVar);
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to decode PKCS8EncodedKeySpec: ");
                sb.append(e);
                throw new InvalidKeySpecException(sb.toString());
            }
        } else {
            StringBuilder a2 = C1965a.m4756a("Unsupported key specification: ");
            a2.append(keySpec.getClass());
            a2.append(Strings.CURRENT_PATH);
            throw new InvalidKeySpecException(a2.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                C4951b a = C4951b.m11202a(C4983s.m11325a(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (C5031e.f11988c.mo11626b(a.f11833e.f11831e)) {
                        C4983s h = a.mo11586h();
                        C5030d dVar = h instanceof C5030d ? (C5030d) h : h != null ? new C5030d(C4986t.m11342a((Object) h)) : null;
                        return new C5132d(new C5060f(dVar.f11983e, dVar.f11984f, new C5155a(dVar.f11985g)));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e) {
                    StringBuilder a2 = C1965a.m4756a("Unable to decode X509EncodedKeySpec: ");
                    a2.append(e.getMessage());
                    throw new InvalidKeySpecException(a2.toString());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            StringBuilder a3 = C1965a.m4756a("Unsupported key specification: ");
            a3.append(keySpec.getClass());
            a3.append(Strings.CURRENT_PATH);
            throw new InvalidKeySpecException(a3.toString());
        }
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    public Key engineTranslateKey(Key key) {
        return null;
    }
}
