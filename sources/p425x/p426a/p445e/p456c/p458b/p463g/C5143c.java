package p425x.p426a.p445e.p456c.p458b.p463g;

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
import p119o.p120a.C0967p0;
import p213q.p214a.p215a.p216a.C1965a;
import p425x.p426a.p427a.C4929d;
import p425x.p426a.p427a.C4983s;
import p425x.p426a.p427a.C4986t;
import p425x.p426a.p427a.p432g2.C4946b;
import p425x.p426a.p427a.p433h2.C4951b;
import p425x.p426a.p437c.p438a.p442c.C5023b;
import p425x.p426a.p445e.p446a.C5032f;
import p425x.p426a.p445e.p446a.C5033g;
import p425x.p426a.p445e.p456c.p466c.C5153a;
import p425x.p426a.p445e.p456c.p466c.C5154b;

/* renamed from: x.a.e.c.b.g.c */
public class C5143c extends KeyFactorySpi implements C5023b {
    /* renamed from: a */
    public PrivateKey mo11850a(C4946b bVar) {
        C4929d h = bVar.mo11582h();
        C5032f fVar = h instanceof C5032f ? (C5032f) h : h != null ? new C5032f(C4986t.m11342a((Object) h)) : null;
        short[][] b = C0967p0.m2239b(fVar.f12006g);
        short[] c = C0967p0.m2247c(fVar.f12007h);
        short[][] b2 = C0967p0.m2239b(fVar.f12008i);
        short[] c2 = C0967p0.m2247c(fVar.f12009j);
        byte[] bArr = fVar.f12010k;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        C5141a aVar = new C5141a(b, c, b2, c2, iArr, fVar.f12011l);
        return aVar;
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof C5153a) {
            return new C5141a((C5153a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo11850a(C4946b.m11184a(C4983s.m11325a(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
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
        if (keySpec instanceof C5154b) {
            return new C5142b((C5154b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return mo11851a(C4951b.m11202a(((X509EncodedKeySpec) keySpec).getEncoded()));
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
        boolean z = key instanceof C5141a;
        String str = Strings.CURRENT_PATH;
        if (z) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (C5153a.class.isAssignableFrom(cls)) {
                C5141a aVar = (C5141a) key;
                C5153a aVar2 = new C5153a(aVar.f12303e, aVar.f12304f, aVar.f12305g, aVar.f12306h, aVar.f12308j, aVar.f12307i);
                return aVar2;
            }
        } else if (!(key instanceof C5142b)) {
            StringBuilder a = C1965a.m4756a("Unsupported key type: ");
            a.append(key.getClass());
            a.append(str);
            throw new InvalidKeySpecException(a.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (C5154b.class.isAssignableFrom(cls)) {
                C5142b bVar = (C5142b) key;
                return new C5154b(bVar.f12312h, bVar.f12309e, bVar.mo11844a(), C0967p0.m2220a(bVar.f12311g));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown key specification: ");
        sb.append(cls);
        sb.append(str);
        throw new InvalidKeySpecException(sb.toString());
    }

    public final Key engineTranslateKey(Key key) {
        if ((key instanceof C5141a) || (key instanceof C5142b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    /* renamed from: a */
    public PublicKey mo11851a(C4951b bVar) {
        C4983s h = bVar.mo11586h();
        C5033g gVar = h instanceof C5033g ? (C5033g) h : h != null ? new C5033g(C4986t.m11342a((Object) h)) : null;
        return new C5142b(gVar.f12014g.mo11593m(), C0967p0.m2239b(gVar.f12015h), C0967p0.m2239b(gVar.f12016i), C0967p0.m2247c(gVar.f12017j));
    }
}
